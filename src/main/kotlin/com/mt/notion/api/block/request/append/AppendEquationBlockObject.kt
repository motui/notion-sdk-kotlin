package com.mt.notion.api.block.request.append

import com.mt.notion.api.block.BlockObjectType
import com.mt.notion.common.ObjectType

/**
 *
 * @author it.motui
 */
data class AppendEquationBlockObject(
    override val objectType: ObjectType = ObjectType.Block,
    override val type: BlockObjectType? = BlockObjectType.Equation,
    val equation: Equation,
) : WithAppendBlockRequest,
    BlockRequestWithChildren {

    data class Equation(
        val expression: String
    )
}