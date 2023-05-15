package MeetingRoomAvailabilityService;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import MeetingRoomManagementService.Service2;
import io.grpc.stub.StreamObserver;

public class Service1 extends MeetingRoomAvailabilityServiceGrpc.MeetingRoomAvailabilityServiceImplBase {

	public ArrayList<String> bookings = new ArrayList<String>();
	public ArrayList<MeetingRoom> rooms = new ArrayList<>();
	private Map<String, MeetingRoom> meetingRooms = new HashMap<>();

	MeetingRoom room1 = MeetingRoom.newBuilder().setId("1").setName("Room 1").setCapacity(10)
			.setEquipment("Projector, Whiteboard").build();
	MeetingRoom room2 = MeetingRoom.newBuilder().setId("2").setName("Room 2").setCapacity(20)
			.setEquipment("Projector, Whiteboard").build();

	@Override
	public void bookMeetingRoom(BookingRequest request, StreamObserver<BookingResponse> responseObserver) {
		System.out.println("bookMeetingRoom");

		String id = request.getId();
		LocalTime startTime = LocalTime.parse(request.getStartTime());
		if (startTime.isBefore(LocalTime.parse("07:00")) || startTime.isAfter(LocalTime.parse("22:00"))) {
			BookingResponse response = BookingResponse.newBuilder().setIsBooked(false)
					.setMessage("Start time should be between 7am and 10pm.").build();
			responseObserver.onNext(response);
			responseObserver.onCompleted();
			return;
		}

		int duration = request.getDuration();
		int durationInSeconds = request.getDuration() * 60;
		String reservation = id + request.getDate() + request.getStartTime() + durationInSeconds;

		System.out.println(reservation);

		// Check if reservation already exists in bookings list
		if (bookings.contains(reservation)) {
			BookingResponse response = BookingResponse.newBuilder().setIsBooked(false)
					.setMessage("Reservation already exists.").build();
			responseObserver.onNext(response);
			responseObserver.onCompleted();
			return;
		}

		MeetingRoom selectedRoom;
		if (room1.getId().equals(id)) {
			selectedRoom = room1;
			if (bookings == null) {
				bookings = new ArrayList<>();
			}
			bookings.add(reservation);
			BookingResponse response = BookingResponse.newBuilder().setResNum(reservation).setIsBooked(true)
					.setMessage("Booking completed.").build();

			responseObserver.onNext(response);
			responseObserver.onCompleted();
		} else if (room2.getId().equals(id)) {
			selectedRoom = room2;
			if (bookings == null) {
				bookings = new ArrayList<>();
			}
			bookings.add(reservation);
			BookingResponse response = BookingResponse.newBuilder().setResNum(reservation).setIsBooked(true)
					.setMessage("Booking completed.").build();
			responseObserver.onNext(response);
			responseObserver.onCompleted();
		} else {
			// Handle case when neither room1 nor room2 is selected
		}
	}

	public Service1() {
		populateRoom(room1);
		populateRoom(room2);
	}

	public void populateRoom(MeetingRoom meetingRoom) {
		meetingRooms.put(meetingRoom.getId(), meetingRoom);
	}

	public MeetingRoom getId(String id) {
		return meetingRooms.get(id);
	}

	public ArrayList<String> getBookings() {
		return bookings;
	}

	public class Booking {
		private int resNum;

		public Booking(int resNum) {
			this.resNum = resNum;
		}

		public int getResNum() {
			return resNum;
		}
	}

	public List<MeetingRoom> getAllRooms() {
		return new ArrayList<>(meetingRooms.values());
	}

	public void updateRoom(MeetingRoom room) {
		for (int i = 0; i < rooms.size(); i++) {
			if (rooms.get(i).getId().equals(room.getId())) {
				rooms.set(i, room);
				break;
			}
		}
	}

	public List<MeetingRoom> getMeetingRooms() {
		List<MeetingRoom> meetingRooms = new ArrayList<>();
		meetingRooms.add(room1);
		meetingRooms.add(room2);
		return meetingRooms;
	}

	public List<MeetingRoom> getAvailableRooms() {
		List<MeetingRoom> availableRooms = new ArrayList<>();
		availableRooms.add(room1);
		availableRooms.add(room2);
		return availableRooms;
	}

	public List<MeetingRoom> getExistingRooms() {
		List<MeetingRoom> rooms = new ArrayList<>();
		rooms.add(room1);
		rooms.add(room2);
		return rooms;
	}

}
