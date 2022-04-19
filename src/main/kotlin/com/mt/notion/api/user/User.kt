package com.mt.notion.api.user

import com.mt.notion.common.ObjectType
import com.mt.notion.common.WithObjectType

/**
 * base user info
 *
 * @author it.motui
 */
open class User(
    override val objectType: ObjectType,
    open val id: String
) : WithObjectType
