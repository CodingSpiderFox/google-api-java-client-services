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

package com.google.api.services.displayvideo.v1.model;

/**
 * Targeting details for inventory source. This will be populated in the details field of an
 * AssignedTargetingOption when targeting_type is `TARGETING_TYPE_INVENTORY_SOURCE`.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Display & Video 360 API. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class InventorySourceAssignedTargetingOptionDetails extends com.google.api.client.json.GenericJson {

  /**
   * Required. ID of the inventory source. Should refer to the inventory_source_id field of an
   * InventorySource resource.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long inventorySourceId;

  /**
   * Required. ID of the inventory source. Should refer to the inventory_source_id field of an
   * InventorySource resource.
   * @return value or {@code null} for none
   */
  public java.lang.Long getInventorySourceId() {
    return inventorySourceId;
  }

  /**
   * Required. ID of the inventory source. Should refer to the inventory_source_id field of an
   * InventorySource resource.
   * @param inventorySourceId inventorySourceId or {@code null} for none
   */
  public InventorySourceAssignedTargetingOptionDetails setInventorySourceId(java.lang.Long inventorySourceId) {
    this.inventorySourceId = inventorySourceId;
    return this;
  }

  @Override
  public InventorySourceAssignedTargetingOptionDetails set(String fieldName, Object value) {
    return (InventorySourceAssignedTargetingOptionDetails) super.set(fieldName, value);
  }

  @Override
  public InventorySourceAssignedTargetingOptionDetails clone() {
    return (InventorySourceAssignedTargetingOptionDetails) super.clone();
  }

}