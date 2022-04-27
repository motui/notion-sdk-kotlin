package com.mt.notion.api.block.request.children

import com.fasterxml.jackson.annotation.JsonProperty
import com.mt.notion.api.block.BlockObjectType
import com.mt.notion.common.ObjectType

/**
 *
 * @author it.motui
 */
interface BlockObjectRequestWithoutChildren {
    val type: BlockObjectType

    @get:JsonProperty("object")
    val objectType: ObjectType
}