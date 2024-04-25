// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v16/common/asset_policy.proto

// Protobuf Java Version: 3.25.3
package com.google.ads.googleads.v16.common;

/**
 * <pre>
 * Details related to AssetLinkPrimaryStatusReasonPB.ASSET_DISAPPROVED
 * </pre>
 *
 * Protobuf type {@code google.ads.googleads.v16.common.AssetDisapproved}
 */
public final class AssetDisapproved extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.ads.googleads.v16.common.AssetDisapproved)
    AssetDisapprovedOrBuilder {
private static final long serialVersionUID = 0L;
  // Use AssetDisapproved.newBuilder() to construct.
  private AssetDisapproved(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private AssetDisapproved() {
    offlineEvaluationErrorReasons_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new AssetDisapproved();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.ads.googleads.v16.common.AssetPolicyProto.internal_static_google_ads_googleads_v16_common_AssetDisapproved_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.ads.googleads.v16.common.AssetPolicyProto.internal_static_google_ads_googleads_v16_common_AssetDisapproved_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.ads.googleads.v16.common.AssetDisapproved.class, com.google.ads.googleads.v16.common.AssetDisapproved.Builder.class);
  }

  public static final int OFFLINE_EVALUATION_ERROR_REASONS_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private java.util.List<java.lang.Integer> offlineEvaluationErrorReasons_;
  private static final com.google.protobuf.Internal.ListAdapter.Converter<
      java.lang.Integer, com.google.ads.googleads.v16.enums.AssetOfflineEvaluationErrorReasonsEnum.AssetOfflineEvaluationErrorReasons> offlineEvaluationErrorReasons_converter_ =
          new com.google.protobuf.Internal.ListAdapter.Converter<
              java.lang.Integer, com.google.ads.googleads.v16.enums.AssetOfflineEvaluationErrorReasonsEnum.AssetOfflineEvaluationErrorReasons>() {
            public com.google.ads.googleads.v16.enums.AssetOfflineEvaluationErrorReasonsEnum.AssetOfflineEvaluationErrorReasons convert(java.lang.Integer from) {
              com.google.ads.googleads.v16.enums.AssetOfflineEvaluationErrorReasonsEnum.AssetOfflineEvaluationErrorReasons result = com.google.ads.googleads.v16.enums.AssetOfflineEvaluationErrorReasonsEnum.AssetOfflineEvaluationErrorReasons.forNumber(from);
              return result == null ? com.google.ads.googleads.v16.enums.AssetOfflineEvaluationErrorReasonsEnum.AssetOfflineEvaluationErrorReasons.UNRECOGNIZED : result;
            }
          };
  /**
   * <pre>
   * Provides the quality evaluation disapproval reason of an asset.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v16.enums.AssetOfflineEvaluationErrorReasonsEnum.AssetOfflineEvaluationErrorReasons offline_evaluation_error_reasons = 1;</code>
   * @return A list containing the offlineEvaluationErrorReasons.
   */
  @java.lang.Override
  public java.util.List<com.google.ads.googleads.v16.enums.AssetOfflineEvaluationErrorReasonsEnum.AssetOfflineEvaluationErrorReasons> getOfflineEvaluationErrorReasonsList() {
    return new com.google.protobuf.Internal.ListAdapter<
        java.lang.Integer, com.google.ads.googleads.v16.enums.AssetOfflineEvaluationErrorReasonsEnum.AssetOfflineEvaluationErrorReasons>(offlineEvaluationErrorReasons_, offlineEvaluationErrorReasons_converter_);
  }
  /**
   * <pre>
   * Provides the quality evaluation disapproval reason of an asset.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v16.enums.AssetOfflineEvaluationErrorReasonsEnum.AssetOfflineEvaluationErrorReasons offline_evaluation_error_reasons = 1;</code>
   * @return The count of offlineEvaluationErrorReasons.
   */
  @java.lang.Override
  public int getOfflineEvaluationErrorReasonsCount() {
    return offlineEvaluationErrorReasons_.size();
  }
  /**
   * <pre>
   * Provides the quality evaluation disapproval reason of an asset.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v16.enums.AssetOfflineEvaluationErrorReasonsEnum.AssetOfflineEvaluationErrorReasons offline_evaluation_error_reasons = 1;</code>
   * @param index The index of the element to return.
   * @return The offlineEvaluationErrorReasons at the given index.
   */
  @java.lang.Override
  public com.google.ads.googleads.v16.enums.AssetOfflineEvaluationErrorReasonsEnum.AssetOfflineEvaluationErrorReasons getOfflineEvaluationErrorReasons(int index) {
    return offlineEvaluationErrorReasons_converter_.convert(offlineEvaluationErrorReasons_.get(index));
  }
  /**
   * <pre>
   * Provides the quality evaluation disapproval reason of an asset.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v16.enums.AssetOfflineEvaluationErrorReasonsEnum.AssetOfflineEvaluationErrorReasons offline_evaluation_error_reasons = 1;</code>
   * @return A list containing the enum numeric values on the wire for offlineEvaluationErrorReasons.
   */
  @java.lang.Override
  public java.util.List<java.lang.Integer>
  getOfflineEvaluationErrorReasonsValueList() {
    return offlineEvaluationErrorReasons_;
  }
  /**
   * <pre>
   * Provides the quality evaluation disapproval reason of an asset.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v16.enums.AssetOfflineEvaluationErrorReasonsEnum.AssetOfflineEvaluationErrorReasons offline_evaluation_error_reasons = 1;</code>
   * @param index The index of the value to return.
   * @return The enum numeric value on the wire of offlineEvaluationErrorReasons at the given index.
   */
  @java.lang.Override
  public int getOfflineEvaluationErrorReasonsValue(int index) {
    return offlineEvaluationErrorReasons_.get(index);
  }
  private int offlineEvaluationErrorReasonsMemoizedSerializedSize;

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
    getSerializedSize();
    if (getOfflineEvaluationErrorReasonsList().size() > 0) {
      output.writeUInt32NoTag(10);
      output.writeUInt32NoTag(offlineEvaluationErrorReasonsMemoizedSerializedSize);
    }
    for (int i = 0; i < offlineEvaluationErrorReasons_.size(); i++) {
      output.writeEnumNoTag(offlineEvaluationErrorReasons_.get(i));
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    {
      int dataSize = 0;
      for (int i = 0; i < offlineEvaluationErrorReasons_.size(); i++) {
        dataSize += com.google.protobuf.CodedOutputStream
          .computeEnumSizeNoTag(offlineEvaluationErrorReasons_.get(i));
      }
      size += dataSize;
      if (!getOfflineEvaluationErrorReasonsList().isEmpty()) {  size += 1;
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32SizeNoTag(dataSize);
      }offlineEvaluationErrorReasonsMemoizedSerializedSize = dataSize;
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
    if (!(obj instanceof com.google.ads.googleads.v16.common.AssetDisapproved)) {
      return super.equals(obj);
    }
    com.google.ads.googleads.v16.common.AssetDisapproved other = (com.google.ads.googleads.v16.common.AssetDisapproved) obj;

    if (!offlineEvaluationErrorReasons_.equals(other.offlineEvaluationErrorReasons_)) return false;
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
    if (getOfflineEvaluationErrorReasonsCount() > 0) {
      hash = (37 * hash) + OFFLINE_EVALUATION_ERROR_REASONS_FIELD_NUMBER;
      hash = (53 * hash) + offlineEvaluationErrorReasons_.hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.ads.googleads.v16.common.AssetDisapproved parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v16.common.AssetDisapproved parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v16.common.AssetDisapproved parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v16.common.AssetDisapproved parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v16.common.AssetDisapproved parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v16.common.AssetDisapproved parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v16.common.AssetDisapproved parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v16.common.AssetDisapproved parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.google.ads.googleads.v16.common.AssetDisapproved parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.ads.googleads.v16.common.AssetDisapproved parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v16.common.AssetDisapproved parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v16.common.AssetDisapproved parseFrom(
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
  public static Builder newBuilder(com.google.ads.googleads.v16.common.AssetDisapproved prototype) {
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
   * Details related to AssetLinkPrimaryStatusReasonPB.ASSET_DISAPPROVED
   * </pre>
   *
   * Protobuf type {@code google.ads.googleads.v16.common.AssetDisapproved}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.ads.googleads.v16.common.AssetDisapproved)
      com.google.ads.googleads.v16.common.AssetDisapprovedOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.ads.googleads.v16.common.AssetPolicyProto.internal_static_google_ads_googleads_v16_common_AssetDisapproved_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.ads.googleads.v16.common.AssetPolicyProto.internal_static_google_ads_googleads_v16_common_AssetDisapproved_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.ads.googleads.v16.common.AssetDisapproved.class, com.google.ads.googleads.v16.common.AssetDisapproved.Builder.class);
    }

    // Construct using com.google.ads.googleads.v16.common.AssetDisapproved.newBuilder()
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
      offlineEvaluationErrorReasons_ = java.util.Collections.emptyList();
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.ads.googleads.v16.common.AssetPolicyProto.internal_static_google_ads_googleads_v16_common_AssetDisapproved_descriptor;
    }

    @java.lang.Override
    public com.google.ads.googleads.v16.common.AssetDisapproved getDefaultInstanceForType() {
      return com.google.ads.googleads.v16.common.AssetDisapproved.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.ads.googleads.v16.common.AssetDisapproved build() {
      com.google.ads.googleads.v16.common.AssetDisapproved result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.ads.googleads.v16.common.AssetDisapproved buildPartial() {
      com.google.ads.googleads.v16.common.AssetDisapproved result = new com.google.ads.googleads.v16.common.AssetDisapproved(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(com.google.ads.googleads.v16.common.AssetDisapproved result) {
      if (((bitField0_ & 0x00000001) != 0)) {
        offlineEvaluationErrorReasons_ = java.util.Collections.unmodifiableList(offlineEvaluationErrorReasons_);
        bitField0_ = (bitField0_ & ~0x00000001);
      }
      result.offlineEvaluationErrorReasons_ = offlineEvaluationErrorReasons_;
    }

    private void buildPartial0(com.google.ads.googleads.v16.common.AssetDisapproved result) {
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
      if (other instanceof com.google.ads.googleads.v16.common.AssetDisapproved) {
        return mergeFrom((com.google.ads.googleads.v16.common.AssetDisapproved)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.ads.googleads.v16.common.AssetDisapproved other) {
      if (other == com.google.ads.googleads.v16.common.AssetDisapproved.getDefaultInstance()) return this;
      if (!other.offlineEvaluationErrorReasons_.isEmpty()) {
        if (offlineEvaluationErrorReasons_.isEmpty()) {
          offlineEvaluationErrorReasons_ = other.offlineEvaluationErrorReasons_;
          bitField0_ = (bitField0_ & ~0x00000001);
        } else {
          ensureOfflineEvaluationErrorReasonsIsMutable();
          offlineEvaluationErrorReasons_.addAll(other.offlineEvaluationErrorReasons_);
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
            case 8: {
              int tmpRaw = input.readEnum();
              ensureOfflineEvaluationErrorReasonsIsMutable();
              offlineEvaluationErrorReasons_.add(tmpRaw);
              break;
            } // case 8
            case 10: {
              int length = input.readRawVarint32();
              int oldLimit = input.pushLimit(length);
              while(input.getBytesUntilLimit() > 0) {
                int tmpRaw = input.readEnum();
                ensureOfflineEvaluationErrorReasonsIsMutable();
                offlineEvaluationErrorReasons_.add(tmpRaw);
              }
              input.popLimit(oldLimit);
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

    private java.util.List<java.lang.Integer> offlineEvaluationErrorReasons_ =
      java.util.Collections.emptyList();
    private void ensureOfflineEvaluationErrorReasonsIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        offlineEvaluationErrorReasons_ = new java.util.ArrayList<java.lang.Integer>(offlineEvaluationErrorReasons_);
        bitField0_ |= 0x00000001;
      }
    }
    /**
     * <pre>
     * Provides the quality evaluation disapproval reason of an asset.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v16.enums.AssetOfflineEvaluationErrorReasonsEnum.AssetOfflineEvaluationErrorReasons offline_evaluation_error_reasons = 1;</code>
     * @return A list containing the offlineEvaluationErrorReasons.
     */
    public java.util.List<com.google.ads.googleads.v16.enums.AssetOfflineEvaluationErrorReasonsEnum.AssetOfflineEvaluationErrorReasons> getOfflineEvaluationErrorReasonsList() {
      return new com.google.protobuf.Internal.ListAdapter<
          java.lang.Integer, com.google.ads.googleads.v16.enums.AssetOfflineEvaluationErrorReasonsEnum.AssetOfflineEvaluationErrorReasons>(offlineEvaluationErrorReasons_, offlineEvaluationErrorReasons_converter_);
    }
    /**
     * <pre>
     * Provides the quality evaluation disapproval reason of an asset.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v16.enums.AssetOfflineEvaluationErrorReasonsEnum.AssetOfflineEvaluationErrorReasons offline_evaluation_error_reasons = 1;</code>
     * @return The count of offlineEvaluationErrorReasons.
     */
    public int getOfflineEvaluationErrorReasonsCount() {
      return offlineEvaluationErrorReasons_.size();
    }
    /**
     * <pre>
     * Provides the quality evaluation disapproval reason of an asset.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v16.enums.AssetOfflineEvaluationErrorReasonsEnum.AssetOfflineEvaluationErrorReasons offline_evaluation_error_reasons = 1;</code>
     * @param index The index of the element to return.
     * @return The offlineEvaluationErrorReasons at the given index.
     */
    public com.google.ads.googleads.v16.enums.AssetOfflineEvaluationErrorReasonsEnum.AssetOfflineEvaluationErrorReasons getOfflineEvaluationErrorReasons(int index) {
      return offlineEvaluationErrorReasons_converter_.convert(offlineEvaluationErrorReasons_.get(index));
    }
    /**
     * <pre>
     * Provides the quality evaluation disapproval reason of an asset.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v16.enums.AssetOfflineEvaluationErrorReasonsEnum.AssetOfflineEvaluationErrorReasons offline_evaluation_error_reasons = 1;</code>
     * @param index The index to set the value at.
     * @param value The offlineEvaluationErrorReasons to set.
     * @return This builder for chaining.
     */
    public Builder setOfflineEvaluationErrorReasons(
        int index, com.google.ads.googleads.v16.enums.AssetOfflineEvaluationErrorReasonsEnum.AssetOfflineEvaluationErrorReasons value) {
      if (value == null) {
        throw new NullPointerException();
      }
      ensureOfflineEvaluationErrorReasonsIsMutable();
      offlineEvaluationErrorReasons_.set(index, value.getNumber());
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Provides the quality evaluation disapproval reason of an asset.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v16.enums.AssetOfflineEvaluationErrorReasonsEnum.AssetOfflineEvaluationErrorReasons offline_evaluation_error_reasons = 1;</code>
     * @param value The offlineEvaluationErrorReasons to add.
     * @return This builder for chaining.
     */
    public Builder addOfflineEvaluationErrorReasons(com.google.ads.googleads.v16.enums.AssetOfflineEvaluationErrorReasonsEnum.AssetOfflineEvaluationErrorReasons value) {
      if (value == null) {
        throw new NullPointerException();
      }
      ensureOfflineEvaluationErrorReasonsIsMutable();
      offlineEvaluationErrorReasons_.add(value.getNumber());
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Provides the quality evaluation disapproval reason of an asset.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v16.enums.AssetOfflineEvaluationErrorReasonsEnum.AssetOfflineEvaluationErrorReasons offline_evaluation_error_reasons = 1;</code>
     * @param values The offlineEvaluationErrorReasons to add.
     * @return This builder for chaining.
     */
    public Builder addAllOfflineEvaluationErrorReasons(
        java.lang.Iterable<? extends com.google.ads.googleads.v16.enums.AssetOfflineEvaluationErrorReasonsEnum.AssetOfflineEvaluationErrorReasons> values) {
      ensureOfflineEvaluationErrorReasonsIsMutable();
      for (com.google.ads.googleads.v16.enums.AssetOfflineEvaluationErrorReasonsEnum.AssetOfflineEvaluationErrorReasons value : values) {
        offlineEvaluationErrorReasons_.add(value.getNumber());
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Provides the quality evaluation disapproval reason of an asset.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v16.enums.AssetOfflineEvaluationErrorReasonsEnum.AssetOfflineEvaluationErrorReasons offline_evaluation_error_reasons = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearOfflineEvaluationErrorReasons() {
      offlineEvaluationErrorReasons_ = java.util.Collections.emptyList();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Provides the quality evaluation disapproval reason of an asset.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v16.enums.AssetOfflineEvaluationErrorReasonsEnum.AssetOfflineEvaluationErrorReasons offline_evaluation_error_reasons = 1;</code>
     * @return A list containing the enum numeric values on the wire for offlineEvaluationErrorReasons.
     */
    public java.util.List<java.lang.Integer>
    getOfflineEvaluationErrorReasonsValueList() {
      return java.util.Collections.unmodifiableList(offlineEvaluationErrorReasons_);
    }
    /**
     * <pre>
     * Provides the quality evaluation disapproval reason of an asset.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v16.enums.AssetOfflineEvaluationErrorReasonsEnum.AssetOfflineEvaluationErrorReasons offline_evaluation_error_reasons = 1;</code>
     * @param index The index of the value to return.
     * @return The enum numeric value on the wire of offlineEvaluationErrorReasons at the given index.
     */
    public int getOfflineEvaluationErrorReasonsValue(int index) {
      return offlineEvaluationErrorReasons_.get(index);
    }
    /**
     * <pre>
     * Provides the quality evaluation disapproval reason of an asset.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v16.enums.AssetOfflineEvaluationErrorReasonsEnum.AssetOfflineEvaluationErrorReasons offline_evaluation_error_reasons = 1;</code>
     * @param index The index to set the value at.
     * @param value The enum numeric value on the wire for offlineEvaluationErrorReasons to set.
     * @return This builder for chaining.
     */
    public Builder setOfflineEvaluationErrorReasonsValue(
        int index, int value) {
      ensureOfflineEvaluationErrorReasonsIsMutable();
      offlineEvaluationErrorReasons_.set(index, value);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Provides the quality evaluation disapproval reason of an asset.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v16.enums.AssetOfflineEvaluationErrorReasonsEnum.AssetOfflineEvaluationErrorReasons offline_evaluation_error_reasons = 1;</code>
     * @param value The enum numeric value on the wire for offlineEvaluationErrorReasons to add.
     * @return This builder for chaining.
     */
    public Builder addOfflineEvaluationErrorReasonsValue(int value) {
      ensureOfflineEvaluationErrorReasonsIsMutable();
      offlineEvaluationErrorReasons_.add(value);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Provides the quality evaluation disapproval reason of an asset.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v16.enums.AssetOfflineEvaluationErrorReasonsEnum.AssetOfflineEvaluationErrorReasons offline_evaluation_error_reasons = 1;</code>
     * @param values The enum numeric values on the wire for offlineEvaluationErrorReasons to add.
     * @return This builder for chaining.
     */
    public Builder addAllOfflineEvaluationErrorReasonsValue(
        java.lang.Iterable<java.lang.Integer> values) {
      ensureOfflineEvaluationErrorReasonsIsMutable();
      for (int value : values) {
        offlineEvaluationErrorReasons_.add(value);
      }
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


    // @@protoc_insertion_point(builder_scope:google.ads.googleads.v16.common.AssetDisapproved)
  }

  // @@protoc_insertion_point(class_scope:google.ads.googleads.v16.common.AssetDisapproved)
  private static final com.google.ads.googleads.v16.common.AssetDisapproved DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.ads.googleads.v16.common.AssetDisapproved();
  }

  public static com.google.ads.googleads.v16.common.AssetDisapproved getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<AssetDisapproved>
      PARSER = new com.google.protobuf.AbstractParser<AssetDisapproved>() {
    @java.lang.Override
    public AssetDisapproved parsePartialFrom(
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

  public static com.google.protobuf.Parser<AssetDisapproved> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<AssetDisapproved> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.ads.googleads.v16.common.AssetDisapproved getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

