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

package com.google.api.services.discoveryengine.v1alpha.model;

/**
 * Request message for CompletionService.CompleteQuery method.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Discovery Engine API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudDiscoveryengineV1alphaCompleteQueryRequest extends com.google.api.client.json.GenericJson {

  /**
   * Required. The parent data store resource name for which the completion is performed, such as
   * `projects/locations/global/collections/default_collection/dataStores/default_data_store`.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String dataStore;

  /**
   * Indicates if tail suggestions should be returned if there are no suggestions that match the
   * full query. Even if set to true, if there are suggestions that match the full query, those are
   * returned and no tail suggestions are returned.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean includeTailSuggestions;

  /**
   * Required. The typeahead input used to fetch suggestions. Maximum length is 128 characters.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String query;

  /**
   * Specifies the autocomplete data model. This overrides any model specified in the Configuration
   * > Autocomplete section of the Cloud console. Currently supported values: * `document` - Using
   * suggestions generated from user-imported documents. * `search-history` - Using suggestions
   * generated from the past history of SearchService.Search API calls. Do not use it when there is
   * no traffic for Search API. * `user-event` - Using suggestions generated from user-imported
   * search events. * `document-completable` - Using suggestions taken directly from user-imported
   * document fields marked as completable. Default values: * `document` is the default model for
   * regular dataStores. * `search-history` is the default model for site search dataStores.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String queryModel;

  /**
   * A unique identifier for tracking visitors. For example, this could be implemented with an HTTP
   * cookie, which should be able to uniquely identify a visitor on a single device. This unique
   * identifier should not change if the visitor logs in or out of the website. This field should
   * NOT have a fixed value such as `unknown_visitor`. This should be the same identifier as
   * UserEvent.user_pseudo_id and SearchRequest.user_pseudo_id. The field must be a UTF-8 encoded
   * string with a length limit of 128 characters. Otherwise, an `INVALID_ARGUMENT` error is
   * returned.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String userPseudoId;

  /**
   * Required. The parent data store resource name for which the completion is performed, such as
   * `projects/locations/global/collections/default_collection/dataStores/default_data_store`.
   * @return value or {@code null} for none
   */
  public java.lang.String getDataStore() {
    return dataStore;
  }

  /**
   * Required. The parent data store resource name for which the completion is performed, such as
   * `projects/locations/global/collections/default_collection/dataStores/default_data_store`.
   * @param dataStore dataStore or {@code null} for none
   */
  public GoogleCloudDiscoveryengineV1alphaCompleteQueryRequest setDataStore(java.lang.String dataStore) {
    this.dataStore = dataStore;
    return this;
  }

  /**
   * Indicates if tail suggestions should be returned if there are no suggestions that match the
   * full query. Even if set to true, if there are suggestions that match the full query, those are
   * returned and no tail suggestions are returned.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getIncludeTailSuggestions() {
    return includeTailSuggestions;
  }

  /**
   * Indicates if tail suggestions should be returned if there are no suggestions that match the
   * full query. Even if set to true, if there are suggestions that match the full query, those are
   * returned and no tail suggestions are returned.
   * @param includeTailSuggestions includeTailSuggestions or {@code null} for none
   */
  public GoogleCloudDiscoveryengineV1alphaCompleteQueryRequest setIncludeTailSuggestions(java.lang.Boolean includeTailSuggestions) {
    this.includeTailSuggestions = includeTailSuggestions;
    return this;
  }

  /**
   * Required. The typeahead input used to fetch suggestions. Maximum length is 128 characters.
   * @return value or {@code null} for none
   */
  public java.lang.String getQuery() {
    return query;
  }

  /**
   * Required. The typeahead input used to fetch suggestions. Maximum length is 128 characters.
   * @param query query or {@code null} for none
   */
  public GoogleCloudDiscoveryengineV1alphaCompleteQueryRequest setQuery(java.lang.String query) {
    this.query = query;
    return this;
  }

  /**
   * Specifies the autocomplete data model. This overrides any model specified in the Configuration
   * > Autocomplete section of the Cloud console. Currently supported values: * `document` - Using
   * suggestions generated from user-imported documents. * `search-history` - Using suggestions
   * generated from the past history of SearchService.Search API calls. Do not use it when there is
   * no traffic for Search API. * `user-event` - Using suggestions generated from user-imported
   * search events. * `document-completable` - Using suggestions taken directly from user-imported
   * document fields marked as completable. Default values: * `document` is the default model for
   * regular dataStores. * `search-history` is the default model for site search dataStores.
   * @return value or {@code null} for none
   */
  public java.lang.String getQueryModel() {
    return queryModel;
  }

  /**
   * Specifies the autocomplete data model. This overrides any model specified in the Configuration
   * > Autocomplete section of the Cloud console. Currently supported values: * `document` - Using
   * suggestions generated from user-imported documents. * `search-history` - Using suggestions
   * generated from the past history of SearchService.Search API calls. Do not use it when there is
   * no traffic for Search API. * `user-event` - Using suggestions generated from user-imported
   * search events. * `document-completable` - Using suggestions taken directly from user-imported
   * document fields marked as completable. Default values: * `document` is the default model for
   * regular dataStores. * `search-history` is the default model for site search dataStores.
   * @param queryModel queryModel or {@code null} for none
   */
  public GoogleCloudDiscoveryengineV1alphaCompleteQueryRequest setQueryModel(java.lang.String queryModel) {
    this.queryModel = queryModel;
    return this;
  }

  /**
   * A unique identifier for tracking visitors. For example, this could be implemented with an HTTP
   * cookie, which should be able to uniquely identify a visitor on a single device. This unique
   * identifier should not change if the visitor logs in or out of the website. This field should
   * NOT have a fixed value such as `unknown_visitor`. This should be the same identifier as
   * UserEvent.user_pseudo_id and SearchRequest.user_pseudo_id. The field must be a UTF-8 encoded
   * string with a length limit of 128 characters. Otherwise, an `INVALID_ARGUMENT` error is
   * returned.
   * @return value or {@code null} for none
   */
  public java.lang.String getUserPseudoId() {
    return userPseudoId;
  }

  /**
   * A unique identifier for tracking visitors. For example, this could be implemented with an HTTP
   * cookie, which should be able to uniquely identify a visitor on a single device. This unique
   * identifier should not change if the visitor logs in or out of the website. This field should
   * NOT have a fixed value such as `unknown_visitor`. This should be the same identifier as
   * UserEvent.user_pseudo_id and SearchRequest.user_pseudo_id. The field must be a UTF-8 encoded
   * string with a length limit of 128 characters. Otherwise, an `INVALID_ARGUMENT` error is
   * returned.
   * @param userPseudoId userPseudoId or {@code null} for none
   */
  public GoogleCloudDiscoveryengineV1alphaCompleteQueryRequest setUserPseudoId(java.lang.String userPseudoId) {
    this.userPseudoId = userPseudoId;
    return this;
  }

  @Override
  public GoogleCloudDiscoveryengineV1alphaCompleteQueryRequest set(String fieldName, Object value) {
    return (GoogleCloudDiscoveryengineV1alphaCompleteQueryRequest) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudDiscoveryengineV1alphaCompleteQueryRequest clone() {
    return (GoogleCloudDiscoveryengineV1alphaCompleteQueryRequest) super.clone();
  }

}
