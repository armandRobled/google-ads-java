// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v15/services/google_ads_field_service.proto

// Protobuf Java Version: 3.25.3
package com.google.ads.googleads.v15.services;

public interface SearchGoogleAdsFieldsResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v15.services.SearchGoogleAdsFieldsResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The list of fields that matched the query.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v15.resources.GoogleAdsField results = 1;</code>
   */
  java.util.List<com.google.ads.googleads.v15.resources.GoogleAdsField> 
      getResultsList();
  /**
   * <pre>
   * The list of fields that matched the query.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v15.resources.GoogleAdsField results = 1;</code>
   */
  com.google.ads.googleads.v15.resources.GoogleAdsField getResults(int index);
  /**
   * <pre>
   * The list of fields that matched the query.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v15.resources.GoogleAdsField results = 1;</code>
   */
  int getResultsCount();
  /**
   * <pre>
   * The list of fields that matched the query.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v15.resources.GoogleAdsField results = 1;</code>
   */
  java.util.List<? extends com.google.ads.googleads.v15.resources.GoogleAdsFieldOrBuilder> 
      getResultsOrBuilderList();
  /**
   * <pre>
   * The list of fields that matched the query.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v15.resources.GoogleAdsField results = 1;</code>
   */
  com.google.ads.googleads.v15.resources.GoogleAdsFieldOrBuilder getResultsOrBuilder(
      int index);

  /**
   * <pre>
   * Pagination token used to retrieve the next page of results. Pass the
   * content of this string as the `page_token` attribute of the next request.
   * `next_page_token` is not returned for the last page.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   * @return The nextPageToken.
   */
  java.lang.String getNextPageToken();
  /**
   * <pre>
   * Pagination token used to retrieve the next page of results. Pass the
   * content of this string as the `page_token` attribute of the next request.
   * `next_page_token` is not returned for the last page.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   * @return The bytes for nextPageToken.
   */
  com.google.protobuf.ByteString
      getNextPageTokenBytes();

  /**
   * <pre>
   * Total number of results that match the query ignoring the LIMIT clause.
   * </pre>
   *
   * <code>int64 total_results_count = 3;</code>
   * @return The totalResultsCount.
   */
  long getTotalResultsCount();
}
