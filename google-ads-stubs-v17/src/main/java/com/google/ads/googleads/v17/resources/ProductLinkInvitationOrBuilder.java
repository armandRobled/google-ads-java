// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v17/resources/product_link_invitation.proto

// Protobuf Java Version: 3.25.3
package com.google.ads.googleads.v17.resources;

public interface ProductLinkInvitationOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v17.resources.ProductLinkInvitation)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Immutable. The resource name of a product link invitation.
   * Product link invitation resource names have the form:
   *
   * `customers/{customer_id}/productLinkInvitations/{product_link_invitation_id}`
   * </pre>
   *
   * <code>string resource_name = 1 [(.google.api.field_behavior) = IMMUTABLE, (.google.api.resource_reference) = { ... }</code>
   * @return The resourceName.
   */
  java.lang.String getResourceName();
  /**
   * <pre>
   * Immutable. The resource name of a product link invitation.
   * Product link invitation resource names have the form:
   *
   * `customers/{customer_id}/productLinkInvitations/{product_link_invitation_id}`
   * </pre>
   *
   * <code>string resource_name = 1 [(.google.api.field_behavior) = IMMUTABLE, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for resourceName.
   */
  com.google.protobuf.ByteString
      getResourceNameBytes();

  /**
   * <pre>
   * Output only. The ID of the product link invitation.
   * This field is read only.
   * </pre>
   *
   * <code>int64 product_link_invitation_id = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The productLinkInvitationId.
   */
  long getProductLinkInvitationId();

  /**
   * <pre>
   * Output only. The status of the product link invitation.
   * This field is read only.
   * </pre>
   *
   * <code>.google.ads.googleads.v17.enums.ProductLinkInvitationStatusEnum.ProductLinkInvitationStatus status = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The enum numeric value on the wire for status.
   */
  int getStatusValue();
  /**
   * <pre>
   * Output only. The status of the product link invitation.
   * This field is read only.
   * </pre>
   *
   * <code>.google.ads.googleads.v17.enums.ProductLinkInvitationStatusEnum.ProductLinkInvitationStatus status = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The status.
   */
  com.google.ads.googleads.v17.enums.ProductLinkInvitationStatusEnum.ProductLinkInvitationStatus getStatus();

  /**
   * <pre>
   * Output only. The type of the invited account.
   * This field is read only and can be used for filtering invitations with
   * {&#64;code GoogleAdsService.SearchGoogleAdsRequest}.
   * </pre>
   *
   * <code>.google.ads.googleads.v17.enums.LinkedProductTypeEnum.LinkedProductType type = 6 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The enum numeric value on the wire for type.
   */
  int getTypeValue();
  /**
   * <pre>
   * Output only. The type of the invited account.
   * This field is read only and can be used for filtering invitations with
   * {&#64;code GoogleAdsService.SearchGoogleAdsRequest}.
   * </pre>
   *
   * <code>.google.ads.googleads.v17.enums.LinkedProductTypeEnum.LinkedProductType type = 6 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The type.
   */
  com.google.ads.googleads.v17.enums.LinkedProductTypeEnum.LinkedProductType getType();

  /**
   * <pre>
   * Output only. Hotel link invitation.
   * </pre>
   *
   * <code>.google.ads.googleads.v17.resources.HotelCenterLinkInvitationIdentifier hotel_center = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return Whether the hotelCenter field is set.
   */
  boolean hasHotelCenter();
  /**
   * <pre>
   * Output only. Hotel link invitation.
   * </pre>
   *
   * <code>.google.ads.googleads.v17.resources.HotelCenterLinkInvitationIdentifier hotel_center = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The hotelCenter.
   */
  com.google.ads.googleads.v17.resources.HotelCenterLinkInvitationIdentifier getHotelCenter();
  /**
   * <pre>
   * Output only. Hotel link invitation.
   * </pre>
   *
   * <code>.google.ads.googleads.v17.resources.HotelCenterLinkInvitationIdentifier hotel_center = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  com.google.ads.googleads.v17.resources.HotelCenterLinkInvitationIdentifierOrBuilder getHotelCenterOrBuilder();

  /**
   * <pre>
   * Output only. Merchant Center link invitation.
   * </pre>
   *
   * <code>.google.ads.googleads.v17.resources.MerchantCenterLinkInvitationIdentifier merchant_center = 5 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return Whether the merchantCenter field is set.
   */
  boolean hasMerchantCenter();
  /**
   * <pre>
   * Output only. Merchant Center link invitation.
   * </pre>
   *
   * <code>.google.ads.googleads.v17.resources.MerchantCenterLinkInvitationIdentifier merchant_center = 5 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The merchantCenter.
   */
  com.google.ads.googleads.v17.resources.MerchantCenterLinkInvitationIdentifier getMerchantCenter();
  /**
   * <pre>
   * Output only. Merchant Center link invitation.
   * </pre>
   *
   * <code>.google.ads.googleads.v17.resources.MerchantCenterLinkInvitationIdentifier merchant_center = 5 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  com.google.ads.googleads.v17.resources.MerchantCenterLinkInvitationIdentifierOrBuilder getMerchantCenterOrBuilder();

  /**
   * <pre>
   * Output only. Advertising Partner link invitation.
   * </pre>
   *
   * <code>.google.ads.googleads.v17.resources.AdvertisingPartnerLinkInvitationIdentifier advertising_partner = 7 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return Whether the advertisingPartner field is set.
   */
  boolean hasAdvertisingPartner();
  /**
   * <pre>
   * Output only. Advertising Partner link invitation.
   * </pre>
   *
   * <code>.google.ads.googleads.v17.resources.AdvertisingPartnerLinkInvitationIdentifier advertising_partner = 7 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The advertisingPartner.
   */
  com.google.ads.googleads.v17.resources.AdvertisingPartnerLinkInvitationIdentifier getAdvertisingPartner();
  /**
   * <pre>
   * Output only. Advertising Partner link invitation.
   * </pre>
   *
   * <code>.google.ads.googleads.v17.resources.AdvertisingPartnerLinkInvitationIdentifier advertising_partner = 7 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  com.google.ads.googleads.v17.resources.AdvertisingPartnerLinkInvitationIdentifierOrBuilder getAdvertisingPartnerOrBuilder();

  com.google.ads.googleads.v17.resources.ProductLinkInvitation.InvitedAccountCase getInvitedAccountCase();
}
