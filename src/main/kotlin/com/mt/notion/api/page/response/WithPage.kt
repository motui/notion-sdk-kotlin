package com.mt.notion.api.page.response

import com.fasterxml.jackson.annotation.JsonProperty
import com.mt.notion.common.ObjectType

/**
 * todo 兼容BasePage和Page切换
 * @author it.motui
 */
interface WithPage {
    @get:JsonProperty("object")
    val objectType: ObjectType
}