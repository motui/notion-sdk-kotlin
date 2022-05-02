package com.mt.notion.api.block.objects

import com.mt.notion.common.response.WithObjectType

/**
 *
 * @author it.motui
 */
interface WithBlock : WithObjectType {
    val id: String
}