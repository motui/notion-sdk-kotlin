package com.mt.notion.api.page.request.propertiy

import com.mt.notion.common.PropertyType
import com.mt.notion.common.request.richText.RichTextRequest

/**
 *
 * @author it.motui
 */
data class CreatePageTitleProperty(
    override val type: PropertyType = PropertyType.Title,
    val title: List<RichTextRequest>
) : WithCreatePageProperty
