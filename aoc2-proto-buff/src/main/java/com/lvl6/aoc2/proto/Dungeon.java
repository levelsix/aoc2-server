// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: DungeonProto.proto

package com.lvl6.aoc2.proto;

public final class Dungeon {
  private Dungeon() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
  }
  public interface DungeonProtoOrBuilder
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

    // optional int32 levelReq = 2;
    /**
     * <code>optional int32 levelReq = 2;</code>
     */
    boolean hasLevelReq();
    /**
     * <code>optional int32 levelReq = 2;</code>
     */
    int getLevelReq();

    // repeated int32 rooms = 3;
    /**
     * <code>repeated int32 rooms = 3;</code>
     */
    java.util.List<java.lang.Integer> getRoomsList();
    /**
     * <code>repeated int32 rooms = 3;</code>
     */
    int getRoomsCount();
    /**
     * <code>repeated int32 rooms = 3;</code>
     */
    int getRooms(int index);

    // optional string name = 4;
    /**
     * <code>optional string name = 4;</code>
     */
    boolean hasName();
    /**
     * <code>optional string name = 4;</code>
     */
    java.lang.String getName();
    /**
     * <code>optional string name = 4;</code>
     */
    com.google.protobuf.ByteString
        getNameBytes();
  }
  /**
   * Protobuf type {@code com.lvl6.aoc2.proto.DungeonProto}
   */
  public static final class DungeonProto extends
      com.google.protobuf.GeneratedMessage
      implements DungeonProtoOrBuilder {
    // Use DungeonProto.newBuilder() to construct.
    private DungeonProto(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
      super(builder);
      this.unknownFields = builder.getUnknownFields();
    }
    private DungeonProto(boolean noInit) { this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance(); }

    private static final DungeonProto defaultInstance;
    public static DungeonProto getDefaultInstance() {
      return defaultInstance;
    }

    public DungeonProto getDefaultInstanceForType() {
      return defaultInstance;
    }

    private final com.google.protobuf.UnknownFieldSet unknownFields;
    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
        getUnknownFields() {
      return this.unknownFields;
    }
    private DungeonProto(
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
              levelReq_ = input.readInt32();
              break;
            }
            case 24: {
              if (!((mutable_bitField0_ & 0x00000004) == 0x00000004)) {
                rooms_ = new java.util.ArrayList<java.lang.Integer>();
                mutable_bitField0_ |= 0x00000004;
              }
              rooms_.add(input.readInt32());
              break;
            }
            case 26: {
              int length = input.readRawVarint32();
              int limit = input.pushLimit(length);
              if (!((mutable_bitField0_ & 0x00000004) == 0x00000004) && input.getBytesUntilLimit() > 0) {
                rooms_ = new java.util.ArrayList<java.lang.Integer>();
                mutable_bitField0_ |= 0x00000004;
              }
              while (input.getBytesUntilLimit() > 0) {
                rooms_.add(input.readInt32());
              }
              input.popLimit(limit);
              break;
            }
            case 34: {
              bitField0_ |= 0x00000004;
              name_ = input.readBytes();
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
        if (((mutable_bitField0_ & 0x00000004) == 0x00000004)) {
          rooms_ = java.util.Collections.unmodifiableList(rooms_);
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.lvl6.aoc2.proto.Dungeon.internal_static_com_lvl6_aoc2_proto_DungeonProto_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.lvl6.aoc2.proto.Dungeon.internal_static_com_lvl6_aoc2_proto_DungeonProto_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.lvl6.aoc2.proto.Dungeon.DungeonProto.class, com.lvl6.aoc2.proto.Dungeon.DungeonProto.Builder.class);
    }

    public static com.google.protobuf.Parser<DungeonProto> PARSER =
        new com.google.protobuf.AbstractParser<DungeonProto>() {
      public DungeonProto parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new DungeonProto(input, extensionRegistry);
      }
    };

    @java.lang.Override
    public com.google.protobuf.Parser<DungeonProto> getParserForType() {
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

    // optional int32 levelReq = 2;
    public static final int LEVELREQ_FIELD_NUMBER = 2;
    private int levelReq_;
    /**
     * <code>optional int32 levelReq = 2;</code>
     */
    public boolean hasLevelReq() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    /**
     * <code>optional int32 levelReq = 2;</code>
     */
    public int getLevelReq() {
      return levelReq_;
    }

    // repeated int32 rooms = 3;
    public static final int ROOMS_FIELD_NUMBER = 3;
    private java.util.List<java.lang.Integer> rooms_;
    /**
     * <code>repeated int32 rooms = 3;</code>
     */
    public java.util.List<java.lang.Integer>
        getRoomsList() {
      return rooms_;
    }
    /**
     * <code>repeated int32 rooms = 3;</code>
     */
    public int getRoomsCount() {
      return rooms_.size();
    }
    /**
     * <code>repeated int32 rooms = 3;</code>
     */
    public int getRooms(int index) {
      return rooms_.get(index);
    }

    // optional string name = 4;
    public static final int NAME_FIELD_NUMBER = 4;
    private java.lang.Object name_;
    /**
     * <code>optional string name = 4;</code>
     */
    public boolean hasName() {
      return ((bitField0_ & 0x00000004) == 0x00000004);
    }
    /**
     * <code>optional string name = 4;</code>
     */
    public java.lang.String getName() {
      java.lang.Object ref = name_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          name_ = s;
        }
        return s;
      }
    }
    /**
     * <code>optional string name = 4;</code>
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

    private void initFields() {
      dungeonID_ = 0;
      levelReq_ = 0;
      rooms_ = java.util.Collections.emptyList();
      name_ = "";
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
        output.writeInt32(2, levelReq_);
      }
      for (int i = 0; i < rooms_.size(); i++) {
        output.writeInt32(3, rooms_.get(i));
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        output.writeBytes(4, getNameBytes());
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
          .computeInt32Size(2, levelReq_);
      }
      {
        int dataSize = 0;
        for (int i = 0; i < rooms_.size(); i++) {
          dataSize += com.google.protobuf.CodedOutputStream
            .computeInt32SizeNoTag(rooms_.get(i));
        }
        size += dataSize;
        size += 1 * getRoomsList().size();
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(4, getNameBytes());
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

    public static com.lvl6.aoc2.proto.Dungeon.DungeonProto parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.lvl6.aoc2.proto.Dungeon.DungeonProto parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.lvl6.aoc2.proto.Dungeon.DungeonProto parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.lvl6.aoc2.proto.Dungeon.DungeonProto parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.lvl6.aoc2.proto.Dungeon.DungeonProto parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static com.lvl6.aoc2.proto.Dungeon.DungeonProto parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }
    public static com.lvl6.aoc2.proto.Dungeon.DungeonProto parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input);
    }
    public static com.lvl6.aoc2.proto.Dungeon.DungeonProto parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input, extensionRegistry);
    }
    public static com.lvl6.aoc2.proto.Dungeon.DungeonProto parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static com.lvl6.aoc2.proto.Dungeon.DungeonProto parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }

    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(com.lvl6.aoc2.proto.Dungeon.DungeonProto prototype) {
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
     * Protobuf type {@code com.lvl6.aoc2.proto.DungeonProto}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder>
       implements com.lvl6.aoc2.proto.Dungeon.DungeonProtoOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.lvl6.aoc2.proto.Dungeon.internal_static_com_lvl6_aoc2_proto_DungeonProto_descriptor;
      }

      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.lvl6.aoc2.proto.Dungeon.internal_static_com_lvl6_aoc2_proto_DungeonProto_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                com.lvl6.aoc2.proto.Dungeon.DungeonProto.class, com.lvl6.aoc2.proto.Dungeon.DungeonProto.Builder.class);
      }

      // Construct using com.lvl6.aoc2.proto.Dungeon.DungeonProto.newBuilder()
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
        levelReq_ = 0;
        bitField0_ = (bitField0_ & ~0x00000002);
        rooms_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000004);
        name_ = "";
        bitField0_ = (bitField0_ & ~0x00000008);
        return this;
      }

      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.lvl6.aoc2.proto.Dungeon.internal_static_com_lvl6_aoc2_proto_DungeonProto_descriptor;
      }

      public com.lvl6.aoc2.proto.Dungeon.DungeonProto getDefaultInstanceForType() {
        return com.lvl6.aoc2.proto.Dungeon.DungeonProto.getDefaultInstance();
      }

      public com.lvl6.aoc2.proto.Dungeon.DungeonProto build() {
        com.lvl6.aoc2.proto.Dungeon.DungeonProto result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public com.lvl6.aoc2.proto.Dungeon.DungeonProto buildPartial() {
        com.lvl6.aoc2.proto.Dungeon.DungeonProto result = new com.lvl6.aoc2.proto.Dungeon.DungeonProto(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.dungeonID_ = dungeonID_;
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000002;
        }
        result.levelReq_ = levelReq_;
        if (((bitField0_ & 0x00000004) == 0x00000004)) {
          rooms_ = java.util.Collections.unmodifiableList(rooms_);
          bitField0_ = (bitField0_ & ~0x00000004);
        }
        result.rooms_ = rooms_;
        if (((from_bitField0_ & 0x00000008) == 0x00000008)) {
          to_bitField0_ |= 0x00000004;
        }
        result.name_ = name_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof com.lvl6.aoc2.proto.Dungeon.DungeonProto) {
          return mergeFrom((com.lvl6.aoc2.proto.Dungeon.DungeonProto)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(com.lvl6.aoc2.proto.Dungeon.DungeonProto other) {
        if (other == com.lvl6.aoc2.proto.Dungeon.DungeonProto.getDefaultInstance()) return this;
        if (other.hasDungeonID()) {
          setDungeonID(other.getDungeonID());
        }
        if (other.hasLevelReq()) {
          setLevelReq(other.getLevelReq());
        }
        if (!other.rooms_.isEmpty()) {
          if (rooms_.isEmpty()) {
            rooms_ = other.rooms_;
            bitField0_ = (bitField0_ & ~0x00000004);
          } else {
            ensureRoomsIsMutable();
            rooms_.addAll(other.rooms_);
          }
          onChanged();
        }
        if (other.hasName()) {
          bitField0_ |= 0x00000008;
          name_ = other.name_;
          onChanged();
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
        com.lvl6.aoc2.proto.Dungeon.DungeonProto parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (com.lvl6.aoc2.proto.Dungeon.DungeonProto) e.getUnfinishedMessage();
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

      // optional int32 levelReq = 2;
      private int levelReq_ ;
      /**
       * <code>optional int32 levelReq = 2;</code>
       */
      public boolean hasLevelReq() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }
      /**
       * <code>optional int32 levelReq = 2;</code>
       */
      public int getLevelReq() {
        return levelReq_;
      }
      /**
       * <code>optional int32 levelReq = 2;</code>
       */
      public Builder setLevelReq(int value) {
        bitField0_ |= 0x00000002;
        levelReq_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional int32 levelReq = 2;</code>
       */
      public Builder clearLevelReq() {
        bitField0_ = (bitField0_ & ~0x00000002);
        levelReq_ = 0;
        onChanged();
        return this;
      }

      // repeated int32 rooms = 3;
      private java.util.List<java.lang.Integer> rooms_ = java.util.Collections.emptyList();
      private void ensureRoomsIsMutable() {
        if (!((bitField0_ & 0x00000004) == 0x00000004)) {
          rooms_ = new java.util.ArrayList<java.lang.Integer>(rooms_);
          bitField0_ |= 0x00000004;
         }
      }
      /**
       * <code>repeated int32 rooms = 3;</code>
       */
      public java.util.List<java.lang.Integer>
          getRoomsList() {
        return java.util.Collections.unmodifiableList(rooms_);
      }
      /**
       * <code>repeated int32 rooms = 3;</code>
       */
      public int getRoomsCount() {
        return rooms_.size();
      }
      /**
       * <code>repeated int32 rooms = 3;</code>
       */
      public int getRooms(int index) {
        return rooms_.get(index);
      }
      /**
       * <code>repeated int32 rooms = 3;</code>
       */
      public Builder setRooms(
          int index, int value) {
        ensureRoomsIsMutable();
        rooms_.set(index, value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated int32 rooms = 3;</code>
       */
      public Builder addRooms(int value) {
        ensureRoomsIsMutable();
        rooms_.add(value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated int32 rooms = 3;</code>
       */
      public Builder addAllRooms(
          java.lang.Iterable<? extends java.lang.Integer> values) {
        ensureRoomsIsMutable();
        super.addAll(values, rooms_);
        onChanged();
        return this;
      }
      /**
       * <code>repeated int32 rooms = 3;</code>
       */
      public Builder clearRooms() {
        rooms_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000004);
        onChanged();
        return this;
      }

      // optional string name = 4;
      private java.lang.Object name_ = "";
      /**
       * <code>optional string name = 4;</code>
       */
      public boolean hasName() {
        return ((bitField0_ & 0x00000008) == 0x00000008);
      }
      /**
       * <code>optional string name = 4;</code>
       */
      public java.lang.String getName() {
        java.lang.Object ref = name_;
        if (!(ref instanceof java.lang.String)) {
          java.lang.String s = ((com.google.protobuf.ByteString) ref)
              .toStringUtf8();
          name_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>optional string name = 4;</code>
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
       * <code>optional string name = 4;</code>
       */
      public Builder setName(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000008;
        name_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional string name = 4;</code>
       */
      public Builder clearName() {
        bitField0_ = (bitField0_ & ~0x00000008);
        name_ = getDefaultInstance().getName();
        onChanged();
        return this;
      }
      /**
       * <code>optional string name = 4;</code>
       */
      public Builder setNameBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000008;
        name_ = value;
        onChanged();
        return this;
      }

      // @@protoc_insertion_point(builder_scope:com.lvl6.aoc2.proto.DungeonProto)
    }

    static {
      defaultInstance = new DungeonProto(true);
      defaultInstance.initFields();
    }

    // @@protoc_insertion_point(class_scope:com.lvl6.aoc2.proto.DungeonProto)
  }

  private static com.google.protobuf.Descriptors.Descriptor
    internal_static_com_lvl6_aoc2_proto_DungeonProto_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_com_lvl6_aoc2_proto_DungeonProto_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\022DungeonProto.proto\022\023com.lvl6.aoc2.prot" +
      "o\"P\n\014DungeonProto\022\021\n\tdungeonID\030\001 \001(\005\022\020\n\010" +
      "levelReq\030\002 \001(\005\022\r\n\005rooms\030\003 \003(\005\022\014\n\004name\030\004 " +
      "\001(\tB\tB\007Dungeon"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
      new com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner() {
        public com.google.protobuf.ExtensionRegistry assignDescriptors(
            com.google.protobuf.Descriptors.FileDescriptor root) {
          descriptor = root;
          internal_static_com_lvl6_aoc2_proto_DungeonProto_descriptor =
            getDescriptor().getMessageTypes().get(0);
          internal_static_com_lvl6_aoc2_proto_DungeonProto_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessage.FieldAccessorTable(
              internal_static_com_lvl6_aoc2_proto_DungeonProto_descriptor,
              new java.lang.String[] { "DungeonID", "LevelReq", "Rooms", "Name", });
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
