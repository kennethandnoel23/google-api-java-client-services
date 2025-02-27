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

package com.google.api.services.dlp.v2.model;

/**
 * Message for specifying a window around a finding to apply a detection rule.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Sensitive Data Protection (DLP). For a detailed
 * explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GooglePrivacyDlpV2Proximity extends com.google.api.client.json.GenericJson {

  /**
   * Number of characters after the finding to consider.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer windowAfter;

  /**
   * Number of characters before the finding to consider. For tabular data, if you want to modify
   * the likelihood of an entire column of findngs, set this to 1. For more information, see
   * [Hotword example: Set the match likelihood of a table column]
   * (https://cloud.google.com/dlp/docs/creating-custom-infotypes-likelihood#match-column-values).
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer windowBefore;

  /**
   * Number of characters after the finding to consider.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getWindowAfter() {
    return windowAfter;
  }

  /**
   * Number of characters after the finding to consider.
   * @param windowAfter windowAfter or {@code null} for none
   */
  public GooglePrivacyDlpV2Proximity setWindowAfter(java.lang.Integer windowAfter) {
    this.windowAfter = windowAfter;
    return this;
  }

  /**
   * Number of characters before the finding to consider. For tabular data, if you want to modify
   * the likelihood of an entire column of findngs, set this to 1. For more information, see
   * [Hotword example: Set the match likelihood of a table column]
   * (https://cloud.google.com/dlp/docs/creating-custom-infotypes-likelihood#match-column-values).
   * @return value or {@code null} for none
   */
  public java.lang.Integer getWindowBefore() {
    return windowBefore;
  }

  /**
   * Number of characters before the finding to consider. For tabular data, if you want to modify
   * the likelihood of an entire column of findngs, set this to 1. For more information, see
   * [Hotword example: Set the match likelihood of a table column]
   * (https://cloud.google.com/dlp/docs/creating-custom-infotypes-likelihood#match-column-values).
   * @param windowBefore windowBefore or {@code null} for none
   */
  public GooglePrivacyDlpV2Proximity setWindowBefore(java.lang.Integer windowBefore) {
    this.windowBefore = windowBefore;
    return this;
  }

  @Override
  public GooglePrivacyDlpV2Proximity set(String fieldName, Object value) {
    return (GooglePrivacyDlpV2Proximity) super.set(fieldName, value);
  }

  @Override
  public GooglePrivacyDlpV2Proximity clone() {
    return (GooglePrivacyDlpV2Proximity) super.clone();
  }

}
