package com.mt.notion.api.user

import com.mt.notion.common.ObjectType
import com.mt.notion.util.JsonUtil
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

/**
 *
 * @author it.motui
 */
internal class BotTest {
    @Test
    fun serialization() {
        val bot = Bot(
            ObjectType.User,
            UserType.BOT,
            "6794760a-1f15-45cd-9c65-0dfe42f5135a",
            "Aman Gupta",
            null,
            Bot.InternalBot(
                Bot.Owner("workspace", true, null)
            )
        )
        val str = JsonUtil.instance().writeValueAsString(bot)
        assertEquals(
            """
           {"object":"user","type":"bot","id":"6794760a-1f15-45cd-9c65-0dfe42f5135a","name":"Aman Gupta","avatar_url":null,"bot":{"owner":{"type":"workspace","workspace":true,"user":null}}}
            """.trimIndent(),
            str
        )
    }

    @Test
    fun deserialize() {
        val json = """
            {
                "object": "user",
                "id": "92a680bb-6970-4726-952b-4f4c03bff617",
                "name": "Leotastic",
                "avatar_url": null,
                "type": "bot",
                "bot": {
                    "owner": {
                        "type": "workspace",
                        "workspace": true
                    }
                }
            }
        """.trimIndent()
        val bot: Bot = JsonUtil.instance().readValue(json, Bot::class.java)
        assertEquals(ObjectType.User, bot.objectType)
        assertEquals(UserType.BOT, bot.type)
        assertEquals("92a680bb-6970-4726-952b-4f4c03bff617", bot.id)
        assertEquals("Leotastic", bot.name)
        assertNull(bot.avatarUrl)
        assertNotNull(bot.bot)
        assertNotNull(bot.bot?.owner)
        bot.bot?.owner?.type?.let { assertEquals("workspace", it) }
        bot.bot?.owner?.workspace?.let { assertTrue(it) }
    }
}
