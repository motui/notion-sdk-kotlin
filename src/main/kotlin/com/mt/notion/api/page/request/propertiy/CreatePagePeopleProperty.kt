package com.mt.notion.api.page.request.propertiy

import com.mt.notion.api.page.request.propertiy.people.WithCreatePeoplePropertyPeople
import com.mt.notion.common.PropertyType

/**
 *
 * @author it.motui
 */
data class CreatePagePeopleProperty(
    override val type: PropertyType = PropertyType.People,
    val people: List<WithCreatePeoplePropertyPeople>
) : WithCreatePageProperty
