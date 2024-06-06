// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v17/common/criteria.proto

// Protobuf Java Version: 3.25.3
package com.google.ads.googleads.v17.common;

public interface MobileApplicationInfoOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v17.common.MobileApplicationInfo)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * A string that uniquely identifies a mobile application to Google Ads API.
   * The format of this string is "{platform}-{platform_native_id}", where
   * platform is "1" for iOS apps and "2" for Android apps, and where
   * platform_native_id is the mobile application identifier native to the
   * corresponding platform.
   * For iOS, this native identifier is the 9 digit string that appears at the
   * end of an App Store URL (for example, "476943146" for "Flood-It! 2" whose
   * App Store link is
   * "http://itunes.apple.com/us/app/flood-it!-2/id476943146"). For Android,
   * this native identifier is the application's package name (for example,
   * "com.labpixies.colordrips" for "Color Drips" given Google Play link
   * "https://play.google.com/store/apps/details?id=com.labpixies.colordrips").
   * A well formed app id for Google Ads API would thus be "1-476943146" for iOS
   * and "2-com.labpixies.colordrips" for Android.
   * This field is required and must be set in CREATE operations.
   * </pre>
   *
   * <code>optional string app_id = 4;</code>
   * @return Whether the appId field is set.
   */
  boolean hasAppId();
  /**
   * <pre>
   * A string that uniquely identifies a mobile application to Google Ads API.
   * The format of this string is "{platform}-{platform_native_id}", where
   * platform is "1" for iOS apps and "2" for Android apps, and where
   * platform_native_id is the mobile application identifier native to the
   * corresponding platform.
   * For iOS, this native identifier is the 9 digit string that appears at the
   * end of an App Store URL (for example, "476943146" for "Flood-It! 2" whose
   * App Store link is
   * "http://itunes.apple.com/us/app/flood-it!-2/id476943146"). For Android,
   * this native identifier is the application's package name (for example,
   * "com.labpixies.colordrips" for "Color Drips" given Google Play link
   * "https://play.google.com/store/apps/details?id=com.labpixies.colordrips").
   * A well formed app id for Google Ads API would thus be "1-476943146" for iOS
   * and "2-com.labpixies.colordrips" for Android.
   * This field is required and must be set in CREATE operations.
   * </pre>
   *
   * <code>optional string app_id = 4;</code>
   * @return The appId.
   */
  java.lang.String getAppId();
  /**
   * <pre>
   * A string that uniquely identifies a mobile application to Google Ads API.
   * The format of this string is "{platform}-{platform_native_id}", where
   * platform is "1" for iOS apps and "2" for Android apps, and where
   * platform_native_id is the mobile application identifier native to the
   * corresponding platform.
   * For iOS, this native identifier is the 9 digit string that appears at the
   * end of an App Store URL (for example, "476943146" for "Flood-It! 2" whose
   * App Store link is
   * "http://itunes.apple.com/us/app/flood-it!-2/id476943146"). For Android,
   * this native identifier is the application's package name (for example,
   * "com.labpixies.colordrips" for "Color Drips" given Google Play link
   * "https://play.google.com/store/apps/details?id=com.labpixies.colordrips").
   * A well formed app id for Google Ads API would thus be "1-476943146" for iOS
   * and "2-com.labpixies.colordrips" for Android.
   * This field is required and must be set in CREATE operations.
   * </pre>
   *
   * <code>optional string app_id = 4;</code>
   * @return The bytes for appId.
   */
  com.google.protobuf.ByteString
      getAppIdBytes();

  /**
   * <pre>
   * Name of this mobile application.
   * </pre>
   *
   * <code>optional string name = 5;</code>
   * @return Whether the name field is set.
   */
  boolean hasName();
  /**
   * <pre>
   * Name of this mobile application.
   * </pre>
   *
   * <code>optional string name = 5;</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <pre>
   * Name of this mobile application.
   * </pre>
   *
   * <code>optional string name = 5;</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();
}
