package com.mt.notion.api

/**
 * notion api config
 *
 * @author it.motui
 */
data class NotionApiConfig(
    val token: String,
    /**
     * notion base request url
     */
    val baseUrl: String,
    /**
     * notion version
     */
    val notionVersion: String
)
