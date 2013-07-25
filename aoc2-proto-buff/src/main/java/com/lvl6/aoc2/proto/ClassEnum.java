// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ClassType.proto

package com.lvl6.aoc2.proto;

public final class ClassEnum {
  private ClassEnum() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
  }
  /**
   * Protobuf enum {@code com.lvl6.aoc2.proto.ClassType}
   */
  public enum ClassType
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <code>WARRIOR = 0;</code>
     */
    WARRIOR(0, 0),
    /**
     * <code>ARCHER = 1;</code>
     */
    ARCHER(1, 1),
    /**
     * <code>WIZARD = 2;</code>
     */
    WIZARD(2, 2),
    /**
     * <code>ALL = 3;</code>
     */
    ALL(3, 3),
    ;

    /**
     * <code>WARRIOR = 0;</code>
     */
    public static final int WARRIOR_VALUE = 0;
    /**
     * <code>ARCHER = 1;</code>
     */
    public static final int ARCHER_VALUE = 1;
    /**
     * <code>WIZARD = 2;</code>
     */
    public static final int WIZARD_VALUE = 2;
    /**
     * <code>ALL = 3;</code>
     */
    public static final int ALL_VALUE = 3;


    public final int getNumber() { return value; }

    public static ClassType valueOf(int value) {
      switch (value) {
        case 0: return WARRIOR;
        case 1: return ARCHER;
        case 2: return WIZARD;
        case 3: return ALL;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<ClassType>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static com.google.protobuf.Internal.EnumLiteMap<ClassType>
        internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<ClassType>() {
            public ClassType findValueByNumber(int number) {
              return ClassType.valueOf(number);
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
      return com.lvl6.aoc2.proto.ClassEnum.getDescriptor().getEnumTypes().get(0);
    }

    private static final ClassType[] VALUES = values();

    public static ClassType valueOf(
        com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
      if (desc.getType() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException(
          "EnumValueDescriptor is not for this type.");
      }
      return VALUES[desc.getIndex()];
    }

    private final int index;
    private final int value;

    private ClassType(int index, int value) {
      this.index = index;
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:com.lvl6.aoc2.proto.ClassType)
  }


  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\017ClassType.proto\022\023com.lvl6.aoc2.proto*9" +
      "\n\tClassType\022\013\n\007WARRIOR\020\000\022\n\n\006ARCHER\020\001\022\n\n\006" +
      "WIZARD\020\002\022\007\n\003ALL\020\003B\013B\tClassEnum"
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