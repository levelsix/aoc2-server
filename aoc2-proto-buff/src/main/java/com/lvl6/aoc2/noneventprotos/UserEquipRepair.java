// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: UserEquipRepairProto.proto

package com.lvl6.aoc2.noneventprotos;

public final class UserEquipRepair {
  private UserEquipRepair() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
  }
  public interface UserEquipRepairProtoOrBuilder
      extends com.google.protobuf.MessageOrBuilder {
    
    // optional string userEquipRepairID = 1;
    boolean hasUserEquipRepairID();
    String getUserEquipRepairID();
    
    // optional string userID = 2;
    boolean hasUserID();
    String getUserID();
    
    // optional string equipName = 3;
    boolean hasEquipName();
    String getEquipName();
    
    // optional int32 equipLevel = 4;
    boolean hasEquipLevel();
    int getEquipLevel();
    
    // optional int32 durability = 5;
    boolean hasDurability();
    int getDurability();
    
    // optional int64 expectedStartMillis = 6;
    boolean hasExpectedStartMillis();
    long getExpectedStartMillis();
    
    // optional int64 queuedTimeMillis = 7;
    boolean hasQueuedTimeMillis();
    long getQueuedTimeMillis();
    
    // optional int64 timeAcquired = 8;
    boolean hasTimeAcquired();
    long getTimeAcquired();
    
    // optional int32 levelOfUserWhenAcquired = 9;
    boolean hasLevelOfUserWhenAcquired();
    int getLevelOfUserWhenAcquired();
    
    // optional string dungeonRoomOrChestAcquiredFrom = 10;
    boolean hasDungeonRoomOrChestAcquiredFrom();
    String getDungeonRoomOrChestAcquiredFrom();
  }
  public static final class UserEquipRepairProto extends
      com.google.protobuf.GeneratedMessage
      implements UserEquipRepairProtoOrBuilder {
    // Use UserEquipRepairProto.newBuilder() to construct.
    private UserEquipRepairProto(Builder builder) {
      super(builder);
    }
    private UserEquipRepairProto(boolean noInit) {}
    
    private static final UserEquipRepairProto defaultInstance;
    public static UserEquipRepairProto getDefaultInstance() {
      return defaultInstance;
    }
    
    public UserEquipRepairProto getDefaultInstanceForType() {
      return defaultInstance;
    }
    
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.lvl6.aoc2.noneventprotos.UserEquipRepair.internal_static_proto_UserEquipRepairProto_descriptor;
    }
    
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.lvl6.aoc2.noneventprotos.UserEquipRepair.internal_static_proto_UserEquipRepairProto_fieldAccessorTable;
    }
    
    private int bitField0_;
    // optional string userEquipRepairID = 1;
    public static final int USEREQUIPREPAIRID_FIELD_NUMBER = 1;
    private java.lang.Object userEquipRepairID_;
    public boolean hasUserEquipRepairID() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    public String getUserEquipRepairID() {
      java.lang.Object ref = userEquipRepairID_;
      if (ref instanceof String) {
        return (String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        String s = bs.toStringUtf8();
        if (com.google.protobuf.Internal.isValidUtf8(bs)) {
          userEquipRepairID_ = s;
        }
        return s;
      }
    }
    private com.google.protobuf.ByteString getUserEquipRepairIDBytes() {
      java.lang.Object ref = userEquipRepairID_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8((String) ref);
        userEquipRepairID_ = b;
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
    
    // optional string equipName = 3;
    public static final int EQUIPNAME_FIELD_NUMBER = 3;
    private java.lang.Object equipName_;
    public boolean hasEquipName() {
      return ((bitField0_ & 0x00000004) == 0x00000004);
    }
    public String getEquipName() {
      java.lang.Object ref = equipName_;
      if (ref instanceof String) {
        return (String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        String s = bs.toStringUtf8();
        if (com.google.protobuf.Internal.isValidUtf8(bs)) {
          equipName_ = s;
        }
        return s;
      }
    }
    private com.google.protobuf.ByteString getEquipNameBytes() {
      java.lang.Object ref = equipName_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8((String) ref);
        equipName_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    
    // optional int32 equipLevel = 4;
    public static final int EQUIPLEVEL_FIELD_NUMBER = 4;
    private int equipLevel_;
    public boolean hasEquipLevel() {
      return ((bitField0_ & 0x00000008) == 0x00000008);
    }
    public int getEquipLevel() {
      return equipLevel_;
    }
    
    // optional int32 durability = 5;
    public static final int DURABILITY_FIELD_NUMBER = 5;
    private int durability_;
    public boolean hasDurability() {
      return ((bitField0_ & 0x00000010) == 0x00000010);
    }
    public int getDurability() {
      return durability_;
    }
    
    // optional int64 expectedStartMillis = 6;
    public static final int EXPECTEDSTARTMILLIS_FIELD_NUMBER = 6;
    private long expectedStartMillis_;
    public boolean hasExpectedStartMillis() {
      return ((bitField0_ & 0x00000020) == 0x00000020);
    }
    public long getExpectedStartMillis() {
      return expectedStartMillis_;
    }
    
    // optional int64 queuedTimeMillis = 7;
    public static final int QUEUEDTIMEMILLIS_FIELD_NUMBER = 7;
    private long queuedTimeMillis_;
    public boolean hasQueuedTimeMillis() {
      return ((bitField0_ & 0x00000040) == 0x00000040);
    }
    public long getQueuedTimeMillis() {
      return queuedTimeMillis_;
    }
    
    // optional int64 timeAcquired = 8;
    public static final int TIMEACQUIRED_FIELD_NUMBER = 8;
    private long timeAcquired_;
    public boolean hasTimeAcquired() {
      return ((bitField0_ & 0x00000080) == 0x00000080);
    }
    public long getTimeAcquired() {
      return timeAcquired_;
    }
    
    // optional int32 levelOfUserWhenAcquired = 9;
    public static final int LEVELOFUSERWHENACQUIRED_FIELD_NUMBER = 9;
    private int levelOfUserWhenAcquired_;
    public boolean hasLevelOfUserWhenAcquired() {
      return ((bitField0_ & 0x00000100) == 0x00000100);
    }
    public int getLevelOfUserWhenAcquired() {
      return levelOfUserWhenAcquired_;
    }
    
    // optional string dungeonRoomOrChestAcquiredFrom = 10;
    public static final int DUNGEONROOMORCHESTACQUIREDFROM_FIELD_NUMBER = 10;
    private java.lang.Object dungeonRoomOrChestAcquiredFrom_;
    public boolean hasDungeonRoomOrChestAcquiredFrom() {
      return ((bitField0_ & 0x00000200) == 0x00000200);
    }
    public String getDungeonRoomOrChestAcquiredFrom() {
      java.lang.Object ref = dungeonRoomOrChestAcquiredFrom_;
      if (ref instanceof String) {
        return (String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        String s = bs.toStringUtf8();
        if (com.google.protobuf.Internal.isValidUtf8(bs)) {
          dungeonRoomOrChestAcquiredFrom_ = s;
        }
        return s;
      }
    }
    private com.google.protobuf.ByteString getDungeonRoomOrChestAcquiredFromBytes() {
      java.lang.Object ref = dungeonRoomOrChestAcquiredFrom_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8((String) ref);
        dungeonRoomOrChestAcquiredFrom_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    
    private void initFields() {
      userEquipRepairID_ = "";
      userID_ = "";
      equipName_ = "";
      equipLevel_ = 0;
      durability_ = 0;
      expectedStartMillis_ = 0L;
      queuedTimeMillis_ = 0L;
      timeAcquired_ = 0L;
      levelOfUserWhenAcquired_ = 0;
      dungeonRoomOrChestAcquiredFrom_ = "";
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
        output.writeBytes(1, getUserEquipRepairIDBytes());
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        output.writeBytes(2, getUserIDBytes());
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        output.writeBytes(3, getEquipNameBytes());
      }
      if (((bitField0_ & 0x00000008) == 0x00000008)) {
        output.writeInt32(4, equipLevel_);
      }
      if (((bitField0_ & 0x00000010) == 0x00000010)) {
        output.writeInt32(5, durability_);
      }
      if (((bitField0_ & 0x00000020) == 0x00000020)) {
        output.writeInt64(6, expectedStartMillis_);
      }
      if (((bitField0_ & 0x00000040) == 0x00000040)) {
        output.writeInt64(7, queuedTimeMillis_);
      }
      if (((bitField0_ & 0x00000080) == 0x00000080)) {
        output.writeInt64(8, timeAcquired_);
      }
      if (((bitField0_ & 0x00000100) == 0x00000100)) {
        output.writeInt32(9, levelOfUserWhenAcquired_);
      }
      if (((bitField0_ & 0x00000200) == 0x00000200)) {
        output.writeBytes(10, getDungeonRoomOrChestAcquiredFromBytes());
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
          .computeBytesSize(1, getUserEquipRepairIDBytes());
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(2, getUserIDBytes());
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(3, getEquipNameBytes());
      }
      if (((bitField0_ & 0x00000008) == 0x00000008)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(4, equipLevel_);
      }
      if (((bitField0_ & 0x00000010) == 0x00000010)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(5, durability_);
      }
      if (((bitField0_ & 0x00000020) == 0x00000020)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt64Size(6, expectedStartMillis_);
      }
      if (((bitField0_ & 0x00000040) == 0x00000040)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt64Size(7, queuedTimeMillis_);
      }
      if (((bitField0_ & 0x00000080) == 0x00000080)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt64Size(8, timeAcquired_);
      }
      if (((bitField0_ & 0x00000100) == 0x00000100)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(9, levelOfUserWhenAcquired_);
      }
      if (((bitField0_ & 0x00000200) == 0x00000200)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(10, getDungeonRoomOrChestAcquiredFromBytes());
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
    
    public static com.lvl6.aoc2.noneventprotos.UserEquipRepair.UserEquipRepairProto parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static com.lvl6.aoc2.noneventprotos.UserEquipRepair.UserEquipRepairProto parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static com.lvl6.aoc2.noneventprotos.UserEquipRepair.UserEquipRepairProto parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static com.lvl6.aoc2.noneventprotos.UserEquipRepair.UserEquipRepairProto parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static com.lvl6.aoc2.noneventprotos.UserEquipRepair.UserEquipRepairProto parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static com.lvl6.aoc2.noneventprotos.UserEquipRepair.UserEquipRepairProto parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    public static com.lvl6.aoc2.noneventprotos.UserEquipRepair.UserEquipRepairProto parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      Builder builder = newBuilder();
      if (builder.mergeDelimitedFrom(input)) {
        return builder.buildParsed();
      } else {
        return null;
      }
    }
    public static com.lvl6.aoc2.noneventprotos.UserEquipRepair.UserEquipRepairProto parseDelimitedFrom(
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
    public static com.lvl6.aoc2.noneventprotos.UserEquipRepair.UserEquipRepairProto parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static com.lvl6.aoc2.noneventprotos.UserEquipRepair.UserEquipRepairProto parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    
    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(com.lvl6.aoc2.noneventprotos.UserEquipRepair.UserEquipRepairProto prototype) {
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
       implements com.lvl6.aoc2.noneventprotos.UserEquipRepair.UserEquipRepairProtoOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.lvl6.aoc2.noneventprotos.UserEquipRepair.internal_static_proto_UserEquipRepairProto_descriptor;
      }
      
      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.lvl6.aoc2.noneventprotos.UserEquipRepair.internal_static_proto_UserEquipRepairProto_fieldAccessorTable;
      }
      
      // Construct using com.lvl6.aoc2.noneventprotos.UserEquipRepair.UserEquipRepairProto.newBuilder()
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
        userEquipRepairID_ = "";
        bitField0_ = (bitField0_ & ~0x00000001);
        userID_ = "";
        bitField0_ = (bitField0_ & ~0x00000002);
        equipName_ = "";
        bitField0_ = (bitField0_ & ~0x00000004);
        equipLevel_ = 0;
        bitField0_ = (bitField0_ & ~0x00000008);
        durability_ = 0;
        bitField0_ = (bitField0_ & ~0x00000010);
        expectedStartMillis_ = 0L;
        bitField0_ = (bitField0_ & ~0x00000020);
        queuedTimeMillis_ = 0L;
        bitField0_ = (bitField0_ & ~0x00000040);
        timeAcquired_ = 0L;
        bitField0_ = (bitField0_ & ~0x00000080);
        levelOfUserWhenAcquired_ = 0;
        bitField0_ = (bitField0_ & ~0x00000100);
        dungeonRoomOrChestAcquiredFrom_ = "";
        bitField0_ = (bitField0_ & ~0x00000200);
        return this;
      }
      
      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }
      
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.lvl6.aoc2.noneventprotos.UserEquipRepair.UserEquipRepairProto.getDescriptor();
      }
      
      public com.lvl6.aoc2.noneventprotos.UserEquipRepair.UserEquipRepairProto getDefaultInstanceForType() {
        return com.lvl6.aoc2.noneventprotos.UserEquipRepair.UserEquipRepairProto.getDefaultInstance();
      }
      
      public com.lvl6.aoc2.noneventprotos.UserEquipRepair.UserEquipRepairProto build() {
        com.lvl6.aoc2.noneventprotos.UserEquipRepair.UserEquipRepairProto result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }
      
      private com.lvl6.aoc2.noneventprotos.UserEquipRepair.UserEquipRepairProto buildParsed()
          throws com.google.protobuf.InvalidProtocolBufferException {
        com.lvl6.aoc2.noneventprotos.UserEquipRepair.UserEquipRepairProto result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(
            result).asInvalidProtocolBufferException();
        }
        return result;
      }
      
      public com.lvl6.aoc2.noneventprotos.UserEquipRepair.UserEquipRepairProto buildPartial() {
        com.lvl6.aoc2.noneventprotos.UserEquipRepair.UserEquipRepairProto result = new com.lvl6.aoc2.noneventprotos.UserEquipRepair.UserEquipRepairProto(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.userEquipRepairID_ = userEquipRepairID_;
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000002;
        }
        result.userID_ = userID_;
        if (((from_bitField0_ & 0x00000004) == 0x00000004)) {
          to_bitField0_ |= 0x00000004;
        }
        result.equipName_ = equipName_;
        if (((from_bitField0_ & 0x00000008) == 0x00000008)) {
          to_bitField0_ |= 0x00000008;
        }
        result.equipLevel_ = equipLevel_;
        if (((from_bitField0_ & 0x00000010) == 0x00000010)) {
          to_bitField0_ |= 0x00000010;
        }
        result.durability_ = durability_;
        if (((from_bitField0_ & 0x00000020) == 0x00000020)) {
          to_bitField0_ |= 0x00000020;
        }
        result.expectedStartMillis_ = expectedStartMillis_;
        if (((from_bitField0_ & 0x00000040) == 0x00000040)) {
          to_bitField0_ |= 0x00000040;
        }
        result.queuedTimeMillis_ = queuedTimeMillis_;
        if (((from_bitField0_ & 0x00000080) == 0x00000080)) {
          to_bitField0_ |= 0x00000080;
        }
        result.timeAcquired_ = timeAcquired_;
        if (((from_bitField0_ & 0x00000100) == 0x00000100)) {
          to_bitField0_ |= 0x00000100;
        }
        result.levelOfUserWhenAcquired_ = levelOfUserWhenAcquired_;
        if (((from_bitField0_ & 0x00000200) == 0x00000200)) {
          to_bitField0_ |= 0x00000200;
        }
        result.dungeonRoomOrChestAcquiredFrom_ = dungeonRoomOrChestAcquiredFrom_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }
      
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof com.lvl6.aoc2.noneventprotos.UserEquipRepair.UserEquipRepairProto) {
          return mergeFrom((com.lvl6.aoc2.noneventprotos.UserEquipRepair.UserEquipRepairProto)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }
      
      public Builder mergeFrom(com.lvl6.aoc2.noneventprotos.UserEquipRepair.UserEquipRepairProto other) {
        if (other == com.lvl6.aoc2.noneventprotos.UserEquipRepair.UserEquipRepairProto.getDefaultInstance()) return this;
        if (other.hasUserEquipRepairID()) {
          setUserEquipRepairID(other.getUserEquipRepairID());
        }
        if (other.hasUserID()) {
          setUserID(other.getUserID());
        }
        if (other.hasEquipName()) {
          setEquipName(other.getEquipName());
        }
        if (other.hasEquipLevel()) {
          setEquipLevel(other.getEquipLevel());
        }
        if (other.hasDurability()) {
          setDurability(other.getDurability());
        }
        if (other.hasExpectedStartMillis()) {
          setExpectedStartMillis(other.getExpectedStartMillis());
        }
        if (other.hasQueuedTimeMillis()) {
          setQueuedTimeMillis(other.getQueuedTimeMillis());
        }
        if (other.hasTimeAcquired()) {
          setTimeAcquired(other.getTimeAcquired());
        }
        if (other.hasLevelOfUserWhenAcquired()) {
          setLevelOfUserWhenAcquired(other.getLevelOfUserWhenAcquired());
        }
        if (other.hasDungeonRoomOrChestAcquiredFrom()) {
          setDungeonRoomOrChestAcquiredFrom(other.getDungeonRoomOrChestAcquiredFrom());
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
              userEquipRepairID_ = input.readBytes();
              break;
            }
            case 18: {
              bitField0_ |= 0x00000002;
              userID_ = input.readBytes();
              break;
            }
            case 26: {
              bitField0_ |= 0x00000004;
              equipName_ = input.readBytes();
              break;
            }
            case 32: {
              bitField0_ |= 0x00000008;
              equipLevel_ = input.readInt32();
              break;
            }
            case 40: {
              bitField0_ |= 0x00000010;
              durability_ = input.readInt32();
              break;
            }
            case 48: {
              bitField0_ |= 0x00000020;
              expectedStartMillis_ = input.readInt64();
              break;
            }
            case 56: {
              bitField0_ |= 0x00000040;
              queuedTimeMillis_ = input.readInt64();
              break;
            }
            case 64: {
              bitField0_ |= 0x00000080;
              timeAcquired_ = input.readInt64();
              break;
            }
            case 72: {
              bitField0_ |= 0x00000100;
              levelOfUserWhenAcquired_ = input.readInt32();
              break;
            }
            case 82: {
              bitField0_ |= 0x00000200;
              dungeonRoomOrChestAcquiredFrom_ = input.readBytes();
              break;
            }
          }
        }
      }
      
      private int bitField0_;
      
      // optional string userEquipRepairID = 1;
      private java.lang.Object userEquipRepairID_ = "";
      public boolean hasUserEquipRepairID() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      public String getUserEquipRepairID() {
        java.lang.Object ref = userEquipRepairID_;
        if (!(ref instanceof String)) {
          String s = ((com.google.protobuf.ByteString) ref).toStringUtf8();
          userEquipRepairID_ = s;
          return s;
        } else {
          return (String) ref;
        }
      }
      public Builder setUserEquipRepairID(String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
        userEquipRepairID_ = value;
        onChanged();
        return this;
      }
      public Builder clearUserEquipRepairID() {
        bitField0_ = (bitField0_ & ~0x00000001);
        userEquipRepairID_ = getDefaultInstance().getUserEquipRepairID();
        onChanged();
        return this;
      }
      void setUserEquipRepairID(com.google.protobuf.ByteString value) {
        bitField0_ |= 0x00000001;
        userEquipRepairID_ = value;
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
      
      // optional string equipName = 3;
      private java.lang.Object equipName_ = "";
      public boolean hasEquipName() {
        return ((bitField0_ & 0x00000004) == 0x00000004);
      }
      public String getEquipName() {
        java.lang.Object ref = equipName_;
        if (!(ref instanceof String)) {
          String s = ((com.google.protobuf.ByteString) ref).toStringUtf8();
          equipName_ = s;
          return s;
        } else {
          return (String) ref;
        }
      }
      public Builder setEquipName(String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000004;
        equipName_ = value;
        onChanged();
        return this;
      }
      public Builder clearEquipName() {
        bitField0_ = (bitField0_ & ~0x00000004);
        equipName_ = getDefaultInstance().getEquipName();
        onChanged();
        return this;
      }
      void setEquipName(com.google.protobuf.ByteString value) {
        bitField0_ |= 0x00000004;
        equipName_ = value;
        onChanged();
      }
      
      // optional int32 equipLevel = 4;
      private int equipLevel_ ;
      public boolean hasEquipLevel() {
        return ((bitField0_ & 0x00000008) == 0x00000008);
      }
      public int getEquipLevel() {
        return equipLevel_;
      }
      public Builder setEquipLevel(int value) {
        bitField0_ |= 0x00000008;
        equipLevel_ = value;
        onChanged();
        return this;
      }
      public Builder clearEquipLevel() {
        bitField0_ = (bitField0_ & ~0x00000008);
        equipLevel_ = 0;
        onChanged();
        return this;
      }
      
      // optional int32 durability = 5;
      private int durability_ ;
      public boolean hasDurability() {
        return ((bitField0_ & 0x00000010) == 0x00000010);
      }
      public int getDurability() {
        return durability_;
      }
      public Builder setDurability(int value) {
        bitField0_ |= 0x00000010;
        durability_ = value;
        onChanged();
        return this;
      }
      public Builder clearDurability() {
        bitField0_ = (bitField0_ & ~0x00000010);
        durability_ = 0;
        onChanged();
        return this;
      }
      
      // optional int64 expectedStartMillis = 6;
      private long expectedStartMillis_ ;
      public boolean hasExpectedStartMillis() {
        return ((bitField0_ & 0x00000020) == 0x00000020);
      }
      public long getExpectedStartMillis() {
        return expectedStartMillis_;
      }
      public Builder setExpectedStartMillis(long value) {
        bitField0_ |= 0x00000020;
        expectedStartMillis_ = value;
        onChanged();
        return this;
      }
      public Builder clearExpectedStartMillis() {
        bitField0_ = (bitField0_ & ~0x00000020);
        expectedStartMillis_ = 0L;
        onChanged();
        return this;
      }
      
      // optional int64 queuedTimeMillis = 7;
      private long queuedTimeMillis_ ;
      public boolean hasQueuedTimeMillis() {
        return ((bitField0_ & 0x00000040) == 0x00000040);
      }
      public long getQueuedTimeMillis() {
        return queuedTimeMillis_;
      }
      public Builder setQueuedTimeMillis(long value) {
        bitField0_ |= 0x00000040;
        queuedTimeMillis_ = value;
        onChanged();
        return this;
      }
      public Builder clearQueuedTimeMillis() {
        bitField0_ = (bitField0_ & ~0x00000040);
        queuedTimeMillis_ = 0L;
        onChanged();
        return this;
      }
      
      // optional int64 timeAcquired = 8;
      private long timeAcquired_ ;
      public boolean hasTimeAcquired() {
        return ((bitField0_ & 0x00000080) == 0x00000080);
      }
      public long getTimeAcquired() {
        return timeAcquired_;
      }
      public Builder setTimeAcquired(long value) {
        bitField0_ |= 0x00000080;
        timeAcquired_ = value;
        onChanged();
        return this;
      }
      public Builder clearTimeAcquired() {
        bitField0_ = (bitField0_ & ~0x00000080);
        timeAcquired_ = 0L;
        onChanged();
        return this;
      }
      
      // optional int32 levelOfUserWhenAcquired = 9;
      private int levelOfUserWhenAcquired_ ;
      public boolean hasLevelOfUserWhenAcquired() {
        return ((bitField0_ & 0x00000100) == 0x00000100);
      }
      public int getLevelOfUserWhenAcquired() {
        return levelOfUserWhenAcquired_;
      }
      public Builder setLevelOfUserWhenAcquired(int value) {
        bitField0_ |= 0x00000100;
        levelOfUserWhenAcquired_ = value;
        onChanged();
        return this;
      }
      public Builder clearLevelOfUserWhenAcquired() {
        bitField0_ = (bitField0_ & ~0x00000100);
        levelOfUserWhenAcquired_ = 0;
        onChanged();
        return this;
      }
      
      // optional string dungeonRoomOrChestAcquiredFrom = 10;
      private java.lang.Object dungeonRoomOrChestAcquiredFrom_ = "";
      public boolean hasDungeonRoomOrChestAcquiredFrom() {
        return ((bitField0_ & 0x00000200) == 0x00000200);
      }
      public String getDungeonRoomOrChestAcquiredFrom() {
        java.lang.Object ref = dungeonRoomOrChestAcquiredFrom_;
        if (!(ref instanceof String)) {
          String s = ((com.google.protobuf.ByteString) ref).toStringUtf8();
          dungeonRoomOrChestAcquiredFrom_ = s;
          return s;
        } else {
          return (String) ref;
        }
      }
      public Builder setDungeonRoomOrChestAcquiredFrom(String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000200;
        dungeonRoomOrChestAcquiredFrom_ = value;
        onChanged();
        return this;
      }
      public Builder clearDungeonRoomOrChestAcquiredFrom() {
        bitField0_ = (bitField0_ & ~0x00000200);
        dungeonRoomOrChestAcquiredFrom_ = getDefaultInstance().getDungeonRoomOrChestAcquiredFrom();
        onChanged();
        return this;
      }
      void setDungeonRoomOrChestAcquiredFrom(com.google.protobuf.ByteString value) {
        bitField0_ |= 0x00000200;
        dungeonRoomOrChestAcquiredFrom_ = value;
        onChanged();
      }
      
      // @@protoc_insertion_point(builder_scope:proto.UserEquipRepairProto)
    }
    
    static {
      defaultInstance = new UserEquipRepairProto(true);
      defaultInstance.initFields();
    }
    
    // @@protoc_insertion_point(class_scope:proto.UserEquipRepairProto)
  }
  
  private static com.google.protobuf.Descriptors.Descriptor
    internal_static_proto_UserEquipRepairProto_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_proto_UserEquipRepairProto_fieldAccessorTable;
  
  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\032UserEquipRepairProto.proto\022\005proto\"\222\002\n\024" +
      "UserEquipRepairProto\022\031\n\021userEquipRepairI" +
      "D\030\001 \001(\t\022\016\n\006userID\030\002 \001(\t\022\021\n\tequipName\030\003 \001" +
      "(\t\022\022\n\nequipLevel\030\004 \001(\005\022\022\n\ndurability\030\005 \001" +
      "(\005\022\033\n\023expectedStartMillis\030\006 \001(\003\022\030\n\020queue" +
      "dTimeMillis\030\007 \001(\003\022\024\n\014timeAcquired\030\010 \001(\003\022" +
      "\037\n\027levelOfUserWhenAcquired\030\t \001(\005\022&\n\036dung" +
      "eonRoomOrChestAcquiredFrom\030\n \001(\tB/\n\034com." +
      "lvl6.aoc2.noneventprotosB\017UserEquipRepai" +
      "r"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
      new com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner() {
        public com.google.protobuf.ExtensionRegistry assignDescriptors(
            com.google.protobuf.Descriptors.FileDescriptor root) {
          descriptor = root;
          internal_static_proto_UserEquipRepairProto_descriptor =
            getDescriptor().getMessageTypes().get(0);
          internal_static_proto_UserEquipRepairProto_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessage.FieldAccessorTable(
              internal_static_proto_UserEquipRepairProto_descriptor,
              new java.lang.String[] { "UserEquipRepairID", "UserID", "EquipName", "EquipLevel", "Durability", "ExpectedStartMillis", "QueuedTimeMillis", "TimeAcquired", "LevelOfUserWhenAcquired", "DungeonRoomOrChestAcquiredFrom", },
              com.lvl6.aoc2.noneventprotos.UserEquipRepair.UserEquipRepairProto.class,
              com.lvl6.aoc2.noneventprotos.UserEquipRepair.UserEquipRepairProto.Builder.class);
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
