// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v17/enums/served_asset_field_type.proto

// Protobuf Java Version: 3.25.3
package com.google.ads.googleads.v17.enums;

/**
 * <pre>
 * Container for enum describing possible asset field types.
 * </pre>
 *
 * Protobuf type {@code google.ads.googleads.v17.enums.ServedAssetFieldTypeEnum}
 */
public final class ServedAssetFieldTypeEnum extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.ads.googleads.v17.enums.ServedAssetFieldTypeEnum)
    ServedAssetFieldTypeEnumOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ServedAssetFieldTypeEnum.newBuilder() to construct.
  private ServedAssetFieldTypeEnum(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ServedAssetFieldTypeEnum() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ServedAssetFieldTypeEnum();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.ads.googleads.v17.enums.ServedAssetFieldTypeProto.internal_static_google_ads_googleads_v17_enums_ServedAssetFieldTypeEnum_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.ads.googleads.v17.enums.ServedAssetFieldTypeProto.internal_static_google_ads_googleads_v17_enums_ServedAssetFieldTypeEnum_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.ads.googleads.v17.enums.ServedAssetFieldTypeEnum.class, com.google.ads.googleads.v17.enums.ServedAssetFieldTypeEnum.Builder.class);
  }

  /**
   * <pre>
   * The possible asset field types.
   * </pre>
   *
   * Protobuf enum {@code google.ads.googleads.v17.enums.ServedAssetFieldTypeEnum.ServedAssetFieldType}
   */
  public enum ServedAssetFieldType
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <pre>
     * No value has been specified.
     * </pre>
     *
     * <code>UNSPECIFIED = 0;</code>
     */
    UNSPECIFIED(0),
    /**
     * <pre>
     * The received value is not known in this version.
     *
     * This is a response-only value.
     * </pre>
     *
     * <code>UNKNOWN = 1;</code>
     */
    UNKNOWN(1),
    /**
     * <pre>
     * The asset is used in headline 1.
     * </pre>
     *
     * <code>HEADLINE_1 = 2;</code>
     */
    HEADLINE_1(2),
    /**
     * <pre>
     * The asset is used in headline 2.
     * </pre>
     *
     * <code>HEADLINE_2 = 3;</code>
     */
    HEADLINE_2(3),
    /**
     * <pre>
     * The asset is used in headline 3.
     * </pre>
     *
     * <code>HEADLINE_3 = 4;</code>
     */
    HEADLINE_3(4),
    /**
     * <pre>
     * The asset is used in description 1.
     * </pre>
     *
     * <code>DESCRIPTION_1 = 5;</code>
     */
    DESCRIPTION_1(5),
    /**
     * <pre>
     * The asset is used in description 2.
     * </pre>
     *
     * <code>DESCRIPTION_2 = 6;</code>
     */
    DESCRIPTION_2(6),
    /**
     * <pre>
     * The asset was used in a headline. Use this only if there is only one
     * headline in the ad. Otherwise, use the HEADLINE_1, HEADLINE_2 or
     * HEADLINE_3 enums
     * </pre>
     *
     * <code>HEADLINE = 7;</code>
     */
    HEADLINE(7),
    /**
     * <pre>
     * The asset was used as a headline in portrait image.
     * </pre>
     *
     * <code>HEADLINE_IN_PORTRAIT = 8;</code>
     */
    HEADLINE_IN_PORTRAIT(8),
    /**
     * <pre>
     * The asset was used in a long headline (used in MultiAssetResponsiveAd).
     * </pre>
     *
     * <code>LONG_HEADLINE = 9;</code>
     */
    LONG_HEADLINE(9),
    /**
     * <pre>
     * The asset was used in a description. Use this only if there is only one
     * description in the ad. Otherwise, use the DESCRIPTION_1 or DESCRIPTION_&#64;
     * enums
     * </pre>
     *
     * <code>DESCRIPTION = 10;</code>
     */
    DESCRIPTION(10),
    /**
     * <pre>
     * The asset was used as description in portrait image.
     * </pre>
     *
     * <code>DESCRIPTION_IN_PORTRAIT = 11;</code>
     */
    DESCRIPTION_IN_PORTRAIT(11),
    /**
     * <pre>
     * The asset was used as business name in portrait image.
     * </pre>
     *
     * <code>BUSINESS_NAME_IN_PORTRAIT = 12;</code>
     */
    BUSINESS_NAME_IN_PORTRAIT(12),
    /**
     * <pre>
     * The asset was used as business name.
     * </pre>
     *
     * <code>BUSINESS_NAME = 13;</code>
     */
    BUSINESS_NAME(13),
    /**
     * <pre>
     * The asset was used as a marketing image.
     * </pre>
     *
     * <code>MARKETING_IMAGE = 14;</code>
     */
    MARKETING_IMAGE(14),
    /**
     * <pre>
     * The asset was used as a marketing image in portrait image.
     * </pre>
     *
     * <code>MARKETING_IMAGE_IN_PORTRAIT = 15;</code>
     */
    MARKETING_IMAGE_IN_PORTRAIT(15),
    /**
     * <pre>
     * The asset was used as a square marketing image.
     * </pre>
     *
     * <code>SQUARE_MARKETING_IMAGE = 16;</code>
     */
    SQUARE_MARKETING_IMAGE(16),
    /**
     * <pre>
     * The asset was used as a portrait marketing image.
     * </pre>
     *
     * <code>PORTRAIT_MARKETING_IMAGE = 17;</code>
     */
    PORTRAIT_MARKETING_IMAGE(17),
    /**
     * <pre>
     * The asset was used as a logo.
     * </pre>
     *
     * <code>LOGO = 18;</code>
     */
    LOGO(18),
    /**
     * <pre>
     * The asset was used as a landscape logo.
     * </pre>
     *
     * <code>LANDSCAPE_LOGO = 19;</code>
     */
    LANDSCAPE_LOGO(19),
    /**
     * <pre>
     * The asset was used as a call-to-action.
     * </pre>
     *
     * <code>CALL_TO_ACTION = 20;</code>
     */
    CALL_TO_ACTION(20),
    /**
     * <pre>
     * The asset was used as a YouTube video.
     * </pre>
     *
     * <code>YOU_TUBE_VIDEO = 21;</code>
     */
    YOU_TUBE_VIDEO(21),
    /**
     * <pre>
     * This asset is used as a sitelink.
     * </pre>
     *
     * <code>SITELINK = 22;</code>
     */
    SITELINK(22),
    /**
     * <pre>
     * This asset is used as a call.
     * </pre>
     *
     * <code>CALL = 23;</code>
     */
    CALL(23),
    /**
     * <pre>
     * This asset is used as a mobile app.
     * </pre>
     *
     * <code>MOBILE_APP = 24;</code>
     */
    MOBILE_APP(24),
    /**
     * <pre>
     * This asset is used as a callout.
     * </pre>
     *
     * <code>CALLOUT = 25;</code>
     */
    CALLOUT(25),
    /**
     * <pre>
     * This asset is used as a structured snippet.
     * </pre>
     *
     * <code>STRUCTURED_SNIPPET = 26;</code>
     */
    STRUCTURED_SNIPPET(26),
    /**
     * <pre>
     * This asset is used as a price.
     * </pre>
     *
     * <code>PRICE = 27;</code>
     */
    PRICE(27),
    /**
     * <pre>
     * This asset is used as a promotion.
     * </pre>
     *
     * <code>PROMOTION = 28;</code>
     */
    PROMOTION(28),
    /**
     * <pre>
     * This asset is used as an image.
     * </pre>
     *
     * <code>AD_IMAGE = 29;</code>
     */
    AD_IMAGE(29),
    /**
     * <pre>
     * The asset is used as a lead form.
     * </pre>
     *
     * <code>LEAD_FORM = 30;</code>
     */
    LEAD_FORM(30),
    /**
     * <pre>
     * The asset is used as a business logo.
     * </pre>
     *
     * <code>BUSINESS_LOGO = 31;</code>
     */
    BUSINESS_LOGO(31),
    UNRECOGNIZED(-1),
    ;

    /**
     * <pre>
     * No value has been specified.
     * </pre>
     *
     * <code>UNSPECIFIED = 0;</code>
     */
    public static final int UNSPECIFIED_VALUE = 0;
    /**
     * <pre>
     * The received value is not known in this version.
     *
     * This is a response-only value.
     * </pre>
     *
     * <code>UNKNOWN = 1;</code>
     */
    public static final int UNKNOWN_VALUE = 1;
    /**
     * <pre>
     * The asset is used in headline 1.
     * </pre>
     *
     * <code>HEADLINE_1 = 2;</code>
     */
    public static final int HEADLINE_1_VALUE = 2;
    /**
     * <pre>
     * The asset is used in headline 2.
     * </pre>
     *
     * <code>HEADLINE_2 = 3;</code>
     */
    public static final int HEADLINE_2_VALUE = 3;
    /**
     * <pre>
     * The asset is used in headline 3.
     * </pre>
     *
     * <code>HEADLINE_3 = 4;</code>
     */
    public static final int HEADLINE_3_VALUE = 4;
    /**
     * <pre>
     * The asset is used in description 1.
     * </pre>
     *
     * <code>DESCRIPTION_1 = 5;</code>
     */
    public static final int DESCRIPTION_1_VALUE = 5;
    /**
     * <pre>
     * The asset is used in description 2.
     * </pre>
     *
     * <code>DESCRIPTION_2 = 6;</code>
     */
    public static final int DESCRIPTION_2_VALUE = 6;
    /**
     * <pre>
     * The asset was used in a headline. Use this only if there is only one
     * headline in the ad. Otherwise, use the HEADLINE_1, HEADLINE_2 or
     * HEADLINE_3 enums
     * </pre>
     *
     * <code>HEADLINE = 7;</code>
     */
    public static final int HEADLINE_VALUE = 7;
    /**
     * <pre>
     * The asset was used as a headline in portrait image.
     * </pre>
     *
     * <code>HEADLINE_IN_PORTRAIT = 8;</code>
     */
    public static final int HEADLINE_IN_PORTRAIT_VALUE = 8;
    /**
     * <pre>
     * The asset was used in a long headline (used in MultiAssetResponsiveAd).
     * </pre>
     *
     * <code>LONG_HEADLINE = 9;</code>
     */
    public static final int LONG_HEADLINE_VALUE = 9;
    /**
     * <pre>
     * The asset was used in a description. Use this only if there is only one
     * description in the ad. Otherwise, use the DESCRIPTION_1 or DESCRIPTION_&#64;
     * enums
     * </pre>
     *
     * <code>DESCRIPTION = 10;</code>
     */
    public static final int DESCRIPTION_VALUE = 10;
    /**
     * <pre>
     * The asset was used as description in portrait image.
     * </pre>
     *
     * <code>DESCRIPTION_IN_PORTRAIT = 11;</code>
     */
    public static final int DESCRIPTION_IN_PORTRAIT_VALUE = 11;
    /**
     * <pre>
     * The asset was used as business name in portrait image.
     * </pre>
     *
     * <code>BUSINESS_NAME_IN_PORTRAIT = 12;</code>
     */
    public static final int BUSINESS_NAME_IN_PORTRAIT_VALUE = 12;
    /**
     * <pre>
     * The asset was used as business name.
     * </pre>
     *
     * <code>BUSINESS_NAME = 13;</code>
     */
    public static final int BUSINESS_NAME_VALUE = 13;
    /**
     * <pre>
     * The asset was used as a marketing image.
     * </pre>
     *
     * <code>MARKETING_IMAGE = 14;</code>
     */
    public static final int MARKETING_IMAGE_VALUE = 14;
    /**
     * <pre>
     * The asset was used as a marketing image in portrait image.
     * </pre>
     *
     * <code>MARKETING_IMAGE_IN_PORTRAIT = 15;</code>
     */
    public static final int MARKETING_IMAGE_IN_PORTRAIT_VALUE = 15;
    /**
     * <pre>
     * The asset was used as a square marketing image.
     * </pre>
     *
     * <code>SQUARE_MARKETING_IMAGE = 16;</code>
     */
    public static final int SQUARE_MARKETING_IMAGE_VALUE = 16;
    /**
     * <pre>
     * The asset was used as a portrait marketing image.
     * </pre>
     *
     * <code>PORTRAIT_MARKETING_IMAGE = 17;</code>
     */
    public static final int PORTRAIT_MARKETING_IMAGE_VALUE = 17;
    /**
     * <pre>
     * The asset was used as a logo.
     * </pre>
     *
     * <code>LOGO = 18;</code>
     */
    public static final int LOGO_VALUE = 18;
    /**
     * <pre>
     * The asset was used as a landscape logo.
     * </pre>
     *
     * <code>LANDSCAPE_LOGO = 19;</code>
     */
    public static final int LANDSCAPE_LOGO_VALUE = 19;
    /**
     * <pre>
     * The asset was used as a call-to-action.
     * </pre>
     *
     * <code>CALL_TO_ACTION = 20;</code>
     */
    public static final int CALL_TO_ACTION_VALUE = 20;
    /**
     * <pre>
     * The asset was used as a YouTube video.
     * </pre>
     *
     * <code>YOU_TUBE_VIDEO = 21;</code>
     */
    public static final int YOU_TUBE_VIDEO_VALUE = 21;
    /**
     * <pre>
     * This asset is used as a sitelink.
     * </pre>
     *
     * <code>SITELINK = 22;</code>
     */
    public static final int SITELINK_VALUE = 22;
    /**
     * <pre>
     * This asset is used as a call.
     * </pre>
     *
     * <code>CALL = 23;</code>
     */
    public static final int CALL_VALUE = 23;
    /**
     * <pre>
     * This asset is used as a mobile app.
     * </pre>
     *
     * <code>MOBILE_APP = 24;</code>
     */
    public static final int MOBILE_APP_VALUE = 24;
    /**
     * <pre>
     * This asset is used as a callout.
     * </pre>
     *
     * <code>CALLOUT = 25;</code>
     */
    public static final int CALLOUT_VALUE = 25;
    /**
     * <pre>
     * This asset is used as a structured snippet.
     * </pre>
     *
     * <code>STRUCTURED_SNIPPET = 26;</code>
     */
    public static final int STRUCTURED_SNIPPET_VALUE = 26;
    /**
     * <pre>
     * This asset is used as a price.
     * </pre>
     *
     * <code>PRICE = 27;</code>
     */
    public static final int PRICE_VALUE = 27;
    /**
     * <pre>
     * This asset is used as a promotion.
     * </pre>
     *
     * <code>PROMOTION = 28;</code>
     */
    public static final int PROMOTION_VALUE = 28;
    /**
     * <pre>
     * This asset is used as an image.
     * </pre>
     *
     * <code>AD_IMAGE = 29;</code>
     */
    public static final int AD_IMAGE_VALUE = 29;
    /**
     * <pre>
     * The asset is used as a lead form.
     * </pre>
     *
     * <code>LEAD_FORM = 30;</code>
     */
    public static final int LEAD_FORM_VALUE = 30;
    /**
     * <pre>
     * The asset is used as a business logo.
     * </pre>
     *
     * <code>BUSINESS_LOGO = 31;</code>
     */
    public static final int BUSINESS_LOGO_VALUE = 31;


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
    public static ServedAssetFieldType valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static ServedAssetFieldType forNumber(int value) {
      switch (value) {
        case 0: return UNSPECIFIED;
        case 1: return UNKNOWN;
        case 2: return HEADLINE_1;
        case 3: return HEADLINE_2;
        case 4: return HEADLINE_3;
        case 5: return DESCRIPTION_1;
        case 6: return DESCRIPTION_2;
        case 7: return HEADLINE;
        case 8: return HEADLINE_IN_PORTRAIT;
        case 9: return LONG_HEADLINE;
        case 10: return DESCRIPTION;
        case 11: return DESCRIPTION_IN_PORTRAIT;
        case 12: return BUSINESS_NAME_IN_PORTRAIT;
        case 13: return BUSINESS_NAME;
        case 14: return MARKETING_IMAGE;
        case 15: return MARKETING_IMAGE_IN_PORTRAIT;
        case 16: return SQUARE_MARKETING_IMAGE;
        case 17: return PORTRAIT_MARKETING_IMAGE;
        case 18: return LOGO;
        case 19: return LANDSCAPE_LOGO;
        case 20: return CALL_TO_ACTION;
        case 21: return YOU_TUBE_VIDEO;
        case 22: return SITELINK;
        case 23: return CALL;
        case 24: return MOBILE_APP;
        case 25: return CALLOUT;
        case 26: return STRUCTURED_SNIPPET;
        case 27: return PRICE;
        case 28: return PROMOTION;
        case 29: return AD_IMAGE;
        case 30: return LEAD_FORM;
        case 31: return BUSINESS_LOGO;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<ServedAssetFieldType>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        ServedAssetFieldType> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<ServedAssetFieldType>() {
            public ServedAssetFieldType findValueByNumber(int number) {
              return ServedAssetFieldType.forNumber(number);
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
      return com.google.ads.googleads.v17.enums.ServedAssetFieldTypeEnum.getDescriptor().getEnumTypes().get(0);
    }

    private static final ServedAssetFieldType[] VALUES = values();

    public static ServedAssetFieldType valueOf(
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

    private ServedAssetFieldType(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:google.ads.googleads.v17.enums.ServedAssetFieldTypeEnum.ServedAssetFieldType)
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
    if (!(obj instanceof com.google.ads.googleads.v17.enums.ServedAssetFieldTypeEnum)) {
      return super.equals(obj);
    }
    com.google.ads.googleads.v17.enums.ServedAssetFieldTypeEnum other = (com.google.ads.googleads.v17.enums.ServedAssetFieldTypeEnum) obj;

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

  public static com.google.ads.googleads.v17.enums.ServedAssetFieldTypeEnum parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v17.enums.ServedAssetFieldTypeEnum parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v17.enums.ServedAssetFieldTypeEnum parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v17.enums.ServedAssetFieldTypeEnum parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v17.enums.ServedAssetFieldTypeEnum parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v17.enums.ServedAssetFieldTypeEnum parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v17.enums.ServedAssetFieldTypeEnum parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v17.enums.ServedAssetFieldTypeEnum parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.google.ads.googleads.v17.enums.ServedAssetFieldTypeEnum parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.ads.googleads.v17.enums.ServedAssetFieldTypeEnum parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v17.enums.ServedAssetFieldTypeEnum parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v17.enums.ServedAssetFieldTypeEnum parseFrom(
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
  public static Builder newBuilder(com.google.ads.googleads.v17.enums.ServedAssetFieldTypeEnum prototype) {
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
   * Container for enum describing possible asset field types.
   * </pre>
   *
   * Protobuf type {@code google.ads.googleads.v17.enums.ServedAssetFieldTypeEnum}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.ads.googleads.v17.enums.ServedAssetFieldTypeEnum)
      com.google.ads.googleads.v17.enums.ServedAssetFieldTypeEnumOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.ads.googleads.v17.enums.ServedAssetFieldTypeProto.internal_static_google_ads_googleads_v17_enums_ServedAssetFieldTypeEnum_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.ads.googleads.v17.enums.ServedAssetFieldTypeProto.internal_static_google_ads_googleads_v17_enums_ServedAssetFieldTypeEnum_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.ads.googleads.v17.enums.ServedAssetFieldTypeEnum.class, com.google.ads.googleads.v17.enums.ServedAssetFieldTypeEnum.Builder.class);
    }

    // Construct using com.google.ads.googleads.v17.enums.ServedAssetFieldTypeEnum.newBuilder()
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
      return com.google.ads.googleads.v17.enums.ServedAssetFieldTypeProto.internal_static_google_ads_googleads_v17_enums_ServedAssetFieldTypeEnum_descriptor;
    }

    @java.lang.Override
    public com.google.ads.googleads.v17.enums.ServedAssetFieldTypeEnum getDefaultInstanceForType() {
      return com.google.ads.googleads.v17.enums.ServedAssetFieldTypeEnum.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.ads.googleads.v17.enums.ServedAssetFieldTypeEnum build() {
      com.google.ads.googleads.v17.enums.ServedAssetFieldTypeEnum result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.ads.googleads.v17.enums.ServedAssetFieldTypeEnum buildPartial() {
      com.google.ads.googleads.v17.enums.ServedAssetFieldTypeEnum result = new com.google.ads.googleads.v17.enums.ServedAssetFieldTypeEnum(this);
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
      if (other instanceof com.google.ads.googleads.v17.enums.ServedAssetFieldTypeEnum) {
        return mergeFrom((com.google.ads.googleads.v17.enums.ServedAssetFieldTypeEnum)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.ads.googleads.v17.enums.ServedAssetFieldTypeEnum other) {
      if (other == com.google.ads.googleads.v17.enums.ServedAssetFieldTypeEnum.getDefaultInstance()) return this;
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


    // @@protoc_insertion_point(builder_scope:google.ads.googleads.v17.enums.ServedAssetFieldTypeEnum)
  }

  // @@protoc_insertion_point(class_scope:google.ads.googleads.v17.enums.ServedAssetFieldTypeEnum)
  private static final com.google.ads.googleads.v17.enums.ServedAssetFieldTypeEnum DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.ads.googleads.v17.enums.ServedAssetFieldTypeEnum();
  }

  public static com.google.ads.googleads.v17.enums.ServedAssetFieldTypeEnum getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ServedAssetFieldTypeEnum>
      PARSER = new com.google.protobuf.AbstractParser<ServedAssetFieldTypeEnum>() {
    @java.lang.Override
    public ServedAssetFieldTypeEnum parsePartialFrom(
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

  public static com.google.protobuf.Parser<ServedAssetFieldTypeEnum> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ServedAssetFieldTypeEnum> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.ads.googleads.v17.enums.ServedAssetFieldTypeEnum getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

