// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: RoomRewardProto.proto

package com.lvl6.aoc2.proto;

public final class RoomReward {
  private RoomReward() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
  }
  public interface RoomRewardProtoOrBuilder
      extends com.google.protobuf.MessageOrBuilder {

    // optional int32 dungeonID = 1;
    /**
     * <code>optional int32 dungeonID = 1;</code>
     */
    boolean hasDungeonID();
    /**
     * <code>optional int32 dungeonID = 1;</code>
     */
    int getDungeonID();

    // optional int32 roomID = 2;
    /**
     * <code>optional int32 roomID = 2;</code>
     */
    boolean hasRoomID();
    /**
     * <code>optional int32 roomID = 2;</code>
     */
    int getRoomID();

    // optional int32 chestID = 3;
    /**
     * <code>optional int32 chestID = 3;</code>
     */
    boolean hasChestID();
    /**
     * <code>optional int32 chestID = 3;</code>
     */
    int getChestID();

    // optional int32 chestDropChance = 4;
    /**
     * <code>optional int32 chestDropChance = 4;</code>
     */
    boolean hasChestDropChance();
    /**
     * <code>optional int32 chestDropChance = 4;</code>
     */
    int getChestDropChance();

    // repeated int32 equipIDs = 5;
    /**
     * <code>repeated int32 equipIDs = 5;</code>
     */
    java.util.List<java.lang.Integer> getEquipIDsList();
    /**
     * <code>repeated int32 equipIDs = 5;</code>
     */
    int getEquipIDsCount();
    /**
     * <code>repeated int32 equipIDs = 5;</code>
     */
    int getEquipIDs(int index);

    // optional int32 equipDropChance = 6;
    /**
     * <code>optional int32 equipDropChance = 6;</code>
     */
    boolean hasEquipDropChance();
    /**
     * <code>optional int32 equipDropChance = 6;</code>
     */
    int getEquipDropChance();
  }
  /**
   * Protobuf type {@code com.lvl6.aoc2.proto.RoomRewardProto}
   */
  public static final class RoomRewardProto extends
      com.google.protobuf.GeneratedMessage
      implements RoomRewardProtoOrBuilder {
    // Use RoomRewardProto.newBuilder() to construct.
    private RoomRewardProto(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
      super(builder);
      this.unknownFields = builder.getUnknownFields();
    }
    private RoomRewardProto(boolean noInit) { this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance(); }

    private static final RoomRewardProto defaultInstance;
    public static RoomRewardProto getDefaultInstance() {
      return defaultInstance;
    }

    public RoomRewardProto getDefaultInstanceForType() {
      return defaultInstance;
    }

    private final com.google.protobuf.UnknownFieldSet unknownFields;
    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
        getUnknownFields() {
      return this.unknownFields;
    }
    private RoomRewardProto(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      initFields();
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
            default: {
              if (!parseUnknownField(input, unknownFields,
                                     extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
            case 8: {
              bitField0_ |= 0x00000001;
              dungeonID_ = input.readInt32();
              break;
            }
            case 16: {
              bitField0_ |= 0x00000002;
              roomID_ = input.readInt32();
              break;
            }
            case 24: {
              bitField0_ |= 0x00000004;
              chestID_ = input.readInt32();
              break;
            }
            case 32: {
              bitField0_ |= 0x00000008;
              chestDropChance_ = input.readInt32();
              break;
            }
            case 40: {
              if (!((mutable_bitField0_ & 0x00000010) == 0x00000010)) {
                equipIDs_ = new java.util.ArrayList<java.lang.Integer>();
                mutable_bitField0_ |= 0x00000010;
              }
              equipIDs_.add(input.readInt32());
              break;
            }
            case 42: {
              int length = input.readRawVarint32();
              int limit = input.pushLimit(length);
              if (!((mutable_bitField0_ & 0x00000010) == 0x00000010) && input.getBytesUntilLimit() > 0) {
                equipIDs_ = new java.util.ArrayList<java.lang.Integer>();
                mutable_bitField0_ |= 0x00000010;
              }
              while (input.getBytesUntilLimit() > 0) {
                equipIDs_.add(input.readInt32());
              }
              input.popLimit(limit);
              break;
            }
            case 48: {
              bitField0_ |= 0x00000010;
              equipDropChance_ = input.readInt32();
              break;
            }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(
            e.getMessage()).setUnfinishedMessage(this);
      } finally {
        if (((mutable_bitField0_ & 0x00000010) == 0x00000010)) {
          equipIDs_ = java.util.Collections.unmodifiableList(equipIDs_);
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.lvl6.aoc2.proto.RoomReward.internal_static_com_lvl6_aoc2_proto_RoomRewardProto_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.lvl6.aoc2.proto.RoomReward.internal_static_com_lvl6_aoc2_proto_RoomRewardProto_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.lvl6.aoc2.proto.RoomReward.RoomRewardProto.class, com.lvl6.aoc2.proto.RoomReward.RoomRewardProto.Builder.class);
    }

    public static com.google.protobuf.Parser<RoomRewardProto> PARSER =
        new com.google.protobuf.AbstractParser<RoomRewardProto>() {
      public RoomRewardProto parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new RoomRewardProto(input, extensionRegistry);
      }
    };

    @java.lang.Override
    public com.google.protobuf.Parser<RoomRewardProto> getParserForType() {
      return PARSER;
    }

    private int bitField0_;
    // optional int32 dungeonID = 1;
    public static final int DUNGEONID_FIELD_NUMBER = 1;
    private int dungeonID_;
    /**
     * <code>optional int32 dungeonID = 1;</code>
     */
    public boolean hasDungeonID() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     * <code>optional int32 dungeonID = 1;</code>
     */
    public int getDungeonID() {
      return dungeonID_;
    }

    // optional int32 roomID = 2;
    public static final int ROOMID_FIELD_NUMBER = 2;
    private int roomID_;
    /**
     * <code>optional int32 roomID = 2;</code>
     */
    public boolean hasRoomID() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    /**
     * <code>optional int32 roomID = 2;</code>
     */
    public int getRoomID() {
      return roomID_;
    }

    // optional int32 chestID = 3;
    public static final int CHESTID_FIELD_NUMBER = 3;
    private int chestID_;
    /**
     * <code>optional int32 chestID = 3;</code>
     */
    public boolean hasChestID() {
      return ((bitField0_ & 0x00000004) == 0x00000004);
    }
    /**
     * <code>optional int32 chestID = 3;</code>
     */
    public int getChestID() {
      return chestID_;
    }

    // optional int32 chestDropChance = 4;
    public static final int CHESTDROPCHANCE_FIELD_NUMBER = 4;
    private int chestDropChance_;
    /**
     * <code>optional int32 chestDropChance = 4;</code>
     */
    public boolean hasChestDropChance() {
      return ((bitField0_ & 0x00000008) == 0x00000008);
    }
    /**
     * <code>optional int32 chestDropChance = 4;</code>
     */
    public int getChestDropChance() {
      return chestDropChance_;
    }

    // repeated int32 equipIDs = 5;
    public static final int EQUIPIDS_FIELD_NUMBER = 5;
    private java.util.List<java.lang.Integer> equipIDs_;
    /**
     * <code>repeated int32 equipIDs = 5;</code>
     */
    public java.util.List<java.lang.Integer>
        getEquipIDsList() {
      return equipIDs_;
    }
    /**
     * <code>repeated int32 equipIDs = 5;</code>
     */
    public int getEquipIDsCount() {
      return equipIDs_.size();
    }
    /**
     * <code>repeated int32 equipIDs = 5;</code>
     */
    public int getEquipIDs(int index) {
      return equipIDs_.get(index);
    }

    // optional int32 equipDropChance = 6;
    public static final int EQUIPDROPCHANCE_FIELD_NUMBER = 6;
    private int equipDropChance_;
    /**
     * <code>optional int32 equipDropChance = 6;</code>
     */
    public boolean hasEquipDropChance() {
      return ((bitField0_ & 0x00000010) == 0x00000010);
    }
    /**
     * <code>optional int32 equipDropChance = 6;</code>
     */
    public int getEquipDropChance() {
      return equipDropChance_;
    }

    private void initFields() {
      dungeonID_ = 0;
      roomID_ = 0;
      chestID_ = 0;
      chestDropChance_ = 0;
      equipIDs_ = java.util.Collections.emptyList();
      equipDropChance_ = 0;
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
        output.writeInt32(1, dungeonID_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        output.writeInt32(2, roomID_);
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        output.writeInt32(3, chestID_);
      }
      if (((bitField0_ & 0x00000008) == 0x00000008)) {
        output.writeInt32(4, chestDropChance_);
      }
      for (int i = 0; i < equipIDs_.size(); i++) {
        output.writeInt32(5, equipIDs_.get(i));
      }
      if (((bitField0_ & 0x00000010) == 0x00000010)) {
        output.writeInt32(6, equipDropChance_);
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
          .computeInt32Size(1, dungeonID_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(2, roomID_);
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(3, chestID_);
      }
      if (((bitField0_ & 0x00000008) == 0x00000008)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(4, chestDropChance_);
      }
      {
        int dataSize = 0;
        for (int i = 0; i < equipIDs_.size(); i++) {
          dataSize += com.google.protobuf.CodedOutputStream
            .computeInt32SizeNoTag(equipIDs_.get(i));
        }
        size += dataSize;
        size += 1 * getEquipIDsList().size();
      }
      if (((bitField0_ & 0x00000010) == 0x00000010)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(6, equipDropChance_);
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

    public static com.lvl6.aoc2.proto.RoomReward.RoomRewardProto parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.lvl6.aoc2.proto.RoomReward.RoomRewardProto parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.lvl6.aoc2.proto.RoomReward.RoomRewardProto parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.lvl6.aoc2.proto.RoomReward.RoomRewardProto parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.lvl6.aoc2.proto.RoomReward.RoomRewardProto parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static com.lvl6.aoc2.proto.RoomReward.RoomRewardProto parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }
    public static com.lvl6.aoc2.proto.RoomReward.RoomRewardProto parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input);
    }
    public static com.lvl6.aoc2.proto.RoomReward.RoomRewardProto parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input, extensionRegistry);
    }
    public static com.lvl6.aoc2.proto.RoomReward.RoomRewardProto parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static com.lvl6.aoc2.proto.RoomReward.RoomRewardProto parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }

    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(com.lvl6.aoc2.proto.RoomReward.RoomRewardProto prototype) {
      return newBuilder().mergeFrom(prototype);
    }
    public Builder toBuilder() { return newBuilder(this); }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessage.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * Protobuf type {@code com.lvl6.aoc2.proto.RoomRewardProto}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder>
       implements com.lvl6.aoc2.proto.RoomReward.RoomRewardProtoOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.lvl6.aoc2.proto.RoomReward.internal_static_com_lvl6_aoc2_proto_RoomRewardProto_descriptor;
      }

      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.lvl6.aoc2.proto.RoomReward.internal_static_com_lvl6_aoc2_proto_RoomRewardProto_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                com.lvl6.aoc2.proto.RoomReward.RoomRewardProto.class, com.lvl6.aoc2.proto.RoomReward.RoomRewardProto.Builder.class);
      }

      // Construct using com.lvl6.aoc2.proto.RoomReward.RoomRewardProto.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          com.google.protobuf.GeneratedMessage.BuilderParent parent) {
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
        dungeonID_ = 0;
        bitField0_ = (bitField0_ & ~0x00000001);
        roomID_ = 0;
        bitField0_ = (bitField0_ & ~0x00000002);
        chestID_ = 0;
        bitField0_ = (bitField0_ & ~0x00000004);
        chestDropChance_ = 0;
        bitField0_ = (bitField0_ & ~0x00000008);
        equipIDs_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000010);
        equipDropChance_ = 0;
        bitField0_ = (bitField0_ & ~0x00000020);
        return this;
      }

      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.lvl6.aoc2.proto.RoomReward.internal_static_com_lvl6_aoc2_proto_RoomRewardProto_descriptor;
      }

      public com.lvl6.aoc2.proto.RoomReward.RoomRewardProto getDefaultInstanceForType() {
        return com.lvl6.aoc2.proto.RoomReward.RoomRewardProto.getDefaultInstance();
      }

      public com.lvl6.aoc2.proto.RoomReward.RoomRewardProto build() {
        com.lvl6.aoc2.proto.RoomReward.RoomRewardProto result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public com.lvl6.aoc2.proto.RoomReward.RoomRewardProto buildPartial() {
        com.lvl6.aoc2.proto.RoomReward.RoomRewardProto result = new com.lvl6.aoc2.proto.RoomReward.RoomRewardProto(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.dungeonID_ = dungeonID_;
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000002;
        }
        result.roomID_ = roomID_;
        if (((from_bitField0_ & 0x00000004) == 0x00000004)) {
          to_bitField0_ |= 0x00000004;
        }
        result.chestID_ = chestID_;
        if (((from_bitField0_ & 0x00000008) == 0x00000008)) {
          to_bitField0_ |= 0x00000008;
        }
        result.chestDropChance_ = chestDropChance_;
        if (((bitField0_ & 0x00000010) == 0x00000010)) {
          equipIDs_ = java.util.Collections.unmodifiableList(equipIDs_);
          bitField0_ = (bitField0_ & ~0x00000010);
        }
        result.equipIDs_ = equipIDs_;
        if (((from_bitField0_ & 0x00000020) == 0x00000020)) {
          to_bitField0_ |= 0x00000010;
        }
        result.equipDropChance_ = equipDropChance_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof com.lvl6.aoc2.proto.RoomReward.RoomRewardProto) {
          return mergeFrom((com.lvl6.aoc2.proto.RoomReward.RoomRewardProto)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(com.lvl6.aoc2.proto.RoomReward.RoomRewardProto other) {
        if (other == com.lvl6.aoc2.proto.RoomReward.RoomRewardProto.getDefaultInstance()) return this;
        if (other.hasDungeonID()) {
          setDungeonID(other.getDungeonID());
        }
        if (other.hasRoomID()) {
          setRoomID(other.getRoomID());
        }
        if (other.hasChestID()) {
          setChestID(other.getChestID());
        }
        if (other.hasChestDropChance()) {
          setChestDropChance(other.getChestDropChance());
        }
        if (!other.equipIDs_.isEmpty()) {
          if (equipIDs_.isEmpty()) {
            equipIDs_ = other.equipIDs_;
            bitField0_ = (bitField0_ & ~0x00000010);
          } else {
            ensureEquipIDsIsMutable();
            equipIDs_.addAll(other.equipIDs_);
          }
          onChanged();
        }
        if (other.hasEquipDropChance()) {
          setEquipDropChance(other.getEquipDropChance());
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
        com.lvl6.aoc2.proto.RoomReward.RoomRewardProto parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (com.lvl6.aoc2.proto.RoomReward.RoomRewardProto) e.getUnfinishedMessage();
          throw e;
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      // optional int32 dungeonID = 1;
      private int dungeonID_ ;
      /**
       * <code>optional int32 dungeonID = 1;</code>
       */
      public boolean hasDungeonID() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      /**
       * <code>optional int32 dungeonID = 1;</code>
       */
      public int getDungeonID() {
        return dungeonID_;
      }
      /**
       * <code>optional int32 dungeonID = 1;</code>
       */
      public Builder setDungeonID(int value) {
        bitField0_ |= 0x00000001;
        dungeonID_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional int32 dungeonID = 1;</code>
       */
      public Builder clearDungeonID() {
        bitField0_ = (bitField0_ & ~0x00000001);
        dungeonID_ = 0;
        onChanged();
        return this;
      }

      // optional int32 roomID = 2;
      private int roomID_ ;
      /**
       * <code>optional int32 roomID = 2;</code>
       */
      public boolean hasRoomID() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }
      /**
       * <code>optional int32 roomID = 2;</code>
       */
      public int getRoomID() {
        return roomID_;
      }
      /**
       * <code>optional int32 roomID = 2;</code>
       */
      public Builder setRoomID(int value) {
        bitField0_ |= 0x00000002;
        roomID_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional int32 roomID = 2;</code>
       */
      public Builder clearRoomID() {
        bitField0_ = (bitField0_ & ~0x00000002);
        roomID_ = 0;
        onChanged();
        return this;
      }

      // optional int32 chestID = 3;
      private int chestID_ ;
      /**
       * <code>optional int32 chestID = 3;</code>
       */
      public boolean hasChestID() {
        return ((bitField0_ & 0x00000004) == 0x00000004);
      }
      /**
       * <code>optional int32 chestID = 3;</code>
       */
      public int getChestID() {
        return chestID_;
      }
      /**
       * <code>optional int32 chestID = 3;</code>
       */
      public Builder setChestID(int value) {
        bitField0_ |= 0x00000004;
        chestID_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional int32 chestID = 3;</code>
       */
      public Builder clearChestID() {
        bitField0_ = (bitField0_ & ~0x00000004);
        chestID_ = 0;
        onChanged();
        return this;
      }

      // optional int32 chestDropChance = 4;
      private int chestDropChance_ ;
      /**
       * <code>optional int32 chestDropChance = 4;</code>
       */
      public boolean hasChestDropChance() {
        return ((bitField0_ & 0x00000008) == 0x00000008);
      }
      /**
       * <code>optional int32 chestDropChance = 4;</code>
       */
      public int getChestDropChance() {
        return chestDropChance_;
      }
      /**
       * <code>optional int32 chestDropChance = 4;</code>
       */
      public Builder setChestDropChance(int value) {
        bitField0_ |= 0x00000008;
        chestDropChance_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional int32 chestDropChance = 4;</code>
       */
      public Builder clearChestDropChance() {
        bitField0_ = (bitField0_ & ~0x00000008);
        chestDropChance_ = 0;
        onChanged();
        return this;
      }

      // repeated int32 equipIDs = 5;
      private java.util.List<java.lang.Integer> equipIDs_ = java.util.Collections.emptyList();
      private void ensureEquipIDsIsMutable() {
        if (!((bitField0_ & 0x00000010) == 0x00000010)) {
          equipIDs_ = new java.util.ArrayList<java.lang.Integer>(equipIDs_);
          bitField0_ |= 0x00000010;
         }
      }
      /**
       * <code>repeated int32 equipIDs = 5;</code>
       */
      public java.util.List<java.lang.Integer>
          getEquipIDsList() {
        return java.util.Collections.unmodifiableList(equipIDs_);
      }
      /**
       * <code>repeated int32 equipIDs = 5;</code>
       */
      public int getEquipIDsCount() {
        return equipIDs_.size();
      }
      /**
       * <code>repeated int32 equipIDs = 5;</code>
       */
      public int getEquipIDs(int index) {
        return equipIDs_.get(index);
      }
      /**
       * <code>repeated int32 equipIDs = 5;</code>
       */
      public Builder setEquipIDs(
          int index, int value) {
        ensureEquipIDsIsMutable();
        equipIDs_.set(index, value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated int32 equipIDs = 5;</code>
       */
      public Builder addEquipIDs(int value) {
        ensureEquipIDsIsMutable();
        equipIDs_.add(value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated int32 equipIDs = 5;</code>
       */
      public Builder addAllEquipIDs(
          java.lang.Iterable<? extends java.lang.Integer> values) {
        ensureEquipIDsIsMutable();
        super.addAll(values, equipIDs_);
        onChanged();
        return this;
      }
      /**
       * <code>repeated int32 equipIDs = 5;</code>
       */
      public Builder clearEquipIDs() {
        equipIDs_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000010);
        onChanged();
        return this;
      }

      // optional int32 equipDropChance = 6;
      private int equipDropChance_ ;
      /**
       * <code>optional int32 equipDropChance = 6;</code>
       */
      public boolean hasEquipDropChance() {
        return ((bitField0_ & 0x00000020) == 0x00000020);
      }
      /**
       * <code>optional int32 equipDropChance = 6;</code>
       */
      public int getEquipDropChance() {
        return equipDropChance_;
      }
      /**
       * <code>optional int32 equipDropChance = 6;</code>
       */
      public Builder setEquipDropChance(int value) {
        bitField0_ |= 0x00000020;
        equipDropChance_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional int32 equipDropChance = 6;</code>
       */
      public Builder clearEquipDropChance() {
        bitField0_ = (bitField0_ & ~0x00000020);
        equipDropChance_ = 0;
        onChanged();
        return this;
      }

      // @@protoc_insertion_point(builder_scope:com.lvl6.aoc2.proto.RoomRewardProto)
    }

    static {
      defaultInstance = new RoomRewardProto(true);
      defaultInstance.initFields();
    }

    // @@protoc_insertion_point(class_scope:com.lvl6.aoc2.proto.RoomRewardProto)
  }

  private static com.google.protobuf.Descriptors.Descriptor
    internal_static_com_lvl6_aoc2_proto_RoomRewardProto_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_com_lvl6_aoc2_proto_RoomRewardProto_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\025RoomRewardProto.proto\022\023com.lvl6.aoc2.p" +
      "roto\"\211\001\n\017RoomRewardProto\022\021\n\tdungeonID\030\001 " +
      "\001(\005\022\016\n\006roomID\030\002 \001(\005\022\017\n\007chestID\030\003 \001(\005\022\027\n\017" +
      "chestDropChance\030\004 \001(\005\022\020\n\010equipIDs\030\005 \003(\005\022" +
      "\027\n\017equipDropChance\030\006 \001(\005B\014B\nRoomReward"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
      new com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner() {
        public com.google.protobuf.ExtensionRegistry assignDescriptors(
            com.google.protobuf.Descriptors.FileDescriptor root) {
          descriptor = root;
          internal_static_com_lvl6_aoc2_proto_RoomRewardProto_descriptor =
            getDescriptor().getMessageTypes().get(0);
          internal_static_com_lvl6_aoc2_proto_RoomRewardProto_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessage.FieldAccessorTable(
              internal_static_com_lvl6_aoc2_proto_RoomRewardProto_descriptor,
              new java.lang.String[] { "DungeonID", "RoomID", "ChestID", "ChestDropChance", "EquipIDs", "EquipDropChance", });
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
