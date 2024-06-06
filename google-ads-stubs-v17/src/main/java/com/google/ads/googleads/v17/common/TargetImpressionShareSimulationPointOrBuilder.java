// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v17/common/simulation.proto

// Protobuf Java Version: 3.25.3
package com.google.ads.googleads.v17.common;

public interface TargetImpressionShareSimulationPointOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v17.common.TargetImpressionShareSimulationPoint)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The simulated target impression share value (in micros) upon which
   * projected metrics are based.
   * For example, 10% impression share, which is equal to 0.1, is stored as
   * 100_000. This value is validated and will not exceed 1M (100%).
   * </pre>
   *
   * <code>int64 target_impression_share_micros = 1;</code>
   * @return The targetImpressionShareMicros.
   */
  long getTargetImpressionShareMicros();

  /**
   * <pre>
   * Projected required daily cpc bid ceiling that the advertiser must set to
   * realize this simulation, in micros of the advertiser currency.
   * </pre>
   *
   * <code>int64 required_cpc_bid_ceiling_micros = 2;</code>
   * @return The requiredCpcBidCeilingMicros.
   */
  long getRequiredCpcBidCeilingMicros();

  /**
   * <pre>
   * Projected required daily budget that the advertiser must set in order to
   * receive the estimated traffic, in micros of advertiser currency.
   * </pre>
   *
   * <code>int64 required_budget_amount_micros = 3;</code>
   * @return The requiredBudgetAmountMicros.
   */
  long getRequiredBudgetAmountMicros();

  /**
   * <pre>
   * Projected number of biddable conversions.
   * </pre>
   *
   * <code>double biddable_conversions = 4;</code>
   * @return The biddableConversions.
   */
  double getBiddableConversions();

  /**
   * <pre>
   * Projected total value of biddable conversions.
   * </pre>
   *
   * <code>double biddable_conversions_value = 5;</code>
   * @return The biddableConversionsValue.
   */
  double getBiddableConversionsValue();

  /**
   * <pre>
   * Projected number of clicks.
   * </pre>
   *
   * <code>int64 clicks = 6;</code>
   * @return The clicks.
   */
  long getClicks();

  /**
   * <pre>
   * Projected cost in micros.
   * </pre>
   *
   * <code>int64 cost_micros = 7;</code>
   * @return The costMicros.
   */
  long getCostMicros();

  /**
   * <pre>
   * Projected number of impressions.
   * </pre>
   *
   * <code>int64 impressions = 8;</code>
   * @return The impressions.
   */
  long getImpressions();

  /**
   * <pre>
   * Projected number of top slot impressions.
   * Only search advertising channel type supports this field.
   * </pre>
   *
   * <code>int64 top_slot_impressions = 9;</code>
   * @return The topSlotImpressions.
   */
  long getTopSlotImpressions();

  /**
   * <pre>
   * Projected number of absolute top impressions.
   * Only search advertising channel type supports this field.
   * </pre>
   *
   * <code>int64 absolute_top_impressions = 10;</code>
   * @return The absoluteTopImpressions.
   */
  long getAbsoluteTopImpressions();
}
