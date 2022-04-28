package com.mt.notion.api.block.objects

import com.mt.notion.util.JsonUtil
import org.junit.jupiter.api.Assertions.assertNotNull
import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.Test

/**
 *
 * @author it.motui
 */
internal class BlockObjectTest {


    @Test
    fun blockObject() {
        val json = """
            {
              "object": "block",
              "id": "0c940186-ab70-4351-bb34-2d16f0635d49",
              "created_time": "2022-03-01T18:42:00.000Z",
              "last_edited_time": "2022-03-01T18:54:00.000Z",
              "created_by": {
                "object": "user",
                "id": "1091c8fb-8b5a-4cc2-afe9-fdf0367e16d6"
              },
              "last_edited_by": {
                "object": "user",
                "id": "1091c8fb-8b5a-4cc2-afe9-fdf0367e16d6"
              },
              "has_children": false,
              "archived": false,
              "type": "paragraph",
              "paragraph": {
                "rich_text": [
                  {
                    "type": "text",
                    "text": {
                      "content": "Lacinato kale",
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
                    "plain_text": "Lacinato kale",
                    "href": null
                  }
                ],
                "color": "default"
              }
            }
        """.trimIndent()
        val readValue = JsonUtil.instance().readValue(json, WithBlockObject::class.java)
        assertTrue(readValue is ParagraphBlockObject)
        assertNotNull(readValue.id)
        assertNotNull(readValue.type)
        assertNotNull(readValue.objectType)
        assertNotNull(readValue.createdTime)
        assertNotNull(readValue.lastEditedTime)
        val paragraphBlockObject = readValue as ParagraphBlockObject
        assertNotNull(paragraphBlockObject.paragraph)
        assertNotNull(paragraphBlockObject.paragraph.color)
        assertNotNull(paragraphBlockObject.paragraph.richText)
    }
}