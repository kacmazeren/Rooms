package MeetingRoomAvailabilityService;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.15.0)",
    comments = "Source: service1.proto")
public final class MeetingRoomAvailabilityServiceGrpc {

  private MeetingRoomAvailabilityServiceGrpc() {}

  public static final String SERVICE_NAME = "meetingroomavailability.MeetingRoomAvailabilityService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<MeetingRoomAvailabilityService.BookingRequest,
      MeetingRoomAvailabilityService.BookingResponse> getBookMeetingRoomMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "BookMeetingRoom",
      requestType = MeetingRoomAvailabilityService.BookingRequest.class,
      responseType = MeetingRoomAvailabilityService.BookingResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<MeetingRoomAvailabilityService.BookingRequest,
      MeetingRoomAvailabilityService.BookingResponse> getBookMeetingRoomMethod() {
    io.grpc.MethodDescriptor<MeetingRoomAvailabilityService.BookingRequest, MeetingRoomAvailabilityService.BookingResponse> getBookMeetingRoomMethod;
    if ((getBookMeetingRoomMethod = MeetingRoomAvailabilityServiceGrpc.getBookMeetingRoomMethod) == null) {
      synchronized (MeetingRoomAvailabilityServiceGrpc.class) {
        if ((getBookMeetingRoomMethod = MeetingRoomAvailabilityServiceGrpc.getBookMeetingRoomMethod) == null) {
          MeetingRoomAvailabilityServiceGrpc.getBookMeetingRoomMethod = getBookMeetingRoomMethod = 
              io.grpc.MethodDescriptor.<MeetingRoomAvailabilityService.BookingRequest, MeetingRoomAvailabilityService.BookingResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "meetingroomavailability.MeetingRoomAvailabilityService", "BookMeetingRoom"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  MeetingRoomAvailabilityService.BookingRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  MeetingRoomAvailabilityService.BookingResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new MeetingRoomAvailabilityServiceMethodDescriptorSupplier("BookMeetingRoom"))
                  .build();
          }
        }
     }
     return getBookMeetingRoomMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static MeetingRoomAvailabilityServiceStub newStub(io.grpc.Channel channel) {
    return new MeetingRoomAvailabilityServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static MeetingRoomAvailabilityServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new MeetingRoomAvailabilityServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static MeetingRoomAvailabilityServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new MeetingRoomAvailabilityServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class MeetingRoomAvailabilityServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void bookMeetingRoom(MeetingRoomAvailabilityService.BookingRequest request,
        io.grpc.stub.StreamObserver<MeetingRoomAvailabilityService.BookingResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getBookMeetingRoomMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getBookMeetingRoomMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                MeetingRoomAvailabilityService.BookingRequest,
                MeetingRoomAvailabilityService.BookingResponse>(
                  this, METHODID_BOOK_MEETING_ROOM)))
          .build();
    }
  }

  /**
   */
  public static final class MeetingRoomAvailabilityServiceStub extends io.grpc.stub.AbstractStub<MeetingRoomAvailabilityServiceStub> {
    private MeetingRoomAvailabilityServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private MeetingRoomAvailabilityServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MeetingRoomAvailabilityServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new MeetingRoomAvailabilityServiceStub(channel, callOptions);
    }

    /**
     */
    public void bookMeetingRoom(MeetingRoomAvailabilityService.BookingRequest request,
        io.grpc.stub.StreamObserver<MeetingRoomAvailabilityService.BookingResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getBookMeetingRoomMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class MeetingRoomAvailabilityServiceBlockingStub extends io.grpc.stub.AbstractStub<MeetingRoomAvailabilityServiceBlockingStub> {
    private MeetingRoomAvailabilityServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private MeetingRoomAvailabilityServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MeetingRoomAvailabilityServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new MeetingRoomAvailabilityServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public MeetingRoomAvailabilityService.BookingResponse bookMeetingRoom(MeetingRoomAvailabilityService.BookingRequest request) {
      return blockingUnaryCall(
          getChannel(), getBookMeetingRoomMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class MeetingRoomAvailabilityServiceFutureStub extends io.grpc.stub.AbstractStub<MeetingRoomAvailabilityServiceFutureStub> {
    private MeetingRoomAvailabilityServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private MeetingRoomAvailabilityServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MeetingRoomAvailabilityServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new MeetingRoomAvailabilityServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<MeetingRoomAvailabilityService.BookingResponse> bookMeetingRoom(
        MeetingRoomAvailabilityService.BookingRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getBookMeetingRoomMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_BOOK_MEETING_ROOM = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final MeetingRoomAvailabilityServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(MeetingRoomAvailabilityServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_BOOK_MEETING_ROOM:
          serviceImpl.bookMeetingRoom((MeetingRoomAvailabilityService.BookingRequest) request,
              (io.grpc.stub.StreamObserver<MeetingRoomAvailabilityService.BookingResponse>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class MeetingRoomAvailabilityServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    MeetingRoomAvailabilityServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return MeetingRoomAvailabilityService.MeetingRoomAvailabilityServiceImpl.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("MeetingRoomAvailabilityService");
    }
  }

  private static final class MeetingRoomAvailabilityServiceFileDescriptorSupplier
      extends MeetingRoomAvailabilityServiceBaseDescriptorSupplier {
    MeetingRoomAvailabilityServiceFileDescriptorSupplier() {}
  }

  private static final class MeetingRoomAvailabilityServiceMethodDescriptorSupplier
      extends MeetingRoomAvailabilityServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    MeetingRoomAvailabilityServiceMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (MeetingRoomAvailabilityServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new MeetingRoomAvailabilityServiceFileDescriptorSupplier())
              .addMethod(getBookMeetingRoomMethod())
              .build();
        }
      }
    }
    return result;
  }
}
