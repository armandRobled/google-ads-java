// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v17/resources/qualifying_question.proto

// Protobuf Java Version: 3.25.3
package com.google.ads.googleads.v17.resources;

public interface QualifyingQuestionOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v17.resources.QualifyingQuestion)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Output only. The resource name of the qualifying question.
   *
   * 'qualifyingQuestions/{qualifyingQuestionId}'
   * </pre>
   *
   * <code>string resource_name = 1 [(.google.api.field_behavior) = OUTPUT_ONLY, (.google.api.resource_reference) = { ... }</code>
   * @return The resourceName.
   */
  java.lang.String getResourceName();
  /**
   * <pre>
   * Output only. The resource name of the qualifying question.
   *
   * 'qualifyingQuestions/{qualifyingQuestionId}'
   * </pre>
   *
   * <code>string resource_name = 1 [(.google.api.field_behavior) = OUTPUT_ONLY, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for resourceName.
   */
  com.google.protobuf.ByteString
      getResourceNameBytes();

  /**
   * <pre>
   * Output only. The id of the qualifying question.
   * </pre>
   *
   * <code>int64 qualifying_question_id = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The qualifyingQuestionId.
   */
  long getQualifyingQuestionId();

  /**
   * <pre>
   * Output only. The locale of the qualifying question.
   * </pre>
   *
   * <code>string locale = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The locale.
   */
  java.lang.String getLocale();
  /**
   * <pre>
   * Output only. The locale of the qualifying question.
   * </pre>
   *
   * <code>string locale = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The bytes for locale.
   */
  com.google.protobuf.ByteString
      getLocaleBytes();

  /**
   * <pre>
   * Output only. The qualifying question.
   * </pre>
   *
   * <code>string text = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The text.
   */
  java.lang.String getText();
  /**
   * <pre>
   * Output only. The qualifying question.
   * </pre>
   *
   * <code>string text = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The bytes for text.
   */
  com.google.protobuf.ByteString
      getTextBytes();
}
