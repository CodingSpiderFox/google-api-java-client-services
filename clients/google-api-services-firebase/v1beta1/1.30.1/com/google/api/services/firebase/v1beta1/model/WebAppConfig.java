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
 * Configuration metadata of a single Firebase App for the web.
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
public final class WebAppConfig extends com.google.api.client.json.GenericJson {

  /**
   * The API key associated with the `WebApp`.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String apiKey;

  /**
   * Immutable. The globally unique, Firebase-assigned identifier for the `WebApp`.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String appId;

  /**
   * The domain Firebase Auth configures for OAuth redirects, in the format:
   * PROJECT_ID.firebaseapp.com
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String authDomain;

  /**
   * The default Firebase Realtime Database URL.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String databaseURL;

  /**
   * The ID of the Project's default GCP resource location. The location is one of the available
   * [GCP resource locations](https://firebase.google.com/docs/projects/locations).
   *
   * This field is omitted if the default GCP resource location has not been finalized yet. To set a
   * Project's default GCP resource location, call
   * [`FinalizeDefaultLocation`](../projects.defaultLocation/finalize) after you add Firebase
   * resources to the Project.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String locationId;

  /**
   * This field will no longer be provided here. Instead, use `GetAnalyticsDetails`
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String measurementId;

  /**
   * The sender ID for use with Firebase Cloud Messaging.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String messagingSenderId;

  /**
   * Immutable. A user-assigned unique identifier for the `FirebaseProject`.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String projectId;

  /**
   * The default Cloud Storage for Firebase storage bucket name.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String storageBucket;

  /**
   * The API key associated with the `WebApp`.
   * @return value or {@code null} for none
   */
  public java.lang.String getApiKey() {
    return apiKey;
  }

  /**
   * The API key associated with the `WebApp`.
   * @param apiKey apiKey or {@code null} for none
   */
  public WebAppConfig setApiKey(java.lang.String apiKey) {
    this.apiKey = apiKey;
    return this;
  }

  /**
   * Immutable. The globally unique, Firebase-assigned identifier for the `WebApp`.
   * @return value or {@code null} for none
   */
  public java.lang.String getAppId() {
    return appId;
  }

  /**
   * Immutable. The globally unique, Firebase-assigned identifier for the `WebApp`.
   * @param appId appId or {@code null} for none
   */
  public WebAppConfig setAppId(java.lang.String appId) {
    this.appId = appId;
    return this;
  }

  /**
   * The domain Firebase Auth configures for OAuth redirects, in the format:
   * PROJECT_ID.firebaseapp.com
   * @return value or {@code null} for none
   */
  public java.lang.String getAuthDomain() {
    return authDomain;
  }

  /**
   * The domain Firebase Auth configures for OAuth redirects, in the format:
   * PROJECT_ID.firebaseapp.com
   * @param authDomain authDomain or {@code null} for none
   */
  public WebAppConfig setAuthDomain(java.lang.String authDomain) {
    this.authDomain = authDomain;
    return this;
  }

  /**
   * The default Firebase Realtime Database URL.
   * @return value or {@code null} for none
   */
  public java.lang.String getDatabaseURL() {
    return databaseURL;
  }

  /**
   * The default Firebase Realtime Database URL.
   * @param databaseURL databaseURL or {@code null} for none
   */
  public WebAppConfig setDatabaseURL(java.lang.String databaseURL) {
    this.databaseURL = databaseURL;
    return this;
  }

  /**
   * The ID of the Project's default GCP resource location. The location is one of the available
   * [GCP resource locations](https://firebase.google.com/docs/projects/locations).
   *
   * This field is omitted if the default GCP resource location has not been finalized yet. To set a
   * Project's default GCP resource location, call
   * [`FinalizeDefaultLocation`](../projects.defaultLocation/finalize) after you add Firebase
   * resources to the Project.
   * @return value or {@code null} for none
   */
  public java.lang.String getLocationId() {
    return locationId;
  }

  /**
   * The ID of the Project's default GCP resource location. The location is one of the available
   * [GCP resource locations](https://firebase.google.com/docs/projects/locations).
   *
   * This field is omitted if the default GCP resource location has not been finalized yet. To set a
   * Project's default GCP resource location, call
   * [`FinalizeDefaultLocation`](../projects.defaultLocation/finalize) after you add Firebase
   * resources to the Project.
   * @param locationId locationId or {@code null} for none
   */
  public WebAppConfig setLocationId(java.lang.String locationId) {
    this.locationId = locationId;
    return this;
  }

  /**
   * This field will no longer be provided here. Instead, use `GetAnalyticsDetails`
   * @return value or {@code null} for none
   */
  public java.lang.String getMeasurementId() {
    return measurementId;
  }

  /**
   * This field will no longer be provided here. Instead, use `GetAnalyticsDetails`
   * @param measurementId measurementId or {@code null} for none
   */
  public WebAppConfig setMeasurementId(java.lang.String measurementId) {
    this.measurementId = measurementId;
    return this;
  }

  /**
   * The sender ID for use with Firebase Cloud Messaging.
   * @return value or {@code null} for none
   */
  public java.lang.String getMessagingSenderId() {
    return messagingSenderId;
  }

  /**
   * The sender ID for use with Firebase Cloud Messaging.
   * @param messagingSenderId messagingSenderId or {@code null} for none
   */
  public WebAppConfig setMessagingSenderId(java.lang.String messagingSenderId) {
    this.messagingSenderId = messagingSenderId;
    return this;
  }

  /**
   * Immutable. A user-assigned unique identifier for the `FirebaseProject`.
   * @return value or {@code null} for none
   */
  public java.lang.String getProjectId() {
    return projectId;
  }

  /**
   * Immutable. A user-assigned unique identifier for the `FirebaseProject`.
   * @param projectId projectId or {@code null} for none
   */
  public WebAppConfig setProjectId(java.lang.String projectId) {
    this.projectId = projectId;
    return this;
  }

  /**
   * The default Cloud Storage for Firebase storage bucket name.
   * @return value or {@code null} for none
   */
  public java.lang.String getStorageBucket() {
    return storageBucket;
  }

  /**
   * The default Cloud Storage for Firebase storage bucket name.
   * @param storageBucket storageBucket or {@code null} for none
   */
  public WebAppConfig setStorageBucket(java.lang.String storageBucket) {
    this.storageBucket = storageBucket;
    return this;
  }

  @Override
  public WebAppConfig set(String fieldName, Object value) {
    return (WebAppConfig) super.set(fieldName, value);
  }

  @Override
  public WebAppConfig clone() {
    return (WebAppConfig) super.clone();
  }

}
