// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v15/common/user_lists.proto

// Protobuf Java Version: 3.25.3
package com.google.ads.googleads.v15.common;

public interface UserListDateRuleItemInfoOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v15.common.UserListDateRuleItemInfo)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Date comparison operator.
   * This field is required and must be populated when creating new date
   * rule item.
   * </pre>
   *
   * <code>.google.ads.googleads.v15.enums.UserListDateRuleItemOperatorEnum.UserListDateRuleItemOperator operator = 1;</code>
   * @return The enum numeric value on the wire for operator.
   */
  int getOperatorValue();
  /**
   * <pre>
   * Date comparison operator.
   * This field is required and must be populated when creating new date
   * rule item.
   * </pre>
   *
   * <code>.google.ads.googleads.v15.enums.UserListDateRuleItemOperatorEnum.UserListDateRuleItemOperator operator = 1;</code>
   * @return The operator.
   */
  com.google.ads.googleads.v15.enums.UserListDateRuleItemOperatorEnum.UserListDateRuleItemOperator getOperator();

  /**
   * <pre>
   * String representing date value to be compared with the rule variable.
   * Supported date format is YYYY-MM-DD.
   * Times are reported in the customer's time zone.
   * </pre>
   *
   * <code>optional string value = 4;</code>
   * @return Whether the value field is set.
   */
  boolean hasValue();
  /**
   * <pre>
   * String representing date value to be compared with the rule variable.
   * Supported date format is YYYY-MM-DD.
   * Times are reported in the customer's time zone.
   * </pre>
   *
   * <code>optional string value = 4;</code>
   * @return The value.
   */
  java.lang.String getValue();
  /**
   * <pre>
   * String representing date value to be compared with the rule variable.
   * Supported date format is YYYY-MM-DD.
   * Times are reported in the customer's time zone.
   * </pre>
   *
   * <code>optional string value = 4;</code>
   * @return The bytes for value.
   */
  com.google.protobuf.ByteString
      getValueBytes();

  /**
   * <pre>
   * The relative date value of the right hand side denoted by number of days
   * offset from now. The value field will override this field when both are
   * present.
   * </pre>
   *
   * <code>optional int64 offset_in_days = 5;</code>
   * @return Whether the offsetInDays field is set.
   */
  boolean hasOffsetInDays();
  /**
   * <pre>
   * The relative date value of the right hand side denoted by number of days
   * offset from now. The value field will override this field when both are
   * present.
   * </pre>
   *
   * <code>optional int64 offset_in_days = 5;</code>
   * @return The offsetInDays.
   */
  long getOffsetInDays();
}
