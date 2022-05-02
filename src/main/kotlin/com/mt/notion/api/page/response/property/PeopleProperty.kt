package com.mt.notion.api.page.response.property

import com.mt.notion.api.user.WithUser
import com.mt.notion.common.PropertyType

/**
 *
 * @author it.motui
 */
data class PeopleProperty(
    override val type: PropertyType,
    override val id: String,
    val people: List<WithUser>
) : WithProperty