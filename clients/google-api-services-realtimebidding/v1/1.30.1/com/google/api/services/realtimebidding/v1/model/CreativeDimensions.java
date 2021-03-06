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

package com.google.api.services.realtimebidding.v1.model;

/**
 * The dimensions of a creative. This applies to only HTML and Native creatives.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Real-time Bidding API. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class CreativeDimensions extends com.google.api.client.json.GenericJson {

  /**
   * The height of the creative in pixels.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long height;

  /**
   * The width of the creative in pixels.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long width;

  /**
   * The height of the creative in pixels.
   * @return value or {@code null} for none
   */
  public java.lang.Long getHeight() {
    return height;
  }

  /**
   * The height of the creative in pixels.
   * @param height height or {@code null} for none
   */
  public CreativeDimensions setHeight(java.lang.Long height) {
    this.height = height;
    return this;
  }

  /**
   * The width of the creative in pixels.
   * @return value or {@code null} for none
   */
  public java.lang.Long getWidth() {
    return width;
  }

  /**
   * The width of the creative in pixels.
   * @param width width or {@code null} for none
   */
  public CreativeDimensions setWidth(java.lang.Long width) {
    this.width = width;
    return this;
  }

  @Override
  public CreativeDimensions set(String fieldName, Object value) {
    return (CreativeDimensions) super.set(fieldName, value);
  }

  @Override
  public CreativeDimensions clone() {
    return (CreativeDimensions) super.clone();
  }

}
