package com.mt.notion.api.block.update

import com.mt.notion.api.block.BlockObjectType

/**
 *
 * @author it.motui
 */
data class EquationUpdateBlockObject(
    val type: BlockObjectType? = BlockObjectType.Equation,
    override val archived: Boolean,
    val equation: Equation,
) : UpdateBlockRequest {

    data class Equation(
        val expression: String?
    )
}