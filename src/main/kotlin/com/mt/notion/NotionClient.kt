package com.mt.notion

import com.mt.notion.api.NotionApiConfig
import com.mt.notion.api.oauth.OAuthNotionApi
import com.mt.notion.api.user.UserNotionApi
import com.mt.notion.http.NotionHttpClient
import com.mt.notion.http.impl.OkHttpNotionHttpClientImpl

/**
 * notion client
 *
 * @author it.motui
 * @since 0.1
 */
object NotionClient {

    const val BASE_URL: String = "https://api.notion.com/v1"
    const val VERSION: String = "2022-02-22"

    /**
     * internal integrations config
     * @since 0.1
     */
    data class InternalNotionConfig
    constructor(
        /**
         * notion base request url
         */
        val baseUrl: String,
        /**
         * notion version
         */
        val notionVersion: String,
        /**
         * internal integrations token
         */
        val token: String
    ) {


    }

    /**
     * public integrations config
     * @since 0.1
     */
    data class PublicNotionConfig
    constructor(
        /**
         * notion base request url
         */
        val baseUrl: String,
        /**
         * notion version
         */
        val notionVersion: String,
        /**
         * client id: provided when requesting a public integration
         */
        val clientId: String,
        /**
         * client secret: provided when requesting a public integration
         */
        val clientSecret: String,
        /**
         * redirect url: callback url after authorization
         */
        val redirectUri: String,
    ) {

    }

    /**
     * internal integrations
     * @since 0.1
     */
    class InternalNotionClient
    constructor(
        /**
         * internal notion config
         */
        config: InternalNotionConfig,
        /**
         * 自定义NotionHttpClient
         */
        notionHttpClient: NotionHttpClient?
    ) {
        private val httpClient: NotionHttpClient
        private val userNotionApi: UserNotionApi

        init {
            if (notionHttpClient != null) {
                this.httpClient = notionHttpClient
            } else {
                this.httpClient = OkHttpNotionHttpClientImpl()
            }
            this.userNotionApi = UserNotionApi(
                NotionApiConfig(config.token, config.baseUrl, config.notionVersion), this.httpClient
            )
        }

        fun user(): UserNotionApi = this.userNotionApi
    }

    /**
     * public integrations
     * @since 0.1
     */
    class PublicNotionClient
    constructor(
        /**
         * public notion config
         */
        private val config: PublicNotionConfig,
        /**
         * 自定义NotionHttpClient
         */
        notionHttpClient: NotionHttpClient?
    ) {
        private val oauth: OAuthNotionApi
        private val httpClient: NotionHttpClient

        init {
            if (notionHttpClient != null) {
                this.httpClient = notionHttpClient
            } else {
                this.httpClient = OkHttpNotionHttpClientImpl()
            }
            this.oauth = OAuthNotionApi(this.config, this.httpClient)
        }

        /**
         * 认证授权
         *
         * @since 0.1
         */
        fun oauth(): OAuthNotionApi {
            return this.oauth
        }
    }
}