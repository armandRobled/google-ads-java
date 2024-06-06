// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v17/services/google_ads_service.proto

// Protobuf Java Version: 3.25.3
package com.google.ads.googleads.v17.services;

public interface SearchGoogleAdsStreamResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v17.services.SearchGoogleAdsStreamResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The list of rows that matched the query.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v17.services.GoogleAdsRow results = 1;</code>
   */
  java.util.List<com.google.ads.googleads.v17.services.GoogleAdsRow> 
      getResultsList();
  /**
   * <pre>
   * The list of rows that matched the query.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v17.services.GoogleAdsRow results = 1;</code>
   */
  com.google.ads.googleads.v17.services.GoogleAdsRow getResults(int index);
  /**
   * <pre>
   * The list of rows that matched the query.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v17.services.GoogleAdsRow results = 1;</code>
   */
  int getResultsCount();
  /**
   * <pre>
   * The list of rows that matched the query.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v17.services.GoogleAdsRow results = 1;</code>
   */
  java.util.List<? extends com.google.ads.googleads.v17.services.GoogleAdsRowOrBuilder> 
      getResultsOrBuilderList();
  /**
   * <pre>
   * The list of rows that matched the query.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v17.services.GoogleAdsRow results = 1;</code>
   */
  com.google.ads.googleads.v17.services.GoogleAdsRowOrBuilder getResultsOrBuilder(
      int index);

  /**
   * <pre>
   * FieldMask that represents what fields were requested by the user.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask field_mask = 2;</code>
   * @return Whether the fieldMask field is set.
   */
  boolean hasFieldMask();
  /**
   * <pre>
   * FieldMask that represents what fields were requested by the user.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask field_mask = 2;</code>
   * @return The fieldMask.
   */
  com.google.protobuf.FieldMask getFieldMask();
  /**
   * <pre>
   * FieldMask that represents what fields were requested by the user.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask field_mask = 2;</code>
   */
  com.google.protobuf.FieldMaskOrBuilder getFieldMaskOrBuilder();

  /**
   * <pre>
   * Summary row that contains summary of metrics in results.
   * Summary of metrics means aggregation of metrics across all results,
   * here aggregation could be sum, average, rate, etc.
   * </pre>
   *
   * <code>.google.ads.googleads.v17.services.GoogleAdsRow summary_row = 3;</code>
   * @return Whether the summaryRow field is set.
   */
  boolean hasSummaryRow();
  /**
   * <pre>
   * Summary row that contains summary of metrics in results.
   * Summary of metrics means aggregation of metrics across all results,
   * here aggregation could be sum, average, rate, etc.
   * </pre>
   *
   * <code>.google.ads.googleads.v17.services.GoogleAdsRow summary_row = 3;</code>
   * @return The summaryRow.
   */
  com.google.ads.googleads.v17.services.GoogleAdsRow getSummaryRow();
  /**
   * <pre>
   * Summary row that contains summary of metrics in results.
   * Summary of metrics means aggregation of metrics across all results,
   * here aggregation could be sum, average, rate, etc.
   * </pre>
   *
   * <code>.google.ads.googleads.v17.services.GoogleAdsRow summary_row = 3;</code>
   */
  com.google.ads.googleads.v17.services.GoogleAdsRowOrBuilder getSummaryRowOrBuilder();

  /**
   * <pre>
   * The unique id of the request that is used for debugging purposes.
   * </pre>
   *
   * <code>string request_id = 4;</code>
   * @return The requestId.
   */
  java.lang.String getRequestId();
  /**
   * <pre>
   * The unique id of the request that is used for debugging purposes.
   * </pre>
   *
   * <code>string request_id = 4;</code>
   * @return The bytes for requestId.
   */
  com.google.protobuf.ByteString
      getRequestIdBytes();

  /**
   * <pre>
   * The amount of resources consumed to serve the query.
   * query_resource_consumption for the Summary row and non-Summary responses
   * are returned separately in their respective rows.
   * query_resource_consumption for non-Summary responses is returned in the
   * final batch of results.
   * </pre>
   *
   * <code>int64 query_resource_consumption = 6;</code>
   * @return The queryResourceConsumption.
   */
  long getQueryResourceConsumption();
}
