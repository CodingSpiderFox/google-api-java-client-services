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

package com.google.api.services.firebase.v1beta1.model;

/**
 * Model definition for AnalyticsDetails.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Firebase Management API. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class AnalyticsDetails extends com.google.api.client.json.GenericJson {

  /**
   * The Analytics Property object associated with the specified `FirebaseProject`.
   *
   * This object contains the details of the Google Analytics property associated with the Project.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private AnalyticsProperty analyticsProperty;

  /**
   * For `AndroidApps` and `IosApps`: a map of `app` to `streamId` for each   Firebase App in the
   * specified `FirebaseProject`. Each `app` and   `streamId` appears only once. For `WebApps`: a
   * map of `app` to `streamId` and `measurementId` for   each `WebApp` in the specified
   * `FirebaseProject`. Each `app`, `streamId`,   and `measurementId` appears only once.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<StreamMapping> streamMappings;

  /**
   * The Analytics Property object associated with the specified `FirebaseProject`.
   *
   * This object contains the details of the Google Analytics property associated with the Project.
   * @return value or {@code null} for none
   */
  public AnalyticsProperty getAnalyticsProperty() {
    return analyticsProperty;
  }

  /**
   * The Analytics Property object associated with the specified `FirebaseProject`.
   *
   * This object contains the details of the Google Analytics property associated with the Project.
   * @param analyticsProperty analyticsProperty or {@code null} for none
   */
  public AnalyticsDetails setAnalyticsProperty(AnalyticsProperty analyticsProperty) {
    this.analyticsProperty = analyticsProperty;
    return this;
  }

  /**
   * For `AndroidApps` and `IosApps`: a map of `app` to `streamId` for each   Firebase App in the
   * specified `FirebaseProject`. Each `app` and   `streamId` appears only once. For `WebApps`: a
   * map of `app` to `streamId` and `measurementId` for   each `WebApp` in the specified
   * `FirebaseProject`. Each `app`, `streamId`,   and `measurementId` appears only once.
   * @return value or {@code null} for none
   */
  public java.util.List<StreamMapping> getStreamMappings() {
    return streamMappings;
  }

  /**
   * For `AndroidApps` and `IosApps`: a map of `app` to `streamId` for each   Firebase App in the
   * specified `FirebaseProject`. Each `app` and   `streamId` appears only once. For `WebApps`: a
   * map of `app` to `streamId` and `measurementId` for   each `WebApp` in the specified
   * `FirebaseProject`. Each `app`, `streamId`,   and `measurementId` appears only once.
   * @param streamMappings streamMappings or {@code null} for none
   */
  public AnalyticsDetails setStreamMappings(java.util.List<StreamMapping> streamMappings) {
    this.streamMappings = streamMappings;
    return this;
  }

  @Override
  public AnalyticsDetails set(String fieldName, Object value) {
    return (AnalyticsDetails) super.set(fieldName, value);
  }

  @Override
  public AnalyticsDetails clone() {
    return (AnalyticsDetails) super.clone();
  }

}
