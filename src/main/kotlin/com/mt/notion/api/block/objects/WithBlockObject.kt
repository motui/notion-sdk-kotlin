package com.mt.notion.api.block.objects

import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonSubTypes
import com.fasterxml.jackson.annotation.JsonTypeInfo
import com.mt.notion.api.block.BlockObjectType
import com.mt.notion.api.user.User

/**
 *
 * @author it.motui
 */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NAME,
    include = JsonTypeInfo.As.EXISTING_PROPERTY,
    property = "type",
    visible = true
)
@JsonSubTypes(
    JsonSubTypes.Type(ParagraphBlockObject::class, name = "paragraph"),
    JsonSubTypes.Type(Heading1BlockObject::class, name = "heading_1"),
    JsonSubTypes.Type(Heading2BlockObject::class, name = "heading_2"),
    JsonSubTypes.Type(Heading3BlockObject::class, name = "heading_3"),
    JsonSubTypes.Type(BulletedListItemBlockObject::class, name = "bulleted_list_item"),
    JsonSubTypes.Type(NumberedListItemBlockObject::class, name = "numbered_list_item"),
    JsonSubTypes.Type(QuoteBlockObject::class, name = "quote"),
    JsonSubTypes.Type(ToDoBlockObject::class, name = "to_do"),
    JsonSubTypes.Type(ToggleBlockObject::class, name = "toggle"),
    JsonSubTypes.Type(TemplateBlockObject::class, name = "template"),
    JsonSubTypes.Type(SyncedBlockObject::class, name = "synced_block"),
    JsonSubTypes.Type(ChildPageBlockObject::class, name = "child_page"),
    JsonSubTypes.Type(ChildDatabaseBlockObject::class, name = "child_database"),
    JsonSubTypes.Type(EquationBlockObject::class, name = "equation"),
    JsonSubTypes.Type(CodeBlockObject::class, name = "code"),
    JsonSubTypes.Type(CalloutBlockObject::class, name = "callout"),
    JsonSubTypes.Type(DividerBlockObject::class, name = "divider"),
    JsonSubTypes.Type(BreadcrumbBlockObject::class, name = "breadcrumb"),
    JsonSubTypes.Type(TableOfContentsBlockObject::class, name = "table_of_contents"),
    JsonSubTypes.Type(ColumnListBlockObject::class, name = "column_list"),
    JsonSubTypes.Type(ColumnBlockObject::class, name = "column"),
    JsonSubTypes.Type(LinkToPageBlockObject::class, name = "link_to_page"),
    JsonSubTypes.Type(TableBlockObject::class, name = "table"),
    JsonSubTypes.Type(TableRawBlockObject::class, name = "table_row"),
    JsonSubTypes.Type(EmbedBlockObject::class, name = "embed"),
    JsonSubTypes.Type(BookmarkBlockObject::class, name = "bookmark"),
    JsonSubTypes.Type(ImageBlockObject::class, name = "image"),
    JsonSubTypes.Type(VideoBlockObject::class, name = "video"),
    JsonSubTypes.Type(PdfBlockObject::class, name = "pdf"),
    JsonSubTypes.Type(FileBlockObject::class, name = "file"),
    JsonSubTypes.Type(AudioBlockObject::class, name = "audio"),
    JsonSubTypes.Type(LinkPreviewBlockObject::class, name = "link_preview"),
    JsonSubTypes.Type(UnsupportedBlockObject::class, name = "unsupported"),
)
interface WithBlockObject : WithBlock {
    override val id: String
    val type: BlockObjectType

    @get:JsonProperty("created_time")
    val createdTime: String

    @get:JsonProperty("created_by")
    val createdBy: User

    @get:JsonProperty("last_edited_time")
    val lastEditedTime: String

    @get:JsonProperty("last_edited_by")
    val lastEditedBy: User

    @get:JsonProperty("has_children")
    val hasChildren: Boolean
    val archived: Boolean
}