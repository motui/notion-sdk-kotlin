package com.mt.notion.api.database.response

import com.mt.notion.common.ObjectType
import com.mt.notion.common.response.WithObjectType

/**
 *
 * @author it.motui
 */
open class ShortQueryDatabaseResponse constructor(
    override val objectType: ObjectType,
    open val id: String
) : WithObjectType