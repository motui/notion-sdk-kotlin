package com.mt.notion.api.database

import com.mt.notion.api.database.parent.PageParent
import com.mt.notion.common.Emoji
import com.mt.notion.common.ObjectType
import com.mt.notion.common.file.ExternalFileDetails
import com.mt.notion.common.richText.Text
import com.mt.notion.util.JsonUtil
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

/**
 * @author it.motui
 */
internal class DatabaseTest {
    @Test
    fun deserialize() {
        val json = """
            {
                "object": "database",
                "id": "e5212c12-869c-4576-9588-1632887fc5d4",
                "cover": {
                    "type": "external",
                    "external": {
                        "url": "https://images.unsplash.com/photo-1535016120720-40c646be5580?ixlib=rb-1.2.1&q=85&fm=jpg&crop=entropy&cs=srgb"
                    }
                },
                "icon": {
                    "type": "emoji",
                    "emoji": "🎥"
                },
                "created_time": "2022-04-16T10:58:00.000Z",
                "created_by": {
                    "object": "user",
                    "id": "761813bc-498f-4d03-abbf-e66fd3cd98d7"
                },
                "last_edited_by": {
                    "object": "user",
                    "id": "761813bc-498f-4d03-abbf-e66fd3cd98d7"
                },
                "last_edited_time": "2022-04-16T10:58:00.000Z",
                "title": [
                    {
                        "type": "text",
                        "text": {
                            "content": "影视 ",
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
                        "plain_text": "影视 ",
                        "href": null
                    }
                ],
                "properties": {
                    "海报": {
                        "id": "%3BJ%7D%3B",
                        "name": "海报",
                        "type": "files",
                        "files": {}
                    },
                    "又名": {
                        "id": "%3Cx%3Af",
                        "name": "又名",
                        "type": "rich_text",
                        "rich_text": {}
                    },
                    "状态": {
                        "id": "AU%40n",
                        "name": "状态",
                        "type": "select",
                        "select": {
                            "options": [
                                {
                                    "id": "0f20d26b-21a0-48a6-bdfd-f2c7a79155a3",
                                    "name": "已观看",
                                    "color": "green"
                                },
                                {
                                    "id": "7691a50e-6622-4294-951b-f2c009e1a1ac",
                                    "name": "追剧",
                                    "color": "brown"
                                }
                            ]
                        }
                    },
                    "译名": {
                        "id": "BF%3FZ",
                        "name": "译名",
                        "type": "rich_text",
                        "rich_text": {}
                    },
                    "观看时间": {
                        "id": "E%5EoF",
                        "name": "观看时间",
                        "type": "date",
                        "date": {}
                    },
                    "上映时间": {
                        "id": "Jogz",
                        "name": "上映时间",
                        "type": "date",
                        "date": {}
                    },
                    "展示名称": {
                        "id": "MThF",
                        "name": "展示名称",
                        "type": "formula",
                        "formula": {
                            "expression": "prop(\"原名\") + if(prop(\"译名\") != \"\", \"(\" + prop(\"译名\") + \")\", \"\")"
                        }
                    },
                    "时长": {
                        "id": "Y%3Dk%5E",
                        "name": "时长",
                        "type": "number",
                        "number": {
                            "format": "number"
                        }
                    },
                    "评分": {
                        "id": "YzhU",
                        "name": "评分",
                        "type": "select",
                        "select": {
                            "options": [
                                {
                                    "id": "55d2ebdf-0669-41b4-9517-e656bcfc549a",
                                    "name": "⭐️⭐️⭐️⭐️⭐️",
                                    "color": "yellow"
                                },
                                {
                                    "id": "fe9481bf-4935-431a-8afc-e9043f78fb0c",
                                    "name": "⭐️⭐️⭐️⭐️",
                                    "color": "brown"
                                },
                                {
                                    "id": "eecfb97e-09b2-4d88-8a08-b758fd160ab3",
                                    "name": "⭐️⭐️⭐️",
                                    "color": "gray"
                                },
                                {
                                    "id": "ddb8a5b3-b483-4d24-b12c-f8622e3977d4",
                                    "name": "⭐️⭐️",
                                    "color": "red"
                                },
                                {
                                    "id": "57ccb6cb-57ab-4fb8-a5c6-5ca6e11544a5",
                                    "name": "⭐️",
                                    "color": "orange"
                                },
                                {
                                    "id": "3b893c72-a9ba-4018-95bd-287bd418b134",
                                    "name": "☆",
                                    "color": "green"
                                }
                            ]
                        }
                    },
                    "语言": {
                        "id": "%5CPql",
                        "name": "语言",
                        "type": "multi_select",
                        "multi_select": {
                            "options": [
                                {
                                    "id": "36263e72-8123-42ad-8c1f-b9453a17a456",
                                    "name": "汉语普通话",
                                    "color": "orange"
                                },
                                {
                                    "id": "95452e4d-42ea-411e-bfa2-4f42dceb27d7",
                                    "name": "英语",
                                    "color": "green"
                                },
                                {
                                    "id": "d95cf141-aa60-47fd-adad-5a0cd0d28b48",
                                    "name": "粤语",
                                    "color": "brown"
                                },
                                {
                                    "id": "53f7b38c-88fc-4036-88fa-8798ab91b966",
                                    "name": "日语",
                                    "color": "yellow"
                                },
                                {
                                    "id": "768b72af-49f1-41eb-853b-e9c40164ece7",
                                    "name": "法语",
                                    "color": "purple"
                                },
                                {
                                    "id": "73a819c7-21d7-45ec-8568-342e562c10ca",
                                    "name": "西北方言",
                                    "color": "pink"
                                }
                            ]
                        }
                    },
                    "编剧": {
                        "id": "bVVH",
                        "name": "编剧",
                        "type": "rich_text",
                        "rich_text": {}
                    },
                    "影视类型": {
                        "id": "dbdn",
                        "name": "影视类型",
                        "type": "select",
                        "select": {
                            "options": [
                                {
                                    "id": "afe184b4-ae58-4b92-95d7-b0088c2319c0",
                                    "name": "电影",
                                    "color": "red"
                                },
                                {
                                    "id": "db4e97a1-6168-49e2-9c49-e4bcc09d56fd",
                                    "name": "动漫",
                                    "color": "purple"
                                },
                                {
                                    "id": "f19be785-9972-466f-aa8b-9bf6164e6794",
                                    "name": "电视剧",
                                    "color": "yellow"
                                },
                                {
                                    "id": "7311127b-36c6-454e-8a72-b9acfd1a8849",
                                    "name": "美剧",
                                    "color": "pink"
                                }
                            ]
                        }
                    },
                    "导演": {
                        "id": "drYl",
                        "name": "导演",
                        "type": "rich_text",
                        "rich_text": {}
                    },
                    "IMDB": {
                        "id": "e%5D%3Bm",
                        "name": "IMDB",
                        "type": "url",
                        "url": {}
                    },
                    "豆瓣链接": {
                        "id": "iPXt",
                        "name": "豆瓣链接",
                        "type": "url",
                        "url": {}
                    },
                    "地区": {
                        "id": "ivD~",
                        "name": "地区",
                        "type": "multi_select",
                        "multi_select": {
                            "options": [
                                {
                                    "id": "w_YQ",
                                    "name": "🇨🇳 中国大陆",
                                    "color": "default"
                                },
                                {
                                    "id": "3098cbfa-fbb4-4b4b-ae53-91289c21931d",
                                    "name": "🇺🇸 美国",
                                    "color": "red"
                                },
                                {
                                    "id": "39c28b91-fa36-460b-9c92-e701c6751aed",
                                    "name": "🇬🇧 英国",
                                    "color": "yellow"
                                },
                                {
                                    "id": "f23decfc-afb7-48da-8c3a-855c125708ee",
                                    "name": "🇦🇺 澳大利亚",
                                    "color": "orange"
                                },
                                {
                                    "id": "5db751ee-4a16-4795-a39d-c2f76e845ba4",
                                    "name": "🇯🇵 日本",
                                    "color": "green"
                                }
                            ]
                        }
                    },
                    "片源": {
                        "id": "m%40dV",
                        "name": "片源",
                        "type": "select",
                        "select": {
                            "options": [
                                {
                                    "id": "ea802788-ff12-4273-8fe2-110b2290c559",
                                    "name": "爱奇艺",
                                    "color": "blue"
                                },
                                {
                                    "id": "2df7c398-c86f-4096-b917-30d944fd75aa",
                                    "name": "豆瓣电影",
                                    "color": "yellow"
                                },
                                {
                                    "id": "7d0c491a-eacc-4967-a7e1-6624530c290e",
                                    "name": "优酷",
                                    "color": "green"
                                },
                                {
                                    "id": "ec96bc9b-d42f-497e-ae64-7ebf460f3f6c",
                                    "name": "腾讯视频",
                                    "color": "orange"
                                },
                                {
                                    "id": "7ea83bf6-ea44-422f-9918-04c0e3f24e63",
                                    "name": "bilibili",
                                    "color": "gray"
                                }
                            ]
                        }
                    },
                    "标签": {
                        "id": "pe%3F%7D",
                        "name": "标签",
                        "type": "multi_select",
                        "multi_select": {
                            "options": [
                                {
                                    "id": "]ip]",
                                    "name": "剧情",
                                    "color": "default"
                                },
                                {
                                    "id": "c4715dff-dc12-489c-8911-3a6bc68de052",
                                    "name": "历史",
                                    "color": "gray"
                                },
                                {
                                    "id": "e5f8e73e-6a99-4c4f-92aa-9c44cbb0c70d",
                                    "name": "战争",
                                    "color": "blue"
                                },
                                {
                                    "id": "5ab7ca7d-a192-4ffd-9879-330072a72404",
                                    "name": "喜剧",
                                    "color": "green"
                                },
                                {
                                    "id": "119613bf-fdc7-4f63-8ebc-a73382c99666",
                                    "name": "传记",
                                    "color": "yellow"
                                },
                                {
                                    "id": "e2430872-7e51-4582-b39a-a2a3ac10ed6f",
                                    "name": "爱情",
                                    "color": "red"
                                },
                                {
                                    "id": "5f59bcf4-fba2-4dce-b256-86a30e08ec23",
                                    "name": "家庭",
                                    "color": "pink"
                                },
                                {
                                    "id": "76222df4-3264-4c6b-9d9f-e589bb3ba1f3",
                                    "name": "犯罪",
                                    "color": "purple"
                                },
                                {
                                    "id": "cf0de536-bdf5-4d12-95de-f3cc93ab63c9",
                                    "name": "科幻",
                                    "color": "default"
                                },
                                {
                                    "id": "cd4830af-33c2-49e2-bdbb-b0344b457dd8",
                                    "name": "悬疑",
                                    "color": "brown"
                                },
                                {
                                    "id": "a6a58d81-edc1-40a1-af03-fa79dafb1d6b",
                                    "name": "冒险",
                                    "color": "orange"
                                },
                                {
                                    "id": "e02033ae-c077-4c20-8f0e-130330826d8b",
                                    "name": "动作",
                                    "color": "orange"
                                },
                                {
                                    "id": "e123d006-2d4f-4fe0-bd0b-2257c6a561f9",
                                    "name": "运动",
                                    "color": "default"
                                },
                                {
                                    "id": "e0713ae3-6628-42c3-b257-e8f03a061889",
                                    "name": "动画",
                                    "color": "green"
                                },
                                {
                                    "id": "56824988-e2c6-40be-99c6-d6626d664bc3",
                                    "name": "奇幻",
                                    "color": "purple"
                                },
                                {
                                    "id": "93750917-4dd4-401c-971c-90b255c23850",
                                    "name": "武侠",
                                    "color": "blue"
                                }
                            ]
                        }
                    },
                    "集数": {
                        "id": "t%40Qv",
                        "name": "集数",
                        "type": "number",
                        "number": {
                            "format": "number"
                        }
                    },
                    "主演": {
                        "id": "%7BSoO",
                        "name": "主演",
                        "type": "rich_text",
                        "rich_text": {}
                    },
                    "原名": {
                        "id": "title",
                        "name": "原名",
                        "type": "title",
                        "title": {}
                    }
                },
                "parent": {
                    "type": "page_id",
                    "page_id": "3dee2e2e-5ef5-4ea6-87cf-9ee8d22f2085"
                },
                "url": "https://www.notion.so/e5212c12869c457695881632887fc5d3",
                "archived": false
            }
        """.trimIndent()
        val database: Database = JsonUtil.instance().readValue(json, Database::class.java)
        assertNotNull(database)
        assertEquals(ObjectType.Database, database.objectType)
        assertEquals("e5212c12-869c-4576-9588-1632887fc5d4", database.id)
        assertEquals("2022-04-16T10:58:00.000Z", database.createdTime)
        assertEquals("761813bc-498f-4d03-abbf-e66fd3cd98d7", database.createdBy.id)
        assertEquals(ObjectType.User, database.createdBy.objectType)
        assertEquals("2022-04-16T10:58:00.000Z", database.lastEditedTime)
        assertEquals("761813bc-498f-4d03-abbf-e66fd3cd98d7", database.lastEditedBy.id)
        assertEquals(ObjectType.User, database.lastEditedBy.objectType)
        assertEquals(1, database.title.size)
        assertTrue(database.title[0] is Text)
        assertTrue(database.icon is Emoji)
        assertTrue(database.cover is ExternalFileDetails)
        assertEquals(21, database.properties.size)
        assertTrue(database.parent is PageParent)
        assertEquals("https://www.notion.so/e5212c12869c457695881632887fc5d3", database.url)
        assertFalse(database.archived)
    }
}
