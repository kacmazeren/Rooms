package Client;

import java.io.IOException;

import MeetingRoomAvailabilityService.Service1;
import MeetingRoomManagementService.Service2;
import MeetingRoomNotificationService.Service3;
import io.grpc.ServerBuilder;


public class Server {
    
    public static void main(String[] args) throws IOException, InterruptedException {
        Service1 service1 = new Service1();
        Service2 service2 = new Service2();
        Service3 service3 = new Service3();
        int port = 50051;

        io.grpc.Server server = ServerBuilder.forPort(port)
                .addService(service1)
                .addService(service2)
                .addService(service3)
                .build()
                .start();

        System.out.println("Services started, listening on " + port);

        server.awaitTermination();
    }
}
