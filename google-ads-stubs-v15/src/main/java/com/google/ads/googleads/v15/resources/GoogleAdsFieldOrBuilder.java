// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v15/resources/google_ads_field.proto

// Protobuf Java Version: 3.25.3
package com.google.ads.googleads.v15.resources;

public interface GoogleAdsFieldOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v15.resources.GoogleAdsField)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Output only. The resource name of the artifact.
   * Artifact resource names have the form:
   *
   * `googleAdsFields/{name}`
   * </pre>
   *
   * <code>string resource_name = 1 [(.google.api.field_behavior) = OUTPUT_ONLY, (.google.api.resource_reference) = { ... }</code>
   * @return The resourceName.
   */
  java.lang.String getResourceName();
  /**
   * <pre>
   * Output only. The resource name of the artifact.
   * Artifact resource names have the form:
   *
   * `googleAdsFields/{name}`
   * </pre>
   *
   * <code>string resource_name = 1 [(.google.api.field_behavior) = OUTPUT_ONLY, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for resourceName.
   */
  com.google.protobuf.ByteString
      getResourceNameBytes();

  /**
   * <pre>
   * Output only. The name of the artifact.
   * </pre>
   *
   * <code>optional string name = 21 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return Whether the name field is set.
   */
  boolean hasName();
  /**
   * <pre>
   * Output only. The name of the artifact.
   * </pre>
   *
   * <code>optional string name = 21 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <pre>
   * Output only. The name of the artifact.
   * </pre>
   *
   * <code>optional string name = 21 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <pre>
   * Output only. The category of the artifact.
   * </pre>
   *
   * <code>.google.ads.googleads.v15.enums.GoogleAdsFieldCategoryEnum.GoogleAdsFieldCategory category = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The enum numeric value on the wire for category.
   */
  int getCategoryValue();
  /**
   * <pre>
   * Output only. The category of the artifact.
   * </pre>
   *
   * <code>.google.ads.googleads.v15.enums.GoogleAdsFieldCategoryEnum.GoogleAdsFieldCategory category = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The category.
   */
  com.google.ads.googleads.v15.enums.GoogleAdsFieldCategoryEnum.GoogleAdsFieldCategory getCategory();

  /**
   * <pre>
   * Output only. Whether the artifact can be used in a SELECT clause in search
   * queries.
   * </pre>
   *
   * <code>optional bool selectable = 22 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return Whether the selectable field is set.
   */
  boolean hasSelectable();
  /**
   * <pre>
   * Output only. Whether the artifact can be used in a SELECT clause in search
   * queries.
   * </pre>
   *
   * <code>optional bool selectable = 22 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The selectable.
   */
  boolean getSelectable();

  /**
   * <pre>
   * Output only. Whether the artifact can be used in a WHERE clause in search
   * queries.
   * </pre>
   *
   * <code>optional bool filterable = 23 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return Whether the filterable field is set.
   */
  boolean hasFilterable();
  /**
   * <pre>
   * Output only. Whether the artifact can be used in a WHERE clause in search
   * queries.
   * </pre>
   *
   * <code>optional bool filterable = 23 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The filterable.
   */
  boolean getFilterable();

  /**
   * <pre>
   * Output only. Whether the artifact can be used in a ORDER BY clause in
   * search queries.
   * </pre>
   *
   * <code>optional bool sortable = 24 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return Whether the sortable field is set.
   */
  boolean hasSortable();
  /**
   * <pre>
   * Output only. Whether the artifact can be used in a ORDER BY clause in
   * search queries.
   * </pre>
   *
   * <code>optional bool sortable = 24 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The sortable.
   */
  boolean getSortable();

  /**
   * <pre>
   * Output only. The names of all resources, segments, and metrics that are
   * selectable with the described artifact.
   * </pre>
   *
   * <code>repeated string selectable_with = 25 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return A list containing the selectableWith.
   */
  java.util.List<java.lang.String>
      getSelectableWithList();
  /**
   * <pre>
   * Output only. The names of all resources, segments, and metrics that are
   * selectable with the described artifact.
   * </pre>
   *
   * <code>repeated string selectable_with = 25 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The count of selectableWith.
   */
  int getSelectableWithCount();
  /**
   * <pre>
   * Output only. The names of all resources, segments, and metrics that are
   * selectable with the described artifact.
   * </pre>
   *
   * <code>repeated string selectable_with = 25 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @param index The index of the element to return.
   * @return The selectableWith at the given index.
   */
  java.lang.String getSelectableWith(int index);
  /**
   * <pre>
   * Output only. The names of all resources, segments, and metrics that are
   * selectable with the described artifact.
   * </pre>
   *
   * <code>repeated string selectable_with = 25 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @param index The index of the value to return.
   * @return The bytes of the selectableWith at the given index.
   */
  com.google.protobuf.ByteString
      getSelectableWithBytes(int index);

  /**
   * <pre>
   * Output only. The names of all resources that are selectable with the
   * described artifact. Fields from these resources do not segment metrics when
   * included in search queries.
   *
   * This field is only set for artifacts whose category is RESOURCE.
   * </pre>
   *
   * <code>repeated string attribute_resources = 26 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return A list containing the attributeResources.
   */
  java.util.List<java.lang.String>
      getAttributeResourcesList();
  /**
   * <pre>
   * Output only. The names of all resources that are selectable with the
   * described artifact. Fields from these resources do not segment metrics when
   * included in search queries.
   *
   * This field is only set for artifacts whose category is RESOURCE.
   * </pre>
   *
   * <code>repeated string attribute_resources = 26 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The count of attributeResources.
   */
  int getAttributeResourcesCount();
  /**
   * <pre>
   * Output only. The names of all resources that are selectable with the
   * described artifact. Fields from these resources do not segment metrics when
   * included in search queries.
   *
   * This field is only set for artifacts whose category is RESOURCE.
   * </pre>
   *
   * <code>repeated string attribute_resources = 26 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @param index The index of the element to return.
   * @return The attributeResources at the given index.
   */
  java.lang.String getAttributeResources(int index);
  /**
   * <pre>
   * Output only. The names of all resources that are selectable with the
   * described artifact. Fields from these resources do not segment metrics when
   * included in search queries.
   *
   * This field is only set for artifacts whose category is RESOURCE.
   * </pre>
   *
   * <code>repeated string attribute_resources = 26 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @param index The index of the value to return.
   * @return The bytes of the attributeResources at the given index.
   */
  com.google.protobuf.ByteString
      getAttributeResourcesBytes(int index);

  /**
   * <pre>
   * Output only. This field lists the names of all metrics that are selectable
   * with the described artifact when it is used in the FROM clause. It is only
   * set for artifacts whose category is RESOURCE.
   * </pre>
   *
   * <code>repeated string metrics = 27 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return A list containing the metrics.
   */
  java.util.List<java.lang.String>
      getMetricsList();
  /**
   * <pre>
   * Output only. This field lists the names of all metrics that are selectable
   * with the described artifact when it is used in the FROM clause. It is only
   * set for artifacts whose category is RESOURCE.
   * </pre>
   *
   * <code>repeated string metrics = 27 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The count of metrics.
   */
  int getMetricsCount();
  /**
   * <pre>
   * Output only. This field lists the names of all metrics that are selectable
   * with the described artifact when it is used in the FROM clause. It is only
   * set for artifacts whose category is RESOURCE.
   * </pre>
   *
   * <code>repeated string metrics = 27 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @param index The index of the element to return.
   * @return The metrics at the given index.
   */
  java.lang.String getMetrics(int index);
  /**
   * <pre>
   * Output only. This field lists the names of all metrics that are selectable
   * with the described artifact when it is used in the FROM clause. It is only
   * set for artifacts whose category is RESOURCE.
   * </pre>
   *
   * <code>repeated string metrics = 27 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @param index The index of the value to return.
   * @return The bytes of the metrics at the given index.
   */
  com.google.protobuf.ByteString
      getMetricsBytes(int index);

  /**
   * <pre>
   * Output only. This field lists the names of all artifacts, whether a segment
   * or another resource, that segment metrics when included in search queries
   * and when the described artifact is used in the FROM clause. It is only set
   * for artifacts whose category is RESOURCE.
   * </pre>
   *
   * <code>repeated string segments = 28 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return A list containing the segments.
   */
  java.util.List<java.lang.String>
      getSegmentsList();
  /**
   * <pre>
   * Output only. This field lists the names of all artifacts, whether a segment
   * or another resource, that segment metrics when included in search queries
   * and when the described artifact is used in the FROM clause. It is only set
   * for artifacts whose category is RESOURCE.
   * </pre>
   *
   * <code>repeated string segments = 28 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The count of segments.
   */
  int getSegmentsCount();
  /**
   * <pre>
   * Output only. This field lists the names of all artifacts, whether a segment
   * or another resource, that segment metrics when included in search queries
   * and when the described artifact is used in the FROM clause. It is only set
   * for artifacts whose category is RESOURCE.
   * </pre>
   *
   * <code>repeated string segments = 28 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @param index The index of the element to return.
   * @return The segments at the given index.
   */
  java.lang.String getSegments(int index);
  /**
   * <pre>
   * Output only. This field lists the names of all artifacts, whether a segment
   * or another resource, that segment metrics when included in search queries
   * and when the described artifact is used in the FROM clause. It is only set
   * for artifacts whose category is RESOURCE.
   * </pre>
   *
   * <code>repeated string segments = 28 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @param index The index of the value to return.
   * @return The bytes of the segments at the given index.
   */
  com.google.protobuf.ByteString
      getSegmentsBytes(int index);

  /**
   * <pre>
   * Output only. Values the artifact can assume if it is a field of type ENUM.
   *
   * This field is only set for artifacts of category SEGMENT or ATTRIBUTE.
   * </pre>
   *
   * <code>repeated string enum_values = 29 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return A list containing the enumValues.
   */
  java.util.List<java.lang.String>
      getEnumValuesList();
  /**
   * <pre>
   * Output only. Values the artifact can assume if it is a field of type ENUM.
   *
   * This field is only set for artifacts of category SEGMENT or ATTRIBUTE.
   * </pre>
   *
   * <code>repeated string enum_values = 29 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The count of enumValues.
   */
  int getEnumValuesCount();
  /**
   * <pre>
   * Output only. Values the artifact can assume if it is a field of type ENUM.
   *
   * This field is only set for artifacts of category SEGMENT or ATTRIBUTE.
   * </pre>
   *
   * <code>repeated string enum_values = 29 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @param index The index of the element to return.
   * @return The enumValues at the given index.
   */
  java.lang.String getEnumValues(int index);
  /**
   * <pre>
   * Output only. Values the artifact can assume if it is a field of type ENUM.
   *
   * This field is only set for artifacts of category SEGMENT or ATTRIBUTE.
   * </pre>
   *
   * <code>repeated string enum_values = 29 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @param index The index of the value to return.
   * @return The bytes of the enumValues at the given index.
   */
  com.google.protobuf.ByteString
      getEnumValuesBytes(int index);

  /**
   * <pre>
   * Output only. This field determines the operators that can be used with the
   * artifact in WHERE clauses.
   * </pre>
   *
   * <code>.google.ads.googleads.v15.enums.GoogleAdsFieldDataTypeEnum.GoogleAdsFieldDataType data_type = 12 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The enum numeric value on the wire for dataType.
   */
  int getDataTypeValue();
  /**
   * <pre>
   * Output only. This field determines the operators that can be used with the
   * artifact in WHERE clauses.
   * </pre>
   *
   * <code>.google.ads.googleads.v15.enums.GoogleAdsFieldDataTypeEnum.GoogleAdsFieldDataType data_type = 12 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The dataType.
   */
  com.google.ads.googleads.v15.enums.GoogleAdsFieldDataTypeEnum.GoogleAdsFieldDataType getDataType();

  /**
   * <pre>
   * Output only. The URL of proto describing the artifact's data type.
   * </pre>
   *
   * <code>optional string type_url = 30 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return Whether the typeUrl field is set.
   */
  boolean hasTypeUrl();
  /**
   * <pre>
   * Output only. The URL of proto describing the artifact's data type.
   * </pre>
   *
   * <code>optional string type_url = 30 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The typeUrl.
   */
  java.lang.String getTypeUrl();
  /**
   * <pre>
   * Output only. The URL of proto describing the artifact's data type.
   * </pre>
   *
   * <code>optional string type_url = 30 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The bytes for typeUrl.
   */
  com.google.protobuf.ByteString
      getTypeUrlBytes();

  /**
   * <pre>
   * Output only. Whether the field artifact is repeated.
   * </pre>
   *
   * <code>optional bool is_repeated = 31 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return Whether the isRepeated field is set.
   */
  boolean hasIsRepeated();
  /**
   * <pre>
   * Output only. Whether the field artifact is repeated.
   * </pre>
   *
   * <code>optional bool is_repeated = 31 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The isRepeated.
   */
  boolean getIsRepeated();
}
