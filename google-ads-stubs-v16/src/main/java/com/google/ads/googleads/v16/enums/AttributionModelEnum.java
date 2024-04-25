// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v16/enums/attribution_model.proto

// Protobuf Java Version: 3.25.3
package com.google.ads.googleads.v16.enums;

/**
 * <pre>
 * Container for enum representing the attribution model that describes how to
 * distribute credit for a particular conversion across potentially many prior
 * interactions.
 * </pre>
 *
 * Protobuf type {@code google.ads.googleads.v16.enums.AttributionModelEnum}
 */
public final class AttributionModelEnum extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.ads.googleads.v16.enums.AttributionModelEnum)
    AttributionModelEnumOrBuilder {
private static final long serialVersionUID = 0L;
  // Use AttributionModelEnum.newBuilder() to construct.
  private AttributionModelEnum(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private AttributionModelEnum() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new AttributionModelEnum();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.ads.googleads.v16.enums.AttributionModelProto.internal_static_google_ads_googleads_v16_enums_AttributionModelEnum_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.ads.googleads.v16.enums.AttributionModelProto.internal_static_google_ads_googleads_v16_enums_AttributionModelEnum_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.ads.googleads.v16.enums.AttributionModelEnum.class, com.google.ads.googleads.v16.enums.AttributionModelEnum.Builder.class);
  }

  /**
   * <pre>
   * The attribution model that describes how to distribute credit for a
   * particular conversion across potentially many prior interactions.
   * </pre>
   *
   * Protobuf enum {@code google.ads.googleads.v16.enums.AttributionModelEnum.AttributionModel}
   */
  public enum AttributionModel
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
     * Uses external attribution.
     * </pre>
     *
     * <code>EXTERNAL = 100;</code>
     */
    EXTERNAL(100),
    /**
     * <pre>
     * Attributes all credit for a conversion to its last click.
     * </pre>
     *
     * <code>GOOGLE_ADS_LAST_CLICK = 101;</code>
     */
    GOOGLE_ADS_LAST_CLICK(101),
    /**
     * <pre>
     * Attributes all credit for a conversion to its first click using Google
     * Search attribution.
     * </pre>
     *
     * <code>GOOGLE_SEARCH_ATTRIBUTION_FIRST_CLICK = 102;</code>
     */
    GOOGLE_SEARCH_ATTRIBUTION_FIRST_CLICK(102),
    /**
     * <pre>
     * Attributes credit for a conversion equally across all of its clicks using
     * Google Search attribution.
     * </pre>
     *
     * <code>GOOGLE_SEARCH_ATTRIBUTION_LINEAR = 103;</code>
     */
    GOOGLE_SEARCH_ATTRIBUTION_LINEAR(103),
    /**
     * <pre>
     * Attributes exponentially more credit for a conversion to its more recent
     * clicks using Google Search attribution (half-life is 1 week).
     * </pre>
     *
     * <code>GOOGLE_SEARCH_ATTRIBUTION_TIME_DECAY = 104;</code>
     */
    GOOGLE_SEARCH_ATTRIBUTION_TIME_DECAY(104),
    /**
     * <pre>
     * Attributes 40% of the credit for a conversion to its first and last
     * clicks. Remaining 20% is evenly distributed across all other clicks. This
     * uses Google Search attribution.
     * </pre>
     *
     * <code>GOOGLE_SEARCH_ATTRIBUTION_POSITION_BASED = 105;</code>
     */
    GOOGLE_SEARCH_ATTRIBUTION_POSITION_BASED(105),
    /**
     * <pre>
     * Flexible model that uses machine learning to determine the appropriate
     * distribution of credit among clicks using Google Search attribution.
     * </pre>
     *
     * <code>GOOGLE_SEARCH_ATTRIBUTION_DATA_DRIVEN = 106;</code>
     */
    GOOGLE_SEARCH_ATTRIBUTION_DATA_DRIVEN(106),
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
     * Uses external attribution.
     * </pre>
     *
     * <code>EXTERNAL = 100;</code>
     */
    public static final int EXTERNAL_VALUE = 100;
    /**
     * <pre>
     * Attributes all credit for a conversion to its last click.
     * </pre>
     *
     * <code>GOOGLE_ADS_LAST_CLICK = 101;</code>
     */
    public static final int GOOGLE_ADS_LAST_CLICK_VALUE = 101;
    /**
     * <pre>
     * Attributes all credit for a conversion to its first click using Google
     * Search attribution.
     * </pre>
     *
     * <code>GOOGLE_SEARCH_ATTRIBUTION_FIRST_CLICK = 102;</code>
     */
    public static final int GOOGLE_SEARCH_ATTRIBUTION_FIRST_CLICK_VALUE = 102;
    /**
     * <pre>
     * Attributes credit for a conversion equally across all of its clicks using
     * Google Search attribution.
     * </pre>
     *
     * <code>GOOGLE_SEARCH_ATTRIBUTION_LINEAR = 103;</code>
     */
    public static final int GOOGLE_SEARCH_ATTRIBUTION_LINEAR_VALUE = 103;
    /**
     * <pre>
     * Attributes exponentially more credit for a conversion to its more recent
     * clicks using Google Search attribution (half-life is 1 week).
     * </pre>
     *
     * <code>GOOGLE_SEARCH_ATTRIBUTION_TIME_DECAY = 104;</code>
     */
    public static final int GOOGLE_SEARCH_ATTRIBUTION_TIME_DECAY_VALUE = 104;
    /**
     * <pre>
     * Attributes 40% of the credit for a conversion to its first and last
     * clicks. Remaining 20% is evenly distributed across all other clicks. This
     * uses Google Search attribution.
     * </pre>
     *
     * <code>GOOGLE_SEARCH_ATTRIBUTION_POSITION_BASED = 105;</code>
     */
    public static final int GOOGLE_SEARCH_ATTRIBUTION_POSITION_BASED_VALUE = 105;
    /**
     * <pre>
     * Flexible model that uses machine learning to determine the appropriate
     * distribution of credit among clicks using Google Search attribution.
     * </pre>
     *
     * <code>GOOGLE_SEARCH_ATTRIBUTION_DATA_DRIVEN = 106;</code>
     */
    public static final int GOOGLE_SEARCH_ATTRIBUTION_DATA_DRIVEN_VALUE = 106;


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
    public static AttributionModel valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static AttributionModel forNumber(int value) {
      switch (value) {
        case 0: return UNSPECIFIED;
        case 1: return UNKNOWN;
        case 100: return EXTERNAL;
        case 101: return GOOGLE_ADS_LAST_CLICK;
        case 102: return GOOGLE_SEARCH_ATTRIBUTION_FIRST_CLICK;
        case 103: return GOOGLE_SEARCH_ATTRIBUTION_LINEAR;
        case 104: return GOOGLE_SEARCH_ATTRIBUTION_TIME_DECAY;
        case 105: return GOOGLE_SEARCH_ATTRIBUTION_POSITION_BASED;
        case 106: return GOOGLE_SEARCH_ATTRIBUTION_DATA_DRIVEN;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<AttributionModel>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        AttributionModel> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<AttributionModel>() {
            public AttributionModel findValueByNumber(int number) {
              return AttributionModel.forNumber(number);
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
      return com.google.ads.googleads.v16.enums.AttributionModelEnum.getDescriptor().getEnumTypes().get(0);
    }

    private static final AttributionModel[] VALUES = values();

    public static AttributionModel valueOf(
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

    private AttributionModel(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:google.ads.googleads.v16.enums.AttributionModelEnum.AttributionModel)
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
    if (!(obj instanceof com.google.ads.googleads.v16.enums.AttributionModelEnum)) {
      return super.equals(obj);
    }
    com.google.ads.googleads.v16.enums.AttributionModelEnum other = (com.google.ads.googleads.v16.enums.AttributionModelEnum) obj;

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

  public static com.google.ads.googleads.v16.enums.AttributionModelEnum parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v16.enums.AttributionModelEnum parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v16.enums.AttributionModelEnum parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v16.enums.AttributionModelEnum parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v16.enums.AttributionModelEnum parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v16.enums.AttributionModelEnum parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v16.enums.AttributionModelEnum parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v16.enums.AttributionModelEnum parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.google.ads.googleads.v16.enums.AttributionModelEnum parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.ads.googleads.v16.enums.AttributionModelEnum parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v16.enums.AttributionModelEnum parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v16.enums.AttributionModelEnum parseFrom(
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
  public static Builder newBuilder(com.google.ads.googleads.v16.enums.AttributionModelEnum prototype) {
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
   * Container for enum representing the attribution model that describes how to
   * distribute credit for a particular conversion across potentially many prior
   * interactions.
   * </pre>
   *
   * Protobuf type {@code google.ads.googleads.v16.enums.AttributionModelEnum}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.ads.googleads.v16.enums.AttributionModelEnum)
      com.google.ads.googleads.v16.enums.AttributionModelEnumOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.ads.googleads.v16.enums.AttributionModelProto.internal_static_google_ads_googleads_v16_enums_AttributionModelEnum_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.ads.googleads.v16.enums.AttributionModelProto.internal_static_google_ads_googleads_v16_enums_AttributionModelEnum_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.ads.googleads.v16.enums.AttributionModelEnum.class, com.google.ads.googleads.v16.enums.AttributionModelEnum.Builder.class);
    }

    // Construct using com.google.ads.googleads.v16.enums.AttributionModelEnum.newBuilder()
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
      return com.google.ads.googleads.v16.enums.AttributionModelProto.internal_static_google_ads_googleads_v16_enums_AttributionModelEnum_descriptor;
    }

    @java.lang.Override
    public com.google.ads.googleads.v16.enums.AttributionModelEnum getDefaultInstanceForType() {
      return com.google.ads.googleads.v16.enums.AttributionModelEnum.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.ads.googleads.v16.enums.AttributionModelEnum build() {
      com.google.ads.googleads.v16.enums.AttributionModelEnum result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.ads.googleads.v16.enums.AttributionModelEnum buildPartial() {
      com.google.ads.googleads.v16.enums.AttributionModelEnum result = new com.google.ads.googleads.v16.enums.AttributionModelEnum(this);
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
      if (other instanceof com.google.ads.googleads.v16.enums.AttributionModelEnum) {
        return mergeFrom((com.google.ads.googleads.v16.enums.AttributionModelEnum)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.ads.googleads.v16.enums.AttributionModelEnum other) {
      if (other == com.google.ads.googleads.v16.enums.AttributionModelEnum.getDefaultInstance()) return this;
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


    // @@protoc_insertion_point(builder_scope:google.ads.googleads.v16.enums.AttributionModelEnum)
  }

  // @@protoc_insertion_point(class_scope:google.ads.googleads.v16.enums.AttributionModelEnum)
  private static final com.google.ads.googleads.v16.enums.AttributionModelEnum DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.ads.googleads.v16.enums.AttributionModelEnum();
  }

  public static com.google.ads.googleads.v16.enums.AttributionModelEnum getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<AttributionModelEnum>
      PARSER = new com.google.protobuf.AbstractParser<AttributionModelEnum>() {
    @java.lang.Override
    public AttributionModelEnum parsePartialFrom(
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

  public static com.google.protobuf.Parser<AttributionModelEnum> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<AttributionModelEnum> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.ads.googleads.v16.enums.AttributionModelEnum getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

