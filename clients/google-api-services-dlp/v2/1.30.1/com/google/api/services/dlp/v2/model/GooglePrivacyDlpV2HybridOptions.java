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
 * Configuration to control jobs where the content being inspected is outside of Google Cloud
 * Platform.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Data Loss Prevention (DLP) API. For a detailed
 * explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GooglePrivacyDlpV2HybridOptions extends com.google.api.client.json.GenericJson {

  /**
   * A short description of where the data is coming from. Will be stored once in the job. 256 max
   * length.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String description;

  /**
   * To organize findings, these labels will be added to each finding.
   *
   * Label keys must be between 1 and 63 characters long and must conform to the following regular
   * expression: \[a-z\](\[-a-z0-9\]*\[a-z0-9\])?.
   *
   * Label values must be between 0 and 63 characters long and must conform to the regular
   * expression (\[a-z\](\[-a-z0-9\]*\[a-z0-9\])?)?.
   *
   * No more than 10 labels can be associated with a given finding.
   *
   * Example: "environment" : "production" Example: "pipeline" : "etl"
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.Map<String, java.lang.String> labels;

  /**
   * These are labels that each inspection request must include within their 'finding_labels' map.
   * Request may contain others, but any missing one of these will be rejected.
   *
   * Label keys must be between 1 and 63 characters long and must conform to the following regular
   * expression: \[a-z\](\[-a-z0-9\]*\[a-z0-9\])?.
   *
   * No more than 10 keys can be required.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> requiredFindingLabelKeys;

  /**
   * If the container is a table, additional information to make findings meaningful such as the
   * columns that are primary keys.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GooglePrivacyDlpV2TableOptions tableOptions;

  /**
   * A short description of where the data is coming from. Will be stored once in the job. 256 max
   * length.
   * @return value or {@code null} for none
   */
  public java.lang.String getDescription() {
    return description;
  }

  /**
   * A short description of where the data is coming from. Will be stored once in the job. 256 max
   * length.
   * @param description description or {@code null} for none
   */
  public GooglePrivacyDlpV2HybridOptions setDescription(java.lang.String description) {
    this.description = description;
    return this;
  }

  /**
   * To organize findings, these labels will be added to each finding.
   *
   * Label keys must be between 1 and 63 characters long and must conform to the following regular
   * expression: \[a-z\](\[-a-z0-9\]*\[a-z0-9\])?.
   *
   * Label values must be between 0 and 63 characters long and must conform to the regular
   * expression (\[a-z\](\[-a-z0-9\]*\[a-z0-9\])?)?.
   *
   * No more than 10 labels can be associated with a given finding.
   *
   * Example: "environment" : "production" Example: "pipeline" : "etl"
   * @return value or {@code null} for none
   */
  public java.util.Map<String, java.lang.String> getLabels() {
    return labels;
  }

  /**
   * To organize findings, these labels will be added to each finding.
   *
   * Label keys must be between 1 and 63 characters long and must conform to the following regular
   * expression: \[a-z\](\[-a-z0-9\]*\[a-z0-9\])?.
   *
   * Label values must be between 0 and 63 characters long and must conform to the regular
   * expression (\[a-z\](\[-a-z0-9\]*\[a-z0-9\])?)?.
   *
   * No more than 10 labels can be associated with a given finding.
   *
   * Example: "environment" : "production" Example: "pipeline" : "etl"
   * @param labels labels or {@code null} for none
   */
  public GooglePrivacyDlpV2HybridOptions setLabels(java.util.Map<String, java.lang.String> labels) {
    this.labels = labels;
    return this;
  }

  /**
   * These are labels that each inspection request must include within their 'finding_labels' map.
   * Request may contain others, but any missing one of these will be rejected.
   *
   * Label keys must be between 1 and 63 characters long and must conform to the following regular
   * expression: \[a-z\](\[-a-z0-9\]*\[a-z0-9\])?.
   *
   * No more than 10 keys can be required.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getRequiredFindingLabelKeys() {
    return requiredFindingLabelKeys;
  }

  /**
   * These are labels that each inspection request must include within their 'finding_labels' map.
   * Request may contain others, but any missing one of these will be rejected.
   *
   * Label keys must be between 1 and 63 characters long and must conform to the following regular
   * expression: \[a-z\](\[-a-z0-9\]*\[a-z0-9\])?.
   *
   * No more than 10 keys can be required.
   * @param requiredFindingLabelKeys requiredFindingLabelKeys or {@code null} for none
   */
  public GooglePrivacyDlpV2HybridOptions setRequiredFindingLabelKeys(java.util.List<java.lang.String> requiredFindingLabelKeys) {
    this.requiredFindingLabelKeys = requiredFindingLabelKeys;
    return this;
  }

  /**
   * If the container is a table, additional information to make findings meaningful such as the
   * columns that are primary keys.
   * @return value or {@code null} for none
   */
  public GooglePrivacyDlpV2TableOptions getTableOptions() {
    return tableOptions;
  }

  /**
   * If the container is a table, additional information to make findings meaningful such as the
   * columns that are primary keys.
   * @param tableOptions tableOptions or {@code null} for none
   */
  public GooglePrivacyDlpV2HybridOptions setTableOptions(GooglePrivacyDlpV2TableOptions tableOptions) {
    this.tableOptions = tableOptions;
    return this;
  }

  @Override
  public GooglePrivacyDlpV2HybridOptions set(String fieldName, Object value) {
    return (GooglePrivacyDlpV2HybridOptions) super.set(fieldName, value);
  }

  @Override
  public GooglePrivacyDlpV2HybridOptions clone() {
    return (GooglePrivacyDlpV2HybridOptions) super.clone();
  }

}