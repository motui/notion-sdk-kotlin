package com.mt.notion.api.database.request.query

import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonSubTypes
import com.fasterxml.jackson.annotation.JsonTypeInfo
import com.mt.notion.api.user.User
import com.mt.notion.common.Id
import com.mt.notion.common.PropertyType
import com.mt.notion.common.RollupFunction
import com.mt.notion.common.request.DateRequest

/**
 * Rollup
 *
 * @author it.motui
 */
data class QueryRollupProperty(
    override val id: String,
    override val type: PropertyType,
    val rollup: com.mt.notion.api.database.request.query.property.QueryRollupProperty.WithRollup
) : QueryDatabaseProperty {
    enum class RollupType constructor(val value: String) {

        @JsonProperty("array")
        Array("array"),

        @JsonProperty("date")
        Date("date"),

        @JsonProperty("number")
        Number("number"),

        ;

        override fun toString(): String = value
    }

    @JsonTypeInfo(
        use = JsonTypeInfo.Id.NAME,
        include = JsonTypeInfo.As.EXISTING_PROPERTY,
        property = "type",
        visible = true
    )
    @JsonSubTypes(
        JsonSubTypes.Type(com.mt.notion.api.database.request.query.property.QueryRollupProperty.ArrayRollup::class, name = "array"),
        JsonSubTypes.Type(com.mt.notion.api.database.request.query.property.QueryRollupProperty.DateRollup::class, name = "date"),
        JsonSubTypes.Type(com.mt.notion.api.database.request.query.property.QueryRollupProperty.NumberRollup::class, name = "number"),
    )
    interface WithRollup {
        val type: com.mt.notion.api.database.request.query.property.QueryRollupProperty.RollupType
        val function: RollupFunction
    }

    data class ArrayRollup(
        override val type: com.mt.notion.api.database.request.query.property.QueryRollupProperty.RollupType,
        override val function: RollupFunction,
        val array: com.mt.notion.api.database.request.query.property.QueryRollupProperty.WithArray?
    ) : com.mt.notion.api.database.request.query.property.QueryRollupProperty.WithRollup

    data class DateRollup(
        override val type: com.mt.notion.api.database.request.query.property.QueryRollupProperty.RollupType,
        override val function: RollupFunction,
        val date: DateRequest?
    ) : com.mt.notion.api.database.request.query.property.QueryRollupProperty.WithRollup

    data class NumberRollup(
        override val type: com.mt.notion.api.database.request.query.property.QueryRollupProperty.RollupType,
        override val function: RollupFunction,
        val number: Number?
    ) : com.mt.notion.api.database.request.query.property.QueryRollupProperty.WithRollup


    @JsonTypeInfo(
        use = JsonTypeInfo.Id.NAME,
        include = JsonTypeInfo.As.EXISTING_PROPERTY,
        property = "type",
        visible = true
    )
    @JsonSubTypes(
        JsonSubTypes.Type(com.mt.notion.api.database.request.query.property.QueryRollupProperty.Title::class, name = "title"),
        JsonSubTypes.Type(com.mt.notion.api.database.request.query.property.QueryRollupProperty.RichText::class, name = "rich_text"),
        JsonSubTypes.Type(com.mt.notion.api.database.request.query.property.QueryRollupProperty.People::class, name = "people"),
        JsonSubTypes.Type(com.mt.notion.api.database.request.query.property.QueryRollupProperty.Relation::class, name = "relation"),
    )
    interface WithArray {
        val type: com.mt.notion.api.database.request.query.property.QueryRollupProperty.ArrayType
    }

    data class Title(
        override val type: com.mt.notion.api.database.request.query.property.QueryRollupProperty.ArrayType,
        val title: List<com.mt.notion.api.database.request.query.property.QueryRollupProperty.RichText>
    ) : com.mt.notion.api.database.request.query.property.QueryRollupProperty.WithArray

    data class RichText(
        override val type: com.mt.notion.api.database.request.query.property.QueryRollupProperty.ArrayType,
        @JsonProperty("rich_text")
        val richText: List<com.mt.notion.api.database.request.query.property.QueryRollupProperty.RichText>
    ) : com.mt.notion.api.database.request.query.property.QueryRollupProperty.WithArray

    data class People(
        override val type: com.mt.notion.api.database.request.query.property.QueryRollupProperty.ArrayType,
        val people: User
    ) : com.mt.notion.api.database.request.query.property.QueryRollupProperty.WithArray

    data class Relation(
        override val type: com.mt.notion.api.database.request.query.property.QueryRollupProperty.ArrayType,
        val relation: List<Id>
    ) : com.mt.notion.api.database.request.query.property.QueryRollupProperty.WithArray


    enum class ArrayType constructor(val value: String) {

        @JsonProperty("title")
        Title("title"),

        @JsonProperty("rich_text")
        RichText("rich_text"),

        @JsonProperty("people")
        People("people"),

        @JsonProperty("relation")
        Relation("relation"),

        ;

        override fun toString(): String = value
    }

}
