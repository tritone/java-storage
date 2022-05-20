/*
 * Copyright 2020 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/storage/v2/storage.proto

package com.google.storage.v2;

public interface HmacKeyMetadataOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.storage.v2.HmacKeyMetadata)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Resource name ID of the key in the format &lt;projectId&gt;/&lt;accessId&gt;.
   * </pre>
   *
   * <code>string id = 1;</code>
   *
   * @return The id.
   */
  java.lang.String getId();
  /**
   *
   *
   * <pre>
   * Resource name ID of the key in the format &lt;projectId&gt;/&lt;accessId&gt;.
   * </pre>
   *
   * <code>string id = 1;</code>
   *
   * @return The bytes for id.
   */
  com.google.protobuf.ByteString getIdBytes();

  /**
   *
   *
   * <pre>
   * Globally unique id for keys.
   * </pre>
   *
   * <code>string access_id = 2;</code>
   *
   * @return The accessId.
   */
  java.lang.String getAccessId();
  /**
   *
   *
   * <pre>
   * Globally unique id for keys.
   * </pre>
   *
   * <code>string access_id = 2;</code>
   *
   * @return The bytes for accessId.
   */
  com.google.protobuf.ByteString getAccessIdBytes();

  /**
   *
   *
   * <pre>
   * The project ID that the hmac key is contained in.
   * </pre>
   *
   * <code>string project = 3 [(.google.api.resource_reference) = { ... }</code>
   *
   * @return The project.
   */
  java.lang.String getProject();
  /**
   *
   *
   * <pre>
   * The project ID that the hmac key is contained in.
   * </pre>
   *
   * <code>string project = 3 [(.google.api.resource_reference) = { ... }</code>
   *
   * @return The bytes for project.
   */
  com.google.protobuf.ByteString getProjectBytes();

  /**
   *
   *
   * <pre>
   * Email of the service account the key authenticates as.
   * </pre>
   *
   * <code>string service_account_email = 4;</code>
   *
   * @return The serviceAccountEmail.
   */
  java.lang.String getServiceAccountEmail();
  /**
   *
   *
   * <pre>
   * Email of the service account the key authenticates as.
   * </pre>
   *
   * <code>string service_account_email = 4;</code>
   *
   * @return The bytes for serviceAccountEmail.
   */
  com.google.protobuf.ByteString getServiceAccountEmailBytes();

  /**
   *
   *
   * <pre>
   * State of the key. One of ACTIVE, INACTIVE, or DELETED.
   * </pre>
   *
   * <code>string state = 5;</code>
   *
   * @return The state.
   */
  java.lang.String getState();
  /**
   *
   *
   * <pre>
   * State of the key. One of ACTIVE, INACTIVE, or DELETED.
   * </pre>
   *
   * <code>string state = 5;</code>
   *
   * @return The bytes for state.
   */
  com.google.protobuf.ByteString getStateBytes();

  /**
   *
   *
   * <pre>
   * The creation time of the HMAC key.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 6;</code>
   *
   * @return Whether the createTime field is set.
   */
  boolean hasCreateTime();
  /**
   *
   *
   * <pre>
   * The creation time of the HMAC key.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 6;</code>
   *
   * @return The createTime.
   */
  com.google.protobuf.Timestamp getCreateTime();
  /**
   *
   *
   * <pre>
   * The creation time of the HMAC key.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 6;</code>
   */
  com.google.protobuf.TimestampOrBuilder getCreateTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * The last modification time of the HMAC key metadata.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 7;</code>
   *
   * @return Whether the updateTime field is set.
   */
  boolean hasUpdateTime();
  /**
   *
   *
   * <pre>
   * The last modification time of the HMAC key metadata.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 7;</code>
   *
   * @return The updateTime.
   */
  com.google.protobuf.Timestamp getUpdateTime();
  /**
   *
   *
   * <pre>
   * The last modification time of the HMAC key metadata.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 7;</code>
   */
  com.google.protobuf.TimestampOrBuilder getUpdateTimeOrBuilder();
}
