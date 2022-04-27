package com.mt.notion.common.request.parent

import com.mt.notion.api.database.DatabaseParentType

/**
 * Database
 *
 * @author it.motui
 */
interface WithDatabaseParentRequest {
    val type: DatabaseParentType
}
