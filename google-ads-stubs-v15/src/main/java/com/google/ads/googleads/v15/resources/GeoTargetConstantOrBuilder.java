// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v15/resources/geo_target_constant.proto

// Protobuf Java Version: 3.25.3
package com.google.ads.googleads.v15.resources;

public interface GeoTargetConstantOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v15.resources.GeoTargetConstant)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Output only. The resource name of the geo target constant.
   * Geo target constant resource names have the form:
   *
   * `geoTargetConstants/{geo_target_constant_id}`
   * </pre>
   *
   * <code>string resource_name = 1 [(.google.api.field_behavior) = OUTPUT_ONLY, (.google.api.resource_reference) = { ... }</code>
   * @return The resourceName.
   */
  java.lang.String getResourceName();
  /**
   * <pre>
   * Output only. The resource name of the geo target constant.
   * Geo target constant resource names have the form:
   *
   * `geoTargetConstants/{geo_target_constant_id}`
   * </pre>
   *
   * <code>string resource_name = 1 [(.google.api.field_behavior) = OUTPUT_ONLY, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for resourceName.
   */
  com.google.protobuf.ByteString
      getResourceNameBytes();

  /**
   * <pre>
   * Output only. The ID of the geo target constant.
   * </pre>
   *
   * <code>optional int64 id = 10 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return Whether the id field is set.
   */
  boolean hasId();
  /**
   * <pre>
   * Output only. The ID of the geo target constant.
   * </pre>
   *
   * <code>optional int64 id = 10 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The id.
   */
  long getId();

  /**
   * <pre>
   * Output only. Geo target constant English name.
   * </pre>
   *
   * <code>optional string name = 11 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return Whether the name field is set.
   */
  boolean hasName();
  /**
   * <pre>
   * Output only. Geo target constant English name.
   * </pre>
   *
   * <code>optional string name = 11 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <pre>
   * Output only. Geo target constant English name.
   * </pre>
   *
   * <code>optional string name = 11 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <pre>
   * Output only. The ISO-3166-1 alpha-2 country code that is associated with
   * the target.
   * </pre>
   *
   * <code>optional string country_code = 12 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return Whether the countryCode field is set.
   */
  boolean hasCountryCode();
  /**
   * <pre>
   * Output only. The ISO-3166-1 alpha-2 country code that is associated with
   * the target.
   * </pre>
   *
   * <code>optional string country_code = 12 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The countryCode.
   */
  java.lang.String getCountryCode();
  /**
   * <pre>
   * Output only. The ISO-3166-1 alpha-2 country code that is associated with
   * the target.
   * </pre>
   *
   * <code>optional string country_code = 12 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The bytes for countryCode.
   */
  com.google.protobuf.ByteString
      getCountryCodeBytes();

  /**
   * <pre>
   * Output only. Geo target constant target type.
   * </pre>
   *
   * <code>optional string target_type = 13 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return Whether the targetType field is set.
   */
  boolean hasTargetType();
  /**
   * <pre>
   * Output only. Geo target constant target type.
   * </pre>
   *
   * <code>optional string target_type = 13 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The targetType.
   */
  java.lang.String getTargetType();
  /**
   * <pre>
   * Output only. Geo target constant target type.
   * </pre>
   *
   * <code>optional string target_type = 13 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The bytes for targetType.
   */
  com.google.protobuf.ByteString
      getTargetTypeBytes();

  /**
   * <pre>
   * Output only. Geo target constant status.
   * </pre>
   *
   * <code>.google.ads.googleads.v15.enums.GeoTargetConstantStatusEnum.GeoTargetConstantStatus status = 7 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The enum numeric value on the wire for status.
   */
  int getStatusValue();
  /**
   * <pre>
   * Output only. Geo target constant status.
   * </pre>
   *
   * <code>.google.ads.googleads.v15.enums.GeoTargetConstantStatusEnum.GeoTargetConstantStatus status = 7 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The status.
   */
  com.google.ads.googleads.v15.enums.GeoTargetConstantStatusEnum.GeoTargetConstantStatus getStatus();

  /**
   * <pre>
   * Output only. The fully qualified English name, consisting of the target's
   * name and that of its parent and country.
   * </pre>
   *
   * <code>optional string canonical_name = 14 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return Whether the canonicalName field is set.
   */
  boolean hasCanonicalName();
  /**
   * <pre>
   * Output only. The fully qualified English name, consisting of the target's
   * name and that of its parent and country.
   * </pre>
   *
   * <code>optional string canonical_name = 14 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The canonicalName.
   */
  java.lang.String getCanonicalName();
  /**
   * <pre>
   * Output only. The fully qualified English name, consisting of the target's
   * name and that of its parent and country.
   * </pre>
   *
   * <code>optional string canonical_name = 14 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The bytes for canonicalName.
   */
  com.google.protobuf.ByteString
      getCanonicalNameBytes();

  /**
   * <pre>
   * Output only. The resource name of the parent geo target constant.
   * Geo target constant resource names have the form:
   *
   * `geoTargetConstants/{parent_geo_target_constant_id}`
   * </pre>
   *
   * <code>optional string parent_geo_target = 9 [(.google.api.field_behavior) = OUTPUT_ONLY, (.google.api.resource_reference) = { ... }</code>
   * @return Whether the parentGeoTarget field is set.
   */
  boolean hasParentGeoTarget();
  /**
   * <pre>
   * Output only. The resource name of the parent geo target constant.
   * Geo target constant resource names have the form:
   *
   * `geoTargetConstants/{parent_geo_target_constant_id}`
   * </pre>
   *
   * <code>optional string parent_geo_target = 9 [(.google.api.field_behavior) = OUTPUT_ONLY, (.google.api.resource_reference) = { ... }</code>
   * @return The parentGeoTarget.
   */
  java.lang.String getParentGeoTarget();
  /**
   * <pre>
   * Output only. The resource name of the parent geo target constant.
   * Geo target constant resource names have the form:
   *
   * `geoTargetConstants/{parent_geo_target_constant_id}`
   * </pre>
   *
   * <code>optional string parent_geo_target = 9 [(.google.api.field_behavior) = OUTPUT_ONLY, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for parentGeoTarget.
   */
  com.google.protobuf.ByteString
      getParentGeoTargetBytes();
}
