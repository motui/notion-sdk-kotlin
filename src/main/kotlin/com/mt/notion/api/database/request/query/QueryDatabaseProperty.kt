package com.mt.notion.api.database.request.query

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
    JsonSubTypes.Type(QueryTitleProperty::class, name = "title"),
    JsonSubTypes.Type(QueryRichTextProperty::class, name = "rich_text"),
    JsonSubTypes.Type(QueryNumberProperty::class, name = "number"),
    JsonSubTypes.Type(QuerySelectProperty::class, name = "select"),
    JsonSubTypes.Type(QueryMultiSelectProperty::class, name = "multi_select"),
    JsonSubTypes.Type(QueryDateProperty::class, name = "date"),
    JsonSubTypes.Type(QueryPeopleProperty::class, name = "people"),
    JsonSubTypes.Type(QueryFilesProperty::class, name = "files"),
    JsonSubTypes.Type(QueryCheckboxProperty::class, name = "checkbox"),
    JsonSubTypes.Type(QueryUrlProperty::class, name = "url"),
    JsonSubTypes.Type(QueryEmailProperty::class, name = "email"),
    JsonSubTypes.Type(QueryPhoneNumberProperty::class, name = "phone_number"),
    JsonSubTypes.Type(QueryFormulaProperty::class, name = "formula"),
    JsonSubTypes.Type(QueryRelationProperty::class, name = "relation"),
    JsonSubTypes.Type(QueryRollupProperty::class, name = "rollup"),
    JsonSubTypes.Type(QueryCreatedTimeProperty::class, name = "created_time"),
    JsonSubTypes.Type(QueryCreatedByProperty::class, name = "created_by"),
    JsonSubTypes.Type(QueryLastEditedTimeProperty::class, name = "last_edited_time"),
    JsonSubTypes.Type(QueryLastEditedByProperty::class, name = "last_edited_by"),
)
interface QueryDatabaseProperty {
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
