package com.mt.notion.api.page.response.property.objects

import com.mt.notion.api.user.WithUser
import com.mt.notion.common.ObjectType
import com.mt.notion.common.PropertyType

/**
 *
 * @author it.motui
 */
data class PageObjectPeopleProperty(
    override val objectType: ObjectType?,
    override val type: PropertyType,
    override val id: String,
    val people: List<WithUser>
) : WithPageObjectProperty
