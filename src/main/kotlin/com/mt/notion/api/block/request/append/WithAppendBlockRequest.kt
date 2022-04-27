package com.mt.notion.api.block.request.append

import com.fasterxml.jackson.annotation.JsonProperty
import com.mt.notion.api.block.BlockObjectType
import com.mt.notion.common.ObjectType
import com.mt.notion.http.NotionHttpRequestContent

/**
 *
 * @author it.motui
 */
interface WithAppendBlockRequest : NotionHttpRequestContent {
    @get:JsonProperty("object")
    val objectType: ObjectType?
    val type: BlockObjectType?
}