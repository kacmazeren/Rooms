package MeetingRoomManagementService;

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
    comments = "Source: service2.proto")
public final class MeetingRoomManagementServiceGrpc {

  private MeetingRoomManagementServiceGrpc() {}

  public static final String SERVICE_NAME = "meetingroommanagement.MeetingRoomManagementService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<MeetingRoomManagementService.AddMeetingRoomRequest,
      MeetingRoomManagementService.AddMeetingRoomResponse> getAddMeetingRoomMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AddMeetingRoom",
      requestType = MeetingRoomManagementService.AddMeetingRoomRequest.class,
      responseType = MeetingRoomManagementService.AddMeetingRoomResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<MeetingRoomManagementService.AddMeetingRoomRequest,
      MeetingRoomManagementService.AddMeetingRoomResponse> getAddMeetingRoomMethod() {
    io.grpc.MethodDescriptor<MeetingRoomManagementService.AddMeetingRoomRequest, MeetingRoomManagementService.AddMeetingRoomResponse> getAddMeetingRoomMethod;
    if ((getAddMeetingRoomMethod = MeetingRoomManagementServiceGrpc.getAddMeetingRoomMethod) == null) {
      synchronized (MeetingRoomManagementServiceGrpc.class) {
        if ((getAddMeetingRoomMethod = MeetingRoomManagementServiceGrpc.getAddMeetingRoomMethod) == null) {
          MeetingRoomManagementServiceGrpc.getAddMeetingRoomMethod = getAddMeetingRoomMethod = 
              io.grpc.MethodDescriptor.<MeetingRoomManagementService.AddMeetingRoomRequest, MeetingRoomManagementService.AddMeetingRoomResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "meetingroommanagement.MeetingRoomManagementService", "AddMeetingRoom"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  MeetingRoomManagementService.AddMeetingRoomRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  MeetingRoomManagementService.AddMeetingRoomResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new MeetingRoomManagementServiceMethodDescriptorSupplier("AddMeetingRoom"))
                  .build();
          }
        }
     }
     return getAddMeetingRoomMethod;
  }

  private static volatile io.grpc.MethodDescriptor<MeetingRoomManagementService.UpdateMeetingRoomRequest,
      MeetingRoomManagementService.UpdateMeetingRoomResponse> getUpdateMeetingRoomMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateMeetingRoom",
      requestType = MeetingRoomManagementService.UpdateMeetingRoomRequest.class,
      responseType = MeetingRoomManagementService.UpdateMeetingRoomResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<MeetingRoomManagementService.UpdateMeetingRoomRequest,
      MeetingRoomManagementService.UpdateMeetingRoomResponse> getUpdateMeetingRoomMethod() {
    io.grpc.MethodDescriptor<MeetingRoomManagementService.UpdateMeetingRoomRequest, MeetingRoomManagementService.UpdateMeetingRoomResponse> getUpdateMeetingRoomMethod;
    if ((getUpdateMeetingRoomMethod = MeetingRoomManagementServiceGrpc.getUpdateMeetingRoomMethod) == null) {
      synchronized (MeetingRoomManagementServiceGrpc.class) {
        if ((getUpdateMeetingRoomMethod = MeetingRoomManagementServiceGrpc.getUpdateMeetingRoomMethod) == null) {
          MeetingRoomManagementServiceGrpc.getUpdateMeetingRoomMethod = getUpdateMeetingRoomMethod = 
              io.grpc.MethodDescriptor.<MeetingRoomManagementService.UpdateMeetingRoomRequest, MeetingRoomManagementService.UpdateMeetingRoomResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "meetingroommanagement.MeetingRoomManagementService", "UpdateMeetingRoom"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  MeetingRoomManagementService.UpdateMeetingRoomRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  MeetingRoomManagementService.UpdateMeetingRoomResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new MeetingRoomManagementServiceMethodDescriptorSupplier("UpdateMeetingRoom"))
                  .build();
          }
        }
     }
     return getUpdateMeetingRoomMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static MeetingRoomManagementServiceStub newStub(io.grpc.Channel channel) {
    return new MeetingRoomManagementServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static MeetingRoomManagementServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new MeetingRoomManagementServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static MeetingRoomManagementServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new MeetingRoomManagementServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class MeetingRoomManagementServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void addMeetingRoom(MeetingRoomManagementService.AddMeetingRoomRequest request,
        io.grpc.stub.StreamObserver<MeetingRoomManagementService.AddMeetingRoomResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getAddMeetingRoomMethod(), responseObserver);
    }

    /**
     */
    public void updateMeetingRoom(MeetingRoomManagementService.UpdateMeetingRoomRequest request,
        io.grpc.stub.StreamObserver<MeetingRoomManagementService.UpdateMeetingRoomResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getUpdateMeetingRoomMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getAddMeetingRoomMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                MeetingRoomManagementService.AddMeetingRoomRequest,
                MeetingRoomManagementService.AddMeetingRoomResponse>(
                  this, METHODID_ADD_MEETING_ROOM)))
          .addMethod(
            getUpdateMeetingRoomMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                MeetingRoomManagementService.UpdateMeetingRoomRequest,
                MeetingRoomManagementService.UpdateMeetingRoomResponse>(
                  this, METHODID_UPDATE_MEETING_ROOM)))
          .build();
    }
  }

  /**
   */
  public static final class MeetingRoomManagementServiceStub extends io.grpc.stub.AbstractStub<MeetingRoomManagementServiceStub> {
    private MeetingRoomManagementServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private MeetingRoomManagementServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MeetingRoomManagementServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new MeetingRoomManagementServiceStub(channel, callOptions);
    }

    /**
     */
    public void addMeetingRoom(MeetingRoomManagementService.AddMeetingRoomRequest request,
        io.grpc.stub.StreamObserver<MeetingRoomManagementService.AddMeetingRoomResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getAddMeetingRoomMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateMeetingRoom(MeetingRoomManagementService.UpdateMeetingRoomRequest request,
        io.grpc.stub.StreamObserver<MeetingRoomManagementService.UpdateMeetingRoomResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUpdateMeetingRoomMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class MeetingRoomManagementServiceBlockingStub extends io.grpc.stub.AbstractStub<MeetingRoomManagementServiceBlockingStub> {
    private MeetingRoomManagementServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private MeetingRoomManagementServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MeetingRoomManagementServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new MeetingRoomManagementServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public MeetingRoomManagementService.AddMeetingRoomResponse addMeetingRoom(MeetingRoomManagementService.AddMeetingRoomRequest request) {
      return blockingUnaryCall(
          getChannel(), getAddMeetingRoomMethod(), getCallOptions(), request);
    }

    /**
     */
    public MeetingRoomManagementService.UpdateMeetingRoomResponse updateMeetingRoom(MeetingRoomManagementService.UpdateMeetingRoomRequest request) {
      return blockingUnaryCall(
          getChannel(), getUpdateMeetingRoomMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class MeetingRoomManagementServiceFutureStub extends io.grpc.stub.AbstractStub<MeetingRoomManagementServiceFutureStub> {
    private MeetingRoomManagementServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private MeetingRoomManagementServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MeetingRoomManagementServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new MeetingRoomManagementServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<MeetingRoomManagementService.AddMeetingRoomResponse> addMeetingRoom(
        MeetingRoomManagementService.AddMeetingRoomRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getAddMeetingRoomMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<MeetingRoomManagementService.UpdateMeetingRoomResponse> updateMeetingRoom(
        MeetingRoomManagementService.UpdateMeetingRoomRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getUpdateMeetingRoomMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_ADD_MEETING_ROOM = 0;
  private static final int METHODID_UPDATE_MEETING_ROOM = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final MeetingRoomManagementServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(MeetingRoomManagementServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_ADD_MEETING_ROOM:
          serviceImpl.addMeetingRoom((MeetingRoomManagementService.AddMeetingRoomRequest) request,
              (io.grpc.stub.StreamObserver<MeetingRoomManagementService.AddMeetingRoomResponse>) responseObserver);
          break;
        case METHODID_UPDATE_MEETING_ROOM:
          serviceImpl.updateMeetingRoom((MeetingRoomManagementService.UpdateMeetingRoomRequest) request,
              (io.grpc.stub.StreamObserver<MeetingRoomManagementService.UpdateMeetingRoomResponse>) responseObserver);
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

  private static abstract class MeetingRoomManagementServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    MeetingRoomManagementServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return MeetingRoomManagementService.MeetingRoomManagementServiceImpl.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("MeetingRoomManagementService");
    }
  }

  private static final class MeetingRoomManagementServiceFileDescriptorSupplier
      extends MeetingRoomManagementServiceBaseDescriptorSupplier {
    MeetingRoomManagementServiceFileDescriptorSupplier() {}
  }

  private static final class MeetingRoomManagementServiceMethodDescriptorSupplier
      extends MeetingRoomManagementServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    MeetingRoomManagementServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (MeetingRoomManagementServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new MeetingRoomManagementServiceFileDescriptorSupplier())
              .addMethod(getAddMeetingRoomMethod())
              .addMethod(getUpdateMeetingRoomMethod())
              .build();
        }
      }
    }
    return result;
  }
}
