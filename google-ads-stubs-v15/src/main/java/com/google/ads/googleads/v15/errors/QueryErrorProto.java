// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v15/errors/query_error.proto

// Protobuf Java Version: 3.25.3
package com.google.ads.googleads.v15.errors;

public final class QueryErrorProto {
  private QueryErrorProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v15_errors_QueryErrorEnum_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v15_errors_QueryErrorEnum_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n1google/ads/googleads/v15/errors/query_" +
      "error.proto\022\037google.ads.googleads.v15.er" +
      "rors\"\223\016\n\016QueryErrorEnum\"\200\016\n\nQueryError\022\017" +
      "\n\013UNSPECIFIED\020\000\022\013\n\007UNKNOWN\020\001\022\017\n\013QUERY_ER" +
      "ROR\0202\022\025\n\021BAD_ENUM_CONSTANT\020\022\022\027\n\023BAD_ESCA" +
      "PE_SEQUENCE\020\007\022\022\n\016BAD_FIELD_NAME\020\014\022\023\n\017BAD" +
      "_LIMIT_VALUE\020\017\022\016\n\nBAD_NUMBER\020\005\022\020\n\014BAD_OP" +
      "ERATOR\020\003\022\026\n\022BAD_PARAMETER_NAME\020=\022\027\n\023BAD_" +
      "PARAMETER_VALUE\020>\022$\n BAD_RESOURCE_TYPE_I" +
      "N_FROM_CLAUSE\020-\022\016\n\nBAD_SYMBOL\020\002\022\r\n\tBAD_V" +
      "ALUE\020\004\022\027\n\023DATE_RANGE_TOO_WIDE\020$\022\031\n\025DATE_" +
      "RANGE_TOO_NARROW\020<\022\020\n\014EXPECTED_AND\020\036\022\017\n\013" +
      "EXPECTED_BY\020\016\022-\n)EXPECTED_DIMENSION_FIEL" +
      "D_IN_SELECT_CLAUSE\020%\022\"\n\036EXPECTED_FILTERS" +
      "_ON_DATE_RANGE\0207\022\021\n\rEXPECTED_FROM\020,\022\021\n\rE" +
      "XPECTED_LIST\020)\022.\n*EXPECTED_REFERENCED_FI" +
      "ELD_IN_SELECT_CLAUSE\020\020\022\023\n\017EXPECTED_SELEC" +
      "T\020\r\022\031\n\025EXPECTED_SINGLE_VALUE\020*\022(\n$EXPECT" +
      "ED_VALUE_WITH_BETWEEN_OPERATOR\020\035\022\027\n\023INVA" +
      "LID_DATE_FORMAT\020&\022\036\n\032MISALIGNED_DATE_FOR" +
      "_FILTER\020@\022\030\n\024INVALID_STRING_VALUE\0209\022\'\n#I" +
      "NVALID_VALUE_WITH_BETWEEN_OPERATOR\020\032\022&\n\"" +
      "INVALID_VALUE_WITH_DURING_OPERATOR\020\026\022$\n " +
      "INVALID_VALUE_WITH_LIKE_OPERATOR\0208\022\033\n\027OP" +
      "ERATOR_FIELD_MISMATCH\020#\022&\n\"PROHIBITED_EM" +
      "PTY_LIST_IN_CONDITION\020\034\022\034\n\030PROHIBITED_EN" +
      "UM_CONSTANT\0206\0221\n-PROHIBITED_FIELD_COMBIN" +
      "ATION_IN_SELECT_CLAUSE\020\037\022\'\n#PROHIBITED_F" +
      "IELD_IN_ORDER_BY_CLAUSE\020(\022%\n!PROHIBITED_" +
      "FIELD_IN_SELECT_CLAUSE\020\027\022$\n PROHIBITED_F" +
      "IELD_IN_WHERE_CLAUSE\020\030\022+\n\'PROHIBITED_RES" +
      "OURCE_TYPE_IN_FROM_CLAUSE\020+\022-\n)PROHIBITE" +
      "D_RESOURCE_TYPE_IN_SELECT_CLAUSE\0200\022,\n(PR" +
      "OHIBITED_RESOURCE_TYPE_IN_WHERE_CLAUSE\020:" +
      "\022/\n+PROHIBITED_METRIC_IN_SELECT_OR_WHERE" +
      "_CLAUSE\0201\0220\n,PROHIBITED_SEGMENT_IN_SELEC" +
      "T_OR_WHERE_CLAUSE\0203\022<\n8PROHIBITED_SEGMEN" +
      "T_WITH_METRIC_IN_SELECT_OR_WHERE_CLAUSE\020" +
      "5\022\027\n\023LIMIT_VALUE_TOO_LOW\020\031\022 \n\034PROHIBITED" +
      "_NEWLINE_IN_STRING\020\010\022(\n$PROHIBITED_VALUE" +
      "_COMBINATION_IN_LIST\020\n\0226\n2PROHIBITED_VAL" +
      "UE_COMBINATION_WITH_BETWEEN_OPERATOR\020\025\022\031" +
      "\n\025STRING_NOT_TERMINATED\020\006\022\025\n\021TOO_MANY_SE" +
      "GMENTS\020\"\022\033\n\027UNEXPECTED_END_OF_QUERY\020\t\022\032\n" +
      "\026UNEXPECTED_FROM_CLAUSE\020/\022\026\n\022UNRECOGNIZE" +
      "D_FIELD\020 \022\024\n\020UNEXPECTED_INPUT\020\013\022!\n\035REQUE" +
      "STED_METRICS_FOR_MANAGER\020;\022\036\n\032FILTER_HAS" +
      "_TOO_MANY_VALUES\020?B\357\001\n#com.google.ads.go" +
      "ogleads.v15.errorsB\017QueryErrorProtoP\001ZEg" +
      "oogle.golang.org/genproto/googleapis/ads" +
      "/googleads/v15/errors;errors\242\002\003GAA\252\002\037Goo" +
      "gle.Ads.GoogleAds.V15.Errors\312\002\037Google\\Ad" +
      "s\\GoogleAds\\V15\\Errors\352\002#Google::Ads::Go" +
      "ogleAds::V15::Errorsb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_google_ads_googleads_v15_errors_QueryErrorEnum_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v15_errors_QueryErrorEnum_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v15_errors_QueryErrorEnum_descriptor,
        new java.lang.String[] { });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
