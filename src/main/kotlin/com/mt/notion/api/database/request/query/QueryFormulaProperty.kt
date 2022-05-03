package com.mt.notion.api.database.request.query

import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonSubTypes
import com.fasterxml.jackson.annotation.JsonTypeInfo
import com.mt.notion.common.PropertyType
import com.mt.notion.common.request.DateRequest

/**
 * Formula
 *
 * @author it.motui
 */
data class QueryFormulaProperty(
    override val id: String,
    override val type: PropertyType,
    val formula: com.mt.notion.api.database.request.query.property.QueryFormulaProperty.WithFormula
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
        JsonSubTypes.Type(com.mt.notion.api.database.request.query.property.QueryFormulaProperty.StringFormula::class, name = "string"),
        JsonSubTypes.Type(com.mt.notion.api.database.request.query.property.QueryFormulaProperty.DateFormula::class, name = "date"),
        JsonSubTypes.Type(com.mt.notion.api.database.request.query.property.QueryFormulaProperty.NumberFormula::class, name = "number"),
        JsonSubTypes.Type(com.mt.notion.api.database.request.query.property.QueryFormulaProperty.BooleanFormula::class, name = "boolean"),
    )
    interface WithFormula {
        val type: com.mt.notion.api.database.request.query.property.QueryFormulaProperty.FormulaType
    }

    data class StringFormula(
        override val type: com.mt.notion.api.database.request.query.property.QueryFormulaProperty.FormulaType,
        val string: String?
    ) : com.mt.notion.api.database.request.query.property.QueryFormulaProperty.WithFormula

    data class DateFormula(
        override val type: com.mt.notion.api.database.request.query.property.QueryFormulaProperty.FormulaType,
        val date: DateRequest?
    ) : com.mt.notion.api.database.request.query.property.QueryFormulaProperty.WithFormula

    data class NumberFormula(
        override val type: com.mt.notion.api.database.request.query.property.QueryFormulaProperty.FormulaType,
        val number: Number?
    ) : com.mt.notion.api.database.request.query.property.QueryFormulaProperty.WithFormula

    data class BooleanFormula(
        override val type: com.mt.notion.api.database.request.query.property.QueryFormulaProperty.FormulaType,
        val boolean: Boolean?
    ) : com.mt.notion.api.database.request.query.property.QueryFormulaProperty.WithFormula
}
