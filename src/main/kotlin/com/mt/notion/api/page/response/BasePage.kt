package com.mt.notion.api.page.response

import com.mt.notion.common.ObjectType

/**
 *
 * @author it.motui
 */
data class BasePage(
    override val objectType: ObjectType,
    val id: String
) : WithPage
