// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v16/common/criteria.proto

// Protobuf Java Version: 3.25.3
package com.google.ads.googleads.v16.common;

/**
 * <pre>
 * Geo point for proximity criterion.
 * </pre>
 *
 * Protobuf type {@code google.ads.googleads.v16.common.GeoPointInfo}
 */
public final class GeoPointInfo extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.ads.googleads.v16.common.GeoPointInfo)
    GeoPointInfoOrBuilder {
private static final long serialVersionUID = 0L;
  // Use GeoPointInfo.newBuilder() to construct.
  private GeoPointInfo(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private GeoPointInfo() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new GeoPointInfo();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.ads.googleads.v16.common.CriteriaProto.internal_static_google_ads_googleads_v16_common_GeoPointInfo_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.ads.googleads.v16.common.CriteriaProto.internal_static_google_ads_googleads_v16_common_GeoPointInfo_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.ads.googleads.v16.common.GeoPointInfo.class, com.google.ads.googleads.v16.common.GeoPointInfo.Builder.class);
  }

  private int bitField0_;
  public static final int LONGITUDE_IN_MICRO_DEGREES_FIELD_NUMBER = 3;
  private int longitudeInMicroDegrees_ = 0;
  /**
   * <pre>
   * Micro degrees for the longitude.
   * </pre>
   *
   * <code>optional int32 longitude_in_micro_degrees = 3;</code>
   * @return Whether the longitudeInMicroDegrees field is set.
   */
  @java.lang.Override
  public boolean hasLongitudeInMicroDegrees() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <pre>
   * Micro degrees for the longitude.
   * </pre>
   *
   * <code>optional int32 longitude_in_micro_degrees = 3;</code>
   * @return The longitudeInMicroDegrees.
   */
  @java.lang.Override
  public int getLongitudeInMicroDegrees() {
    return longitudeInMicroDegrees_;
  }

  public static final int LATITUDE_IN_MICRO_DEGREES_FIELD_NUMBER = 4;
  private int latitudeInMicroDegrees_ = 0;
  /**
   * <pre>
   * Micro degrees for the latitude.
   * </pre>
   *
   * <code>optional int32 latitude_in_micro_degrees = 4;</code>
   * @return Whether the latitudeInMicroDegrees field is set.
   */
  @java.lang.Override
  public boolean hasLatitudeInMicroDegrees() {
    return ((bitField0_ & 0x00000002) != 0);
  }
  /**
   * <pre>
   * Micro degrees for the latitude.
   * </pre>
   *
   * <code>optional int32 latitude_in_micro_degrees = 4;</code>
   * @return The latitudeInMicroDegrees.
   */
  @java.lang.Override
  public int getLatitudeInMicroDegrees() {
    return latitudeInMicroDegrees_;
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
      output.writeInt32(3, longitudeInMicroDegrees_);
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      output.writeInt32(4, latitudeInMicroDegrees_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(3, longitudeInMicroDegrees_);
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(4, latitudeInMicroDegrees_);
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
    if (!(obj instanceof com.google.ads.googleads.v16.common.GeoPointInfo)) {
      return super.equals(obj);
    }
    com.google.ads.googleads.v16.common.GeoPointInfo other = (com.google.ads.googleads.v16.common.GeoPointInfo) obj;

    if (hasLongitudeInMicroDegrees() != other.hasLongitudeInMicroDegrees()) return false;
    if (hasLongitudeInMicroDegrees()) {
      if (getLongitudeInMicroDegrees()
          != other.getLongitudeInMicroDegrees()) return false;
    }
    if (hasLatitudeInMicroDegrees() != other.hasLatitudeInMicroDegrees()) return false;
    if (hasLatitudeInMicroDegrees()) {
      if (getLatitudeInMicroDegrees()
          != other.getLatitudeInMicroDegrees()) return false;
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
    if (hasLongitudeInMicroDegrees()) {
      hash = (37 * hash) + LONGITUDE_IN_MICRO_DEGREES_FIELD_NUMBER;
      hash = (53 * hash) + getLongitudeInMicroDegrees();
    }
    if (hasLatitudeInMicroDegrees()) {
      hash = (37 * hash) + LATITUDE_IN_MICRO_DEGREES_FIELD_NUMBER;
      hash = (53 * hash) + getLatitudeInMicroDegrees();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.ads.googleads.v16.common.GeoPointInfo parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v16.common.GeoPointInfo parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v16.common.GeoPointInfo parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v16.common.GeoPointInfo parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v16.common.GeoPointInfo parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v16.common.GeoPointInfo parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v16.common.GeoPointInfo parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v16.common.GeoPointInfo parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.google.ads.googleads.v16.common.GeoPointInfo parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.ads.googleads.v16.common.GeoPointInfo parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v16.common.GeoPointInfo parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v16.common.GeoPointInfo parseFrom(
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
  public static Builder newBuilder(com.google.ads.googleads.v16.common.GeoPointInfo prototype) {
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
   * Geo point for proximity criterion.
   * </pre>
   *
   * Protobuf type {@code google.ads.googleads.v16.common.GeoPointInfo}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.ads.googleads.v16.common.GeoPointInfo)
      com.google.ads.googleads.v16.common.GeoPointInfoOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.ads.googleads.v16.common.CriteriaProto.internal_static_google_ads_googleads_v16_common_GeoPointInfo_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.ads.googleads.v16.common.CriteriaProto.internal_static_google_ads_googleads_v16_common_GeoPointInfo_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.ads.googleads.v16.common.GeoPointInfo.class, com.google.ads.googleads.v16.common.GeoPointInfo.Builder.class);
    }

    // Construct using com.google.ads.googleads.v16.common.GeoPointInfo.newBuilder()
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
      longitudeInMicroDegrees_ = 0;
      latitudeInMicroDegrees_ = 0;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.ads.googleads.v16.common.CriteriaProto.internal_static_google_ads_googleads_v16_common_GeoPointInfo_descriptor;
    }

    @java.lang.Override
    public com.google.ads.googleads.v16.common.GeoPointInfo getDefaultInstanceForType() {
      return com.google.ads.googleads.v16.common.GeoPointInfo.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.ads.googleads.v16.common.GeoPointInfo build() {
      com.google.ads.googleads.v16.common.GeoPointInfo result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.ads.googleads.v16.common.GeoPointInfo buildPartial() {
      com.google.ads.googleads.v16.common.GeoPointInfo result = new com.google.ads.googleads.v16.common.GeoPointInfo(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.ads.googleads.v16.common.GeoPointInfo result) {
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.longitudeInMicroDegrees_ = longitudeInMicroDegrees_;
        to_bitField0_ |= 0x00000001;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.latitudeInMicroDegrees_ = latitudeInMicroDegrees_;
        to_bitField0_ |= 0x00000002;
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
      if (other instanceof com.google.ads.googleads.v16.common.GeoPointInfo) {
        return mergeFrom((com.google.ads.googleads.v16.common.GeoPointInfo)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.ads.googleads.v16.common.GeoPointInfo other) {
      if (other == com.google.ads.googleads.v16.common.GeoPointInfo.getDefaultInstance()) return this;
      if (other.hasLongitudeInMicroDegrees()) {
        setLongitudeInMicroDegrees(other.getLongitudeInMicroDegrees());
      }
      if (other.hasLatitudeInMicroDegrees()) {
        setLatitudeInMicroDegrees(other.getLatitudeInMicroDegrees());
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
            case 24: {
              longitudeInMicroDegrees_ = input.readInt32();
              bitField0_ |= 0x00000001;
              break;
            } // case 24
            case 32: {
              latitudeInMicroDegrees_ = input.readInt32();
              bitField0_ |= 0x00000002;
              break;
            } // case 32
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

    private int longitudeInMicroDegrees_ ;
    /**
     * <pre>
     * Micro degrees for the longitude.
     * </pre>
     *
     * <code>optional int32 longitude_in_micro_degrees = 3;</code>
     * @return Whether the longitudeInMicroDegrees field is set.
     */
    @java.lang.Override
    public boolean hasLongitudeInMicroDegrees() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <pre>
     * Micro degrees for the longitude.
     * </pre>
     *
     * <code>optional int32 longitude_in_micro_degrees = 3;</code>
     * @return The longitudeInMicroDegrees.
     */
    @java.lang.Override
    public int getLongitudeInMicroDegrees() {
      return longitudeInMicroDegrees_;
    }
    /**
     * <pre>
     * Micro degrees for the longitude.
     * </pre>
     *
     * <code>optional int32 longitude_in_micro_degrees = 3;</code>
     * @param value The longitudeInMicroDegrees to set.
     * @return This builder for chaining.
     */
    public Builder setLongitudeInMicroDegrees(int value) {

      longitudeInMicroDegrees_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Micro degrees for the longitude.
     * </pre>
     *
     * <code>optional int32 longitude_in_micro_degrees = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearLongitudeInMicroDegrees() {
      bitField0_ = (bitField0_ & ~0x00000001);
      longitudeInMicroDegrees_ = 0;
      onChanged();
      return this;
    }

    private int latitudeInMicroDegrees_ ;
    /**
     * <pre>
     * Micro degrees for the latitude.
     * </pre>
     *
     * <code>optional int32 latitude_in_micro_degrees = 4;</code>
     * @return Whether the latitudeInMicroDegrees field is set.
     */
    @java.lang.Override
    public boolean hasLatitudeInMicroDegrees() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <pre>
     * Micro degrees for the latitude.
     * </pre>
     *
     * <code>optional int32 latitude_in_micro_degrees = 4;</code>
     * @return The latitudeInMicroDegrees.
     */
    @java.lang.Override
    public int getLatitudeInMicroDegrees() {
      return latitudeInMicroDegrees_;
    }
    /**
     * <pre>
     * Micro degrees for the latitude.
     * </pre>
     *
     * <code>optional int32 latitude_in_micro_degrees = 4;</code>
     * @param value The latitudeInMicroDegrees to set.
     * @return This builder for chaining.
     */
    public Builder setLatitudeInMicroDegrees(int value) {

      latitudeInMicroDegrees_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Micro degrees for the latitude.
     * </pre>
     *
     * <code>optional int32 latitude_in_micro_degrees = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearLatitudeInMicroDegrees() {
      bitField0_ = (bitField0_ & ~0x00000002);
      latitudeInMicroDegrees_ = 0;
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


    // @@protoc_insertion_point(builder_scope:google.ads.googleads.v16.common.GeoPointInfo)
  }

  // @@protoc_insertion_point(class_scope:google.ads.googleads.v16.common.GeoPointInfo)
  private static final com.google.ads.googleads.v16.common.GeoPointInfo DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.ads.googleads.v16.common.GeoPointInfo();
  }

  public static com.google.ads.googleads.v16.common.GeoPointInfo getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<GeoPointInfo>
      PARSER = new com.google.protobuf.AbstractParser<GeoPointInfo>() {
    @java.lang.Override
    public GeoPointInfo parsePartialFrom(
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

  public static com.google.protobuf.Parser<GeoPointInfo> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<GeoPointInfo> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.ads.googleads.v16.common.GeoPointInfo getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

