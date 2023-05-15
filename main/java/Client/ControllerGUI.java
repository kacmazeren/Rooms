package Client;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSeparator;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.Timer;

import MeetingRoomAvailabilityService.BookingRequest;
import MeetingRoomAvailabilityService.BookingResponse;
import MeetingRoomAvailabilityService.MeetingRoom;
import MeetingRoomAvailabilityService.MeetingRoomAvailabilityServiceGrpc;
import MeetingRoomAvailabilityService.MeetingRoomAvailabilityServiceGrpc.MeetingRoomAvailabilityServiceStub;
import MeetingRoomAvailabilityService.Service1;
import MeetingRoomManagementService.AddMeetingRoomRequest;
import MeetingRoomManagementService.AddMeetingRoomResponse;
import MeetingRoomManagementService.MeetingRoomManagementServiceGrpc;
import MeetingRoomManagementService.MeetingRoomManagementServiceGrpc.MeetingRoomManagementServiceStub;
import MeetingRoomManagementService.Service2;
import MeetingRoomManagementService.UpdateMeetingRoomRequest;
import MeetingRoomManagementService.UpdateMeetingRoomResponse;
import MeetingRoomManagementService.UpdatedRoom;
import MeetingRoomNotificationService.DeviceSupplyRequest;
import MeetingRoomNotificationService.DeviceSupplyResponse;
import MeetingRoomNotificationService.MeetingRoomNotificationServiceGrpc;
import MeetingRoomNotificationService.MeetingRoomNotificationServiceGrpc.MeetingRoomNotificationServiceStub;
import MeetingRoomNotificationService.Service3;
import MeetingRoomNotificationService.Service3.PrinterDevice;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.stub.StreamObserver;

public class ControllerGUI extends JFrame {
	ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 50051).usePlaintext().build();

	public ControllerGUI() {
		super("ControllerGUI");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// Create a grid layout with 3 rows and 1 column
		GridLayout layout = new GridLayout(3, 1);
		setLayout(layout);

		// Add a panel for service1
		JPanel service1Panel = new JPanel();
		service1Panel.setBorder(BorderFactory.createTitledBorder("Service 1"));
		service1Panel.setPreferredSize(new Dimension(500, 300)); // Set the preferred size to 400 x 400 pixels

		Service1 service1 = new Service1();
		List<MeetingRoom> meetingRooms = service1.getMeetingRooms();

		// Create a new panel to display the meeting rooms
		JPanel meetingRoomsPanel = new JPanel();
		meetingRoomsPanel.setLayout(new GridLayout(meetingRooms.size(), 1));

		// Create a JLabel for each meeting room and add it to the panel
		for (MeetingRoom room : meetingRooms) {
			JLabel roomLabel = new JLabel("ID: " + room.getId() + " | Name: " + room.getName() + " | Capacity: "
					+ room.getCapacity() + " | Equipment: " + room.getEquipment());
			meetingRoomsPanel.add(roomLabel);
		}

		// Add the meetingRoomsPanel to the service1Panel
		service1Panel.add(meetingRoomsPanel);

		JPanel spacePanel = new JPanel();
		JSeparator separator = new JSeparator(SwingConstants.HORIZONTAL);
		separator.setPreferredSize(new Dimension(50, 5));
		spacePanel.add(separator);
		service1Panel.add(spacePanel);

		// Add a label and text field for the room ID input
		JLabel roomIdLabel = new JLabel("Room ID:");
		JTextField roomIdTextField = new JTextField();
		roomIdTextField.setPreferredSize(new Dimension(25, 25));
		service1Panel.add(roomIdLabel);
		service1Panel.add(roomIdTextField);

		// Add a label and text field for the date input
		JLabel dateLabel = new JLabel("Date:");
		JTextField dateTextField = new JTextField();
		dateTextField.setPreferredSize(new Dimension(100, 25));
		service1Panel.add(dateLabel);
		service1Panel.add(dateTextField);

		// Add a label and text field for the time input
		JLabel timeLabel = new JLabel("Time:");
		JTextField timeTextField = new JTextField();
		timeTextField.setPreferredSize(new Dimension(50, 25));
		service1Panel.add(timeLabel);
		service1Panel.add(timeTextField);

		// Add a label and text field for the duration input
		JLabel durationLabel = new JLabel("Duration (in minutes):");
		JTextField durationTextField = new JTextField();
		durationTextField.setPreferredSize(new Dimension(35, 25));
		service1Panel.add(durationLabel);
		service1Panel.add(durationTextField);

		add(service1Panel);
		// Add a button to submit the form
		JButton submitButton = new JButton("Submit");
		submitButton.addActionListener(e -> {
			String roomId = roomIdTextField.getText();
			String date = dateTextField.getText();
			String time = timeTextField.getText();
			int duration = Integer.parseInt(durationTextField.getText());

			BookingRequest request = BookingRequest.newBuilder().setId(roomId).setDate(date).setStartTime(time)
					.setDuration(duration).build();
			JLabel outputLabel = new JLabel();
			service1Panel.add(outputLabel);

			StreamObserver<BookingResponse> responseObserver = new StreamObserver<BookingResponse>() {

				@Override
				public void onNext(BookingResponse response) {
					String resNum = response.getResNum();
					outputLabel.setText("Booking successful! Reservation number: " + resNum);
				}

				@Override
				public void onError(Throwable t) {
					System.out.println("Error occurred: " + t.getMessage());

				}

				@Override
				public void onCompleted() {
					// Handle completion here
				}
			};
			MeetingRoomAvailabilityServiceStub stub = MeetingRoomAvailabilityServiceGrpc.newStub(channel);
			stub.bookMeetingRoom(request, responseObserver);
		});
		service1Panel.add(submitButton);

		// Add a panel for service2
		JPanel service2Panel = new JPanel();
		service2Panel.setBorder(BorderFactory.createTitledBorder("Service 2"));
		service2Panel.setPreferredSize(new Dimension(400, 300)); // Set the preferred size to 400 x 300 pixels
		Service2 service2 = new Service2();
		List<MeetingRoom> rooms = service1.getExistingRooms();
		
		// Create a new panel to display the existing meeting rooms
		JPanel existingRoomsPanel = new JPanel();
		existingRoomsPanel.setLayout(new GridLayout(rooms.size(), 1));
		service2Panel.add(new JLabel("All the existing rooms"));
		// Create a JLabel for each meeting room and add it to the panel
		for (MeetingRoom room : rooms) {
			JLabel roomLabel = new JLabel("ID: " + room.getId() + " | Name: " + room.getName() + " | Capacity: "
					+ room.getCapacity() + " | Equipment: " + room.getEquipment());
			service2Panel.add(roomLabel);
		}
		service2Panel.add(existingRoomsPanel);
		
		JPanel spacePanel2 = new JPanel();
		JSeparator separator2 = new JSeparator(SwingConstants.HORIZONTAL);
		separator2.setPreferredSize(new Dimension(70, 5));
		spacePanel2.add(separator2);
		service2Panel.add(spacePanel2);

		// Add a label and text field for the id input
		JLabel newIdLabel = new JLabel("ID");
		JTextField newIdLabelTextField = new JTextField();
		newIdLabelTextField.setPreferredSize(new Dimension(30, 25));
		service2Panel.add(newIdLabel);
		service2Panel.add(newIdLabelTextField);

		// Add a label and text field for the room name input
		JLabel nameLabel = new JLabel("Room Name");
		JTextField nameLabelTextField = new JTextField();
		nameLabelTextField.setPreferredSize(new Dimension(60, 25));
		service2Panel.add(nameLabel);
		service2Panel.add(nameLabelTextField);

		// Add a label and text field for the room capacity input
		JLabel capacityLabel = new JLabel("Room Capacity");
		JTextField capacityLabelTextField = new JTextField();
		capacityLabelTextField.setPreferredSize(new Dimension(30, 25));
		service2Panel.add(capacityLabel);
		service2Panel.add(capacityLabelTextField);

		
		JPanel spacePanel4 = new JPanel();
		JSeparator separator4 = new JSeparator(SwingConstants.HORIZONTAL);
		separator4.setPreferredSize(new Dimension(100, 5));
		spacePanel4.add(separator4);
		service2Panel.add(spacePanel4);
		
		// Add a label and text field for the room capacity input
		JLabel equipmentLabel = new JLabel("Room Equipment");
		JTextField equipmentLabelTextField = new JTextField();
		equipmentLabelTextField.setPreferredSize(new Dimension(70, 25));
		service2Panel.add(equipmentLabel);
		service2Panel.add(equipmentLabelTextField);

		add(service2Panel);

		// Add a button to submit the form
		JButton addButton = new JButton("Add Room");
		addButton.addActionListener(e -> {
			String newId = newIdLabelTextField.getText();
			String name = nameLabelTextField.getText();
			String capacity = capacityLabelTextField.getText();
			String equipment = equipmentLabelTextField.getText();

			AddMeetingRoomRequest request = AddMeetingRoomRequest.newBuilder().setId(newId).setName(name)
					.setCapacity(Integer.parseInt(capacity)).setEquipment(equipment).build();
			JLabel outputLabel = new JLabel();
			service2Panel.add(outputLabel);

			StreamObserver<AddMeetingRoomResponse> responseObserver = new StreamObserver<AddMeetingRoomResponse>() {

				@Override
				public void onNext(AddMeetingRoomResponse response) {
					String message = response.getMessage();
					outputLabel.setText(message);
					JOptionPane.showMessageDialog(null, response.getUpdatedRoomsList());
				}

				@Override
				public void onError(Throwable t) {
					System.out.println("Error occurred: " + t.getMessage());

				}

				@Override
				public void onCompleted() {
					// Handle completion here
				}
			};
			MeetingRoomManagementServiceStub stub = MeetingRoomManagementServiceGrpc.newStub(channel);
			stub.addMeetingRoom(request, responseObserver);

		});

		service2Panel.add(addButton);
		JPanel spacePanel3 = new JPanel();
		JSeparator separator3 = new JSeparator(SwingConstants.HORIZONTAL);
		separator3.setPreferredSize(new Dimension(200, 5));
		spacePanel3.add(separator3);
		service2Panel.add(spacePanel3);
		// Add components for the updateMeetingRoom method
		service2Panel.add(new JLabel("Update Meeting Room"));

		// Add a label and text field for the id input
		JLabel updateIdLabel = new JLabel("ID");
		JTextField updateIdTextField = new JTextField();
		updateIdTextField.setPreferredSize(new Dimension(30, 25));
		service2Panel.add(updateIdLabel);
		service2Panel.add(updateIdTextField);

		// Add a label and text field for the room name input
		JLabel updateNameLabel = new JLabel("Room Name");
		JTextField updateNameTextField = new JTextField();
		updateNameTextField.setPreferredSize(new Dimension(60, 25));
		service2Panel.add(updateNameLabel);
		service2Panel.add(updateNameTextField);

		// Add a label and text field for the room capacity input
		JLabel updateCapacityLabel = new JLabel("Room Capacity");
		JTextField updateCapacityTextField = new JTextField();
		updateCapacityTextField.setPreferredSize(new Dimension(30, 25));
		service2Panel.add(updateCapacityLabel);
		service2Panel.add(updateCapacityTextField);

		// Add a label and text field for the room equipment input
		JLabel updateEquipmentLabel = new JLabel("Room Equipment");
		JTextField updateEquipmentTextField = new JTextField();
		updateEquipmentTextField.setPreferredSize(new Dimension(100, 25));
		service2Panel.add(updateEquipmentLabel);
		service2Panel.add(updateEquipmentTextField);

		// Add a button to update the room
		JButton updateButton = new JButton("Update Room");
		updateButton.addActionListener(e -> {
			String id = updateIdTextField.getText();
			String name = updateNameTextField.getText();
			String capacity = updateCapacityTextField.getText();
			String equipment = updateEquipmentTextField.getText();

			UpdateMeetingRoomRequest request = UpdateMeetingRoomRequest.newBuilder().setId(id).setName(name)
					.setCapacity(Integer.parseInt(capacity)).setEquipment(equipment).build();
			JLabel outputLabel = new JLabel();
			service2Panel.add(outputLabel);

			StreamObserver<UpdateMeetingRoomResponse> responseObserver = new StreamObserver<UpdateMeetingRoomResponse>() {
				@Override
				public void onNext(UpdateMeetingRoomResponse response) {
					// Build a string representation of the updated rooms
					StringBuilder sb = new StringBuilder();
					for (UpdatedRoom updatedRoom : response.getUpdatedRoomsList()) {
						sb.append("Room ID: ").append(updatedRoom.getId()).append(", Name: ")
								.append(updatedRoom.getName()).append(", Capacity: ").append(updatedRoom.getCapacity())
								.append(", Equipment: ").append(updatedRoom.getEquipment()).append("\n");
					}
					String updatedRoomsString = sb.toString();

					// Create a new JTextArea to hold the updated rooms string
					JTextArea textArea = new JTextArea(updatedRoomsString);

					// Create a new JScrollPane to hold the text area
					JScrollPane scrollPane = new JScrollPane(textArea);

					// Set the preferred size of the scroll pane to be 500x300 pixels
					scrollPane.setPreferredSize(new Dimension(500, 300));

					JOptionPane.showMessageDialog(null, scrollPane);
				}

				@Override
				public void onError(Throwable t) {
					System.out.println("Error occurred: " + t.getMessage());
				}

				@Override
				public void onCompleted() {
					// Handle completion here
				}
			};
			MeetingRoomManagementServiceStub stub = MeetingRoomManagementServiceGrpc.newStub(channel);
			stub.updateMeetingRoom(request, responseObserver);
		});
		service2Panel.add(updateButton);

		// Add the service2Panel to the main panel
		add(service2Panel);

		JPanel service3Panel = new JPanel();
		service3Panel.setBorder(BorderFactory.createTitledBorder("Service 3"));
		service3Panel.setPreferredSize(new Dimension(400, 400)); // Set the preferred size to 400 x 400 pixels

		Service3 service3 = new Service3();

		// Get the printer device object
		PrinterDevice printer = service3.getPrinterDevice();

		// Create a label to display the stockPaper and stockCartridge quantities
		JLabel stockLabel = new JLabel(
				"Stock Paper: " + printer.getStockPaper() + " | Stock Cartridge: " + printer.getStockCartridge());
		service3Panel.add(stockLabel);

		// Create two labels to display the alert lights
		JLabel paperAlertLabel = new JLabel();
		paperAlertLabel.setOpaque(true); // Make the label opaque so that the background color is visible
		paperAlertLabel.setPreferredSize(new Dimension(20, 20)); // Set the size of the label to 20x20 pixels
		paperAlertLabel.setBackground(Color.BLACK); // Set the default background color to black
		JLabel cartridgeAlertLabel = new JLabel();
		cartridgeAlertLabel.setOpaque(true);
		cartridgeAlertLabel.setPreferredSize(new Dimension(20, 20));
		cartridgeAlertLabel.setBackground(Color.BLACK);
		// Add the labels to the panel
		service3Panel.add(paperAlertLabel);
		service3Panel.add(cartridgeAlertLabel);

		// Create a timer to update the stockLabel and the alert lights every 5 seconds
		Timer timer = new Timer(5000, new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// Update the stockLabel with the new quantities
				int stockPaper = service3.getPrinterDevice().getStockPaper();
				int stockCartridge = service3.getPrinterDevice().getStockCartridge();
				stockLabel.setText("Stock Paper: " + stockPaper + " | Stock Cartridge: " + stockCartridge);

				// Get the boolean values for the alerts
				boolean alertPaper = stockPaper < 500;
				boolean alertCartridge = stockCartridge < 5;

				// Set the background color of the paperAlertLabel according to the alertPaper
				// boolean value
				if (alertPaper) {
					paperAlertLabel.setBackground(Color.RED);
				} else {
					paperAlertLabel.setBackground(Color.GREEN);
				}

				// Set the background color of the cartridgeAlertLabel according to the
				// alertCartridge boolean value
				if (alertCartridge) {
					cartridgeAlertLabel.setBackground(Color.RED);
				} else {
					cartridgeAlertLabel.setBackground(Color.GREEN);
				}
			}
		});
		timer.start();
		add(service3Panel);

		// Create a new panel to display the existing meeting rooms
		JPanel textPanel = new JPanel();
		textPanel.setSize(getMaximumSize());
		service3Panel.add(new JLabel("If paper stock goes under 500 or cartridge stock goes under 5 red alert"));

		pack();
		setLocationRelativeTo(null);
		setVisible(true);

	}

	public static void main(String[] args) {
		new ControllerGUI();
	}
}
