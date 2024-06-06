// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v17/common/targeting_setting.proto

// Protobuf Java Version: 3.25.3
package com.google.ads.googleads.v17.common;

public interface TargetRestrictionOperationOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v17.common.TargetRestrictionOperation)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Type of list operation to perform.
   * </pre>
   *
   * <code>.google.ads.googleads.v17.common.TargetRestrictionOperation.Operator operator = 1;</code>
   * @return The enum numeric value on the wire for operator.
   */
  int getOperatorValue();
  /**
   * <pre>
   * Type of list operation to perform.
   * </pre>
   *
   * <code>.google.ads.googleads.v17.common.TargetRestrictionOperation.Operator operator = 1;</code>
   * @return The operator.
   */
  com.google.ads.googleads.v17.common.TargetRestrictionOperation.Operator getOperator();

  /**
   * <pre>
   * The target restriction being added to or removed from the list.
   * </pre>
   *
   * <code>.google.ads.googleads.v17.common.TargetRestriction value = 2;</code>
   * @return Whether the value field is set.
   */
  boolean hasValue();
  /**
   * <pre>
   * The target restriction being added to or removed from the list.
   * </pre>
   *
   * <code>.google.ads.googleads.v17.common.TargetRestriction value = 2;</code>
   * @return The value.
   */
  com.google.ads.googleads.v17.common.TargetRestriction getValue();
  /**
   * <pre>
   * The target restriction being added to or removed from the list.
   * </pre>
   *
   * <code>.google.ads.googleads.v17.common.TargetRestriction value = 2;</code>
   */
  com.google.ads.googleads.v17.common.TargetRestrictionOrBuilder getValueOrBuilder();
}
