// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v16/common/ad_type_infos.proto

// Protobuf Java Version: 3.25.3
package com.google.ads.googleads.v16.common;

/**
 * <pre>
 * A text ad.
 * </pre>
 *
 * Protobuf type {@code google.ads.googleads.v16.common.TextAdInfo}
 */
public final class TextAdInfo extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.ads.googleads.v16.common.TextAdInfo)
    TextAdInfoOrBuilder {
private static final long serialVersionUID = 0L;
  // Use TextAdInfo.newBuilder() to construct.
  private TextAdInfo(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private TextAdInfo() {
    headline_ = "";
    description1_ = "";
    description2_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new TextAdInfo();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.ads.googleads.v16.common.AdTypeInfosProto.internal_static_google_ads_googleads_v16_common_TextAdInfo_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.ads.googleads.v16.common.AdTypeInfosProto.internal_static_google_ads_googleads_v16_common_TextAdInfo_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.ads.googleads.v16.common.TextAdInfo.class, com.google.ads.googleads.v16.common.TextAdInfo.Builder.class);
  }

  private int bitField0_;
  public static final int HEADLINE_FIELD_NUMBER = 4;
  @SuppressWarnings("serial")
  private volatile java.lang.Object headline_ = "";
  /**
   * <pre>
   * The headline of the ad.
   * </pre>
   *
   * <code>optional string headline = 4;</code>
   * @return Whether the headline field is set.
   */
  @java.lang.Override
  public boolean hasHeadline() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <pre>
   * The headline of the ad.
   * </pre>
   *
   * <code>optional string headline = 4;</code>
   * @return The headline.
   */
  @java.lang.Override
  public java.lang.String getHeadline() {
    java.lang.Object ref = headline_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      headline_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * The headline of the ad.
   * </pre>
   *
   * <code>optional string headline = 4;</code>
   * @return The bytes for headline.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getHeadlineBytes() {
    java.lang.Object ref = headline_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      headline_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int DESCRIPTION1_FIELD_NUMBER = 5;
  @SuppressWarnings("serial")
  private volatile java.lang.Object description1_ = "";
  /**
   * <pre>
   * The first line of the ad's description.
   * </pre>
   *
   * <code>optional string description1 = 5;</code>
   * @return Whether the description1 field is set.
   */
  @java.lang.Override
  public boolean hasDescription1() {
    return ((bitField0_ & 0x00000002) != 0);
  }
  /**
   * <pre>
   * The first line of the ad's description.
   * </pre>
   *
   * <code>optional string description1 = 5;</code>
   * @return The description1.
   */
  @java.lang.Override
  public java.lang.String getDescription1() {
    java.lang.Object ref = description1_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      description1_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * The first line of the ad's description.
   * </pre>
   *
   * <code>optional string description1 = 5;</code>
   * @return The bytes for description1.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getDescription1Bytes() {
    java.lang.Object ref = description1_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      description1_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int DESCRIPTION2_FIELD_NUMBER = 6;
  @SuppressWarnings("serial")
  private volatile java.lang.Object description2_ = "";
  /**
   * <pre>
   * The second line of the ad's description.
   * </pre>
   *
   * <code>optional string description2 = 6;</code>
   * @return Whether the description2 field is set.
   */
  @java.lang.Override
  public boolean hasDescription2() {
    return ((bitField0_ & 0x00000004) != 0);
  }
  /**
   * <pre>
   * The second line of the ad's description.
   * </pre>
   *
   * <code>optional string description2 = 6;</code>
   * @return The description2.
   */
  @java.lang.Override
  public java.lang.String getDescription2() {
    java.lang.Object ref = description2_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      description2_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * The second line of the ad's description.
   * </pre>
   *
   * <code>optional string description2 = 6;</code>
   * @return The bytes for description2.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getDescription2Bytes() {
    java.lang.Object ref = description2_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      description2_ = b;
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
      com.google.protobuf.GeneratedMessageV3.writeString(output, 4, headline_);
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 5, description1_);
    }
    if (((bitField0_ & 0x00000004) != 0)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 6, description2_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(4, headline_);
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(5, description1_);
    }
    if (((bitField0_ & 0x00000004) != 0)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(6, description2_);
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
    if (!(obj instanceof com.google.ads.googleads.v16.common.TextAdInfo)) {
      return super.equals(obj);
    }
    com.google.ads.googleads.v16.common.TextAdInfo other = (com.google.ads.googleads.v16.common.TextAdInfo) obj;

    if (hasHeadline() != other.hasHeadline()) return false;
    if (hasHeadline()) {
      if (!getHeadline()
          .equals(other.getHeadline())) return false;
    }
    if (hasDescription1() != other.hasDescription1()) return false;
    if (hasDescription1()) {
      if (!getDescription1()
          .equals(other.getDescription1())) return false;
    }
    if (hasDescription2() != other.hasDescription2()) return false;
    if (hasDescription2()) {
      if (!getDescription2()
          .equals(other.getDescription2())) return false;
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
    if (hasHeadline()) {
      hash = (37 * hash) + HEADLINE_FIELD_NUMBER;
      hash = (53 * hash) + getHeadline().hashCode();
    }
    if (hasDescription1()) {
      hash = (37 * hash) + DESCRIPTION1_FIELD_NUMBER;
      hash = (53 * hash) + getDescription1().hashCode();
    }
    if (hasDescription2()) {
      hash = (37 * hash) + DESCRIPTION2_FIELD_NUMBER;
      hash = (53 * hash) + getDescription2().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.ads.googleads.v16.common.TextAdInfo parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v16.common.TextAdInfo parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v16.common.TextAdInfo parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v16.common.TextAdInfo parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v16.common.TextAdInfo parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v16.common.TextAdInfo parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v16.common.TextAdInfo parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v16.common.TextAdInfo parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.google.ads.googleads.v16.common.TextAdInfo parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.ads.googleads.v16.common.TextAdInfo parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v16.common.TextAdInfo parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v16.common.TextAdInfo parseFrom(
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
  public static Builder newBuilder(com.google.ads.googleads.v16.common.TextAdInfo prototype) {
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
   * A text ad.
   * </pre>
   *
   * Protobuf type {@code google.ads.googleads.v16.common.TextAdInfo}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.ads.googleads.v16.common.TextAdInfo)
      com.google.ads.googleads.v16.common.TextAdInfoOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.ads.googleads.v16.common.AdTypeInfosProto.internal_static_google_ads_googleads_v16_common_TextAdInfo_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.ads.googleads.v16.common.AdTypeInfosProto.internal_static_google_ads_googleads_v16_common_TextAdInfo_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.ads.googleads.v16.common.TextAdInfo.class, com.google.ads.googleads.v16.common.TextAdInfo.Builder.class);
    }

    // Construct using com.google.ads.googleads.v16.common.TextAdInfo.newBuilder()
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
      headline_ = "";
      description1_ = "";
      description2_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.ads.googleads.v16.common.AdTypeInfosProto.internal_static_google_ads_googleads_v16_common_TextAdInfo_descriptor;
    }

    @java.lang.Override
    public com.google.ads.googleads.v16.common.TextAdInfo getDefaultInstanceForType() {
      return com.google.ads.googleads.v16.common.TextAdInfo.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.ads.googleads.v16.common.TextAdInfo build() {
      com.google.ads.googleads.v16.common.TextAdInfo result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.ads.googleads.v16.common.TextAdInfo buildPartial() {
      com.google.ads.googleads.v16.common.TextAdInfo result = new com.google.ads.googleads.v16.common.TextAdInfo(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.ads.googleads.v16.common.TextAdInfo result) {
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.headline_ = headline_;
        to_bitField0_ |= 0x00000001;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.description1_ = description1_;
        to_bitField0_ |= 0x00000002;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.description2_ = description2_;
        to_bitField0_ |= 0x00000004;
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
      if (other instanceof com.google.ads.googleads.v16.common.TextAdInfo) {
        return mergeFrom((com.google.ads.googleads.v16.common.TextAdInfo)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.ads.googleads.v16.common.TextAdInfo other) {
      if (other == com.google.ads.googleads.v16.common.TextAdInfo.getDefaultInstance()) return this;
      if (other.hasHeadline()) {
        headline_ = other.headline_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (other.hasDescription1()) {
        description1_ = other.description1_;
        bitField0_ |= 0x00000002;
        onChanged();
      }
      if (other.hasDescription2()) {
        description2_ = other.description2_;
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
            case 34: {
              headline_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
              break;
            } // case 34
            case 42: {
              description1_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000002;
              break;
            } // case 42
            case 50: {
              description2_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000004;
              break;
            } // case 50
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

    private java.lang.Object headline_ = "";
    /**
     * <pre>
     * The headline of the ad.
     * </pre>
     *
     * <code>optional string headline = 4;</code>
     * @return Whether the headline field is set.
     */
    public boolean hasHeadline() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <pre>
     * The headline of the ad.
     * </pre>
     *
     * <code>optional string headline = 4;</code>
     * @return The headline.
     */
    public java.lang.String getHeadline() {
      java.lang.Object ref = headline_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        headline_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * The headline of the ad.
     * </pre>
     *
     * <code>optional string headline = 4;</code>
     * @return The bytes for headline.
     */
    public com.google.protobuf.ByteString
        getHeadlineBytes() {
      java.lang.Object ref = headline_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        headline_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * The headline of the ad.
     * </pre>
     *
     * <code>optional string headline = 4;</code>
     * @param value The headline to set.
     * @return This builder for chaining.
     */
    public Builder setHeadline(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      headline_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The headline of the ad.
     * </pre>
     *
     * <code>optional string headline = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearHeadline() {
      headline_ = getDefaultInstance().getHeadline();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The headline of the ad.
     * </pre>
     *
     * <code>optional string headline = 4;</code>
     * @param value The bytes for headline to set.
     * @return This builder for chaining.
     */
    public Builder setHeadlineBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      headline_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private java.lang.Object description1_ = "";
    /**
     * <pre>
     * The first line of the ad's description.
     * </pre>
     *
     * <code>optional string description1 = 5;</code>
     * @return Whether the description1 field is set.
     */
    public boolean hasDescription1() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <pre>
     * The first line of the ad's description.
     * </pre>
     *
     * <code>optional string description1 = 5;</code>
     * @return The description1.
     */
    public java.lang.String getDescription1() {
      java.lang.Object ref = description1_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        description1_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * The first line of the ad's description.
     * </pre>
     *
     * <code>optional string description1 = 5;</code>
     * @return The bytes for description1.
     */
    public com.google.protobuf.ByteString
        getDescription1Bytes() {
      java.lang.Object ref = description1_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        description1_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * The first line of the ad's description.
     * </pre>
     *
     * <code>optional string description1 = 5;</code>
     * @param value The description1 to set.
     * @return This builder for chaining.
     */
    public Builder setDescription1(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      description1_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The first line of the ad's description.
     * </pre>
     *
     * <code>optional string description1 = 5;</code>
     * @return This builder for chaining.
     */
    public Builder clearDescription1() {
      description1_ = getDefaultInstance().getDescription1();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The first line of the ad's description.
     * </pre>
     *
     * <code>optional string description1 = 5;</code>
     * @param value The bytes for description1 to set.
     * @return This builder for chaining.
     */
    public Builder setDescription1Bytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      description1_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    private java.lang.Object description2_ = "";
    /**
     * <pre>
     * The second line of the ad's description.
     * </pre>
     *
     * <code>optional string description2 = 6;</code>
     * @return Whether the description2 field is set.
     */
    public boolean hasDescription2() {
      return ((bitField0_ & 0x00000004) != 0);
    }
    /**
     * <pre>
     * The second line of the ad's description.
     * </pre>
     *
     * <code>optional string description2 = 6;</code>
     * @return The description2.
     */
    public java.lang.String getDescription2() {
      java.lang.Object ref = description2_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        description2_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * The second line of the ad's description.
     * </pre>
     *
     * <code>optional string description2 = 6;</code>
     * @return The bytes for description2.
     */
    public com.google.protobuf.ByteString
        getDescription2Bytes() {
      java.lang.Object ref = description2_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        description2_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * The second line of the ad's description.
     * </pre>
     *
     * <code>optional string description2 = 6;</code>
     * @param value The description2 to set.
     * @return This builder for chaining.
     */
    public Builder setDescription2(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      description2_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The second line of the ad's description.
     * </pre>
     *
     * <code>optional string description2 = 6;</code>
     * @return This builder for chaining.
     */
    public Builder clearDescription2() {
      description2_ = getDefaultInstance().getDescription2();
      bitField0_ = (bitField0_ & ~0x00000004);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The second line of the ad's description.
     * </pre>
     *
     * <code>optional string description2 = 6;</code>
     * @param value The bytes for description2 to set.
     * @return This builder for chaining.
     */
    public Builder setDescription2Bytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      description2_ = value;
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


    // @@protoc_insertion_point(builder_scope:google.ads.googleads.v16.common.TextAdInfo)
  }

  // @@protoc_insertion_point(class_scope:google.ads.googleads.v16.common.TextAdInfo)
  private static final com.google.ads.googleads.v16.common.TextAdInfo DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.ads.googleads.v16.common.TextAdInfo();
  }

  public static com.google.ads.googleads.v16.common.TextAdInfo getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<TextAdInfo>
      PARSER = new com.google.protobuf.AbstractParser<TextAdInfo>() {
    @java.lang.Override
    public TextAdInfo parsePartialFrom(
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

  public static com.google.protobuf.Parser<TextAdInfo> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<TextAdInfo> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.ads.googleads.v16.common.TextAdInfo getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

