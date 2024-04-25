// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v16/resources/local_services_lead_conversation.proto

// Protobuf Java Version: 3.25.3
package com.google.ads.googleads.v16.resources;

public interface PhoneCallDetailsOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v16.resources.PhoneCallDetails)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Output only. The duration (in milliseconds) of the phone call (end to end).
   * </pre>
   *
   * <code>int64 call_duration_millis = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The callDurationMillis.
   */
  long getCallDurationMillis();

  /**
   * <pre>
   * Output only. URL to the call recording audio file.
   * </pre>
   *
   * <code>string call_recording_url = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The callRecordingUrl.
   */
  java.lang.String getCallRecordingUrl();
  /**
   * <pre>
   * Output only. URL to the call recording audio file.
   * </pre>
   *
   * <code>string call_recording_url = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The bytes for callRecordingUrl.
   */
  com.google.protobuf.ByteString
      getCallRecordingUrlBytes();
}
