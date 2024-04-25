// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v15/common/keyword_plan_common.proto

// Protobuf Java Version: 3.25.3
package com.google.ads.googleads.v15.common;

public interface KeywordPlanAggregateMetricsOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v15.common.KeywordPlanAggregateMetrics)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The list of aggregate metrics to fetch data.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v15.enums.KeywordPlanAggregateMetricTypeEnum.KeywordPlanAggregateMetricType aggregate_metric_types = 1;</code>
   * @return A list containing the aggregateMetricTypes.
   */
  java.util.List<com.google.ads.googleads.v15.enums.KeywordPlanAggregateMetricTypeEnum.KeywordPlanAggregateMetricType> getAggregateMetricTypesList();
  /**
   * <pre>
   * The list of aggregate metrics to fetch data.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v15.enums.KeywordPlanAggregateMetricTypeEnum.KeywordPlanAggregateMetricType aggregate_metric_types = 1;</code>
   * @return The count of aggregateMetricTypes.
   */
  int getAggregateMetricTypesCount();
  /**
   * <pre>
   * The list of aggregate metrics to fetch data.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v15.enums.KeywordPlanAggregateMetricTypeEnum.KeywordPlanAggregateMetricType aggregate_metric_types = 1;</code>
   * @param index The index of the element to return.
   * @return The aggregateMetricTypes at the given index.
   */
  com.google.ads.googleads.v15.enums.KeywordPlanAggregateMetricTypeEnum.KeywordPlanAggregateMetricType getAggregateMetricTypes(int index);
  /**
   * <pre>
   * The list of aggregate metrics to fetch data.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v15.enums.KeywordPlanAggregateMetricTypeEnum.KeywordPlanAggregateMetricType aggregate_metric_types = 1;</code>
   * @return A list containing the enum numeric values on the wire for aggregateMetricTypes.
   */
  java.util.List<java.lang.Integer>
  getAggregateMetricTypesValueList();
  /**
   * <pre>
   * The list of aggregate metrics to fetch data.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v15.enums.KeywordPlanAggregateMetricTypeEnum.KeywordPlanAggregateMetricType aggregate_metric_types = 1;</code>
   * @param index The index of the value to return.
   * @return The enum numeric value on the wire of aggregateMetricTypes at the given index.
   */
  int getAggregateMetricTypesValue(int index);
}
