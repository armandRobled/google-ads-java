// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v15/errors/access_invitation_error.proto

// Protobuf Java Version: 3.25.3
package com.google.ads.googleads.v15.errors;

public final class AccessInvitationErrorProto {
  private AccessInvitationErrorProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v15_errors_AccessInvitationErrorEnum_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v15_errors_AccessInvitationErrorEnum_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n=google/ads/googleads/v15/errors/access" +
      "_invitation_error.proto\022\037google.ads.goog" +
      "leads.v15.errors\"\363\002\n\031AccessInvitationErr" +
      "orEnum\"\325\002\n\025AccessInvitationError\022\017\n\013UNSP" +
      "ECIFIED\020\000\022\013\n\007UNKNOWN\020\001\022\031\n\025INVALID_EMAIL_" +
      "ADDRESS\020\002\022$\n EMAIL_ADDRESS_ALREADY_HAS_A" +
      "CCESS\020\003\022\035\n\031INVALID_INVITATION_STATUS\020\004\022\'" +
      "\n#GOOGLE_CONSUMER_ACCOUNT_NOT_ALLOWED\020\005\022" +
      "\031\n\025INVALID_INVITATION_ID\020\006\0220\n,EMAIL_ADDR" +
      "ESS_ALREADY_HAS_PENDING_INVITATION\020\007\022&\n\"" +
      "PENDING_INVITATIONS_LIMIT_EXCEEDED\020\010\022 \n\034" +
      "EMAIL_DOMAIN_POLICY_VIOLATED\020\tB\372\001\n#com.g" +
      "oogle.ads.googleads.v15.errorsB\032AccessIn" +
      "vitationErrorProtoP\001ZEgoogle.golang.org/" +
      "genproto/googleapis/ads/googleads/v15/er" +
      "rors;errors\242\002\003GAA\252\002\037Google.Ads.GoogleAds" +
      ".V15.Errors\312\002\037Google\\Ads\\GoogleAds\\V15\\E" +
      "rrors\352\002#Google::Ads::GoogleAds::V15::Err" +
      "orsb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_google_ads_googleads_v15_errors_AccessInvitationErrorEnum_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v15_errors_AccessInvitationErrorEnum_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v15_errors_AccessInvitationErrorEnum_descriptor,
        new java.lang.String[] { });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
