// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v15/enums/asset_offline_evaluation_error_reasons.proto

// Protobuf Java Version: 3.25.3
package com.google.ads.googleads.v15.enums;

/**
 * <pre>
 * Provides the quality evaluation disapproval reason of an asset.
 * </pre>
 *
 * Protobuf type {@code google.ads.googleads.v15.enums.AssetOfflineEvaluationErrorReasonsEnum}
 */
public final class AssetOfflineEvaluationErrorReasonsEnum extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.ads.googleads.v15.enums.AssetOfflineEvaluationErrorReasonsEnum)
    AssetOfflineEvaluationErrorReasonsEnumOrBuilder {
private static final long serialVersionUID = 0L;
  // Use AssetOfflineEvaluationErrorReasonsEnum.newBuilder() to construct.
  private AssetOfflineEvaluationErrorReasonsEnum(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private AssetOfflineEvaluationErrorReasonsEnum() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new AssetOfflineEvaluationErrorReasonsEnum();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.ads.googleads.v15.enums.AssetOfflineEvaluationErrorReasonsProto.internal_static_google_ads_googleads_v15_enums_AssetOfflineEvaluationErrorReasonsEnum_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.ads.googleads.v15.enums.AssetOfflineEvaluationErrorReasonsProto.internal_static_google_ads_googleads_v15_enums_AssetOfflineEvaluationErrorReasonsEnum_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.ads.googleads.v15.enums.AssetOfflineEvaluationErrorReasonsEnum.class, com.google.ads.googleads.v15.enums.AssetOfflineEvaluationErrorReasonsEnum.Builder.class);
  }

  /**
   * <pre>
   * Enum describing the quality evaluation disapproval reason of an asset.
   * </pre>
   *
   * Protobuf enum {@code google.ads.googleads.v15.enums.AssetOfflineEvaluationErrorReasonsEnum.AssetOfflineEvaluationErrorReasons}
   */
  public enum AssetOfflineEvaluationErrorReasons
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
     * One or more descriptions repeats its corresponding row header.
     * </pre>
     *
     * <code>PRICE_ASSET_DESCRIPTION_REPEATS_ROW_HEADER = 2;</code>
     */
    PRICE_ASSET_DESCRIPTION_REPEATS_ROW_HEADER(2),
    /**
     * <pre>
     * Price asset contains repetitive headers.
     * </pre>
     *
     * <code>PRICE_ASSET_REPETITIVE_HEADERS = 3;</code>
     */
    PRICE_ASSET_REPETITIVE_HEADERS(3),
    /**
     * <pre>
     * Price item header is not relevant to the price type.
     * </pre>
     *
     * <code>PRICE_ASSET_HEADER_INCOMPATIBLE_WITH_PRICE_TYPE = 4;</code>
     */
    PRICE_ASSET_HEADER_INCOMPATIBLE_WITH_PRICE_TYPE(4),
    /**
     * <pre>
     * Price item description is not relevant to the item header.
     * </pre>
     *
     * <code>PRICE_ASSET_DESCRIPTION_INCOMPATIBLE_WITH_ITEM_HEADER = 5;</code>
     */
    PRICE_ASSET_DESCRIPTION_INCOMPATIBLE_WITH_ITEM_HEADER(5),
    /**
     * <pre>
     * Price asset has a price qualifier in a description.
     * </pre>
     *
     * <code>PRICE_ASSET_DESCRIPTION_HAS_PRICE_QUALIFIER = 6;</code>
     */
    PRICE_ASSET_DESCRIPTION_HAS_PRICE_QUALIFIER(6),
    /**
     * <pre>
     * Unsupported language for price assets
     * </pre>
     *
     * <code>PRICE_ASSET_UNSUPPORTED_LANGUAGE = 7;</code>
     */
    PRICE_ASSET_UNSUPPORTED_LANGUAGE(7),
    /**
     * <pre>
     * Human raters identified an issue with the price asset that isn't captured
     * by other error reasons. The primary purpose of this value is to represent
     * legacy FeedItem disapprovals that are no longer produced.
     * </pre>
     *
     * <code>PRICE_ASSET_OTHER_ERROR = 8;</code>
     */
    PRICE_ASSET_OTHER_ERROR(8),
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
     * One or more descriptions repeats its corresponding row header.
     * </pre>
     *
     * <code>PRICE_ASSET_DESCRIPTION_REPEATS_ROW_HEADER = 2;</code>
     */
    public static final int PRICE_ASSET_DESCRIPTION_REPEATS_ROW_HEADER_VALUE = 2;
    /**
     * <pre>
     * Price asset contains repetitive headers.
     * </pre>
     *
     * <code>PRICE_ASSET_REPETITIVE_HEADERS = 3;</code>
     */
    public static final int PRICE_ASSET_REPETITIVE_HEADERS_VALUE = 3;
    /**
     * <pre>
     * Price item header is not relevant to the price type.
     * </pre>
     *
     * <code>PRICE_ASSET_HEADER_INCOMPATIBLE_WITH_PRICE_TYPE = 4;</code>
     */
    public static final int PRICE_ASSET_HEADER_INCOMPATIBLE_WITH_PRICE_TYPE_VALUE = 4;
    /**
     * <pre>
     * Price item description is not relevant to the item header.
     * </pre>
     *
     * <code>PRICE_ASSET_DESCRIPTION_INCOMPATIBLE_WITH_ITEM_HEADER = 5;</code>
     */
    public static final int PRICE_ASSET_DESCRIPTION_INCOMPATIBLE_WITH_ITEM_HEADER_VALUE = 5;
    /**
     * <pre>
     * Price asset has a price qualifier in a description.
     * </pre>
     *
     * <code>PRICE_ASSET_DESCRIPTION_HAS_PRICE_QUALIFIER = 6;</code>
     */
    public static final int PRICE_ASSET_DESCRIPTION_HAS_PRICE_QUALIFIER_VALUE = 6;
    /**
     * <pre>
     * Unsupported language for price assets
     * </pre>
     *
     * <code>PRICE_ASSET_UNSUPPORTED_LANGUAGE = 7;</code>
     */
    public static final int PRICE_ASSET_UNSUPPORTED_LANGUAGE_VALUE = 7;
    /**
     * <pre>
     * Human raters identified an issue with the price asset that isn't captured
     * by other error reasons. The primary purpose of this value is to represent
     * legacy FeedItem disapprovals that are no longer produced.
     * </pre>
     *
     * <code>PRICE_ASSET_OTHER_ERROR = 8;</code>
     */
    public static final int PRICE_ASSET_OTHER_ERROR_VALUE = 8;


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
    public static AssetOfflineEvaluationErrorReasons valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static AssetOfflineEvaluationErrorReasons forNumber(int value) {
      switch (value) {
        case 0: return UNSPECIFIED;
        case 1: return UNKNOWN;
        case 2: return PRICE_ASSET_DESCRIPTION_REPEATS_ROW_HEADER;
        case 3: return PRICE_ASSET_REPETITIVE_HEADERS;
        case 4: return PRICE_ASSET_HEADER_INCOMPATIBLE_WITH_PRICE_TYPE;
        case 5: return PRICE_ASSET_DESCRIPTION_INCOMPATIBLE_WITH_ITEM_HEADER;
        case 6: return PRICE_ASSET_DESCRIPTION_HAS_PRICE_QUALIFIER;
        case 7: return PRICE_ASSET_UNSUPPORTED_LANGUAGE;
        case 8: return PRICE_ASSET_OTHER_ERROR;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<AssetOfflineEvaluationErrorReasons>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        AssetOfflineEvaluationErrorReasons> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<AssetOfflineEvaluationErrorReasons>() {
            public AssetOfflineEvaluationErrorReasons findValueByNumber(int number) {
              return AssetOfflineEvaluationErrorReasons.forNumber(number);
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
      return com.google.ads.googleads.v15.enums.AssetOfflineEvaluationErrorReasonsEnum.getDescriptor().getEnumTypes().get(0);
    }

    private static final AssetOfflineEvaluationErrorReasons[] VALUES = values();

    public static AssetOfflineEvaluationErrorReasons valueOf(
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

    private AssetOfflineEvaluationErrorReasons(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:google.ads.googleads.v15.enums.AssetOfflineEvaluationErrorReasonsEnum.AssetOfflineEvaluationErrorReasons)
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
    if (!(obj instanceof com.google.ads.googleads.v15.enums.AssetOfflineEvaluationErrorReasonsEnum)) {
      return super.equals(obj);
    }
    com.google.ads.googleads.v15.enums.AssetOfflineEvaluationErrorReasonsEnum other = (com.google.ads.googleads.v15.enums.AssetOfflineEvaluationErrorReasonsEnum) obj;

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

  public static com.google.ads.googleads.v15.enums.AssetOfflineEvaluationErrorReasonsEnum parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v15.enums.AssetOfflineEvaluationErrorReasonsEnum parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v15.enums.AssetOfflineEvaluationErrorReasonsEnum parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v15.enums.AssetOfflineEvaluationErrorReasonsEnum parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v15.enums.AssetOfflineEvaluationErrorReasonsEnum parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v15.enums.AssetOfflineEvaluationErrorReasonsEnum parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v15.enums.AssetOfflineEvaluationErrorReasonsEnum parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v15.enums.AssetOfflineEvaluationErrorReasonsEnum parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.google.ads.googleads.v15.enums.AssetOfflineEvaluationErrorReasonsEnum parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.ads.googleads.v15.enums.AssetOfflineEvaluationErrorReasonsEnum parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v15.enums.AssetOfflineEvaluationErrorReasonsEnum parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v15.enums.AssetOfflineEvaluationErrorReasonsEnum parseFrom(
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
  public static Builder newBuilder(com.google.ads.googleads.v15.enums.AssetOfflineEvaluationErrorReasonsEnum prototype) {
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
   * Provides the quality evaluation disapproval reason of an asset.
   * </pre>
   *
   * Protobuf type {@code google.ads.googleads.v15.enums.AssetOfflineEvaluationErrorReasonsEnum}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.ads.googleads.v15.enums.AssetOfflineEvaluationErrorReasonsEnum)
      com.google.ads.googleads.v15.enums.AssetOfflineEvaluationErrorReasonsEnumOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.ads.googleads.v15.enums.AssetOfflineEvaluationErrorReasonsProto.internal_static_google_ads_googleads_v15_enums_AssetOfflineEvaluationErrorReasonsEnum_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.ads.googleads.v15.enums.AssetOfflineEvaluationErrorReasonsProto.internal_static_google_ads_googleads_v15_enums_AssetOfflineEvaluationErrorReasonsEnum_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.ads.googleads.v15.enums.AssetOfflineEvaluationErrorReasonsEnum.class, com.google.ads.googleads.v15.enums.AssetOfflineEvaluationErrorReasonsEnum.Builder.class);
    }

    // Construct using com.google.ads.googleads.v15.enums.AssetOfflineEvaluationErrorReasonsEnum.newBuilder()
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
      return com.google.ads.googleads.v15.enums.AssetOfflineEvaluationErrorReasonsProto.internal_static_google_ads_googleads_v15_enums_AssetOfflineEvaluationErrorReasonsEnum_descriptor;
    }

    @java.lang.Override
    public com.google.ads.googleads.v15.enums.AssetOfflineEvaluationErrorReasonsEnum getDefaultInstanceForType() {
      return com.google.ads.googleads.v15.enums.AssetOfflineEvaluationErrorReasonsEnum.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.ads.googleads.v15.enums.AssetOfflineEvaluationErrorReasonsEnum build() {
      com.google.ads.googleads.v15.enums.AssetOfflineEvaluationErrorReasonsEnum result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.ads.googleads.v15.enums.AssetOfflineEvaluationErrorReasonsEnum buildPartial() {
      com.google.ads.googleads.v15.enums.AssetOfflineEvaluationErrorReasonsEnum result = new com.google.ads.googleads.v15.enums.AssetOfflineEvaluationErrorReasonsEnum(this);
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
      if (other instanceof com.google.ads.googleads.v15.enums.AssetOfflineEvaluationErrorReasonsEnum) {
        return mergeFrom((com.google.ads.googleads.v15.enums.AssetOfflineEvaluationErrorReasonsEnum)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.ads.googleads.v15.enums.AssetOfflineEvaluationErrorReasonsEnum other) {
      if (other == com.google.ads.googleads.v15.enums.AssetOfflineEvaluationErrorReasonsEnum.getDefaultInstance()) return this;
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


    // @@protoc_insertion_point(builder_scope:google.ads.googleads.v15.enums.AssetOfflineEvaluationErrorReasonsEnum)
  }

  // @@protoc_insertion_point(class_scope:google.ads.googleads.v15.enums.AssetOfflineEvaluationErrorReasonsEnum)
  private static final com.google.ads.googleads.v15.enums.AssetOfflineEvaluationErrorReasonsEnum DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.ads.googleads.v15.enums.AssetOfflineEvaluationErrorReasonsEnum();
  }

  public static com.google.ads.googleads.v15.enums.AssetOfflineEvaluationErrorReasonsEnum getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<AssetOfflineEvaluationErrorReasonsEnum>
      PARSER = new com.google.protobuf.AbstractParser<AssetOfflineEvaluationErrorReasonsEnum>() {
    @java.lang.Override
    public AssetOfflineEvaluationErrorReasonsEnum parsePartialFrom(
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

  public static com.google.protobuf.Parser<AssetOfflineEvaluationErrorReasonsEnum> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<AssetOfflineEvaluationErrorReasonsEnum> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.ads.googleads.v15.enums.AssetOfflineEvaluationErrorReasonsEnum getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

