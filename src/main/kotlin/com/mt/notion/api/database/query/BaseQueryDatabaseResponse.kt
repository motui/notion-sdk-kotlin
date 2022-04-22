package com.mt.notion.api.database.query

import com.mt.notion.common.ObjectType

/**
 *
 * @author it.motui
 */
open class BaseQueryDatabaseResponse constructor(
    open val objectType: ObjectType,
    open val id: String
)