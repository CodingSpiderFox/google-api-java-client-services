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

package com.google.api.services.logging.v2.model;

/**
 * Information about entries that were omitted from the session.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Logging API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class SuppressionInfo extends com.google.api.client.json.GenericJson {

  /**
   * The reason that entries were omitted from the session.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String reason;

  /**
   * A lower bound on the count of entries omitted due to reason.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer suppressedCount;

  /**
   * The reason that entries were omitted from the session.
   * @return value or {@code null} for none
   */
  public java.lang.String getReason() {
    return reason;
  }

  /**
   * The reason that entries were omitted from the session.
   * @param reason reason or {@code null} for none
   */
  public SuppressionInfo setReason(java.lang.String reason) {
    this.reason = reason;
    return this;
  }

  /**
   * A lower bound on the count of entries omitted due to reason.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getSuppressedCount() {
    return suppressedCount;
  }

  /**
   * A lower bound on the count of entries omitted due to reason.
   * @param suppressedCount suppressedCount or {@code null} for none
   */
  public SuppressionInfo setSuppressedCount(java.lang.Integer suppressedCount) {
    this.suppressedCount = suppressedCount;
    return this;
  }

  @Override
  public SuppressionInfo set(String fieldName, Object value) {
    return (SuppressionInfo) super.set(fieldName, value);
  }

  @Override
  public SuppressionInfo clone() {
    return (SuppressionInfo) super.clone();
  }

}
