package com.mt.notion.api.page.response.property

import com.mt.notion.common.PropertyType
import com.mt.notion.common.response.richText.RichText

/**
 *
 * @author it.motui
 */
data class PageTitleProperty(
    override val type: PropertyType,
    override val id: String,
    val title: List<RichText>
) : WithPageProperty
