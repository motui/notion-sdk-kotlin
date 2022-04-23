package com.mt.notion.api.database.query

import com.mt.notion.common.ObjectType
import com.mt.notion.common.WithObjectType

/**
 *
 * @author it.motui
 */
open class ShortQueryDatabaseResponse constructor(
    override val objectType: ObjectType,
    open val id: String
) : WithObjectType