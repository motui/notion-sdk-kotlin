package com.mt.notion.api.page.response

import com.mt.notion.util.JsonUtil
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

/**
 *
 * @author it.motui
 */
internal class PageTest {
    @Test
    fun deserialize() {
        val json = """
           {
             "object": "page",
             "id": "b55c9c91-384d-452b-81db-d1ef79372b75",
             "created_time": "2020-03-17T19:10:04.968Z",
             "last_edited_time": "2020-03-17T21:49:37.913Z",
             "created_by": {
               "object": "user",
               "id": "ee5f0f84-409a-440f-983a-a5315961c6e4"
             },
             "last_edited_by": {
               "object": "user",
               "id": "ee5f0f84-409a-440f-983a-a5315961c6e4"
             },
             "parent": {
               "type": "database_id",
               "database_id": "48f8fee9-cd79-4180-bc2f-ec0398253067"
             },
             "archived": false,
             "url": "https://www.notion.so/Avocado-b55c9c91384d452b81dbd1ef79372b75",
             "icon": {
               "type": "emoji",
               "emoji": "🎉"
             },
             "cover": {
               "type": "external",
               "external": {
                 "url": "https://website.domain/images/image.png"
               }
             },
             "properties": {
               "Name": {
                 "id": "lOpd",
                 "type": "title",
                 "title": [
                   {
                     "type": "text",
                     "text": {
                       "content": "Avocado",
                       "link": null
                     },
                     "annotations": {
                       "bold": false,
                       "italic": false,
                       "strikethrough": false,
                       "underline": false,
                       "code": false,
                       "color": "default"
                     },
                     "plain_text": "Avocado",
                     "href": null
                   }
                 ]
               },
               "Description": {
                 "id": "ajLj",
                 "type": "rich_text",
                 "rich_text": [
                   {
                     "type": "text",
                     "text": {
                       "content": "Persea americana",
                       "link": null
                     },
                     "annotations": {
                       "bold": false,
                       "italic": false,
                       "strikethrough": false,
                       "underline": false,
                       "code": false,
                       "color": "default"
                     },
                     "plain_text": "Persea americana",
                     "href": null
                   }
                 ]
               },
               "In stock": {
                 "id": "KpQq",
                 "type": "checkbox",
                 "checkbox": false
               },
               "Food group": {
                 "id": "z%7D%5C%3C",
                 "type": "select",
                 "select": {
                   "id": "2f998e2d-7b1c-485b-ba6b-5e6a815ec8f5",
                   "name": "🍎Fruit",
                   "color": "red"
                 }
               },
               "Price": {
                 "id": "XpXf",
                 "type": "number",
                 "number": 2
               },
               "Cost of next trip": {
                 "id": "Xpaf",
                 "type": "number",
                 "number": 2
               },
               "Last ordered": {
                 "id": "ERd%5E",
                 "type": "date",
                 "date": {
                   "start": "2020-03-10",
                   "end": null,
                   "time_zone": null
                 }
               },
               "Meals": {
                 "id": "vYdV",
                 "type": "relation",
                 "relation": [
                   {
                     "id": "1jdo7fb2-95e6-4b37-a696-036e5eac5cf6"
                   }
                 ]
               },
               "Store availability": {
                 "id": "z%7D%5C%3C",
                 "type": "multi_select",
                 "multi_select": [
                   {
                     "id": "2f998e2d-7b1c-485b-ba6b-5e6a815ec8f5",
                     "name": "Rainbow Grocery",
                     "color": "purple"
                   },
                   {
                     "id": "2f998e2d-7b1c-485b-ba6b-5e6a815ec8f5",
                     "name": "Gus's Community Market",
                     "color": "green"
                   }
                 ]
               },
               "+1": {
                 "id": "KpQq",
                 "type": "people",
                 "people": [
                   {
                     "object": "user",
                     "id": "285e5768-3fdc-4742-ab9e-125f9050f3b8",
                     "name": "Example Avo",
                     "avatar_url": null,
                     "type": "person",
                     "person": {
                       "email": "avo@example.com"
                     }
                   }
                 ]
               },
               "Photos": {
                 "id": "KpQq",
                 "type": "files",
                 "files": [
                   {
                     "type": "external",
                     "name": "avocado",
                     "external": {
                       "url": "https://s3.us-west-2.amazonaws.com/secure.notion-static.com/e6a352a8-8381-44d0-a1dc-9ed80e62b53d/avocado.jpg"
                     }
                   }
                 ]
               }
             }
           }
        """.trimIndent()
        val page: Page = JsonUtil.instance().readValue(json, Page::class.java)
        Assertions.assertNotNull(page)
    }
}