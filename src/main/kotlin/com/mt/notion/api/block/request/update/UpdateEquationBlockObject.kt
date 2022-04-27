package com.mt.notion.api.block.request.update

import com.mt.notion.api.block.BlockObjectType

/**
 *
 * @author it.motui
 */
data class UpdateEquationBlockObject(
    val type: BlockObjectType? = BlockObjectType.Equation,
    override val archived: Boolean = false,
    val equation: com.mt.notion.api.block.request.update.UpdateEquationBlockObject.Equation,
) : com.mt.notion.api.block.request.update.UpdateBlockRequest {

    data class Equation(
        val expression: String? = null
    )
}