// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v15/common/asset_types.proto

// Protobuf Java Version: 3.25.3
package com.google.ads.googleads.v15.common;

/**
 * <pre>
 * A hotel property asset.
 * </pre>
 *
 * Protobuf type {@code google.ads.googleads.v15.common.HotelPropertyAsset}
 */
public final class HotelPropertyAsset extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.ads.googleads.v15.common.HotelPropertyAsset)
    HotelPropertyAssetOrBuilder {
private static final long serialVersionUID = 0L;
  // Use HotelPropertyAsset.newBuilder() to construct.
  private HotelPropertyAsset(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private HotelPropertyAsset() {
    placeId_ = "";
    hotelAddress_ = "";
    hotelName_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new HotelPropertyAsset();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.ads.googleads.v15.common.AssetTypesProto.internal_static_google_ads_googleads_v15_common_HotelPropertyAsset_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.ads.googleads.v15.common.AssetTypesProto.internal_static_google_ads_googleads_v15_common_HotelPropertyAsset_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.ads.googleads.v15.common.HotelPropertyAsset.class, com.google.ads.googleads.v15.common.HotelPropertyAsset.Builder.class);
  }

  public static final int PLACE_ID_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object placeId_ = "";
  /**
   * <pre>
   * Place IDs uniquely identify a place in the Google Places database and on
   * Google Maps. See https://developers.google.com/places/web-service/place-id
   * to learn more.
   * </pre>
   *
   * <code>string place_id = 1;</code>
   * @return The placeId.
   */
  @java.lang.Override
  public java.lang.String getPlaceId() {
    java.lang.Object ref = placeId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      placeId_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Place IDs uniquely identify a place in the Google Places database and on
   * Google Maps. See https://developers.google.com/places/web-service/place-id
   * to learn more.
   * </pre>
   *
   * <code>string place_id = 1;</code>
   * @return The bytes for placeId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getPlaceIdBytes() {
    java.lang.Object ref = placeId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      placeId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int HOTEL_ADDRESS_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private volatile java.lang.Object hotelAddress_ = "";
  /**
   * <pre>
   * Address of the hotel. Read-only.
   * </pre>
   *
   * <code>string hotel_address = 2;</code>
   * @return The hotelAddress.
   */
  @java.lang.Override
  public java.lang.String getHotelAddress() {
    java.lang.Object ref = hotelAddress_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      hotelAddress_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Address of the hotel. Read-only.
   * </pre>
   *
   * <code>string hotel_address = 2;</code>
   * @return The bytes for hotelAddress.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getHotelAddressBytes() {
    java.lang.Object ref = hotelAddress_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      hotelAddress_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int HOTEL_NAME_FIELD_NUMBER = 3;
  @SuppressWarnings("serial")
  private volatile java.lang.Object hotelName_ = "";
  /**
   * <pre>
   * Name of the hotel. Read-only.
   * </pre>
   *
   * <code>string hotel_name = 3;</code>
   * @return The hotelName.
   */
  @java.lang.Override
  public java.lang.String getHotelName() {
    java.lang.Object ref = hotelName_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      hotelName_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Name of the hotel. Read-only.
   * </pre>
   *
   * <code>string hotel_name = 3;</code>
   * @return The bytes for hotelName.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getHotelNameBytes() {
    java.lang.Object ref = hotelName_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      hotelName_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(placeId_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, placeId_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(hotelAddress_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, hotelAddress_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(hotelName_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, hotelName_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(placeId_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, placeId_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(hotelAddress_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, hotelAddress_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(hotelName_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, hotelName_);
    }
    size += getUnknownFields().getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof com.google.ads.googleads.v15.common.HotelPropertyAsset)) {
      return super.equals(obj);
    }
    com.google.ads.googleads.v15.common.HotelPropertyAsset other = (com.google.ads.googleads.v15.common.HotelPropertyAsset) obj;

    if (!getPlaceId()
        .equals(other.getPlaceId())) return false;
    if (!getHotelAddress()
        .equals(other.getHotelAddress())) return false;
    if (!getHotelName()
        .equals(other.getHotelName())) return false;
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
    hash = (37 * hash) + PLACE_ID_FIELD_NUMBER;
    hash = (53 * hash) + getPlaceId().hashCode();
    hash = (37 * hash) + HOTEL_ADDRESS_FIELD_NUMBER;
    hash = (53 * hash) + getHotelAddress().hashCode();
    hash = (37 * hash) + HOTEL_NAME_FIELD_NUMBER;
    hash = (53 * hash) + getHotelName().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.ads.googleads.v15.common.HotelPropertyAsset parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v15.common.HotelPropertyAsset parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v15.common.HotelPropertyAsset parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v15.common.HotelPropertyAsset parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v15.common.HotelPropertyAsset parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v15.common.HotelPropertyAsset parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v15.common.HotelPropertyAsset parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v15.common.HotelPropertyAsset parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.google.ads.googleads.v15.common.HotelPropertyAsset parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.ads.googleads.v15.common.HotelPropertyAsset parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v15.common.HotelPropertyAsset parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v15.common.HotelPropertyAsset parseFrom(
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
  public static Builder newBuilder(com.google.ads.googleads.v15.common.HotelPropertyAsset prototype) {
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
   * A hotel property asset.
   * </pre>
   *
   * Protobuf type {@code google.ads.googleads.v15.common.HotelPropertyAsset}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.ads.googleads.v15.common.HotelPropertyAsset)
      com.google.ads.googleads.v15.common.HotelPropertyAssetOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.ads.googleads.v15.common.AssetTypesProto.internal_static_google_ads_googleads_v15_common_HotelPropertyAsset_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.ads.googleads.v15.common.AssetTypesProto.internal_static_google_ads_googleads_v15_common_HotelPropertyAsset_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.ads.googleads.v15.common.HotelPropertyAsset.class, com.google.ads.googleads.v15.common.HotelPropertyAsset.Builder.class);
    }

    // Construct using com.google.ads.googleads.v15.common.HotelPropertyAsset.newBuilder()
    private Builder() {

    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);

    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      placeId_ = "";
      hotelAddress_ = "";
      hotelName_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.ads.googleads.v15.common.AssetTypesProto.internal_static_google_ads_googleads_v15_common_HotelPropertyAsset_descriptor;
    }

    @java.lang.Override
    public com.google.ads.googleads.v15.common.HotelPropertyAsset getDefaultInstanceForType() {
      return com.google.ads.googleads.v15.common.HotelPropertyAsset.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.ads.googleads.v15.common.HotelPropertyAsset build() {
      com.google.ads.googleads.v15.common.HotelPropertyAsset result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.ads.googleads.v15.common.HotelPropertyAsset buildPartial() {
      com.google.ads.googleads.v15.common.HotelPropertyAsset result = new com.google.ads.googleads.v15.common.HotelPropertyAsset(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.ads.googleads.v15.common.HotelPropertyAsset result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.placeId_ = placeId_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.hotelAddress_ = hotelAddress_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.hotelName_ = hotelName_;
      }
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
      if (other instanceof com.google.ads.googleads.v15.common.HotelPropertyAsset) {
        return mergeFrom((com.google.ads.googleads.v15.common.HotelPropertyAsset)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.ads.googleads.v15.common.HotelPropertyAsset other) {
      if (other == com.google.ads.googleads.v15.common.HotelPropertyAsset.getDefaultInstance()) return this;
      if (!other.getPlaceId().isEmpty()) {
        placeId_ = other.placeId_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (!other.getHotelAddress().isEmpty()) {
        hotelAddress_ = other.hotelAddress_;
        bitField0_ |= 0x00000002;
        onChanged();
      }
      if (!other.getHotelName().isEmpty()) {
        hotelName_ = other.hotelName_;
        bitField0_ |= 0x00000004;
        onChanged();
      }
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
            case 10: {
              placeId_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              hotelAddress_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000002;
              break;
            } // case 18
            case 26: {
              hotelName_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000004;
              break;
            } // case 26
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
    private int bitField0_;

    private java.lang.Object placeId_ = "";
    /**
     * <pre>
     * Place IDs uniquely identify a place in the Google Places database and on
     * Google Maps. See https://developers.google.com/places/web-service/place-id
     * to learn more.
     * </pre>
     *
     * <code>string place_id = 1;</code>
     * @return The placeId.
     */
    public java.lang.String getPlaceId() {
      java.lang.Object ref = placeId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        placeId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Place IDs uniquely identify a place in the Google Places database and on
     * Google Maps. See https://developers.google.com/places/web-service/place-id
     * to learn more.
     * </pre>
     *
     * <code>string place_id = 1;</code>
     * @return The bytes for placeId.
     */
    public com.google.protobuf.ByteString
        getPlaceIdBytes() {
      java.lang.Object ref = placeId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        placeId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Place IDs uniquely identify a place in the Google Places database and on
     * Google Maps. See https://developers.google.com/places/web-service/place-id
     * to learn more.
     * </pre>
     *
     * <code>string place_id = 1;</code>
     * @param value The placeId to set.
     * @return This builder for chaining.
     */
    public Builder setPlaceId(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      placeId_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Place IDs uniquely identify a place in the Google Places database and on
     * Google Maps. See https://developers.google.com/places/web-service/place-id
     * to learn more.
     * </pre>
     *
     * <code>string place_id = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearPlaceId() {
      placeId_ = getDefaultInstance().getPlaceId();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Place IDs uniquely identify a place in the Google Places database and on
     * Google Maps. See https://developers.google.com/places/web-service/place-id
     * to learn more.
     * </pre>
     *
     * <code>string place_id = 1;</code>
     * @param value The bytes for placeId to set.
     * @return This builder for chaining.
     */
    public Builder setPlaceIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      placeId_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private java.lang.Object hotelAddress_ = "";
    /**
     * <pre>
     * Address of the hotel. Read-only.
     * </pre>
     *
     * <code>string hotel_address = 2;</code>
     * @return The hotelAddress.
     */
    public java.lang.String getHotelAddress() {
      java.lang.Object ref = hotelAddress_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        hotelAddress_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Address of the hotel. Read-only.
     * </pre>
     *
     * <code>string hotel_address = 2;</code>
     * @return The bytes for hotelAddress.
     */
    public com.google.protobuf.ByteString
        getHotelAddressBytes() {
      java.lang.Object ref = hotelAddress_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        hotelAddress_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Address of the hotel. Read-only.
     * </pre>
     *
     * <code>string hotel_address = 2;</code>
     * @param value The hotelAddress to set.
     * @return This builder for chaining.
     */
    public Builder setHotelAddress(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      hotelAddress_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Address of the hotel. Read-only.
     * </pre>
     *
     * <code>string hotel_address = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearHotelAddress() {
      hotelAddress_ = getDefaultInstance().getHotelAddress();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Address of the hotel. Read-only.
     * </pre>
     *
     * <code>string hotel_address = 2;</code>
     * @param value The bytes for hotelAddress to set.
     * @return This builder for chaining.
     */
    public Builder setHotelAddressBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      hotelAddress_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    private java.lang.Object hotelName_ = "";
    /**
     * <pre>
     * Name of the hotel. Read-only.
     * </pre>
     *
     * <code>string hotel_name = 3;</code>
     * @return The hotelName.
     */
    public java.lang.String getHotelName() {
      java.lang.Object ref = hotelName_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        hotelName_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Name of the hotel. Read-only.
     * </pre>
     *
     * <code>string hotel_name = 3;</code>
     * @return The bytes for hotelName.
     */
    public com.google.protobuf.ByteString
        getHotelNameBytes() {
      java.lang.Object ref = hotelName_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        hotelName_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Name of the hotel. Read-only.
     * </pre>
     *
     * <code>string hotel_name = 3;</code>
     * @param value The hotelName to set.
     * @return This builder for chaining.
     */
    public Builder setHotelName(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      hotelName_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Name of the hotel. Read-only.
     * </pre>
     *
     * <code>string hotel_name = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearHotelName() {
      hotelName_ = getDefaultInstance().getHotelName();
      bitField0_ = (bitField0_ & ~0x00000004);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Name of the hotel. Read-only.
     * </pre>
     *
     * <code>string hotel_name = 3;</code>
     * @param value The bytes for hotelName to set.
     * @return This builder for chaining.
     */
    public Builder setHotelNameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      hotelName_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
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


    // @@protoc_insertion_point(builder_scope:google.ads.googleads.v15.common.HotelPropertyAsset)
  }

  // @@protoc_insertion_point(class_scope:google.ads.googleads.v15.common.HotelPropertyAsset)
  private static final com.google.ads.googleads.v15.common.HotelPropertyAsset DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.ads.googleads.v15.common.HotelPropertyAsset();
  }

  public static com.google.ads.googleads.v15.common.HotelPropertyAsset getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<HotelPropertyAsset>
      PARSER = new com.google.protobuf.AbstractParser<HotelPropertyAsset>() {
    @java.lang.Override
    public HotelPropertyAsset parsePartialFrom(
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

  public static com.google.protobuf.Parser<HotelPropertyAsset> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<HotelPropertyAsset> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.ads.googleads.v15.common.HotelPropertyAsset getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

