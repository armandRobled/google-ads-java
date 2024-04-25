// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v16/services/identity_verification_service.proto

// Protobuf Java Version: 3.25.3
package com.google.ads.googleads.v16.services;

/**
 * <pre>
 * Response message for
 *  [IdentityVerificationService.GetIdentityVerification].
 * </pre>
 *
 * Protobuf type {@code google.ads.googleads.v16.services.GetIdentityVerificationResponse}
 */
public final class GetIdentityVerificationResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.ads.googleads.v16.services.GetIdentityVerificationResponse)
    GetIdentityVerificationResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use GetIdentityVerificationResponse.newBuilder() to construct.
  private GetIdentityVerificationResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private GetIdentityVerificationResponse() {
    identityVerification_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new GetIdentityVerificationResponse();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.ads.googleads.v16.services.IdentityVerificationServiceProto.internal_static_google_ads_googleads_v16_services_GetIdentityVerificationResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.ads.googleads.v16.services.IdentityVerificationServiceProto.internal_static_google_ads_googleads_v16_services_GetIdentityVerificationResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.ads.googleads.v16.services.GetIdentityVerificationResponse.class, com.google.ads.googleads.v16.services.GetIdentityVerificationResponse.Builder.class);
  }

  public static final int IDENTITY_VERIFICATION_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private java.util.List<com.google.ads.googleads.v16.services.IdentityVerification> identityVerification_;
  /**
   * <pre>
   * List of identity verifications for the customer.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v16.services.IdentityVerification identity_verification = 1;</code>
   */
  @java.lang.Override
  public java.util.List<com.google.ads.googleads.v16.services.IdentityVerification> getIdentityVerificationList() {
    return identityVerification_;
  }
  /**
   * <pre>
   * List of identity verifications for the customer.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v16.services.IdentityVerification identity_verification = 1;</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.google.ads.googleads.v16.services.IdentityVerificationOrBuilder> 
      getIdentityVerificationOrBuilderList() {
    return identityVerification_;
  }
  /**
   * <pre>
   * List of identity verifications for the customer.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v16.services.IdentityVerification identity_verification = 1;</code>
   */
  @java.lang.Override
  public int getIdentityVerificationCount() {
    return identityVerification_.size();
  }
  /**
   * <pre>
   * List of identity verifications for the customer.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v16.services.IdentityVerification identity_verification = 1;</code>
   */
  @java.lang.Override
  public com.google.ads.googleads.v16.services.IdentityVerification getIdentityVerification(int index) {
    return identityVerification_.get(index);
  }
  /**
   * <pre>
   * List of identity verifications for the customer.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v16.services.IdentityVerification identity_verification = 1;</code>
   */
  @java.lang.Override
  public com.google.ads.googleads.v16.services.IdentityVerificationOrBuilder getIdentityVerificationOrBuilder(
      int index) {
    return identityVerification_.get(index);
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
    for (int i = 0; i < identityVerification_.size(); i++) {
      output.writeMessage(1, identityVerification_.get(i));
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < identityVerification_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, identityVerification_.get(i));
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
    if (!(obj instanceof com.google.ads.googleads.v16.services.GetIdentityVerificationResponse)) {
      return super.equals(obj);
    }
    com.google.ads.googleads.v16.services.GetIdentityVerificationResponse other = (com.google.ads.googleads.v16.services.GetIdentityVerificationResponse) obj;

    if (!getIdentityVerificationList()
        .equals(other.getIdentityVerificationList())) return false;
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
    if (getIdentityVerificationCount() > 0) {
      hash = (37 * hash) + IDENTITY_VERIFICATION_FIELD_NUMBER;
      hash = (53 * hash) + getIdentityVerificationList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.ads.googleads.v16.services.GetIdentityVerificationResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v16.services.GetIdentityVerificationResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v16.services.GetIdentityVerificationResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v16.services.GetIdentityVerificationResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v16.services.GetIdentityVerificationResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v16.services.GetIdentityVerificationResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v16.services.GetIdentityVerificationResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v16.services.GetIdentityVerificationResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.google.ads.googleads.v16.services.GetIdentityVerificationResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.ads.googleads.v16.services.GetIdentityVerificationResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v16.services.GetIdentityVerificationResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v16.services.GetIdentityVerificationResponse parseFrom(
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
  public static Builder newBuilder(com.google.ads.googleads.v16.services.GetIdentityVerificationResponse prototype) {
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
   * Response message for
   *  [IdentityVerificationService.GetIdentityVerification].
   * </pre>
   *
   * Protobuf type {@code google.ads.googleads.v16.services.GetIdentityVerificationResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.ads.googleads.v16.services.GetIdentityVerificationResponse)
      com.google.ads.googleads.v16.services.GetIdentityVerificationResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.ads.googleads.v16.services.IdentityVerificationServiceProto.internal_static_google_ads_googleads_v16_services_GetIdentityVerificationResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.ads.googleads.v16.services.IdentityVerificationServiceProto.internal_static_google_ads_googleads_v16_services_GetIdentityVerificationResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.ads.googleads.v16.services.GetIdentityVerificationResponse.class, com.google.ads.googleads.v16.services.GetIdentityVerificationResponse.Builder.class);
    }

    // Construct using com.google.ads.googleads.v16.services.GetIdentityVerificationResponse.newBuilder()
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
      if (identityVerificationBuilder_ == null) {
        identityVerification_ = java.util.Collections.emptyList();
      } else {
        identityVerification_ = null;
        identityVerificationBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.ads.googleads.v16.services.IdentityVerificationServiceProto.internal_static_google_ads_googleads_v16_services_GetIdentityVerificationResponse_descriptor;
    }

    @java.lang.Override
    public com.google.ads.googleads.v16.services.GetIdentityVerificationResponse getDefaultInstanceForType() {
      return com.google.ads.googleads.v16.services.GetIdentityVerificationResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.ads.googleads.v16.services.GetIdentityVerificationResponse build() {
      com.google.ads.googleads.v16.services.GetIdentityVerificationResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.ads.googleads.v16.services.GetIdentityVerificationResponse buildPartial() {
      com.google.ads.googleads.v16.services.GetIdentityVerificationResponse result = new com.google.ads.googleads.v16.services.GetIdentityVerificationResponse(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(com.google.ads.googleads.v16.services.GetIdentityVerificationResponse result) {
      if (identityVerificationBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          identityVerification_ = java.util.Collections.unmodifiableList(identityVerification_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.identityVerification_ = identityVerification_;
      } else {
        result.identityVerification_ = identityVerificationBuilder_.build();
      }
    }

    private void buildPartial0(com.google.ads.googleads.v16.services.GetIdentityVerificationResponse result) {
      int from_bitField0_ = bitField0_;
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
      if (other instanceof com.google.ads.googleads.v16.services.GetIdentityVerificationResponse) {
        return mergeFrom((com.google.ads.googleads.v16.services.GetIdentityVerificationResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.ads.googleads.v16.services.GetIdentityVerificationResponse other) {
      if (other == com.google.ads.googleads.v16.services.GetIdentityVerificationResponse.getDefaultInstance()) return this;
      if (identityVerificationBuilder_ == null) {
        if (!other.identityVerification_.isEmpty()) {
          if (identityVerification_.isEmpty()) {
            identityVerification_ = other.identityVerification_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureIdentityVerificationIsMutable();
            identityVerification_.addAll(other.identityVerification_);
          }
          onChanged();
        }
      } else {
        if (!other.identityVerification_.isEmpty()) {
          if (identityVerificationBuilder_.isEmpty()) {
            identityVerificationBuilder_.dispose();
            identityVerificationBuilder_ = null;
            identityVerification_ = other.identityVerification_;
            bitField0_ = (bitField0_ & ~0x00000001);
            identityVerificationBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getIdentityVerificationFieldBuilder() : null;
          } else {
            identityVerificationBuilder_.addAllMessages(other.identityVerification_);
          }
        }
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
              com.google.ads.googleads.v16.services.IdentityVerification m =
                  input.readMessage(
                      com.google.ads.googleads.v16.services.IdentityVerification.parser(),
                      extensionRegistry);
              if (identityVerificationBuilder_ == null) {
                ensureIdentityVerificationIsMutable();
                identityVerification_.add(m);
              } else {
                identityVerificationBuilder_.addMessage(m);
              }
              break;
            } // case 10
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

    private java.util.List<com.google.ads.googleads.v16.services.IdentityVerification> identityVerification_ =
      java.util.Collections.emptyList();
    private void ensureIdentityVerificationIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        identityVerification_ = new java.util.ArrayList<com.google.ads.googleads.v16.services.IdentityVerification>(identityVerification_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.google.ads.googleads.v16.services.IdentityVerification, com.google.ads.googleads.v16.services.IdentityVerification.Builder, com.google.ads.googleads.v16.services.IdentityVerificationOrBuilder> identityVerificationBuilder_;

    /**
     * <pre>
     * List of identity verifications for the customer.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v16.services.IdentityVerification identity_verification = 1;</code>
     */
    public java.util.List<com.google.ads.googleads.v16.services.IdentityVerification> getIdentityVerificationList() {
      if (identityVerificationBuilder_ == null) {
        return java.util.Collections.unmodifiableList(identityVerification_);
      } else {
        return identityVerificationBuilder_.getMessageList();
      }
    }
    /**
     * <pre>
     * List of identity verifications for the customer.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v16.services.IdentityVerification identity_verification = 1;</code>
     */
    public int getIdentityVerificationCount() {
      if (identityVerificationBuilder_ == null) {
        return identityVerification_.size();
      } else {
        return identityVerificationBuilder_.getCount();
      }
    }
    /**
     * <pre>
     * List of identity verifications for the customer.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v16.services.IdentityVerification identity_verification = 1;</code>
     */
    public com.google.ads.googleads.v16.services.IdentityVerification getIdentityVerification(int index) {
      if (identityVerificationBuilder_ == null) {
        return identityVerification_.get(index);
      } else {
        return identityVerificationBuilder_.getMessage(index);
      }
    }
    /**
     * <pre>
     * List of identity verifications for the customer.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v16.services.IdentityVerification identity_verification = 1;</code>
     */
    public Builder setIdentityVerification(
        int index, com.google.ads.googleads.v16.services.IdentityVerification value) {
      if (identityVerificationBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureIdentityVerificationIsMutable();
        identityVerification_.set(index, value);
        onChanged();
      } else {
        identityVerificationBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * List of identity verifications for the customer.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v16.services.IdentityVerification identity_verification = 1;</code>
     */
    public Builder setIdentityVerification(
        int index, com.google.ads.googleads.v16.services.IdentityVerification.Builder builderForValue) {
      if (identityVerificationBuilder_ == null) {
        ensureIdentityVerificationIsMutable();
        identityVerification_.set(index, builderForValue.build());
        onChanged();
      } else {
        identityVerificationBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * List of identity verifications for the customer.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v16.services.IdentityVerification identity_verification = 1;</code>
     */
    public Builder addIdentityVerification(com.google.ads.googleads.v16.services.IdentityVerification value) {
      if (identityVerificationBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureIdentityVerificationIsMutable();
        identityVerification_.add(value);
        onChanged();
      } else {
        identityVerificationBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <pre>
     * List of identity verifications for the customer.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v16.services.IdentityVerification identity_verification = 1;</code>
     */
    public Builder addIdentityVerification(
        int index, com.google.ads.googleads.v16.services.IdentityVerification value) {
      if (identityVerificationBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureIdentityVerificationIsMutable();
        identityVerification_.add(index, value);
        onChanged();
      } else {
        identityVerificationBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * List of identity verifications for the customer.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v16.services.IdentityVerification identity_verification = 1;</code>
     */
    public Builder addIdentityVerification(
        com.google.ads.googleads.v16.services.IdentityVerification.Builder builderForValue) {
      if (identityVerificationBuilder_ == null) {
        ensureIdentityVerificationIsMutable();
        identityVerification_.add(builderForValue.build());
        onChanged();
      } else {
        identityVerificationBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * List of identity verifications for the customer.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v16.services.IdentityVerification identity_verification = 1;</code>
     */
    public Builder addIdentityVerification(
        int index, com.google.ads.googleads.v16.services.IdentityVerification.Builder builderForValue) {
      if (identityVerificationBuilder_ == null) {
        ensureIdentityVerificationIsMutable();
        identityVerification_.add(index, builderForValue.build());
        onChanged();
      } else {
        identityVerificationBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * List of identity verifications for the customer.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v16.services.IdentityVerification identity_verification = 1;</code>
     */
    public Builder addAllIdentityVerification(
        java.lang.Iterable<? extends com.google.ads.googleads.v16.services.IdentityVerification> values) {
      if (identityVerificationBuilder_ == null) {
        ensureIdentityVerificationIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, identityVerification_);
        onChanged();
      } else {
        identityVerificationBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <pre>
     * List of identity verifications for the customer.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v16.services.IdentityVerification identity_verification = 1;</code>
     */
    public Builder clearIdentityVerification() {
      if (identityVerificationBuilder_ == null) {
        identityVerification_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        identityVerificationBuilder_.clear();
      }
      return this;
    }
    /**
     * <pre>
     * List of identity verifications for the customer.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v16.services.IdentityVerification identity_verification = 1;</code>
     */
    public Builder removeIdentityVerification(int index) {
      if (identityVerificationBuilder_ == null) {
        ensureIdentityVerificationIsMutable();
        identityVerification_.remove(index);
        onChanged();
      } else {
        identityVerificationBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <pre>
     * List of identity verifications for the customer.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v16.services.IdentityVerification identity_verification = 1;</code>
     */
    public com.google.ads.googleads.v16.services.IdentityVerification.Builder getIdentityVerificationBuilder(
        int index) {
      return getIdentityVerificationFieldBuilder().getBuilder(index);
    }
    /**
     * <pre>
     * List of identity verifications for the customer.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v16.services.IdentityVerification identity_verification = 1;</code>
     */
    public com.google.ads.googleads.v16.services.IdentityVerificationOrBuilder getIdentityVerificationOrBuilder(
        int index) {
      if (identityVerificationBuilder_ == null) {
        return identityVerification_.get(index);  } else {
        return identityVerificationBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <pre>
     * List of identity verifications for the customer.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v16.services.IdentityVerification identity_verification = 1;</code>
     */
    public java.util.List<? extends com.google.ads.googleads.v16.services.IdentityVerificationOrBuilder> 
         getIdentityVerificationOrBuilderList() {
      if (identityVerificationBuilder_ != null) {
        return identityVerificationBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(identityVerification_);
      }
    }
    /**
     * <pre>
     * List of identity verifications for the customer.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v16.services.IdentityVerification identity_verification = 1;</code>
     */
    public com.google.ads.googleads.v16.services.IdentityVerification.Builder addIdentityVerificationBuilder() {
      return getIdentityVerificationFieldBuilder().addBuilder(
          com.google.ads.googleads.v16.services.IdentityVerification.getDefaultInstance());
    }
    /**
     * <pre>
     * List of identity verifications for the customer.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v16.services.IdentityVerification identity_verification = 1;</code>
     */
    public com.google.ads.googleads.v16.services.IdentityVerification.Builder addIdentityVerificationBuilder(
        int index) {
      return getIdentityVerificationFieldBuilder().addBuilder(
          index, com.google.ads.googleads.v16.services.IdentityVerification.getDefaultInstance());
    }
    /**
     * <pre>
     * List of identity verifications for the customer.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v16.services.IdentityVerification identity_verification = 1;</code>
     */
    public java.util.List<com.google.ads.googleads.v16.services.IdentityVerification.Builder> 
         getIdentityVerificationBuilderList() {
      return getIdentityVerificationFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.google.ads.googleads.v16.services.IdentityVerification, com.google.ads.googleads.v16.services.IdentityVerification.Builder, com.google.ads.googleads.v16.services.IdentityVerificationOrBuilder> 
        getIdentityVerificationFieldBuilder() {
      if (identityVerificationBuilder_ == null) {
        identityVerificationBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.ads.googleads.v16.services.IdentityVerification, com.google.ads.googleads.v16.services.IdentityVerification.Builder, com.google.ads.googleads.v16.services.IdentityVerificationOrBuilder>(
                identityVerification_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        identityVerification_ = null;
      }
      return identityVerificationBuilder_;
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


    // @@protoc_insertion_point(builder_scope:google.ads.googleads.v16.services.GetIdentityVerificationResponse)
  }

  // @@protoc_insertion_point(class_scope:google.ads.googleads.v16.services.GetIdentityVerificationResponse)
  private static final com.google.ads.googleads.v16.services.GetIdentityVerificationResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.ads.googleads.v16.services.GetIdentityVerificationResponse();
  }

  public static com.google.ads.googleads.v16.services.GetIdentityVerificationResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<GetIdentityVerificationResponse>
      PARSER = new com.google.protobuf.AbstractParser<GetIdentityVerificationResponse>() {
    @java.lang.Override
    public GetIdentityVerificationResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<GetIdentityVerificationResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<GetIdentityVerificationResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.ads.googleads.v16.services.GetIdentityVerificationResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

