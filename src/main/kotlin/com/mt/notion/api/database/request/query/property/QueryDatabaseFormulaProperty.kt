package com.mt.notion.api.database.request.query.property

import com.mt.notion.common.PropertyType
import com.mt.notion.common.response.propertiy.formula.WithFormula

/**
 * Formula
 *
 * @author it.motui
 */
data class QueryDatabaseFormulaProperty(
    override val id: String,
    override val type: PropertyType,
    val formula: WithFormula
) : WithQueryDatabaseProperty
