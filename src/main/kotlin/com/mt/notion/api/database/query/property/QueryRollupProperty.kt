package com.mt.notion.api.database.query.property

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
    val rollup: WithRollup
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
        JsonSubTypes.Type(ArrayRollup::class, name = "array"),
        JsonSubTypes.Type(DateRollup::class, name = "date"),
        JsonSubTypes.Type(NumberRollup::class, name = "number"),
    )
    interface WithRollup {
        val type: RollupType
        val function: RollupFunction
    }

    data class ArrayRollup(
        override val type: RollupType,
        override val function: RollupFunction,
        val array: WithArray?
    ) : WithRollup

    data class DateRollup(
        override val type: RollupType,
        override val function: RollupFunction,
        val date: DateRequest?
    ) : WithRollup

    data class NumberRollup(
        override val type: RollupType,
        override val function: RollupFunction,
        val number: Number?
    ) : WithRollup


    @JsonTypeInfo(
        use = JsonTypeInfo.Id.NAME,
        include = JsonTypeInfo.As.EXISTING_PROPERTY,
        property = "type",
        visible = true
    )
    @JsonSubTypes(
        JsonSubTypes.Type(Title::class, name = "title"),
        JsonSubTypes.Type(RichText::class, name = "rich_text"),
        JsonSubTypes.Type(People::class, name = "people"),
        JsonSubTypes.Type(Relation::class, name = "relation"),
    )
    interface WithArray {
        val type: ArrayType
    }

    data class Title(
        override val type: ArrayType,
        val title: List<RichText>
    ) : WithArray

    data class RichText(
        override val type: ArrayType,
        @JsonProperty("rich_text")
        val richText: List<RichText>
    ) : WithArray

    data class People(
        override val type: ArrayType,
        val people: User
    ) : WithArray

    data class Relation(
        override val type: ArrayType,
        val relation: List<Id>
    ) : WithArray


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
