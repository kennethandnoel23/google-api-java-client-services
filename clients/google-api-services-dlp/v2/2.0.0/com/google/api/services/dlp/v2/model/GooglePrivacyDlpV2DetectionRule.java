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
 * Deprecated; use `InspectionRuleSet` instead. Rule for modifying a `CustomInfoType` to alter
 * behavior under certain circumstances, depending on the specific details of the rule. Not
 * supported for the `surrogate_type` custom infoType.
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
public final class GooglePrivacyDlpV2DetectionRule extends com.google.api.client.json.GenericJson {

  /**
   * Hotword-based detection rule.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GooglePrivacyDlpV2HotwordRule hotwordRule;

  /**
   * Hotword-based detection rule.
   * @return value or {@code null} for none
   */
  public GooglePrivacyDlpV2HotwordRule getHotwordRule() {
    return hotwordRule;
  }

  /**
   * Hotword-based detection rule.
   * @param hotwordRule hotwordRule or {@code null} for none
   */
  public GooglePrivacyDlpV2DetectionRule setHotwordRule(GooglePrivacyDlpV2HotwordRule hotwordRule) {
    this.hotwordRule = hotwordRule;
    return this;
  }

  @Override
  public GooglePrivacyDlpV2DetectionRule set(String fieldName, Object value) {
    return (GooglePrivacyDlpV2DetectionRule) super.set(fieldName, value);
  }

  @Override
  public GooglePrivacyDlpV2DetectionRule clone() {
    return (GooglePrivacyDlpV2DetectionRule) super.clone();
  }

}
