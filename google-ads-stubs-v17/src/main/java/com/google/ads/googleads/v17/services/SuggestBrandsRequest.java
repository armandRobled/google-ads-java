// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v17/services/brand_suggestion_service.proto

// Protobuf Java Version: 3.25.3
package com.google.ads.googleads.v17.services;

/**
 * <pre>
 * Request message for
 * [BrandSuggestionService.SuggestBrands][google.ads.googleads.v17.services.BrandSuggestionService.SuggestBrands].
 * </pre>
 *
 * Protobuf type {@code google.ads.googleads.v17.services.SuggestBrandsRequest}
 */
public final class SuggestBrandsRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.ads.googleads.v17.services.SuggestBrandsRequest)
    SuggestBrandsRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use SuggestBrandsRequest.newBuilder() to construct.
  private SuggestBrandsRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private SuggestBrandsRequest() {
    customerId_ = "";
    brandPrefix_ = "";
    selectedBrands_ =
        com.google.protobuf.LazyStringArrayList.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new SuggestBrandsRequest();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.ads.googleads.v17.services.BrandSuggestionServiceProto.internal_static_google_ads_googleads_v17_services_SuggestBrandsRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.ads.googleads.v17.services.BrandSuggestionServiceProto.internal_static_google_ads_googleads_v17_services_SuggestBrandsRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.ads.googleads.v17.services.SuggestBrandsRequest.class, com.google.ads.googleads.v17.services.SuggestBrandsRequest.Builder.class);
  }

  private int bitField0_;
  public static final int CUSTOMER_ID_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object customerId_ = "";
  /**
   * <pre>
   * Required. The ID of the customer onto which to apply the brand suggestion
   * operation.
   * </pre>
   *
   * <code>string customer_id = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The customerId.
   */
  @java.lang.Override
  public java.lang.String getCustomerId() {
    java.lang.Object ref = customerId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      customerId_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Required. The ID of the customer onto which to apply the brand suggestion
   * operation.
   * </pre>
   *
   * <code>string customer_id = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The bytes for customerId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getCustomerIdBytes() {
    java.lang.Object ref = customerId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      customerId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int BRAND_PREFIX_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private volatile java.lang.Object brandPrefix_ = "";
  /**
   * <pre>
   * Required. The prefix of a brand name.
   * </pre>
   *
   * <code>optional string brand_prefix = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return Whether the brandPrefix field is set.
   */
  @java.lang.Override
  public boolean hasBrandPrefix() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <pre>
   * Required. The prefix of a brand name.
   * </pre>
   *
   * <code>optional string brand_prefix = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The brandPrefix.
   */
  @java.lang.Override
  public java.lang.String getBrandPrefix() {
    java.lang.Object ref = brandPrefix_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      brandPrefix_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Required. The prefix of a brand name.
   * </pre>
   *
   * <code>optional string brand_prefix = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The bytes for brandPrefix.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getBrandPrefixBytes() {
    java.lang.Object ref = brandPrefix_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      brandPrefix_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int SELECTED_BRANDS_FIELD_NUMBER = 3;
  @SuppressWarnings("serial")
  private com.google.protobuf.LazyStringArrayList selectedBrands_ =
      com.google.protobuf.LazyStringArrayList.emptyList();
  /**
   * <pre>
   * Optional. Ids of the brands already selected by advertisers. They will be
   * excluded in response. These are expected to be brand ids not brand names.
   * </pre>
   *
   * <code>repeated string selected_brands = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return A list containing the selectedBrands.
   */
  public com.google.protobuf.ProtocolStringList
      getSelectedBrandsList() {
    return selectedBrands_;
  }
  /**
   * <pre>
   * Optional. Ids of the brands already selected by advertisers. They will be
   * excluded in response. These are expected to be brand ids not brand names.
   * </pre>
   *
   * <code>repeated string selected_brands = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return The count of selectedBrands.
   */
  public int getSelectedBrandsCount() {
    return selectedBrands_.size();
  }
  /**
   * <pre>
   * Optional. Ids of the brands already selected by advertisers. They will be
   * excluded in response. These are expected to be brand ids not brand names.
   * </pre>
   *
   * <code>repeated string selected_brands = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @param index The index of the element to return.
   * @return The selectedBrands at the given index.
   */
  public java.lang.String getSelectedBrands(int index) {
    return selectedBrands_.get(index);
  }
  /**
   * <pre>
   * Optional. Ids of the brands already selected by advertisers. They will be
   * excluded in response. These are expected to be brand ids not brand names.
   * </pre>
   *
   * <code>repeated string selected_brands = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @param index The index of the value to return.
   * @return The bytes of the selectedBrands at the given index.
   */
  public com.google.protobuf.ByteString
      getSelectedBrandsBytes(int index) {
    return selectedBrands_.getByteString(index);
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(customerId_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, customerId_);
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, brandPrefix_);
    }
    for (int i = 0; i < selectedBrands_.size(); i++) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, selectedBrands_.getRaw(i));
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(customerId_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, customerId_);
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, brandPrefix_);
    }
    {
      int dataSize = 0;
      for (int i = 0; i < selectedBrands_.size(); i++) {
        dataSize += computeStringSizeNoTag(selectedBrands_.getRaw(i));
      }
      size += dataSize;
      size += 1 * getSelectedBrandsList().size();
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
    if (!(obj instanceof com.google.ads.googleads.v17.services.SuggestBrandsRequest)) {
      return super.equals(obj);
    }
    com.google.ads.googleads.v17.services.SuggestBrandsRequest other = (com.google.ads.googleads.v17.services.SuggestBrandsRequest) obj;

    if (!getCustomerId()
        .equals(other.getCustomerId())) return false;
    if (hasBrandPrefix() != other.hasBrandPrefix()) return false;
    if (hasBrandPrefix()) {
      if (!getBrandPrefix()
          .equals(other.getBrandPrefix())) return false;
    }
    if (!getSelectedBrandsList()
        .equals(other.getSelectedBrandsList())) return false;
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
    hash = (37 * hash) + CUSTOMER_ID_FIELD_NUMBER;
    hash = (53 * hash) + getCustomerId().hashCode();
    if (hasBrandPrefix()) {
      hash = (37 * hash) + BRAND_PREFIX_FIELD_NUMBER;
      hash = (53 * hash) + getBrandPrefix().hashCode();
    }
    if (getSelectedBrandsCount() > 0) {
      hash = (37 * hash) + SELECTED_BRANDS_FIELD_NUMBER;
      hash = (53 * hash) + getSelectedBrandsList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.ads.googleads.v17.services.SuggestBrandsRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v17.services.SuggestBrandsRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v17.services.SuggestBrandsRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v17.services.SuggestBrandsRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v17.services.SuggestBrandsRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v17.services.SuggestBrandsRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v17.services.SuggestBrandsRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v17.services.SuggestBrandsRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.google.ads.googleads.v17.services.SuggestBrandsRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.ads.googleads.v17.services.SuggestBrandsRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v17.services.SuggestBrandsRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v17.services.SuggestBrandsRequest parseFrom(
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
  public static Builder newBuilder(com.google.ads.googleads.v17.services.SuggestBrandsRequest prototype) {
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
   * Request message for
   * [BrandSuggestionService.SuggestBrands][google.ads.googleads.v17.services.BrandSuggestionService.SuggestBrands].
   * </pre>
   *
   * Protobuf type {@code google.ads.googleads.v17.services.SuggestBrandsRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.ads.googleads.v17.services.SuggestBrandsRequest)
      com.google.ads.googleads.v17.services.SuggestBrandsRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.ads.googleads.v17.services.BrandSuggestionServiceProto.internal_static_google_ads_googleads_v17_services_SuggestBrandsRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.ads.googleads.v17.services.BrandSuggestionServiceProto.internal_static_google_ads_googleads_v17_services_SuggestBrandsRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.ads.googleads.v17.services.SuggestBrandsRequest.class, com.google.ads.googleads.v17.services.SuggestBrandsRequest.Builder.class);
    }

    // Construct using com.google.ads.googleads.v17.services.SuggestBrandsRequest.newBuilder()
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
      customerId_ = "";
      brandPrefix_ = "";
      selectedBrands_ =
          com.google.protobuf.LazyStringArrayList.emptyList();
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.ads.googleads.v17.services.BrandSuggestionServiceProto.internal_static_google_ads_googleads_v17_services_SuggestBrandsRequest_descriptor;
    }

    @java.lang.Override
    public com.google.ads.googleads.v17.services.SuggestBrandsRequest getDefaultInstanceForType() {
      return com.google.ads.googleads.v17.services.SuggestBrandsRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.ads.googleads.v17.services.SuggestBrandsRequest build() {
      com.google.ads.googleads.v17.services.SuggestBrandsRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.ads.googleads.v17.services.SuggestBrandsRequest buildPartial() {
      com.google.ads.googleads.v17.services.SuggestBrandsRequest result = new com.google.ads.googleads.v17.services.SuggestBrandsRequest(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.ads.googleads.v17.services.SuggestBrandsRequest result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.customerId_ = customerId_;
      }
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.brandPrefix_ = brandPrefix_;
        to_bitField0_ |= 0x00000001;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        selectedBrands_.makeImmutable();
        result.selectedBrands_ = selectedBrands_;
      }
      result.bitField0_ |= to_bitField0_;
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
      if (other instanceof com.google.ads.googleads.v17.services.SuggestBrandsRequest) {
        return mergeFrom((com.google.ads.googleads.v17.services.SuggestBrandsRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.ads.googleads.v17.services.SuggestBrandsRequest other) {
      if (other == com.google.ads.googleads.v17.services.SuggestBrandsRequest.getDefaultInstance()) return this;
      if (!other.getCustomerId().isEmpty()) {
        customerId_ = other.customerId_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (other.hasBrandPrefix()) {
        brandPrefix_ = other.brandPrefix_;
        bitField0_ |= 0x00000002;
        onChanged();
      }
      if (!other.selectedBrands_.isEmpty()) {
        if (selectedBrands_.isEmpty()) {
          selectedBrands_ = other.selectedBrands_;
          bitField0_ |= 0x00000004;
        } else {
          ensureSelectedBrandsIsMutable();
          selectedBrands_.addAll(other.selectedBrands_);
        }
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
              customerId_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              brandPrefix_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000002;
              break;
            } // case 18
            case 26: {
              java.lang.String s = input.readStringRequireUtf8();
              ensureSelectedBrandsIsMutable();
              selectedBrands_.add(s);
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

    private java.lang.Object customerId_ = "";
    /**
     * <pre>
     * Required. The ID of the customer onto which to apply the brand suggestion
     * operation.
     * </pre>
     *
     * <code>string customer_id = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return The customerId.
     */
    public java.lang.String getCustomerId() {
      java.lang.Object ref = customerId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        customerId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Required. The ID of the customer onto which to apply the brand suggestion
     * operation.
     * </pre>
     *
     * <code>string customer_id = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return The bytes for customerId.
     */
    public com.google.protobuf.ByteString
        getCustomerIdBytes() {
      java.lang.Object ref = customerId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        customerId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Required. The ID of the customer onto which to apply the brand suggestion
     * operation.
     * </pre>
     *
     * <code>string customer_id = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     * @param value The customerId to set.
     * @return This builder for chaining.
     */
    public Builder setCustomerId(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      customerId_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. The ID of the customer onto which to apply the brand suggestion
     * operation.
     * </pre>
     *
     * <code>string customer_id = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return This builder for chaining.
     */
    public Builder clearCustomerId() {
      customerId_ = getDefaultInstance().getCustomerId();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. The ID of the customer onto which to apply the brand suggestion
     * operation.
     * </pre>
     *
     * <code>string customer_id = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     * @param value The bytes for customerId to set.
     * @return This builder for chaining.
     */
    public Builder setCustomerIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      customerId_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private java.lang.Object brandPrefix_ = "";
    /**
     * <pre>
     * Required. The prefix of a brand name.
     * </pre>
     *
     * <code>optional string brand_prefix = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return Whether the brandPrefix field is set.
     */
    public boolean hasBrandPrefix() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <pre>
     * Required. The prefix of a brand name.
     * </pre>
     *
     * <code>optional string brand_prefix = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return The brandPrefix.
     */
    public java.lang.String getBrandPrefix() {
      java.lang.Object ref = brandPrefix_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        brandPrefix_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Required. The prefix of a brand name.
     * </pre>
     *
     * <code>optional string brand_prefix = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return The bytes for brandPrefix.
     */
    public com.google.protobuf.ByteString
        getBrandPrefixBytes() {
      java.lang.Object ref = brandPrefix_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        brandPrefix_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Required. The prefix of a brand name.
     * </pre>
     *
     * <code>optional string brand_prefix = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     * @param value The brandPrefix to set.
     * @return This builder for chaining.
     */
    public Builder setBrandPrefix(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      brandPrefix_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. The prefix of a brand name.
     * </pre>
     *
     * <code>optional string brand_prefix = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return This builder for chaining.
     */
    public Builder clearBrandPrefix() {
      brandPrefix_ = getDefaultInstance().getBrandPrefix();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. The prefix of a brand name.
     * </pre>
     *
     * <code>optional string brand_prefix = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     * @param value The bytes for brandPrefix to set.
     * @return This builder for chaining.
     */
    public Builder setBrandPrefixBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      brandPrefix_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    private com.google.protobuf.LazyStringArrayList selectedBrands_ =
        com.google.protobuf.LazyStringArrayList.emptyList();
    private void ensureSelectedBrandsIsMutable() {
      if (!selectedBrands_.isModifiable()) {
        selectedBrands_ = new com.google.protobuf.LazyStringArrayList(selectedBrands_);
      }
      bitField0_ |= 0x00000004;
    }
    /**
     * <pre>
     * Optional. Ids of the brands already selected by advertisers. They will be
     * excluded in response. These are expected to be brand ids not brand names.
     * </pre>
     *
     * <code>repeated string selected_brands = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
     * @return A list containing the selectedBrands.
     */
    public com.google.protobuf.ProtocolStringList
        getSelectedBrandsList() {
      selectedBrands_.makeImmutable();
      return selectedBrands_;
    }
    /**
     * <pre>
     * Optional. Ids of the brands already selected by advertisers. They will be
     * excluded in response. These are expected to be brand ids not brand names.
     * </pre>
     *
     * <code>repeated string selected_brands = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
     * @return The count of selectedBrands.
     */
    public int getSelectedBrandsCount() {
      return selectedBrands_.size();
    }
    /**
     * <pre>
     * Optional. Ids of the brands already selected by advertisers. They will be
     * excluded in response. These are expected to be brand ids not brand names.
     * </pre>
     *
     * <code>repeated string selected_brands = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
     * @param index The index of the element to return.
     * @return The selectedBrands at the given index.
     */
    public java.lang.String getSelectedBrands(int index) {
      return selectedBrands_.get(index);
    }
    /**
     * <pre>
     * Optional. Ids of the brands already selected by advertisers. They will be
     * excluded in response. These are expected to be brand ids not brand names.
     * </pre>
     *
     * <code>repeated string selected_brands = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
     * @param index The index of the value to return.
     * @return The bytes of the selectedBrands at the given index.
     */
    public com.google.protobuf.ByteString
        getSelectedBrandsBytes(int index) {
      return selectedBrands_.getByteString(index);
    }
    /**
     * <pre>
     * Optional. Ids of the brands already selected by advertisers. They will be
     * excluded in response. These are expected to be brand ids not brand names.
     * </pre>
     *
     * <code>repeated string selected_brands = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
     * @param index The index to set the value at.
     * @param value The selectedBrands to set.
     * @return This builder for chaining.
     */
    public Builder setSelectedBrands(
        int index, java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      ensureSelectedBrandsIsMutable();
      selectedBrands_.set(index, value);
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Optional. Ids of the brands already selected by advertisers. They will be
     * excluded in response. These are expected to be brand ids not brand names.
     * </pre>
     *
     * <code>repeated string selected_brands = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
     * @param value The selectedBrands to add.
     * @return This builder for chaining.
     */
    public Builder addSelectedBrands(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      ensureSelectedBrandsIsMutable();
      selectedBrands_.add(value);
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Optional. Ids of the brands already selected by advertisers. They will be
     * excluded in response. These are expected to be brand ids not brand names.
     * </pre>
     *
     * <code>repeated string selected_brands = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
     * @param values The selectedBrands to add.
     * @return This builder for chaining.
     */
    public Builder addAllSelectedBrands(
        java.lang.Iterable<java.lang.String> values) {
      ensureSelectedBrandsIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(
          values, selectedBrands_);
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Optional. Ids of the brands already selected by advertisers. They will be
     * excluded in response. These are expected to be brand ids not brand names.
     * </pre>
     *
     * <code>repeated string selected_brands = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
     * @return This builder for chaining.
     */
    public Builder clearSelectedBrands() {
      selectedBrands_ =
        com.google.protobuf.LazyStringArrayList.emptyList();
      bitField0_ = (bitField0_ & ~0x00000004);;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Optional. Ids of the brands already selected by advertisers. They will be
     * excluded in response. These are expected to be brand ids not brand names.
     * </pre>
     *
     * <code>repeated string selected_brands = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
     * @param value The bytes of the selectedBrands to add.
     * @return This builder for chaining.
     */
    public Builder addSelectedBrandsBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      ensureSelectedBrandsIsMutable();
      selectedBrands_.add(value);
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


    // @@protoc_insertion_point(builder_scope:google.ads.googleads.v17.services.SuggestBrandsRequest)
  }

  // @@protoc_insertion_point(class_scope:google.ads.googleads.v17.services.SuggestBrandsRequest)
  private static final com.google.ads.googleads.v17.services.SuggestBrandsRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.ads.googleads.v17.services.SuggestBrandsRequest();
  }

  public static com.google.ads.googleads.v17.services.SuggestBrandsRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<SuggestBrandsRequest>
      PARSER = new com.google.protobuf.AbstractParser<SuggestBrandsRequest>() {
    @java.lang.Override
    public SuggestBrandsRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<SuggestBrandsRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<SuggestBrandsRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.ads.googleads.v17.services.SuggestBrandsRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

