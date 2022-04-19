package com.mt.notion.api.database.property

import com.fasterxml.jackson.annotation.JsonSubTypes
import com.fasterxml.jackson.annotation.JsonTypeInfo
import com.mt.notion.common.PropertyType

/**
 * Property object
 *
* @author it.motui
 * @see <a href="https://developers.notion.com/reference/property-object">Property object</a>
 */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NAME,
    include = JsonTypeInfo.As.EXISTING_PROPERTY,
    property = "type",
    visible = true
)
@JsonSubTypes(
    JsonSubTypes.Type(TitleProperty::class, name = "title"),
    JsonSubTypes.Type(RichTextProperty::class, name = "rich_text"),
    JsonSubTypes.Type(NumberProperty::class, name = "number"),
    JsonSubTypes.Type(SelectProperty::class, name = "select"),
    JsonSubTypes.Type(MultiSelectProperty::class, name = "multi_select"),
    JsonSubTypes.Type(DateProperty::class, name = "date"),
    JsonSubTypes.Type(PeopleProperty::class, name = "people"),
    JsonSubTypes.Type(FilesProperty::class, name = "files"),
    JsonSubTypes.Type(CheckboxProperty::class, name = "checkbox"),
    JsonSubTypes.Type(UrlProperty::class, name = "url"),
    JsonSubTypes.Type(EmailProperty::class, name = "email"),
    JsonSubTypes.Type(PhoneNumberProperty::class, name = "phone_number"),
    JsonSubTypes.Type(FormulaProperty::class, name = "formula"),
    JsonSubTypes.Type(RelationProperty::class, name = "relation"),
    JsonSubTypes.Type(RollupProperty::class, name = "rollup"),
    JsonSubTypes.Type(CreatedTimeProperty::class, name = "created_time"),
    JsonSubTypes.Type(CreatedByProperty::class, name = "created_by"),
    JsonSubTypes.Type(LastEditedTimeProperty::class, name = "last_edited_time"),
    JsonSubTypes.Type(LastEditedByProperty::class, name = "last_edited_by"),
)
interface DatabaseProperty {
    /**
     * The ID of the property, usually a short string of random letters and symbols.
     * Some automatically generated property types have special human-readable IDs. For example,
     * all Title properties have an ID of "title".
     */
    val id: String

    /**
     * Type that controls the behavior of the property
     */
    val type: PropertyType

    /**
     * The name of the property as it appears in Notion.
     */
    val name: String
}
