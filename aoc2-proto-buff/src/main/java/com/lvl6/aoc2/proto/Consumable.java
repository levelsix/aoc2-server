// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ConsumableProto.proto

package com.lvl6.aoc2.proto;

public final class Consumable {
  private Consumable() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
  }
  public interface ConsumableProtoOrBuilder
      extends com.google.protobuf.MessageOrBuilder {

    // optional int32 consumeID = 1;
    /**
     * <code>optional int32 consumeID = 1;</code>
     */
    boolean hasConsumeID();
    /**
     * <code>optional int32 consumeID = 1;</code>
     */
    int getConsumeID();

    // optional int32 health = 2;
    /**
     * <code>optional int32 health = 2;</code>
     */
    boolean hasHealth();
    /**
     * <code>optional int32 health = 2;</code>
     */
    int getHealth();

    // optional int32 mana = 3;
    /**
     * <code>optional int32 mana = 3;</code>
     *
     * <pre>
     *Reserve 4-15 for other effects
     * </pre>
     */
    boolean hasMana();
    /**
     * <code>optional int32 mana = 3;</code>
     *
     * <pre>
     *Reserve 4-15 for other effects
     * </pre>
     */
    int getMana();

    // optional int32 cost = 16;
    /**
     * <code>optional int32 cost = 16;</code>
     */
    boolean hasCost();
    /**
     * <code>optional int32 cost = 16;</code>
     */
    int getCost();

    // optional int32 limit = 17;
    /**
     * <code>optional int32 limit = 17;</code>
     */
    boolean hasLimit();
    /**
     * <code>optional int32 limit = 17;</code>
     */
    int getLimit();

    // optional int32 timeToCreate = 18;
    /**
     * <code>optional int32 timeToCreate = 18;</code>
     */
    boolean hasTimeToCreate();
    /**
     * <code>optional int32 timeToCreate = 18;</code>
     */
    int getTimeToCreate();

    // required .com.lvl6.aoc2.proto.ResourceType resourceToCreate = 19;
    /**
     * <code>required .com.lvl6.aoc2.proto.ResourceType resourceToCreate = 19;</code>
     */
    boolean hasResourceToCreate();
    /**
     * <code>required .com.lvl6.aoc2.proto.ResourceType resourceToCreate = 19;</code>
     */
    com.lvl6.aoc2.proto.ResourceEnum.ResourceType getResourceToCreate();

    // optional int32 baseSpeedUpBuildCost = 20;
    /**
     * <code>optional int32 baseSpeedUpBuildCost = 20;</code>
     */
    boolean hasBaseSpeedUpBuildCost();
    /**
     * <code>optional int32 baseSpeedUpBuildCost = 20;</code>
     */
    int getBaseSpeedUpBuildCost();
  }
  /**
   * Protobuf type {@code com.lvl6.aoc2.proto.ConsumableProto}
   */
  public static final class ConsumableProto extends
      com.google.protobuf.GeneratedMessage
      implements ConsumableProtoOrBuilder {
    // Use ConsumableProto.newBuilder() to construct.
    private ConsumableProto(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
      super(builder);
      this.unknownFields = builder.getUnknownFields();
    }
    private ConsumableProto(boolean noInit) { this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance(); }

    private static final ConsumableProto defaultInstance;
    public static ConsumableProto getDefaultInstance() {
      return defaultInstance;
    }

    public ConsumableProto getDefaultInstanceForType() {
      return defaultInstance;
    }

    private final com.google.protobuf.UnknownFieldSet unknownFields;
    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
        getUnknownFields() {
      return this.unknownFields;
    }
    private ConsumableProto(
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
              consumeID_ = input.readInt32();
              break;
            }
            case 16: {
              bitField0_ |= 0x00000002;
              health_ = input.readInt32();
              break;
            }
            case 24: {
              bitField0_ |= 0x00000004;
              mana_ = input.readInt32();
              break;
            }
            case 128: {
              bitField0_ |= 0x00000008;
              cost_ = input.readInt32();
              break;
            }
            case 136: {
              bitField0_ |= 0x00000010;
              limit_ = input.readInt32();
              break;
            }
            case 144: {
              bitField0_ |= 0x00000020;
              timeToCreate_ = input.readInt32();
              break;
            }
            case 152: {
              int rawValue = input.readEnum();
              com.lvl6.aoc2.proto.ResourceEnum.ResourceType value = com.lvl6.aoc2.proto.ResourceEnum.ResourceType.valueOf(rawValue);
              if (value == null) {
                unknownFields.mergeVarintField(19, rawValue);
              } else {
                bitField0_ |= 0x00000040;
                resourceToCreate_ = value;
              }
              break;
            }
            case 160: {
              bitField0_ |= 0x00000080;
              baseSpeedUpBuildCost_ = input.readInt32();
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
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.lvl6.aoc2.proto.Consumable.internal_static_com_lvl6_aoc2_proto_ConsumableProto_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.lvl6.aoc2.proto.Consumable.internal_static_com_lvl6_aoc2_proto_ConsumableProto_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.lvl6.aoc2.proto.Consumable.ConsumableProto.class, com.lvl6.aoc2.proto.Consumable.ConsumableProto.Builder.class);
    }

    public static com.google.protobuf.Parser<ConsumableProto> PARSER =
        new com.google.protobuf.AbstractParser<ConsumableProto>() {
      public ConsumableProto parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new ConsumableProto(input, extensionRegistry);
      }
    };

    @java.lang.Override
    public com.google.protobuf.Parser<ConsumableProto> getParserForType() {
      return PARSER;
    }

    private int bitField0_;
    // optional int32 consumeID = 1;
    public static final int CONSUMEID_FIELD_NUMBER = 1;
    private int consumeID_;
    /**
     * <code>optional int32 consumeID = 1;</code>
     */
    public boolean hasConsumeID() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     * <code>optional int32 consumeID = 1;</code>
     */
    public int getConsumeID() {
      return consumeID_;
    }

    // optional int32 health = 2;
    public static final int HEALTH_FIELD_NUMBER = 2;
    private int health_;
    /**
     * <code>optional int32 health = 2;</code>
     */
    public boolean hasHealth() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    /**
     * <code>optional int32 health = 2;</code>
     */
    public int getHealth() {
      return health_;
    }

    // optional int32 mana = 3;
    public static final int MANA_FIELD_NUMBER = 3;
    private int mana_;
    /**
     * <code>optional int32 mana = 3;</code>
     *
     * <pre>
     *Reserve 4-15 for other effects
     * </pre>
     */
    public boolean hasMana() {
      return ((bitField0_ & 0x00000004) == 0x00000004);
    }
    /**
     * <code>optional int32 mana = 3;</code>
     *
     * <pre>
     *Reserve 4-15 for other effects
     * </pre>
     */
    public int getMana() {
      return mana_;
    }

    // optional int32 cost = 16;
    public static final int COST_FIELD_NUMBER = 16;
    private int cost_;
    /**
     * <code>optional int32 cost = 16;</code>
     */
    public boolean hasCost() {
      return ((bitField0_ & 0x00000008) == 0x00000008);
    }
    /**
     * <code>optional int32 cost = 16;</code>
     */
    public int getCost() {
      return cost_;
    }

    // optional int32 limit = 17;
    public static final int LIMIT_FIELD_NUMBER = 17;
    private int limit_;
    /**
     * <code>optional int32 limit = 17;</code>
     */
    public boolean hasLimit() {
      return ((bitField0_ & 0x00000010) == 0x00000010);
    }
    /**
     * <code>optional int32 limit = 17;</code>
     */
    public int getLimit() {
      return limit_;
    }

    // optional int32 timeToCreate = 18;
    public static final int TIMETOCREATE_FIELD_NUMBER = 18;
    private int timeToCreate_;
    /**
     * <code>optional int32 timeToCreate = 18;</code>
     */
    public boolean hasTimeToCreate() {
      return ((bitField0_ & 0x00000020) == 0x00000020);
    }
    /**
     * <code>optional int32 timeToCreate = 18;</code>
     */
    public int getTimeToCreate() {
      return timeToCreate_;
    }

    // required .com.lvl6.aoc2.proto.ResourceType resourceToCreate = 19;
    public static final int RESOURCETOCREATE_FIELD_NUMBER = 19;
    private com.lvl6.aoc2.proto.ResourceEnum.ResourceType resourceToCreate_;
    /**
     * <code>required .com.lvl6.aoc2.proto.ResourceType resourceToCreate = 19;</code>
     */
    public boolean hasResourceToCreate() {
      return ((bitField0_ & 0x00000040) == 0x00000040);
    }
    /**
     * <code>required .com.lvl6.aoc2.proto.ResourceType resourceToCreate = 19;</code>
     */
    public com.lvl6.aoc2.proto.ResourceEnum.ResourceType getResourceToCreate() {
      return resourceToCreate_;
    }

    // optional int32 baseSpeedUpBuildCost = 20;
    public static final int BASESPEEDUPBUILDCOST_FIELD_NUMBER = 20;
    private int baseSpeedUpBuildCost_;
    /**
     * <code>optional int32 baseSpeedUpBuildCost = 20;</code>
     */
    public boolean hasBaseSpeedUpBuildCost() {
      return ((bitField0_ & 0x00000080) == 0x00000080);
    }
    /**
     * <code>optional int32 baseSpeedUpBuildCost = 20;</code>
     */
    public int getBaseSpeedUpBuildCost() {
      return baseSpeedUpBuildCost_;
    }

    private void initFields() {
      consumeID_ = 0;
      health_ = 0;
      mana_ = 0;
      cost_ = 0;
      limit_ = 0;
      timeToCreate_ = 0;
      resourceToCreate_ = com.lvl6.aoc2.proto.ResourceEnum.ResourceType.GOLD;
      baseSpeedUpBuildCost_ = 0;
    }
    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized != -1) return isInitialized == 1;

      if (!hasResourceToCreate()) {
        memoizedIsInitialized = 0;
        return false;
      }
      memoizedIsInitialized = 1;
      return true;
    }

    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      getSerializedSize();
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        output.writeInt32(1, consumeID_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        output.writeInt32(2, health_);
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        output.writeInt32(3, mana_);
      }
      if (((bitField0_ & 0x00000008) == 0x00000008)) {
        output.writeInt32(16, cost_);
      }
      if (((bitField0_ & 0x00000010) == 0x00000010)) {
        output.writeInt32(17, limit_);
      }
      if (((bitField0_ & 0x00000020) == 0x00000020)) {
        output.writeInt32(18, timeToCreate_);
      }
      if (((bitField0_ & 0x00000040) == 0x00000040)) {
        output.writeEnum(19, resourceToCreate_.getNumber());
      }
      if (((bitField0_ & 0x00000080) == 0x00000080)) {
        output.writeInt32(20, baseSpeedUpBuildCost_);
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
          .computeInt32Size(1, consumeID_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(2, health_);
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(3, mana_);
      }
      if (((bitField0_ & 0x00000008) == 0x00000008)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(16, cost_);
      }
      if (((bitField0_ & 0x00000010) == 0x00000010)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(17, limit_);
      }
      if (((bitField0_ & 0x00000020) == 0x00000020)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(18, timeToCreate_);
      }
      if (((bitField0_ & 0x00000040) == 0x00000040)) {
        size += com.google.protobuf.CodedOutputStream
          .computeEnumSize(19, resourceToCreate_.getNumber());
      }
      if (((bitField0_ & 0x00000080) == 0x00000080)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(20, baseSpeedUpBuildCost_);
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

    public static com.lvl6.aoc2.proto.Consumable.ConsumableProto parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.lvl6.aoc2.proto.Consumable.ConsumableProto parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.lvl6.aoc2.proto.Consumable.ConsumableProto parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.lvl6.aoc2.proto.Consumable.ConsumableProto parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.lvl6.aoc2.proto.Consumable.ConsumableProto parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static com.lvl6.aoc2.proto.Consumable.ConsumableProto parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }
    public static com.lvl6.aoc2.proto.Consumable.ConsumableProto parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input);
    }
    public static com.lvl6.aoc2.proto.Consumable.ConsumableProto parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input, extensionRegistry);
    }
    public static com.lvl6.aoc2.proto.Consumable.ConsumableProto parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static com.lvl6.aoc2.proto.Consumable.ConsumableProto parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }

    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(com.lvl6.aoc2.proto.Consumable.ConsumableProto prototype) {
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
     * Protobuf type {@code com.lvl6.aoc2.proto.ConsumableProto}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder>
       implements com.lvl6.aoc2.proto.Consumable.ConsumableProtoOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.lvl6.aoc2.proto.Consumable.internal_static_com_lvl6_aoc2_proto_ConsumableProto_descriptor;
      }

      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.lvl6.aoc2.proto.Consumable.internal_static_com_lvl6_aoc2_proto_ConsumableProto_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                com.lvl6.aoc2.proto.Consumable.ConsumableProto.class, com.lvl6.aoc2.proto.Consumable.ConsumableProto.Builder.class);
      }

      // Construct using com.lvl6.aoc2.proto.Consumable.ConsumableProto.newBuilder()
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
        consumeID_ = 0;
        bitField0_ = (bitField0_ & ~0x00000001);
        health_ = 0;
        bitField0_ = (bitField0_ & ~0x00000002);
        mana_ = 0;
        bitField0_ = (bitField0_ & ~0x00000004);
        cost_ = 0;
        bitField0_ = (bitField0_ & ~0x00000008);
        limit_ = 0;
        bitField0_ = (bitField0_ & ~0x00000010);
        timeToCreate_ = 0;
        bitField0_ = (bitField0_ & ~0x00000020);
        resourceToCreate_ = com.lvl6.aoc2.proto.ResourceEnum.ResourceType.GOLD;
        bitField0_ = (bitField0_ & ~0x00000040);
        baseSpeedUpBuildCost_ = 0;
        bitField0_ = (bitField0_ & ~0x00000080);
        return this;
      }

      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.lvl6.aoc2.proto.Consumable.internal_static_com_lvl6_aoc2_proto_ConsumableProto_descriptor;
      }

      public com.lvl6.aoc2.proto.Consumable.ConsumableProto getDefaultInstanceForType() {
        return com.lvl6.aoc2.proto.Consumable.ConsumableProto.getDefaultInstance();
      }

      public com.lvl6.aoc2.proto.Consumable.ConsumableProto build() {
        com.lvl6.aoc2.proto.Consumable.ConsumableProto result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public com.lvl6.aoc2.proto.Consumable.ConsumableProto buildPartial() {
        com.lvl6.aoc2.proto.Consumable.ConsumableProto result = new com.lvl6.aoc2.proto.Consumable.ConsumableProto(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.consumeID_ = consumeID_;
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000002;
        }
        result.health_ = health_;
        if (((from_bitField0_ & 0x00000004) == 0x00000004)) {
          to_bitField0_ |= 0x00000004;
        }
        result.mana_ = mana_;
        if (((from_bitField0_ & 0x00000008) == 0x00000008)) {
          to_bitField0_ |= 0x00000008;
        }
        result.cost_ = cost_;
        if (((from_bitField0_ & 0x00000010) == 0x00000010)) {
          to_bitField0_ |= 0x00000010;
        }
        result.limit_ = limit_;
        if (((from_bitField0_ & 0x00000020) == 0x00000020)) {
          to_bitField0_ |= 0x00000020;
        }
        result.timeToCreate_ = timeToCreate_;
        if (((from_bitField0_ & 0x00000040) == 0x00000040)) {
          to_bitField0_ |= 0x00000040;
        }
        result.resourceToCreate_ = resourceToCreate_;
        if (((from_bitField0_ & 0x00000080) == 0x00000080)) {
          to_bitField0_ |= 0x00000080;
        }
        result.baseSpeedUpBuildCost_ = baseSpeedUpBuildCost_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof com.lvl6.aoc2.proto.Consumable.ConsumableProto) {
          return mergeFrom((com.lvl6.aoc2.proto.Consumable.ConsumableProto)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(com.lvl6.aoc2.proto.Consumable.ConsumableProto other) {
        if (other == com.lvl6.aoc2.proto.Consumable.ConsumableProto.getDefaultInstance()) return this;
        if (other.hasConsumeID()) {
          setConsumeID(other.getConsumeID());
        }
        if (other.hasHealth()) {
          setHealth(other.getHealth());
        }
        if (other.hasMana()) {
          setMana(other.getMana());
        }
        if (other.hasCost()) {
          setCost(other.getCost());
        }
        if (other.hasLimit()) {
          setLimit(other.getLimit());
        }
        if (other.hasTimeToCreate()) {
          setTimeToCreate(other.getTimeToCreate());
        }
        if (other.hasResourceToCreate()) {
          setResourceToCreate(other.getResourceToCreate());
        }
        if (other.hasBaseSpeedUpBuildCost()) {
          setBaseSpeedUpBuildCost(other.getBaseSpeedUpBuildCost());
        }
        this.mergeUnknownFields(other.getUnknownFields());
        return this;
      }

      public final boolean isInitialized() {
        if (!hasResourceToCreate()) {
          
          return false;
        }
        return true;
      }

      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        com.lvl6.aoc2.proto.Consumable.ConsumableProto parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (com.lvl6.aoc2.proto.Consumable.ConsumableProto) e.getUnfinishedMessage();
          throw e;
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      // optional int32 consumeID = 1;
      private int consumeID_ ;
      /**
       * <code>optional int32 consumeID = 1;</code>
       */
      public boolean hasConsumeID() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      /**
       * <code>optional int32 consumeID = 1;</code>
       */
      public int getConsumeID() {
        return consumeID_;
      }
      /**
       * <code>optional int32 consumeID = 1;</code>
       */
      public Builder setConsumeID(int value) {
        bitField0_ |= 0x00000001;
        consumeID_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional int32 consumeID = 1;</code>
       */
      public Builder clearConsumeID() {
        bitField0_ = (bitField0_ & ~0x00000001);
        consumeID_ = 0;
        onChanged();
        return this;
      }

      // optional int32 health = 2;
      private int health_ ;
      /**
       * <code>optional int32 health = 2;</code>
       */
      public boolean hasHealth() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }
      /**
       * <code>optional int32 health = 2;</code>
       */
      public int getHealth() {
        return health_;
      }
      /**
       * <code>optional int32 health = 2;</code>
       */
      public Builder setHealth(int value) {
        bitField0_ |= 0x00000002;
        health_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional int32 health = 2;</code>
       */
      public Builder clearHealth() {
        bitField0_ = (bitField0_ & ~0x00000002);
        health_ = 0;
        onChanged();
        return this;
      }

      // optional int32 mana = 3;
      private int mana_ ;
      /**
       * <code>optional int32 mana = 3;</code>
       *
       * <pre>
       *Reserve 4-15 for other effects
       * </pre>
       */
      public boolean hasMana() {
        return ((bitField0_ & 0x00000004) == 0x00000004);
      }
      /**
       * <code>optional int32 mana = 3;</code>
       *
       * <pre>
       *Reserve 4-15 for other effects
       * </pre>
       */
      public int getMana() {
        return mana_;
      }
      /**
       * <code>optional int32 mana = 3;</code>
       *
       * <pre>
       *Reserve 4-15 for other effects
       * </pre>
       */
      public Builder setMana(int value) {
        bitField0_ |= 0x00000004;
        mana_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional int32 mana = 3;</code>
       *
       * <pre>
       *Reserve 4-15 for other effects
       * </pre>
       */
      public Builder clearMana() {
        bitField0_ = (bitField0_ & ~0x00000004);
        mana_ = 0;
        onChanged();
        return this;
      }

      // optional int32 cost = 16;
      private int cost_ ;
      /**
       * <code>optional int32 cost = 16;</code>
       */
      public boolean hasCost() {
        return ((bitField0_ & 0x00000008) == 0x00000008);
      }
      /**
       * <code>optional int32 cost = 16;</code>
       */
      public int getCost() {
        return cost_;
      }
      /**
       * <code>optional int32 cost = 16;</code>
       */
      public Builder setCost(int value) {
        bitField0_ |= 0x00000008;
        cost_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional int32 cost = 16;</code>
       */
      public Builder clearCost() {
        bitField0_ = (bitField0_ & ~0x00000008);
        cost_ = 0;
        onChanged();
        return this;
      }

      // optional int32 limit = 17;
      private int limit_ ;
      /**
       * <code>optional int32 limit = 17;</code>
       */
      public boolean hasLimit() {
        return ((bitField0_ & 0x00000010) == 0x00000010);
      }
      /**
       * <code>optional int32 limit = 17;</code>
       */
      public int getLimit() {
        return limit_;
      }
      /**
       * <code>optional int32 limit = 17;</code>
       */
      public Builder setLimit(int value) {
        bitField0_ |= 0x00000010;
        limit_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional int32 limit = 17;</code>
       */
      public Builder clearLimit() {
        bitField0_ = (bitField0_ & ~0x00000010);
        limit_ = 0;
        onChanged();
        return this;
      }

      // optional int32 timeToCreate = 18;
      private int timeToCreate_ ;
      /**
       * <code>optional int32 timeToCreate = 18;</code>
       */
      public boolean hasTimeToCreate() {
        return ((bitField0_ & 0x00000020) == 0x00000020);
      }
      /**
       * <code>optional int32 timeToCreate = 18;</code>
       */
      public int getTimeToCreate() {
        return timeToCreate_;
      }
      /**
       * <code>optional int32 timeToCreate = 18;</code>
       */
      public Builder setTimeToCreate(int value) {
        bitField0_ |= 0x00000020;
        timeToCreate_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional int32 timeToCreate = 18;</code>
       */
      public Builder clearTimeToCreate() {
        bitField0_ = (bitField0_ & ~0x00000020);
        timeToCreate_ = 0;
        onChanged();
        return this;
      }

      // required .com.lvl6.aoc2.proto.ResourceType resourceToCreate = 19;
      private com.lvl6.aoc2.proto.ResourceEnum.ResourceType resourceToCreate_ = com.lvl6.aoc2.proto.ResourceEnum.ResourceType.GOLD;
      /**
       * <code>required .com.lvl6.aoc2.proto.ResourceType resourceToCreate = 19;</code>
       */
      public boolean hasResourceToCreate() {
        return ((bitField0_ & 0x00000040) == 0x00000040);
      }
      /**
       * <code>required .com.lvl6.aoc2.proto.ResourceType resourceToCreate = 19;</code>
       */
      public com.lvl6.aoc2.proto.ResourceEnum.ResourceType getResourceToCreate() {
        return resourceToCreate_;
      }
      /**
       * <code>required .com.lvl6.aoc2.proto.ResourceType resourceToCreate = 19;</code>
       */
      public Builder setResourceToCreate(com.lvl6.aoc2.proto.ResourceEnum.ResourceType value) {
        if (value == null) {
          throw new NullPointerException();
        }
        bitField0_ |= 0x00000040;
        resourceToCreate_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required .com.lvl6.aoc2.proto.ResourceType resourceToCreate = 19;</code>
       */
      public Builder clearResourceToCreate() {
        bitField0_ = (bitField0_ & ~0x00000040);
        resourceToCreate_ = com.lvl6.aoc2.proto.ResourceEnum.ResourceType.GOLD;
        onChanged();
        return this;
      }

      // optional int32 baseSpeedUpBuildCost = 20;
      private int baseSpeedUpBuildCost_ ;
      /**
       * <code>optional int32 baseSpeedUpBuildCost = 20;</code>
       */
      public boolean hasBaseSpeedUpBuildCost() {
        return ((bitField0_ & 0x00000080) == 0x00000080);
      }
      /**
       * <code>optional int32 baseSpeedUpBuildCost = 20;</code>
       */
      public int getBaseSpeedUpBuildCost() {
        return baseSpeedUpBuildCost_;
      }
      /**
       * <code>optional int32 baseSpeedUpBuildCost = 20;</code>
       */
      public Builder setBaseSpeedUpBuildCost(int value) {
        bitField0_ |= 0x00000080;
        baseSpeedUpBuildCost_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional int32 baseSpeedUpBuildCost = 20;</code>
       */
      public Builder clearBaseSpeedUpBuildCost() {
        bitField0_ = (bitField0_ & ~0x00000080);
        baseSpeedUpBuildCost_ = 0;
        onChanged();
        return this;
      }

      // @@protoc_insertion_point(builder_scope:com.lvl6.aoc2.proto.ConsumableProto)
    }

    static {
      defaultInstance = new ConsumableProto(true);
      defaultInstance.initFields();
    }

    // @@protoc_insertion_point(class_scope:com.lvl6.aoc2.proto.ConsumableProto)
  }

  private static com.google.protobuf.Descriptors.Descriptor
    internal_static_com_lvl6_aoc2_proto_ConsumableProto_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_com_lvl6_aoc2_proto_ConsumableProto_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\025ConsumableProto.proto\022\023com.lvl6.aoc2.p" +
      "roto\032\022ResourceType.proto\"\320\001\n\017ConsumableP" +
      "roto\022\021\n\tconsumeID\030\001 \001(\005\022\016\n\006health\030\002 \001(\005\022" +
      "\014\n\004mana\030\003 \001(\005\022\014\n\004cost\030\020 \001(\005\022\r\n\005limit\030\021 \001" +
      "(\005\022\024\n\014timeToCreate\030\022 \001(\005\022;\n\020resourceToCr" +
      "eate\030\023 \002(\0162!.com.lvl6.aoc2.proto.Resourc" +
      "eType\022\034\n\024baseSpeedUpBuildCost\030\024 \001(\005B\014B\nC" +
      "onsumable"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
      new com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner() {
        public com.google.protobuf.ExtensionRegistry assignDescriptors(
            com.google.protobuf.Descriptors.FileDescriptor root) {
          descriptor = root;
          internal_static_com_lvl6_aoc2_proto_ConsumableProto_descriptor =
            getDescriptor().getMessageTypes().get(0);
          internal_static_com_lvl6_aoc2_proto_ConsumableProto_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessage.FieldAccessorTable(
              internal_static_com_lvl6_aoc2_proto_ConsumableProto_descriptor,
              new java.lang.String[] { "ConsumeID", "Health", "Mana", "Cost", "Limit", "TimeToCreate", "ResourceToCreate", "BaseSpeedUpBuildCost", });
          return null;
        }
      };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.lvl6.aoc2.proto.ResourceEnum.getDescriptor(),
        }, assigner);
  }

  // @@protoc_insertion_point(outer_class_scope)
}