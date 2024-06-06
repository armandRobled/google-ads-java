// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v17/services/audience_insights_service.proto

// Protobuf Java Version: 3.25.3
package com.google.ads.googleads.v17.services;

public interface GenerateSuggestedTargetingInsightsResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v17.services.GenerateSuggestedTargetingInsightsResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Suggested insights for targetable audiences.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v17.services.TargetingSuggestionMetrics suggestions = 1;</code>
   */
  java.util.List<com.google.ads.googleads.v17.services.TargetingSuggestionMetrics> 
      getSuggestionsList();
  /**
   * <pre>
   * Suggested insights for targetable audiences.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v17.services.TargetingSuggestionMetrics suggestions = 1;</code>
   */
  com.google.ads.googleads.v17.services.TargetingSuggestionMetrics getSuggestions(int index);
  /**
   * <pre>
   * Suggested insights for targetable audiences.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v17.services.TargetingSuggestionMetrics suggestions = 1;</code>
   */
  int getSuggestionsCount();
  /**
   * <pre>
   * Suggested insights for targetable audiences.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v17.services.TargetingSuggestionMetrics suggestions = 1;</code>
   */
  java.util.List<? extends com.google.ads.googleads.v17.services.TargetingSuggestionMetricsOrBuilder> 
      getSuggestionsOrBuilderList();
  /**
   * <pre>
   * Suggested insights for targetable audiences.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v17.services.TargetingSuggestionMetrics suggestions = 1;</code>
   */
  com.google.ads.googleads.v17.services.TargetingSuggestionMetricsOrBuilder getSuggestionsOrBuilder(
      int index);
}
