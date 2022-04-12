package com.mt.notion.api.user

import com.mt.notion.common.ObjectType
import com.mt.notion.util.JsonUtil
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

/**
 *
 * @author it.motui
 */
internal class PersonTest {

    @Test
    fun serialization() {
        val person = Person(
            ObjectType.USER,
            UserType.PERSON,
            "6794760a-1f15-45cd-9c65-0dfe42f5135a",
            "Aman Gupta",
            null,
            Person.People("it.motuis@gmail.com")
        )
        val personStr = JsonUtil.instance().writeValueAsString(person)
        assertEquals(
            """
            {"object":"user","type":"person","id":"6794760a-1f15-45cd-9c65-0dfe42f5135a","name":"Aman Gupta","avatar_url":null,"person":{"email":"it.motuis@gmail.com"}}
            """.trimIndent(),
            personStr
        )
    }

    @Test
    fun deserialize() {
        val json = """
            {
              "type": "person",
              "object": "user",
              "id": "6794760a-1f15-45cd-9c65-0dfe42f5135a",
              "name": "Aman Gupta",
              "avatar_url": null,
              "person": {
                "email": "it.motuis@gmail.com"
              }
            }
        """.trimIndent()
        val person: Person = JsonUtil.instance().readValue(json, Person::class.java)
        assertEquals(ObjectType.USER, person.objectType)
        assertEquals(UserType.PERSON, person.type)
        assertEquals("6794760a-1f15-45cd-9c65-0dfe42f5135a", person.id)
        assertEquals("Aman Gupta", person.name)
        assertNull(person.avatarUrl)
        assertNotNull(person.person)
        assertEquals("it.motuis@gmail.com", person.person?.email)
    }
}