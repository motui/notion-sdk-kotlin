package com.mt.notion

import com.mt.notion.api.NotionApiConfig
import com.mt.notion.api.block.BlockNotionApi
import com.mt.notion.api.database.DatabaseNotionApi
import com.mt.notion.api.oauth.OAuthNotionApi
import com.mt.notion.api.page.PageNotionApi
import com.mt.notion.api.search.SearchNotionApi
import com.mt.notion.api.user.UserNotionApi
import com.mt.notion.http.NotionHttpClient
import com.mt.notion.http.impl.OkHttpNotionHttpClientImpl

/**
 * notion client
 *
 * @author it.motui
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
    )

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
    )

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
        notionHttpClient: NotionHttpClient? = null
    ) {
        private val httpClient: NotionHttpClient
        private val userNotionApi: UserNotionApi
        private val blockNotionApi: BlockNotionApi
        private val databaseNotionApi: DatabaseNotionApi
        private val pageNotionApi: PageNotionApi
        private val searchNotionApi: SearchNotionApi

        init {
            this.httpClient = notionHttpClient ?: OkHttpNotionHttpClientImpl()
            val notionConfig = NotionApiConfig(config.token, config.baseUrl, config.notionVersion)
            this.userNotionApi = UserNotionApi(notionConfig, this.httpClient)
            this.blockNotionApi = BlockNotionApi(notionConfig, this.httpClient)
            this.databaseNotionApi = DatabaseNotionApi(notionConfig, this.httpClient)
            this.pageNotionApi = PageNotionApi(notionConfig, this.httpClient)
            this.searchNotionApi = SearchNotionApi(notionConfig, this.httpClient)
        }

        fun user(): UserNotionApi = this.userNotionApi

        fun block(): BlockNotionApi = this.blockNotionApi

        fun page(): PageNotionApi = this.pageNotionApi

        fun database(): DatabaseNotionApi = this.databaseNotionApi

        fun search(): SearchNotionApi = this.searchNotionApi
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
            this.httpClient = notionHttpClient ?: OkHttpNotionHttpClientImpl()
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
