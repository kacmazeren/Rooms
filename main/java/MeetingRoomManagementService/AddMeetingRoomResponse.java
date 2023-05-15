// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: service2.proto

package MeetingRoomManagementService;

/**
 * Protobuf type {@code meetingroommanagement.AddMeetingRoomResponse}
 */
public  final class AddMeetingRoomResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:meetingroommanagement.AddMeetingRoomResponse)
    AddMeetingRoomResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use AddMeetingRoomResponse.newBuilder() to construct.
  private AddMeetingRoomResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private AddMeetingRoomResponse() {
    success_ = false;
    message_ = "";
    updatedRooms_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private AddMeetingRoomResponse(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    int mutable_bitField0_ = 0;
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          case 8: {

            success_ = input.readBool();
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            message_ = s;
            break;
          }
          case 26: {
            if (!((mutable_bitField0_ & 0x00000004) == 0x00000004)) {
              updatedRooms_ = new java.util.ArrayList<MeetingRoomManagementService.UpdatedRoom>();
              mutable_bitField0_ |= 0x00000004;
            }
            updatedRooms_.add(
                input.readMessage(MeetingRoomManagementService.UpdatedRoom.parser(), extensionRegistry));
            break;
          }
          default: {
            if (!parseUnknownFieldProto3(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      if (((mutable_bitField0_ & 0x00000004) == 0x00000004)) {
        updatedRooms_ = java.util.Collections.unmodifiableList(updatedRooms_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return MeetingRoomManagementService.MeetingRoomManagementServiceImpl.internal_static_meetingroommanagement_AddMeetingRoomResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return MeetingRoomManagementService.MeetingRoomManagementServiceImpl.internal_static_meetingroommanagement_AddMeetingRoomResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            MeetingRoomManagementService.AddMeetingRoomResponse.class, MeetingRoomManagementService.AddMeetingRoomResponse.Builder.class);
  }

  private int bitField0_;
  public static final int SUCCESS_FIELD_NUMBER = 1;
  private boolean success_;
  /**
   * <code>bool success = 1;</code>
   */
  public boolean getSuccess() {
    return success_;
  }

  public static final int MESSAGE_FIELD_NUMBER = 2;
  private volatile java.lang.Object message_;
  /**
   * <code>string message = 2;</code>
   */
  public java.lang.String getMessage() {
    java.lang.Object ref = message_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      message_ = s;
      return s;
    }
  }
  /**
   * <code>string message = 2;</code>
   */
  public com.google.protobuf.ByteString
      getMessageBytes() {
    java.lang.Object ref = message_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      message_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int UPDATED_ROOMS_FIELD_NUMBER = 3;
  private java.util.List<MeetingRoomManagementService.UpdatedRoom> updatedRooms_;
  /**
   * <code>repeated .meetingroommanagement.UpdatedRoom updated_rooms = 3;</code>
   */
  public java.util.List<MeetingRoomManagementService.UpdatedRoom> getUpdatedRoomsList() {
    return updatedRooms_;
  }
  /**
   * <code>repeated .meetingroommanagement.UpdatedRoom updated_rooms = 3;</code>
   */
  public java.util.List<? extends MeetingRoomManagementService.UpdatedRoomOrBuilder> 
      getUpdatedRoomsOrBuilderList() {
    return updatedRooms_;
  }
  /**
   * <code>repeated .meetingroommanagement.UpdatedRoom updated_rooms = 3;</code>
   */
  public int getUpdatedRoomsCount() {
    return updatedRooms_.size();
  }
  /**
   * <code>repeated .meetingroommanagement.UpdatedRoom updated_rooms = 3;</code>
   */
  public MeetingRoomManagementService.UpdatedRoom getUpdatedRooms(int index) {
    return updatedRooms_.get(index);
  }
  /**
   * <code>repeated .meetingroommanagement.UpdatedRoom updated_rooms = 3;</code>
   */
  public MeetingRoomManagementService.UpdatedRoomOrBuilder getUpdatedRoomsOrBuilder(
      int index) {
    return updatedRooms_.get(index);
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (success_ != false) {
      output.writeBool(1, success_);
    }
    if (!getMessageBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, message_);
    }
    for (int i = 0; i < updatedRooms_.size(); i++) {
      output.writeMessage(3, updatedRooms_.get(i));
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (success_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(1, success_);
    }
    if (!getMessageBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, message_);
    }
    for (int i = 0; i < updatedRooms_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(3, updatedRooms_.get(i));
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof MeetingRoomManagementService.AddMeetingRoomResponse)) {
      return super.equals(obj);
    }
    MeetingRoomManagementService.AddMeetingRoomResponse other = (MeetingRoomManagementService.AddMeetingRoomResponse) obj;

    boolean result = true;
    result = result && (getSuccess()
        == other.getSuccess());
    result = result && getMessage()
        .equals(other.getMessage());
    result = result && getUpdatedRoomsList()
        .equals(other.getUpdatedRoomsList());
    result = result && unknownFields.equals(other.unknownFields);
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + SUCCESS_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getSuccess());
    hash = (37 * hash) + MESSAGE_FIELD_NUMBER;
    hash = (53 * hash) + getMessage().hashCode();
    if (getUpdatedRoomsCount() > 0) {
      hash = (37 * hash) + UPDATED_ROOMS_FIELD_NUMBER;
      hash = (53 * hash) + getUpdatedRoomsList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static MeetingRoomManagementService.AddMeetingRoomResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static MeetingRoomManagementService.AddMeetingRoomResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static MeetingRoomManagementService.AddMeetingRoomResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static MeetingRoomManagementService.AddMeetingRoomResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static MeetingRoomManagementService.AddMeetingRoomResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static MeetingRoomManagementService.AddMeetingRoomResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static MeetingRoomManagementService.AddMeetingRoomResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static MeetingRoomManagementService.AddMeetingRoomResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static MeetingRoomManagementService.AddMeetingRoomResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static MeetingRoomManagementService.AddMeetingRoomResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static MeetingRoomManagementService.AddMeetingRoomResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static MeetingRoomManagementService.AddMeetingRoomResponse parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(MeetingRoomManagementService.AddMeetingRoomResponse prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code meetingroommanagement.AddMeetingRoomResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:meetingroommanagement.AddMeetingRoomResponse)
      MeetingRoomManagementService.AddMeetingRoomResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return MeetingRoomManagementService.MeetingRoomManagementServiceImpl.internal_static_meetingroommanagement_AddMeetingRoomResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return MeetingRoomManagementService.MeetingRoomManagementServiceImpl.internal_static_meetingroommanagement_AddMeetingRoomResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              MeetingRoomManagementService.AddMeetingRoomResponse.class, MeetingRoomManagementService.AddMeetingRoomResponse.Builder.class);
    }

    // Construct using MeetingRoomManagementService.AddMeetingRoomResponse.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
        getUpdatedRoomsFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      success_ = false;

      message_ = "";

      if (updatedRoomsBuilder_ == null) {
        updatedRooms_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000004);
      } else {
        updatedRoomsBuilder_.clear();
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return MeetingRoomManagementService.MeetingRoomManagementServiceImpl.internal_static_meetingroommanagement_AddMeetingRoomResponse_descriptor;
    }

    @java.lang.Override
    public MeetingRoomManagementService.AddMeetingRoomResponse getDefaultInstanceForType() {
      return MeetingRoomManagementService.AddMeetingRoomResponse.getDefaultInstance();
    }

    @java.lang.Override
    public MeetingRoomManagementService.AddMeetingRoomResponse build() {
      MeetingRoomManagementService.AddMeetingRoomResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public MeetingRoomManagementService.AddMeetingRoomResponse buildPartial() {
      MeetingRoomManagementService.AddMeetingRoomResponse result = new MeetingRoomManagementService.AddMeetingRoomResponse(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      result.success_ = success_;
      result.message_ = message_;
      if (updatedRoomsBuilder_ == null) {
        if (((bitField0_ & 0x00000004) == 0x00000004)) {
          updatedRooms_ = java.util.Collections.unmodifiableList(updatedRooms_);
          bitField0_ = (bitField0_ & ~0x00000004);
        }
        result.updatedRooms_ = updatedRooms_;
      } else {
        result.updatedRooms_ = updatedRoomsBuilder_.build();
      }
      result.bitField0_ = to_bitField0_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return (Builder) super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return (Builder) super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return (Builder) super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof MeetingRoomManagementService.AddMeetingRoomResponse) {
        return mergeFrom((MeetingRoomManagementService.AddMeetingRoomResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(MeetingRoomManagementService.AddMeetingRoomResponse other) {
      if (other == MeetingRoomManagementService.AddMeetingRoomResponse.getDefaultInstance()) return this;
      if (other.getSuccess() != false) {
        setSuccess(other.getSuccess());
      }
      if (!other.getMessage().isEmpty()) {
        message_ = other.message_;
        onChanged();
      }
      if (updatedRoomsBuilder_ == null) {
        if (!other.updatedRooms_.isEmpty()) {
          if (updatedRooms_.isEmpty()) {
            updatedRooms_ = other.updatedRooms_;
            bitField0_ = (bitField0_ & ~0x00000004);
          } else {
            ensureUpdatedRoomsIsMutable();
            updatedRooms_.addAll(other.updatedRooms_);
          }
          onChanged();
        }
      } else {
        if (!other.updatedRooms_.isEmpty()) {
          if (updatedRoomsBuilder_.isEmpty()) {
            updatedRoomsBuilder_.dispose();
            updatedRoomsBuilder_ = null;
            updatedRooms_ = other.updatedRooms_;
            bitField0_ = (bitField0_ & ~0x00000004);
            updatedRoomsBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getUpdatedRoomsFieldBuilder() : null;
          } else {
            updatedRoomsBuilder_.addAllMessages(other.updatedRooms_);
          }
        }
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      MeetingRoomManagementService.AddMeetingRoomResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (MeetingRoomManagementService.AddMeetingRoomResponse) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private boolean success_ ;
    /**
     * <code>bool success = 1;</code>
     */
    public boolean getSuccess() {
      return success_;
    }
    /**
     * <code>bool success = 1;</code>
     */
    public Builder setSuccess(boolean value) {
      
      success_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>bool success = 1;</code>
     */
    public Builder clearSuccess() {
      
      success_ = false;
      onChanged();
      return this;
    }

    private java.lang.Object message_ = "";
    /**
     * <code>string message = 2;</code>
     */
    public java.lang.String getMessage() {
      java.lang.Object ref = message_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        message_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string message = 2;</code>
     */
    public com.google.protobuf.ByteString
        getMessageBytes() {
      java.lang.Object ref = message_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        message_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string message = 2;</code>
     */
    public Builder setMessage(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      message_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string message = 2;</code>
     */
    public Builder clearMessage() {
      
      message_ = getDefaultInstance().getMessage();
      onChanged();
      return this;
    }
    /**
     * <code>string message = 2;</code>
     */
    public Builder setMessageBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      message_ = value;
      onChanged();
      return this;
    }

    private java.util.List<MeetingRoomManagementService.UpdatedRoom> updatedRooms_ =
      java.util.Collections.emptyList();
    private void ensureUpdatedRoomsIsMutable() {
      if (!((bitField0_ & 0x00000004) == 0x00000004)) {
        updatedRooms_ = new java.util.ArrayList<MeetingRoomManagementService.UpdatedRoom>(updatedRooms_);
        bitField0_ |= 0x00000004;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        MeetingRoomManagementService.UpdatedRoom, MeetingRoomManagementService.UpdatedRoom.Builder, MeetingRoomManagementService.UpdatedRoomOrBuilder> updatedRoomsBuilder_;

    /**
     * <code>repeated .meetingroommanagement.UpdatedRoom updated_rooms = 3;</code>
     */
    public java.util.List<MeetingRoomManagementService.UpdatedRoom> getUpdatedRoomsList() {
      if (updatedRoomsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(updatedRooms_);
      } else {
        return updatedRoomsBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .meetingroommanagement.UpdatedRoom updated_rooms = 3;</code>
     */
    public int getUpdatedRoomsCount() {
      if (updatedRoomsBuilder_ == null) {
        return updatedRooms_.size();
      } else {
        return updatedRoomsBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .meetingroommanagement.UpdatedRoom updated_rooms = 3;</code>
     */
    public MeetingRoomManagementService.UpdatedRoom getUpdatedRooms(int index) {
      if (updatedRoomsBuilder_ == null) {
        return updatedRooms_.get(index);
      } else {
        return updatedRoomsBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .meetingroommanagement.UpdatedRoom updated_rooms = 3;</code>
     */
    public Builder setUpdatedRooms(
        int index, MeetingRoomManagementService.UpdatedRoom value) {
      if (updatedRoomsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureUpdatedRoomsIsMutable();
        updatedRooms_.set(index, value);
        onChanged();
      } else {
        updatedRoomsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .meetingroommanagement.UpdatedRoom updated_rooms = 3;</code>
     */
    public Builder setUpdatedRooms(
        int index, MeetingRoomManagementService.UpdatedRoom.Builder builderForValue) {
      if (updatedRoomsBuilder_ == null) {
        ensureUpdatedRoomsIsMutable();
        updatedRooms_.set(index, builderForValue.build());
        onChanged();
      } else {
        updatedRoomsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .meetingroommanagement.UpdatedRoom updated_rooms = 3;</code>
     */
    public Builder addUpdatedRooms(MeetingRoomManagementService.UpdatedRoom value) {
      if (updatedRoomsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureUpdatedRoomsIsMutable();
        updatedRooms_.add(value);
        onChanged();
      } else {
        updatedRoomsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .meetingroommanagement.UpdatedRoom updated_rooms = 3;</code>
     */
    public Builder addUpdatedRooms(
        int index, MeetingRoomManagementService.UpdatedRoom value) {
      if (updatedRoomsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureUpdatedRoomsIsMutable();
        updatedRooms_.add(index, value);
        onChanged();
      } else {
        updatedRoomsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .meetingroommanagement.UpdatedRoom updated_rooms = 3;</code>
     */
    public Builder addUpdatedRooms(
        MeetingRoomManagementService.UpdatedRoom.Builder builderForValue) {
      if (updatedRoomsBuilder_ == null) {
        ensureUpdatedRoomsIsMutable();
        updatedRooms_.add(builderForValue.build());
        onChanged();
      } else {
        updatedRoomsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .meetingroommanagement.UpdatedRoom updated_rooms = 3;</code>
     */
    public Builder addUpdatedRooms(
        int index, MeetingRoomManagementService.UpdatedRoom.Builder builderForValue) {
      if (updatedRoomsBuilder_ == null) {
        ensureUpdatedRoomsIsMutable();
        updatedRooms_.add(index, builderForValue.build());
        onChanged();
      } else {
        updatedRoomsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .meetingroommanagement.UpdatedRoom updated_rooms = 3;</code>
     */
    public Builder addAllUpdatedRooms(
        java.lang.Iterable<? extends MeetingRoomManagementService.UpdatedRoom> values) {
      if (updatedRoomsBuilder_ == null) {
        ensureUpdatedRoomsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, updatedRooms_);
        onChanged();
      } else {
        updatedRoomsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .meetingroommanagement.UpdatedRoom updated_rooms = 3;</code>
     */
    public Builder clearUpdatedRooms() {
      if (updatedRoomsBuilder_ == null) {
        updatedRooms_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000004);
        onChanged();
      } else {
        updatedRoomsBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .meetingroommanagement.UpdatedRoom updated_rooms = 3;</code>
     */
    public Builder removeUpdatedRooms(int index) {
      if (updatedRoomsBuilder_ == null) {
        ensureUpdatedRoomsIsMutable();
        updatedRooms_.remove(index);
        onChanged();
      } else {
        updatedRoomsBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .meetingroommanagement.UpdatedRoom updated_rooms = 3;</code>
     */
    public MeetingRoomManagementService.UpdatedRoom.Builder getUpdatedRoomsBuilder(
        int index) {
      return getUpdatedRoomsFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .meetingroommanagement.UpdatedRoom updated_rooms = 3;</code>
     */
    public MeetingRoomManagementService.UpdatedRoomOrBuilder getUpdatedRoomsOrBuilder(
        int index) {
      if (updatedRoomsBuilder_ == null) {
        return updatedRooms_.get(index);  } else {
        return updatedRoomsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .meetingroommanagement.UpdatedRoom updated_rooms = 3;</code>
     */
    public java.util.List<? extends MeetingRoomManagementService.UpdatedRoomOrBuilder> 
         getUpdatedRoomsOrBuilderList() {
      if (updatedRoomsBuilder_ != null) {
        return updatedRoomsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(updatedRooms_);
      }
    }
    /**
     * <code>repeated .meetingroommanagement.UpdatedRoom updated_rooms = 3;</code>
     */
    public MeetingRoomManagementService.UpdatedRoom.Builder addUpdatedRoomsBuilder() {
      return getUpdatedRoomsFieldBuilder().addBuilder(
          MeetingRoomManagementService.UpdatedRoom.getDefaultInstance());
    }
    /**
     * <code>repeated .meetingroommanagement.UpdatedRoom updated_rooms = 3;</code>
     */
    public MeetingRoomManagementService.UpdatedRoom.Builder addUpdatedRoomsBuilder(
        int index) {
      return getUpdatedRoomsFieldBuilder().addBuilder(
          index, MeetingRoomManagementService.UpdatedRoom.getDefaultInstance());
    }
    /**
     * <code>repeated .meetingroommanagement.UpdatedRoom updated_rooms = 3;</code>
     */
    public java.util.List<MeetingRoomManagementService.UpdatedRoom.Builder> 
         getUpdatedRoomsBuilderList() {
      return getUpdatedRoomsFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        MeetingRoomManagementService.UpdatedRoom, MeetingRoomManagementService.UpdatedRoom.Builder, MeetingRoomManagementService.UpdatedRoomOrBuilder> 
        getUpdatedRoomsFieldBuilder() {
      if (updatedRoomsBuilder_ == null) {
        updatedRoomsBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            MeetingRoomManagementService.UpdatedRoom, MeetingRoomManagementService.UpdatedRoom.Builder, MeetingRoomManagementService.UpdatedRoomOrBuilder>(
                updatedRooms_,
                ((bitField0_ & 0x00000004) == 0x00000004),
                getParentForChildren(),
                isClean());
        updatedRooms_ = null;
      }
      return updatedRoomsBuilder_;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFieldsProto3(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:meetingroommanagement.AddMeetingRoomResponse)
  }

  // @@protoc_insertion_point(class_scope:meetingroommanagement.AddMeetingRoomResponse)
  private static final MeetingRoomManagementService.AddMeetingRoomResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new MeetingRoomManagementService.AddMeetingRoomResponse();
  }

  public static MeetingRoomManagementService.AddMeetingRoomResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<AddMeetingRoomResponse>
      PARSER = new com.google.protobuf.AbstractParser<AddMeetingRoomResponse>() {
    @java.lang.Override
    public AddMeetingRoomResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new AddMeetingRoomResponse(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<AddMeetingRoomResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<AddMeetingRoomResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public MeetingRoomManagementService.AddMeetingRoomResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

