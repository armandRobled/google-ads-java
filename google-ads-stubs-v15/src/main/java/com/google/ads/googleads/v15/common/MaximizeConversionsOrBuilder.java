// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v15/common/bidding.proto

// Protobuf Java Version: 3.25.3
package com.google.ads.googleads.v15.common;

public interface MaximizeConversionsOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v15.common.MaximizeConversions)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Maximum bid limit that can be set by the bid strategy.
   * The limit applies to all keywords managed by the strategy.
   * Mutable for portfolio bidding strategies only.
   * </pre>
   *
   * <code>int64 cpc_bid_ceiling_micros = 2;</code>
   * @return The cpcBidCeilingMicros.
   */
  long getCpcBidCeilingMicros();

  /**
   * <pre>
   * Minimum bid limit that can be set by the bid strategy.
   * The limit applies to all keywords managed by the strategy.
   * Mutable for portfolio bidding strategies only.
   * </pre>
   *
   * <code>int64 cpc_bid_floor_micros = 3;</code>
   * @return The cpcBidFloorMicros.
   */
  long getCpcBidFloorMicros();

  /**
   * <pre>
   * The target cost-per-action (CPA) option. This is the average amount that
   * you would like to spend per conversion action specified in micro units of
   * the bidding strategy's currency. If set, the bid strategy will get as many
   * conversions as possible at or below the target cost-per-action. If the
   * target CPA is not set, the bid strategy will aim to achieve the lowest
   * possible CPA given the budget.
   * </pre>
   *
   * <code>int64 target_cpa_micros = 4;</code>
   * @return The targetCpaMicros.
   */
  long getTargetCpaMicros();
}
