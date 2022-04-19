package com.mt.notion.api.user

import com.mt.notion.common.ObjectType
import com.mt.notion.util.JsonUtil
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

/**
 *
 * @author it.motui
 */
internal class UsersTest {

    @Test
    fun deserialize() {
        val json = """
            {
              "object": "list",
              "results": [
                {
                  "object": "user",
                  "id": "6794760a-1f15-45cd-9c65-0dfe42f5135a",
                  "name": "Aman Gupta",
                  "avatar_url": null,
                  "type": "person",
                  "person": {
                    "email": "XXXXXXXXXX"
                  }
                },
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
              ],
              "next_cursor": null,
              "has_more": false,
              "type": "user"
            }
        """.trimIndent()
        val users: Users = JsonUtil.instance().readValue(json, Users::class.java)
        assertNotNull(users)
        assertEquals(2, users.results.size)
        assertTrue(users.results[0] is Person)
        assertTrue(users.results[1] is Bot)
        assertNotNull(users.hasMore)
        users.hasMore?.let { assertFalse(it) }
        assertNull(users.nextCursor)
        assertEquals(ObjectType.List, users.objectType)
        assertEquals("user", users.type)
    }
}
