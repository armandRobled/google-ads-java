// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v17/resources/shared_set.proto

// Protobuf Java Version: 3.25.3
package com.google.ads.googleads.v17.resources;

public interface SharedSetOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v17.resources.SharedSet)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Immutable. The resource name of the shared set.
   * Shared set resource names have the form:
   *
   * `customers/{customer_id}/sharedSets/{shared_set_id}`
   * </pre>
   *
   * <code>string resource_name = 1 [(.google.api.field_behavior) = IMMUTABLE, (.google.api.resource_reference) = { ... }</code>
   * @return The resourceName.
   */
  java.lang.String getResourceName();
  /**
   * <pre>
   * Immutable. The resource name of the shared set.
   * Shared set resource names have the form:
   *
   * `customers/{customer_id}/sharedSets/{shared_set_id}`
   * </pre>
   *
   * <code>string resource_name = 1 [(.google.api.field_behavior) = IMMUTABLE, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for resourceName.
   */
  com.google.protobuf.ByteString
      getResourceNameBytes();

  /**
   * <pre>
   * Output only. The ID of this shared set. Read only.
   * </pre>
   *
   * <code>optional int64 id = 8 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return Whether the id field is set.
   */
  boolean hasId();
  /**
   * <pre>
   * Output only. The ID of this shared set. Read only.
   * </pre>
   *
   * <code>optional int64 id = 8 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The id.
   */
  long getId();

  /**
   * <pre>
   * Immutable. The type of this shared set: each shared set holds only a single
   * kind of resource. Required. Immutable.
   * </pre>
   *
   * <code>.google.ads.googleads.v17.enums.SharedSetTypeEnum.SharedSetType type = 3 [(.google.api.field_behavior) = IMMUTABLE];</code>
   * @return The enum numeric value on the wire for type.
   */
  int getTypeValue();
  /**
   * <pre>
   * Immutable. The type of this shared set: each shared set holds only a single
   * kind of resource. Required. Immutable.
   * </pre>
   *
   * <code>.google.ads.googleads.v17.enums.SharedSetTypeEnum.SharedSetType type = 3 [(.google.api.field_behavior) = IMMUTABLE];</code>
   * @return The type.
   */
  com.google.ads.googleads.v17.enums.SharedSetTypeEnum.SharedSetType getType();

  /**
   * <pre>
   * The name of this shared set. Required.
   * Shared Sets must have names that are unique among active shared sets of
   * the same type.
   * The length of this string should be between 1 and 255 UTF-8 bytes,
   * inclusive.
   * </pre>
   *
   * <code>optional string name = 9;</code>
   * @return Whether the name field is set.
   */
  boolean hasName();
  /**
   * <pre>
   * The name of this shared set. Required.
   * Shared Sets must have names that are unique among active shared sets of
   * the same type.
   * The length of this string should be between 1 and 255 UTF-8 bytes,
   * inclusive.
   * </pre>
   *
   * <code>optional string name = 9;</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <pre>
   * The name of this shared set. Required.
   * Shared Sets must have names that are unique among active shared sets of
   * the same type.
   * The length of this string should be between 1 and 255 UTF-8 bytes,
   * inclusive.
   * </pre>
   *
   * <code>optional string name = 9;</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <pre>
   * Output only. The status of this shared set. Read only.
   * </pre>
   *
   * <code>.google.ads.googleads.v17.enums.SharedSetStatusEnum.SharedSetStatus status = 5 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The enum numeric value on the wire for status.
   */
  int getStatusValue();
  /**
   * <pre>
   * Output only. The status of this shared set. Read only.
   * </pre>
   *
   * <code>.google.ads.googleads.v17.enums.SharedSetStatusEnum.SharedSetStatus status = 5 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The status.
   */
  com.google.ads.googleads.v17.enums.SharedSetStatusEnum.SharedSetStatus getStatus();

  /**
   * <pre>
   * Output only. The number of shared criteria within this shared set. Read
   * only.
   * </pre>
   *
   * <code>optional int64 member_count = 10 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return Whether the memberCount field is set.
   */
  boolean hasMemberCount();
  /**
   * <pre>
   * Output only. The number of shared criteria within this shared set. Read
   * only.
   * </pre>
   *
   * <code>optional int64 member_count = 10 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The memberCount.
   */
  long getMemberCount();

  /**
   * <pre>
   * Output only. The number of campaigns associated with this shared set. Read
   * only.
   * </pre>
   *
   * <code>optional int64 reference_count = 11 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return Whether the referenceCount field is set.
   */
  boolean hasReferenceCount();
  /**
   * <pre>
   * Output only. The number of campaigns associated with this shared set. Read
   * only.
   * </pre>
   *
   * <code>optional int64 reference_count = 11 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The referenceCount.
   */
  long getReferenceCount();
}
