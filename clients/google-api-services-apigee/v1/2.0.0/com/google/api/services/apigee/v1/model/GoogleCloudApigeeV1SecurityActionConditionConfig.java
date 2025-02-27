/*
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */
/*
 * This code was generated by https://github.com/googleapis/google-api-java-client-services/
 * Modify at your own risk.
 */

package com.google.api.services.apigee.v1.model;

/**
 * The following are a list of conditions. A valid SecurityAction must contain at least one
 * condition. Within a condition, each element is ORed. Across conditions elements are ANDed. For
 * example if a SecurityAction has the following: api_keys: ["key1", "key2"] and developers:
 * ["dev1", "dev2"] then this is interpreted as: enforce the action if the incoming request has
 * ((api_key = "key1" OR api_key="key") AND (developer="dev1" OR developer="dev2")).
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Apigee API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudApigeeV1SecurityActionConditionConfig extends com.google.api.client.json.GenericJson {

  /**
   * Optional. A list of Bot Reasons. Current options: Flooder, Brute Guessor, Static Content
   * Scraper, OAuth Abuser, Robot Abuser, TorListRule, Advanced Anomaly Detection, Advanced API
   * Scraper, Search Engine Crawlers, Public Clouds, Public Cloud AWS, Public Cloud Azure, and
   * Public Cloud Google.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> botReasons;

  /**
   * Optional. A list of IP addresses. This could be either IPv4 or IPv6. Limited to 100 per action.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> ipAddressRanges;

  /**
   * Optional. A list of Bot Reasons. Current options: Flooder, Brute Guessor, Static Content
   * Scraper, OAuth Abuser, Robot Abuser, TorListRule, Advanced Anomaly Detection, Advanced API
   * Scraper, Search Engine Crawlers, Public Clouds, Public Cloud AWS, Public Cloud Azure, and
   * Public Cloud Google.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getBotReasons() {
    return botReasons;
  }

  /**
   * Optional. A list of Bot Reasons. Current options: Flooder, Brute Guessor, Static Content
   * Scraper, OAuth Abuser, Robot Abuser, TorListRule, Advanced Anomaly Detection, Advanced API
   * Scraper, Search Engine Crawlers, Public Clouds, Public Cloud AWS, Public Cloud Azure, and
   * Public Cloud Google.
   * @param botReasons botReasons or {@code null} for none
   */
  public GoogleCloudApigeeV1SecurityActionConditionConfig setBotReasons(java.util.List<java.lang.String> botReasons) {
    this.botReasons = botReasons;
    return this;
  }

  /**
   * Optional. A list of IP addresses. This could be either IPv4 or IPv6. Limited to 100 per action.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getIpAddressRanges() {
    return ipAddressRanges;
  }

  /**
   * Optional. A list of IP addresses. This could be either IPv4 or IPv6. Limited to 100 per action.
   * @param ipAddressRanges ipAddressRanges or {@code null} for none
   */
  public GoogleCloudApigeeV1SecurityActionConditionConfig setIpAddressRanges(java.util.List<java.lang.String> ipAddressRanges) {
    this.ipAddressRanges = ipAddressRanges;
    return this;
  }

  @Override
  public GoogleCloudApigeeV1SecurityActionConditionConfig set(String fieldName, Object value) {
    return (GoogleCloudApigeeV1SecurityActionConditionConfig) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudApigeeV1SecurityActionConditionConfig clone() {
    return (GoogleCloudApigeeV1SecurityActionConditionConfig) super.clone();
  }

}
