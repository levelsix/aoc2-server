// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: UserConsumableQueueProto.proto

package com.lvl6.aoc2.noneventprotos;

public final class UserConsumableQueue {
  private UserConsumableQueue() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
  }
  public interface UserConsumableQueueProtoOrBuilder
      extends com.google.protobuf.MessageOrBuilder {
    
    // optional string userConsumableQueueID = 1;
    boolean hasUserConsumableQueueID();
    String getUserConsumableQueueID();
    
    // optional string userID = 2;
    boolean hasUserID();
    String getUserID();
    
    // optional string name = 3;
    boolean hasName();
    String getName();
    
    // optional int32 quantity = 4;
    boolean hasQuantity();
    int getQuantity();
    
    // optional int64 expectedStartMillis = 6;
    boolean hasExpectedStartMillis();
    long getExpectedStartMillis();
    
    // optional int64 queuedTimeMillis = 7;
    boolean hasQueuedTimeMillis();
    long getQueuedTimeMillis();
    
    // optional bool isFinishedBuilding = 8;
    boolean hasIsFinishedBuilding();
    boolean getIsFinishedBuilding();
  }
  public static final class UserConsumableQueueProto extends
      com.google.protobuf.GeneratedMessage
      implements UserConsumableQueueProtoOrBuilder {
    // Use UserConsumableQueueProto.newBuilder() to construct.
    private UserConsumableQueueProto(Builder builder) {
      super(builder);
    }
    private UserConsumableQueueProto(boolean noInit) {}
    
    private static final UserConsumableQueueProto defaultInstance;
    public static UserConsumableQueueProto getDefaultInstance() {
      return defaultInstance;
    }
    
    public UserConsumableQueueProto getDefaultInstanceForType() {
      return defaultInstance;
    }
    
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.lvl6.aoc2.noneventprotos.UserConsumableQueue.internal_static_proto_UserConsumableQueueProto_descriptor;
    }
    
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.lvl6.aoc2.noneventprotos.UserConsumableQueue.internal_static_proto_UserConsumableQueueProto_fieldAccessorTable;
    }
    
    private int bitField0_;
    // optional string userConsumableQueueID = 1;
    public static final int USERCONSUMABLEQUEUEID_FIELD_NUMBER = 1;
    private java.lang.Object userConsumableQueueID_;
    public boolean hasUserConsumableQueueID() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    public String getUserConsumableQueueID() {
      java.lang.Object ref = userConsumableQueueID_;
      if (ref instanceof String) {
        return (String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        String s = bs.toStringUtf8();
        if (com.google.protobuf.Internal.isValidUtf8(bs)) {
          userConsumableQueueID_ = s;
        }
        return s;
      }
    }
    private com.google.protobuf.ByteString getUserConsumableQueueIDBytes() {
      java.lang.Object ref = userConsumableQueueID_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8((String) ref);
        userConsumableQueueID_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    
    // optional string userID = 2;
    public static final int USERID_FIELD_NUMBER = 2;
    private java.lang.Object userID_;
    public boolean hasUserID() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    public String getUserID() {
      java.lang.Object ref = userID_;
      if (ref instanceof String) {
        return (String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        String s = bs.toStringUtf8();
        if (com.google.protobuf.Internal.isValidUtf8(bs)) {
          userID_ = s;
        }
        return s;
      }
    }
    private com.google.protobuf.ByteString getUserIDBytes() {
      java.lang.Object ref = userID_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8((String) ref);
        userID_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    
    // optional string name = 3;
    public static final int NAME_FIELD_NUMBER = 3;
    private java.lang.Object name_;
    public boolean hasName() {
      return ((bitField0_ & 0x00000004) == 0x00000004);
    }
    public String getName() {
      java.lang.Object ref = name_;
      if (ref instanceof String) {
        return (String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        String s = bs.toStringUtf8();
        if (com.google.protobuf.Internal.isValidUtf8(bs)) {
          name_ = s;
        }
        return s;
      }
    }
    private com.google.protobuf.ByteString getNameBytes() {
      java.lang.Object ref = name_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8((String) ref);
        name_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    
    // optional int32 quantity = 4;
    public static final int QUANTITY_FIELD_NUMBER = 4;
    private int quantity_;
    public boolean hasQuantity() {
      return ((bitField0_ & 0x00000008) == 0x00000008);
    }
    public int getQuantity() {
      return quantity_;
    }
    
    // optional int64 expectedStartMillis = 6;
    public static final int EXPECTEDSTARTMILLIS_FIELD_NUMBER = 6;
    private long expectedStartMillis_;
    public boolean hasExpectedStartMillis() {
      return ((bitField0_ & 0x00000010) == 0x00000010);
    }
    public long getExpectedStartMillis() {
      return expectedStartMillis_;
    }
    
    // optional int64 queuedTimeMillis = 7;
    public static final int QUEUEDTIMEMILLIS_FIELD_NUMBER = 7;
    private long queuedTimeMillis_;
    public boolean hasQueuedTimeMillis() {
      return ((bitField0_ & 0x00000020) == 0x00000020);
    }
    public long getQueuedTimeMillis() {
      return queuedTimeMillis_;
    }
    
    // optional bool isFinishedBuilding = 8;
    public static final int ISFINISHEDBUILDING_FIELD_NUMBER = 8;
    private boolean isFinishedBuilding_;
    public boolean hasIsFinishedBuilding() {
      return ((bitField0_ & 0x00000040) == 0x00000040);
    }
    public boolean getIsFinishedBuilding() {
      return isFinishedBuilding_;
    }
    
    private void initFields() {
      userConsumableQueueID_ = "";
      userID_ = "";
      name_ = "";
      quantity_ = 0;
      expectedStartMillis_ = 0L;
      queuedTimeMillis_ = 0L;
      isFinishedBuilding_ = false;
    }
    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized != -1) return isInitialized == 1;
      
      memoizedIsInitialized = 1;
      return true;
    }
    
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      getSerializedSize();
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        output.writeBytes(1, getUserConsumableQueueIDBytes());
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        output.writeBytes(2, getUserIDBytes());
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        output.writeBytes(3, getNameBytes());
      }
      if (((bitField0_ & 0x00000008) == 0x00000008)) {
        output.writeInt32(4, quantity_);
      }
      if (((bitField0_ & 0x00000010) == 0x00000010)) {
        output.writeInt64(6, expectedStartMillis_);
      }
      if (((bitField0_ & 0x00000020) == 0x00000020)) {
        output.writeInt64(7, queuedTimeMillis_);
      }
      if (((bitField0_ & 0x00000040) == 0x00000040)) {
        output.writeBool(8, isFinishedBuilding_);
      }
      getUnknownFields().writeTo(output);
    }
    
    private int memoizedSerializedSize = -1;
    public int getSerializedSize() {
      int size = memoizedSerializedSize;
      if (size != -1) return size;
    
      size = 0;
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(1, getUserConsumableQueueIDBytes());
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(2, getUserIDBytes());
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(3, getNameBytes());
      }
      if (((bitField0_ & 0x00000008) == 0x00000008)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(4, quantity_);
      }
      if (((bitField0_ & 0x00000010) == 0x00000010)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt64Size(6, expectedStartMillis_);
      }
      if (((bitField0_ & 0x00000020) == 0x00000020)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt64Size(7, queuedTimeMillis_);
      }
      if (((bitField0_ & 0x00000040) == 0x00000040)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(8, isFinishedBuilding_);
      }
      size += getUnknownFields().getSerializedSize();
      memoizedSerializedSize = size;
      return size;
    }
    
    private static final long serialVersionUID = 0L;
    @java.lang.Override
    protected java.lang.Object writeReplace()
        throws java.io.ObjectStreamException {
      return super.writeReplace();
    }
    
    public static com.lvl6.aoc2.noneventprotos.UserConsumableQueue.UserConsumableQueueProto parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static com.lvl6.aoc2.noneventprotos.UserConsumableQueue.UserConsumableQueueProto parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static com.lvl6.aoc2.noneventprotos.UserConsumableQueue.UserConsumableQueueProto parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static com.lvl6.aoc2.noneventprotos.UserConsumableQueue.UserConsumableQueueProto parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static com.lvl6.aoc2.noneventprotos.UserConsumableQueue.UserConsumableQueueProto parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static com.lvl6.aoc2.noneventprotos.UserConsumableQueue.UserConsumableQueueProto parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    public static com.lvl6.aoc2.noneventprotos.UserConsumableQueue.UserConsumableQueueProto parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      Builder builder = newBuilder();
      if (builder.mergeDelimitedFrom(input)) {
        return builder.buildParsed();
      } else {
        return null;
      }
    }
    public static com.lvl6.aoc2.noneventprotos.UserConsumableQueue.UserConsumableQueueProto parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      Builder builder = newBuilder();
      if (builder.mergeDelimitedFrom(input, extensionRegistry)) {
        return builder.buildParsed();
      } else {
        return null;
      }
    }
    public static com.lvl6.aoc2.noneventprotos.UserConsumableQueue.UserConsumableQueueProto parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static com.lvl6.aoc2.noneventprotos.UserConsumableQueue.UserConsumableQueueProto parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    
    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(com.lvl6.aoc2.noneventprotos.UserConsumableQueue.UserConsumableQueueProto prototype) {
      return newBuilder().mergeFrom(prototype);
    }
    public Builder toBuilder() { return newBuilder(this); }
    
    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessage.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder>
       implements com.lvl6.aoc2.noneventprotos.UserConsumableQueue.UserConsumableQueueProtoOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.lvl6.aoc2.noneventprotos.UserConsumableQueue.internal_static_proto_UserConsumableQueueProto_descriptor;
      }
      
      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.lvl6.aoc2.noneventprotos.UserConsumableQueue.internal_static_proto_UserConsumableQueueProto_fieldAccessorTable;
      }
      
      // Construct using com.lvl6.aoc2.noneventprotos.UserConsumableQueue.UserConsumableQueueProto.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }
      
      private Builder(BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders) {
        }
      }
      private static Builder create() {
        return new Builder();
      }
      
      public Builder clear() {
        super.clear();
        userConsumableQueueID_ = "";
        bitField0_ = (bitField0_ & ~0x00000001);
        userID_ = "";
        bitField0_ = (bitField0_ & ~0x00000002);
        name_ = "";
        bitField0_ = (bitField0_ & ~0x00000004);
        quantity_ = 0;
        bitField0_ = (bitField0_ & ~0x00000008);
        expectedStartMillis_ = 0L;
        bitField0_ = (bitField0_ & ~0x00000010);
        queuedTimeMillis_ = 0L;
        bitField0_ = (bitField0_ & ~0x00000020);
        isFinishedBuilding_ = false;
        bitField0_ = (bitField0_ & ~0x00000040);
        return this;
      }
      
      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }
      
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.lvl6.aoc2.noneventprotos.UserConsumableQueue.UserConsumableQueueProto.getDescriptor();
      }
      
      public com.lvl6.aoc2.noneventprotos.UserConsumableQueue.UserConsumableQueueProto getDefaultInstanceForType() {
        return com.lvl6.aoc2.noneventprotos.UserConsumableQueue.UserConsumableQueueProto.getDefaultInstance();
      }
      
      public com.lvl6.aoc2.noneventprotos.UserConsumableQueue.UserConsumableQueueProto build() {
        com.lvl6.aoc2.noneventprotos.UserConsumableQueue.UserConsumableQueueProto result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }
      
      private com.lvl6.aoc2.noneventprotos.UserConsumableQueue.UserConsumableQueueProto buildParsed()
          throws com.google.protobuf.InvalidProtocolBufferException {
        com.lvl6.aoc2.noneventprotos.UserConsumableQueue.UserConsumableQueueProto result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(
            result).asInvalidProtocolBufferException();
        }
        return result;
      }
      
      public com.lvl6.aoc2.noneventprotos.UserConsumableQueue.UserConsumableQueueProto buildPartial() {
        com.lvl6.aoc2.noneventprotos.UserConsumableQueue.UserConsumableQueueProto result = new com.lvl6.aoc2.noneventprotos.UserConsumableQueue.UserConsumableQueueProto(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.userConsumableQueueID_ = userConsumableQueueID_;
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000002;
        }
        result.userID_ = userID_;
        if (((from_bitField0_ & 0x00000004) == 0x00000004)) {
          to_bitField0_ |= 0x00000004;
        }
        result.name_ = name_;
        if (((from_bitField0_ & 0x00000008) == 0x00000008)) {
          to_bitField0_ |= 0x00000008;
        }
        result.quantity_ = quantity_;
        if (((from_bitField0_ & 0x00000010) == 0x00000010)) {
          to_bitField0_ |= 0x00000010;
        }
        result.expectedStartMillis_ = expectedStartMillis_;
        if (((from_bitField0_ & 0x00000020) == 0x00000020)) {
          to_bitField0_ |= 0x00000020;
        }
        result.queuedTimeMillis_ = queuedTimeMillis_;
        if (((from_bitField0_ & 0x00000040) == 0x00000040)) {
          to_bitField0_ |= 0x00000040;
        }
        result.isFinishedBuilding_ = isFinishedBuilding_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }
      
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof com.lvl6.aoc2.noneventprotos.UserConsumableQueue.UserConsumableQueueProto) {
          return mergeFrom((com.lvl6.aoc2.noneventprotos.UserConsumableQueue.UserConsumableQueueProto)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }
      
      public Builder mergeFrom(com.lvl6.aoc2.noneventprotos.UserConsumableQueue.UserConsumableQueueProto other) {
        if (other == com.lvl6.aoc2.noneventprotos.UserConsumableQueue.UserConsumableQueueProto.getDefaultInstance()) return this;
        if (other.hasUserConsumableQueueID()) {
          setUserConsumableQueueID(other.getUserConsumableQueueID());
        }
        if (other.hasUserID()) {
          setUserID(other.getUserID());
        }
        if (other.hasName()) {
          setName(other.getName());
        }
        if (other.hasQuantity()) {
          setQuantity(other.getQuantity());
        }
        if (other.hasExpectedStartMillis()) {
          setExpectedStartMillis(other.getExpectedStartMillis());
        }
        if (other.hasQueuedTimeMillis()) {
          setQueuedTimeMillis(other.getQueuedTimeMillis());
        }
        if (other.hasIsFinishedBuilding()) {
          setIsFinishedBuilding(other.getIsFinishedBuilding());
        }
        this.mergeUnknownFields(other.getUnknownFields());
        return this;
      }
      
      public final boolean isInitialized() {
        return true;
      }
      
      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        com.google.protobuf.UnknownFieldSet.Builder unknownFields =
          com.google.protobuf.UnknownFieldSet.newBuilder(
            this.getUnknownFields());
        while (true) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              this.setUnknownFields(unknownFields.build());
              onChanged();
              return this;
            default: {
              if (!parseUnknownField(input, unknownFields,
                                     extensionRegistry, tag)) {
                this.setUnknownFields(unknownFields.build());
                onChanged();
                return this;
              }
              break;
            }
            case 10: {
              bitField0_ |= 0x00000001;
              userConsumableQueueID_ = input.readBytes();
              break;
            }
            case 18: {
              bitField0_ |= 0x00000002;
              userID_ = input.readBytes();
              break;
            }
            case 26: {
              bitField0_ |= 0x00000004;
              name_ = input.readBytes();
              break;
            }
            case 32: {
              bitField0_ |= 0x00000008;
              quantity_ = input.readInt32();
              break;
            }
            case 48: {
              bitField0_ |= 0x00000010;
              expectedStartMillis_ = input.readInt64();
              break;
            }
            case 56: {
              bitField0_ |= 0x00000020;
              queuedTimeMillis_ = input.readInt64();
              break;
            }
            case 64: {
              bitField0_ |= 0x00000040;
              isFinishedBuilding_ = input.readBool();
              break;
            }
          }
        }
      }
      
      private int bitField0_;
      
      // optional string userConsumableQueueID = 1;
      private java.lang.Object userConsumableQueueID_ = "";
      public boolean hasUserConsumableQueueID() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      public String getUserConsumableQueueID() {
        java.lang.Object ref = userConsumableQueueID_;
        if (!(ref instanceof String)) {
          String s = ((com.google.protobuf.ByteString) ref).toStringUtf8();
          userConsumableQueueID_ = s;
          return s;
        } else {
          return (String) ref;
        }
      }
      public Builder setUserConsumableQueueID(String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
        userConsumableQueueID_ = value;
        onChanged();
        return this;
      }
      public Builder clearUserConsumableQueueID() {
        bitField0_ = (bitField0_ & ~0x00000001);
        userConsumableQueueID_ = getDefaultInstance().getUserConsumableQueueID();
        onChanged();
        return this;
      }
      void setUserConsumableQueueID(com.google.protobuf.ByteString value) {
        bitField0_ |= 0x00000001;
        userConsumableQueueID_ = value;
        onChanged();
      }
      
      // optional string userID = 2;
      private java.lang.Object userID_ = "";
      public boolean hasUserID() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }
      public String getUserID() {
        java.lang.Object ref = userID_;
        if (!(ref instanceof String)) {
          String s = ((com.google.protobuf.ByteString) ref).toStringUtf8();
          userID_ = s;
          return s;
        } else {
          return (String) ref;
        }
      }
      public Builder setUserID(String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000002;
        userID_ = value;
        onChanged();
        return this;
      }
      public Builder clearUserID() {
        bitField0_ = (bitField0_ & ~0x00000002);
        userID_ = getDefaultInstance().getUserID();
        onChanged();
        return this;
      }
      void setUserID(com.google.protobuf.ByteString value) {
        bitField0_ |= 0x00000002;
        userID_ = value;
        onChanged();
      }
      
      // optional string name = 3;
      private java.lang.Object name_ = "";
      public boolean hasName() {
        return ((bitField0_ & 0x00000004) == 0x00000004);
      }
      public String getName() {
        java.lang.Object ref = name_;
        if (!(ref instanceof String)) {
          String s = ((com.google.protobuf.ByteString) ref).toStringUtf8();
          name_ = s;
          return s;
        } else {
          return (String) ref;
        }
      }
      public Builder setName(String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000004;
        name_ = value;
        onChanged();
        return this;
      }
      public Builder clearName() {
        bitField0_ = (bitField0_ & ~0x00000004);
        name_ = getDefaultInstance().getName();
        onChanged();
        return this;
      }
      void setName(com.google.protobuf.ByteString value) {
        bitField0_ |= 0x00000004;
        name_ = value;
        onChanged();
      }
      
      // optional int32 quantity = 4;
      private int quantity_ ;
      public boolean hasQuantity() {
        return ((bitField0_ & 0x00000008) == 0x00000008);
      }
      public int getQuantity() {
        return quantity_;
      }
      public Builder setQuantity(int value) {
        bitField0_ |= 0x00000008;
        quantity_ = value;
        onChanged();
        return this;
      }
      public Builder clearQuantity() {
        bitField0_ = (bitField0_ & ~0x00000008);
        quantity_ = 0;
        onChanged();
        return this;
      }
      
      // optional int64 expectedStartMillis = 6;
      private long expectedStartMillis_ ;
      public boolean hasExpectedStartMillis() {
        return ((bitField0_ & 0x00000010) == 0x00000010);
      }
      public long getExpectedStartMillis() {
        return expectedStartMillis_;
      }
      public Builder setExpectedStartMillis(long value) {
        bitField0_ |= 0x00000010;
        expectedStartMillis_ = value;
        onChanged();
        return this;
      }
      public Builder clearExpectedStartMillis() {
        bitField0_ = (bitField0_ & ~0x00000010);
        expectedStartMillis_ = 0L;
        onChanged();
        return this;
      }
      
      // optional int64 queuedTimeMillis = 7;
      private long queuedTimeMillis_ ;
      public boolean hasQueuedTimeMillis() {
        return ((bitField0_ & 0x00000020) == 0x00000020);
      }
      public long getQueuedTimeMillis() {
        return queuedTimeMillis_;
      }
      public Builder setQueuedTimeMillis(long value) {
        bitField0_ |= 0x00000020;
        queuedTimeMillis_ = value;
        onChanged();
        return this;
      }
      public Builder clearQueuedTimeMillis() {
        bitField0_ = (bitField0_ & ~0x00000020);
        queuedTimeMillis_ = 0L;
        onChanged();
        return this;
      }
      
      // optional bool isFinishedBuilding = 8;
      private boolean isFinishedBuilding_ ;
      public boolean hasIsFinishedBuilding() {
        return ((bitField0_ & 0x00000040) == 0x00000040);
      }
      public boolean getIsFinishedBuilding() {
        return isFinishedBuilding_;
      }
      public Builder setIsFinishedBuilding(boolean value) {
        bitField0_ |= 0x00000040;
        isFinishedBuilding_ = value;
        onChanged();
        return this;
      }
      public Builder clearIsFinishedBuilding() {
        bitField0_ = (bitField0_ & ~0x00000040);
        isFinishedBuilding_ = false;
        onChanged();
        return this;
      }
      
      // @@protoc_insertion_point(builder_scope:proto.UserConsumableQueueProto)
    }
    
    static {
      defaultInstance = new UserConsumableQueueProto(true);
      defaultInstance.initFields();
    }
    
    // @@protoc_insertion_point(class_scope:proto.UserConsumableQueueProto)
  }
  
  private static com.google.protobuf.Descriptors.Descriptor
    internal_static_proto_UserConsumableQueueProto_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_proto_UserConsumableQueueProto_fieldAccessorTable;
  
  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\036UserConsumableQueueProto.proto\022\005proto\"" +
      "\274\001\n\030UserConsumableQueueProto\022\035\n\025userCons" +
      "umableQueueID\030\001 \001(\t\022\016\n\006userID\030\002 \001(\t\022\014\n\004n" +
      "ame\030\003 \001(\t\022\020\n\010quantity\030\004 \001(\005\022\033\n\023expectedS" +
      "tartMillis\030\006 \001(\003\022\030\n\020queuedTimeMillis\030\007 \001" +
      "(\003\022\032\n\022isFinishedBuilding\030\010 \001(\010B3\n\034com.lv" +
      "l6.aoc2.noneventprotosB\023UserConsumableQu" +
      "eue"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
      new com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner() {
        public com.google.protobuf.ExtensionRegistry assignDescriptors(
            com.google.protobuf.Descriptors.FileDescriptor root) {
          descriptor = root;
          internal_static_proto_UserConsumableQueueProto_descriptor =
            getDescriptor().getMessageTypes().get(0);
          internal_static_proto_UserConsumableQueueProto_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessage.FieldAccessorTable(
              internal_static_proto_UserConsumableQueueProto_descriptor,
              new java.lang.String[] { "UserConsumableQueueID", "UserID", "Name", "Quantity", "ExpectedStartMillis", "QueuedTimeMillis", "IsFinishedBuilding", },
              com.lvl6.aoc2.noneventprotos.UserConsumableQueue.UserConsumableQueueProto.class,
              com.lvl6.aoc2.noneventprotos.UserConsumableQueue.UserConsumableQueueProto.Builder.class);
          return null;
        }
      };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        }, assigner);
  }
  
  // @@protoc_insertion_point(outer_class_scope)
}
