// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v17/errors/user_list_customer_type_error.proto

// Protobuf Java Version: 3.25.3
package com.google.ads.googleads.v17.errors;

/**
 * <pre>
 * Container for enum describing possible user list customer type errors.
 * </pre>
 *
 * Protobuf type {@code google.ads.googleads.v17.errors.UserListCustomerTypeErrorEnum}
 */
public final class UserListCustomerTypeErrorEnum extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.ads.googleads.v17.errors.UserListCustomerTypeErrorEnum)
    UserListCustomerTypeErrorEnumOrBuilder {
private static final long serialVersionUID = 0L;
  // Use UserListCustomerTypeErrorEnum.newBuilder() to construct.
  private UserListCustomerTypeErrorEnum(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private UserListCustomerTypeErrorEnum() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new UserListCustomerTypeErrorEnum();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.ads.googleads.v17.errors.UserListCustomerTypeErrorProto.internal_static_google_ads_googleads_v17_errors_UserListCustomerTypeErrorEnum_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.ads.googleads.v17.errors.UserListCustomerTypeErrorProto.internal_static_google_ads_googleads_v17_errors_UserListCustomerTypeErrorEnum_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.ads.googleads.v17.errors.UserListCustomerTypeErrorEnum.class, com.google.ads.googleads.v17.errors.UserListCustomerTypeErrorEnum.Builder.class);
  }

  /**
   * <pre>
   * Enum describing possible user list customer type errors.
   * </pre>
   *
   * Protobuf enum {@code google.ads.googleads.v17.errors.UserListCustomerTypeErrorEnum.UserListCustomerTypeError}
   */
  public enum UserListCustomerTypeError
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <pre>
     * Enum unspecified.
     * </pre>
     *
     * <code>UNSPECIFIED = 0;</code>
     */
    UNSPECIFIED(0),
    /**
     * <pre>
     * The received error code is not known in this version.
     * </pre>
     *
     * <code>UNKNOWN = 1;</code>
     */
    UNKNOWN(1),
    /**
     * <pre>
     * Cannot add the conflicting customer types to the same user list.
     * Conflicting labels:
     * 1. Purchasers - Converted Leads
     * 2. Purchasers - Qualified Leads
     * 3. Purchasers - Cart Abandoners
     * 4. Qualified Leads - Converted Leads
     * 5. Disengaged customers - Converted Leads
     * 6. Disengaged customers - Qualified Leads
     * 7. Disengaged customers- Cart Abandoners
     * </pre>
     *
     * <code>CONFLICTING_CUSTOMER_TYPES = 2;</code>
     */
    CONFLICTING_CUSTOMER_TYPES(2),
    /**
     * <pre>
     * The account does not have access to the user list.
     * </pre>
     *
     * <code>NO_ACCESS_TO_USER_LIST = 3;</code>
     */
    NO_ACCESS_TO_USER_LIST(3),
    /**
     * <pre>
     * The given user list is not eligible for applying customer types.
     * The user list must belong to one of the following types: CRM_BASED,
     * RULE_BASED, ADVERTISER_DATA_MODEL_BASED, GCN.
     * </pre>
     *
     * <code>USERLIST_NOT_ELIGIBLE = 4;</code>
     */
    USERLIST_NOT_ELIGIBLE(4),
    /**
     * <pre>
     * To edit the user list customer type, conversion tracking must be
     * enabled in your account. If cross-tracking is enabled, your account must
     * be a MCC manager account to modify user list customer types. More info at
     * https://support.google.com/google-ads/answer/3030657
     * </pre>
     *
     * <code>CONVERSION_TRACKING_NOT_ENABLED_OR_NOT_MCC_MANAGER_ACCOUNT = 5;</code>
     */
    CONVERSION_TRACKING_NOT_ENABLED_OR_NOT_MCC_MANAGER_ACCOUNT(5),
    /**
     * <pre>
     * Too many user lists for the customer type.
     * </pre>
     *
     * <code>TOO_MANY_USER_LISTS_FOR_THE_CUSTOMER_TYPE = 6;</code>
     */
    TOO_MANY_USER_LISTS_FOR_THE_CUSTOMER_TYPE(6),
    UNRECOGNIZED(-1),
    ;

    /**
     * <pre>
     * Enum unspecified.
     * </pre>
     *
     * <code>UNSPECIFIED = 0;</code>
     */
    public static final int UNSPECIFIED_VALUE = 0;
    /**
     * <pre>
     * The received error code is not known in this version.
     * </pre>
     *
     * <code>UNKNOWN = 1;</code>
     */
    public static final int UNKNOWN_VALUE = 1;
    /**
     * <pre>
     * Cannot add the conflicting customer types to the same user list.
     * Conflicting labels:
     * 1. Purchasers - Converted Leads
     * 2. Purchasers - Qualified Leads
     * 3. Purchasers - Cart Abandoners
     * 4. Qualified Leads - Converted Leads
     * 5. Disengaged customers - Converted Leads
     * 6. Disengaged customers - Qualified Leads
     * 7. Disengaged customers- Cart Abandoners
     * </pre>
     *
     * <code>CONFLICTING_CUSTOMER_TYPES = 2;</code>
     */
    public static final int CONFLICTING_CUSTOMER_TYPES_VALUE = 2;
    /**
     * <pre>
     * The account does not have access to the user list.
     * </pre>
     *
     * <code>NO_ACCESS_TO_USER_LIST = 3;</code>
     */
    public static final int NO_ACCESS_TO_USER_LIST_VALUE = 3;
    /**
     * <pre>
     * The given user list is not eligible for applying customer types.
     * The user list must belong to one of the following types: CRM_BASED,
     * RULE_BASED, ADVERTISER_DATA_MODEL_BASED, GCN.
     * </pre>
     *
     * <code>USERLIST_NOT_ELIGIBLE = 4;</code>
     */
    public static final int USERLIST_NOT_ELIGIBLE_VALUE = 4;
    /**
     * <pre>
     * To edit the user list customer type, conversion tracking must be
     * enabled in your account. If cross-tracking is enabled, your account must
     * be a MCC manager account to modify user list customer types. More info at
     * https://support.google.com/google-ads/answer/3030657
     * </pre>
     *
     * <code>CONVERSION_TRACKING_NOT_ENABLED_OR_NOT_MCC_MANAGER_ACCOUNT = 5;</code>
     */
    public static final int CONVERSION_TRACKING_NOT_ENABLED_OR_NOT_MCC_MANAGER_ACCOUNT_VALUE = 5;
    /**
     * <pre>
     * Too many user lists for the customer type.
     * </pre>
     *
     * <code>TOO_MANY_USER_LISTS_FOR_THE_CUSTOMER_TYPE = 6;</code>
     */
    public static final int TOO_MANY_USER_LISTS_FOR_THE_CUSTOMER_TYPE_VALUE = 6;


    public final int getNumber() {
      if (this == UNRECOGNIZED) {
        throw new java.lang.IllegalArgumentException(
            "Can't get the number of an unknown enum value.");
      }
      return value;
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static UserListCustomerTypeError valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static UserListCustomerTypeError forNumber(int value) {
      switch (value) {
        case 0: return UNSPECIFIED;
        case 1: return UNKNOWN;
        case 2: return CONFLICTING_CUSTOMER_TYPES;
        case 3: return NO_ACCESS_TO_USER_LIST;
        case 4: return USERLIST_NOT_ELIGIBLE;
        case 5: return CONVERSION_TRACKING_NOT_ENABLED_OR_NOT_MCC_MANAGER_ACCOUNT;
        case 6: return TOO_MANY_USER_LISTS_FOR_THE_CUSTOMER_TYPE;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<UserListCustomerTypeError>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        UserListCustomerTypeError> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<UserListCustomerTypeError>() {
            public UserListCustomerTypeError findValueByNumber(int number) {
              return UserListCustomerTypeError.forNumber(number);
            }
          };

    public final com.google.protobuf.Descriptors.EnumValueDescriptor
        getValueDescriptor() {
      if (this == UNRECOGNIZED) {
        throw new java.lang.IllegalStateException(
            "Can't get the descriptor of an unrecognized enum value.");
      }
      return getDescriptor().getValues().get(ordinal());
    }
    public final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptorForType() {
      return getDescriptor();
    }
    public static final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptor() {
      return com.google.ads.googleads.v17.errors.UserListCustomerTypeErrorEnum.getDescriptor().getEnumTypes().get(0);
    }

    private static final UserListCustomerTypeError[] VALUES = values();

    public static UserListCustomerTypeError valueOf(
        com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
      if (desc.getType() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException(
          "EnumValueDescriptor is not for this type.");
      }
      if (desc.getIndex() == -1) {
        return UNRECOGNIZED;
      }
      return VALUES[desc.getIndex()];
    }

    private final int value;

    private UserListCustomerTypeError(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:google.ads.googleads.v17.errors.UserListCustomerTypeErrorEnum.UserListCustomerTypeError)
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
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    size += getUnknownFields().getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof com.google.ads.googleads.v17.errors.UserListCustomerTypeErrorEnum)) {
      return super.equals(obj);
    }
    com.google.ads.googleads.v17.errors.UserListCustomerTypeErrorEnum other = (com.google.ads.googleads.v17.errors.UserListCustomerTypeErrorEnum) obj;

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
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.ads.googleads.v17.errors.UserListCustomerTypeErrorEnum parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v17.errors.UserListCustomerTypeErrorEnum parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v17.errors.UserListCustomerTypeErrorEnum parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v17.errors.UserListCustomerTypeErrorEnum parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v17.errors.UserListCustomerTypeErrorEnum parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v17.errors.UserListCustomerTypeErrorEnum parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v17.errors.UserListCustomerTypeErrorEnum parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v17.errors.UserListCustomerTypeErrorEnum parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.google.ads.googleads.v17.errors.UserListCustomerTypeErrorEnum parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.ads.googleads.v17.errors.UserListCustomerTypeErrorEnum parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v17.errors.UserListCustomerTypeErrorEnum parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v17.errors.UserListCustomerTypeErrorEnum parseFrom(
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
  public static Builder newBuilder(com.google.ads.googleads.v17.errors.UserListCustomerTypeErrorEnum prototype) {
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
   * Container for enum describing possible user list customer type errors.
   * </pre>
   *
   * Protobuf type {@code google.ads.googleads.v17.errors.UserListCustomerTypeErrorEnum}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.ads.googleads.v17.errors.UserListCustomerTypeErrorEnum)
      com.google.ads.googleads.v17.errors.UserListCustomerTypeErrorEnumOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.ads.googleads.v17.errors.UserListCustomerTypeErrorProto.internal_static_google_ads_googleads_v17_errors_UserListCustomerTypeErrorEnum_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.ads.googleads.v17.errors.UserListCustomerTypeErrorProto.internal_static_google_ads_googleads_v17_errors_UserListCustomerTypeErrorEnum_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.ads.googleads.v17.errors.UserListCustomerTypeErrorEnum.class, com.google.ads.googleads.v17.errors.UserListCustomerTypeErrorEnum.Builder.class);
    }

    // Construct using com.google.ads.googleads.v17.errors.UserListCustomerTypeErrorEnum.newBuilder()
    private Builder() {

    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);

    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.ads.googleads.v17.errors.UserListCustomerTypeErrorProto.internal_static_google_ads_googleads_v17_errors_UserListCustomerTypeErrorEnum_descriptor;
    }

    @java.lang.Override
    public com.google.ads.googleads.v17.errors.UserListCustomerTypeErrorEnum getDefaultInstanceForType() {
      return com.google.ads.googleads.v17.errors.UserListCustomerTypeErrorEnum.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.ads.googleads.v17.errors.UserListCustomerTypeErrorEnum build() {
      com.google.ads.googleads.v17.errors.UserListCustomerTypeErrorEnum result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.ads.googleads.v17.errors.UserListCustomerTypeErrorEnum buildPartial() {
      com.google.ads.googleads.v17.errors.UserListCustomerTypeErrorEnum result = new com.google.ads.googleads.v17.errors.UserListCustomerTypeErrorEnum(this);
      onBuilt();
      return result;
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
      if (other instanceof com.google.ads.googleads.v17.errors.UserListCustomerTypeErrorEnum) {
        return mergeFrom((com.google.ads.googleads.v17.errors.UserListCustomerTypeErrorEnum)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.ads.googleads.v17.errors.UserListCustomerTypeErrorEnum other) {
      if (other == com.google.ads.googleads.v17.errors.UserListCustomerTypeErrorEnum.getDefaultInstance()) return this;
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


    // @@protoc_insertion_point(builder_scope:google.ads.googleads.v17.errors.UserListCustomerTypeErrorEnum)
  }

  // @@protoc_insertion_point(class_scope:google.ads.googleads.v17.errors.UserListCustomerTypeErrorEnum)
  private static final com.google.ads.googleads.v17.errors.UserListCustomerTypeErrorEnum DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.ads.googleads.v17.errors.UserListCustomerTypeErrorEnum();
  }

  public static com.google.ads.googleads.v17.errors.UserListCustomerTypeErrorEnum getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<UserListCustomerTypeErrorEnum>
      PARSER = new com.google.protobuf.AbstractParser<UserListCustomerTypeErrorEnum>() {
    @java.lang.Override
    public UserListCustomerTypeErrorEnum parsePartialFrom(
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

  public static com.google.protobuf.Parser<UserListCustomerTypeErrorEnum> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<UserListCustomerTypeErrorEnum> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.ads.googleads.v17.errors.UserListCustomerTypeErrorEnum getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

