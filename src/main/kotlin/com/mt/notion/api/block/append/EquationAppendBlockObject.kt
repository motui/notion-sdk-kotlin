package com.mt.notion.api.block.append

import com.mt.notion.api.block.BlockObjectType
import com.mt.notion.common.ObjectType

/**
 *
 * @author it.motui
 */
data class EquationAppendBlockObject(
    override val objectType: ObjectType = ObjectType.Block,
    override val type: BlockObjectType? = BlockObjectType.Equation,
    val equation: Equation,
) : WithAppendBlockRequest {

    data class Equation(
        val expression: String
    )
}