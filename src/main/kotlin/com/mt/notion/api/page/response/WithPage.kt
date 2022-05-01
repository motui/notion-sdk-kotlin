package com.mt.notion.api.page.response

import com.fasterxml.jackson.annotation.JsonProperty
import com.mt.notion.common.ObjectType

/**
 *
 * @author it.motui
 */
interface WithPage {
    @get:JsonProperty("object")
    val objectType: ObjectType
}