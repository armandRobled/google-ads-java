// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v15/errors/url_field_error.proto

// Protobuf Java Version: 3.25.3
package com.google.ads.googleads.v15.errors;

public final class UrlFieldErrorProto {
  private UrlFieldErrorProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v15_errors_UrlFieldErrorEnum_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v15_errors_UrlFieldErrorEnum_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n5google/ads/googleads/v15/errors/url_fi" +
      "eld_error.proto\022\037google.ads.googleads.v1" +
      "5.errors\"\337\016\n\021UrlFieldErrorEnum\"\311\016\n\rUrlFi" +
      "eldError\022\017\n\013UNSPECIFIED\020\000\022\013\n\007UNKNOWN\020\001\022!" +
      "\n\035INVALID_TRACKING_URL_TEMPLATE\020\002\022(\n$INV" +
      "ALID_TAG_IN_TRACKING_URL_TEMPLATE\020\003\022%\n!M" +
      "ISSING_TRACKING_URL_TEMPLATE_TAG\020\004\022-\n)MI" +
      "SSING_PROTOCOL_IN_TRACKING_URL_TEMPLATE\020" +
      "\005\022-\n)INVALID_PROTOCOL_IN_TRACKING_URL_TE" +
      "MPLATE\020\006\022#\n\037MALFORMED_TRACKING_URL_TEMPL" +
      "ATE\020\007\022)\n%MISSING_HOST_IN_TRACKING_URL_TE" +
      "MPLATE\020\010\022(\n$INVALID_TLD_IN_TRACKING_URL_" +
      "TEMPLATE\020\t\022.\n*REDUNDANT_NESTED_TRACKING_" +
      "URL_TEMPLATE_TAG\020\n\022\025\n\021INVALID_FINAL_URL\020" +
      "\013\022\034\n\030INVALID_TAG_IN_FINAL_URL\020\014\022\"\n\036REDUN" +
      "DANT_NESTED_FINAL_URL_TAG\020\r\022!\n\035MISSING_P" +
      "ROTOCOL_IN_FINAL_URL\020\016\022!\n\035INVALID_PROTOC" +
      "OL_IN_FINAL_URL\020\017\022\027\n\023MALFORMED_FINAL_URL" +
      "\020\020\022\035\n\031MISSING_HOST_IN_FINAL_URL\020\021\022\034\n\030INV" +
      "ALID_TLD_IN_FINAL_URL\020\022\022\034\n\030INVALID_FINAL" +
      "_MOBILE_URL\020\023\022#\n\037INVALID_TAG_IN_FINAL_MO" +
      "BILE_URL\020\024\022)\n%REDUNDANT_NESTED_FINAL_MOB" +
      "ILE_URL_TAG\020\025\022(\n$MISSING_PROTOCOL_IN_FIN" +
      "AL_MOBILE_URL\020\026\022(\n$INVALID_PROTOCOL_IN_F" +
      "INAL_MOBILE_URL\020\027\022\036\n\032MALFORMED_FINAL_MOB" +
      "ILE_URL\020\030\022$\n MISSING_HOST_IN_FINAL_MOBIL" +
      "E_URL\020\031\022#\n\037INVALID_TLD_IN_FINAL_MOBILE_U" +
      "RL\020\032\022\031\n\025INVALID_FINAL_APP_URL\020\033\022 \n\034INVAL" +
      "ID_TAG_IN_FINAL_APP_URL\020\034\022&\n\"REDUNDANT_N" +
      "ESTED_FINAL_APP_URL_TAG\020\035\022 \n\034MULTIPLE_AP" +
      "P_URLS_FOR_OSTYPE\020\036\022\022\n\016INVALID_OSTYPE\020\037\022" +
      " \n\034INVALID_PROTOCOL_FOR_APP_URL\020 \022\"\n\036INV" +
      "ALID_PACKAGE_ID_FOR_APP_URL\020!\022-\n)URL_CUS" +
      "TOM_PARAMETERS_COUNT_EXCEEDS_LIMIT\020\"\0222\n." +
      "INVALID_CHARACTERS_IN_URL_CUSTOM_PARAMET" +
      "ER_KEY\020\'\0224\n0INVALID_CHARACTERS_IN_URL_CU" +
      "STOM_PARAMETER_VALUE\020(\022-\n)INVALID_TAG_IN" +
      "_URL_CUSTOM_PARAMETER_VALUE\020)\022-\n)REDUNDA" +
      "NT_NESTED_URL_CUSTOM_PARAMETER_TAG\020*\022\024\n\020" +
      "MISSING_PROTOCOL\020+\022\024\n\020INVALID_PROTOCOL\0204" +
      "\022\017\n\013INVALID_URL\020,\022\036\n\032DESTINATION_URL_DEP" +
      "RECATED\020-\022\026\n\022INVALID_TAG_IN_URL\020.\022\023\n\017MIS" +
      "SING_URL_TAG\020/\022\024\n\020DUPLICATE_URL_ID\0200\022\022\n\016" +
      "INVALID_URL_ID\0201\022\036\n\032FINAL_URL_SUFFIX_MAL" +
      "FORMED\0202\022#\n\037INVALID_TAG_IN_FINAL_URL_SUF" +
      "FIX\0203\022\034\n\030INVALID_TOP_LEVEL_DOMAIN\0205\022\036\n\032M" +
      "ALFORMED_TOP_LEVEL_DOMAIN\0206\022\021\n\rMALFORMED" +
      "_URL\0207\022\020\n\014MISSING_HOST\0208\022\037\n\033NULL_CUSTOM_" +
      "PARAMETER_VALUE\0209\022\'\n#VALUE_TRACK_PARAMET" +
      "ER_NOT_SUPPORTED\020:B\362\001\n#com.google.ads.go" +
      "ogleads.v15.errorsB\022UrlFieldErrorProtoP\001" +
      "ZEgoogle.golang.org/genproto/googleapis/" +
      "ads/googleads/v15/errors;errors\242\002\003GAA\252\002\037" +
      "Google.Ads.GoogleAds.V15.Errors\312\002\037Google" +
      "\\Ads\\GoogleAds\\V15\\Errors\352\002#Google::Ads:" +
      ":GoogleAds::V15::Errorsb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_google_ads_googleads_v15_errors_UrlFieldErrorEnum_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v15_errors_UrlFieldErrorEnum_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v15_errors_UrlFieldErrorEnum_descriptor,
        new java.lang.String[] { });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
