// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v15/services/reach_plan_service.proto

// Protobuf Java Version: 3.25.3
package com.google.ads.googleads.v15.services;

public interface GenerateReachForecastResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v15.services.GenerateReachForecastResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Reference on target audiences for this curve.
   * </pre>
   *
   * <code>.google.ads.googleads.v15.services.OnTargetAudienceMetrics on_target_audience_metrics = 1;</code>
   * @return Whether the onTargetAudienceMetrics field is set.
   */
  boolean hasOnTargetAudienceMetrics();
  /**
   * <pre>
   * Reference on target audiences for this curve.
   * </pre>
   *
   * <code>.google.ads.googleads.v15.services.OnTargetAudienceMetrics on_target_audience_metrics = 1;</code>
   * @return The onTargetAudienceMetrics.
   */
  com.google.ads.googleads.v15.services.OnTargetAudienceMetrics getOnTargetAudienceMetrics();
  /**
   * <pre>
   * Reference on target audiences for this curve.
   * </pre>
   *
   * <code>.google.ads.googleads.v15.services.OnTargetAudienceMetrics on_target_audience_metrics = 1;</code>
   */
  com.google.ads.googleads.v15.services.OnTargetAudienceMetricsOrBuilder getOnTargetAudienceMetricsOrBuilder();

  /**
   * <pre>
   * The generated reach curve for the planned product mix.
   * </pre>
   *
   * <code>.google.ads.googleads.v15.services.ReachCurve reach_curve = 2;</code>
   * @return Whether the reachCurve field is set.
   */
  boolean hasReachCurve();
  /**
   * <pre>
   * The generated reach curve for the planned product mix.
   * </pre>
   *
   * <code>.google.ads.googleads.v15.services.ReachCurve reach_curve = 2;</code>
   * @return The reachCurve.
   */
  com.google.ads.googleads.v15.services.ReachCurve getReachCurve();
  /**
   * <pre>
   * The generated reach curve for the planned product mix.
   * </pre>
   *
   * <code>.google.ads.googleads.v15.services.ReachCurve reach_curve = 2;</code>
   */
  com.google.ads.googleads.v15.services.ReachCurveOrBuilder getReachCurveOrBuilder();
}
