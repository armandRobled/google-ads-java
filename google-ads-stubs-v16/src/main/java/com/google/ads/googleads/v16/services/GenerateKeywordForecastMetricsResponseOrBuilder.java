// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v16/services/keyword_plan_idea_service.proto

// Protobuf Java Version: 3.25.3
package com.google.ads.googleads.v16.services;

public interface GenerateKeywordForecastMetricsResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v16.services.GenerateKeywordForecastMetricsResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Results of the campaign forecast.
   * </pre>
   *
   * <code>optional .google.ads.googleads.v16.services.KeywordForecastMetrics campaign_forecast_metrics = 1;</code>
   * @return Whether the campaignForecastMetrics field is set.
   */
  boolean hasCampaignForecastMetrics();
  /**
   * <pre>
   * Results of the campaign forecast.
   * </pre>
   *
   * <code>optional .google.ads.googleads.v16.services.KeywordForecastMetrics campaign_forecast_metrics = 1;</code>
   * @return The campaignForecastMetrics.
   */
  com.google.ads.googleads.v16.services.KeywordForecastMetrics getCampaignForecastMetrics();
  /**
   * <pre>
   * Results of the campaign forecast.
   * </pre>
   *
   * <code>optional .google.ads.googleads.v16.services.KeywordForecastMetrics campaign_forecast_metrics = 1;</code>
   */
  com.google.ads.googleads.v16.services.KeywordForecastMetricsOrBuilder getCampaignForecastMetricsOrBuilder();
}
