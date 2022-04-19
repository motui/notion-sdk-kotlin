package com.mt.notion.api.oauth

import com.mt.notion.NotionClient
import com.mt.notion.http.impl.OkHttpNotionHttpClientImpl
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

/**
 *
 * @author it.motui
 */
internal class OAuthNotionApiTest {
    val oauth: OAuthNotionApi = OAuthNotionApi(
        NotionClient.PublicNotionConfig(
            NotionClient.BASE_URL,
            NotionClient.VERSION,
            "",
            "",
            "https://github.com/motui/notion/callback"
        ),
        OkHttpNotionHttpClientImpl()
    )

    @Test
    fun authorizeUrl() {
    }

    @Test
    fun exchangeAuthCode() {
    }
}
