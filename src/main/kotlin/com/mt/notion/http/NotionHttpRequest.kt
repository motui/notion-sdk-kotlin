package com.mt.notion.http

/**
 * notion http request
 *
 * @author it.motui
 * @since 0.1
 */
data class NotionHttpRequest
constructor(
    val url: String,
    val content: NotionHttpRequestContent,
    val header: Map<String, String>?
) {
    constructor(
        url: String,
        content: NotionHttpRequestContent,
    ) : this(url, content, null)
}