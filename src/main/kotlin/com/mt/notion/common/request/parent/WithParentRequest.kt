package com.mt.notion.common.request.parent

import com.mt.notion.api.database.ParentType

/**
 * Database
 *
 * @author it.motui
 */
interface WithParentRequest {
    val type: ParentType
}
