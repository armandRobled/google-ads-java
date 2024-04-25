// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v15/resources/custom_interest.proto

// Protobuf Java Version: 3.25.3
package com.google.ads.googleads.v15.resources;

/**
 * <pre>
 * A member of custom interest audience. A member can be a keyword or url.
 * It is immutable, that is, it can only be created or removed but not changed.
 * </pre>
 *
 * Protobuf type {@code google.ads.googleads.v15.resources.CustomInterestMember}
 */
public final class CustomInterestMember extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.ads.googleads.v15.resources.CustomInterestMember)
    CustomInterestMemberOrBuilder {
private static final long serialVersionUID = 0L;
  // Use CustomInterestMember.newBuilder() to construct.
  private CustomInterestMember(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private CustomInterestMember() {
    memberType_ = 0;
    parameter_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new CustomInterestMember();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.ads.googleads.v15.resources.CustomInterestProto.internal_static_google_ads_googleads_v15_resources_CustomInterestMember_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.ads.googleads.v15.resources.CustomInterestProto.internal_static_google_ads_googleads_v15_resources_CustomInterestMember_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.ads.googleads.v15.resources.CustomInterestMember.class, com.google.ads.googleads.v15.resources.CustomInterestMember.Builder.class);
  }

  private int bitField0_;
  public static final int MEMBER_TYPE_FIELD_NUMBER = 1;
  private int memberType_ = 0;
  /**
   * <pre>
   * The type of custom interest member, KEYWORD or URL.
   * </pre>
   *
   * <code>.google.ads.googleads.v15.enums.CustomInterestMemberTypeEnum.CustomInterestMemberType member_type = 1;</code>
   * @return The enum numeric value on the wire for memberType.
   */
  @java.lang.Override public int getMemberTypeValue() {
    return memberType_;
  }
  /**
   * <pre>
   * The type of custom interest member, KEYWORD or URL.
   * </pre>
   *
   * <code>.google.ads.googleads.v15.enums.CustomInterestMemberTypeEnum.CustomInterestMemberType member_type = 1;</code>
   * @return The memberType.
   */
  @java.lang.Override public com.google.ads.googleads.v15.enums.CustomInterestMemberTypeEnum.CustomInterestMemberType getMemberType() {
    com.google.ads.googleads.v15.enums.CustomInterestMemberTypeEnum.CustomInterestMemberType result = com.google.ads.googleads.v15.enums.CustomInterestMemberTypeEnum.CustomInterestMemberType.forNumber(memberType_);
    return result == null ? com.google.ads.googleads.v15.enums.CustomInterestMemberTypeEnum.CustomInterestMemberType.UNRECOGNIZED : result;
  }

  public static final int PARAMETER_FIELD_NUMBER = 3;
  @SuppressWarnings("serial")
  private volatile java.lang.Object parameter_ = "";
  /**
   * <pre>
   * Keyword text when member_type is KEYWORD or URL string when
   * member_type is URL.
   * </pre>
   *
   * <code>optional string parameter = 3;</code>
   * @return Whether the parameter field is set.
   */
  @java.lang.Override
  public boolean hasParameter() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <pre>
   * Keyword text when member_type is KEYWORD or URL string when
   * member_type is URL.
   * </pre>
   *
   * <code>optional string parameter = 3;</code>
   * @return The parameter.
   */
  @java.lang.Override
  public java.lang.String getParameter() {
    java.lang.Object ref = parameter_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      parameter_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Keyword text when member_type is KEYWORD or URL string when
   * member_type is URL.
   * </pre>
   *
   * <code>optional string parameter = 3;</code>
   * @return The bytes for parameter.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getParameterBytes() {
    java.lang.Object ref = parameter_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      parameter_ = b;
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
    if (memberType_ != com.google.ads.googleads.v15.enums.CustomInterestMemberTypeEnum.CustomInterestMemberType.UNSPECIFIED.getNumber()) {
      output.writeEnum(1, memberType_);
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, parameter_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (memberType_ != com.google.ads.googleads.v15.enums.CustomInterestMemberTypeEnum.CustomInterestMemberType.UNSPECIFIED.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(1, memberType_);
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, parameter_);
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
    if (!(obj instanceof com.google.ads.googleads.v15.resources.CustomInterestMember)) {
      return super.equals(obj);
    }
    com.google.ads.googleads.v15.resources.CustomInterestMember other = (com.google.ads.googleads.v15.resources.CustomInterestMember) obj;

    if (memberType_ != other.memberType_) return false;
    if (hasParameter() != other.hasParameter()) return false;
    if (hasParameter()) {
      if (!getParameter()
          .equals(other.getParameter())) return false;
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
    hash = (37 * hash) + MEMBER_TYPE_FIELD_NUMBER;
    hash = (53 * hash) + memberType_;
    if (hasParameter()) {
      hash = (37 * hash) + PARAMETER_FIELD_NUMBER;
      hash = (53 * hash) + getParameter().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.ads.googleads.v15.resources.CustomInterestMember parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v15.resources.CustomInterestMember parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v15.resources.CustomInterestMember parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v15.resources.CustomInterestMember parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v15.resources.CustomInterestMember parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v15.resources.CustomInterestMember parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v15.resources.CustomInterestMember parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v15.resources.CustomInterestMember parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.google.ads.googleads.v15.resources.CustomInterestMember parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.ads.googleads.v15.resources.CustomInterestMember parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v15.resources.CustomInterestMember parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v15.resources.CustomInterestMember parseFrom(
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
  public static Builder newBuilder(com.google.ads.googleads.v15.resources.CustomInterestMember prototype) {
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
   * A member of custom interest audience. A member can be a keyword or url.
   * It is immutable, that is, it can only be created or removed but not changed.
   * </pre>
   *
   * Protobuf type {@code google.ads.googleads.v15.resources.CustomInterestMember}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.ads.googleads.v15.resources.CustomInterestMember)
      com.google.ads.googleads.v15.resources.CustomInterestMemberOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.ads.googleads.v15.resources.CustomInterestProto.internal_static_google_ads_googleads_v15_resources_CustomInterestMember_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.ads.googleads.v15.resources.CustomInterestProto.internal_static_google_ads_googleads_v15_resources_CustomInterestMember_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.ads.googleads.v15.resources.CustomInterestMember.class, com.google.ads.googleads.v15.resources.CustomInterestMember.Builder.class);
    }

    // Construct using com.google.ads.googleads.v15.resources.CustomInterestMember.newBuilder()
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
      memberType_ = 0;
      parameter_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.ads.googleads.v15.resources.CustomInterestProto.internal_static_google_ads_googleads_v15_resources_CustomInterestMember_descriptor;
    }

    @java.lang.Override
    public com.google.ads.googleads.v15.resources.CustomInterestMember getDefaultInstanceForType() {
      return com.google.ads.googleads.v15.resources.CustomInterestMember.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.ads.googleads.v15.resources.CustomInterestMember build() {
      com.google.ads.googleads.v15.resources.CustomInterestMember result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.ads.googleads.v15.resources.CustomInterestMember buildPartial() {
      com.google.ads.googleads.v15.resources.CustomInterestMember result = new com.google.ads.googleads.v15.resources.CustomInterestMember(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.ads.googleads.v15.resources.CustomInterestMember result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.memberType_ = memberType_;
      }
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.parameter_ = parameter_;
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
      if (other instanceof com.google.ads.googleads.v15.resources.CustomInterestMember) {
        return mergeFrom((com.google.ads.googleads.v15.resources.CustomInterestMember)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.ads.googleads.v15.resources.CustomInterestMember other) {
      if (other == com.google.ads.googleads.v15.resources.CustomInterestMember.getDefaultInstance()) return this;
      if (other.memberType_ != 0) {
        setMemberTypeValue(other.getMemberTypeValue());
      }
      if (other.hasParameter()) {
        parameter_ = other.parameter_;
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
            case 8: {
              memberType_ = input.readEnum();
              bitField0_ |= 0x00000001;
              break;
            } // case 8
            case 26: {
              parameter_ = input.readStringRequireUtf8();
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

    private int memberType_ = 0;
    /**
     * <pre>
     * The type of custom interest member, KEYWORD or URL.
     * </pre>
     *
     * <code>.google.ads.googleads.v15.enums.CustomInterestMemberTypeEnum.CustomInterestMemberType member_type = 1;</code>
     * @return The enum numeric value on the wire for memberType.
     */
    @java.lang.Override public int getMemberTypeValue() {
      return memberType_;
    }
    /**
     * <pre>
     * The type of custom interest member, KEYWORD or URL.
     * </pre>
     *
     * <code>.google.ads.googleads.v15.enums.CustomInterestMemberTypeEnum.CustomInterestMemberType member_type = 1;</code>
     * @param value The enum numeric value on the wire for memberType to set.
     * @return This builder for chaining.
     */
    public Builder setMemberTypeValue(int value) {
      memberType_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The type of custom interest member, KEYWORD or URL.
     * </pre>
     *
     * <code>.google.ads.googleads.v15.enums.CustomInterestMemberTypeEnum.CustomInterestMemberType member_type = 1;</code>
     * @return The memberType.
     */
    @java.lang.Override
    public com.google.ads.googleads.v15.enums.CustomInterestMemberTypeEnum.CustomInterestMemberType getMemberType() {
      com.google.ads.googleads.v15.enums.CustomInterestMemberTypeEnum.CustomInterestMemberType result = com.google.ads.googleads.v15.enums.CustomInterestMemberTypeEnum.CustomInterestMemberType.forNumber(memberType_);
      return result == null ? com.google.ads.googleads.v15.enums.CustomInterestMemberTypeEnum.CustomInterestMemberType.UNRECOGNIZED : result;
    }
    /**
     * <pre>
     * The type of custom interest member, KEYWORD or URL.
     * </pre>
     *
     * <code>.google.ads.googleads.v15.enums.CustomInterestMemberTypeEnum.CustomInterestMemberType member_type = 1;</code>
     * @param value The memberType to set.
     * @return This builder for chaining.
     */
    public Builder setMemberType(com.google.ads.googleads.v15.enums.CustomInterestMemberTypeEnum.CustomInterestMemberType value) {
      if (value == null) {
        throw new NullPointerException();
      }
      bitField0_ |= 0x00000001;
      memberType_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The type of custom interest member, KEYWORD or URL.
     * </pre>
     *
     * <code>.google.ads.googleads.v15.enums.CustomInterestMemberTypeEnum.CustomInterestMemberType member_type = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearMemberType() {
      bitField0_ = (bitField0_ & ~0x00000001);
      memberType_ = 0;
      onChanged();
      return this;
    }

    private java.lang.Object parameter_ = "";
    /**
     * <pre>
     * Keyword text when member_type is KEYWORD or URL string when
     * member_type is URL.
     * </pre>
     *
     * <code>optional string parameter = 3;</code>
     * @return Whether the parameter field is set.
     */
    public boolean hasParameter() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <pre>
     * Keyword text when member_type is KEYWORD or URL string when
     * member_type is URL.
     * </pre>
     *
     * <code>optional string parameter = 3;</code>
     * @return The parameter.
     */
    public java.lang.String getParameter() {
      java.lang.Object ref = parameter_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        parameter_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Keyword text when member_type is KEYWORD or URL string when
     * member_type is URL.
     * </pre>
     *
     * <code>optional string parameter = 3;</code>
     * @return The bytes for parameter.
     */
    public com.google.protobuf.ByteString
        getParameterBytes() {
      java.lang.Object ref = parameter_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        parameter_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Keyword text when member_type is KEYWORD or URL string when
     * member_type is URL.
     * </pre>
     *
     * <code>optional string parameter = 3;</code>
     * @param value The parameter to set.
     * @return This builder for chaining.
     */
    public Builder setParameter(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      parameter_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Keyword text when member_type is KEYWORD or URL string when
     * member_type is URL.
     * </pre>
     *
     * <code>optional string parameter = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearParameter() {
      parameter_ = getDefaultInstance().getParameter();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Keyword text when member_type is KEYWORD or URL string when
     * member_type is URL.
     * </pre>
     *
     * <code>optional string parameter = 3;</code>
     * @param value The bytes for parameter to set.
     * @return This builder for chaining.
     */
    public Builder setParameterBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      parameter_ = value;
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


    // @@protoc_insertion_point(builder_scope:google.ads.googleads.v15.resources.CustomInterestMember)
  }

  // @@protoc_insertion_point(class_scope:google.ads.googleads.v15.resources.CustomInterestMember)
  private static final com.google.ads.googleads.v15.resources.CustomInterestMember DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.ads.googleads.v15.resources.CustomInterestMember();
  }

  public static com.google.ads.googleads.v15.resources.CustomInterestMember getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CustomInterestMember>
      PARSER = new com.google.protobuf.AbstractParser<CustomInterestMember>() {
    @java.lang.Override
    public CustomInterestMember parsePartialFrom(
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

  public static com.google.protobuf.Parser<CustomInterestMember> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CustomInterestMember> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.ads.googleads.v15.resources.CustomInterestMember getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

