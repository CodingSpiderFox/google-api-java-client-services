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

package com.google.firebaserules.v1.model;

/**
 * The response for FirebaseRulesService.GetReleaseExecutable
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Firebase Rules API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GetReleaseExecutableResponse extends com.google.api.client.json.GenericJson {

  /**
   * Executable view of the `Ruleset` referenced by the `Release`.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String executable;

  /**
   * The Rules runtime version of the executable.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String executableVersion;

  /**
   * `Language` used to generate the executable bytes.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String language;

  /**
   * `Ruleset` name associated with the `Release` executable.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String rulesetName;

  /**
   * Optional, indicates the freshness of the result. The response is guaranteed to be the latest
   * within an interval up to the sync_time (inclusive).
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String syncTime;

  /**
   * Timestamp for the most recent `Release.update_time`.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String updateTime;

  /**
   * Executable view of the `Ruleset` referenced by the `Release`.
   * @see #decodeExecutable()
   * @return value or {@code null} for none
   */
  public java.lang.String getExecutable() {
    return executable;
  }

  /**
   * Executable view of the `Ruleset` referenced by the `Release`.
   * @see #getExecutable()
   * @return Base64 decoded value or {@code null} for none
   *
   * @since 1.14
   */
  public byte[] decodeExecutable() {
    return com.google.api.client.util.Base64.decodeBase64(executable);
  }

  /**
   * Executable view of the `Ruleset` referenced by the `Release`.
   * @see #encodeExecutable()
   * @param executable executable or {@code null} for none
   */
  public GetReleaseExecutableResponse setExecutable(java.lang.String executable) {
    this.executable = executable;
    return this;
  }

  /**
   * Executable view of the `Ruleset` referenced by the `Release`.
   * @see #setExecutable()
   *
   * <p>
   * The value is encoded Base64 or {@code null} for none.
   * </p>
   *
   * @since 1.14
   */
  public GetReleaseExecutableResponse encodeExecutable(byte[] executable) {
    this.executable = com.google.api.client.util.Base64.encodeBase64URLSafeString(executable);
    return this;
  }

  /**
   * The Rules runtime version of the executable.
   * @return value or {@code null} for none
   */
  public java.lang.String getExecutableVersion() {
    return executableVersion;
  }

  /**
   * The Rules runtime version of the executable.
   * @param executableVersion executableVersion or {@code null} for none
   */
  public GetReleaseExecutableResponse setExecutableVersion(java.lang.String executableVersion) {
    this.executableVersion = executableVersion;
    return this;
  }

  /**
   * `Language` used to generate the executable bytes.
   * @return value or {@code null} for none
   */
  public java.lang.String getLanguage() {
    return language;
  }

  /**
   * `Language` used to generate the executable bytes.
   * @param language language or {@code null} for none
   */
  public GetReleaseExecutableResponse setLanguage(java.lang.String language) {
    this.language = language;
    return this;
  }

  /**
   * `Ruleset` name associated with the `Release` executable.
   * @return value or {@code null} for none
   */
  public java.lang.String getRulesetName() {
    return rulesetName;
  }

  /**
   * `Ruleset` name associated with the `Release` executable.
   * @param rulesetName rulesetName or {@code null} for none
   */
  public GetReleaseExecutableResponse setRulesetName(java.lang.String rulesetName) {
    this.rulesetName = rulesetName;
    return this;
  }

  /**
   * Optional, indicates the freshness of the result. The response is guaranteed to be the latest
   * within an interval up to the sync_time (inclusive).
   * @return value or {@code null} for none
   */
  public String getSyncTime() {
    return syncTime;
  }

  /**
   * Optional, indicates the freshness of the result. The response is guaranteed to be the latest
   * within an interval up to the sync_time (inclusive).
   * @param syncTime syncTime or {@code null} for none
   */
  public GetReleaseExecutableResponse setSyncTime(String syncTime) {
    this.syncTime = syncTime;
    return this;
  }

  /**
   * Timestamp for the most recent `Release.update_time`.
   * @return value or {@code null} for none
   */
  public String getUpdateTime() {
    return updateTime;
  }

  /**
   * Timestamp for the most recent `Release.update_time`.
   * @param updateTime updateTime or {@code null} for none
   */
  public GetReleaseExecutableResponse setUpdateTime(String updateTime) {
    this.updateTime = updateTime;
    return this;
  }

  @Override
  public GetReleaseExecutableResponse set(String fieldName, Object value) {
    return (GetReleaseExecutableResponse) super.set(fieldName, value);
  }

  @Override
  public GetReleaseExecutableResponse clone() {
    return (GetReleaseExecutableResponse) super.clone();
  }

}
