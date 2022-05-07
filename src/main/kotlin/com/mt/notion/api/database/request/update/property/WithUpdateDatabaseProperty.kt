package com.mt.notion.api.database.request.create.property

import com.mt.notion.common.PropertyType

/**
 * Property object
 *
 * @author it.motui
 */
interface WithUpdateDatabaseProperty {
    val type: PropertyType
    val name: String?
}
