package com.mt.notion.api.database.query.property

import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonSubTypes
import com.fasterxml.jackson.annotation.JsonTypeInfo
import com.mt.notion.common.DateResponse
import com.mt.notion.common.PropertyType

/**
 * Formula
 *
 * @author it.motui
 */
data class QueryFormulaProperty(
    override val id: String,
    override val type: PropertyType,
    val formula: WithFormula
) : QueryDatabaseProperty {

    enum class FormulaType constructor(val value: String) {

        @JsonProperty("string")
        StringType("string"),

        @JsonProperty("date")
        Date("date"),

        @JsonProperty("number")
        Number("number"),

        @JsonProperty("boolean")
        Boolean("boolean")
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
        JsonSubTypes.Type(StringFormula::class, name = "string"),
        JsonSubTypes.Type(DateFormula::class, name = "date"),
        JsonSubTypes.Type(NumberFormula::class, name = "number"),
        JsonSubTypes.Type(BooleanFormula::class, name = "boolean"),
    )
    interface WithFormula {
        val type: FormulaType
    }

    data class StringFormula(
        override val type: FormulaType,
        val string: String?
    ) : WithFormula

    data class DateFormula(
        override val type: FormulaType,
        val date: DateResponse?
    ) : WithFormula

    data class NumberFormula(
        override val type: FormulaType,
        val number: Number?
    ) : WithFormula

    data class BooleanFormula(
        override val type: FormulaType,
        val boolean: Boolean?
    ) : WithFormula
}
