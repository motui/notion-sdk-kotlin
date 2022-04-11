package com.mt.notion

/**
 * notion client
 *
 * @author it.motui
 * @since 0.1
 */
object NotionClient {

    const val BASE_URL: String = "https://api.notion.com/api/v1"
    const val VERSION: String = "2022-10-15"

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
        private val config: InternalNotionConfig,
    ) {

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
    ) {

        /**
         * authorize url
         *
         * eg:https://api.notion.com/v1/oauth/authorize?owner=user&client_id=463558a3-725e-4f37-b6d3-0889894f68de&
         * redirect_uri=https%3A%2F%2Fexample.com%2Fauth%2Fnotion%2Fcallback&response_type=code
         */
        fun authorizeUrl(): String {
            return "%s/oauth/authorize/?owner=user&response_type=code&client_id=%s&redirect_uri=%s".format(
                this.config.baseUrl,
                this.config.clientId,
                this.config.redirectUri
            )
        }
    }
}