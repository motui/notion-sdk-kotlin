package com.mt.notion.api.block.request.children

import com.mt.notion.api.block.BlockObjectType
import com.mt.notion.common.Expression
import com.mt.notion.common.ObjectType

/**
 *
 * @author it.motui
 */
data class EquationBlockRequestWithoutChildren(
    override val type: BlockObjectType = BlockObjectType.Equation,
    override val objectType: ObjectType = ObjectType.Block,
    val equation: Expression,
) : BlockObjectRequestWithoutChildren