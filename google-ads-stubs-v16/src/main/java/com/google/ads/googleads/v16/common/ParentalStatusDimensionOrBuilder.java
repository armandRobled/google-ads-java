// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v16/common/audiences.proto

// Protobuf Java Version: 3.25.3
package com.google.ads.googleads.v16.common;

public interface ParentalStatusDimensionOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v16.common.ParentalStatusDimension)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Included parental status demographic segments.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v16.enums.ParentalStatusTypeEnum.ParentalStatusType parental_statuses = 1;</code>
   * @return A list containing the parentalStatuses.
   */
  java.util.List<com.google.ads.googleads.v16.enums.ParentalStatusTypeEnum.ParentalStatusType> getParentalStatusesList();
  /**
   * <pre>
   * Included parental status demographic segments.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v16.enums.ParentalStatusTypeEnum.ParentalStatusType parental_statuses = 1;</code>
   * @return The count of parentalStatuses.
   */
  int getParentalStatusesCount();
  /**
   * <pre>
   * Included parental status demographic segments.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v16.enums.ParentalStatusTypeEnum.ParentalStatusType parental_statuses = 1;</code>
   * @param index The index of the element to return.
   * @return The parentalStatuses at the given index.
   */
  com.google.ads.googleads.v16.enums.ParentalStatusTypeEnum.ParentalStatusType getParentalStatuses(int index);
  /**
   * <pre>
   * Included parental status demographic segments.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v16.enums.ParentalStatusTypeEnum.ParentalStatusType parental_statuses = 1;</code>
   * @return A list containing the enum numeric values on the wire for parentalStatuses.
   */
  java.util.List<java.lang.Integer>
  getParentalStatusesValueList();
  /**
   * <pre>
   * Included parental status demographic segments.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v16.enums.ParentalStatusTypeEnum.ParentalStatusType parental_statuses = 1;</code>
   * @param index The index of the value to return.
   * @return The enum numeric value on the wire of parentalStatuses at the given index.
   */
  int getParentalStatusesValue(int index);

  /**
   * <pre>
   * Include users whose parental status is undetermined.
   * </pre>
   *
   * <code>optional bool include_undetermined = 2;</code>
   * @return Whether the includeUndetermined field is set.
   */
  boolean hasIncludeUndetermined();
  /**
   * <pre>
   * Include users whose parental status is undetermined.
   * </pre>
   *
   * <code>optional bool include_undetermined = 2;</code>
   * @return The includeUndetermined.
   */
  boolean getIncludeUndetermined();
}
