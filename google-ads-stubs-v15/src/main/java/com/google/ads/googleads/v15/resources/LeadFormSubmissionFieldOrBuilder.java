// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v15/resources/lead_form_submission_data.proto

// Protobuf Java Version: 3.25.3
package com.google.ads.googleads.v15.resources;

public interface LeadFormSubmissionFieldOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v15.resources.LeadFormSubmissionField)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Output only. Field type for lead form fields.
   * </pre>
   *
   * <code>.google.ads.googleads.v15.enums.LeadFormFieldUserInputTypeEnum.LeadFormFieldUserInputType field_type = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The enum numeric value on the wire for fieldType.
   */
  int getFieldTypeValue();
  /**
   * <pre>
   * Output only. Field type for lead form fields.
   * </pre>
   *
   * <code>.google.ads.googleads.v15.enums.LeadFormFieldUserInputTypeEnum.LeadFormFieldUserInputType field_type = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The fieldType.
   */
  com.google.ads.googleads.v15.enums.LeadFormFieldUserInputTypeEnum.LeadFormFieldUserInputType getFieldType();

  /**
   * <pre>
   * Output only. Field value for lead form fields.
   * </pre>
   *
   * <code>string field_value = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The fieldValue.
   */
  java.lang.String getFieldValue();
  /**
   * <pre>
   * Output only. Field value for lead form fields.
   * </pre>
   *
   * <code>string field_value = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The bytes for fieldValue.
   */
  com.google.protobuf.ByteString
      getFieldValueBytes();
}
