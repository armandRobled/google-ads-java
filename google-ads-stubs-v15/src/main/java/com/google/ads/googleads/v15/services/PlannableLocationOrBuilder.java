// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v15/services/reach_plan_service.proto

// Protobuf Java Version: 3.25.3
package com.google.ads.googleads.v15.services;

public interface PlannableLocationOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v15.services.PlannableLocation)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The location identifier.
   * </pre>
   *
   * <code>optional string id = 4;</code>
   * @return Whether the id field is set.
   */
  boolean hasId();
  /**
   * <pre>
   * The location identifier.
   * </pre>
   *
   * <code>optional string id = 4;</code>
   * @return The id.
   */
  java.lang.String getId();
  /**
   * <pre>
   * The location identifier.
   * </pre>
   *
   * <code>optional string id = 4;</code>
   * @return The bytes for id.
   */
  com.google.protobuf.ByteString
      getIdBytes();

  /**
   * <pre>
   * The unique location name in English.
   * </pre>
   *
   * <code>optional string name = 5;</code>
   * @return Whether the name field is set.
   */
  boolean hasName();
  /**
   * <pre>
   * The unique location name in English.
   * </pre>
   *
   * <code>optional string name = 5;</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <pre>
   * The unique location name in English.
   * </pre>
   *
   * <code>optional string name = 5;</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <pre>
   * The parent country (not present if location is a country).
   * If present, will always be a GeoTargetConstant ID. Additional information
   * such as country name is provided by
   * [ReachPlanService.ListPlannableLocations][google.ads.googleads.v15.services.ReachPlanService.ListPlannableLocations]
   * or GoogleAdsService.Search/SearchStream.
   * </pre>
   *
   * <code>optional int64 parent_country_id = 6;</code>
   * @return Whether the parentCountryId field is set.
   */
  boolean hasParentCountryId();
  /**
   * <pre>
   * The parent country (not present if location is a country).
   * If present, will always be a GeoTargetConstant ID. Additional information
   * such as country name is provided by
   * [ReachPlanService.ListPlannableLocations][google.ads.googleads.v15.services.ReachPlanService.ListPlannableLocations]
   * or GoogleAdsService.Search/SearchStream.
   * </pre>
   *
   * <code>optional int64 parent_country_id = 6;</code>
   * @return The parentCountryId.
   */
  long getParentCountryId();

  /**
   * <pre>
   * The ISO-3166-1 alpha-2 country code that is associated with the location.
   * </pre>
   *
   * <code>optional string country_code = 7;</code>
   * @return Whether the countryCode field is set.
   */
  boolean hasCountryCode();
  /**
   * <pre>
   * The ISO-3166-1 alpha-2 country code that is associated with the location.
   * </pre>
   *
   * <code>optional string country_code = 7;</code>
   * @return The countryCode.
   */
  java.lang.String getCountryCode();
  /**
   * <pre>
   * The ISO-3166-1 alpha-2 country code that is associated with the location.
   * </pre>
   *
   * <code>optional string country_code = 7;</code>
   * @return The bytes for countryCode.
   */
  com.google.protobuf.ByteString
      getCountryCodeBytes();

  /**
   * <pre>
   * The location's type. Location types correspond to target_type returned by
   * searching location type in GoogleAdsService.Search/SearchStream.
   * </pre>
   *
   * <code>optional string location_type = 8;</code>
   * @return Whether the locationType field is set.
   */
  boolean hasLocationType();
  /**
   * <pre>
   * The location's type. Location types correspond to target_type returned by
   * searching location type in GoogleAdsService.Search/SearchStream.
   * </pre>
   *
   * <code>optional string location_type = 8;</code>
   * @return The locationType.
   */
  java.lang.String getLocationType();
  /**
   * <pre>
   * The location's type. Location types correspond to target_type returned by
   * searching location type in GoogleAdsService.Search/SearchStream.
   * </pre>
   *
   * <code>optional string location_type = 8;</code>
   * @return The bytes for locationType.
   */
  com.google.protobuf.ByteString
      getLocationTypeBytes();
}
