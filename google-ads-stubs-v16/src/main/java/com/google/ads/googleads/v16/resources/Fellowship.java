// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v16/resources/local_services_employee.proto

// Protobuf Java Version: 3.25.3
package com.google.ads.googleads.v16.resources;

/**
 * <pre>
 * Details about the employee's medical Fellowship.
 * Fellowship is a period of medical training that the professional undertakes
 * after finishing their residency.
 * </pre>
 *
 * Protobuf type {@code google.ads.googleads.v16.resources.Fellowship}
 */
public final class Fellowship extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.ads.googleads.v16.resources.Fellowship)
    FellowshipOrBuilder {
private static final long serialVersionUID = 0L;
  // Use Fellowship.newBuilder() to construct.
  private Fellowship(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private Fellowship() {
    institutionName_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new Fellowship();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.ads.googleads.v16.resources.LocalServicesEmployeeProto.internal_static_google_ads_googleads_v16_resources_Fellowship_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.ads.googleads.v16.resources.LocalServicesEmployeeProto.internal_static_google_ads_googleads_v16_resources_Fellowship_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.ads.googleads.v16.resources.Fellowship.class, com.google.ads.googleads.v16.resources.Fellowship.Builder.class);
  }

  private int bitField0_;
  public static final int INSTITUTION_NAME_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object institutionName_ = "";
  /**
   * <pre>
   * Output only. Name of the instutition at which the fellowship was completed.
   * </pre>
   *
   * <code>optional string institution_name = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return Whether the institutionName field is set.
   */
  @java.lang.Override
  public boolean hasInstitutionName() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <pre>
   * Output only. Name of the instutition at which the fellowship was completed.
   * </pre>
   *
   * <code>optional string institution_name = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The institutionName.
   */
  @java.lang.Override
  public java.lang.String getInstitutionName() {
    java.lang.Object ref = institutionName_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      institutionName_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Output only. Name of the instutition at which the fellowship was completed.
   * </pre>
   *
   * <code>optional string institution_name = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The bytes for institutionName.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getInstitutionNameBytes() {
    java.lang.Object ref = institutionName_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      institutionName_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int COMPLETION_YEAR_FIELD_NUMBER = 2;
  private int completionYear_ = 0;
  /**
   * <pre>
   * Output only. Year of completion.
   * </pre>
   *
   * <code>optional int32 completion_year = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return Whether the completionYear field is set.
   */
  @java.lang.Override
  public boolean hasCompletionYear() {
    return ((bitField0_ & 0x00000002) != 0);
  }
  /**
   * <pre>
   * Output only. Year of completion.
   * </pre>
   *
   * <code>optional int32 completion_year = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The completionYear.
   */
  @java.lang.Override
  public int getCompletionYear() {
    return completionYear_;
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
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, institutionName_);
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      output.writeInt32(2, completionYear_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, institutionName_);
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(2, completionYear_);
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
    if (!(obj instanceof com.google.ads.googleads.v16.resources.Fellowship)) {
      return super.equals(obj);
    }
    com.google.ads.googleads.v16.resources.Fellowship other = (com.google.ads.googleads.v16.resources.Fellowship) obj;

    if (hasInstitutionName() != other.hasInstitutionName()) return false;
    if (hasInstitutionName()) {
      if (!getInstitutionName()
          .equals(other.getInstitutionName())) return false;
    }
    if (hasCompletionYear() != other.hasCompletionYear()) return false;
    if (hasCompletionYear()) {
      if (getCompletionYear()
          != other.getCompletionYear()) return false;
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
    if (hasInstitutionName()) {
      hash = (37 * hash) + INSTITUTION_NAME_FIELD_NUMBER;
      hash = (53 * hash) + getInstitutionName().hashCode();
    }
    if (hasCompletionYear()) {
      hash = (37 * hash) + COMPLETION_YEAR_FIELD_NUMBER;
      hash = (53 * hash) + getCompletionYear();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.ads.googleads.v16.resources.Fellowship parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v16.resources.Fellowship parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v16.resources.Fellowship parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v16.resources.Fellowship parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v16.resources.Fellowship parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v16.resources.Fellowship parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v16.resources.Fellowship parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v16.resources.Fellowship parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.google.ads.googleads.v16.resources.Fellowship parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.ads.googleads.v16.resources.Fellowship parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v16.resources.Fellowship parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v16.resources.Fellowship parseFrom(
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
  public static Builder newBuilder(com.google.ads.googleads.v16.resources.Fellowship prototype) {
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
   * Details about the employee's medical Fellowship.
   * Fellowship is a period of medical training that the professional undertakes
   * after finishing their residency.
   * </pre>
   *
   * Protobuf type {@code google.ads.googleads.v16.resources.Fellowship}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.ads.googleads.v16.resources.Fellowship)
      com.google.ads.googleads.v16.resources.FellowshipOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.ads.googleads.v16.resources.LocalServicesEmployeeProto.internal_static_google_ads_googleads_v16_resources_Fellowship_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.ads.googleads.v16.resources.LocalServicesEmployeeProto.internal_static_google_ads_googleads_v16_resources_Fellowship_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.ads.googleads.v16.resources.Fellowship.class, com.google.ads.googleads.v16.resources.Fellowship.Builder.class);
    }

    // Construct using com.google.ads.googleads.v16.resources.Fellowship.newBuilder()
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
      institutionName_ = "";
      completionYear_ = 0;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.ads.googleads.v16.resources.LocalServicesEmployeeProto.internal_static_google_ads_googleads_v16_resources_Fellowship_descriptor;
    }

    @java.lang.Override
    public com.google.ads.googleads.v16.resources.Fellowship getDefaultInstanceForType() {
      return com.google.ads.googleads.v16.resources.Fellowship.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.ads.googleads.v16.resources.Fellowship build() {
      com.google.ads.googleads.v16.resources.Fellowship result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.ads.googleads.v16.resources.Fellowship buildPartial() {
      com.google.ads.googleads.v16.resources.Fellowship result = new com.google.ads.googleads.v16.resources.Fellowship(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.ads.googleads.v16.resources.Fellowship result) {
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.institutionName_ = institutionName_;
        to_bitField0_ |= 0x00000001;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.completionYear_ = completionYear_;
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
      if (other instanceof com.google.ads.googleads.v16.resources.Fellowship) {
        return mergeFrom((com.google.ads.googleads.v16.resources.Fellowship)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.ads.googleads.v16.resources.Fellowship other) {
      if (other == com.google.ads.googleads.v16.resources.Fellowship.getDefaultInstance()) return this;
      if (other.hasInstitutionName()) {
        institutionName_ = other.institutionName_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (other.hasCompletionYear()) {
        setCompletionYear(other.getCompletionYear());
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
              institutionName_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 16: {
              completionYear_ = input.readInt32();
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

    private java.lang.Object institutionName_ = "";
    /**
     * <pre>
     * Output only. Name of the instutition at which the fellowship was completed.
     * </pre>
     *
     * <code>optional string institution_name = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     * @return Whether the institutionName field is set.
     */
    public boolean hasInstitutionName() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <pre>
     * Output only. Name of the instutition at which the fellowship was completed.
     * </pre>
     *
     * <code>optional string institution_name = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     * @return The institutionName.
     */
    public java.lang.String getInstitutionName() {
      java.lang.Object ref = institutionName_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        institutionName_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Output only. Name of the instutition at which the fellowship was completed.
     * </pre>
     *
     * <code>optional string institution_name = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     * @return The bytes for institutionName.
     */
    public com.google.protobuf.ByteString
        getInstitutionNameBytes() {
      java.lang.Object ref = institutionName_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        institutionName_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Output only. Name of the instutition at which the fellowship was completed.
     * </pre>
     *
     * <code>optional string institution_name = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     * @param value The institutionName to set.
     * @return This builder for chaining.
     */
    public Builder setInstitutionName(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      institutionName_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Output only. Name of the instutition at which the fellowship was completed.
     * </pre>
     *
     * <code>optional string institution_name = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     * @return This builder for chaining.
     */
    public Builder clearInstitutionName() {
      institutionName_ = getDefaultInstance().getInstitutionName();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Output only. Name of the instutition at which the fellowship was completed.
     * </pre>
     *
     * <code>optional string institution_name = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     * @param value The bytes for institutionName to set.
     * @return This builder for chaining.
     */
    public Builder setInstitutionNameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      institutionName_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private int completionYear_ ;
    /**
     * <pre>
     * Output only. Year of completion.
     * </pre>
     *
     * <code>optional int32 completion_year = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     * @return Whether the completionYear field is set.
     */
    @java.lang.Override
    public boolean hasCompletionYear() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <pre>
     * Output only. Year of completion.
     * </pre>
     *
     * <code>optional int32 completion_year = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     * @return The completionYear.
     */
    @java.lang.Override
    public int getCompletionYear() {
      return completionYear_;
    }
    /**
     * <pre>
     * Output only. Year of completion.
     * </pre>
     *
     * <code>optional int32 completion_year = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     * @param value The completionYear to set.
     * @return This builder for chaining.
     */
    public Builder setCompletionYear(int value) {

      completionYear_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Output only. Year of completion.
     * </pre>
     *
     * <code>optional int32 completion_year = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     * @return This builder for chaining.
     */
    public Builder clearCompletionYear() {
      bitField0_ = (bitField0_ & ~0x00000002);
      completionYear_ = 0;
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


    // @@protoc_insertion_point(builder_scope:google.ads.googleads.v16.resources.Fellowship)
  }

  // @@protoc_insertion_point(class_scope:google.ads.googleads.v16.resources.Fellowship)
  private static final com.google.ads.googleads.v16.resources.Fellowship DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.ads.googleads.v16.resources.Fellowship();
  }

  public static com.google.ads.googleads.v16.resources.Fellowship getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Fellowship>
      PARSER = new com.google.protobuf.AbstractParser<Fellowship>() {
    @java.lang.Override
    public Fellowship parsePartialFrom(
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

  public static com.google.protobuf.Parser<Fellowship> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Fellowship> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.ads.googleads.v16.resources.Fellowship getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

