package com.mt.notion.api.page.response.property.objects

import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonSubTypes
import com.fasterxml.jackson.annotation.JsonTypeInfo
import com.mt.notion.api.page.response.property.WithProperty
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
    JsonSubTypes.Type(RichTextObjectProperty::class, name = "rich_text"),
    JsonSubTypes.Type(NumberObjectProperty::class, name = "number"),
    JsonSubTypes.Type(SelectObjectProperty::class, name = "select"),
    JsonSubTypes.Type(MultiSelectObjectProperty::class, name = "multi_select"),
    JsonSubTypes.Type(DateObjectProperty::class, name = "date"),
    JsonSubTypes.Type(FormulaObjectProperty::class, name = "formula"),
    JsonSubTypes.Type(RelationObjectProperty::class, name = "relation"),
    JsonSubTypes.Type(RollupObjectProperty::class, name = "rollup"),
    JsonSubTypes.Type(TitleObjectProperty::class, name = "title"),
    JsonSubTypes.Type(PeopleObjectProperty::class, name = "people"),
    JsonSubTypes.Type(FilesObjectProperty::class, name = "files"),
    JsonSubTypes.Type(CheckboxObjectProperty::class, name = "checkbox"),
    JsonSubTypes.Type(UrlObjectProperty::class, name = "url"),
    JsonSubTypes.Type(EmailObjectProperty::class, name = "email"),
    JsonSubTypes.Type(PhoneNumberObjectProperty::class, name = "phone_number"),
    JsonSubTypes.Type(CreatedByObjectProperty::class, name = "created_time"),
    JsonSubTypes.Type(CreatedByObjectProperty::class, name = "created_by"),
    JsonSubTypes.Type(LastEditedTimeObjectProperty::class, name = "last_edited_time"),
    JsonSubTypes.Type(LastEditedByObjectProperty::class, name = "last_edited_by")
)
interface WithObjectProperty : WithProperty {
    @get:JsonProperty("object")
    val objectType: ObjectType?
}