// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v15/errors/errors.proto

// Protobuf Java Version: 3.25.3
package com.google.ads.googleads.v15.errors;

/**
 * <pre>
 * Error returned as part of a mutate response.
 * This error indicates single policy violation by some text
 * in one of the fields.
 * </pre>
 *
 * Protobuf type {@code google.ads.googleads.v15.errors.PolicyViolationDetails}
 */
public final class PolicyViolationDetails extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.ads.googleads.v15.errors.PolicyViolationDetails)
    PolicyViolationDetailsOrBuilder {
private static final long serialVersionUID = 0L;
  // Use PolicyViolationDetails.newBuilder() to construct.
  private PolicyViolationDetails(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private PolicyViolationDetails() {
    externalPolicyDescription_ = "";
    externalPolicyName_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new PolicyViolationDetails();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.ads.googleads.v15.errors.ErrorsProto.internal_static_google_ads_googleads_v15_errors_PolicyViolationDetails_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.ads.googleads.v15.errors.ErrorsProto.internal_static_google_ads_googleads_v15_errors_PolicyViolationDetails_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.ads.googleads.v15.errors.PolicyViolationDetails.class, com.google.ads.googleads.v15.errors.PolicyViolationDetails.Builder.class);
  }

  private int bitField0_;
  public static final int EXTERNAL_POLICY_DESCRIPTION_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private volatile java.lang.Object externalPolicyDescription_ = "";
  /**
   * <pre>
   * Human readable description of policy violation.
   * </pre>
   *
   * <code>string external_policy_description = 2;</code>
   * @return The externalPolicyDescription.
   */
  @java.lang.Override
  public java.lang.String getExternalPolicyDescription() {
    java.lang.Object ref = externalPolicyDescription_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      externalPolicyDescription_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Human readable description of policy violation.
   * </pre>
   *
   * <code>string external_policy_description = 2;</code>
   * @return The bytes for externalPolicyDescription.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getExternalPolicyDescriptionBytes() {
    java.lang.Object ref = externalPolicyDescription_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      externalPolicyDescription_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int KEY_FIELD_NUMBER = 4;
  private com.google.ads.googleads.v15.common.PolicyViolationKey key_;
  /**
   * <pre>
   * Unique identifier for this violation.
   * If policy is exemptible, this key may be used to request exemption.
   * </pre>
   *
   * <code>.google.ads.googleads.v15.common.PolicyViolationKey key = 4;</code>
   * @return Whether the key field is set.
   */
  @java.lang.Override
  public boolean hasKey() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <pre>
   * Unique identifier for this violation.
   * If policy is exemptible, this key may be used to request exemption.
   * </pre>
   *
   * <code>.google.ads.googleads.v15.common.PolicyViolationKey key = 4;</code>
   * @return The key.
   */
  @java.lang.Override
  public com.google.ads.googleads.v15.common.PolicyViolationKey getKey() {
    return key_ == null ? com.google.ads.googleads.v15.common.PolicyViolationKey.getDefaultInstance() : key_;
  }
  /**
   * <pre>
   * Unique identifier for this violation.
   * If policy is exemptible, this key may be used to request exemption.
   * </pre>
   *
   * <code>.google.ads.googleads.v15.common.PolicyViolationKey key = 4;</code>
   */
  @java.lang.Override
  public com.google.ads.googleads.v15.common.PolicyViolationKeyOrBuilder getKeyOrBuilder() {
    return key_ == null ? com.google.ads.googleads.v15.common.PolicyViolationKey.getDefaultInstance() : key_;
  }

  public static final int EXTERNAL_POLICY_NAME_FIELD_NUMBER = 5;
  @SuppressWarnings("serial")
  private volatile java.lang.Object externalPolicyName_ = "";
  /**
   * <pre>
   * Human readable name of the policy.
   * </pre>
   *
   * <code>string external_policy_name = 5;</code>
   * @return The externalPolicyName.
   */
  @java.lang.Override
  public java.lang.String getExternalPolicyName() {
    java.lang.Object ref = externalPolicyName_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      externalPolicyName_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Human readable name of the policy.
   * </pre>
   *
   * <code>string external_policy_name = 5;</code>
   * @return The bytes for externalPolicyName.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getExternalPolicyNameBytes() {
    java.lang.Object ref = externalPolicyName_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      externalPolicyName_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int IS_EXEMPTIBLE_FIELD_NUMBER = 6;
  private boolean isExemptible_ = false;
  /**
   * <pre>
   * Whether user can file an exemption request for this violation.
   * </pre>
   *
   * <code>bool is_exemptible = 6;</code>
   * @return The isExemptible.
   */
  @java.lang.Override
  public boolean getIsExemptible() {
    return isExemptible_;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(externalPolicyDescription_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, externalPolicyDescription_);
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      output.writeMessage(4, getKey());
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(externalPolicyName_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 5, externalPolicyName_);
    }
    if (isExemptible_ != false) {
      output.writeBool(6, isExemptible_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(externalPolicyDescription_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, externalPolicyDescription_);
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(4, getKey());
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(externalPolicyName_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(5, externalPolicyName_);
    }
    if (isExemptible_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(6, isExemptible_);
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
    if (!(obj instanceof com.google.ads.googleads.v15.errors.PolicyViolationDetails)) {
      return super.equals(obj);
    }
    com.google.ads.googleads.v15.errors.PolicyViolationDetails other = (com.google.ads.googleads.v15.errors.PolicyViolationDetails) obj;

    if (!getExternalPolicyDescription()
        .equals(other.getExternalPolicyDescription())) return false;
    if (hasKey() != other.hasKey()) return false;
    if (hasKey()) {
      if (!getKey()
          .equals(other.getKey())) return false;
    }
    if (!getExternalPolicyName()
        .equals(other.getExternalPolicyName())) return false;
    if (getIsExemptible()
        != other.getIsExemptible()) return false;
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
    hash = (37 * hash) + EXTERNAL_POLICY_DESCRIPTION_FIELD_NUMBER;
    hash = (53 * hash) + getExternalPolicyDescription().hashCode();
    if (hasKey()) {
      hash = (37 * hash) + KEY_FIELD_NUMBER;
      hash = (53 * hash) + getKey().hashCode();
    }
    hash = (37 * hash) + EXTERNAL_POLICY_NAME_FIELD_NUMBER;
    hash = (53 * hash) + getExternalPolicyName().hashCode();
    hash = (37 * hash) + IS_EXEMPTIBLE_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getIsExemptible());
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.ads.googleads.v15.errors.PolicyViolationDetails parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v15.errors.PolicyViolationDetails parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v15.errors.PolicyViolationDetails parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v15.errors.PolicyViolationDetails parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v15.errors.PolicyViolationDetails parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v15.errors.PolicyViolationDetails parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v15.errors.PolicyViolationDetails parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v15.errors.PolicyViolationDetails parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.google.ads.googleads.v15.errors.PolicyViolationDetails parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.ads.googleads.v15.errors.PolicyViolationDetails parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v15.errors.PolicyViolationDetails parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v15.errors.PolicyViolationDetails parseFrom(
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
  public static Builder newBuilder(com.google.ads.googleads.v15.errors.PolicyViolationDetails prototype) {
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
   * Error returned as part of a mutate response.
   * This error indicates single policy violation by some text
   * in one of the fields.
   * </pre>
   *
   * Protobuf type {@code google.ads.googleads.v15.errors.PolicyViolationDetails}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.ads.googleads.v15.errors.PolicyViolationDetails)
      com.google.ads.googleads.v15.errors.PolicyViolationDetailsOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.ads.googleads.v15.errors.ErrorsProto.internal_static_google_ads_googleads_v15_errors_PolicyViolationDetails_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.ads.googleads.v15.errors.ErrorsProto.internal_static_google_ads_googleads_v15_errors_PolicyViolationDetails_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.ads.googleads.v15.errors.PolicyViolationDetails.class, com.google.ads.googleads.v15.errors.PolicyViolationDetails.Builder.class);
    }

    // Construct using com.google.ads.googleads.v15.errors.PolicyViolationDetails.newBuilder()
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
        getKeyFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      externalPolicyDescription_ = "";
      key_ = null;
      if (keyBuilder_ != null) {
        keyBuilder_.dispose();
        keyBuilder_ = null;
      }
      externalPolicyName_ = "";
      isExemptible_ = false;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.ads.googleads.v15.errors.ErrorsProto.internal_static_google_ads_googleads_v15_errors_PolicyViolationDetails_descriptor;
    }

    @java.lang.Override
    public com.google.ads.googleads.v15.errors.PolicyViolationDetails getDefaultInstanceForType() {
      return com.google.ads.googleads.v15.errors.PolicyViolationDetails.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.ads.googleads.v15.errors.PolicyViolationDetails build() {
      com.google.ads.googleads.v15.errors.PolicyViolationDetails result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.ads.googleads.v15.errors.PolicyViolationDetails buildPartial() {
      com.google.ads.googleads.v15.errors.PolicyViolationDetails result = new com.google.ads.googleads.v15.errors.PolicyViolationDetails(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.ads.googleads.v15.errors.PolicyViolationDetails result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.externalPolicyDescription_ = externalPolicyDescription_;
      }
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.key_ = keyBuilder_ == null
            ? key_
            : keyBuilder_.build();
        to_bitField0_ |= 0x00000001;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.externalPolicyName_ = externalPolicyName_;
      }
      if (((from_bitField0_ & 0x00000008) != 0)) {
        result.isExemptible_ = isExemptible_;
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
      if (other instanceof com.google.ads.googleads.v15.errors.PolicyViolationDetails) {
        return mergeFrom((com.google.ads.googleads.v15.errors.PolicyViolationDetails)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.ads.googleads.v15.errors.PolicyViolationDetails other) {
      if (other == com.google.ads.googleads.v15.errors.PolicyViolationDetails.getDefaultInstance()) return this;
      if (!other.getExternalPolicyDescription().isEmpty()) {
        externalPolicyDescription_ = other.externalPolicyDescription_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (other.hasKey()) {
        mergeKey(other.getKey());
      }
      if (!other.getExternalPolicyName().isEmpty()) {
        externalPolicyName_ = other.externalPolicyName_;
        bitField0_ |= 0x00000004;
        onChanged();
      }
      if (other.getIsExemptible() != false) {
        setIsExemptible(other.getIsExemptible());
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
            case 18: {
              externalPolicyDescription_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
              break;
            } // case 18
            case 34: {
              input.readMessage(
                  getKeyFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000002;
              break;
            } // case 34
            case 42: {
              externalPolicyName_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000004;
              break;
            } // case 42
            case 48: {
              isExemptible_ = input.readBool();
              bitField0_ |= 0x00000008;
              break;
            } // case 48
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

    private java.lang.Object externalPolicyDescription_ = "";
    /**
     * <pre>
     * Human readable description of policy violation.
     * </pre>
     *
     * <code>string external_policy_description = 2;</code>
     * @return The externalPolicyDescription.
     */
    public java.lang.String getExternalPolicyDescription() {
      java.lang.Object ref = externalPolicyDescription_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        externalPolicyDescription_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Human readable description of policy violation.
     * </pre>
     *
     * <code>string external_policy_description = 2;</code>
     * @return The bytes for externalPolicyDescription.
     */
    public com.google.protobuf.ByteString
        getExternalPolicyDescriptionBytes() {
      java.lang.Object ref = externalPolicyDescription_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        externalPolicyDescription_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Human readable description of policy violation.
     * </pre>
     *
     * <code>string external_policy_description = 2;</code>
     * @param value The externalPolicyDescription to set.
     * @return This builder for chaining.
     */
    public Builder setExternalPolicyDescription(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      externalPolicyDescription_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Human readable description of policy violation.
     * </pre>
     *
     * <code>string external_policy_description = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearExternalPolicyDescription() {
      externalPolicyDescription_ = getDefaultInstance().getExternalPolicyDescription();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Human readable description of policy violation.
     * </pre>
     *
     * <code>string external_policy_description = 2;</code>
     * @param value The bytes for externalPolicyDescription to set.
     * @return This builder for chaining.
     */
    public Builder setExternalPolicyDescriptionBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      externalPolicyDescription_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private com.google.ads.googleads.v15.common.PolicyViolationKey key_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.ads.googleads.v15.common.PolicyViolationKey, com.google.ads.googleads.v15.common.PolicyViolationKey.Builder, com.google.ads.googleads.v15.common.PolicyViolationKeyOrBuilder> keyBuilder_;
    /**
     * <pre>
     * Unique identifier for this violation.
     * If policy is exemptible, this key may be used to request exemption.
     * </pre>
     *
     * <code>.google.ads.googleads.v15.common.PolicyViolationKey key = 4;</code>
     * @return Whether the key field is set.
     */
    public boolean hasKey() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <pre>
     * Unique identifier for this violation.
     * If policy is exemptible, this key may be used to request exemption.
     * </pre>
     *
     * <code>.google.ads.googleads.v15.common.PolicyViolationKey key = 4;</code>
     * @return The key.
     */
    public com.google.ads.googleads.v15.common.PolicyViolationKey getKey() {
      if (keyBuilder_ == null) {
        return key_ == null ? com.google.ads.googleads.v15.common.PolicyViolationKey.getDefaultInstance() : key_;
      } else {
        return keyBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * Unique identifier for this violation.
     * If policy is exemptible, this key may be used to request exemption.
     * </pre>
     *
     * <code>.google.ads.googleads.v15.common.PolicyViolationKey key = 4;</code>
     */
    public Builder setKey(com.google.ads.googleads.v15.common.PolicyViolationKey value) {
      if (keyBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        key_ = value;
      } else {
        keyBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Unique identifier for this violation.
     * If policy is exemptible, this key may be used to request exemption.
     * </pre>
     *
     * <code>.google.ads.googleads.v15.common.PolicyViolationKey key = 4;</code>
     */
    public Builder setKey(
        com.google.ads.googleads.v15.common.PolicyViolationKey.Builder builderForValue) {
      if (keyBuilder_ == null) {
        key_ = builderForValue.build();
      } else {
        keyBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Unique identifier for this violation.
     * If policy is exemptible, this key may be used to request exemption.
     * </pre>
     *
     * <code>.google.ads.googleads.v15.common.PolicyViolationKey key = 4;</code>
     */
    public Builder mergeKey(com.google.ads.googleads.v15.common.PolicyViolationKey value) {
      if (keyBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0) &&
          key_ != null &&
          key_ != com.google.ads.googleads.v15.common.PolicyViolationKey.getDefaultInstance()) {
          getKeyBuilder().mergeFrom(value);
        } else {
          key_ = value;
        }
      } else {
        keyBuilder_.mergeFrom(value);
      }
      if (key_ != null) {
        bitField0_ |= 0x00000002;
        onChanged();
      }
      return this;
    }
    /**
     * <pre>
     * Unique identifier for this violation.
     * If policy is exemptible, this key may be used to request exemption.
     * </pre>
     *
     * <code>.google.ads.googleads.v15.common.PolicyViolationKey key = 4;</code>
     */
    public Builder clearKey() {
      bitField0_ = (bitField0_ & ~0x00000002);
      key_ = null;
      if (keyBuilder_ != null) {
        keyBuilder_.dispose();
        keyBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Unique identifier for this violation.
     * If policy is exemptible, this key may be used to request exemption.
     * </pre>
     *
     * <code>.google.ads.googleads.v15.common.PolicyViolationKey key = 4;</code>
     */
    public com.google.ads.googleads.v15.common.PolicyViolationKey.Builder getKeyBuilder() {
      bitField0_ |= 0x00000002;
      onChanged();
      return getKeyFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Unique identifier for this violation.
     * If policy is exemptible, this key may be used to request exemption.
     * </pre>
     *
     * <code>.google.ads.googleads.v15.common.PolicyViolationKey key = 4;</code>
     */
    public com.google.ads.googleads.v15.common.PolicyViolationKeyOrBuilder getKeyOrBuilder() {
      if (keyBuilder_ != null) {
        return keyBuilder_.getMessageOrBuilder();
      } else {
        return key_ == null ?
            com.google.ads.googleads.v15.common.PolicyViolationKey.getDefaultInstance() : key_;
      }
    }
    /**
     * <pre>
     * Unique identifier for this violation.
     * If policy is exemptible, this key may be used to request exemption.
     * </pre>
     *
     * <code>.google.ads.googleads.v15.common.PolicyViolationKey key = 4;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.ads.googleads.v15.common.PolicyViolationKey, com.google.ads.googleads.v15.common.PolicyViolationKey.Builder, com.google.ads.googleads.v15.common.PolicyViolationKeyOrBuilder> 
        getKeyFieldBuilder() {
      if (keyBuilder_ == null) {
        keyBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.ads.googleads.v15.common.PolicyViolationKey, com.google.ads.googleads.v15.common.PolicyViolationKey.Builder, com.google.ads.googleads.v15.common.PolicyViolationKeyOrBuilder>(
                getKey(),
                getParentForChildren(),
                isClean());
        key_ = null;
      }
      return keyBuilder_;
    }

    private java.lang.Object externalPolicyName_ = "";
    /**
     * <pre>
     * Human readable name of the policy.
     * </pre>
     *
     * <code>string external_policy_name = 5;</code>
     * @return The externalPolicyName.
     */
    public java.lang.String getExternalPolicyName() {
      java.lang.Object ref = externalPolicyName_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        externalPolicyName_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Human readable name of the policy.
     * </pre>
     *
     * <code>string external_policy_name = 5;</code>
     * @return The bytes for externalPolicyName.
     */
    public com.google.protobuf.ByteString
        getExternalPolicyNameBytes() {
      java.lang.Object ref = externalPolicyName_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        externalPolicyName_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Human readable name of the policy.
     * </pre>
     *
     * <code>string external_policy_name = 5;</code>
     * @param value The externalPolicyName to set.
     * @return This builder for chaining.
     */
    public Builder setExternalPolicyName(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      externalPolicyName_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Human readable name of the policy.
     * </pre>
     *
     * <code>string external_policy_name = 5;</code>
     * @return This builder for chaining.
     */
    public Builder clearExternalPolicyName() {
      externalPolicyName_ = getDefaultInstance().getExternalPolicyName();
      bitField0_ = (bitField0_ & ~0x00000004);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Human readable name of the policy.
     * </pre>
     *
     * <code>string external_policy_name = 5;</code>
     * @param value The bytes for externalPolicyName to set.
     * @return This builder for chaining.
     */
    public Builder setExternalPolicyNameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      externalPolicyName_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }

    private boolean isExemptible_ ;
    /**
     * <pre>
     * Whether user can file an exemption request for this violation.
     * </pre>
     *
     * <code>bool is_exemptible = 6;</code>
     * @return The isExemptible.
     */
    @java.lang.Override
    public boolean getIsExemptible() {
      return isExemptible_;
    }
    /**
     * <pre>
     * Whether user can file an exemption request for this violation.
     * </pre>
     *
     * <code>bool is_exemptible = 6;</code>
     * @param value The isExemptible to set.
     * @return This builder for chaining.
     */
    public Builder setIsExemptible(boolean value) {

      isExemptible_ = value;
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Whether user can file an exemption request for this violation.
     * </pre>
     *
     * <code>bool is_exemptible = 6;</code>
     * @return This builder for chaining.
     */
    public Builder clearIsExemptible() {
      bitField0_ = (bitField0_ & ~0x00000008);
      isExemptible_ = false;
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


    // @@protoc_insertion_point(builder_scope:google.ads.googleads.v15.errors.PolicyViolationDetails)
  }

  // @@protoc_insertion_point(class_scope:google.ads.googleads.v15.errors.PolicyViolationDetails)
  private static final com.google.ads.googleads.v15.errors.PolicyViolationDetails DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.ads.googleads.v15.errors.PolicyViolationDetails();
  }

  public static com.google.ads.googleads.v15.errors.PolicyViolationDetails getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<PolicyViolationDetails>
      PARSER = new com.google.protobuf.AbstractParser<PolicyViolationDetails>() {
    @java.lang.Override
    public PolicyViolationDetails parsePartialFrom(
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

  public static com.google.protobuf.Parser<PolicyViolationDetails> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<PolicyViolationDetails> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.ads.googleads.v15.errors.PolicyViolationDetails getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

