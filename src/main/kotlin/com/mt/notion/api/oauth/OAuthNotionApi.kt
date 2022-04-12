package com.mt.notion.api.oauth

import com.mt.notion.NotionClient
import com.mt.notion.http.NotionHttpClient
import com.mt.notion.http.NotionHttpRequest
import java.util.*

/**
 * oauth api
 *
 * @see <a href="https://developers.notion.com/docs/authorization#exchanging-the-grant-for-an-access-token">
 *     authorization#exchanging-the-grant-for-an-access-token</a>
 * @author it.motui
 * @since 0.1
 */
class OAuthNotionApi(
    private val config: NotionClient.PublicNotionConfig,
    private val notionHttpClient: NotionHttpClient
) {

    /**
     * authorize url
     *
     * eg:https://api.notion.com/v1/oauth/authorize?owner=user&client_id=463558a3-725e-4f37-b6d3-0889894f68de&
     * redirect_uri=https%3A%2F%2Fexample.com%2Fauth%2Fnotion%2Fcallback&response_type=code
     * @since 0.1
     */
    fun authorizeUrl(): String {
        return "%s/oauth/authorize/?owner=user&response_type=code&client_id=%s&redirect_uri=%s".format(
            this.config.baseUrl,
            this.config.clientId,
            this.config.redirectUri
        )
    }

    /**
     * Exchanging the grant for access token
     */
    fun exchangeAuthCode(request: ExchangeAuthCodeRequest): ExchangeAuthCodeResponse {
        val base64Value =
            String(
                Base64.getEncoder()
                    .encode("${this.config.clientId}:${this.config.clientSecret}".toByteArray(Charsets.UTF_8)),
                Charsets.UTF_8
            )
        return notionHttpClient.post(
            NotionHttpRequest(
                "${this.config.baseUrl}/oauth/token",
                request,
                this.notionHttpClient.buildHeader(
                    this.notionHttpClient.basicAuthorization(base64Value),
                    this.config.notionVersion
                )
            )
        )
    }
}