package com.mt.notion.http

/**
 * notion http request
 *
 * @author it.motui
 * @since 0.1
 */
class NotionHttpRequest
constructor(
    val url: String,
    val token: String,
    val content: NotionHttpRequestContent,
    val header: Map<String, String>?
) {
    constructor(
        url: String,
        token: String,
        content: NotionHttpRequestContent,
    ) : this(url, token, content, null)


}