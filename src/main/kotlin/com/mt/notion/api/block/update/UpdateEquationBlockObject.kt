package com.mt.notion.api.block.update

import com.mt.notion.api.block.BlockObjectType

/**
 *
 * @author it.motui
 */
data class UpdateEquationBlockObject(
    val type: BlockObjectType? = BlockObjectType.Equation,
    override val archived: Boolean = false,
    val equation: Equation,
) : UpdateBlockRequest {

    data class Equation(
        val expression: String? = null
    )
}