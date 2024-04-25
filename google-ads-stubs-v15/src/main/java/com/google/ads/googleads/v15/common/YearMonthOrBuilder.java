// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v15/common/dates.proto

// Protobuf Java Version: 3.25.3
package com.google.ads.googleads.v15.common;

public interface YearMonthOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v15.common.YearMonth)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The year (for example, 2020).
   * </pre>
   *
   * <code>int64 year = 1;</code>
   * @return The year.
   */
  long getYear();

  /**
   * <pre>
   * The month of the year. (for example, FEBRUARY).
   * </pre>
   *
   * <code>.google.ads.googleads.v15.enums.MonthOfYearEnum.MonthOfYear month = 2;</code>
   * @return The enum numeric value on the wire for month.
   */
  int getMonthValue();
  /**
   * <pre>
   * The month of the year. (for example, FEBRUARY).
   * </pre>
   *
   * <code>.google.ads.googleads.v15.enums.MonthOfYearEnum.MonthOfYear month = 2;</code>
   * @return The month.
   */
  com.google.ads.googleads.v15.enums.MonthOfYearEnum.MonthOfYear getMonth();
}
