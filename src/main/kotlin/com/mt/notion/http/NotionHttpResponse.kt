package com.mt.notion.http

/**
 * notion http response
 *
 * @author it.motui
 * @since 0.1
 */
class NotionHttpResponse
constructor(
    /**
     * http code
     */
    val httpCode: Int,
    /**
     * response header
     */
    val headers: Map<String, List<String>>,
    /**
     * response body
     */
    val body: String
) {


}