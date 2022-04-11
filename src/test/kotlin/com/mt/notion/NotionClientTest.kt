package com.mt.notion

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

/**
 *
 * @author it.motui
 */
internal class NotionClientTest {

    @Test
    fun init() {
        val internalNotionClient = NotionClient.InternalNotionClient(
            NotionClient.InternalNotionConfig(
                NotionClient.BASE_URL, NotionClient.VERSION, ""
            )
        )
    }
}