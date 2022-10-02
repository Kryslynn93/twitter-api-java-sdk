/*
Copyright 2020 Twitter, Inc.
SPDX-License-Identifier: Apache-2.0

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.

NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
https://openapi-generator.tech
Do not edit the class manually.
*/


package com.twitter.clientlib.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.twitter.clientlib.model.ContextAnnotation;
import com.twitter.clientlib.model.FullTextEntities;
import com.twitter.clientlib.model.ReplySettings;
import com.twitter.clientlib.model.TweetAttachments;
import com.twitter.clientlib.model.TweetEditControls;
import com.twitter.clientlib.model.TweetGeo;
import com.twitter.clientlib.model.TweetNonPublicMetrics;
import com.twitter.clientlib.model.TweetOrganicMetrics;
import com.twitter.clientlib.model.TweetPromotedMetrics;
import com.twitter.clientlib.model.TweetPublicMetrics;
import com.twitter.clientlib.model.TweetReferencedTweets;
import com.twitter.clientlib.model.TweetWithheld;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import com.twitter.clientlib.JSON;

/**
 * Tweet
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class Tweet {
  public static final String SERIALIZED_NAME_ATTACHMENTS = "attachments";
  @SerializedName(SERIALIZED_NAME_ATTACHMENTS)
  private TweetAttachments attachments;

  public static final String SERIALIZED_NAME_AUTHOR_ID = "author_id";
  @SerializedName(SERIALIZED_NAME_AUTHOR_ID)
  private String authorId;

  public static final String SERIALIZED_NAME_CONTEXT_ANNOTATIONS = "context_annotations";
  @SerializedName(SERIALIZED_NAME_CONTEXT_ANNOTATIONS)
  private List<ContextAnnotation> contextAnnotations = null;

  public static final String SERIALIZED_NAME_CONVERSATION_ID = "conversation_id";
  @SerializedName(SERIALIZED_NAME_CONVERSATION_ID)
  private String conversationId;

  public static final String SERIALIZED_NAME_CREATED_AT = "created_at";
  @SerializedName(SERIALIZED_NAME_CREATED_AT)
  private OffsetDateTime createdAt;

  public static final String SERIALIZED_NAME_EDIT_CONTROLS = "edit_controls";
  @SerializedName(SERIALIZED_NAME_EDIT_CONTROLS)
  private TweetEditControls editControls;

  public static final String SERIALIZED_NAME_EDIT_HISTORY_TWEET_IDS = "edit_history_tweet_ids";
  @SerializedName(SERIALIZED_NAME_EDIT_HISTORY_TWEET_IDS)
  private List<String> editHistoryTweetIds = new ArrayList<>();

  public static final String SERIALIZED_NAME_ENTITIES = "entities";
  @SerializedName(SERIALIZED_NAME_ENTITIES)
  private FullTextEntities entities;

  public static final String SERIALIZED_NAME_GEO = "geo";
  @SerializedName(SERIALIZED_NAME_GEO)
  private TweetGeo geo;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_IN_REPLY_TO_USER_ID = "in_reply_to_user_id";
  @SerializedName(SERIALIZED_NAME_IN_REPLY_TO_USER_ID)
  private String inReplyToUserId;

  public static final String SERIALIZED_NAME_LANG = "lang";
  @SerializedName(SERIALIZED_NAME_LANG)
  private String lang;

  public static final String SERIALIZED_NAME_NON_PUBLIC_METRICS = "non_public_metrics";
  @SerializedName(SERIALIZED_NAME_NON_PUBLIC_METRICS)
  private TweetNonPublicMetrics nonPublicMetrics;

  public static final String SERIALIZED_NAME_ORGANIC_METRICS = "organic_metrics";
  @SerializedName(SERIALIZED_NAME_ORGANIC_METRICS)
  private TweetOrganicMetrics organicMetrics;

  public static final String SERIALIZED_NAME_POSSIBLY_SENSITIVE = "possibly_sensitive";
  @SerializedName(SERIALIZED_NAME_POSSIBLY_SENSITIVE)
  private Boolean possiblySensitive;

  public static final String SERIALIZED_NAME_PROMOTED_METRICS = "promoted_metrics";
  @SerializedName(SERIALIZED_NAME_PROMOTED_METRICS)
  private TweetPromotedMetrics promotedMetrics;

  public static final String SERIALIZED_NAME_PUBLIC_METRICS = "public_metrics";
  @SerializedName(SERIALIZED_NAME_PUBLIC_METRICS)
  private TweetPublicMetrics publicMetrics;

  public static final String SERIALIZED_NAME_REFERENCED_TWEETS = "referenced_tweets";
  @SerializedName(SERIALIZED_NAME_REFERENCED_TWEETS)
  private List<TweetReferencedTweets> referencedTweets = null;

  public static final String SERIALIZED_NAME_REPLY_SETTINGS = "reply_settings";
  @SerializedName(SERIALIZED_NAME_REPLY_SETTINGS)
  private ReplySettings replySettings;

  public static final String SERIALIZED_NAME_SOURCE = "source";
  @SerializedName(SERIALIZED_NAME_SOURCE)
  private String source;

  public static final String SERIALIZED_NAME_TEXT = "text";
  @SerializedName(SERIALIZED_NAME_TEXT)
  private String text;

  public static final String SERIALIZED_NAME_WITHHELD = "withheld";
  @SerializedName(SERIALIZED_NAME_WITHHELD)
  private TweetWithheld withheld;

  public Tweet() { 
  }

  public Tweet attachments(TweetAttachments attachments) {
    
    this.attachments = attachments;
    return this;
  }

   /**
   * Get attachments
   * @return attachments
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public TweetAttachments getAttachments() {
    return attachments;
  }


  public void setAttachments(TweetAttachments attachments) {
    this.attachments = attachments;
  }


  public Tweet authorId(String authorId) {
    
    this.authorId = authorId;
    return this;
  }

   /**
   * Unique identifier of this User. This is returned as a string in order to avoid complications with languages and tools that cannot handle large integers.
   * @return authorId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2244994945", value = "Unique identifier of this User. This is returned as a string in order to avoid complications with languages and tools that cannot handle large integers.")

  public String getAuthorId() {
    return authorId;
  }


  public void setAuthorId(String authorId) {
    this.authorId = authorId;
  }


  public Tweet contextAnnotations(List<ContextAnnotation> contextAnnotations) {
    
    this.contextAnnotations = contextAnnotations;
    return this;
  }

  public Tweet addContextAnnotationsItem(ContextAnnotation contextAnnotationsItem) {
    if (this.contextAnnotations == null) {
      this.contextAnnotations = new ArrayList<>();
    }
    this.contextAnnotations.add(contextAnnotationsItem);
    return this;
  }

   /**
   * Get contextAnnotations
   * @return contextAnnotations
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<ContextAnnotation> getContextAnnotations() {
    return contextAnnotations;
  }


  public void setContextAnnotations(List<ContextAnnotation> contextAnnotations) {
    this.contextAnnotations = contextAnnotations;
  }


  public Tweet conversationId(String conversationId) {
    
    this.conversationId = conversationId;
    return this;
  }

   /**
   * Unique identifier of this Tweet. This is returned as a string in order to avoid complications with languages and tools that cannot handle large integers.
   * @return conversationId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1346889436626259968", value = "Unique identifier of this Tweet. This is returned as a string in order to avoid complications with languages and tools that cannot handle large integers.")

  public String getConversationId() {
    return conversationId;
  }


  public void setConversationId(String conversationId) {
    this.conversationId = conversationId;
  }


  public Tweet createdAt(OffsetDateTime createdAt) {
    
    this.createdAt = createdAt;
    return this;
  }

   /**
   * Creation time of the Tweet.
   * @return createdAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2021-01-06T18:40:40Z", value = "Creation time of the Tweet.")

  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }


  public void setCreatedAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
  }


  public Tweet editControls(TweetEditControls editControls) {
    
    this.editControls = editControls;
    return this;
  }

   /**
   * Get editControls
   * @return editControls
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public TweetEditControls getEditControls() {
    return editControls;
  }


  public void setEditControls(TweetEditControls editControls) {
    this.editControls = editControls;
  }


  public Tweet editHistoryTweetIds(List<String> editHistoryTweetIds) {
    
    this.editHistoryTweetIds = editHistoryTweetIds;
    return this;
  }

  public Tweet addEditHistoryTweetIdsItem(String editHistoryTweetIdsItem) {
    this.editHistoryTweetIds.add(editHistoryTweetIdsItem);
    return this;
  }

   /**
   * A list of Tweet Ids in this Tweet chain.
   * @return editHistoryTweetIds
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "A list of Tweet Ids in this Tweet chain.")

  public List<String> getEditHistoryTweetIds() {
    return editHistoryTweetIds;
  }


  public void setEditHistoryTweetIds(List<String> editHistoryTweetIds) {
    this.editHistoryTweetIds = editHistoryTweetIds;
  }


  public Tweet entities(FullTextEntities entities) {
    
    this.entities = entities;
    return this;
  }

   /**
   * Get entities
   * @return entities
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public FullTextEntities getEntities() {
    return entities;
  }


  public void setEntities(FullTextEntities entities) {
    this.entities = entities;
  }


  public Tweet geo(TweetGeo geo) {
    
    this.geo = geo;
    return this;
  }

   /**
   * Get geo
   * @return geo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public TweetGeo getGeo() {
    return geo;
  }


  public void setGeo(TweetGeo geo) {
    this.geo = geo;
  }


  public Tweet id(String id) {
    
    this.id = id;
    return this;
  }

   /**
   * Unique identifier of this Tweet. This is returned as a string in order to avoid complications with languages and tools that cannot handle large integers.
   * @return id
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "1346889436626259968", required = true, value = "Unique identifier of this Tweet. This is returned as a string in order to avoid complications with languages and tools that cannot handle large integers.")

  public String getId() {
    return id;
  }


  public void setId(String id) {
    this.id = id;
  }


  public Tweet inReplyToUserId(String inReplyToUserId) {
    
    this.inReplyToUserId = inReplyToUserId;
    return this;
  }

   /**
   * Unique identifier of this User. This is returned as a string in order to avoid complications with languages and tools that cannot handle large integers.
   * @return inReplyToUserId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2244994945", value = "Unique identifier of this User. This is returned as a string in order to avoid complications with languages and tools that cannot handle large integers.")

  public String getInReplyToUserId() {
    return inReplyToUserId;
  }


  public void setInReplyToUserId(String inReplyToUserId) {
    this.inReplyToUserId = inReplyToUserId;
  }


  public Tweet lang(String lang) {
    
    this.lang = lang;
    return this;
  }

   /**
   * Language of the Tweet, if detected by Twitter. Returned as a BCP47 language tag.
   * @return lang
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "en", value = "Language of the Tweet, if detected by Twitter. Returned as a BCP47 language tag.")

  public String getLang() {
    return lang;
  }


  public void setLang(String lang) {
    this.lang = lang;
  }


  public Tweet nonPublicMetrics(TweetNonPublicMetrics nonPublicMetrics) {
    
    this.nonPublicMetrics = nonPublicMetrics;
    return this;
  }

   /**
   * Get nonPublicMetrics
   * @return nonPublicMetrics
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public TweetNonPublicMetrics getNonPublicMetrics() {
    return nonPublicMetrics;
  }


  public void setNonPublicMetrics(TweetNonPublicMetrics nonPublicMetrics) {
    this.nonPublicMetrics = nonPublicMetrics;
  }


  public Tweet organicMetrics(TweetOrganicMetrics organicMetrics) {
    
    this.organicMetrics = organicMetrics;
    return this;
  }

   /**
   * Get organicMetrics
   * @return organicMetrics
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public TweetOrganicMetrics getOrganicMetrics() {
    return organicMetrics;
  }


  public void setOrganicMetrics(TweetOrganicMetrics organicMetrics) {
    this.organicMetrics = organicMetrics;
  }


  public Tweet possiblySensitive(Boolean possiblySensitive) {
    
    this.possiblySensitive = possiblySensitive;
    return this;
  }

   /**
   * Indicates if this Tweet contains URLs marked as sensitive, for example content suitable for mature audiences.
   * @return possiblySensitive
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "false", value = "Indicates if this Tweet contains URLs marked as sensitive, for example content suitable for mature audiences.")

  public Boolean getPossiblySensitive() {
    return possiblySensitive;
  }


  public void setPossiblySensitive(Boolean possiblySensitive) {
    this.possiblySensitive = possiblySensitive;
  }


  public Tweet promotedMetrics(TweetPromotedMetrics promotedMetrics) {
    
    this.promotedMetrics = promotedMetrics;
    return this;
  }

   /**
   * Get promotedMetrics
   * @return promotedMetrics
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public TweetPromotedMetrics getPromotedMetrics() {
    return promotedMetrics;
  }


  public void setPromotedMetrics(TweetPromotedMetrics promotedMetrics) {
    this.promotedMetrics = promotedMetrics;
  }


  public Tweet publicMetrics(TweetPublicMetrics publicMetrics) {
    
    this.publicMetrics = publicMetrics;
    return this;
  }

   /**
   * Get publicMetrics
   * @return publicMetrics
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public TweetPublicMetrics getPublicMetrics() {
    return publicMetrics;
  }


  public void setPublicMetrics(TweetPublicMetrics publicMetrics) {
    this.publicMetrics = publicMetrics;
  }


  public Tweet referencedTweets(List<TweetReferencedTweets> referencedTweets) {
    
    this.referencedTweets = referencedTweets;
    return this;
  }

  public Tweet addReferencedTweetsItem(TweetReferencedTweets referencedTweetsItem) {
    if (this.referencedTweets == null) {
      this.referencedTweets = new ArrayList<>();
    }
    this.referencedTweets.add(referencedTweetsItem);
    return this;
  }

   /**
   * A list of Tweets this Tweet refers to. For example, if the parent Tweet is a Retweet, a Quoted Tweet or a Reply, it will include the related Tweet referenced to by its parent.
   * @return referencedTweets
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A list of Tweets this Tweet refers to. For example, if the parent Tweet is a Retweet, a Quoted Tweet or a Reply, it will include the related Tweet referenced to by its parent.")

  public List<TweetReferencedTweets> getReferencedTweets() {
    return referencedTweets;
  }


  public void setReferencedTweets(List<TweetReferencedTweets> referencedTweets) {
    this.referencedTweets = referencedTweets;
  }


  public Tweet replySettings(ReplySettings replySettings) {
    
    this.replySettings = replySettings;
    return this;
  }

   /**
   * Get replySettings
   * @return replySettings
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ReplySettings getReplySettings() {
    return replySettings;
  }


  public void setReplySettings(ReplySettings replySettings) {
    this.replySettings = replySettings;
  }


  public Tweet source(String source) {
    
    this.source = source;
    return this;
  }

   /**
   * The name of the app the user Tweeted from.
   * @return source
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The name of the app the user Tweeted from.")

  public String getSource() {
    return source;
  }


  public void setSource(String source) {
    this.source = source;
  }


  public Tweet text(String text) {
    
    this.text = text;
    return this;
  }

   /**
   * The content of the Tweet.
   * @return text
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "Learn how to use the user Tweet timeline and user mention timeline endpoints in the Twitter API v2 to explore Tweet\\u2026 https://t.co/56a0vZUx7i", required = true, value = "The content of the Tweet.")

  public String getText() {
    return text;
  }


  public void setText(String text) {
    this.text = text;
  }


  public Tweet withheld(TweetWithheld withheld) {
    
    this.withheld = withheld;
    return this;
  }

   /**
   * Get withheld
   * @return withheld
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public TweetWithheld getWithheld() {
    return withheld;
  }


  public void setWithheld(TweetWithheld withheld) {
    this.withheld = withheld;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Tweet tweet = (Tweet) o;
    return Objects.equals(this.attachments, tweet.attachments) &&
        Objects.equals(this.authorId, tweet.authorId) &&
        Objects.equals(this.contextAnnotations, tweet.contextAnnotations) &&
        Objects.equals(this.conversationId, tweet.conversationId) &&
        Objects.equals(this.createdAt, tweet.createdAt) &&
        Objects.equals(this.editControls, tweet.editControls) &&
        Objects.equals(this.editHistoryTweetIds, tweet.editHistoryTweetIds) &&
        Objects.equals(this.entities, tweet.entities) &&
        Objects.equals(this.geo, tweet.geo) &&
        Objects.equals(this.id, tweet.id) &&
        Objects.equals(this.inReplyToUserId, tweet.inReplyToUserId) &&
        Objects.equals(this.lang, tweet.lang) &&
        Objects.equals(this.nonPublicMetrics, tweet.nonPublicMetrics) &&
        Objects.equals(this.organicMetrics, tweet.organicMetrics) &&
        Objects.equals(this.possiblySensitive, tweet.possiblySensitive) &&
        Objects.equals(this.promotedMetrics, tweet.promotedMetrics) &&
        Objects.equals(this.publicMetrics, tweet.publicMetrics) &&
        Objects.equals(this.referencedTweets, tweet.referencedTweets) &&
        Objects.equals(this.replySettings, tweet.replySettings) &&
        Objects.equals(this.source, tweet.source) &&
        Objects.equals(this.text, tweet.text) &&
        Objects.equals(this.withheld, tweet.withheld);
  }

  @Override
  public int hashCode() {
    return Objects.hash(attachments, authorId, contextAnnotations, conversationId, createdAt, editControls, editHistoryTweetIds, entities, geo, id, inReplyToUserId, lang, nonPublicMetrics, organicMetrics, possiblySensitive, promotedMetrics, publicMetrics, referencedTweets, replySettings, source, text, withheld);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Tweet {\n");
    sb.append("    attachments: ").append(toIndentedString(attachments)).append("\n");
    sb.append("    authorId: ").append(toIndentedString(authorId)).append("\n");
    sb.append("    contextAnnotations: ").append(toIndentedString(contextAnnotations)).append("\n");
    sb.append("    conversationId: ").append(toIndentedString(conversationId)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    editControls: ").append(toIndentedString(editControls)).append("\n");
    sb.append("    editHistoryTweetIds: ").append(toIndentedString(editHistoryTweetIds)).append("\n");
    sb.append("    entities: ").append(toIndentedString(entities)).append("\n");
    sb.append("    geo: ").append(toIndentedString(geo)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    inReplyToUserId: ").append(toIndentedString(inReplyToUserId)).append("\n");
    sb.append("    lang: ").append(toIndentedString(lang)).append("\n");
    sb.append("    nonPublicMetrics: ").append(toIndentedString(nonPublicMetrics)).append("\n");
    sb.append("    organicMetrics: ").append(toIndentedString(organicMetrics)).append("\n");
    sb.append("    possiblySensitive: ").append(toIndentedString(possiblySensitive)).append("\n");
    sb.append("    promotedMetrics: ").append(toIndentedString(promotedMetrics)).append("\n");
    sb.append("    publicMetrics: ").append(toIndentedString(publicMetrics)).append("\n");
    sb.append("    referencedTweets: ").append(toIndentedString(referencedTweets)).append("\n");
    sb.append("    replySettings: ").append(toIndentedString(replySettings)).append("\n");
    sb.append("    source: ").append(toIndentedString(source)).append("\n");
    sb.append("    text: ").append(toIndentedString(text)).append("\n");
    sb.append("    withheld: ").append(toIndentedString(withheld)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("attachments");
    openapiFields.add("author_id");
    openapiFields.add("context_annotations");
    openapiFields.add("conversation_id");
    openapiFields.add("created_at");
    openapiFields.add("edit_controls");
    openapiFields.add("edit_history_tweet_ids");
    openapiFields.add("entities");
    openapiFields.add("geo");
    openapiFields.add("id");
    openapiFields.add("in_reply_to_user_id");
    openapiFields.add("lang");
    openapiFields.add("non_public_metrics");
    openapiFields.add("organic_metrics");
    openapiFields.add("possibly_sensitive");
    openapiFields.add("promoted_metrics");
    openapiFields.add("public_metrics");
    openapiFields.add("referenced_tweets");
    openapiFields.add("reply_settings");
    openapiFields.add("source");
    openapiFields.add("text");
    openapiFields.add("withheld");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("edit_history_tweet_ids");
    openapiRequiredFields.add("id");
    openapiRequiredFields.add("text");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to Tweet
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
     // if (jsonObj == null) {
     //   if (Tweet.openapiRequiredFields.isEmpty()) {
     //     return;
     //   } else { // has required fields
     //     throw new IllegalArgumentException(String.format("The required field(s) %s in Tweet is not found in the empty JSON string", Tweet.openapiRequiredFields.toString()));
     //   }
     // }


      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : Tweet.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      // validate the optional field `attachments`
      if (jsonObj.getAsJsonObject("attachments") != null) {
        TweetAttachments.validateJsonObject(jsonObj.getAsJsonObject("attachments"));
      }
      if (jsonObj.get("author_id") != null && !jsonObj.get("author_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `author_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("author_id").toString()));
      }
      JsonArray jsonArraycontextAnnotations = jsonObj.getAsJsonArray("context_annotations");
      if (jsonArraycontextAnnotations != null) {
        // ensure the json data is an array
        if (!jsonObj.get("context_annotations").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `context_annotations` to be an array in the JSON string but got `%s`", jsonObj.get("context_annotations").toString()));
        }

        // validate the optional field `context_annotations` (array)
        for (int i = 0; i < jsonArraycontextAnnotations.size(); i++) {
          ContextAnnotation.validateJsonObject(jsonArraycontextAnnotations.get(i).getAsJsonObject());
        };
      }
      if (jsonObj.get("conversation_id") != null && !jsonObj.get("conversation_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `conversation_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("conversation_id").toString()));
      }
      // validate the optional field `edit_controls`
      if (jsonObj.getAsJsonObject("edit_controls") != null) {
        TweetEditControls.validateJsonObject(jsonObj.getAsJsonObject("edit_controls"));
      }
      // ensure the json data is an array
      if (jsonObj.get("edit_history_tweet_ids") != null && !jsonObj.get("edit_history_tweet_ids").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `edit_history_tweet_ids` to be an array in the JSON string but got `%s`", jsonObj.get("edit_history_tweet_ids").toString()));
      }
      // validate the optional field `entities`
      if (jsonObj.getAsJsonObject("entities") != null) {
        FullTextEntities.validateJsonObject(jsonObj.getAsJsonObject("entities"));
      }
      // validate the optional field `geo`
      if (jsonObj.getAsJsonObject("geo") != null) {
        TweetGeo.validateJsonObject(jsonObj.getAsJsonObject("geo"));
      }
      if (jsonObj.get("id") != null && !jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      if (jsonObj.get("in_reply_to_user_id") != null && !jsonObj.get("in_reply_to_user_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `in_reply_to_user_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("in_reply_to_user_id").toString()));
      }
      if (jsonObj.get("lang") != null && !jsonObj.get("lang").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `lang` to be a primitive type in the JSON string but got `%s`", jsonObj.get("lang").toString()));
      }
      // validate the optional field `non_public_metrics`
      if (jsonObj.getAsJsonObject("non_public_metrics") != null) {
        TweetNonPublicMetrics.validateJsonObject(jsonObj.getAsJsonObject("non_public_metrics"));
      }
      // validate the optional field `organic_metrics`
      if (jsonObj.getAsJsonObject("organic_metrics") != null) {
        TweetOrganicMetrics.validateJsonObject(jsonObj.getAsJsonObject("organic_metrics"));
      }
      // validate the optional field `promoted_metrics`
      if (jsonObj.getAsJsonObject("promoted_metrics") != null) {
        TweetPromotedMetrics.validateJsonObject(jsonObj.getAsJsonObject("promoted_metrics"));
      }
      // validate the optional field `public_metrics`
      if (jsonObj.getAsJsonObject("public_metrics") != null) {
        TweetPublicMetrics.validateJsonObject(jsonObj.getAsJsonObject("public_metrics"));
      }
      JsonArray jsonArrayreferencedTweets = jsonObj.getAsJsonArray("referenced_tweets");
      if (jsonArrayreferencedTweets != null) {
        // ensure the json data is an array
        if (!jsonObj.get("referenced_tweets").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `referenced_tweets` to be an array in the JSON string but got `%s`", jsonObj.get("referenced_tweets").toString()));
        }

        // validate the optional field `referenced_tweets` (array)
        for (int i = 0; i < jsonArrayreferencedTweets.size(); i++) {
          TweetReferencedTweets.validateJsonObject(jsonArrayreferencedTweets.get(i).getAsJsonObject());
        };
      }
      if (jsonObj.get("source") != null && !jsonObj.get("source").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `source` to be a primitive type in the JSON string but got `%s`", jsonObj.get("source").toString()));
      }
      if (jsonObj.get("text") != null && !jsonObj.get("text").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `text` to be a primitive type in the JSON string but got `%s`", jsonObj.get("text").toString()));
      }
      // validate the optional field `withheld`
      if (jsonObj.getAsJsonObject("withheld") != null) {
        TweetWithheld.validateJsonObject(jsonObj.getAsJsonObject("withheld"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Tweet.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Tweet' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Tweet> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Tweet.class));

       return (TypeAdapter<T>) new TypeAdapter<Tweet>() {
           @Override
           public void write(JsonWriter out, Tweet value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Tweet read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of Tweet given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Tweet
  * @throws IOException if the JSON string is invalid with respect to Tweet
  */
  public static Tweet fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Tweet.class);
  }

 /**
  * Convert an instance of Tweet to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

