// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v16/enums/listing_group_filter_type_enum.proto

// Protobuf Java Version: 3.25.3
package com.google.ads.googleads.v16.enums;

/**
 * <pre>
 * Container for enum describing the type of the listing group filter node.
 * </pre>
 *
 * Protobuf type {@code google.ads.googleads.v16.enums.ListingGroupFilterTypeEnum}
 */
public final class ListingGroupFilterTypeEnum extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.ads.googleads.v16.enums.ListingGroupFilterTypeEnum)
    ListingGroupFilterTypeEnumOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ListingGroupFilterTypeEnum.newBuilder() to construct.
  private ListingGroupFilterTypeEnum(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ListingGroupFilterTypeEnum() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ListingGroupFilterTypeEnum();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.ads.googleads.v16.enums.ListingGroupFilterTypeEnumProto.internal_static_google_ads_googleads_v16_enums_ListingGroupFilterTypeEnum_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.ads.googleads.v16.enums.ListingGroupFilterTypeEnumProto.internal_static_google_ads_googleads_v16_enums_ListingGroupFilterTypeEnum_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.ads.googleads.v16.enums.ListingGroupFilterTypeEnum.class, com.google.ads.googleads.v16.enums.ListingGroupFilterTypeEnum.Builder.class);
  }

  /**
   * <pre>
   * The type of the listing group filter.
   * </pre>
   *
   * Protobuf enum {@code google.ads.googleads.v16.enums.ListingGroupFilterTypeEnum.ListingGroupFilterType}
   */
  public enum ListingGroupFilterType
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
     * Subdivision of products along some listing dimensions.
     * </pre>
     *
     * <code>SUBDIVISION = 2;</code>
     */
    SUBDIVISION(2),
    /**
     * <pre>
     * An included listing group filter leaf node.
     * </pre>
     *
     * <code>UNIT_INCLUDED = 3;</code>
     */
    UNIT_INCLUDED(3),
    /**
     * <pre>
     * An excluded listing group filter leaf node.
     * </pre>
     *
     * <code>UNIT_EXCLUDED = 4;</code>
     */
    UNIT_EXCLUDED(4),
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
     * Subdivision of products along some listing dimensions.
     * </pre>
     *
     * <code>SUBDIVISION = 2;</code>
     */
    public static final int SUBDIVISION_VALUE = 2;
    /**
     * <pre>
     * An included listing group filter leaf node.
     * </pre>
     *
     * <code>UNIT_INCLUDED = 3;</code>
     */
    public static final int UNIT_INCLUDED_VALUE = 3;
    /**
     * <pre>
     * An excluded listing group filter leaf node.
     * </pre>
     *
     * <code>UNIT_EXCLUDED = 4;</code>
     */
    public static final int UNIT_EXCLUDED_VALUE = 4;


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
    public static ListingGroupFilterType valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static ListingGroupFilterType forNumber(int value) {
      switch (value) {
        case 0: return UNSPECIFIED;
        case 1: return UNKNOWN;
        case 2: return SUBDIVISION;
        case 3: return UNIT_INCLUDED;
        case 4: return UNIT_EXCLUDED;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<ListingGroupFilterType>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        ListingGroupFilterType> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<ListingGroupFilterType>() {
            public ListingGroupFilterType findValueByNumber(int number) {
              return ListingGroupFilterType.forNumber(number);
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
      return com.google.ads.googleads.v16.enums.ListingGroupFilterTypeEnum.getDescriptor().getEnumTypes().get(0);
    }

    private static final ListingGroupFilterType[] VALUES = values();

    public static ListingGroupFilterType valueOf(
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

    private ListingGroupFilterType(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:google.ads.googleads.v16.enums.ListingGroupFilterTypeEnum.ListingGroupFilterType)
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
    if (!(obj instanceof com.google.ads.googleads.v16.enums.ListingGroupFilterTypeEnum)) {
      return super.equals(obj);
    }
    com.google.ads.googleads.v16.enums.ListingGroupFilterTypeEnum other = (com.google.ads.googleads.v16.enums.ListingGroupFilterTypeEnum) obj;

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

  public static com.google.ads.googleads.v16.enums.ListingGroupFilterTypeEnum parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v16.enums.ListingGroupFilterTypeEnum parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v16.enums.ListingGroupFilterTypeEnum parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v16.enums.ListingGroupFilterTypeEnum parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v16.enums.ListingGroupFilterTypeEnum parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v16.enums.ListingGroupFilterTypeEnum parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v16.enums.ListingGroupFilterTypeEnum parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v16.enums.ListingGroupFilterTypeEnum parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.google.ads.googleads.v16.enums.ListingGroupFilterTypeEnum parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.ads.googleads.v16.enums.ListingGroupFilterTypeEnum parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v16.enums.ListingGroupFilterTypeEnum parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v16.enums.ListingGroupFilterTypeEnum parseFrom(
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
  public static Builder newBuilder(com.google.ads.googleads.v16.enums.ListingGroupFilterTypeEnum prototype) {
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
   * Container for enum describing the type of the listing group filter node.
   * </pre>
   *
   * Protobuf type {@code google.ads.googleads.v16.enums.ListingGroupFilterTypeEnum}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.ads.googleads.v16.enums.ListingGroupFilterTypeEnum)
      com.google.ads.googleads.v16.enums.ListingGroupFilterTypeEnumOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.ads.googleads.v16.enums.ListingGroupFilterTypeEnumProto.internal_static_google_ads_googleads_v16_enums_ListingGroupFilterTypeEnum_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.ads.googleads.v16.enums.ListingGroupFilterTypeEnumProto.internal_static_google_ads_googleads_v16_enums_ListingGroupFilterTypeEnum_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.ads.googleads.v16.enums.ListingGroupFilterTypeEnum.class, com.google.ads.googleads.v16.enums.ListingGroupFilterTypeEnum.Builder.class);
    }

    // Construct using com.google.ads.googleads.v16.enums.ListingGroupFilterTypeEnum.newBuilder()
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
      return com.google.ads.googleads.v16.enums.ListingGroupFilterTypeEnumProto.internal_static_google_ads_googleads_v16_enums_ListingGroupFilterTypeEnum_descriptor;
    }

    @java.lang.Override
    public com.google.ads.googleads.v16.enums.ListingGroupFilterTypeEnum getDefaultInstanceForType() {
      return com.google.ads.googleads.v16.enums.ListingGroupFilterTypeEnum.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.ads.googleads.v16.enums.ListingGroupFilterTypeEnum build() {
      com.google.ads.googleads.v16.enums.ListingGroupFilterTypeEnum result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.ads.googleads.v16.enums.ListingGroupFilterTypeEnum buildPartial() {
      com.google.ads.googleads.v16.enums.ListingGroupFilterTypeEnum result = new com.google.ads.googleads.v16.enums.ListingGroupFilterTypeEnum(this);
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
      if (other instanceof com.google.ads.googleads.v16.enums.ListingGroupFilterTypeEnum) {
        return mergeFrom((com.google.ads.googleads.v16.enums.ListingGroupFilterTypeEnum)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.ads.googleads.v16.enums.ListingGroupFilterTypeEnum other) {
      if (other == com.google.ads.googleads.v16.enums.ListingGroupFilterTypeEnum.getDefaultInstance()) return this;
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


    // @@protoc_insertion_point(builder_scope:google.ads.googleads.v16.enums.ListingGroupFilterTypeEnum)
  }

  // @@protoc_insertion_point(class_scope:google.ads.googleads.v16.enums.ListingGroupFilterTypeEnum)
  private static final com.google.ads.googleads.v16.enums.ListingGroupFilterTypeEnum DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.ads.googleads.v16.enums.ListingGroupFilterTypeEnum();
  }

  public static com.google.ads.googleads.v16.enums.ListingGroupFilterTypeEnum getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ListingGroupFilterTypeEnum>
      PARSER = new com.google.protobuf.AbstractParser<ListingGroupFilterTypeEnum>() {
    @java.lang.Override
    public ListingGroupFilterTypeEnum parsePartialFrom(
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

  public static com.google.protobuf.Parser<ListingGroupFilterTypeEnum> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ListingGroupFilterTypeEnum> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.ads.googleads.v16.enums.ListingGroupFilterTypeEnum getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

