package com.mt.notion.common.response.propertiy.formula

import com.fasterxml.jackson.annotation.JsonSubTypes
import com.fasterxml.jackson.annotation.JsonTypeInfo

/**
 *
 * @author it.motui
 */
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