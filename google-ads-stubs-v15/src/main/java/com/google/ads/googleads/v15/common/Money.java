// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v15/common/feed_common.proto

// Protobuf Java Version: 3.25.3
package com.google.ads.googleads.v15.common;

/**
 * <pre>
 * Represents a price in a particular currency.
 * </pre>
 *
 * Protobuf type {@code google.ads.googleads.v15.common.Money}
 */
public final class Money extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.ads.googleads.v15.common.Money)
    MoneyOrBuilder {
private static final long serialVersionUID = 0L;
  // Use Money.newBuilder() to construct.
  private Money(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private Money() {
    currencyCode_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new Money();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.ads.googleads.v15.common.FeedCommonProto.internal_static_google_ads_googleads_v15_common_Money_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.ads.googleads.v15.common.FeedCommonProto.internal_static_google_ads_googleads_v15_common_Money_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.ads.googleads.v15.common.Money.class, com.google.ads.googleads.v15.common.Money.Builder.class);
  }

  private int bitField0_;
  public static final int CURRENCY_CODE_FIELD_NUMBER = 3;
  @SuppressWarnings("serial")
  private volatile java.lang.Object currencyCode_ = "";
  /**
   * <pre>
   * Three-character ISO 4217 currency code.
   * </pre>
   *
   * <code>optional string currency_code = 3;</code>
   * @return Whether the currencyCode field is set.
   */
  @java.lang.Override
  public boolean hasCurrencyCode() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <pre>
   * Three-character ISO 4217 currency code.
   * </pre>
   *
   * <code>optional string currency_code = 3;</code>
   * @return The currencyCode.
   */
  @java.lang.Override
  public java.lang.String getCurrencyCode() {
    java.lang.Object ref = currencyCode_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      currencyCode_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Three-character ISO 4217 currency code.
   * </pre>
   *
   * <code>optional string currency_code = 3;</code>
   * @return The bytes for currencyCode.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getCurrencyCodeBytes() {
    java.lang.Object ref = currencyCode_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      currencyCode_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int AMOUNT_MICROS_FIELD_NUMBER = 4;
  private long amountMicros_ = 0L;
  /**
   * <pre>
   * Amount in micros. One million is equivalent to one unit.
   * </pre>
   *
   * <code>optional int64 amount_micros = 4;</code>
   * @return Whether the amountMicros field is set.
   */
  @java.lang.Override
  public boolean hasAmountMicros() {
    return ((bitField0_ & 0x00000002) != 0);
  }
  /**
   * <pre>
   * Amount in micros. One million is equivalent to one unit.
   * </pre>
   *
   * <code>optional int64 amount_micros = 4;</code>
   * @return The amountMicros.
   */
  @java.lang.Override
  public long getAmountMicros() {
    return amountMicros_;
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
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, currencyCode_);
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      output.writeInt64(4, amountMicros_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, currencyCode_);
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(4, amountMicros_);
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
    if (!(obj instanceof com.google.ads.googleads.v15.common.Money)) {
      return super.equals(obj);
    }
    com.google.ads.googleads.v15.common.Money other = (com.google.ads.googleads.v15.common.Money) obj;

    if (hasCurrencyCode() != other.hasCurrencyCode()) return false;
    if (hasCurrencyCode()) {
      if (!getCurrencyCode()
          .equals(other.getCurrencyCode())) return false;
    }
    if (hasAmountMicros() != other.hasAmountMicros()) return false;
    if (hasAmountMicros()) {
      if (getAmountMicros()
          != other.getAmountMicros()) return false;
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
    if (hasCurrencyCode()) {
      hash = (37 * hash) + CURRENCY_CODE_FIELD_NUMBER;
      hash = (53 * hash) + getCurrencyCode().hashCode();
    }
    if (hasAmountMicros()) {
      hash = (37 * hash) + AMOUNT_MICROS_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
          getAmountMicros());
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.ads.googleads.v15.common.Money parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v15.common.Money parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v15.common.Money parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v15.common.Money parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v15.common.Money parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v15.common.Money parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v15.common.Money parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v15.common.Money parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.google.ads.googleads.v15.common.Money parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.ads.googleads.v15.common.Money parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v15.common.Money parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v15.common.Money parseFrom(
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
  public static Builder newBuilder(com.google.ads.googleads.v15.common.Money prototype) {
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
   * Represents a price in a particular currency.
   * </pre>
   *
   * Protobuf type {@code google.ads.googleads.v15.common.Money}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.ads.googleads.v15.common.Money)
      com.google.ads.googleads.v15.common.MoneyOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.ads.googleads.v15.common.FeedCommonProto.internal_static_google_ads_googleads_v15_common_Money_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.ads.googleads.v15.common.FeedCommonProto.internal_static_google_ads_googleads_v15_common_Money_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.ads.googleads.v15.common.Money.class, com.google.ads.googleads.v15.common.Money.Builder.class);
    }

    // Construct using com.google.ads.googleads.v15.common.Money.newBuilder()
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
      currencyCode_ = "";
      amountMicros_ = 0L;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.ads.googleads.v15.common.FeedCommonProto.internal_static_google_ads_googleads_v15_common_Money_descriptor;
    }

    @java.lang.Override
    public com.google.ads.googleads.v15.common.Money getDefaultInstanceForType() {
      return com.google.ads.googleads.v15.common.Money.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.ads.googleads.v15.common.Money build() {
      com.google.ads.googleads.v15.common.Money result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.ads.googleads.v15.common.Money buildPartial() {
      com.google.ads.googleads.v15.common.Money result = new com.google.ads.googleads.v15.common.Money(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.ads.googleads.v15.common.Money result) {
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.currencyCode_ = currencyCode_;
        to_bitField0_ |= 0x00000001;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.amountMicros_ = amountMicros_;
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
      if (other instanceof com.google.ads.googleads.v15.common.Money) {
        return mergeFrom((com.google.ads.googleads.v15.common.Money)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.ads.googleads.v15.common.Money other) {
      if (other == com.google.ads.googleads.v15.common.Money.getDefaultInstance()) return this;
      if (other.hasCurrencyCode()) {
        currencyCode_ = other.currencyCode_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (other.hasAmountMicros()) {
        setAmountMicros(other.getAmountMicros());
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
            case 26: {
              currencyCode_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
              break;
            } // case 26
            case 32: {
              amountMicros_ = input.readInt64();
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

    private java.lang.Object currencyCode_ = "";
    /**
     * <pre>
     * Three-character ISO 4217 currency code.
     * </pre>
     *
     * <code>optional string currency_code = 3;</code>
     * @return Whether the currencyCode field is set.
     */
    public boolean hasCurrencyCode() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <pre>
     * Three-character ISO 4217 currency code.
     * </pre>
     *
     * <code>optional string currency_code = 3;</code>
     * @return The currencyCode.
     */
    public java.lang.String getCurrencyCode() {
      java.lang.Object ref = currencyCode_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        currencyCode_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Three-character ISO 4217 currency code.
     * </pre>
     *
     * <code>optional string currency_code = 3;</code>
     * @return The bytes for currencyCode.
     */
    public com.google.protobuf.ByteString
        getCurrencyCodeBytes() {
      java.lang.Object ref = currencyCode_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        currencyCode_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Three-character ISO 4217 currency code.
     * </pre>
     *
     * <code>optional string currency_code = 3;</code>
     * @param value The currencyCode to set.
     * @return This builder for chaining.
     */
    public Builder setCurrencyCode(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      currencyCode_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Three-character ISO 4217 currency code.
     * </pre>
     *
     * <code>optional string currency_code = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearCurrencyCode() {
      currencyCode_ = getDefaultInstance().getCurrencyCode();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Three-character ISO 4217 currency code.
     * </pre>
     *
     * <code>optional string currency_code = 3;</code>
     * @param value The bytes for currencyCode to set.
     * @return This builder for chaining.
     */
    public Builder setCurrencyCodeBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      currencyCode_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private long amountMicros_ ;
    /**
     * <pre>
     * Amount in micros. One million is equivalent to one unit.
     * </pre>
     *
     * <code>optional int64 amount_micros = 4;</code>
     * @return Whether the amountMicros field is set.
     */
    @java.lang.Override
    public boolean hasAmountMicros() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <pre>
     * Amount in micros. One million is equivalent to one unit.
     * </pre>
     *
     * <code>optional int64 amount_micros = 4;</code>
     * @return The amountMicros.
     */
    @java.lang.Override
    public long getAmountMicros() {
      return amountMicros_;
    }
    /**
     * <pre>
     * Amount in micros. One million is equivalent to one unit.
     * </pre>
     *
     * <code>optional int64 amount_micros = 4;</code>
     * @param value The amountMicros to set.
     * @return This builder for chaining.
     */
    public Builder setAmountMicros(long value) {

      amountMicros_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Amount in micros. One million is equivalent to one unit.
     * </pre>
     *
     * <code>optional int64 amount_micros = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearAmountMicros() {
      bitField0_ = (bitField0_ & ~0x00000002);
      amountMicros_ = 0L;
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


    // @@protoc_insertion_point(builder_scope:google.ads.googleads.v15.common.Money)
  }

  // @@protoc_insertion_point(class_scope:google.ads.googleads.v15.common.Money)
  private static final com.google.ads.googleads.v15.common.Money DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.ads.googleads.v15.common.Money();
  }

  public static com.google.ads.googleads.v15.common.Money getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Money>
      PARSER = new com.google.protobuf.AbstractParser<Money>() {
    @java.lang.Override
    public Money parsePartialFrom(
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

  public static com.google.protobuf.Parser<Money> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Money> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.ads.googleads.v15.common.Money getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

