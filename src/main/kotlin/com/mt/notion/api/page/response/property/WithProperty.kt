package com.mt.notion.api.page.response.property

import com.mt.notion.common.PropertyType

/**
 * todo 兼容String类型
 * @author it.motui
 */
interface WithProperty {
    val type: PropertyType
    val id: String
}