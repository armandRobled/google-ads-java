// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v16/services/google_ads_service.proto

// Protobuf Java Version: 3.25.3
package com.google.ads.googleads.v16.services;

public interface SearchGoogleAdsRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v16.services.SearchGoogleAdsRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Required. The ID of the customer being queried.
   * </pre>
   *
   * <code>string customer_id = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The customerId.
   */
  java.lang.String getCustomerId();
  /**
   * <pre>
   * Required. The ID of the customer being queried.
   * </pre>
   *
   * <code>string customer_id = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The bytes for customerId.
   */
  com.google.protobuf.ByteString
      getCustomerIdBytes();

  /**
   * <pre>
   * Required. The query string.
   * </pre>
   *
   * <code>string query = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The query.
   */
  java.lang.String getQuery();
  /**
   * <pre>
   * Required. The query string.
   * </pre>
   *
   * <code>string query = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The bytes for query.
   */
  com.google.protobuf.ByteString
      getQueryBytes();

  /**
   * <pre>
   * Token of the page to retrieve. If not specified, the first
   * page of results will be returned. Use the value obtained from
   * `next_page_token` in the previous response in order to request
   * the next page of results.
   * </pre>
   *
   * <code>string page_token = 3;</code>
   * @return The pageToken.
   */
  java.lang.String getPageToken();
  /**
   * <pre>
   * Token of the page to retrieve. If not specified, the first
   * page of results will be returned. Use the value obtained from
   * `next_page_token` in the previous response in order to request
   * the next page of results.
   * </pre>
   *
   * <code>string page_token = 3;</code>
   * @return The bytes for pageToken.
   */
  com.google.protobuf.ByteString
      getPageTokenBytes();

  /**
   * <pre>
   * Number of elements to retrieve in a single page.
   * When too large a page is requested, the server may decide to
   * further limit the number of returned resources.
   * </pre>
   *
   * <code>int32 page_size = 4;</code>
   * @return The pageSize.
   */
  int getPageSize();

  /**
   * <pre>
   * If true, the request is validated but not executed.
   * </pre>
   *
   * <code>bool validate_only = 5;</code>
   * @return The validateOnly.
   */
  boolean getValidateOnly();

  /**
   * <pre>
   * If true, the total number of results that match the query ignoring the
   * LIMIT clause will be included in the response.
   * Default is false.
   * </pre>
   *
   * <code>bool return_total_results_count = 7;</code>
   * @return The returnTotalResultsCount.
   */
  boolean getReturnTotalResultsCount();

  /**
   * <pre>
   * Determines whether a summary row will be returned. By default, summary row
   * is not returned. If requested, the summary row will be sent in a response
   * by itself after all other query results are returned.
   * </pre>
   *
   * <code>.google.ads.googleads.v16.enums.SummaryRowSettingEnum.SummaryRowSetting summary_row_setting = 8;</code>
   * @return The enum numeric value on the wire for summaryRowSetting.
   */
  int getSummaryRowSettingValue();
  /**
   * <pre>
   * Determines whether a summary row will be returned. By default, summary row
   * is not returned. If requested, the summary row will be sent in a response
   * by itself after all other query results are returned.
   * </pre>
   *
   * <code>.google.ads.googleads.v16.enums.SummaryRowSettingEnum.SummaryRowSetting summary_row_setting = 8;</code>
   * @return The summaryRowSetting.
   */
  com.google.ads.googleads.v16.enums.SummaryRowSettingEnum.SummaryRowSetting getSummaryRowSetting();
}
