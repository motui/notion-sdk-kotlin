package com.mt.notion.api.oauth

import com.mt.notion.api.NotionApi
import com.mt.notion.http.NotionHttpClient

/**
 * oauth api
 *
 * @see <a href="https://developers.notion.com/docs/authorization#exchanging-the-grant-for-an-access-token">
 *     authorization#exchanging-the-grant-for-an-access-token</a>
 * @author it.motui
 * @since 0.1
 */
class OAuthNotionApi(override val notionHttpClient: NotionHttpClient) : NotionApi {

}