// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v16/enums/age_range_type.proto

// Protobuf Java Version: 3.25.3
package com.google.ads.googleads.v16.enums;

/**
 * <pre>
 * Container for enum describing the type of demographic age ranges.
 * </pre>
 *
 * Protobuf type {@code google.ads.googleads.v16.enums.AgeRangeTypeEnum}
 */
public final class AgeRangeTypeEnum extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.ads.googleads.v16.enums.AgeRangeTypeEnum)
    AgeRangeTypeEnumOrBuilder {
private static final long serialVersionUID = 0L;
  // Use AgeRangeTypeEnum.newBuilder() to construct.
  private AgeRangeTypeEnum(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private AgeRangeTypeEnum() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new AgeRangeTypeEnum();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.ads.googleads.v16.enums.AgeRangeTypeProto.internal_static_google_ads_googleads_v16_enums_AgeRangeTypeEnum_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.ads.googleads.v16.enums.AgeRangeTypeProto.internal_static_google_ads_googleads_v16_enums_AgeRangeTypeEnum_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.ads.googleads.v16.enums.AgeRangeTypeEnum.class, com.google.ads.googleads.v16.enums.AgeRangeTypeEnum.Builder.class);
  }

  /**
   * <pre>
   * The type of demographic age ranges (for example, between 18 and 24 years
   * old).
   * </pre>
   *
   * Protobuf enum {@code google.ads.googleads.v16.enums.AgeRangeTypeEnum.AgeRangeType}
   */
  public enum AgeRangeType
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <pre>
     * Not specified.
     * </pre>
     *
     * <code>UNSPECIFIED = 0;</code>
     */
    UNSPECIFIED(0),
    /**
     * <pre>
     * Used for return value only. Represents value unknown in this version.
     * </pre>
     *
     * <code>UNKNOWN = 1;</code>
     */
    UNKNOWN(1),
    /**
     * <pre>
     * Between 18 and 24 years old.
     * </pre>
     *
     * <code>AGE_RANGE_18_24 = 503001;</code>
     */
    AGE_RANGE_18_24(503001),
    /**
     * <pre>
     * Between 25 and 34 years old.
     * </pre>
     *
     * <code>AGE_RANGE_25_34 = 503002;</code>
     */
    AGE_RANGE_25_34(503002),
    /**
     * <pre>
     * Between 35 and 44 years old.
     * </pre>
     *
     * <code>AGE_RANGE_35_44 = 503003;</code>
     */
    AGE_RANGE_35_44(503003),
    /**
     * <pre>
     * Between 45 and 54 years old.
     * </pre>
     *
     * <code>AGE_RANGE_45_54 = 503004;</code>
     */
    AGE_RANGE_45_54(503004),
    /**
     * <pre>
     * Between 55 and 64 years old.
     * </pre>
     *
     * <code>AGE_RANGE_55_64 = 503005;</code>
     */
    AGE_RANGE_55_64(503005),
    /**
     * <pre>
     * 65 years old and beyond.
     * </pre>
     *
     * <code>AGE_RANGE_65_UP = 503006;</code>
     */
    AGE_RANGE_65_UP(503006),
    /**
     * <pre>
     * Undetermined age range.
     * </pre>
     *
     * <code>AGE_RANGE_UNDETERMINED = 503999;</code>
     */
    AGE_RANGE_UNDETERMINED(503999),
    UNRECOGNIZED(-1),
    ;

    /**
     * <pre>
     * Not specified.
     * </pre>
     *
     * <code>UNSPECIFIED = 0;</code>
     */
    public static final int UNSPECIFIED_VALUE = 0;
    /**
     * <pre>
     * Used for return value only. Represents value unknown in this version.
     * </pre>
     *
     * <code>UNKNOWN = 1;</code>
     */
    public static final int UNKNOWN_VALUE = 1;
    /**
     * <pre>
     * Between 18 and 24 years old.
     * </pre>
     *
     * <code>AGE_RANGE_18_24 = 503001;</code>
     */
    public static final int AGE_RANGE_18_24_VALUE = 503001;
    /**
     * <pre>
     * Between 25 and 34 years old.
     * </pre>
     *
     * <code>AGE_RANGE_25_34 = 503002;</code>
     */
    public static final int AGE_RANGE_25_34_VALUE = 503002;
    /**
     * <pre>
     * Between 35 and 44 years old.
     * </pre>
     *
     * <code>AGE_RANGE_35_44 = 503003;</code>
     */
    public static final int AGE_RANGE_35_44_VALUE = 503003;
    /**
     * <pre>
     * Between 45 and 54 years old.
     * </pre>
     *
     * <code>AGE_RANGE_45_54 = 503004;</code>
     */
    public static final int AGE_RANGE_45_54_VALUE = 503004;
    /**
     * <pre>
     * Between 55 and 64 years old.
     * </pre>
     *
     * <code>AGE_RANGE_55_64 = 503005;</code>
     */
    public static final int AGE_RANGE_55_64_VALUE = 503005;
    /**
     * <pre>
     * 65 years old and beyond.
     * </pre>
     *
     * <code>AGE_RANGE_65_UP = 503006;</code>
     */
    public static final int AGE_RANGE_65_UP_VALUE = 503006;
    /**
     * <pre>
     * Undetermined age range.
     * </pre>
     *
     * <code>AGE_RANGE_UNDETERMINED = 503999;</code>
     */
    public static final int AGE_RANGE_UNDETERMINED_VALUE = 503999;


    public final int getNumber() {
      if (this == UNRECOGNIZED) {
        throw new java.lang.IllegalArgumentException(
            "Can't get the number of an unknown enum value.");
      }
      return value;
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static AgeRangeType valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static AgeRangeType forNumber(int value) {
      switch (value) {
        case 0: return UNSPECIFIED;
        case 1: return UNKNOWN;
        case 503001: return AGE_RANGE_18_24;
        case 503002: return AGE_RANGE_25_34;
        case 503003: return AGE_RANGE_35_44;
        case 503004: return AGE_RANGE_45_54;
        case 503005: return AGE_RANGE_55_64;
        case 503006: return AGE_RANGE_65_UP;
        case 503999: return AGE_RANGE_UNDETERMINED;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<AgeRangeType>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        AgeRangeType> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<AgeRangeType>() {
            public AgeRangeType findValueByNumber(int number) {
              return AgeRangeType.forNumber(number);
            }
          };

    public final com.google.protobuf.Descriptors.EnumValueDescriptor
        getValueDescriptor() {
      if (this == UNRECOGNIZED) {
        throw new java.lang.IllegalStateException(
            "Can't get the descriptor of an unrecognized enum value.");
      }
      return getDescriptor().getValues().get(ordinal());
    }
    public final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptorForType() {
      return getDescriptor();
    }
    public static final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptor() {
      return com.google.ads.googleads.v16.enums.AgeRangeTypeEnum.getDescriptor().getEnumTypes().get(0);
    }

    private static final AgeRangeType[] VALUES = values();

    public static AgeRangeType valueOf(
        com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
      if (desc.getType() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException(
          "EnumValueDescriptor is not for this type.");
      }
      if (desc.getIndex() == -1) {
        return UNRECOGNIZED;
      }
      return VALUES[desc.getIndex()];
    }

    private final int value;

    private AgeRangeType(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:google.ads.googleads.v16.enums.AgeRangeTypeEnum.AgeRangeType)
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
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    size += getUnknownFields().getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof com.google.ads.googleads.v16.enums.AgeRangeTypeEnum)) {
      return super.equals(obj);
    }
    com.google.ads.googleads.v16.enums.AgeRangeTypeEnum other = (com.google.ads.googleads.v16.enums.AgeRangeTypeEnum) obj;

    if (!getUnknownFields().equals(other.getUnknownFields())) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.ads.googleads.v16.enums.AgeRangeTypeEnum parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v16.enums.AgeRangeTypeEnum parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v16.enums.AgeRangeTypeEnum parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v16.enums.AgeRangeTypeEnum parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v16.enums.AgeRangeTypeEnum parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v16.enums.AgeRangeTypeEnum parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v16.enums.AgeRangeTypeEnum parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v16.enums.AgeRangeTypeEnum parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.google.ads.googleads.v16.enums.AgeRangeTypeEnum parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.ads.googleads.v16.enums.AgeRangeTypeEnum parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v16.enums.AgeRangeTypeEnum parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v16.enums.AgeRangeTypeEnum parseFrom(
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
  public static Builder newBuilder(com.google.ads.googleads.v16.enums.AgeRangeTypeEnum prototype) {
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
   * <pre>
   * Container for enum describing the type of demographic age ranges.
   * </pre>
   *
   * Protobuf type {@code google.ads.googleads.v16.enums.AgeRangeTypeEnum}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.ads.googleads.v16.enums.AgeRangeTypeEnum)
      com.google.ads.googleads.v16.enums.AgeRangeTypeEnumOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.ads.googleads.v16.enums.AgeRangeTypeProto.internal_static_google_ads_googleads_v16_enums_AgeRangeTypeEnum_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.ads.googleads.v16.enums.AgeRangeTypeProto.internal_static_google_ads_googleads_v16_enums_AgeRangeTypeEnum_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.ads.googleads.v16.enums.AgeRangeTypeEnum.class, com.google.ads.googleads.v16.enums.AgeRangeTypeEnum.Builder.class);
    }

    // Construct using com.google.ads.googleads.v16.enums.AgeRangeTypeEnum.newBuilder()
    private Builder() {

    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);

    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.ads.googleads.v16.enums.AgeRangeTypeProto.internal_static_google_ads_googleads_v16_enums_AgeRangeTypeEnum_descriptor;
    }

    @java.lang.Override
    public com.google.ads.googleads.v16.enums.AgeRangeTypeEnum getDefaultInstanceForType() {
      return com.google.ads.googleads.v16.enums.AgeRangeTypeEnum.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.ads.googleads.v16.enums.AgeRangeTypeEnum build() {
      com.google.ads.googleads.v16.enums.AgeRangeTypeEnum result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.ads.googleads.v16.enums.AgeRangeTypeEnum buildPartial() {
      com.google.ads.googleads.v16.enums.AgeRangeTypeEnum result = new com.google.ads.googleads.v16.enums.AgeRangeTypeEnum(this);
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.google.ads.googleads.v16.enums.AgeRangeTypeEnum) {
        return mergeFrom((com.google.ads.googleads.v16.enums.AgeRangeTypeEnum)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.ads.googleads.v16.enums.AgeRangeTypeEnum other) {
      if (other == com.google.ads.googleads.v16.enums.AgeRangeTypeEnum.getDefaultInstance()) return this;
      this.mergeUnknownFields(other.getUnknownFields());
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
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            default: {
              if (!super.parseUnknownField(input, extensionRegistry, tag)) {
                done = true; // was an endgroup tag
              }
              break;
            } // default:
          } // switch (tag)
        } // while (!done)
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.unwrapIOException();
      } finally {
        onChanged();
      } // finally
      return this;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:google.ads.googleads.v16.enums.AgeRangeTypeEnum)
  }

  // @@protoc_insertion_point(class_scope:google.ads.googleads.v16.enums.AgeRangeTypeEnum)
  private static final com.google.ads.googleads.v16.enums.AgeRangeTypeEnum DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.ads.googleads.v16.enums.AgeRangeTypeEnum();
  }

  public static com.google.ads.googleads.v16.enums.AgeRangeTypeEnum getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<AgeRangeTypeEnum>
      PARSER = new com.google.protobuf.AbstractParser<AgeRangeTypeEnum>() {
    @java.lang.Override
    public AgeRangeTypeEnum parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      Builder builder = newBuilder();
      try {
        builder.mergeFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(builder.buildPartial());
      } catch (com.google.protobuf.UninitializedMessageException e) {
        throw e.asInvalidProtocolBufferException().setUnfinishedMessage(builder.buildPartial());
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(e)
            .setUnfinishedMessage(builder.buildPartial());
      }
      return builder.buildPartial();
    }
  };

  public static com.google.protobuf.Parser<AgeRangeTypeEnum> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<AgeRangeTypeEnum> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.ads.googleads.v16.enums.AgeRangeTypeEnum getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

