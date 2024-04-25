// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v16/common/audiences.proto

// Protobuf Java Version: 3.25.3
package com.google.ads.googleads.v16.common;

/**
 * <pre>
 * Dimension specifying users by their gender.
 * </pre>
 *
 * Protobuf type {@code google.ads.googleads.v16.common.GenderDimension}
 */
public final class GenderDimension extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.ads.googleads.v16.common.GenderDimension)
    GenderDimensionOrBuilder {
private static final long serialVersionUID = 0L;
  // Use GenderDimension.newBuilder() to construct.
  private GenderDimension(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private GenderDimension() {
    genders_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new GenderDimension();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.ads.googleads.v16.common.AudiencesProto.internal_static_google_ads_googleads_v16_common_GenderDimension_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.ads.googleads.v16.common.AudiencesProto.internal_static_google_ads_googleads_v16_common_GenderDimension_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.ads.googleads.v16.common.GenderDimension.class, com.google.ads.googleads.v16.common.GenderDimension.Builder.class);
  }

  private int bitField0_;
  public static final int GENDERS_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private java.util.List<java.lang.Integer> genders_;
  private static final com.google.protobuf.Internal.ListAdapter.Converter<
      java.lang.Integer, com.google.ads.googleads.v16.enums.GenderTypeEnum.GenderType> genders_converter_ =
          new com.google.protobuf.Internal.ListAdapter.Converter<
              java.lang.Integer, com.google.ads.googleads.v16.enums.GenderTypeEnum.GenderType>() {
            public com.google.ads.googleads.v16.enums.GenderTypeEnum.GenderType convert(java.lang.Integer from) {
              com.google.ads.googleads.v16.enums.GenderTypeEnum.GenderType result = com.google.ads.googleads.v16.enums.GenderTypeEnum.GenderType.forNumber(from);
              return result == null ? com.google.ads.googleads.v16.enums.GenderTypeEnum.GenderType.UNRECOGNIZED : result;
            }
          };
  /**
   * <pre>
   * Included gender demographic segments.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v16.enums.GenderTypeEnum.GenderType genders = 1;</code>
   * @return A list containing the genders.
   */
  @java.lang.Override
  public java.util.List<com.google.ads.googleads.v16.enums.GenderTypeEnum.GenderType> getGendersList() {
    return new com.google.protobuf.Internal.ListAdapter<
        java.lang.Integer, com.google.ads.googleads.v16.enums.GenderTypeEnum.GenderType>(genders_, genders_converter_);
  }
  /**
   * <pre>
   * Included gender demographic segments.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v16.enums.GenderTypeEnum.GenderType genders = 1;</code>
   * @return The count of genders.
   */
  @java.lang.Override
  public int getGendersCount() {
    return genders_.size();
  }
  /**
   * <pre>
   * Included gender demographic segments.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v16.enums.GenderTypeEnum.GenderType genders = 1;</code>
   * @param index The index of the element to return.
   * @return The genders at the given index.
   */
  @java.lang.Override
  public com.google.ads.googleads.v16.enums.GenderTypeEnum.GenderType getGenders(int index) {
    return genders_converter_.convert(genders_.get(index));
  }
  /**
   * <pre>
   * Included gender demographic segments.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v16.enums.GenderTypeEnum.GenderType genders = 1;</code>
   * @return A list containing the enum numeric values on the wire for genders.
   */
  @java.lang.Override
  public java.util.List<java.lang.Integer>
  getGendersValueList() {
    return genders_;
  }
  /**
   * <pre>
   * Included gender demographic segments.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v16.enums.GenderTypeEnum.GenderType genders = 1;</code>
   * @param index The index of the value to return.
   * @return The enum numeric value on the wire of genders at the given index.
   */
  @java.lang.Override
  public int getGendersValue(int index) {
    return genders_.get(index);
  }
  private int gendersMemoizedSerializedSize;

  public static final int INCLUDE_UNDETERMINED_FIELD_NUMBER = 2;
  private boolean includeUndetermined_ = false;
  /**
   * <pre>
   * Include users whose gender is not determined.
   * </pre>
   *
   * <code>optional bool include_undetermined = 2;</code>
   * @return Whether the includeUndetermined field is set.
   */
  @java.lang.Override
  public boolean hasIncludeUndetermined() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <pre>
   * Include users whose gender is not determined.
   * </pre>
   *
   * <code>optional bool include_undetermined = 2;</code>
   * @return The includeUndetermined.
   */
  @java.lang.Override
  public boolean getIncludeUndetermined() {
    return includeUndetermined_;
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
    getSerializedSize();
    if (getGendersList().size() > 0) {
      output.writeUInt32NoTag(10);
      output.writeUInt32NoTag(gendersMemoizedSerializedSize);
    }
    for (int i = 0; i < genders_.size(); i++) {
      output.writeEnumNoTag(genders_.get(i));
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      output.writeBool(2, includeUndetermined_);
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
      for (int i = 0; i < genders_.size(); i++) {
        dataSize += com.google.protobuf.CodedOutputStream
          .computeEnumSizeNoTag(genders_.get(i));
      }
      size += dataSize;
      if (!getGendersList().isEmpty()) {  size += 1;
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32SizeNoTag(dataSize);
      }gendersMemoizedSerializedSize = dataSize;
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(2, includeUndetermined_);
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
    if (!(obj instanceof com.google.ads.googleads.v16.common.GenderDimension)) {
      return super.equals(obj);
    }
    com.google.ads.googleads.v16.common.GenderDimension other = (com.google.ads.googleads.v16.common.GenderDimension) obj;

    if (!genders_.equals(other.genders_)) return false;
    if (hasIncludeUndetermined() != other.hasIncludeUndetermined()) return false;
    if (hasIncludeUndetermined()) {
      if (getIncludeUndetermined()
          != other.getIncludeUndetermined()) return false;
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
    if (getGendersCount() > 0) {
      hash = (37 * hash) + GENDERS_FIELD_NUMBER;
      hash = (53 * hash) + genders_.hashCode();
    }
    if (hasIncludeUndetermined()) {
      hash = (37 * hash) + INCLUDE_UNDETERMINED_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getIncludeUndetermined());
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.ads.googleads.v16.common.GenderDimension parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v16.common.GenderDimension parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v16.common.GenderDimension parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v16.common.GenderDimension parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v16.common.GenderDimension parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v16.common.GenderDimension parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v16.common.GenderDimension parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v16.common.GenderDimension parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.google.ads.googleads.v16.common.GenderDimension parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.ads.googleads.v16.common.GenderDimension parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v16.common.GenderDimension parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v16.common.GenderDimension parseFrom(
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
  public static Builder newBuilder(com.google.ads.googleads.v16.common.GenderDimension prototype) {
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
   * Dimension specifying users by their gender.
   * </pre>
   *
   * Protobuf type {@code google.ads.googleads.v16.common.GenderDimension}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.ads.googleads.v16.common.GenderDimension)
      com.google.ads.googleads.v16.common.GenderDimensionOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.ads.googleads.v16.common.AudiencesProto.internal_static_google_ads_googleads_v16_common_GenderDimension_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.ads.googleads.v16.common.AudiencesProto.internal_static_google_ads_googleads_v16_common_GenderDimension_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.ads.googleads.v16.common.GenderDimension.class, com.google.ads.googleads.v16.common.GenderDimension.Builder.class);
    }

    // Construct using com.google.ads.googleads.v16.common.GenderDimension.newBuilder()
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
      genders_ = java.util.Collections.emptyList();
      bitField0_ = (bitField0_ & ~0x00000001);
      includeUndetermined_ = false;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.ads.googleads.v16.common.AudiencesProto.internal_static_google_ads_googleads_v16_common_GenderDimension_descriptor;
    }

    @java.lang.Override
    public com.google.ads.googleads.v16.common.GenderDimension getDefaultInstanceForType() {
      return com.google.ads.googleads.v16.common.GenderDimension.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.ads.googleads.v16.common.GenderDimension build() {
      com.google.ads.googleads.v16.common.GenderDimension result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.ads.googleads.v16.common.GenderDimension buildPartial() {
      com.google.ads.googleads.v16.common.GenderDimension result = new com.google.ads.googleads.v16.common.GenderDimension(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(com.google.ads.googleads.v16.common.GenderDimension result) {
      if (((bitField0_ & 0x00000001) != 0)) {
        genders_ = java.util.Collections.unmodifiableList(genders_);
        bitField0_ = (bitField0_ & ~0x00000001);
      }
      result.genders_ = genders_;
    }

    private void buildPartial0(com.google.ads.googleads.v16.common.GenderDimension result) {
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.includeUndetermined_ = includeUndetermined_;
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
      if (other instanceof com.google.ads.googleads.v16.common.GenderDimension) {
        return mergeFrom((com.google.ads.googleads.v16.common.GenderDimension)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.ads.googleads.v16.common.GenderDimension other) {
      if (other == com.google.ads.googleads.v16.common.GenderDimension.getDefaultInstance()) return this;
      if (!other.genders_.isEmpty()) {
        if (genders_.isEmpty()) {
          genders_ = other.genders_;
          bitField0_ = (bitField0_ & ~0x00000001);
        } else {
          ensureGendersIsMutable();
          genders_.addAll(other.genders_);
        }
        onChanged();
      }
      if (other.hasIncludeUndetermined()) {
        setIncludeUndetermined(other.getIncludeUndetermined());
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
              ensureGendersIsMutable();
              genders_.add(tmpRaw);
              break;
            } // case 8
            case 10: {
              int length = input.readRawVarint32();
              int oldLimit = input.pushLimit(length);
              while(input.getBytesUntilLimit() > 0) {
                int tmpRaw = input.readEnum();
                ensureGendersIsMutable();
                genders_.add(tmpRaw);
              }
              input.popLimit(oldLimit);
              break;
            } // case 10
            case 16: {
              includeUndetermined_ = input.readBool();
              bitField0_ |= 0x00000002;
              break;
            } // case 16
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

    private java.util.List<java.lang.Integer> genders_ =
      java.util.Collections.emptyList();
    private void ensureGendersIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        genders_ = new java.util.ArrayList<java.lang.Integer>(genders_);
        bitField0_ |= 0x00000001;
      }
    }
    /**
     * <pre>
     * Included gender demographic segments.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v16.enums.GenderTypeEnum.GenderType genders = 1;</code>
     * @return A list containing the genders.
     */
    public java.util.List<com.google.ads.googleads.v16.enums.GenderTypeEnum.GenderType> getGendersList() {
      return new com.google.protobuf.Internal.ListAdapter<
          java.lang.Integer, com.google.ads.googleads.v16.enums.GenderTypeEnum.GenderType>(genders_, genders_converter_);
    }
    /**
     * <pre>
     * Included gender demographic segments.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v16.enums.GenderTypeEnum.GenderType genders = 1;</code>
     * @return The count of genders.
     */
    public int getGendersCount() {
      return genders_.size();
    }
    /**
     * <pre>
     * Included gender demographic segments.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v16.enums.GenderTypeEnum.GenderType genders = 1;</code>
     * @param index The index of the element to return.
     * @return The genders at the given index.
     */
    public com.google.ads.googleads.v16.enums.GenderTypeEnum.GenderType getGenders(int index) {
      return genders_converter_.convert(genders_.get(index));
    }
    /**
     * <pre>
     * Included gender demographic segments.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v16.enums.GenderTypeEnum.GenderType genders = 1;</code>
     * @param index The index to set the value at.
     * @param value The genders to set.
     * @return This builder for chaining.
     */
    public Builder setGenders(
        int index, com.google.ads.googleads.v16.enums.GenderTypeEnum.GenderType value) {
      if (value == null) {
        throw new NullPointerException();
      }
      ensureGendersIsMutable();
      genders_.set(index, value.getNumber());
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Included gender demographic segments.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v16.enums.GenderTypeEnum.GenderType genders = 1;</code>
     * @param value The genders to add.
     * @return This builder for chaining.
     */
    public Builder addGenders(com.google.ads.googleads.v16.enums.GenderTypeEnum.GenderType value) {
      if (value == null) {
        throw new NullPointerException();
      }
      ensureGendersIsMutable();
      genders_.add(value.getNumber());
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Included gender demographic segments.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v16.enums.GenderTypeEnum.GenderType genders = 1;</code>
     * @param values The genders to add.
     * @return This builder for chaining.
     */
    public Builder addAllGenders(
        java.lang.Iterable<? extends com.google.ads.googleads.v16.enums.GenderTypeEnum.GenderType> values) {
      ensureGendersIsMutable();
      for (com.google.ads.googleads.v16.enums.GenderTypeEnum.GenderType value : values) {
        genders_.add(value.getNumber());
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Included gender demographic segments.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v16.enums.GenderTypeEnum.GenderType genders = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearGenders() {
      genders_ = java.util.Collections.emptyList();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Included gender demographic segments.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v16.enums.GenderTypeEnum.GenderType genders = 1;</code>
     * @return A list containing the enum numeric values on the wire for genders.
     */
    public java.util.List<java.lang.Integer>
    getGendersValueList() {
      return java.util.Collections.unmodifiableList(genders_);
    }
    /**
     * <pre>
     * Included gender demographic segments.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v16.enums.GenderTypeEnum.GenderType genders = 1;</code>
     * @param index The index of the value to return.
     * @return The enum numeric value on the wire of genders at the given index.
     */
    public int getGendersValue(int index) {
      return genders_.get(index);
    }
    /**
     * <pre>
     * Included gender demographic segments.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v16.enums.GenderTypeEnum.GenderType genders = 1;</code>
     * @param index The index to set the value at.
     * @param value The enum numeric value on the wire for genders to set.
     * @return This builder for chaining.
     */
    public Builder setGendersValue(
        int index, int value) {
      ensureGendersIsMutable();
      genders_.set(index, value);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Included gender demographic segments.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v16.enums.GenderTypeEnum.GenderType genders = 1;</code>
     * @param value The enum numeric value on the wire for genders to add.
     * @return This builder for chaining.
     */
    public Builder addGendersValue(int value) {
      ensureGendersIsMutable();
      genders_.add(value);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Included gender demographic segments.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v16.enums.GenderTypeEnum.GenderType genders = 1;</code>
     * @param values The enum numeric values on the wire for genders to add.
     * @return This builder for chaining.
     */
    public Builder addAllGendersValue(
        java.lang.Iterable<java.lang.Integer> values) {
      ensureGendersIsMutable();
      for (int value : values) {
        genders_.add(value);
      }
      onChanged();
      return this;
    }

    private boolean includeUndetermined_ ;
    /**
     * <pre>
     * Include users whose gender is not determined.
     * </pre>
     *
     * <code>optional bool include_undetermined = 2;</code>
     * @return Whether the includeUndetermined field is set.
     */
    @java.lang.Override
    public boolean hasIncludeUndetermined() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <pre>
     * Include users whose gender is not determined.
     * </pre>
     *
     * <code>optional bool include_undetermined = 2;</code>
     * @return The includeUndetermined.
     */
    @java.lang.Override
    public boolean getIncludeUndetermined() {
      return includeUndetermined_;
    }
    /**
     * <pre>
     * Include users whose gender is not determined.
     * </pre>
     *
     * <code>optional bool include_undetermined = 2;</code>
     * @param value The includeUndetermined to set.
     * @return This builder for chaining.
     */
    public Builder setIncludeUndetermined(boolean value) {

      includeUndetermined_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Include users whose gender is not determined.
     * </pre>
     *
     * <code>optional bool include_undetermined = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearIncludeUndetermined() {
      bitField0_ = (bitField0_ & ~0x00000002);
      includeUndetermined_ = false;
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


    // @@protoc_insertion_point(builder_scope:google.ads.googleads.v16.common.GenderDimension)
  }

  // @@protoc_insertion_point(class_scope:google.ads.googleads.v16.common.GenderDimension)
  private static final com.google.ads.googleads.v16.common.GenderDimension DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.ads.googleads.v16.common.GenderDimension();
  }

  public static com.google.ads.googleads.v16.common.GenderDimension getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<GenderDimension>
      PARSER = new com.google.protobuf.AbstractParser<GenderDimension>() {
    @java.lang.Override
    public GenderDimension parsePartialFrom(
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

  public static com.google.protobuf.Parser<GenderDimension> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<GenderDimension> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.ads.googleads.v16.common.GenderDimension getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

