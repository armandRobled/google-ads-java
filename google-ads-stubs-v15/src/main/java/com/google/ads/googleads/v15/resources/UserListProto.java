// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v15/resources/user_list.proto

// Protobuf Java Version: 3.25.3
package com.google.ads.googleads.v15.resources;

public final class UserListProto {
  private UserListProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v15_resources_UserList_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v15_resources_UserList_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n2google/ads/googleads/v15/resources/use" +
      "r_list.proto\022\"google.ads.googleads.v15.r" +
      "esources\0320google/ads/googleads/v15/commo" +
      "n/user_lists.proto\0322google/ads/googleads" +
      "/v15/enums/access_reason.proto\032<google/a" +
      "ds/googleads/v15/enums/user_list_access_" +
      "status.proto\032=google/ads/googleads/v15/e" +
      "nums/user_list_closing_reason.proto\032@goo" +
      "gle/ads/googleads/v15/enums/user_list_me" +
      "mbership_status.proto\0329google/ads/google" +
      "ads/v15/enums/user_list_size_range.proto" +
      "\0323google/ads/googleads/v15/enums/user_li" +
      "st_type.proto\032\037google/api/field_behavior" +
      ".proto\032\031google/api/resource.proto\"\267\017\n\010Us" +
      "erList\022@\n\rresource_name\030\001 \001(\tB)\340A\005\372A#\n!g" +
      "oogleads.googleapis.com/UserList\022\024\n\002id\030\031" +
      " \001(\003B\003\340A\003H\001\210\001\001\022\033\n\tread_only\030\032 \001(\010B\003\340A\003H\002" +
      "\210\001\001\022\021\n\004name\030\033 \001(\tH\003\210\001\001\022\030\n\013description\030\034 " +
      "\001(\tH\004\210\001\001\022p\n\021membership_status\030\006 \001(\0162U.go" +
      "ogle.ads.googleads.v15.enums.UserListMem" +
      "bershipStatusEnum.UserListMembershipStat" +
      "us\022\035\n\020integration_code\030\035 \001(\tH\005\210\001\001\022!\n\024mem" +
      "bership_life_span\030\036 \001(\003H\006\210\001\001\022\"\n\020size_for" +
      "_display\030\037 \001(\003B\003\340A\003H\007\210\001\001\022l\n\026size_range_f" +
      "or_display\030\n \001(\0162G.google.ads.googleads." +
      "v15.enums.UserListSizeRangeEnum.UserList" +
      "SizeRangeB\003\340A\003\022!\n\017size_for_search\030  \001(\003B" +
      "\003\340A\003H\010\210\001\001\022k\n\025size_range_for_search\030\014 \001(\016" +
      "2G.google.ads.googleads.v15.enums.UserLi" +
      "stSizeRangeEnum.UserListSizeRangeB\003\340A\003\022P" +
      "\n\004type\030\r \001(\0162=.google.ads.googleads.v15." +
      "enums.UserListTypeEnum.UserListTypeB\003\340A\003" +
      "\022g\n\016closing_reason\030\016 \001(\0162O.google.ads.go" +
      "ogleads.v15.enums.UserListClosingReasonE" +
      "num.UserListClosingReason\022Y\n\raccess_reas" +
      "on\030\017 \001(\0162=.google.ads.googleads.v15.enum" +
      "s.AccessReasonEnum.AccessReasonB\003\340A\003\022o\n\030" +
      "account_user_list_status\030\020 \001(\0162M.google." +
      "ads.googleads.v15.enums.UserListAccessSt" +
      "atusEnum.UserListAccessStatus\022 \n\023eligibl" +
      "e_for_search\030! \001(\010H\t\210\001\001\022&\n\024eligible_for_" +
      "display\030\" \001(\010B\003\340A\003H\n\210\001\001\022\'\n\025match_rate_pe" +
      "rcentage\030\030 \001(\005B\003\340A\003H\013\210\001\001\022T\n\023crm_based_us" +
      "er_list\030\023 \001(\01325.google.ads.googleads.v15" +
      ".common.CrmBasedUserListInfoH\000\022V\n\021simila" +
      "r_user_list\030\024 \001(\01324.google.ads.googleads" +
      ".v15.common.SimilarUserListInfoB\003\340A\003H\000\022V" +
      "\n\024rule_based_user_list\030\025 \001(\01326.google.ad" +
      "s.googleads.v15.common.RuleBasedUserList" +
      "InfoH\000\022Q\n\021logical_user_list\030\026 \001(\01324.goog" +
      "le.ads.googleads.v15.common.LogicalUserL" +
      "istInfoH\000\022M\n\017basic_user_list\030\027 \001(\01322.goo" +
      "gle.ads.googleads.v15.common.BasicUserLi" +
      "stInfoH\000\022Z\n\023lookalike_user_list\030$ \001(\01326." +
      "google.ads.googleads.v15.common.Lookalik" +
      "eUserListInfoB\003\340A\005H\000:X\352AU\n!googleads.goo" +
      "gleapis.com/UserList\0220customers/{custome" +
      "r_id}/userLists/{user_list_id}B\013\n\tuser_l" +
      "istB\005\n\003_idB\014\n\n_read_onlyB\007\n\005_nameB\016\n\014_de" +
      "scriptionB\023\n\021_integration_codeB\027\n\025_membe" +
      "rship_life_spanB\023\n\021_size_for_displayB\022\n\020" +
      "_size_for_searchB\026\n\024_eligible_for_search" +
      "B\027\n\025_eligible_for_displayB\030\n\026_match_rate" +
      "_percentageB\377\001\n&com.google.ads.googleads" +
      ".v15.resourcesB\rUserListProtoP\001ZKgoogle." +
      "golang.org/genproto/googleapis/ads/googl" +
      "eads/v15/resources;resources\242\002\003GAA\252\002\"Goo" +
      "gle.Ads.GoogleAds.V15.Resources\312\002\"Google" +
      "\\Ads\\GoogleAds\\V15\\Resources\352\002&Google::A" +
      "ds::GoogleAds::V15::Resourcesb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.ads.googleads.v15.common.UserListsProto.getDescriptor(),
          com.google.ads.googleads.v15.enums.AccessReasonProto.getDescriptor(),
          com.google.ads.googleads.v15.enums.UserListAccessStatusProto.getDescriptor(),
          com.google.ads.googleads.v15.enums.UserListClosingReasonProto.getDescriptor(),
          com.google.ads.googleads.v15.enums.UserListMembershipStatusProto.getDescriptor(),
          com.google.ads.googleads.v15.enums.UserListSizeRangeProto.getDescriptor(),
          com.google.ads.googleads.v15.enums.UserListTypeProto.getDescriptor(),
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.api.ResourceProto.getDescriptor(),
        });
    internal_static_google_ads_googleads_v15_resources_UserList_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v15_resources_UserList_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v15_resources_UserList_descriptor,
        new java.lang.String[] { "ResourceName", "Id", "ReadOnly", "Name", "Description", "MembershipStatus", "IntegrationCode", "MembershipLifeSpan", "SizeForDisplay", "SizeRangeForDisplay", "SizeForSearch", "SizeRangeForSearch", "Type", "ClosingReason", "AccessReason", "AccountUserListStatus", "EligibleForSearch", "EligibleForDisplay", "MatchRatePercentage", "CrmBasedUserList", "SimilarUserList", "RuleBasedUserList", "LogicalUserList", "BasicUserList", "LookalikeUserList", "UserList", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.ResourceProto.resource);
    registry.add(com.google.api.ResourceProto.resourceReference);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.ads.googleads.v15.common.UserListsProto.getDescriptor();
    com.google.ads.googleads.v15.enums.AccessReasonProto.getDescriptor();
    com.google.ads.googleads.v15.enums.UserListAccessStatusProto.getDescriptor();
    com.google.ads.googleads.v15.enums.UserListClosingReasonProto.getDescriptor();
    com.google.ads.googleads.v15.enums.UserListMembershipStatusProto.getDescriptor();
    com.google.ads.googleads.v15.enums.UserListSizeRangeProto.getDescriptor();
    com.google.ads.googleads.v15.enums.UserListTypeProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
