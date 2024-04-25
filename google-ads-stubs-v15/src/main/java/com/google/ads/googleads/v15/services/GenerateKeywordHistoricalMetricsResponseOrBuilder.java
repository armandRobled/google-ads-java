// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v15/services/keyword_plan_idea_service.proto

// Protobuf Java Version: 3.25.3
package com.google.ads.googleads.v15.services;

public interface GenerateKeywordHistoricalMetricsResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v15.services.GenerateKeywordHistoricalMetricsResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * List of keywords and their historical metrics.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v15.services.GenerateKeywordHistoricalMetricsResult results = 1;</code>
   */
  java.util.List<com.google.ads.googleads.v15.services.GenerateKeywordHistoricalMetricsResult> 
      getResultsList();
  /**
   * <pre>
   * List of keywords and their historical metrics.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v15.services.GenerateKeywordHistoricalMetricsResult results = 1;</code>
   */
  com.google.ads.googleads.v15.services.GenerateKeywordHistoricalMetricsResult getResults(int index);
  /**
   * <pre>
   * List of keywords and their historical metrics.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v15.services.GenerateKeywordHistoricalMetricsResult results = 1;</code>
   */
  int getResultsCount();
  /**
   * <pre>
   * List of keywords and their historical metrics.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v15.services.GenerateKeywordHistoricalMetricsResult results = 1;</code>
   */
  java.util.List<? extends com.google.ads.googleads.v15.services.GenerateKeywordHistoricalMetricsResultOrBuilder> 
      getResultsOrBuilderList();
  /**
   * <pre>
   * List of keywords and their historical metrics.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v15.services.GenerateKeywordHistoricalMetricsResult results = 1;</code>
   */
  com.google.ads.googleads.v15.services.GenerateKeywordHistoricalMetricsResultOrBuilder getResultsOrBuilder(
      int index);

  /**
   * <pre>
   * The aggregate metrics for all keywords.
   * </pre>
   *
   * <code>.google.ads.googleads.v15.common.KeywordPlanAggregateMetricResults aggregate_metric_results = 2;</code>
   * @return Whether the aggregateMetricResults field is set.
   */
  boolean hasAggregateMetricResults();
  /**
   * <pre>
   * The aggregate metrics for all keywords.
   * </pre>
   *
   * <code>.google.ads.googleads.v15.common.KeywordPlanAggregateMetricResults aggregate_metric_results = 2;</code>
   * @return The aggregateMetricResults.
   */
  com.google.ads.googleads.v15.common.KeywordPlanAggregateMetricResults getAggregateMetricResults();
  /**
   * <pre>
   * The aggregate metrics for all keywords.
   * </pre>
   *
   * <code>.google.ads.googleads.v15.common.KeywordPlanAggregateMetricResults aggregate_metric_results = 2;</code>
   */
  com.google.ads.googleads.v15.common.KeywordPlanAggregateMetricResultsOrBuilder getAggregateMetricResultsOrBuilder();
}
