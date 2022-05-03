package com.mt.notion.api.database.response.property

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
    JsonSubTypes.Type(DatabaseTitleProperty::class, name = "title"),
    JsonSubTypes.Type(DatabaseRichTextProperty::class, name = "rich_text"),
    JsonSubTypes.Type(DatabaseNumberProperty::class, name = "number"),
    JsonSubTypes.Type(DatabaseSelectProperty::class, name = "select"),
    JsonSubTypes.Type(DatabaseMultiSelectProperty::class, name = "multi_select"),
    JsonSubTypes.Type(DatabaseDateProperty::class, name = "date"),
    JsonSubTypes.Type(DatabasePeopleProperty::class, name = "people"),
    JsonSubTypes.Type(DatabaseFilesProperty::class, name = "files"),
    JsonSubTypes.Type(DatabaseCheckboxProperty::class, name = "checkbox"),
    JsonSubTypes.Type(DatabaseUrlProperty::class, name = "url"),
    JsonSubTypes.Type(DatabaseEmailProperty::class, name = "email"),
    JsonSubTypes.Type(DatabasePhoneNumberProperty::class, name = "phone_number"),
    JsonSubTypes.Type(DatabaseFormulaProperty::class, name = "formula"),
    JsonSubTypes.Type(DatabaseRelationProperty::class, name = "relation"),
    JsonSubTypes.Type(DatabaseRollupProperty::class, name = "rollup"),
    JsonSubTypes.Type(DatabaseCreatedTimeProperty::class, name = "created_time"),
    JsonSubTypes.Type(DatabaseCreatedByProperty::class, name = "created_by"),
    JsonSubTypes.Type(DatabaseLastEditedTimeProperty::class, name = "last_edited_time"),
    JsonSubTypes.Type(DatabaseLastEditedByProperty::class, name = "last_edited_by"),
)
interface WithDatabaseProperty {
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
