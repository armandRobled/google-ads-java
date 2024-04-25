// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v15/common/feed_item_set_filter_type_infos.proto

// Protobuf Java Version: 3.25.3
package com.google.ads.googleads.v15.common;

public interface DynamicAffiliateLocationSetFilterOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v15.common.DynamicAffiliateLocationSetFilter)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Used to filter affiliate locations by chain ids. Only affiliate locations
   * that belong to the specified chain(s) will be added to the FeedItemSet.
   * </pre>
   *
   * <code>repeated int64 chain_ids = 1;</code>
   * @return A list containing the chainIds.
   */
  java.util.List<java.lang.Long> getChainIdsList();
  /**
   * <pre>
   * Used to filter affiliate locations by chain ids. Only affiliate locations
   * that belong to the specified chain(s) will be added to the FeedItemSet.
   * </pre>
   *
   * <code>repeated int64 chain_ids = 1;</code>
   * @return The count of chainIds.
   */
  int getChainIdsCount();
  /**
   * <pre>
   * Used to filter affiliate locations by chain ids. Only affiliate locations
   * that belong to the specified chain(s) will be added to the FeedItemSet.
   * </pre>
   *
   * <code>repeated int64 chain_ids = 1;</code>
   * @param index The index of the element to return.
   * @return The chainIds at the given index.
   */
  long getChainIds(int index);
}
