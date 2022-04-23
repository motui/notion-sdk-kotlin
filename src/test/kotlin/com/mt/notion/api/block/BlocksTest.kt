package com.mt.notion.api.block

import com.mt.notion.api.block.objects.ParagraphBlockObject
import com.mt.notion.api.block.objects.ToDoBlockObject
import com.mt.notion.api.block.objects.ToggleBlockObject
import com.mt.notion.common.ObjectType
import com.mt.notion.util.JsonUtil
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

/**
 *
 * @author it.motui
 */
internal class BlocksTest {

    @Test
    fun deserialize() {
        val json = """
            {
            "object": "list",
            "results": [
                {
                    "object": "block",
                    "id": "dfe22609-e220-46c4-85a1-3e4ab7c0663b",
                    "created_time": "2022-04-23T06:05:00.000Z",
                    "last_edited_time": "2022-04-23T06:06:00.000Z",
                    "created_by": {
                        "object": "user",
                        "id": "761813bc-498f-4d03-abbf-e66fd3cd98d7"
                    },
                    "last_edited_by": {
                        "object": "user",
                        "id": "761813bc-498f-4d03-abbf-e66fd3cd98d7"
                    },
                    "has_children": false,
                    "archived": false,
                    "type": "paragraph",
                    "paragraph": {
                        "rich_text": [
                            {
                                "type": "text",
                                "text": {
                                    "content": "测试",
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
                                "plain_text": "测试",
                                "href": null
                            },
                            {
                                "type": "text",
                                "text": {
                                    "content": "Notion",
                                    "link": null
                                },
                                "annotations": {
                                    "bold": true,
                                    "italic": false,
                                    "strikethrough": false,
                                    "underline": false,
                                    "code": false,
                                    "color": "default"
                                },
                                "plain_text": "Notion",
                                "href": null
                            },
                            {
                                "type": "text",
                                "text": {
                                    "content": " ",
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
                                "plain_text": " ",
                                "href": null
                            },
                            {
                                "type": "text",
                                "text": {
                                    "content": "API",
                                    "link": null
                                },
                                "annotations": {
                                    "bold": false,
                                    "italic": false,
                                    "strikethrough": false,
                                    "underline": false,
                                    "code": false,
                                    "color": "red"
                                },
                                "plain_text": "API",
                                "href": null
                            }
                        ],
                        "color": "default"
                    }
                },
                {
                    "object": "block",
                    "id": "e27427c0-340e-4aab-935d-5c2b14c158a4",
                    "created_time": "2022-04-23T08:44:00.000Z",
                    "last_edited_time": "2022-04-23T08:44:00.000Z",
                    "created_by": {
                        "object": "user",
                        "id": "761813bc-498f-4d03-abbf-e66fd3cd98d7"
                    },
                    "last_edited_by": {
                        "object": "user",
                        "id": "761813bc-498f-4d03-abbf-e66fd3cd98d7"
                    },
                    "has_children": false,
                    "archived": false,
                    "type": "to_do",
                    "to_do": {
                        "rich_text": [
                            {
                                "type": "text",
                                "text": {
                                    "content": "A",
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
                                "plain_text": "A",
                                "href": null
                            }
                        ],
                        "checked": false,
                        "color": "default"
                    }
                },
                {
                    "object": "block",
                    "id": "e5249298-0366-432c-9482-c5e330794980",
                    "created_time": "2022-04-23T08:44:00.000Z",
                    "last_edited_time": "2022-04-23T08:44:00.000Z",
                    "created_by": {
                        "object": "user",
                        "id": "761813bc-498f-4d03-abbf-e66fd3cd98d7"
                    },
                    "last_edited_by": {
                        "object": "user",
                        "id": "761813bc-498f-4d03-abbf-e66fd3cd98d7"
                    },
                    "has_children": false,
                    "archived": false,
                    "type": "to_do",
                    "to_do": {
                        "rich_text": [
                            {
                                "type": "text",
                                "text": {
                                    "content": "B",
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
                                "plain_text": "B",
                                "href": null
                            }
                        ],
                        "checked": false,
                        "color": "default"
                    }
                },
                {
                    "object": "block",
                    "id": "202f0c12-9247-492f-a32c-fd339d13f90e",
                    "created_time": "2022-04-23T08:44:00.000Z",
                    "last_edited_time": "2022-04-23T08:44:00.000Z",
                    "created_by": {
                        "object": "user",
                        "id": "761813bc-498f-4d03-abbf-e66fd3cd98d7"
                    },
                    "last_edited_by": {
                        "object": "user",
                        "id": "761813bc-498f-4d03-abbf-e66fd3cd98d7"
                    },
                    "has_children": false,
                    "archived": false,
                    "type": "to_do",
                    "to_do": {
                        "rich_text": [
                            {
                                "type": "text",
                                "text": {
                                    "content": "C",
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
                                "plain_text": "C",
                                "href": null
                            }
                        ],
                        "checked": false,
                        "color": "default"
                    }
                },
                {
                    "object": "block",
                    "id": "ccf87d7c-5f7e-4e01-b028-ec64c4ee5440",
                    "created_time": "2022-04-23T08:44:00.000Z",
                    "last_edited_time": "2022-04-23T08:45:00.000Z",
                    "created_by": {
                        "object": "user",
                        "id": "761813bc-498f-4d03-abbf-e66fd3cd98d7"
                    },
                    "last_edited_by": {
                        "object": "user",
                        "id": "761813bc-498f-4d03-abbf-e66fd3cd98d7"
                    },
                    "has_children": false,
                    "archived": false,
                    "type": "toggle",
                    "toggle": {
                        "rich_text": [
                            {
                                "type": "text",
                                "text": {
                                    "content": "toggleA",
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
                                "plain_text": "toggleA",
                                "href": null
                            }
                        ],
                        "color": "default"
                    }
                },
                {
                    "object": "block",
                    "id": "2c6df3b1-fcea-44ce-af90-06fee7bcdabb",
                    "created_time": "2022-04-23T08:45:00.000Z",
                    "last_edited_time": "2022-04-23T08:45:00.000Z",
                    "created_by": {
                        "object": "user",
                        "id": "761813bc-498f-4d03-abbf-e66fd3cd98d7"
                    },
                    "last_edited_by": {
                        "object": "user",
                        "id": "761813bc-498f-4d03-abbf-e66fd3cd98d7"
                    },
                    "has_children": false,
                    "archived": false,
                    "type": "toggle",
                    "toggle": {
                        "rich_text": [
                            {
                                "type": "text",
                                "text": {
                                    "content": "toggleB",
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
                                "plain_text": "toggleB",
                                "href": null
                            }
                        ],
                        "color": "default"
                    }
                },
                {
                    "object": "block",
                    "id": "c5416186-bd56-4f93-81ce-67c859f33257",
                    "created_time": "2022-04-23T08:45:00.000Z",
                    "last_edited_time": "2022-04-23T08:48:00.000Z",
                    "created_by": {
                        "object": "user",
                        "id": "761813bc-498f-4d03-abbf-e66fd3cd98d7"
                    },
                    "last_edited_by": {
                        "object": "user",
                        "id": "761813bc-498f-4d03-abbf-e66fd3cd98d7"
                    },
                    "has_children": false,
                    "archived": false,
                    "type": "heading_1",
                    "heading_1": {
                        "rich_text": [
                            {
                                "type": "text",
                                "text": {
                                    "content": "一级标题",
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
                                "plain_text": "一级标题",
                                "href": null
                            }
                        ],
                        "color": "default"
                    }
                },
                {
                    "object": "block",
                    "id": "1763cadf-ef76-4911-ab32-65277b4d3561",
                    "created_time": "2022-04-23T08:48:00.000Z",
                    "last_edited_time": "2022-04-23T08:48:00.000Z",
                    "created_by": {
                        "object": "user",
                        "id": "761813bc-498f-4d03-abbf-e66fd3cd98d7"
                    },
                    "last_edited_by": {
                        "object": "user",
                        "id": "761813bc-498f-4d03-abbf-e66fd3cd98d7"
                    },
                    "has_children": false,
                    "archived": false,
                    "type": "heading_2",
                    "heading_2": {
                        "rich_text": [
                            {
                                "type": "text",
                                "text": {
                                    "content": "二级标题",
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
                                "plain_text": "二级标题",
                                "href": null
                            }
                        ],
                        "color": "default"
                    }
                },
                {
                    "object": "block",
                    "id": "d552aa76-1368-4bbf-9dba-6ea709b3caa5",
                    "created_time": "2022-04-23T08:48:00.000Z",
                    "last_edited_time": "2022-04-23T08:48:00.000Z",
                    "created_by": {
                        "object": "user",
                        "id": "761813bc-498f-4d03-abbf-e66fd3cd98d7"
                    },
                    "last_edited_by": {
                        "object": "user",
                        "id": "761813bc-498f-4d03-abbf-e66fd3cd98d7"
                    },
                    "has_children": false,
                    "archived": false,
                    "type": "heading_3",
                    "heading_3": {
                        "rich_text": [
                            {
                                "type": "text",
                                "text": {
                                    "content": "三级标题",
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
                                "plain_text": "三级标题",
                                "href": null
                            }
                        ],
                        "color": "default"
                    }
                },
                {
                    "object": "block",
                    "id": "386fe78b-645c-4fc9-b5be-c48c1903f411",
                    "created_time": "2022-04-23T08:48:00.000Z",
                    "last_edited_time": "2022-04-23T08:48:00.000Z",
                    "created_by": {
                        "object": "user",
                        "id": "761813bc-498f-4d03-abbf-e66fd3cd98d7"
                    },
                    "last_edited_by": {
                        "object": "user",
                        "id": "761813bc-498f-4d03-abbf-e66fd3cd98d7"
                    },
                    "has_children": false,
                    "archived": false,
                    "type": "paragraph",
                    "paragraph": {
                        "rich_text": [],
                        "color": "default"
                    }
                },
                {
                    "object": "block",
                    "id": "850a5cb0-d645-46f9-b477-492039331b26",
                    "created_time": "2022-04-23T08:48:00.000Z",
                    "last_edited_time": "2022-04-23T08:48:00.000Z",
                    "created_by": {
                        "object": "user",
                        "id": "761813bc-498f-4d03-abbf-e66fd3cd98d7"
                    },
                    "last_edited_by": {
                        "object": "user",
                        "id": "761813bc-498f-4d03-abbf-e66fd3cd98d7"
                    },
                    "has_children": false,
                    "archived": false,
                    "type": "bulleted_list_item",
                    "bulleted_list_item": {
                        "rich_text": [
                            {
                                "type": "text",
                                "text": {
                                    "content": "测试A",
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
                                "plain_text": "测试A",
                                "href": null
                            }
                        ],
                        "color": "default"
                    }
                },
                {
                    "object": "block",
                    "id": "4efa0fa2-f6c4-4e58-8ae1-27760d8498e4",
                    "created_time": "2022-04-23T08:48:00.000Z",
                    "last_edited_time": "2022-04-23T08:48:00.000Z",
                    "created_by": {
                        "object": "user",
                        "id": "761813bc-498f-4d03-abbf-e66fd3cd98d7"
                    },
                    "last_edited_by": {
                        "object": "user",
                        "id": "761813bc-498f-4d03-abbf-e66fd3cd98d7"
                    },
                    "has_children": false,
                    "archived": false,
                    "type": "bulleted_list_item",
                    "bulleted_list_item": {
                        "rich_text": [
                            {
                                "type": "text",
                                "text": {
                                    "content": "测试B",
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
                                "plain_text": "测试B",
                                "href": null
                            }
                        ],
                        "color": "default"
                    }
                },
                {
                    "object": "block",
                    "id": "0c5195d9-59b2-4b35-b483-44a8250fb4db",
                    "created_time": "2022-04-23T08:48:00.000Z",
                    "last_edited_time": "2022-04-23T08:48:00.000Z",
                    "created_by": {
                        "object": "user",
                        "id": "761813bc-498f-4d03-abbf-e66fd3cd98d7"
                    },
                    "last_edited_by": {
                        "object": "user",
                        "id": "761813bc-498f-4d03-abbf-e66fd3cd98d7"
                    },
                    "has_children": false,
                    "archived": false,
                    "type": "bulleted_list_item",
                    "bulleted_list_item": {
                        "rich_text": [
                            {
                                "type": "text",
                                "text": {
                                    "content": "测试C",
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
                                "plain_text": "测试C",
                                "href": null
                            }
                        ],
                        "color": "default"
                    }
                },
                {
                    "object": "block",
                    "id": "77997107-5abc-44d8-8577-e895f921f079",
                    "created_time": "2022-04-23T08:48:00.000Z",
                    "last_edited_time": "2022-04-23T08:49:00.000Z",
                    "created_by": {
                        "object": "user",
                        "id": "761813bc-498f-4d03-abbf-e66fd3cd98d7"
                    },
                    "last_edited_by": {
                        "object": "user",
                        "id": "761813bc-498f-4d03-abbf-e66fd3cd98d7"
                    },
                    "has_children": false,
                    "archived": false,
                    "type": "numbered_list_item",
                    "numbered_list_item": {
                        "rich_text": [
                            {
                                "type": "text",
                                "text": {
                                    "content": "测试1",
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
                                "plain_text": "测试1",
                                "href": null
                            }
                        ],
                        "color": "default"
                    }
                },
                {
                    "object": "block",
                    "id": "d0ea0671-9333-4055-8cd3-32fba263929a",
                    "created_time": "2022-04-23T08:49:00.000Z",
                    "last_edited_time": "2022-04-23T08:49:00.000Z",
                    "created_by": {
                        "object": "user",
                        "id": "761813bc-498f-4d03-abbf-e66fd3cd98d7"
                    },
                    "last_edited_by": {
                        "object": "user",
                        "id": "761813bc-498f-4d03-abbf-e66fd3cd98d7"
                    },
                    "has_children": false,
                    "archived": false,
                    "type": "numbered_list_item",
                    "numbered_list_item": {
                        "rich_text": [
                            {
                                "type": "text",
                                "text": {
                                    "content": "测试2",
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
                                "plain_text": "测试2",
                                "href": null
                            }
                        ],
                        "color": "default"
                    }
                },
                {
                    "object": "block",
                    "id": "b1d5efd1-0295-4827-9c0c-2c53b63f3eea",
                    "created_time": "2022-04-23T08:49:00.000Z",
                    "last_edited_time": "2022-04-23T08:49:00.000Z",
                    "created_by": {
                        "object": "user",
                        "id": "761813bc-498f-4d03-abbf-e66fd3cd98d7"
                    },
                    "last_edited_by": {
                        "object": "user",
                        "id": "761813bc-498f-4d03-abbf-e66fd3cd98d7"
                    },
                    "has_children": false,
                    "archived": false,
                    "type": "numbered_list_item",
                    "numbered_list_item": {
                        "rich_text": [
                            {
                                "type": "text",
                                "text": {
                                    "content": "测试3",
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
                                "plain_text": "测试3",
                                "href": null
                            }
                        ],
                        "color": "default"
                    }
                },
                {
                    "object": "block",
                    "id": "58c4d740-fc56-4d0f-bde0-9f528d7fa59f",
                    "created_time": "2022-04-23T08:49:00.000Z",
                    "last_edited_time": "2022-04-23T08:49:00.000Z",
                    "created_by": {
                        "object": "user",
                        "id": "761813bc-498f-4d03-abbf-e66fd3cd98d7"
                    },
                    "last_edited_by": {
                        "object": "user",
                        "id": "761813bc-498f-4d03-abbf-e66fd3cd98d7"
                    },
                    "has_children": false,
                    "archived": false,
                    "type": "quote",
                    "quote": {
                        "rich_text": [
                            {
                                "type": "text",
                                "text": {
                                    "content": "这",
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
                                "plain_text": "这",
                                "href": null
                            },
                            {
                                "type": "text",
                                "text": {
                                    "content": "个是",
                                    "link": null
                                },
                                "annotations": {
                                    "bold": false,
                                    "italic": false,
                                    "strikethrough": false,
                                    "underline": false,
                                    "code": false,
                                    "color": "blue_background"
                                },
                                "plain_text": "个是",
                                "href": null
                            },
                            {
                                "type": "text",
                                "text": {
                                    "content": "个",
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
                                "plain_text": "个",
                                "href": null
                            },
                            {
                                "type": "text",
                                "text": {
                                    "content": "测试",
                                    "link": null
                                },
                                "annotations": {
                                    "bold": false,
                                    "italic": false,
                                    "strikethrough": false,
                                    "underline": true,
                                    "code": false,
                                    "color": "pink"
                                },
                                "plain_text": "测试",
                                "href": null
                            },
                            {
                                "type": "text",
                                "text": {
                                    "content": "文本",
                                    "link": null
                                },
                                "annotations": {
                                    "bold": true,
                                    "italic": false,
                                    "strikethrough": false,
                                    "underline": false,
                                    "code": false,
                                    "color": "pink"
                                },
                                "plain_text": "文本",
                                "href": null
                            }
                        ],
                        "color": "default"
                    }
                },
                {
                    "object": "block",
                    "id": "cf3e9042-aac6-44f5-8de7-085d5417831b",
                    "created_time": "2022-04-23T08:49:00.000Z",
                    "last_edited_time": "2022-04-23T08:49:00.000Z",
                    "created_by": {
                        "object": "user",
                        "id": "761813bc-498f-4d03-abbf-e66fd3cd98d7"
                    },
                    "last_edited_by": {
                        "object": "user",
                        "id": "761813bc-498f-4d03-abbf-e66fd3cd98d7"
                    },
                    "has_children": false,
                    "archived": false,
                    "type": "divider",
                    "divider": {}
                },
                {
                    "object": "block",
                    "id": "17f929e7-36b7-4096-a8d0-4d9c229a6877",
                    "created_time": "2022-04-23T08:50:00.000Z",
                    "last_edited_time": "2022-04-23T08:50:00.000Z",
                    "created_by": {
                        "object": "user",
                        "id": "761813bc-498f-4d03-abbf-e66fd3cd98d7"
                    },
                    "last_edited_by": {
                        "object": "user",
                        "id": "761813bc-498f-4d03-abbf-e66fd3cd98d7"
                    },
                    "has_children": false,
                    "archived": false,
                    "type": "callout",
                    "callout": {
                        "rich_text": [
                            {
                                "type": "text",
                                "text": {
                                    "content": "有什么想说的呢",
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
                                "plain_text": "有什么想说的呢",
                                "href": null
                            }
                        ],
                        "icon": {
                            "type": "emoji",
                            "emoji": "💡"
                        },
                        "color": "gray_background"
                    }
                },
                {
                    "object": "block",
                    "id": "239b5eb5-8d5d-4f36-93c4-78be3ede181e",
                    "created_time": "2022-04-23T08:50:00.000Z",
                    "last_edited_time": "2022-04-23T08:50:00.000Z",
                    "created_by": {
                        "object": "user",
                        "id": "761813bc-498f-4d03-abbf-e66fd3cd98d7"
                    },
                    "last_edited_by": {
                        "object": "user",
                        "id": "761813bc-498f-4d03-abbf-e66fd3cd98d7"
                    },
                    "has_children": false,
                    "archived": false,
                    "type": "image",
                    "image": {
                        "caption": [],
                        "type": "external",
                        "external": {
                            "url": "https://images.unsplash.com/photo-1627483262769-04d0a1401487?ixlib=rb-1.2.1&q=85&fm=jpg&crop=entropy&cs=srgb"
                        }
                    }
                },
                {
                    "object": "block",
                    "id": "0c4560f6-95db-42e2-9ba3-03fd6851507b",
                    "created_time": "2022-04-23T08:50:00.000Z",
                    "last_edited_time": "2022-04-23T08:51:00.000Z",
                    "created_by": {
                        "object": "user",
                        "id": "761813bc-498f-4d03-abbf-e66fd3cd98d7"
                    },
                    "last_edited_by": {
                        "object": "user",
                        "id": "761813bc-498f-4d03-abbf-e66fd3cd98d7"
                    },
                    "has_children": false,
                    "archived": false,
                    "type": "code",
                    "code": {
                        "caption": [],
                        "rich_text": [
                            {
                                "type": "text",
                                "text": {
                                    "content": "# shell \necho \"abc\"",
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
                                "plain_text": "# shell \necho \"abc\"",
                                "href": null
                            }
                        ],
                        "language": "shell"
                    }
                },
                {
                    "object": "block",
                    "id": "af95ab1d-719e-464f-9a3d-8843dfaa37fb",
                    "created_time": "2022-04-23T08:51:00.000Z",
                    "last_edited_time": "2022-04-23T08:51:00.000Z",
                    "created_by": {
                        "object": "user",
                        "id": "761813bc-498f-4d03-abbf-e66fd3cd98d7"
                    },
                    "last_edited_by": {
                        "object": "user",
                        "id": "761813bc-498f-4d03-abbf-e66fd3cd98d7"
                    },
                    "has_children": false,
                    "archived": false,
                    "type": "file",
                    "file": {
                        "caption": [],
                        "type": "external",
                        "external": {
                            "url": "http://abc.com/test.csv"
                        }
                    }
                },
                {
                    "object": "block",
                    "id": "78b6f510-229d-47ca-bc9f-ab1aafc0d5fc",
                    "created_time": "2022-04-23T08:51:00.000Z",
                    "last_edited_time": "2022-04-23T08:51:00.000Z",
                    "created_by": {
                        "object": "user",
                        "id": "761813bc-498f-4d03-abbf-e66fd3cd98d7"
                    },
                    "last_edited_by": {
                        "object": "user",
                        "id": "761813bc-498f-4d03-abbf-e66fd3cd98d7"
                    },
                    "has_children": false,
                    "archived": false,
                    "type": "paragraph",
                    "paragraph": {
                        "rich_text": [],
                        "color": "default"
                    }
                }
            ],
            "next_cursor": null,
            "has_more": false,
            "type": "block",
            "block": {}
        }
        """.trimIndent()
        val blocks = JsonUtil.instance().readValue(json, Blocks::class.java)
        assertNotNull(blocks)
        assertEquals(23, blocks.results.size)
        assertTrue(blocks.results[0] is ParagraphBlockObject)
        assertTrue(blocks.results[1] is ToDoBlockObject)
        assertTrue(blocks.results[4] is ToggleBlockObject)
        assertNotNull(blocks.hasMore)
        blocks.hasMore?.let { assertFalse(it) }
        assertNull(blocks.nextCursor)
        assertEquals(ObjectType.List, blocks.objectType)
        assertEquals("block", blocks.type)
    }
}