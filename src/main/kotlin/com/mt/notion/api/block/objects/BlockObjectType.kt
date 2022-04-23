package com.mt.notion.api.block.objects

import com.fasterxml.jackson.annotation.JsonProperty

/**
 *
 * @author it.motui
 */
enum class BlockObjectType constructor(val value: String) {
    @JsonProperty("paragraph")
    Paragraph("paragraph"),

    @JsonProperty("heading_1")
    Heading1("heading_1"),

    @JsonProperty("heading_2")
    Heading2("heading_2"),

    @JsonProperty("heading_3")
    Heading3("heading_3"),

    @JsonProperty("bulleted_list_item")
    BulletedListItem("bulleted_list_item"),

    @JsonProperty("numbered_list_item")
    NumberedListItem("numbered_list_item"),

    @JsonProperty("quote")
    Quote("quote"),

    @JsonProperty("to_do")
    ToDo("to_do"),

    @JsonProperty("toggle")
    Toggle("toggle"),

    @JsonProperty("template")
    Template("template"),

    @JsonProperty("synced_block")
    SyncedBlock("synced_block"),

    @JsonProperty("child_page")
    ChildPage("child_page"),

    @JsonProperty("child_database")
    ChildDatabase("child_database"),

    @JsonProperty("equation")
    Equation("equation"),

    @JsonProperty("code")
    Code("code"),

    @JsonProperty("callout")
    Callout("callout"),

    @JsonProperty("divider")
    Divider("divider"),

    @JsonProperty("breadcrumb")
    Breadcrumb("breadcrumb"),

    @JsonProperty("table_of_contents")
    TableOfContents("table_of_contents"),

    @JsonProperty("column_list")
    ColumnList("column_list"),

    @JsonProperty("column")
    Column("column"),

    @JsonProperty("link_to_page")
    LinkToPage("link_to_page"),

    @JsonProperty("table")
    Table("table"),

    @JsonProperty("table_row")
    TableRow("table_row"),

    @JsonProperty("embed")
    Embed("embed"),

    @JsonProperty("bookmark")
    Bookmark("bookmark"),

    @JsonProperty("image")
    Image("image"),

    @JsonProperty("video")
    Video("video"),

    @JsonProperty("pdf")
    Pdf("pdf"),

    @JsonProperty("file")
    File("file"),

    @JsonProperty("audio")
    Audio("audio"),

    @JsonProperty("link_preview")
    LinkPreview("link_preview"),

    @JsonProperty("unsupported")
    Unsupported("unsupported"),
    ;

    override fun toString(): String = value
}