package MeetingRoomManagementService;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import io.grpc.Status;
import io.grpc.stub.StreamObserver;
import MeetingRoomAvailabilityService.MeetingRoom;
import MeetingRoomAvailabilityService.Service1;
import ch.qos.logback.core.joran.conditional.ThenAction;

public class Service2 extends MeetingRoomManagementServiceGrpc.MeetingRoomManagementServiceImplBase {

	private Service1 service1 = new Service1();

	@Override
	public void addMeetingRoom(AddMeetingRoomRequest request, StreamObserver<AddMeetingRoomResponse> responseObserver) {
		// Create a new meeting room with the given details
		MeetingRoom meetingRoom = MeetingRoom.newBuilder().setId(request.getId()).setName(request.getName())
				.setCapacity(request.getCapacity()).setEquipment(request.getEquipment()).setAvailable(true).build();

		// Add the new meeting room to the list of meeting rooms
		service1.populateRoom(meetingRoom);

		// Get the list of all meeting rooms after adding the new one
		List<MeetingRoom> allRooms = service1.getAllRooms();

		// Convert the list of MeetingRoom objects to a list of UpdatedRoom objects
		List<UpdatedRoom> updatedRooms = new ArrayList<UpdatedRoom>();
		for (MeetingRoom room : allRooms) {
			updatedRooms.add(
					UpdatedRoom.newBuilder().setId(room.getId()).setName(room.getName()).setCapacity(room.getCapacity())
							.setEquipment(room.getEquipment()).setAvailable(room.getAvailable()).build());
		}

		AddMeetingRoomResponse response = AddMeetingRoomResponse.newBuilder()
				.setMessage("Meeting room added successfully. The new meeting room ID: " + meetingRoom.getId())
				.addAllUpdatedRooms(updatedRooms).build();
		responseObserver.onNext(response);
		responseObserver.onCompleted();
	}

	@Override
	public void updateMeetingRoom(UpdateMeetingRoomRequest request,
			StreamObserver<UpdateMeetingRoomResponse> responseObserver) {
		// Get the list of all rooms
		List<MeetingRoom> allRooms = service1.getAllRooms();

		// Find the room to update by ID
		MeetingRoom roomToUpdate = null;
		for (MeetingRoom room : allRooms) {
			if (room.getId().equals(request.getId())) {
				roomToUpdate = room;
				break;
			}
		}

		if (roomToUpdate == null) {
			// Return an error response if the room is not found
			responseObserver.onError(Status.NOT_FOUND.asException());
			return;
		}

		// Update the attributes of the matching room with the new details
		if (request.getName() != null) {
			roomToUpdate = roomToUpdate.toBuilder().setName(request.getName()).build();
		}
		if (request.getCapacity() > 0) {
			roomToUpdate = roomToUpdate.toBuilder().setCapacity(request.getCapacity()).build();
		}
		if (request.getEquipment() != null) {
			roomToUpdate = roomToUpdate.toBuilder().setEquipment(request.getEquipment()).build();
		}

		// Save the updated meeting room back to the list
		service1.updateRoom(roomToUpdate);

		// Create a list of all updated rooms, including the updated room
		List<UpdatedRoom> updatedRooms = new ArrayList<>();
		for (MeetingRoom room : allRooms) {
			UpdatedRoom.Builder updatedRoomBuilder = UpdatedRoom.newBuilder().setId(room.getId());
			if (room.getId().equals(roomToUpdate.getId())) {
				updatedRoomBuilder.setName(roomToUpdate.getName()).setCapacity(roomToUpdate.getCapacity())
						.setEquipment(roomToUpdate.getEquipment());
			} else {
				updatedRoomBuilder.setName(room.getName()).setCapacity(room.getCapacity())
						.setEquipment(room.getEquipment());
			}
			updatedRooms.add(updatedRoomBuilder.build());
		}

		// Send a success response back to the client with the updated room list
		UpdateMeetingRoomResponse response = UpdateMeetingRoomResponse.newBuilder().addAllUpdatedRooms(updatedRooms)
				.build();
		System.out.print("Updated Rooms: " + updatedRooms);
		responseObserver.onNext(response);
		responseObserver.onCompleted();
	}

}
