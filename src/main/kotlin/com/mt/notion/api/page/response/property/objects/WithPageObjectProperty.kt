package com.mt.notion.api.page.response.property.objects

import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonSubTypes
import com.fasterxml.jackson.annotation.JsonTypeInfo
import com.mt.notion.api.page.response.property.WithPageProperty
import com.mt.notion.common.ObjectType

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
    JsonSubTypes.Type(PageObjectRichTextProperty::class, name = "rich_text"),
    JsonSubTypes.Type(PageObjectNumberProperty::class, name = "number"),
    JsonSubTypes.Type(PageObjectSelectProperty::class, name = "select"),
    JsonSubTypes.Type(PageObjectMultiSelectProperty::class, name = "multi_select"),
    JsonSubTypes.Type(PageObjectDateProperty::class, name = "date"),
    JsonSubTypes.Type(PageObjectFormulaProperty::class, name = "formula"),
    JsonSubTypes.Type(PageObjectRelationProperty::class, name = "relation"),
    JsonSubTypes.Type(PageObjectRollupProperty::class, name = "rollup"),
    JsonSubTypes.Type(PageObjectTitleProperty::class, name = "title"),
    JsonSubTypes.Type(PageObjectPeopleProperty::class, name = "people"),
    JsonSubTypes.Type(PageObjectFilesProperty::class, name = "files"),
    JsonSubTypes.Type(PageObjectCheckboxProperty::class, name = "checkbox"),
    JsonSubTypes.Type(PageObjectUrlProperty::class, name = "url"),
    JsonSubTypes.Type(PageObjectEmailProperty::class, name = "email"),
    JsonSubTypes.Type(PageObjectPhoneNumberProperty::class, name = "phone_number"),
    JsonSubTypes.Type(PageObjectCreatedByProperty::class, name = "created_time"),
    JsonSubTypes.Type(PageObjectCreatedByProperty::class, name = "created_by"),
    JsonSubTypes.Type(PageObjectLastEditedTimeProperty::class, name = "last_edited_time"),
    JsonSubTypes.Type(PageObjectLastEditedByProperty::class, name = "last_edited_by")
)
interface WithPageObjectProperty : WithPageProperty {
    @get:JsonProperty("object")
    val objectType: ObjectType?
}