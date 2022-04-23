package com.mt.notion.api.database

import com.mt.notion.util.JsonUtil
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

/**
 *
 * @author it.motui
 */
internal class DatabasesTest {

    @Test
    fun deserialize() {
        val json = """
            {
              "object": "list",
              "results": [
                {
                  "object": "page",
                  "id": "92e5d804-e399-4e9d-8392-34f67e6f732f",
                  "created_time": "2022-03-01T18:34:00.000Z",
                  "last_edited_time": "2022-03-01T18:41:00.000Z",
                  "created_by": {
                    "object": "user",
                    "id": "16db2410-9a93-4608-9153-9394438c93e3"
                  },
                  "last_edited_by": {
                    "object": "user",
                    "id": "16db2410-9a93-4608-9153-9394438c93e3"
                  },
                  "cover": {
                    "type": "external",
                    "external": {
                      "url": "https://www.notion.so/images/page-cover/solid_yellow.png"
                    }
                  },
                  "icon": {
                    "type": "emoji",
                    "emoji": "🥬"
                  },
                  "parent": {
                    "type": "database_id",
                    "database_id": "333589c3-29e3-458a-b582-7f6a96c3a94e"
                  },
                  "archived": false,
                  "properties": {
                    "In stock": {
                      "id": "Fot%3B",
                      "type": "checkbox",
                      "checkbox": true
                    },
                    "Last ordered": {
                      "id": "JLy%5C",
                      "type": "date",
                      "date": {
                        "start": "2022-03-01",
                        "end": null,
                        "time_zone": null
                      }
                    },
                    "Price": {
                      "id": "%5CK%5B%3F",
                      "type": "number",
                      "number": 2
                    },
                    "Recipes": {
                      "id": "_%5Dak",
                      "type": "relation",
                      "relation": [
                        {
                          "id": "152e4ff4-2ac7-433b-883e-8f6da06e7207"
                        }
                      ]
                    },
                    "Cost of next trip": {
                      "id": "%7BHHd",
                      "type": "formula",
                      "formula": {
                        "type": "number",
                        "number": 2
                      }
                    },
                    "Name": {
                      "id": "title",
                      "type": "title",
                      "title": [
                        {
                          "type": "text",
                          "text": {
                            "content": "Kale",
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
                          "plain_text": "Kale",
                          "href": null
                        }
                      ]
                    }
                  },
                  "url": "https://www.notion.so/Kale-92e5d804e3994e9d839234f67e6f732f"
                }
              ],
              "next_cursor": null,
              "has_more": false,
              "type": "page",
              "page": {}
            }
        """.trimIndent()
        val databases: Databases = JsonUtil.instance().readValue(json, Databases::class.java)
        Assertions.assertNotNull(databases)
    }
}