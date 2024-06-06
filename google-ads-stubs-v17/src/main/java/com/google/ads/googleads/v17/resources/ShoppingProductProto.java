// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v17/resources/shopping_product.proto

// Protobuf Java Version: 3.25.3
package com.google.ads.googleads.v17.resources;

public final class ShoppingProductProto {
  private ShoppingProductProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v17_resources_ShoppingProduct_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v17_resources_ShoppingProduct_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v17_resources_ShoppingProduct_ProductIssue_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v17_resources_ShoppingProduct_ProductIssue_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n9google/ads/googleads/v17/resources/sho" +
      "pping_product.proto\022\"google.ads.googlead" +
      "s.v17.resources\0329google/ads/googleads/v1" +
      "7/enums/product_availability.proto\0324goog" +
      "le/ads/googleads/v17/enums/product_chann" +
      "el.proto\032@google/ads/googleads/v17/enums" +
      "/product_channel_exclusivity.proto\0326goog" +
      "le/ads/googleads/v17/enums/product_condi" +
      "tion.proto\032;google/ads/googleads/v17/enu" +
      "ms/product_issue_severity.proto\0323google/" +
      "ads/googleads/v17/enums/product_status.p" +
      "roto\032\037google/api/field_behavior.proto\032\031g" +
      "oogle/api/resource.proto\"\277\027\n\017ShoppingPro" +
      "duct\022G\n\rresource_name\030\001 \001(\tB0\340A\003\372A*\n(goo" +
      "gleads.googleapis.com/ShoppingProduct\022\037\n" +
      "\022merchant_center_id\030\002 \001(\003B\003\340A\003\022W\n\007channe" +
      "l\030\003 \001(\0162A.google.ads.googleads.v17.enums" +
      ".ProductChannelEnum.ProductChannelB\003\340A\003\022" +
      "\032\n\rlanguage_code\030\004 \001(\tB\003\340A\003\022\027\n\nfeed_labe" +
      "l\030\005 \001(\tB\003\340A\003\022\024\n\007item_id\030\006 \001(\tB\003\340A\003\022)\n\027mu" +
      "lti_client_account_id\030\007 \001(\003B\003\340A\003H\000\210\001\001\022\027\n" +
      "\005title\030\010 \001(\tB\003\340A\003H\001\210\001\001\022\027\n\005brand\030\t \001(\tB\003\340" +
      "A\003H\002\210\001\001\022\036\n\014price_micros\030\n \001(\003B\003\340A\003H\003\210\001\001\022" +
      "\037\n\rcurrency_code\030\013 \001(\tB\003\340A\003H\004\210\001\001\022~\n\023chan" +
      "nel_exclusivity\030\014 \001(\0162W.google.ads.googl" +
      "eads.v17.enums.ProductChannelExclusivity" +
      "Enum.ProductChannelExclusivityB\003\340A\003H\005\210\001\001" +
      "\022b\n\tcondition\030\r \001(\0162E.google.ads.googlea" +
      "ds.v17.enums.ProductConditionEnum.Produc" +
      "tConditionB\003\340A\003H\006\210\001\001\022k\n\014availability\030\016 \001" +
      "(\0162K.google.ads.googleads.v17.enums.Prod" +
      "uctAvailabilityEnum.ProductAvailabilityB" +
      "\003\340A\003H\007\210\001\001\022\035\n\020target_countries\030\017 \003(\tB\003\340A\003" +
      "\022#\n\021custom_attribute0\030\020 \001(\tB\003\340A\003H\010\210\001\001\022#\n" +
      "\021custom_attribute1\030\021 \001(\tB\003\340A\003H\t\210\001\001\022#\n\021cu" +
      "stom_attribute2\030\022 \001(\tB\003\340A\003H\n\210\001\001\022#\n\021custo" +
      "m_attribute3\030\023 \001(\tB\003\340A\003H\013\210\001\001\022#\n\021custom_a" +
      "ttribute4\030\024 \001(\tB\003\340A\003H\014\210\001\001\022V\n\017category_le" +
      "vel1\030\025 \001(\tB8\340A\003\372A2\n0googleads.googleapis" +
      ".com/ProductCategoryConstantH\r\210\001\001\022V\n\017cat" +
      "egory_level2\030\026 \001(\tB8\340A\003\372A2\n0googleads.go" +
      "ogleapis.com/ProductCategoryConstantH\016\210\001" +
      "\001\022V\n\017category_level3\030\027 \001(\tB8\340A\003\372A2\n0goog" +
      "leads.googleapis.com/ProductCategoryCons" +
      "tantH\017\210\001\001\022V\n\017category_level4\030\030 \001(\tB8\340A\003\372" +
      "A2\n0googleads.googleapis.com/ProductCate" +
      "goryConstantH\020\210\001\001\022V\n\017category_level5\030\031 \001" +
      "(\tB8\340A\003\372A2\n0googleads.googleapis.com/Pro" +
      "ductCategoryConstantH\021\210\001\001\022%\n\023product_typ" +
      "e_level1\030\032 \001(\tB\003\340A\003H\022\210\001\001\022%\n\023product_type" +
      "_level2\030\033 \001(\tB\003\340A\003H\023\210\001\001\022%\n\023product_type_" +
      "level3\030\034 \001(\tB\003\340A\003H\024\210\001\001\022%\n\023product_type_l" +
      "evel4\030\035 \001(\tB\003\340A\003H\025\210\001\001\022%\n\023product_type_le" +
      "vel5\030\036 \001(\tB\003\340A\003H\026\210\001\001\022*\n\030effective_max_cp" +
      "c_micros\030\037 \001(\003B\003\340A\003H\027\210\001\001\022T\n\006status\030  \001(\016" +
      "2?.google.ads.googleads.v17.enums.Produc" +
      "tStatusEnum.ProductStatusB\003\340A\003\022U\n\006issues" +
      "\030! \003(\0132@.google.ads.googleads.v17.resour" +
      "ces.ShoppingProduct.ProductIssueB\003\340A\003\022@\n" +
      "\010campaign\030\" \001(\tB)\340A\003\372A#\n!googleads.googl" +
      "eapis.com/CampaignH\030\210\001\001\022?\n\010ad_group\030# \001(" +
      "\tB(\340A\003\372A\"\n googleads.googleapis.com/AdGr" +
      "oupH\031\210\001\001\032\260\002\n\014ProductIssue\022\027\n\nerror_code\030" +
      "\001 \001(\tB\003\340A\003\022h\n\014ads_severity\030\002 \001(\0162M.googl" +
      "e.ads.googleads.v17.enums.ProductIssueSe" +
      "verityEnum.ProductIssueSeverityB\003\340A\003\022 \n\016" +
      "attribute_name\030\003 \001(\tB\003\340A\003H\000\210\001\001\022\030\n\013descri" +
      "ption\030\004 \001(\tB\003\340A\003\022\023\n\006detail\030\005 \001(\tB\003\340A\003\022\032\n" +
      "\rdocumentation\030\006 \001(\tB\003\340A\003\022\035\n\020affected_re" +
      "gions\030\007 \003(\tB\003\340A\003B\021\n\017_attribute_name:\301\001\352A" +
      "\275\001\n(googleads.googleapis.com/ShoppingPro" +
      "duct\022ncustomers/{customer_id}/shoppingPr" +
      "oducts/{merchant_center_id}~{channel}~{l" +
      "anguage_code}~{feed_label}~{item_id}*\020sh" +
      "oppingProducts2\017shoppingProductB\032\n\030_mult" +
      "i_client_account_idB\010\n\006_titleB\010\n\006_brandB" +
      "\017\n\r_price_microsB\020\n\016_currency_codeB\026\n\024_c" +
      "hannel_exclusivityB\014\n\n_conditionB\017\n\r_ava" +
      "ilabilityB\024\n\022_custom_attribute0B\024\n\022_cust" +
      "om_attribute1B\024\n\022_custom_attribute2B\024\n\022_" +
      "custom_attribute3B\024\n\022_custom_attribute4B" +
      "\022\n\020_category_level1B\022\n\020_category_level2B" +
      "\022\n\020_category_level3B\022\n\020_category_level4B" +
      "\022\n\020_category_level5B\026\n\024_product_type_lev" +
      "el1B\026\n\024_product_type_level2B\026\n\024_product_" +
      "type_level3B\026\n\024_product_type_level4B\026\n\024_" +
      "product_type_level5B\033\n\031_effective_max_cp" +
      "c_microsB\013\n\t_campaignB\013\n\t_ad_groupB\206\002\n&c" +
      "om.google.ads.googleads.v17.resourcesB\024S" +
      "hoppingProductProtoP\001ZKgoogle.golang.org" +
      "/genproto/googleapis/ads/googleads/v17/r" +
      "esources;resources\242\002\003GAA\252\002\"Google.Ads.Go" +
      "ogleAds.V17.Resources\312\002\"Google\\Ads\\Googl" +
      "eAds\\V17\\Resources\352\002&Google::Ads::Google" +
      "Ads::V17::Resourcesb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.ads.googleads.v17.enums.ProductAvailabilityProto.getDescriptor(),
          com.google.ads.googleads.v17.enums.ProductChannelProto.getDescriptor(),
          com.google.ads.googleads.v17.enums.ProductChannelExclusivityProto.getDescriptor(),
          com.google.ads.googleads.v17.enums.ProductConditionProto.getDescriptor(),
          com.google.ads.googleads.v17.enums.ProductIssueSeverityProto.getDescriptor(),
          com.google.ads.googleads.v17.enums.ProductStatusProto.getDescriptor(),
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.api.ResourceProto.getDescriptor(),
        });
    internal_static_google_ads_googleads_v17_resources_ShoppingProduct_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v17_resources_ShoppingProduct_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v17_resources_ShoppingProduct_descriptor,
        new java.lang.String[] { "ResourceName", "MerchantCenterId", "Channel", "LanguageCode", "FeedLabel", "ItemId", "MultiClientAccountId", "Title", "Brand", "PriceMicros", "CurrencyCode", "ChannelExclusivity", "Condition", "Availability", "TargetCountries", "CustomAttribute0", "CustomAttribute1", "CustomAttribute2", "CustomAttribute3", "CustomAttribute4", "CategoryLevel1", "CategoryLevel2", "CategoryLevel3", "CategoryLevel4", "CategoryLevel5", "ProductTypeLevel1", "ProductTypeLevel2", "ProductTypeLevel3", "ProductTypeLevel4", "ProductTypeLevel5", "EffectiveMaxCpcMicros", "Status", "Issues", "Campaign", "AdGroup", });
    internal_static_google_ads_googleads_v17_resources_ShoppingProduct_ProductIssue_descriptor =
      internal_static_google_ads_googleads_v17_resources_ShoppingProduct_descriptor.getNestedTypes().get(0);
    internal_static_google_ads_googleads_v17_resources_ShoppingProduct_ProductIssue_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v17_resources_ShoppingProduct_ProductIssue_descriptor,
        new java.lang.String[] { "ErrorCode", "AdsSeverity", "AttributeName", "Description", "Detail", "Documentation", "AffectedRegions", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.ResourceProto.resource);
    registry.add(com.google.api.ResourceProto.resourceReference);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.ads.googleads.v17.enums.ProductAvailabilityProto.getDescriptor();
    com.google.ads.googleads.v17.enums.ProductChannelProto.getDescriptor();
    com.google.ads.googleads.v17.enums.ProductChannelExclusivityProto.getDescriptor();
    com.google.ads.googleads.v17.enums.ProductConditionProto.getDescriptor();
    com.google.ads.googleads.v17.enums.ProductIssueSeverityProto.getDescriptor();
    com.google.ads.googleads.v17.enums.ProductStatusProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
