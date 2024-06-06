// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v17/common/text_label.proto

// Protobuf Java Version: 3.25.3
package com.google.ads.googleads.v17.common;

public interface TextLabelOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v17.common.TextLabel)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Background color of the label in RGB format. This string must match the
   * regular expression '^&#92;#([a-fA-F0-9]{6}|[a-fA-F0-9]{3})$'.
   * Note: The background color may not be visible for manager accounts.
   * </pre>
   *
   * <code>optional string background_color = 3;</code>
   * @return Whether the backgroundColor field is set.
   */
  boolean hasBackgroundColor();
  /**
   * <pre>
   * Background color of the label in RGB format. This string must match the
   * regular expression '^&#92;#([a-fA-F0-9]{6}|[a-fA-F0-9]{3})$'.
   * Note: The background color may not be visible for manager accounts.
   * </pre>
   *
   * <code>optional string background_color = 3;</code>
   * @return The backgroundColor.
   */
  java.lang.String getBackgroundColor();
  /**
   * <pre>
   * Background color of the label in RGB format. This string must match the
   * regular expression '^&#92;#([a-fA-F0-9]{6}|[a-fA-F0-9]{3})$'.
   * Note: The background color may not be visible for manager accounts.
   * </pre>
   *
   * <code>optional string background_color = 3;</code>
   * @return The bytes for backgroundColor.
   */
  com.google.protobuf.ByteString
      getBackgroundColorBytes();

  /**
   * <pre>
   * A short description of the label. The length must be no more than 200
   * characters.
   * </pre>
   *
   * <code>optional string description = 4;</code>
   * @return Whether the description field is set.
   */
  boolean hasDescription();
  /**
   * <pre>
   * A short description of the label. The length must be no more than 200
   * characters.
   * </pre>
   *
   * <code>optional string description = 4;</code>
   * @return The description.
   */
  java.lang.String getDescription();
  /**
   * <pre>
   * A short description of the label. The length must be no more than 200
   * characters.
   * </pre>
   *
   * <code>optional string description = 4;</code>
   * @return The bytes for description.
   */
  com.google.protobuf.ByteString
      getDescriptionBytes();
}
