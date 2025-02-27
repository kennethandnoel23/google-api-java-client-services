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

package com.google.api.services.discoveryengine.v1beta.model;

/**
 * The OCR options for parsing documents.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Discovery Engine API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudDiscoveryengineV1alphaOcrConfig extends com.google.api.client.json.GenericJson {

  /**
   * Required. If OCR is enabled or not. OCR must be enabled for other OcrConfig options to apply.
   * We will only perform OCR on the first 80 pages of the PDF files.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean enabled;

  /**
   * Apply additional enhanced OCR processing to a list of document elements. Supported values: *
   * `table`: advanced table parsing model.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> enhancedDocumentElements;

  /**
   * If true, will use native text instead of OCR text on pages containing native text.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean useNativeText;

  /**
   * Required. If OCR is enabled or not. OCR must be enabled for other OcrConfig options to apply.
   * We will only perform OCR on the first 80 pages of the PDF files.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getEnabled() {
    return enabled;
  }

  /**
   * Required. If OCR is enabled or not. OCR must be enabled for other OcrConfig options to apply.
   * We will only perform OCR on the first 80 pages of the PDF files.
   * @param enabled enabled or {@code null} for none
   */
  public GoogleCloudDiscoveryengineV1alphaOcrConfig setEnabled(java.lang.Boolean enabled) {
    this.enabled = enabled;
    return this;
  }

  /**
   * Apply additional enhanced OCR processing to a list of document elements. Supported values: *
   * `table`: advanced table parsing model.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getEnhancedDocumentElements() {
    return enhancedDocumentElements;
  }

  /**
   * Apply additional enhanced OCR processing to a list of document elements. Supported values: *
   * `table`: advanced table parsing model.
   * @param enhancedDocumentElements enhancedDocumentElements or {@code null} for none
   */
  public GoogleCloudDiscoveryengineV1alphaOcrConfig setEnhancedDocumentElements(java.util.List<java.lang.String> enhancedDocumentElements) {
    this.enhancedDocumentElements = enhancedDocumentElements;
    return this;
  }

  /**
   * If true, will use native text instead of OCR text on pages containing native text.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getUseNativeText() {
    return useNativeText;
  }

  /**
   * If true, will use native text instead of OCR text on pages containing native text.
   * @param useNativeText useNativeText or {@code null} for none
   */
  public GoogleCloudDiscoveryengineV1alphaOcrConfig setUseNativeText(java.lang.Boolean useNativeText) {
    this.useNativeText = useNativeText;
    return this;
  }

  @Override
  public GoogleCloudDiscoveryengineV1alphaOcrConfig set(String fieldName, Object value) {
    return (GoogleCloudDiscoveryengineV1alphaOcrConfig) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudDiscoveryengineV1alphaOcrConfig clone() {
    return (GoogleCloudDiscoveryengineV1alphaOcrConfig) super.clone();
  }

}
