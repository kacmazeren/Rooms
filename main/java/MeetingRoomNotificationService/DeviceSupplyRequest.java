// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: service3.proto

package MeetingRoomNotificationService;

/**
 * Protobuf type {@code meetingroomnotification.DeviceSupplyRequest}
 */
public  final class DeviceSupplyRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:meetingroomnotification.DeviceSupplyRequest)
    DeviceSupplyRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use DeviceSupplyRequest.newBuilder() to construct.
  private DeviceSupplyRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private DeviceSupplyRequest() {
    name_ = "";
    paper_ = 0;
    cartridge_ = 0;
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private DeviceSupplyRequest(
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
          case 10: {
            java.lang.String s = input.readStringRequireUtf8();

            name_ = s;
            break;
          }
          case 16: {

            paper_ = input.readInt32();
            break;
          }
          case 24: {

            cartridge_ = input.readInt32();
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
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return MeetingRoomNotificationService.MeetingRoomNotificationServiceImpl.internal_static_meetingroomnotification_DeviceSupplyRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return MeetingRoomNotificationService.MeetingRoomNotificationServiceImpl.internal_static_meetingroomnotification_DeviceSupplyRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            MeetingRoomNotificationService.DeviceSupplyRequest.class, MeetingRoomNotificationService.DeviceSupplyRequest.Builder.class);
  }

  public static final int NAME_FIELD_NUMBER = 1;
  private volatile java.lang.Object name_;
  /**
   * <code>string name = 1;</code>
   */
  public java.lang.String getName() {
    java.lang.Object ref = name_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      name_ = s;
      return s;
    }
  }
  /**
   * <code>string name = 1;</code>
   */
  public com.google.protobuf.ByteString
      getNameBytes() {
    java.lang.Object ref = name_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      name_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int PAPER_FIELD_NUMBER = 2;
  private int paper_;
  /**
   * <code>int32 paper = 2;</code>
   */
  public int getPaper() {
    return paper_;
  }

  public static final int CARTRIDGE_FIELD_NUMBER = 3;
  private int cartridge_;
  /**
   * <code>int32 cartridge = 3;</code>
   */
  public int getCartridge() {
    return cartridge_;
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
    if (!getNameBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, name_);
    }
    if (paper_ != 0) {
      output.writeInt32(2, paper_);
    }
    if (cartridge_ != 0) {
      output.writeInt32(3, cartridge_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getNameBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, name_);
    }
    if (paper_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(2, paper_);
    }
    if (cartridge_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(3, cartridge_);
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
    if (!(obj instanceof MeetingRoomNotificationService.DeviceSupplyRequest)) {
      return super.equals(obj);
    }
    MeetingRoomNotificationService.DeviceSupplyRequest other = (MeetingRoomNotificationService.DeviceSupplyRequest) obj;

    boolean result = true;
    result = result && getName()
        .equals(other.getName());
    result = result && (getPaper()
        == other.getPaper());
    result = result && (getCartridge()
        == other.getCartridge());
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
    hash = (37 * hash) + NAME_FIELD_NUMBER;
    hash = (53 * hash) + getName().hashCode();
    hash = (37 * hash) + PAPER_FIELD_NUMBER;
    hash = (53 * hash) + getPaper();
    hash = (37 * hash) + CARTRIDGE_FIELD_NUMBER;
    hash = (53 * hash) + getCartridge();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static MeetingRoomNotificationService.DeviceSupplyRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static MeetingRoomNotificationService.DeviceSupplyRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static MeetingRoomNotificationService.DeviceSupplyRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static MeetingRoomNotificationService.DeviceSupplyRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static MeetingRoomNotificationService.DeviceSupplyRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static MeetingRoomNotificationService.DeviceSupplyRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static MeetingRoomNotificationService.DeviceSupplyRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static MeetingRoomNotificationService.DeviceSupplyRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static MeetingRoomNotificationService.DeviceSupplyRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static MeetingRoomNotificationService.DeviceSupplyRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static MeetingRoomNotificationService.DeviceSupplyRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static MeetingRoomNotificationService.DeviceSupplyRequest parseFrom(
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
  public static Builder newBuilder(MeetingRoomNotificationService.DeviceSupplyRequest prototype) {
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
   * Protobuf type {@code meetingroomnotification.DeviceSupplyRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:meetingroomnotification.DeviceSupplyRequest)
      MeetingRoomNotificationService.DeviceSupplyRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return MeetingRoomNotificationService.MeetingRoomNotificationServiceImpl.internal_static_meetingroomnotification_DeviceSupplyRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return MeetingRoomNotificationService.MeetingRoomNotificationServiceImpl.internal_static_meetingroomnotification_DeviceSupplyRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              MeetingRoomNotificationService.DeviceSupplyRequest.class, MeetingRoomNotificationService.DeviceSupplyRequest.Builder.class);
    }

    // Construct using MeetingRoomNotificationService.DeviceSupplyRequest.newBuilder()
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
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      name_ = "";

      paper_ = 0;

      cartridge_ = 0;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return MeetingRoomNotificationService.MeetingRoomNotificationServiceImpl.internal_static_meetingroomnotification_DeviceSupplyRequest_descriptor;
    }

    @java.lang.Override
    public MeetingRoomNotificationService.DeviceSupplyRequest getDefaultInstanceForType() {
      return MeetingRoomNotificationService.DeviceSupplyRequest.getDefaultInstance();
    }

    @java.lang.Override
    public MeetingRoomNotificationService.DeviceSupplyRequest build() {
      MeetingRoomNotificationService.DeviceSupplyRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public MeetingRoomNotificationService.DeviceSupplyRequest buildPartial() {
      MeetingRoomNotificationService.DeviceSupplyRequest result = new MeetingRoomNotificationService.DeviceSupplyRequest(this);
      result.name_ = name_;
      result.paper_ = paper_;
      result.cartridge_ = cartridge_;
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
      if (other instanceof MeetingRoomNotificationService.DeviceSupplyRequest) {
        return mergeFrom((MeetingRoomNotificationService.DeviceSupplyRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(MeetingRoomNotificationService.DeviceSupplyRequest other) {
      if (other == MeetingRoomNotificationService.DeviceSupplyRequest.getDefaultInstance()) return this;
      if (!other.getName().isEmpty()) {
        name_ = other.name_;
        onChanged();
      }
      if (other.getPaper() != 0) {
        setPaper(other.getPaper());
      }
      if (other.getCartridge() != 0) {
        setCartridge(other.getCartridge());
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
      MeetingRoomNotificationService.DeviceSupplyRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (MeetingRoomNotificationService.DeviceSupplyRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object name_ = "";
    /**
     * <code>string name = 1;</code>
     */
    public java.lang.String getName() {
      java.lang.Object ref = name_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        name_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string name = 1;</code>
     */
    public com.google.protobuf.ByteString
        getNameBytes() {
      java.lang.Object ref = name_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        name_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string name = 1;</code>
     */
    public Builder setName(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      name_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string name = 1;</code>
     */
    public Builder clearName() {
      
      name_ = getDefaultInstance().getName();
      onChanged();
      return this;
    }
    /**
     * <code>string name = 1;</code>
     */
    public Builder setNameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      name_ = value;
      onChanged();
      return this;
    }

    private int paper_ ;
    /**
     * <code>int32 paper = 2;</code>
     */
    public int getPaper() {
      return paper_;
    }
    /**
     * <code>int32 paper = 2;</code>
     */
    public Builder setPaper(int value) {
      
      paper_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 paper = 2;</code>
     */
    public Builder clearPaper() {
      
      paper_ = 0;
      onChanged();
      return this;
    }

    private int cartridge_ ;
    /**
     * <code>int32 cartridge = 3;</code>
     */
    public int getCartridge() {
      return cartridge_;
    }
    /**
     * <code>int32 cartridge = 3;</code>
     */
    public Builder setCartridge(int value) {
      
      cartridge_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 cartridge = 3;</code>
     */
    public Builder clearCartridge() {
      
      cartridge_ = 0;
      onChanged();
      return this;
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


    // @@protoc_insertion_point(builder_scope:meetingroomnotification.DeviceSupplyRequest)
  }

  // @@protoc_insertion_point(class_scope:meetingroomnotification.DeviceSupplyRequest)
  private static final MeetingRoomNotificationService.DeviceSupplyRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new MeetingRoomNotificationService.DeviceSupplyRequest();
  }

  public static MeetingRoomNotificationService.DeviceSupplyRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<DeviceSupplyRequest>
      PARSER = new com.google.protobuf.AbstractParser<DeviceSupplyRequest>() {
    @java.lang.Override
    public DeviceSupplyRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new DeviceSupplyRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<DeviceSupplyRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<DeviceSupplyRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public MeetingRoomNotificationService.DeviceSupplyRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

