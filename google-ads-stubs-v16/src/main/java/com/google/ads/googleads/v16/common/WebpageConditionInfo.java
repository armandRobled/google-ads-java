// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v16/common/criteria.proto

// Protobuf Java Version: 3.25.3
package com.google.ads.googleads.v16.common;

/**
 * <pre>
 * Logical expression for targeting webpages of an advertiser's website.
 * </pre>
 *
 * Protobuf type {@code google.ads.googleads.v16.common.WebpageConditionInfo}
 */
public final class WebpageConditionInfo extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.ads.googleads.v16.common.WebpageConditionInfo)
    WebpageConditionInfoOrBuilder {
private static final long serialVersionUID = 0L;
  // Use WebpageConditionInfo.newBuilder() to construct.
  private WebpageConditionInfo(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private WebpageConditionInfo() {
    operand_ = 0;
    operator_ = 0;
    argument_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new WebpageConditionInfo();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.ads.googleads.v16.common.CriteriaProto.internal_static_google_ads_googleads_v16_common_WebpageConditionInfo_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.ads.googleads.v16.common.CriteriaProto.internal_static_google_ads_googleads_v16_common_WebpageConditionInfo_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.ads.googleads.v16.common.WebpageConditionInfo.class, com.google.ads.googleads.v16.common.WebpageConditionInfo.Builder.class);
  }

  private int bitField0_;
  public static final int OPERAND_FIELD_NUMBER = 1;
  private int operand_ = 0;
  /**
   * <pre>
   * Operand of webpage targeting condition.
   * </pre>
   *
   * <code>.google.ads.googleads.v16.enums.WebpageConditionOperandEnum.WebpageConditionOperand operand = 1;</code>
   * @return The enum numeric value on the wire for operand.
   */
  @java.lang.Override public int getOperandValue() {
    return operand_;
  }
  /**
   * <pre>
   * Operand of webpage targeting condition.
   * </pre>
   *
   * <code>.google.ads.googleads.v16.enums.WebpageConditionOperandEnum.WebpageConditionOperand operand = 1;</code>
   * @return The operand.
   */
  @java.lang.Override public com.google.ads.googleads.v16.enums.WebpageConditionOperandEnum.WebpageConditionOperand getOperand() {
    com.google.ads.googleads.v16.enums.WebpageConditionOperandEnum.WebpageConditionOperand result = com.google.ads.googleads.v16.enums.WebpageConditionOperandEnum.WebpageConditionOperand.forNumber(operand_);
    return result == null ? com.google.ads.googleads.v16.enums.WebpageConditionOperandEnum.WebpageConditionOperand.UNRECOGNIZED : result;
  }

  public static final int OPERATOR_FIELD_NUMBER = 2;
  private int operator_ = 0;
  /**
   * <pre>
   * Operator of webpage targeting condition.
   * </pre>
   *
   * <code>.google.ads.googleads.v16.enums.WebpageConditionOperatorEnum.WebpageConditionOperator operator = 2;</code>
   * @return The enum numeric value on the wire for operator.
   */
  @java.lang.Override public int getOperatorValue() {
    return operator_;
  }
  /**
   * <pre>
   * Operator of webpage targeting condition.
   * </pre>
   *
   * <code>.google.ads.googleads.v16.enums.WebpageConditionOperatorEnum.WebpageConditionOperator operator = 2;</code>
   * @return The operator.
   */
  @java.lang.Override public com.google.ads.googleads.v16.enums.WebpageConditionOperatorEnum.WebpageConditionOperator getOperator() {
    com.google.ads.googleads.v16.enums.WebpageConditionOperatorEnum.WebpageConditionOperator result = com.google.ads.googleads.v16.enums.WebpageConditionOperatorEnum.WebpageConditionOperator.forNumber(operator_);
    return result == null ? com.google.ads.googleads.v16.enums.WebpageConditionOperatorEnum.WebpageConditionOperator.UNRECOGNIZED : result;
  }

  public static final int ARGUMENT_FIELD_NUMBER = 4;
  @SuppressWarnings("serial")
  private volatile java.lang.Object argument_ = "";
  /**
   * <pre>
   * Argument of webpage targeting condition.
   * </pre>
   *
   * <code>optional string argument = 4;</code>
   * @return Whether the argument field is set.
   */
  @java.lang.Override
  public boolean hasArgument() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <pre>
   * Argument of webpage targeting condition.
   * </pre>
   *
   * <code>optional string argument = 4;</code>
   * @return The argument.
   */
  @java.lang.Override
  public java.lang.String getArgument() {
    java.lang.Object ref = argument_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      argument_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Argument of webpage targeting condition.
   * </pre>
   *
   * <code>optional string argument = 4;</code>
   * @return The bytes for argument.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getArgumentBytes() {
    java.lang.Object ref = argument_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      argument_ = b;
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
    if (operand_ != com.google.ads.googleads.v16.enums.WebpageConditionOperandEnum.WebpageConditionOperand.UNSPECIFIED.getNumber()) {
      output.writeEnum(1, operand_);
    }
    if (operator_ != com.google.ads.googleads.v16.enums.WebpageConditionOperatorEnum.WebpageConditionOperator.UNSPECIFIED.getNumber()) {
      output.writeEnum(2, operator_);
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 4, argument_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (operand_ != com.google.ads.googleads.v16.enums.WebpageConditionOperandEnum.WebpageConditionOperand.UNSPECIFIED.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(1, operand_);
    }
    if (operator_ != com.google.ads.googleads.v16.enums.WebpageConditionOperatorEnum.WebpageConditionOperator.UNSPECIFIED.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(2, operator_);
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(4, argument_);
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
    if (!(obj instanceof com.google.ads.googleads.v16.common.WebpageConditionInfo)) {
      return super.equals(obj);
    }
    com.google.ads.googleads.v16.common.WebpageConditionInfo other = (com.google.ads.googleads.v16.common.WebpageConditionInfo) obj;

    if (operand_ != other.operand_) return false;
    if (operator_ != other.operator_) return false;
    if (hasArgument() != other.hasArgument()) return false;
    if (hasArgument()) {
      if (!getArgument()
          .equals(other.getArgument())) return false;
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
    hash = (37 * hash) + OPERAND_FIELD_NUMBER;
    hash = (53 * hash) + operand_;
    hash = (37 * hash) + OPERATOR_FIELD_NUMBER;
    hash = (53 * hash) + operator_;
    if (hasArgument()) {
      hash = (37 * hash) + ARGUMENT_FIELD_NUMBER;
      hash = (53 * hash) + getArgument().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.ads.googleads.v16.common.WebpageConditionInfo parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v16.common.WebpageConditionInfo parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v16.common.WebpageConditionInfo parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v16.common.WebpageConditionInfo parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v16.common.WebpageConditionInfo parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v16.common.WebpageConditionInfo parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v16.common.WebpageConditionInfo parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v16.common.WebpageConditionInfo parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.google.ads.googleads.v16.common.WebpageConditionInfo parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.ads.googleads.v16.common.WebpageConditionInfo parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v16.common.WebpageConditionInfo parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v16.common.WebpageConditionInfo parseFrom(
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
  public static Builder newBuilder(com.google.ads.googleads.v16.common.WebpageConditionInfo prototype) {
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
   * Logical expression for targeting webpages of an advertiser's website.
   * </pre>
   *
   * Protobuf type {@code google.ads.googleads.v16.common.WebpageConditionInfo}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.ads.googleads.v16.common.WebpageConditionInfo)
      com.google.ads.googleads.v16.common.WebpageConditionInfoOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.ads.googleads.v16.common.CriteriaProto.internal_static_google_ads_googleads_v16_common_WebpageConditionInfo_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.ads.googleads.v16.common.CriteriaProto.internal_static_google_ads_googleads_v16_common_WebpageConditionInfo_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.ads.googleads.v16.common.WebpageConditionInfo.class, com.google.ads.googleads.v16.common.WebpageConditionInfo.Builder.class);
    }

    // Construct using com.google.ads.googleads.v16.common.WebpageConditionInfo.newBuilder()
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
      operand_ = 0;
      operator_ = 0;
      argument_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.ads.googleads.v16.common.CriteriaProto.internal_static_google_ads_googleads_v16_common_WebpageConditionInfo_descriptor;
    }

    @java.lang.Override
    public com.google.ads.googleads.v16.common.WebpageConditionInfo getDefaultInstanceForType() {
      return com.google.ads.googleads.v16.common.WebpageConditionInfo.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.ads.googleads.v16.common.WebpageConditionInfo build() {
      com.google.ads.googleads.v16.common.WebpageConditionInfo result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.ads.googleads.v16.common.WebpageConditionInfo buildPartial() {
      com.google.ads.googleads.v16.common.WebpageConditionInfo result = new com.google.ads.googleads.v16.common.WebpageConditionInfo(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.ads.googleads.v16.common.WebpageConditionInfo result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.operand_ = operand_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.operator_ = operator_;
      }
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.argument_ = argument_;
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
      if (other instanceof com.google.ads.googleads.v16.common.WebpageConditionInfo) {
        return mergeFrom((com.google.ads.googleads.v16.common.WebpageConditionInfo)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.ads.googleads.v16.common.WebpageConditionInfo other) {
      if (other == com.google.ads.googleads.v16.common.WebpageConditionInfo.getDefaultInstance()) return this;
      if (other.operand_ != 0) {
        setOperandValue(other.getOperandValue());
      }
      if (other.operator_ != 0) {
        setOperatorValue(other.getOperatorValue());
      }
      if (other.hasArgument()) {
        argument_ = other.argument_;
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
            case 8: {
              operand_ = input.readEnum();
              bitField0_ |= 0x00000001;
              break;
            } // case 8
            case 16: {
              operator_ = input.readEnum();
              bitField0_ |= 0x00000002;
              break;
            } // case 16
            case 34: {
              argument_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000004;
              break;
            } // case 34
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

    private int operand_ = 0;
    /**
     * <pre>
     * Operand of webpage targeting condition.
     * </pre>
     *
     * <code>.google.ads.googleads.v16.enums.WebpageConditionOperandEnum.WebpageConditionOperand operand = 1;</code>
     * @return The enum numeric value on the wire for operand.
     */
    @java.lang.Override public int getOperandValue() {
      return operand_;
    }
    /**
     * <pre>
     * Operand of webpage targeting condition.
     * </pre>
     *
     * <code>.google.ads.googleads.v16.enums.WebpageConditionOperandEnum.WebpageConditionOperand operand = 1;</code>
     * @param value The enum numeric value on the wire for operand to set.
     * @return This builder for chaining.
     */
    public Builder setOperandValue(int value) {
      operand_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Operand of webpage targeting condition.
     * </pre>
     *
     * <code>.google.ads.googleads.v16.enums.WebpageConditionOperandEnum.WebpageConditionOperand operand = 1;</code>
     * @return The operand.
     */
    @java.lang.Override
    public com.google.ads.googleads.v16.enums.WebpageConditionOperandEnum.WebpageConditionOperand getOperand() {
      com.google.ads.googleads.v16.enums.WebpageConditionOperandEnum.WebpageConditionOperand result = com.google.ads.googleads.v16.enums.WebpageConditionOperandEnum.WebpageConditionOperand.forNumber(operand_);
      return result == null ? com.google.ads.googleads.v16.enums.WebpageConditionOperandEnum.WebpageConditionOperand.UNRECOGNIZED : result;
    }
    /**
     * <pre>
     * Operand of webpage targeting condition.
     * </pre>
     *
     * <code>.google.ads.googleads.v16.enums.WebpageConditionOperandEnum.WebpageConditionOperand operand = 1;</code>
     * @param value The operand to set.
     * @return This builder for chaining.
     */
    public Builder setOperand(com.google.ads.googleads.v16.enums.WebpageConditionOperandEnum.WebpageConditionOperand value) {
      if (value == null) {
        throw new NullPointerException();
      }
      bitField0_ |= 0x00000001;
      operand_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Operand of webpage targeting condition.
     * </pre>
     *
     * <code>.google.ads.googleads.v16.enums.WebpageConditionOperandEnum.WebpageConditionOperand operand = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearOperand() {
      bitField0_ = (bitField0_ & ~0x00000001);
      operand_ = 0;
      onChanged();
      return this;
    }

    private int operator_ = 0;
    /**
     * <pre>
     * Operator of webpage targeting condition.
     * </pre>
     *
     * <code>.google.ads.googleads.v16.enums.WebpageConditionOperatorEnum.WebpageConditionOperator operator = 2;</code>
     * @return The enum numeric value on the wire for operator.
     */
    @java.lang.Override public int getOperatorValue() {
      return operator_;
    }
    /**
     * <pre>
     * Operator of webpage targeting condition.
     * </pre>
     *
     * <code>.google.ads.googleads.v16.enums.WebpageConditionOperatorEnum.WebpageConditionOperator operator = 2;</code>
     * @param value The enum numeric value on the wire for operator to set.
     * @return This builder for chaining.
     */
    public Builder setOperatorValue(int value) {
      operator_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Operator of webpage targeting condition.
     * </pre>
     *
     * <code>.google.ads.googleads.v16.enums.WebpageConditionOperatorEnum.WebpageConditionOperator operator = 2;</code>
     * @return The operator.
     */
    @java.lang.Override
    public com.google.ads.googleads.v16.enums.WebpageConditionOperatorEnum.WebpageConditionOperator getOperator() {
      com.google.ads.googleads.v16.enums.WebpageConditionOperatorEnum.WebpageConditionOperator result = com.google.ads.googleads.v16.enums.WebpageConditionOperatorEnum.WebpageConditionOperator.forNumber(operator_);
      return result == null ? com.google.ads.googleads.v16.enums.WebpageConditionOperatorEnum.WebpageConditionOperator.UNRECOGNIZED : result;
    }
    /**
     * <pre>
     * Operator of webpage targeting condition.
     * </pre>
     *
     * <code>.google.ads.googleads.v16.enums.WebpageConditionOperatorEnum.WebpageConditionOperator operator = 2;</code>
     * @param value The operator to set.
     * @return This builder for chaining.
     */
    public Builder setOperator(com.google.ads.googleads.v16.enums.WebpageConditionOperatorEnum.WebpageConditionOperator value) {
      if (value == null) {
        throw new NullPointerException();
      }
      bitField0_ |= 0x00000002;
      operator_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Operator of webpage targeting condition.
     * </pre>
     *
     * <code>.google.ads.googleads.v16.enums.WebpageConditionOperatorEnum.WebpageConditionOperator operator = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearOperator() {
      bitField0_ = (bitField0_ & ~0x00000002);
      operator_ = 0;
      onChanged();
      return this;
    }

    private java.lang.Object argument_ = "";
    /**
     * <pre>
     * Argument of webpage targeting condition.
     * </pre>
     *
     * <code>optional string argument = 4;</code>
     * @return Whether the argument field is set.
     */
    public boolean hasArgument() {
      return ((bitField0_ & 0x00000004) != 0);
    }
    /**
     * <pre>
     * Argument of webpage targeting condition.
     * </pre>
     *
     * <code>optional string argument = 4;</code>
     * @return The argument.
     */
    public java.lang.String getArgument() {
      java.lang.Object ref = argument_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        argument_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Argument of webpage targeting condition.
     * </pre>
     *
     * <code>optional string argument = 4;</code>
     * @return The bytes for argument.
     */
    public com.google.protobuf.ByteString
        getArgumentBytes() {
      java.lang.Object ref = argument_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        argument_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Argument of webpage targeting condition.
     * </pre>
     *
     * <code>optional string argument = 4;</code>
     * @param value The argument to set.
     * @return This builder for chaining.
     */
    public Builder setArgument(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      argument_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Argument of webpage targeting condition.
     * </pre>
     *
     * <code>optional string argument = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearArgument() {
      argument_ = getDefaultInstance().getArgument();
      bitField0_ = (bitField0_ & ~0x00000004);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Argument of webpage targeting condition.
     * </pre>
     *
     * <code>optional string argument = 4;</code>
     * @param value The bytes for argument to set.
     * @return This builder for chaining.
     */
    public Builder setArgumentBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      argument_ = value;
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


    // @@protoc_insertion_point(builder_scope:google.ads.googleads.v16.common.WebpageConditionInfo)
  }

  // @@protoc_insertion_point(class_scope:google.ads.googleads.v16.common.WebpageConditionInfo)
  private static final com.google.ads.googleads.v16.common.WebpageConditionInfo DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.ads.googleads.v16.common.WebpageConditionInfo();
  }

  public static com.google.ads.googleads.v16.common.WebpageConditionInfo getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<WebpageConditionInfo>
      PARSER = new com.google.protobuf.AbstractParser<WebpageConditionInfo>() {
    @java.lang.Override
    public WebpageConditionInfo parsePartialFrom(
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

  public static com.google.protobuf.Parser<WebpageConditionInfo> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<WebpageConditionInfo> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.ads.googleads.v16.common.WebpageConditionInfo getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

