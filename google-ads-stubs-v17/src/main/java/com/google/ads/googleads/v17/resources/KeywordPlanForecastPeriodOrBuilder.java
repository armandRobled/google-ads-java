// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v17/resources/keyword_plan.proto

// Protobuf Java Version: 3.25.3
package com.google.ads.googleads.v17.resources;

public interface KeywordPlanForecastPeriodOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v17.resources.KeywordPlanForecastPeriod)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * A future date range relative to the current date used for forecasting.
   * </pre>
   *
   * <code>.google.ads.googleads.v17.enums.KeywordPlanForecastIntervalEnum.KeywordPlanForecastInterval date_interval = 1;</code>
   * @return Whether the dateInterval field is set.
   */
  boolean hasDateInterval();
  /**
   * <pre>
   * A future date range relative to the current date used for forecasting.
   * </pre>
   *
   * <code>.google.ads.googleads.v17.enums.KeywordPlanForecastIntervalEnum.KeywordPlanForecastInterval date_interval = 1;</code>
   * @return The enum numeric value on the wire for dateInterval.
   */
  int getDateIntervalValue();
  /**
   * <pre>
   * A future date range relative to the current date used for forecasting.
   * </pre>
   *
   * <code>.google.ads.googleads.v17.enums.KeywordPlanForecastIntervalEnum.KeywordPlanForecastInterval date_interval = 1;</code>
   * @return The dateInterval.
   */
  com.google.ads.googleads.v17.enums.KeywordPlanForecastIntervalEnum.KeywordPlanForecastInterval getDateInterval();

  /**
   * <pre>
   * The custom date range used for forecasting. It cannot be greater than
   * a year.
   * The start and end dates must be in the future. Otherwise, an error will
   * be returned when the forecasting action is performed.
   * The start and end dates are inclusive.
   * </pre>
   *
   * <code>.google.ads.googleads.v17.common.DateRange date_range = 2;</code>
   * @return Whether the dateRange field is set.
   */
  boolean hasDateRange();
  /**
   * <pre>
   * The custom date range used for forecasting. It cannot be greater than
   * a year.
   * The start and end dates must be in the future. Otherwise, an error will
   * be returned when the forecasting action is performed.
   * The start and end dates are inclusive.
   * </pre>
   *
   * <code>.google.ads.googleads.v17.common.DateRange date_range = 2;</code>
   * @return The dateRange.
   */
  com.google.ads.googleads.v17.common.DateRange getDateRange();
  /**
   * <pre>
   * The custom date range used for forecasting. It cannot be greater than
   * a year.
   * The start and end dates must be in the future. Otherwise, an error will
   * be returned when the forecasting action is performed.
   * The start and end dates are inclusive.
   * </pre>
   *
   * <code>.google.ads.googleads.v17.common.DateRange date_range = 2;</code>
   */
  com.google.ads.googleads.v17.common.DateRangeOrBuilder getDateRangeOrBuilder();

  com.google.ads.googleads.v17.resources.KeywordPlanForecastPeriod.IntervalCase getIntervalCase();
}
