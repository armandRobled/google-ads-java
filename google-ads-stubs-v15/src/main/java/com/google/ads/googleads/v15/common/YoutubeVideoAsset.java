// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v15/common/asset_types.proto

// Protobuf Java Version: 3.25.3
package com.google.ads.googleads.v15.common;

/**
 * <pre>
 * A YouTube asset.
 * </pre>
 *
 * Protobuf type {@code google.ads.googleads.v15.common.YoutubeVideoAsset}
 */
public final class YoutubeVideoAsset extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.ads.googleads.v15.common.YoutubeVideoAsset)
    YoutubeVideoAssetOrBuilder {
private static final long serialVersionUID = 0L;
  // Use YoutubeVideoAsset.newBuilder() to construct.
  private YoutubeVideoAsset(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private YoutubeVideoAsset() {
    youtubeVideoId_ = "";
    youtubeVideoTitle_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new YoutubeVideoAsset();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.ads.googleads.v15.common.AssetTypesProto.internal_static_google_ads_googleads_v15_common_YoutubeVideoAsset_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.ads.googleads.v15.common.AssetTypesProto.internal_static_google_ads_googleads_v15_common_YoutubeVideoAsset_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.ads.googleads.v15.common.YoutubeVideoAsset.class, com.google.ads.googleads.v15.common.YoutubeVideoAsset.Builder.class);
  }

  private int bitField0_;
  public static final int YOUTUBE_VIDEO_ID_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private volatile java.lang.Object youtubeVideoId_ = "";
  /**
   * <pre>
   * YouTube video id. This is the 11 character string value used in the
   * YouTube video URL.
   * </pre>
   *
   * <code>optional string youtube_video_id = 2;</code>
   * @return Whether the youtubeVideoId field is set.
   */
  @java.lang.Override
  public boolean hasYoutubeVideoId() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <pre>
   * YouTube video id. This is the 11 character string value used in the
   * YouTube video URL.
   * </pre>
   *
   * <code>optional string youtube_video_id = 2;</code>
   * @return The youtubeVideoId.
   */
  @java.lang.Override
  public java.lang.String getYoutubeVideoId() {
    java.lang.Object ref = youtubeVideoId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      youtubeVideoId_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * YouTube video id. This is the 11 character string value used in the
   * YouTube video URL.
   * </pre>
   *
   * <code>optional string youtube_video_id = 2;</code>
   * @return The bytes for youtubeVideoId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getYoutubeVideoIdBytes() {
    java.lang.Object ref = youtubeVideoId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      youtubeVideoId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int YOUTUBE_VIDEO_TITLE_FIELD_NUMBER = 3;
  @SuppressWarnings("serial")
  private volatile java.lang.Object youtubeVideoTitle_ = "";
  /**
   * <pre>
   * YouTube video title.
   * </pre>
   *
   * <code>string youtube_video_title = 3;</code>
   * @return The youtubeVideoTitle.
   */
  @java.lang.Override
  public java.lang.String getYoutubeVideoTitle() {
    java.lang.Object ref = youtubeVideoTitle_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      youtubeVideoTitle_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * YouTube video title.
   * </pre>
   *
   * <code>string youtube_video_title = 3;</code>
   * @return The bytes for youtubeVideoTitle.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getYoutubeVideoTitleBytes() {
    java.lang.Object ref = youtubeVideoTitle_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      youtubeVideoTitle_ = b;
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
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, youtubeVideoId_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(youtubeVideoTitle_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, youtubeVideoTitle_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, youtubeVideoId_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(youtubeVideoTitle_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, youtubeVideoTitle_);
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
    if (!(obj instanceof com.google.ads.googleads.v15.common.YoutubeVideoAsset)) {
      return super.equals(obj);
    }
    com.google.ads.googleads.v15.common.YoutubeVideoAsset other = (com.google.ads.googleads.v15.common.YoutubeVideoAsset) obj;

    if (hasYoutubeVideoId() != other.hasYoutubeVideoId()) return false;
    if (hasYoutubeVideoId()) {
      if (!getYoutubeVideoId()
          .equals(other.getYoutubeVideoId())) return false;
    }
    if (!getYoutubeVideoTitle()
        .equals(other.getYoutubeVideoTitle())) return false;
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
    if (hasYoutubeVideoId()) {
      hash = (37 * hash) + YOUTUBE_VIDEO_ID_FIELD_NUMBER;
      hash = (53 * hash) + getYoutubeVideoId().hashCode();
    }
    hash = (37 * hash) + YOUTUBE_VIDEO_TITLE_FIELD_NUMBER;
    hash = (53 * hash) + getYoutubeVideoTitle().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.ads.googleads.v15.common.YoutubeVideoAsset parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v15.common.YoutubeVideoAsset parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v15.common.YoutubeVideoAsset parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v15.common.YoutubeVideoAsset parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v15.common.YoutubeVideoAsset parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v15.common.YoutubeVideoAsset parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v15.common.YoutubeVideoAsset parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v15.common.YoutubeVideoAsset parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.google.ads.googleads.v15.common.YoutubeVideoAsset parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.ads.googleads.v15.common.YoutubeVideoAsset parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v15.common.YoutubeVideoAsset parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v15.common.YoutubeVideoAsset parseFrom(
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
  public static Builder newBuilder(com.google.ads.googleads.v15.common.YoutubeVideoAsset prototype) {
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
   * A YouTube asset.
   * </pre>
   *
   * Protobuf type {@code google.ads.googleads.v15.common.YoutubeVideoAsset}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.ads.googleads.v15.common.YoutubeVideoAsset)
      com.google.ads.googleads.v15.common.YoutubeVideoAssetOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.ads.googleads.v15.common.AssetTypesProto.internal_static_google_ads_googleads_v15_common_YoutubeVideoAsset_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.ads.googleads.v15.common.AssetTypesProto.internal_static_google_ads_googleads_v15_common_YoutubeVideoAsset_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.ads.googleads.v15.common.YoutubeVideoAsset.class, com.google.ads.googleads.v15.common.YoutubeVideoAsset.Builder.class);
    }

    // Construct using com.google.ads.googleads.v15.common.YoutubeVideoAsset.newBuilder()
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
      youtubeVideoId_ = "";
      youtubeVideoTitle_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.ads.googleads.v15.common.AssetTypesProto.internal_static_google_ads_googleads_v15_common_YoutubeVideoAsset_descriptor;
    }

    @java.lang.Override
    public com.google.ads.googleads.v15.common.YoutubeVideoAsset getDefaultInstanceForType() {
      return com.google.ads.googleads.v15.common.YoutubeVideoAsset.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.ads.googleads.v15.common.YoutubeVideoAsset build() {
      com.google.ads.googleads.v15.common.YoutubeVideoAsset result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.ads.googleads.v15.common.YoutubeVideoAsset buildPartial() {
      com.google.ads.googleads.v15.common.YoutubeVideoAsset result = new com.google.ads.googleads.v15.common.YoutubeVideoAsset(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.ads.googleads.v15.common.YoutubeVideoAsset result) {
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.youtubeVideoId_ = youtubeVideoId_;
        to_bitField0_ |= 0x00000001;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.youtubeVideoTitle_ = youtubeVideoTitle_;
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
      if (other instanceof com.google.ads.googleads.v15.common.YoutubeVideoAsset) {
        return mergeFrom((com.google.ads.googleads.v15.common.YoutubeVideoAsset)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.ads.googleads.v15.common.YoutubeVideoAsset other) {
      if (other == com.google.ads.googleads.v15.common.YoutubeVideoAsset.getDefaultInstance()) return this;
      if (other.hasYoutubeVideoId()) {
        youtubeVideoId_ = other.youtubeVideoId_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (!other.getYoutubeVideoTitle().isEmpty()) {
        youtubeVideoTitle_ = other.youtubeVideoTitle_;
        bitField0_ |= 0x00000002;
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
              youtubeVideoId_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
              break;
            } // case 18
            case 26: {
              youtubeVideoTitle_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000002;
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

    private java.lang.Object youtubeVideoId_ = "";
    /**
     * <pre>
     * YouTube video id. This is the 11 character string value used in the
     * YouTube video URL.
     * </pre>
     *
     * <code>optional string youtube_video_id = 2;</code>
     * @return Whether the youtubeVideoId field is set.
     */
    public boolean hasYoutubeVideoId() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <pre>
     * YouTube video id. This is the 11 character string value used in the
     * YouTube video URL.
     * </pre>
     *
     * <code>optional string youtube_video_id = 2;</code>
     * @return The youtubeVideoId.
     */
    public java.lang.String getYoutubeVideoId() {
      java.lang.Object ref = youtubeVideoId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        youtubeVideoId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * YouTube video id. This is the 11 character string value used in the
     * YouTube video URL.
     * </pre>
     *
     * <code>optional string youtube_video_id = 2;</code>
     * @return The bytes for youtubeVideoId.
     */
    public com.google.protobuf.ByteString
        getYoutubeVideoIdBytes() {
      java.lang.Object ref = youtubeVideoId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        youtubeVideoId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * YouTube video id. This is the 11 character string value used in the
     * YouTube video URL.
     * </pre>
     *
     * <code>optional string youtube_video_id = 2;</code>
     * @param value The youtubeVideoId to set.
     * @return This builder for chaining.
     */
    public Builder setYoutubeVideoId(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      youtubeVideoId_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * YouTube video id. This is the 11 character string value used in the
     * YouTube video URL.
     * </pre>
     *
     * <code>optional string youtube_video_id = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearYoutubeVideoId() {
      youtubeVideoId_ = getDefaultInstance().getYoutubeVideoId();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * YouTube video id. This is the 11 character string value used in the
     * YouTube video URL.
     * </pre>
     *
     * <code>optional string youtube_video_id = 2;</code>
     * @param value The bytes for youtubeVideoId to set.
     * @return This builder for chaining.
     */
    public Builder setYoutubeVideoIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      youtubeVideoId_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private java.lang.Object youtubeVideoTitle_ = "";
    /**
     * <pre>
     * YouTube video title.
     * </pre>
     *
     * <code>string youtube_video_title = 3;</code>
     * @return The youtubeVideoTitle.
     */
    public java.lang.String getYoutubeVideoTitle() {
      java.lang.Object ref = youtubeVideoTitle_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        youtubeVideoTitle_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * YouTube video title.
     * </pre>
     *
     * <code>string youtube_video_title = 3;</code>
     * @return The bytes for youtubeVideoTitle.
     */
    public com.google.protobuf.ByteString
        getYoutubeVideoTitleBytes() {
      java.lang.Object ref = youtubeVideoTitle_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        youtubeVideoTitle_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * YouTube video title.
     * </pre>
     *
     * <code>string youtube_video_title = 3;</code>
     * @param value The youtubeVideoTitle to set.
     * @return This builder for chaining.
     */
    public Builder setYoutubeVideoTitle(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      youtubeVideoTitle_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * YouTube video title.
     * </pre>
     *
     * <code>string youtube_video_title = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearYoutubeVideoTitle() {
      youtubeVideoTitle_ = getDefaultInstance().getYoutubeVideoTitle();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * YouTube video title.
     * </pre>
     *
     * <code>string youtube_video_title = 3;</code>
     * @param value The bytes for youtubeVideoTitle to set.
     * @return This builder for chaining.
     */
    public Builder setYoutubeVideoTitleBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      youtubeVideoTitle_ = value;
      bitField0_ |= 0x00000002;
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


    // @@protoc_insertion_point(builder_scope:google.ads.googleads.v15.common.YoutubeVideoAsset)
  }

  // @@protoc_insertion_point(class_scope:google.ads.googleads.v15.common.YoutubeVideoAsset)
  private static final com.google.ads.googleads.v15.common.YoutubeVideoAsset DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.ads.googleads.v15.common.YoutubeVideoAsset();
  }

  public static com.google.ads.googleads.v15.common.YoutubeVideoAsset getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<YoutubeVideoAsset>
      PARSER = new com.google.protobuf.AbstractParser<YoutubeVideoAsset>() {
    @java.lang.Override
    public YoutubeVideoAsset parsePartialFrom(
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

  public static com.google.protobuf.Parser<YoutubeVideoAsset> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<YoutubeVideoAsset> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.ads.googleads.v15.common.YoutubeVideoAsset getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

