// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v16/services/product_link_service.proto

// Protobuf Java Version: 3.25.3
package com.google.ads.googleads.v16.services;

/**
 * <pre>
 * Request message for
 * [ProductLinkService.CreateProductLink][google.ads.googleads.v16.services.ProductLinkService.CreateProductLink].
 * </pre>
 *
 * Protobuf type {@code google.ads.googleads.v16.services.CreateProductLinkRequest}
 */
public final class CreateProductLinkRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.ads.googleads.v16.services.CreateProductLinkRequest)
    CreateProductLinkRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use CreateProductLinkRequest.newBuilder() to construct.
  private CreateProductLinkRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private CreateProductLinkRequest() {
    customerId_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new CreateProductLinkRequest();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.ads.googleads.v16.services.ProductLinkServiceProto.internal_static_google_ads_googleads_v16_services_CreateProductLinkRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.ads.googleads.v16.services.ProductLinkServiceProto.internal_static_google_ads_googleads_v16_services_CreateProductLinkRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.ads.googleads.v16.services.CreateProductLinkRequest.class, com.google.ads.googleads.v16.services.CreateProductLinkRequest.Builder.class);
  }

  private int bitField0_;
  public static final int CUSTOMER_ID_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object customerId_ = "";
  /**
   * <pre>
   * Required. The ID of the customer for which the product link is created.
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
   * Required. The ID of the customer for which the product link is created.
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

  public static final int PRODUCT_LINK_FIELD_NUMBER = 2;
  private com.google.ads.googleads.v16.resources.ProductLink productLink_;
  /**
   * <pre>
   * Required. The product link to be created.
   * </pre>
   *
   * <code>.google.ads.googleads.v16.resources.ProductLink product_link = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return Whether the productLink field is set.
   */
  @java.lang.Override
  public boolean hasProductLink() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <pre>
   * Required. The product link to be created.
   * </pre>
   *
   * <code>.google.ads.googleads.v16.resources.ProductLink product_link = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The productLink.
   */
  @java.lang.Override
  public com.google.ads.googleads.v16.resources.ProductLink getProductLink() {
    return productLink_ == null ? com.google.ads.googleads.v16.resources.ProductLink.getDefaultInstance() : productLink_;
  }
  /**
   * <pre>
   * Required. The product link to be created.
   * </pre>
   *
   * <code>.google.ads.googleads.v16.resources.ProductLink product_link = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  @java.lang.Override
  public com.google.ads.googleads.v16.resources.ProductLinkOrBuilder getProductLinkOrBuilder() {
    return productLink_ == null ? com.google.ads.googleads.v16.resources.ProductLink.getDefaultInstance() : productLink_;
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
      output.writeMessage(2, getProductLink());
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
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getProductLink());
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
    if (!(obj instanceof com.google.ads.googleads.v16.services.CreateProductLinkRequest)) {
      return super.equals(obj);
    }
    com.google.ads.googleads.v16.services.CreateProductLinkRequest other = (com.google.ads.googleads.v16.services.CreateProductLinkRequest) obj;

    if (!getCustomerId()
        .equals(other.getCustomerId())) return false;
    if (hasProductLink() != other.hasProductLink()) return false;
    if (hasProductLink()) {
      if (!getProductLink()
          .equals(other.getProductLink())) return false;
    }
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
    if (hasProductLink()) {
      hash = (37 * hash) + PRODUCT_LINK_FIELD_NUMBER;
      hash = (53 * hash) + getProductLink().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.ads.googleads.v16.services.CreateProductLinkRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v16.services.CreateProductLinkRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v16.services.CreateProductLinkRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v16.services.CreateProductLinkRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v16.services.CreateProductLinkRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v16.services.CreateProductLinkRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v16.services.CreateProductLinkRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v16.services.CreateProductLinkRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.google.ads.googleads.v16.services.CreateProductLinkRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.ads.googleads.v16.services.CreateProductLinkRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v16.services.CreateProductLinkRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v16.services.CreateProductLinkRequest parseFrom(
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
  public static Builder newBuilder(com.google.ads.googleads.v16.services.CreateProductLinkRequest prototype) {
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
   * [ProductLinkService.CreateProductLink][google.ads.googleads.v16.services.ProductLinkService.CreateProductLink].
   * </pre>
   *
   * Protobuf type {@code google.ads.googleads.v16.services.CreateProductLinkRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.ads.googleads.v16.services.CreateProductLinkRequest)
      com.google.ads.googleads.v16.services.CreateProductLinkRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.ads.googleads.v16.services.ProductLinkServiceProto.internal_static_google_ads_googleads_v16_services_CreateProductLinkRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.ads.googleads.v16.services.ProductLinkServiceProto.internal_static_google_ads_googleads_v16_services_CreateProductLinkRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.ads.googleads.v16.services.CreateProductLinkRequest.class, com.google.ads.googleads.v16.services.CreateProductLinkRequest.Builder.class);
    }

    // Construct using com.google.ads.googleads.v16.services.CreateProductLinkRequest.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
        getProductLinkFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      customerId_ = "";
      productLink_ = null;
      if (productLinkBuilder_ != null) {
        productLinkBuilder_.dispose();
        productLinkBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.ads.googleads.v16.services.ProductLinkServiceProto.internal_static_google_ads_googleads_v16_services_CreateProductLinkRequest_descriptor;
    }

    @java.lang.Override
    public com.google.ads.googleads.v16.services.CreateProductLinkRequest getDefaultInstanceForType() {
      return com.google.ads.googleads.v16.services.CreateProductLinkRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.ads.googleads.v16.services.CreateProductLinkRequest build() {
      com.google.ads.googleads.v16.services.CreateProductLinkRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.ads.googleads.v16.services.CreateProductLinkRequest buildPartial() {
      com.google.ads.googleads.v16.services.CreateProductLinkRequest result = new com.google.ads.googleads.v16.services.CreateProductLinkRequest(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.ads.googleads.v16.services.CreateProductLinkRequest result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.customerId_ = customerId_;
      }
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.productLink_ = productLinkBuilder_ == null
            ? productLink_
            : productLinkBuilder_.build();
        to_bitField0_ |= 0x00000001;
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
      if (other instanceof com.google.ads.googleads.v16.services.CreateProductLinkRequest) {
        return mergeFrom((com.google.ads.googleads.v16.services.CreateProductLinkRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.ads.googleads.v16.services.CreateProductLinkRequest other) {
      if (other == com.google.ads.googleads.v16.services.CreateProductLinkRequest.getDefaultInstance()) return this;
      if (!other.getCustomerId().isEmpty()) {
        customerId_ = other.customerId_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (other.hasProductLink()) {
        mergeProductLink(other.getProductLink());
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
              input.readMessage(
                  getProductLinkFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000002;
              break;
            } // case 18
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
     * Required. The ID of the customer for which the product link is created.
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
     * Required. The ID of the customer for which the product link is created.
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
     * Required. The ID of the customer for which the product link is created.
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
     * Required. The ID of the customer for which the product link is created.
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
     * Required. The ID of the customer for which the product link is created.
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

    private com.google.ads.googleads.v16.resources.ProductLink productLink_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.ads.googleads.v16.resources.ProductLink, com.google.ads.googleads.v16.resources.ProductLink.Builder, com.google.ads.googleads.v16.resources.ProductLinkOrBuilder> productLinkBuilder_;
    /**
     * <pre>
     * Required. The product link to be created.
     * </pre>
     *
     * <code>.google.ads.googleads.v16.resources.ProductLink product_link = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return Whether the productLink field is set.
     */
    public boolean hasProductLink() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <pre>
     * Required. The product link to be created.
     * </pre>
     *
     * <code>.google.ads.googleads.v16.resources.ProductLink product_link = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return The productLink.
     */
    public com.google.ads.googleads.v16.resources.ProductLink getProductLink() {
      if (productLinkBuilder_ == null) {
        return productLink_ == null ? com.google.ads.googleads.v16.resources.ProductLink.getDefaultInstance() : productLink_;
      } else {
        return productLinkBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * Required. The product link to be created.
     * </pre>
     *
     * <code>.google.ads.googleads.v16.resources.ProductLink product_link = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder setProductLink(com.google.ads.googleads.v16.resources.ProductLink value) {
      if (productLinkBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        productLink_ = value;
      } else {
        productLinkBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. The product link to be created.
     * </pre>
     *
     * <code>.google.ads.googleads.v16.resources.ProductLink product_link = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder setProductLink(
        com.google.ads.googleads.v16.resources.ProductLink.Builder builderForValue) {
      if (productLinkBuilder_ == null) {
        productLink_ = builderForValue.build();
      } else {
        productLinkBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. The product link to be created.
     * </pre>
     *
     * <code>.google.ads.googleads.v16.resources.ProductLink product_link = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder mergeProductLink(com.google.ads.googleads.v16.resources.ProductLink value) {
      if (productLinkBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0) &&
          productLink_ != null &&
          productLink_ != com.google.ads.googleads.v16.resources.ProductLink.getDefaultInstance()) {
          getProductLinkBuilder().mergeFrom(value);
        } else {
          productLink_ = value;
        }
      } else {
        productLinkBuilder_.mergeFrom(value);
      }
      if (productLink_ != null) {
        bitField0_ |= 0x00000002;
        onChanged();
      }
      return this;
    }
    /**
     * <pre>
     * Required. The product link to be created.
     * </pre>
     *
     * <code>.google.ads.googleads.v16.resources.ProductLink product_link = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder clearProductLink() {
      bitField0_ = (bitField0_ & ~0x00000002);
      productLink_ = null;
      if (productLinkBuilder_ != null) {
        productLinkBuilder_.dispose();
        productLinkBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. The product link to be created.
     * </pre>
     *
     * <code>.google.ads.googleads.v16.resources.ProductLink product_link = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public com.google.ads.googleads.v16.resources.ProductLink.Builder getProductLinkBuilder() {
      bitField0_ |= 0x00000002;
      onChanged();
      return getProductLinkFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Required. The product link to be created.
     * </pre>
     *
     * <code>.google.ads.googleads.v16.resources.ProductLink product_link = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public com.google.ads.googleads.v16.resources.ProductLinkOrBuilder getProductLinkOrBuilder() {
      if (productLinkBuilder_ != null) {
        return productLinkBuilder_.getMessageOrBuilder();
      } else {
        return productLink_ == null ?
            com.google.ads.googleads.v16.resources.ProductLink.getDefaultInstance() : productLink_;
      }
    }
    /**
     * <pre>
     * Required. The product link to be created.
     * </pre>
     *
     * <code>.google.ads.googleads.v16.resources.ProductLink product_link = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.ads.googleads.v16.resources.ProductLink, com.google.ads.googleads.v16.resources.ProductLink.Builder, com.google.ads.googleads.v16.resources.ProductLinkOrBuilder> 
        getProductLinkFieldBuilder() {
      if (productLinkBuilder_ == null) {
        productLinkBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.ads.googleads.v16.resources.ProductLink, com.google.ads.googleads.v16.resources.ProductLink.Builder, com.google.ads.googleads.v16.resources.ProductLinkOrBuilder>(
                getProductLink(),
                getParentForChildren(),
                isClean());
        productLink_ = null;
      }
      return productLinkBuilder_;
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


    // @@protoc_insertion_point(builder_scope:google.ads.googleads.v16.services.CreateProductLinkRequest)
  }

  // @@protoc_insertion_point(class_scope:google.ads.googleads.v16.services.CreateProductLinkRequest)
  private static final com.google.ads.googleads.v16.services.CreateProductLinkRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.ads.googleads.v16.services.CreateProductLinkRequest();
  }

  public static com.google.ads.googleads.v16.services.CreateProductLinkRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CreateProductLinkRequest>
      PARSER = new com.google.protobuf.AbstractParser<CreateProductLinkRequest>() {
    @java.lang.Override
    public CreateProductLinkRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<CreateProductLinkRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CreateProductLinkRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.ads.googleads.v16.services.CreateProductLinkRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

