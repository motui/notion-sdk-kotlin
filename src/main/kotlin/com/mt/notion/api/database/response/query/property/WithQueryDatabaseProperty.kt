package com.mt.notion.api.database.response.query.property

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
    JsonSubTypes.Type(QueryDatabaseTitleProperty::class, name = "title"),
    JsonSubTypes.Type(QueryDatabaseRichTextProperty::class, name = "rich_text"),
    JsonSubTypes.Type(QueryDatabaseNumberProperty::class, name = "number"),
    JsonSubTypes.Type(QueryDatabaseSelectProperty::class, name = "select"),
    JsonSubTypes.Type(QueryDatabaseMultiSelectProperty::class, name = "multi_select"),
    JsonSubTypes.Type(QueryDatabaseDateProperty::class, name = "date"),
    JsonSubTypes.Type(QueryDatabasePeopleProperty::class, name = "people"),
    JsonSubTypes.Type(QueryDatabaseFilesProperty::class, name = "files"),
    JsonSubTypes.Type(QueryDatabaseCheckboxProperty::class, name = "checkbox"),
    JsonSubTypes.Type(QueryDatabaseUrlProperty::class, name = "url"),
    JsonSubTypes.Type(QueryDatabaseEmailProperty::class, name = "email"),
    JsonSubTypes.Type(QueryDatabasePhoneNumberProperty::class, name = "phone_number"),
    JsonSubTypes.Type(QueryDatabaseFormulaProperty::class, name = "formula"),
    JsonSubTypes.Type(QueryDatabaseRelationProperty::class, name = "relation"),
    JsonSubTypes.Type(QueryDatabaseRollupProperty::class, name = "rollup"),
    JsonSubTypes.Type(QueryDatabaseCreatedTimeProperty::class, name = "created_time"),
    JsonSubTypes.Type(QueryDatabaseCreatedByProperty::class, name = "created_by"),
    JsonSubTypes.Type(QueryDatabaseLastEditedTimeProperty::class, name = "last_edited_time"),
    JsonSubTypes.Type(QueryDatabaseLastEditedByProperty::class, name = "last_edited_by"),
)
interface WithQueryDatabaseProperty {
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
}
