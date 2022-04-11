package com.mt.notion.http

import com.fasterxml.jackson.core.type.TypeReference
import com.mt.notion.util.JsonUtil

/**
 * notion request content
 *
 * @author it.motui
 */
interface NotionHttpRequestContent {

    /**
     * current request class to map
     * @return key:fieldName, value:field value
     */
    fun toMap(): Map<String, String> {
        val mapper = JsonUtil.instance()
        val string = mapper.writeValueAsString(this)
        return mapper.readValue(string, object : TypeReference<Map<String, String>>() {})
    }
}