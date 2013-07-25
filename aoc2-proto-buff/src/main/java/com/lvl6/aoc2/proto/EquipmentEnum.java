// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: EquipmentType.proto

package com.lvl6.aoc2.proto;

public final class EquipmentEnum {
  private EquipmentEnum() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
  }
  /**
   * Protobuf enum {@code com.lvl6.aoc2.proto.EquipmentType}
   */
  public enum EquipmentType
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <code>WEAPON = 0;</code>
     */
    WEAPON(0, 0),
    /**
     * <code>UPPER_BODY = 1;</code>
     */
    UPPER_BODY(1, 1),
    /**
     * <code>LOWER_BODY = 2;</code>
     */
    LOWER_BODY(2, 2),
    ;

    /**
     * <code>WEAPON = 0;</code>
     */
    public static final int WEAPON_VALUE = 0;
    /**
     * <code>UPPER_BODY = 1;</code>
     */
    public static final int UPPER_BODY_VALUE = 1;
    /**
     * <code>LOWER_BODY = 2;</code>
     */
    public static final int LOWER_BODY_VALUE = 2;


    public final int getNumber() { return value; }

    public static EquipmentType valueOf(int value) {
      switch (value) {
        case 0: return WEAPON;
        case 1: return UPPER_BODY;
        case 2: return LOWER_BODY;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<EquipmentType>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static com.google.protobuf.Internal.EnumLiteMap<EquipmentType>
        internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<EquipmentType>() {
            public EquipmentType findValueByNumber(int number) {
              return EquipmentType.valueOf(number);
            }
          };

    public final com.google.protobuf.Descriptors.EnumValueDescriptor
        getValueDescriptor() {
      return getDescriptor().getValues().get(index);
    }
    public final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptorForType() {
      return getDescriptor();
    }
    public static final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptor() {
      return com.lvl6.aoc2.proto.EquipmentEnum.getDescriptor().getEnumTypes().get(0);
    }

    private static final EquipmentType[] VALUES = values();

    public static EquipmentType valueOf(
        com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
      if (desc.getType() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException(
          "EnumValueDescriptor is not for this type.");
      }
      return VALUES[desc.getIndex()];
    }

    private final int index;
    private final int value;

    private EquipmentType(int index, int value) {
      this.index = index;
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:com.lvl6.aoc2.proto.EquipmentType)
  }


  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\023EquipmentType.proto\022\023com.lvl6.aoc2.pro" +
      "to*;\n\rEquipmentType\022\n\n\006WEAPON\020\000\022\016\n\nUPPER" +
      "_BODY\020\001\022\016\n\nLOWER_BODY\020\002B\017B\rEquipmentEnum"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
      new com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner() {
        public com.google.protobuf.ExtensionRegistry assignDescriptors(
            com.google.protobuf.Descriptors.FileDescriptor root) {
          descriptor = root;
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