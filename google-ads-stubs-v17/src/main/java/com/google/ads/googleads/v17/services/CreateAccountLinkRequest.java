// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v17/services/account_link_service.proto

// Protobuf Java Version: 3.25.3
package com.google.ads.googleads.v17.services;

/**
 * <pre>
 * Request message for
 * [AccountLinkService.CreateAccountLink][google.ads.googleads.v17.services.AccountLinkService.CreateAccountLink].
 * </pre>
 *
 * Protobuf type {@code google.ads.googleads.v17.services.CreateAccountLinkRequest}
 */
public final class CreateAccountLinkRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.ads.googleads.v17.services.CreateAccountLinkRequest)
    CreateAccountLinkRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use CreateAccountLinkRequest.newBuilder() to construct.
  private CreateAccountLinkRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private CreateAccountLinkRequest() {
    customerId_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new CreateAccountLinkRequest();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.ads.googleads.v17.services.AccountLinkServiceProto.internal_static_google_ads_googleads_v17_services_CreateAccountLinkRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.ads.googleads.v17.services.AccountLinkServiceProto.internal_static_google_ads_googleads_v17_services_CreateAccountLinkRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.ads.googleads.v17.services.CreateAccountLinkRequest.class, com.google.ads.googleads.v17.services.CreateAccountLinkRequest.Builder.class);
  }

  private int bitField0_;
  public static final int CUSTOMER_ID_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object customerId_ = "";
  /**
   * <pre>
   * Required. The ID of the customer for which the account link is created.
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
   * Required. The ID of the customer for which the account link is created.
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

  public static final int ACCOUNT_LINK_FIELD_NUMBER = 2;
  private com.google.ads.googleads.v17.resources.AccountLink accountLink_;
  /**
   * <pre>
   * Required. The account link to be created.
   * </pre>
   *
   * <code>.google.ads.googleads.v17.resources.AccountLink account_link = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return Whether the accountLink field is set.
   */
  @java.lang.Override
  public boolean hasAccountLink() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <pre>
   * Required. The account link to be created.
   * </pre>
   *
   * <code>.google.ads.googleads.v17.resources.AccountLink account_link = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The accountLink.
   */
  @java.lang.Override
  public com.google.ads.googleads.v17.resources.AccountLink getAccountLink() {
    return accountLink_ == null ? com.google.ads.googleads.v17.resources.AccountLink.getDefaultInstance() : accountLink_;
  }
  /**
   * <pre>
   * Required. The account link to be created.
   * </pre>
   *
   * <code>.google.ads.googleads.v17.resources.AccountLink account_link = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  @java.lang.Override
  public com.google.ads.googleads.v17.resources.AccountLinkOrBuilder getAccountLinkOrBuilder() {
    return accountLink_ == null ? com.google.ads.googleads.v17.resources.AccountLink.getDefaultInstance() : accountLink_;
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
      output.writeMessage(2, getAccountLink());
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
        .computeMessageSize(2, getAccountLink());
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
    if (!(obj instanceof com.google.ads.googleads.v17.services.CreateAccountLinkRequest)) {
      return super.equals(obj);
    }
    com.google.ads.googleads.v17.services.CreateAccountLinkRequest other = (com.google.ads.googleads.v17.services.CreateAccountLinkRequest) obj;

    if (!getCustomerId()
        .equals(other.getCustomerId())) return false;
    if (hasAccountLink() != other.hasAccountLink()) return false;
    if (hasAccountLink()) {
      if (!getAccountLink()
          .equals(other.getAccountLink())) return false;
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
    if (hasAccountLink()) {
      hash = (37 * hash) + ACCOUNT_LINK_FIELD_NUMBER;
      hash = (53 * hash) + getAccountLink().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.ads.googleads.v17.services.CreateAccountLinkRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v17.services.CreateAccountLinkRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v17.services.CreateAccountLinkRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v17.services.CreateAccountLinkRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v17.services.CreateAccountLinkRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v17.services.CreateAccountLinkRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v17.services.CreateAccountLinkRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v17.services.CreateAccountLinkRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.google.ads.googleads.v17.services.CreateAccountLinkRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.ads.googleads.v17.services.CreateAccountLinkRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v17.services.CreateAccountLinkRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v17.services.CreateAccountLinkRequest parseFrom(
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
  public static Builder newBuilder(com.google.ads.googleads.v17.services.CreateAccountLinkRequest prototype) {
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
   * [AccountLinkService.CreateAccountLink][google.ads.googleads.v17.services.AccountLinkService.CreateAccountLink].
   * </pre>
   *
   * Protobuf type {@code google.ads.googleads.v17.services.CreateAccountLinkRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.ads.googleads.v17.services.CreateAccountLinkRequest)
      com.google.ads.googleads.v17.services.CreateAccountLinkRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.ads.googleads.v17.services.AccountLinkServiceProto.internal_static_google_ads_googleads_v17_services_CreateAccountLinkRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.ads.googleads.v17.services.AccountLinkServiceProto.internal_static_google_ads_googleads_v17_services_CreateAccountLinkRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.ads.googleads.v17.services.CreateAccountLinkRequest.class, com.google.ads.googleads.v17.services.CreateAccountLinkRequest.Builder.class);
    }

    // Construct using com.google.ads.googleads.v17.services.CreateAccountLinkRequest.newBuilder()
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
        getAccountLinkFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      customerId_ = "";
      accountLink_ = null;
      if (accountLinkBuilder_ != null) {
        accountLinkBuilder_.dispose();
        accountLinkBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.ads.googleads.v17.services.AccountLinkServiceProto.internal_static_google_ads_googleads_v17_services_CreateAccountLinkRequest_descriptor;
    }

    @java.lang.Override
    public com.google.ads.googleads.v17.services.CreateAccountLinkRequest getDefaultInstanceForType() {
      return com.google.ads.googleads.v17.services.CreateAccountLinkRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.ads.googleads.v17.services.CreateAccountLinkRequest build() {
      com.google.ads.googleads.v17.services.CreateAccountLinkRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.ads.googleads.v17.services.CreateAccountLinkRequest buildPartial() {
      com.google.ads.googleads.v17.services.CreateAccountLinkRequest result = new com.google.ads.googleads.v17.services.CreateAccountLinkRequest(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.ads.googleads.v17.services.CreateAccountLinkRequest result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.customerId_ = customerId_;
      }
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.accountLink_ = accountLinkBuilder_ == null
            ? accountLink_
            : accountLinkBuilder_.build();
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
      if (other instanceof com.google.ads.googleads.v17.services.CreateAccountLinkRequest) {
        return mergeFrom((com.google.ads.googleads.v17.services.CreateAccountLinkRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.ads.googleads.v17.services.CreateAccountLinkRequest other) {
      if (other == com.google.ads.googleads.v17.services.CreateAccountLinkRequest.getDefaultInstance()) return this;
      if (!other.getCustomerId().isEmpty()) {
        customerId_ = other.customerId_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (other.hasAccountLink()) {
        mergeAccountLink(other.getAccountLink());
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
                  getAccountLinkFieldBuilder().getBuilder(),
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
     * Required. The ID of the customer for which the account link is created.
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
     * Required. The ID of the customer for which the account link is created.
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
     * Required. The ID of the customer for which the account link is created.
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
     * Required. The ID of the customer for which the account link is created.
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
     * Required. The ID of the customer for which the account link is created.
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

    private com.google.ads.googleads.v17.resources.AccountLink accountLink_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.ads.googleads.v17.resources.AccountLink, com.google.ads.googleads.v17.resources.AccountLink.Builder, com.google.ads.googleads.v17.resources.AccountLinkOrBuilder> accountLinkBuilder_;
    /**
     * <pre>
     * Required. The account link to be created.
     * </pre>
     *
     * <code>.google.ads.googleads.v17.resources.AccountLink account_link = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return Whether the accountLink field is set.
     */
    public boolean hasAccountLink() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <pre>
     * Required. The account link to be created.
     * </pre>
     *
     * <code>.google.ads.googleads.v17.resources.AccountLink account_link = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return The accountLink.
     */
    public com.google.ads.googleads.v17.resources.AccountLink getAccountLink() {
      if (accountLinkBuilder_ == null) {
        return accountLink_ == null ? com.google.ads.googleads.v17.resources.AccountLink.getDefaultInstance() : accountLink_;
      } else {
        return accountLinkBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * Required. The account link to be created.
     * </pre>
     *
     * <code>.google.ads.googleads.v17.resources.AccountLink account_link = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder setAccountLink(com.google.ads.googleads.v17.resources.AccountLink value) {
      if (accountLinkBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        accountLink_ = value;
      } else {
        accountLinkBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. The account link to be created.
     * </pre>
     *
     * <code>.google.ads.googleads.v17.resources.AccountLink account_link = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder setAccountLink(
        com.google.ads.googleads.v17.resources.AccountLink.Builder builderForValue) {
      if (accountLinkBuilder_ == null) {
        accountLink_ = builderForValue.build();
      } else {
        accountLinkBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. The account link to be created.
     * </pre>
     *
     * <code>.google.ads.googleads.v17.resources.AccountLink account_link = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder mergeAccountLink(com.google.ads.googleads.v17.resources.AccountLink value) {
      if (accountLinkBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0) &&
          accountLink_ != null &&
          accountLink_ != com.google.ads.googleads.v17.resources.AccountLink.getDefaultInstance()) {
          getAccountLinkBuilder().mergeFrom(value);
        } else {
          accountLink_ = value;
        }
      } else {
        accountLinkBuilder_.mergeFrom(value);
      }
      if (accountLink_ != null) {
        bitField0_ |= 0x00000002;
        onChanged();
      }
      return this;
    }
    /**
     * <pre>
     * Required. The account link to be created.
     * </pre>
     *
     * <code>.google.ads.googleads.v17.resources.AccountLink account_link = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder clearAccountLink() {
      bitField0_ = (bitField0_ & ~0x00000002);
      accountLink_ = null;
      if (accountLinkBuilder_ != null) {
        accountLinkBuilder_.dispose();
        accountLinkBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. The account link to be created.
     * </pre>
     *
     * <code>.google.ads.googleads.v17.resources.AccountLink account_link = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public com.google.ads.googleads.v17.resources.AccountLink.Builder getAccountLinkBuilder() {
      bitField0_ |= 0x00000002;
      onChanged();
      return getAccountLinkFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Required. The account link to be created.
     * </pre>
     *
     * <code>.google.ads.googleads.v17.resources.AccountLink account_link = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public com.google.ads.googleads.v17.resources.AccountLinkOrBuilder getAccountLinkOrBuilder() {
      if (accountLinkBuilder_ != null) {
        return accountLinkBuilder_.getMessageOrBuilder();
      } else {
        return accountLink_ == null ?
            com.google.ads.googleads.v17.resources.AccountLink.getDefaultInstance() : accountLink_;
      }
    }
    /**
     * <pre>
     * Required. The account link to be created.
     * </pre>
     *
     * <code>.google.ads.googleads.v17.resources.AccountLink account_link = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.ads.googleads.v17.resources.AccountLink, com.google.ads.googleads.v17.resources.AccountLink.Builder, com.google.ads.googleads.v17.resources.AccountLinkOrBuilder> 
        getAccountLinkFieldBuilder() {
      if (accountLinkBuilder_ == null) {
        accountLinkBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.ads.googleads.v17.resources.AccountLink, com.google.ads.googleads.v17.resources.AccountLink.Builder, com.google.ads.googleads.v17.resources.AccountLinkOrBuilder>(
                getAccountLink(),
                getParentForChildren(),
                isClean());
        accountLink_ = null;
      }
      return accountLinkBuilder_;
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


    // @@protoc_insertion_point(builder_scope:google.ads.googleads.v17.services.CreateAccountLinkRequest)
  }

  // @@protoc_insertion_point(class_scope:google.ads.googleads.v17.services.CreateAccountLinkRequest)
  private static final com.google.ads.googleads.v17.services.CreateAccountLinkRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.ads.googleads.v17.services.CreateAccountLinkRequest();
  }

  public static com.google.ads.googleads.v17.services.CreateAccountLinkRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CreateAccountLinkRequest>
      PARSER = new com.google.protobuf.AbstractParser<CreateAccountLinkRequest>() {
    @java.lang.Override
    public CreateAccountLinkRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<CreateAccountLinkRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CreateAccountLinkRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.ads.googleads.v17.services.CreateAccountLinkRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

