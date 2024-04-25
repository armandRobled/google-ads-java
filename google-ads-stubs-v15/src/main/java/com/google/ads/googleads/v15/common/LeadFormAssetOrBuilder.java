// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v15/common/asset_types.proto

// Protobuf Java Version: 3.25.3
package com.google.ads.googleads.v15.common;

public interface LeadFormAssetOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v15.common.LeadFormAsset)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Required. The name of the business being advertised.
   * </pre>
   *
   * <code>string business_name = 10 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The businessName.
   */
  java.lang.String getBusinessName();
  /**
   * <pre>
   * Required. The name of the business being advertised.
   * </pre>
   *
   * <code>string business_name = 10 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The bytes for businessName.
   */
  com.google.protobuf.ByteString
      getBusinessNameBytes();

  /**
   * <pre>
   * Required. Pre-defined display text that encourages user to expand the form.
   * </pre>
   *
   * <code>.google.ads.googleads.v15.enums.LeadFormCallToActionTypeEnum.LeadFormCallToActionType call_to_action_type = 17 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The enum numeric value on the wire for callToActionType.
   */
  int getCallToActionTypeValue();
  /**
   * <pre>
   * Required. Pre-defined display text that encourages user to expand the form.
   * </pre>
   *
   * <code>.google.ads.googleads.v15.enums.LeadFormCallToActionTypeEnum.LeadFormCallToActionType call_to_action_type = 17 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The callToActionType.
   */
  com.google.ads.googleads.v15.enums.LeadFormCallToActionTypeEnum.LeadFormCallToActionType getCallToActionType();

  /**
   * <pre>
   * Required. Text giving a clear value proposition of what users expect once
   * they expand the form.
   * </pre>
   *
   * <code>string call_to_action_description = 18 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The callToActionDescription.
   */
  java.lang.String getCallToActionDescription();
  /**
   * <pre>
   * Required. Text giving a clear value proposition of what users expect once
   * they expand the form.
   * </pre>
   *
   * <code>string call_to_action_description = 18 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The bytes for callToActionDescription.
   */
  com.google.protobuf.ByteString
      getCallToActionDescriptionBytes();

  /**
   * <pre>
   * Required. Headline of the expanded form to describe what the form is asking
   * for or facilitating.
   * </pre>
   *
   * <code>string headline = 12 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The headline.
   */
  java.lang.String getHeadline();
  /**
   * <pre>
   * Required. Headline of the expanded form to describe what the form is asking
   * for or facilitating.
   * </pre>
   *
   * <code>string headline = 12 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The bytes for headline.
   */
  com.google.protobuf.ByteString
      getHeadlineBytes();

  /**
   * <pre>
   * Required. Detailed description of the expanded form to describe what the
   * form is asking for or facilitating.
   * </pre>
   *
   * <code>string description = 13 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The description.
   */
  java.lang.String getDescription();
  /**
   * <pre>
   * Required. Detailed description of the expanded form to describe what the
   * form is asking for or facilitating.
   * </pre>
   *
   * <code>string description = 13 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The bytes for description.
   */
  com.google.protobuf.ByteString
      getDescriptionBytes();

  /**
   * <pre>
   * Required. Link to a page describing the policy on how the collected data is
   * handled by the advertiser/business.
   * </pre>
   *
   * <code>string privacy_policy_url = 14 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The privacyPolicyUrl.
   */
  java.lang.String getPrivacyPolicyUrl();
  /**
   * <pre>
   * Required. Link to a page describing the policy on how the collected data is
   * handled by the advertiser/business.
   * </pre>
   *
   * <code>string privacy_policy_url = 14 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The bytes for privacyPolicyUrl.
   */
  com.google.protobuf.ByteString
      getPrivacyPolicyUrlBytes();

  /**
   * <pre>
   * Headline of text shown after form submission that describes how the
   * advertiser will follow up with the user.
   * </pre>
   *
   * <code>optional string post_submit_headline = 15;</code>
   * @return Whether the postSubmitHeadline field is set.
   */
  boolean hasPostSubmitHeadline();
  /**
   * <pre>
   * Headline of text shown after form submission that describes how the
   * advertiser will follow up with the user.
   * </pre>
   *
   * <code>optional string post_submit_headline = 15;</code>
   * @return The postSubmitHeadline.
   */
  java.lang.String getPostSubmitHeadline();
  /**
   * <pre>
   * Headline of text shown after form submission that describes how the
   * advertiser will follow up with the user.
   * </pre>
   *
   * <code>optional string post_submit_headline = 15;</code>
   * @return The bytes for postSubmitHeadline.
   */
  com.google.protobuf.ByteString
      getPostSubmitHeadlineBytes();

  /**
   * <pre>
   * Detailed description shown after form submission that describes how the
   * advertiser will follow up with the user.
   * </pre>
   *
   * <code>optional string post_submit_description = 16;</code>
   * @return Whether the postSubmitDescription field is set.
   */
  boolean hasPostSubmitDescription();
  /**
   * <pre>
   * Detailed description shown after form submission that describes how the
   * advertiser will follow up with the user.
   * </pre>
   *
   * <code>optional string post_submit_description = 16;</code>
   * @return The postSubmitDescription.
   */
  java.lang.String getPostSubmitDescription();
  /**
   * <pre>
   * Detailed description shown after form submission that describes how the
   * advertiser will follow up with the user.
   * </pre>
   *
   * <code>optional string post_submit_description = 16;</code>
   * @return The bytes for postSubmitDescription.
   */
  com.google.protobuf.ByteString
      getPostSubmitDescriptionBytes();

  /**
   * <pre>
   * Ordered list of input fields. This field can be updated by reordering
   * questions, but not by adding or removing questions.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v15.common.LeadFormField fields = 8;</code>
   */
  java.util.List<com.google.ads.googleads.v15.common.LeadFormField> 
      getFieldsList();
  /**
   * <pre>
   * Ordered list of input fields. This field can be updated by reordering
   * questions, but not by adding or removing questions.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v15.common.LeadFormField fields = 8;</code>
   */
  com.google.ads.googleads.v15.common.LeadFormField getFields(int index);
  /**
   * <pre>
   * Ordered list of input fields. This field can be updated by reordering
   * questions, but not by adding or removing questions.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v15.common.LeadFormField fields = 8;</code>
   */
  int getFieldsCount();
  /**
   * <pre>
   * Ordered list of input fields. This field can be updated by reordering
   * questions, but not by adding or removing questions.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v15.common.LeadFormField fields = 8;</code>
   */
  java.util.List<? extends com.google.ads.googleads.v15.common.LeadFormFieldOrBuilder> 
      getFieldsOrBuilderList();
  /**
   * <pre>
   * Ordered list of input fields. This field can be updated by reordering
   * questions, but not by adding or removing questions.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v15.common.LeadFormField fields = 8;</code>
   */
  com.google.ads.googleads.v15.common.LeadFormFieldOrBuilder getFieldsOrBuilder(
      int index);

  /**
   * <pre>
   * Ordered list of custom question fields. This field is subject to a limit of
   * 5 qualifying questions per form.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v15.common.LeadFormCustomQuestionField custom_question_fields = 23;</code>
   */
  java.util.List<com.google.ads.googleads.v15.common.LeadFormCustomQuestionField> 
      getCustomQuestionFieldsList();
  /**
   * <pre>
   * Ordered list of custom question fields. This field is subject to a limit of
   * 5 qualifying questions per form.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v15.common.LeadFormCustomQuestionField custom_question_fields = 23;</code>
   */
  com.google.ads.googleads.v15.common.LeadFormCustomQuestionField getCustomQuestionFields(int index);
  /**
   * <pre>
   * Ordered list of custom question fields. This field is subject to a limit of
   * 5 qualifying questions per form.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v15.common.LeadFormCustomQuestionField custom_question_fields = 23;</code>
   */
  int getCustomQuestionFieldsCount();
  /**
   * <pre>
   * Ordered list of custom question fields. This field is subject to a limit of
   * 5 qualifying questions per form.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v15.common.LeadFormCustomQuestionField custom_question_fields = 23;</code>
   */
  java.util.List<? extends com.google.ads.googleads.v15.common.LeadFormCustomQuestionFieldOrBuilder> 
      getCustomQuestionFieldsOrBuilderList();
  /**
   * <pre>
   * Ordered list of custom question fields. This field is subject to a limit of
   * 5 qualifying questions per form.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v15.common.LeadFormCustomQuestionField custom_question_fields = 23;</code>
   */
  com.google.ads.googleads.v15.common.LeadFormCustomQuestionFieldOrBuilder getCustomQuestionFieldsOrBuilder(
      int index);

  /**
   * <pre>
   * Configured methods for collected lead data to be delivered to advertiser.
   * Only one method typed as WebhookDelivery can be configured.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v15.common.LeadFormDeliveryMethod delivery_methods = 9;</code>
   */
  java.util.List<com.google.ads.googleads.v15.common.LeadFormDeliveryMethod> 
      getDeliveryMethodsList();
  /**
   * <pre>
   * Configured methods for collected lead data to be delivered to advertiser.
   * Only one method typed as WebhookDelivery can be configured.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v15.common.LeadFormDeliveryMethod delivery_methods = 9;</code>
   */
  com.google.ads.googleads.v15.common.LeadFormDeliveryMethod getDeliveryMethods(int index);
  /**
   * <pre>
   * Configured methods for collected lead data to be delivered to advertiser.
   * Only one method typed as WebhookDelivery can be configured.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v15.common.LeadFormDeliveryMethod delivery_methods = 9;</code>
   */
  int getDeliveryMethodsCount();
  /**
   * <pre>
   * Configured methods for collected lead data to be delivered to advertiser.
   * Only one method typed as WebhookDelivery can be configured.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v15.common.LeadFormDeliveryMethod delivery_methods = 9;</code>
   */
  java.util.List<? extends com.google.ads.googleads.v15.common.LeadFormDeliveryMethodOrBuilder> 
      getDeliveryMethodsOrBuilderList();
  /**
   * <pre>
   * Configured methods for collected lead data to be delivered to advertiser.
   * Only one method typed as WebhookDelivery can be configured.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v15.common.LeadFormDeliveryMethod delivery_methods = 9;</code>
   */
  com.google.ads.googleads.v15.common.LeadFormDeliveryMethodOrBuilder getDeliveryMethodsOrBuilder(
      int index);

  /**
   * <pre>
   * Pre-defined display text that encourages user action after the form is
   * submitted.
   * </pre>
   *
   * <code>.google.ads.googleads.v15.enums.LeadFormPostSubmitCallToActionTypeEnum.LeadFormPostSubmitCallToActionType post_submit_call_to_action_type = 19;</code>
   * @return The enum numeric value on the wire for postSubmitCallToActionType.
   */
  int getPostSubmitCallToActionTypeValue();
  /**
   * <pre>
   * Pre-defined display text that encourages user action after the form is
   * submitted.
   * </pre>
   *
   * <code>.google.ads.googleads.v15.enums.LeadFormPostSubmitCallToActionTypeEnum.LeadFormPostSubmitCallToActionType post_submit_call_to_action_type = 19;</code>
   * @return The postSubmitCallToActionType.
   */
  com.google.ads.googleads.v15.enums.LeadFormPostSubmitCallToActionTypeEnum.LeadFormPostSubmitCallToActionType getPostSubmitCallToActionType();

  /**
   * <pre>
   * Asset resource name of the background image.
   * The image dimensions must be exactly 1200x628.
   * </pre>
   *
   * <code>optional string background_image_asset = 20;</code>
   * @return Whether the backgroundImageAsset field is set.
   */
  boolean hasBackgroundImageAsset();
  /**
   * <pre>
   * Asset resource name of the background image.
   * The image dimensions must be exactly 1200x628.
   * </pre>
   *
   * <code>optional string background_image_asset = 20;</code>
   * @return The backgroundImageAsset.
   */
  java.lang.String getBackgroundImageAsset();
  /**
   * <pre>
   * Asset resource name of the background image.
   * The image dimensions must be exactly 1200x628.
   * </pre>
   *
   * <code>optional string background_image_asset = 20;</code>
   * @return The bytes for backgroundImageAsset.
   */
  com.google.protobuf.ByteString
      getBackgroundImageAssetBytes();

  /**
   * <pre>
   * Chosen intent for the lead form, for example, more volume or more
   * qualified.
   * </pre>
   *
   * <code>.google.ads.googleads.v15.enums.LeadFormDesiredIntentEnum.LeadFormDesiredIntent desired_intent = 21;</code>
   * @return The enum numeric value on the wire for desiredIntent.
   */
  int getDesiredIntentValue();
  /**
   * <pre>
   * Chosen intent for the lead form, for example, more volume or more
   * qualified.
   * </pre>
   *
   * <code>.google.ads.googleads.v15.enums.LeadFormDesiredIntentEnum.LeadFormDesiredIntent desired_intent = 21;</code>
   * @return The desiredIntent.
   */
  com.google.ads.googleads.v15.enums.LeadFormDesiredIntentEnum.LeadFormDesiredIntent getDesiredIntent();

  /**
   * <pre>
   * Custom disclosure shown along with Google disclaimer on the lead form.
   * Accessible to allowed customers only.
   * </pre>
   *
   * <code>optional string custom_disclosure = 22;</code>
   * @return Whether the customDisclosure field is set.
   */
  boolean hasCustomDisclosure();
  /**
   * <pre>
   * Custom disclosure shown along with Google disclaimer on the lead form.
   * Accessible to allowed customers only.
   * </pre>
   *
   * <code>optional string custom_disclosure = 22;</code>
   * @return The customDisclosure.
   */
  java.lang.String getCustomDisclosure();
  /**
   * <pre>
   * Custom disclosure shown along with Google disclaimer on the lead form.
   * Accessible to allowed customers only.
   * </pre>
   *
   * <code>optional string custom_disclosure = 22;</code>
   * @return The bytes for customDisclosure.
   */
  com.google.protobuf.ByteString
      getCustomDisclosureBytes();
}
