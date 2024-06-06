// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v17/common/audiences.proto

// Protobuf Java Version: 3.25.3
package com.google.ads.googleads.v17.common;

/**
 * <pre>
 * Dimension specifying users by their parental status.
 * </pre>
 *
 * Protobuf type {@code google.ads.googleads.v17.common.ParentalStatusDimension}
 */
public final class ParentalStatusDimension extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.ads.googleads.v17.common.ParentalStatusDimension)
    ParentalStatusDimensionOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ParentalStatusDimension.newBuilder() to construct.
  private ParentalStatusDimension(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ParentalStatusDimension() {
    parentalStatuses_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ParentalStatusDimension();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.ads.googleads.v17.common.AudiencesProto.internal_static_google_ads_googleads_v17_common_ParentalStatusDimension_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.ads.googleads.v17.common.AudiencesProto.internal_static_google_ads_googleads_v17_common_ParentalStatusDimension_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.ads.googleads.v17.common.ParentalStatusDimension.class, com.google.ads.googleads.v17.common.ParentalStatusDimension.Builder.class);
  }

  private int bitField0_;
  public static final int PARENTAL_STATUSES_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private java.util.List<java.lang.Integer> parentalStatuses_;
  private static final com.google.protobuf.Internal.ListAdapter.Converter<
      java.lang.Integer, com.google.ads.googleads.v17.enums.ParentalStatusTypeEnum.ParentalStatusType> parentalStatuses_converter_ =
          new com.google.protobuf.Internal.ListAdapter.Converter<
              java.lang.Integer, com.google.ads.googleads.v17.enums.ParentalStatusTypeEnum.ParentalStatusType>() {
            public com.google.ads.googleads.v17.enums.ParentalStatusTypeEnum.ParentalStatusType convert(java.lang.Integer from) {
              com.google.ads.googleads.v17.enums.ParentalStatusTypeEnum.ParentalStatusType result = com.google.ads.googleads.v17.enums.ParentalStatusTypeEnum.ParentalStatusType.forNumber(from);
              return result == null ? com.google.ads.googleads.v17.enums.ParentalStatusTypeEnum.ParentalStatusType.UNRECOGNIZED : result;
            }
          };
  /**
   * <pre>
   * Included parental status demographic segments.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v17.enums.ParentalStatusTypeEnum.ParentalStatusType parental_statuses = 1;</code>
   * @return A list containing the parentalStatuses.
   */
  @java.lang.Override
  public java.util.List<com.google.ads.googleads.v17.enums.ParentalStatusTypeEnum.ParentalStatusType> getParentalStatusesList() {
    return new com.google.protobuf.Internal.ListAdapter<
        java.lang.Integer, com.google.ads.googleads.v17.enums.ParentalStatusTypeEnum.ParentalStatusType>(parentalStatuses_, parentalStatuses_converter_);
  }
  /**
   * <pre>
   * Included parental status demographic segments.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v17.enums.ParentalStatusTypeEnum.ParentalStatusType parental_statuses = 1;</code>
   * @return The count of parentalStatuses.
   */
  @java.lang.Override
  public int getParentalStatusesCount() {
    return parentalStatuses_.size();
  }
  /**
   * <pre>
   * Included parental status demographic segments.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v17.enums.ParentalStatusTypeEnum.ParentalStatusType parental_statuses = 1;</code>
   * @param index The index of the element to return.
   * @return The parentalStatuses at the given index.
   */
  @java.lang.Override
  public com.google.ads.googleads.v17.enums.ParentalStatusTypeEnum.ParentalStatusType getParentalStatuses(int index) {
    return parentalStatuses_converter_.convert(parentalStatuses_.get(index));
  }
  /**
   * <pre>
   * Included parental status demographic segments.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v17.enums.ParentalStatusTypeEnum.ParentalStatusType parental_statuses = 1;</code>
   * @return A list containing the enum numeric values on the wire for parentalStatuses.
   */
  @java.lang.Override
  public java.util.List<java.lang.Integer>
  getParentalStatusesValueList() {
    return parentalStatuses_;
  }
  /**
   * <pre>
   * Included parental status demographic segments.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v17.enums.ParentalStatusTypeEnum.ParentalStatusType parental_statuses = 1;</code>
   * @param index The index of the value to return.
   * @return The enum numeric value on the wire of parentalStatuses at the given index.
   */
  @java.lang.Override
  public int getParentalStatusesValue(int index) {
    return parentalStatuses_.get(index);
  }
  private int parentalStatusesMemoizedSerializedSize;

  public static final int INCLUDE_UNDETERMINED_FIELD_NUMBER = 2;
  private boolean includeUndetermined_ = false;
  /**
   * <pre>
   * Include users whose parental status is undetermined.
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
   * Include users whose parental status is undetermined.
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
    if (getParentalStatusesList().size() > 0) {
      output.writeUInt32NoTag(10);
      output.writeUInt32NoTag(parentalStatusesMemoizedSerializedSize);
    }
    for (int i = 0; i < parentalStatuses_.size(); i++) {
      output.writeEnumNoTag(parentalStatuses_.get(i));
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
      for (int i = 0; i < parentalStatuses_.size(); i++) {
        dataSize += com.google.protobuf.CodedOutputStream
          .computeEnumSizeNoTag(parentalStatuses_.get(i));
      }
      size += dataSize;
      if (!getParentalStatusesList().isEmpty()) {  size += 1;
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32SizeNoTag(dataSize);
      }parentalStatusesMemoizedSerializedSize = dataSize;
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
    if (!(obj instanceof com.google.ads.googleads.v17.common.ParentalStatusDimension)) {
      return super.equals(obj);
    }
    com.google.ads.googleads.v17.common.ParentalStatusDimension other = (com.google.ads.googleads.v17.common.ParentalStatusDimension) obj;

    if (!parentalStatuses_.equals(other.parentalStatuses_)) return false;
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
    if (getParentalStatusesCount() > 0) {
      hash = (37 * hash) + PARENTAL_STATUSES_FIELD_NUMBER;
      hash = (53 * hash) + parentalStatuses_.hashCode();
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

  public static com.google.ads.googleads.v17.common.ParentalStatusDimension parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v17.common.ParentalStatusDimension parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v17.common.ParentalStatusDimension parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v17.common.ParentalStatusDimension parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v17.common.ParentalStatusDimension parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v17.common.ParentalStatusDimension parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v17.common.ParentalStatusDimension parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v17.common.ParentalStatusDimension parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.google.ads.googleads.v17.common.ParentalStatusDimension parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.ads.googleads.v17.common.ParentalStatusDimension parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v17.common.ParentalStatusDimension parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v17.common.ParentalStatusDimension parseFrom(
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
  public static Builder newBuilder(com.google.ads.googleads.v17.common.ParentalStatusDimension prototype) {
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
   * Dimension specifying users by their parental status.
   * </pre>
   *
   * Protobuf type {@code google.ads.googleads.v17.common.ParentalStatusDimension}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.ads.googleads.v17.common.ParentalStatusDimension)
      com.google.ads.googleads.v17.common.ParentalStatusDimensionOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.ads.googleads.v17.common.AudiencesProto.internal_static_google_ads_googleads_v17_common_ParentalStatusDimension_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.ads.googleads.v17.common.AudiencesProto.internal_static_google_ads_googleads_v17_common_ParentalStatusDimension_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.ads.googleads.v17.common.ParentalStatusDimension.class, com.google.ads.googleads.v17.common.ParentalStatusDimension.Builder.class);
    }

    // Construct using com.google.ads.googleads.v17.common.ParentalStatusDimension.newBuilder()
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
      parentalStatuses_ = java.util.Collections.emptyList();
      bitField0_ = (bitField0_ & ~0x00000001);
      includeUndetermined_ = false;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.ads.googleads.v17.common.AudiencesProto.internal_static_google_ads_googleads_v17_common_ParentalStatusDimension_descriptor;
    }

    @java.lang.Override
    public com.google.ads.googleads.v17.common.ParentalStatusDimension getDefaultInstanceForType() {
      return com.google.ads.googleads.v17.common.ParentalStatusDimension.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.ads.googleads.v17.common.ParentalStatusDimension build() {
      com.google.ads.googleads.v17.common.ParentalStatusDimension result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.ads.googleads.v17.common.ParentalStatusDimension buildPartial() {
      com.google.ads.googleads.v17.common.ParentalStatusDimension result = new com.google.ads.googleads.v17.common.ParentalStatusDimension(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(com.google.ads.googleads.v17.common.ParentalStatusDimension result) {
      if (((bitField0_ & 0x00000001) != 0)) {
        parentalStatuses_ = java.util.Collections.unmodifiableList(parentalStatuses_);
        bitField0_ = (bitField0_ & ~0x00000001);
      }
      result.parentalStatuses_ = parentalStatuses_;
    }

    private void buildPartial0(com.google.ads.googleads.v17.common.ParentalStatusDimension result) {
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
      if (other instanceof com.google.ads.googleads.v17.common.ParentalStatusDimension) {
        return mergeFrom((com.google.ads.googleads.v17.common.ParentalStatusDimension)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.ads.googleads.v17.common.ParentalStatusDimension other) {
      if (other == com.google.ads.googleads.v17.common.ParentalStatusDimension.getDefaultInstance()) return this;
      if (!other.parentalStatuses_.isEmpty()) {
        if (parentalStatuses_.isEmpty()) {
          parentalStatuses_ = other.parentalStatuses_;
          bitField0_ = (bitField0_ & ~0x00000001);
        } else {
          ensureParentalStatusesIsMutable();
          parentalStatuses_.addAll(other.parentalStatuses_);
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
              ensureParentalStatusesIsMutable();
              parentalStatuses_.add(tmpRaw);
              break;
            } // case 8
            case 10: {
              int length = input.readRawVarint32();
              int oldLimit = input.pushLimit(length);
              while(input.getBytesUntilLimit() > 0) {
                int tmpRaw = input.readEnum();
                ensureParentalStatusesIsMutable();
                parentalStatuses_.add(tmpRaw);
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

    private java.util.List<java.lang.Integer> parentalStatuses_ =
      java.util.Collections.emptyList();
    private void ensureParentalStatusesIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        parentalStatuses_ = new java.util.ArrayList<java.lang.Integer>(parentalStatuses_);
        bitField0_ |= 0x00000001;
      }
    }
    /**
     * <pre>
     * Included parental status demographic segments.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v17.enums.ParentalStatusTypeEnum.ParentalStatusType parental_statuses = 1;</code>
     * @return A list containing the parentalStatuses.
     */
    public java.util.List<com.google.ads.googleads.v17.enums.ParentalStatusTypeEnum.ParentalStatusType> getParentalStatusesList() {
      return new com.google.protobuf.Internal.ListAdapter<
          java.lang.Integer, com.google.ads.googleads.v17.enums.ParentalStatusTypeEnum.ParentalStatusType>(parentalStatuses_, parentalStatuses_converter_);
    }
    /**
     * <pre>
     * Included parental status demographic segments.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v17.enums.ParentalStatusTypeEnum.ParentalStatusType parental_statuses = 1;</code>
     * @return The count of parentalStatuses.
     */
    public int getParentalStatusesCount() {
      return parentalStatuses_.size();
    }
    /**
     * <pre>
     * Included parental status demographic segments.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v17.enums.ParentalStatusTypeEnum.ParentalStatusType parental_statuses = 1;</code>
     * @param index The index of the element to return.
     * @return The parentalStatuses at the given index.
     */
    public com.google.ads.googleads.v17.enums.ParentalStatusTypeEnum.ParentalStatusType getParentalStatuses(int index) {
      return parentalStatuses_converter_.convert(parentalStatuses_.get(index));
    }
    /**
     * <pre>
     * Included parental status demographic segments.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v17.enums.ParentalStatusTypeEnum.ParentalStatusType parental_statuses = 1;</code>
     * @param index The index to set the value at.
     * @param value The parentalStatuses to set.
     * @return This builder for chaining.
     */
    public Builder setParentalStatuses(
        int index, com.google.ads.googleads.v17.enums.ParentalStatusTypeEnum.ParentalStatusType value) {
      if (value == null) {
        throw new NullPointerException();
      }
      ensureParentalStatusesIsMutable();
      parentalStatuses_.set(index, value.getNumber());
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Included parental status demographic segments.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v17.enums.ParentalStatusTypeEnum.ParentalStatusType parental_statuses = 1;</code>
     * @param value The parentalStatuses to add.
     * @return This builder for chaining.
     */
    public Builder addParentalStatuses(com.google.ads.googleads.v17.enums.ParentalStatusTypeEnum.ParentalStatusType value) {
      if (value == null) {
        throw new NullPointerException();
      }
      ensureParentalStatusesIsMutable();
      parentalStatuses_.add(value.getNumber());
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Included parental status demographic segments.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v17.enums.ParentalStatusTypeEnum.ParentalStatusType parental_statuses = 1;</code>
     * @param values The parentalStatuses to add.
     * @return This builder for chaining.
     */
    public Builder addAllParentalStatuses(
        java.lang.Iterable<? extends com.google.ads.googleads.v17.enums.ParentalStatusTypeEnum.ParentalStatusType> values) {
      ensureParentalStatusesIsMutable();
      for (com.google.ads.googleads.v17.enums.ParentalStatusTypeEnum.ParentalStatusType value : values) {
        parentalStatuses_.add(value.getNumber());
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Included parental status demographic segments.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v17.enums.ParentalStatusTypeEnum.ParentalStatusType parental_statuses = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearParentalStatuses() {
      parentalStatuses_ = java.util.Collections.emptyList();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Included parental status demographic segments.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v17.enums.ParentalStatusTypeEnum.ParentalStatusType parental_statuses = 1;</code>
     * @return A list containing the enum numeric values on the wire for parentalStatuses.
     */
    public java.util.List<java.lang.Integer>
    getParentalStatusesValueList() {
      return java.util.Collections.unmodifiableList(parentalStatuses_);
    }
    /**
     * <pre>
     * Included parental status demographic segments.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v17.enums.ParentalStatusTypeEnum.ParentalStatusType parental_statuses = 1;</code>
     * @param index The index of the value to return.
     * @return The enum numeric value on the wire of parentalStatuses at the given index.
     */
    public int getParentalStatusesValue(int index) {
      return parentalStatuses_.get(index);
    }
    /**
     * <pre>
     * Included parental status demographic segments.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v17.enums.ParentalStatusTypeEnum.ParentalStatusType parental_statuses = 1;</code>
     * @param index The index to set the value at.
     * @param value The enum numeric value on the wire for parentalStatuses to set.
     * @return This builder for chaining.
     */
    public Builder setParentalStatusesValue(
        int index, int value) {
      ensureParentalStatusesIsMutable();
      parentalStatuses_.set(index, value);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Included parental status demographic segments.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v17.enums.ParentalStatusTypeEnum.ParentalStatusType parental_statuses = 1;</code>
     * @param value The enum numeric value on the wire for parentalStatuses to add.
     * @return This builder for chaining.
     */
    public Builder addParentalStatusesValue(int value) {
      ensureParentalStatusesIsMutable();
      parentalStatuses_.add(value);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Included parental status demographic segments.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v17.enums.ParentalStatusTypeEnum.ParentalStatusType parental_statuses = 1;</code>
     * @param values The enum numeric values on the wire for parentalStatuses to add.
     * @return This builder for chaining.
     */
    public Builder addAllParentalStatusesValue(
        java.lang.Iterable<java.lang.Integer> values) {
      ensureParentalStatusesIsMutable();
      for (int value : values) {
        parentalStatuses_.add(value);
      }
      onChanged();
      return this;
    }

    private boolean includeUndetermined_ ;
    /**
     * <pre>
     * Include users whose parental status is undetermined.
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
     * Include users whose parental status is undetermined.
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
     * Include users whose parental status is undetermined.
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
     * Include users whose parental status is undetermined.
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


    // @@protoc_insertion_point(builder_scope:google.ads.googleads.v17.common.ParentalStatusDimension)
  }

  // @@protoc_insertion_point(class_scope:google.ads.googleads.v17.common.ParentalStatusDimension)
  private static final com.google.ads.googleads.v17.common.ParentalStatusDimension DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.ads.googleads.v17.common.ParentalStatusDimension();
  }

  public static com.google.ads.googleads.v17.common.ParentalStatusDimension getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ParentalStatusDimension>
      PARSER = new com.google.protobuf.AbstractParser<ParentalStatusDimension>() {
    @java.lang.Override
    public ParentalStatusDimension parsePartialFrom(
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

  public static com.google.protobuf.Parser<ParentalStatusDimension> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ParentalStatusDimension> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.ads.googleads.v17.common.ParentalStatusDimension getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

