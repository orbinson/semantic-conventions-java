/*
 * Copyright The OpenTelemetry Authors
 * SPDX-License-Identifier: Apache-2.0
 */

package io.opentelemetry.semconv.incubating;

import static io.opentelemetry.api.common.AttributeKey.stringKey;

import io.opentelemetry.api.common.AttributeKey;

// DO NOT EDIT, this is an Auto-generated file from
// buildscripts/templates/SemanticAttributes.java.j2
@SuppressWarnings("unused")
public final class UserAgentIncubatingAttributes {

  /**
   * Value of the <a href="https://www.rfc-editor.org/rfc/rfc9110.html#field.user-agent">HTTP
   * User-Agent</a> header sent by the client.
   *
   * @deprecated deprecated in favor of stable {@link
   *     io.opentelemetry.semconv.UserAgentAttributes#USER_AGENT_ORIGINAL} attribute.
   */
  @Deprecated
  public static final AttributeKey<String> USER_AGENT_ORIGINAL = stringKey("user_agent.original");

  // Enum definitions

  private UserAgentIncubatingAttributes() {}
}
