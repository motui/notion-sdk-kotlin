package com.mt.notion.api.block.objects

import com.mt.notion.common.ObjectType

/**
 *
 * @author it.motui
 */
data class PartialBlockObject(
    override val objectType: ObjectType,
    override val id: String
) : WithBlock
