package com.mt.notion.api.user

import com.fasterxml.jackson.annotation.JsonTypeName
import com.mt.notion.common.ObjectType
import com.mt.notion.common.WithObjectType

/**
 * base user info
 *
 * @author it.motui
 * @since 0.1
 */
open class BaseUser(
    override val objectType: ObjectType,
    open val id: String
) : WithObjectType {

}