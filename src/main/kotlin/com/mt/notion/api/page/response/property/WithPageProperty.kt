package com.mt.notion.api.page.response.property

import com.fasterxml.jackson.annotation.JsonSubTypes
import com.fasterxml.jackson.annotation.JsonTypeInfo
import com.mt.notion.common.PropertyType

/**
 * todo 兼容String类型
 * @author it.motui
 */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NAME,
    include = JsonTypeInfo.As.EXISTING_PROPERTY,
    property = "type",
    visible = true
)
@JsonSubTypes(
    JsonSubTypes.Type(PageRichTextProperty::class, name = "rich_text"),
    JsonSubTypes.Type(PageNumberProperty::class, name = "number"),
    JsonSubTypes.Type(PageSelectProperty::class, name = "select"),
    JsonSubTypes.Type(PageMultiSelectProperty::class, name = "multi_select"),
    JsonSubTypes.Type(PageDateProperty::class, name = "date"),
    JsonSubTypes.Type(PageFormulaProperty::class, name = "formula"),
    JsonSubTypes.Type(PageRelationProperty::class, name = "relation"),
    JsonSubTypes.Type(PageRollupProperty::class, name = "rollup"),
    JsonSubTypes.Type(PageTitleProperty::class, name = "title"),
    JsonSubTypes.Type(PagePeopleProperty::class, name = "people"),
    JsonSubTypes.Type(PageFilesProperty::class, name = "files"),
    JsonSubTypes.Type(PageCheckboxProperty::class, name = "checkbox"),
    JsonSubTypes.Type(PageUrlProperty::class, name = "url"),
    JsonSubTypes.Type(PageEmailProperty::class, name = "email"),
    JsonSubTypes.Type(PagePhoneNumberProperty::class, name = "phone_number"),
    JsonSubTypes.Type(PageCreatedByProperty::class, name = "created_time"),
    JsonSubTypes.Type(PageCreatedByProperty::class, name = "created_by"),
    JsonSubTypes.Type(PageLastEditedTimeProperty::class, name = "last_edited_time"),
    JsonSubTypes.Type(PageLastEditedByProperty::class, name = "last_edited_by")
)
interface WithPageProperty {
    val type: PropertyType
    val id: String
}