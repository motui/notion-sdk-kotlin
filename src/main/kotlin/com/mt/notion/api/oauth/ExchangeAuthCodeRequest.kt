package com.mt.notion.api.oauth

import com.fasterxml.jackson.annotation.JsonProperty
import com.mt.notion.http.NotionHttpRequestContent

/**
 * exchanging the grant for an access token http request params
 * @author it.motui
 * @since 0.1
 */
data class ExchangeAuthCodeRequest(
    /**
     * Always use "authorization_code"
     */
    @JsonProperty("grant_type")
    val grantType: String = "authorization_code",
    /**
     * The temporary authorization code received in the incoming request to the
     */
    val code: String,
    /**
     * The value provided by the integration when the user was prompted for access.
     */
    val state: String?,
    /**
     * The "redirect_uri" that was provided in the Authorization step
     */
    val redirectUri: String,
) : NotionHttpRequestContent