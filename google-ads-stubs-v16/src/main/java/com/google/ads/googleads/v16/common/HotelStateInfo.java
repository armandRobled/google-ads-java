// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v16/common/criteria.proto

// Protobuf Java Version: 3.25.3
package com.google.ads.googleads.v16.common;

/**
 * <pre>
 * State the hotel is located in.
 * </pre>
 *
 * Protobuf type {@code google.ads.googleads.v16.common.HotelStateInfo}
 */
public final class HotelStateInfo extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.ads.googleads.v16.common.HotelStateInfo)
    HotelStateInfoOrBuilder {
private static final long serialVersionUID = 0L;
  // Use HotelStateInfo.newBuilder() to construct.
  private HotelStateInfo(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private HotelStateInfo() {
    stateCriterion_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new HotelStateInfo();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.ads.googleads.v16.common.CriteriaProto.internal_static_google_ads_googleads_v16_common_HotelStateInfo_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.ads.googleads.v16.common.CriteriaProto.internal_static_google_ads_googleads_v16_common_HotelStateInfo_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.ads.googleads.v16.common.HotelStateInfo.class, com.google.ads.googleads.v16.common.HotelStateInfo.Builder.class);
  }

  private int bitField0_;
  public static final int STATE_CRITERION_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private volatile java.lang.Object stateCriterion_ = "";
  /**
   * <pre>
   * The Geo Target Constant resource name.
   * </pre>
   *
   * <code>optional string state_criterion = 2;</code>
   * @return Whether the stateCriterion field is set.
   */
  @java.lang.Override
  public boolean hasStateCriterion() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <pre>
   * The Geo Target Constant resource name.
   * </pre>
   *
   * <code>optional string state_criterion = 2;</code>
   * @return The stateCriterion.
   */
  @java.lang.Override
  public java.lang.String getStateCriterion() {
    java.lang.Object ref = stateCriterion_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      stateCriterion_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * The Geo Target Constant resource name.
   * </pre>
   *
   * <code>optional string state_criterion = 2;</code>
   * @return The bytes for stateCriterion.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getStateCriterionBytes() {
    java.lang.Object ref = stateCriterion_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      stateCriterion_ = b;
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
    if (((bitField0_ & 0x00000001) != 0)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, stateCriterion_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, stateCriterion_);
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
    if (!(obj instanceof com.google.ads.googleads.v16.common.HotelStateInfo)) {
      return super.equals(obj);
    }
    com.google.ads.googleads.v16.common.HotelStateInfo other = (com.google.ads.googleads.v16.common.HotelStateInfo) obj;

    if (hasStateCriterion() != other.hasStateCriterion()) return false;
    if (hasStateCriterion()) {
      if (!getStateCriterion()
          .equals(other.getStateCriterion())) return false;
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
    if (hasStateCriterion()) {
      hash = (37 * hash) + STATE_CRITERION_FIELD_NUMBER;
      hash = (53 * hash) + getStateCriterion().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.ads.googleads.v16.common.HotelStateInfo parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v16.common.HotelStateInfo parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v16.common.HotelStateInfo parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v16.common.HotelStateInfo parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v16.common.HotelStateInfo parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v16.common.HotelStateInfo parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v16.common.HotelStateInfo parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v16.common.HotelStateInfo parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.google.ads.googleads.v16.common.HotelStateInfo parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.ads.googleads.v16.common.HotelStateInfo parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v16.common.HotelStateInfo parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v16.common.HotelStateInfo parseFrom(
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
  public static Builder newBuilder(com.google.ads.googleads.v16.common.HotelStateInfo prototype) {
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
   * State the hotel is located in.
   * </pre>
   *
   * Protobuf type {@code google.ads.googleads.v16.common.HotelStateInfo}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.ads.googleads.v16.common.HotelStateInfo)
      com.google.ads.googleads.v16.common.HotelStateInfoOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.ads.googleads.v16.common.CriteriaProto.internal_static_google_ads_googleads_v16_common_HotelStateInfo_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.ads.googleads.v16.common.CriteriaProto.internal_static_google_ads_googleads_v16_common_HotelStateInfo_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.ads.googleads.v16.common.HotelStateInfo.class, com.google.ads.googleads.v16.common.HotelStateInfo.Builder.class);
    }

    // Construct using com.google.ads.googleads.v16.common.HotelStateInfo.newBuilder()
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
      stateCriterion_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.ads.googleads.v16.common.CriteriaProto.internal_static_google_ads_googleads_v16_common_HotelStateInfo_descriptor;
    }

    @java.lang.Override
    public com.google.ads.googleads.v16.common.HotelStateInfo getDefaultInstanceForType() {
      return com.google.ads.googleads.v16.common.HotelStateInfo.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.ads.googleads.v16.common.HotelStateInfo build() {
      com.google.ads.googleads.v16.common.HotelStateInfo result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.ads.googleads.v16.common.HotelStateInfo buildPartial() {
      com.google.ads.googleads.v16.common.HotelStateInfo result = new com.google.ads.googleads.v16.common.HotelStateInfo(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.ads.googleads.v16.common.HotelStateInfo result) {
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.stateCriterion_ = stateCriterion_;
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
      if (other instanceof com.google.ads.googleads.v16.common.HotelStateInfo) {
        return mergeFrom((com.google.ads.googleads.v16.common.HotelStateInfo)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.ads.googleads.v16.common.HotelStateInfo other) {
      if (other == com.google.ads.googleads.v16.common.HotelStateInfo.getDefaultInstance()) return this;
      if (other.hasStateCriterion()) {
        stateCriterion_ = other.stateCriterion_;
        bitField0_ |= 0x00000001;
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
            case 18: {
              stateCriterion_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
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

    private java.lang.Object stateCriterion_ = "";
    /**
     * <pre>
     * The Geo Target Constant resource name.
     * </pre>
     *
     * <code>optional string state_criterion = 2;</code>
     * @return Whether the stateCriterion field is set.
     */
    public boolean hasStateCriterion() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <pre>
     * The Geo Target Constant resource name.
     * </pre>
     *
     * <code>optional string state_criterion = 2;</code>
     * @return The stateCriterion.
     */
    public java.lang.String getStateCriterion() {
      java.lang.Object ref = stateCriterion_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        stateCriterion_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * The Geo Target Constant resource name.
     * </pre>
     *
     * <code>optional string state_criterion = 2;</code>
     * @return The bytes for stateCriterion.
     */
    public com.google.protobuf.ByteString
        getStateCriterionBytes() {
      java.lang.Object ref = stateCriterion_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        stateCriterion_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * The Geo Target Constant resource name.
     * </pre>
     *
     * <code>optional string state_criterion = 2;</code>
     * @param value The stateCriterion to set.
     * @return This builder for chaining.
     */
    public Builder setStateCriterion(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      stateCriterion_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The Geo Target Constant resource name.
     * </pre>
     *
     * <code>optional string state_criterion = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearStateCriterion() {
      stateCriterion_ = getDefaultInstance().getStateCriterion();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The Geo Target Constant resource name.
     * </pre>
     *
     * <code>optional string state_criterion = 2;</code>
     * @param value The bytes for stateCriterion to set.
     * @return This builder for chaining.
     */
    public Builder setStateCriterionBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      stateCriterion_ = value;
      bitField0_ |= 0x00000001;
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


    // @@protoc_insertion_point(builder_scope:google.ads.googleads.v16.common.HotelStateInfo)
  }

  // @@protoc_insertion_point(class_scope:google.ads.googleads.v16.common.HotelStateInfo)
  private static final com.google.ads.googleads.v16.common.HotelStateInfo DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.ads.googleads.v16.common.HotelStateInfo();
  }

  public static com.google.ads.googleads.v16.common.HotelStateInfo getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<HotelStateInfo>
      PARSER = new com.google.protobuf.AbstractParser<HotelStateInfo>() {
    @java.lang.Override
    public HotelStateInfo parsePartialFrom(
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

  public static com.google.protobuf.Parser<HotelStateInfo> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<HotelStateInfo> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.ads.googleads.v16.common.HotelStateInfo getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

