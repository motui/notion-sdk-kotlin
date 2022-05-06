package com.mt.notion.api.database.request.create.property

import com.mt.notion.common.PropertyType
import com.mt.notion.common.request.ExpressionRequest

/**
 * Formula
 *
 * @author it.motui
 */
data class CreateDatabaseFormulaPropertyRequest(
    override val type: PropertyType = PropertyType.Formula,
    val formula: ExpressionRequest
) : WithCreateDatabaseProperty
