package com.mt.notion.api.database.request.update.property

import com.mt.notion.api.database.request.create.property.WithUpdateDatabaseProperty
import com.mt.notion.common.PropertyType
import com.mt.notion.common.request.ExpressionRequest

/**
 * Formula
 *
 * @author it.motui
 */
data class UpdateDatabaseFormulaPropertyRequest(
    override val type: PropertyType = PropertyType.Formula,
    override val name: String? = null,
    val formula: ExpressionRequest
) : WithUpdateDatabaseProperty
