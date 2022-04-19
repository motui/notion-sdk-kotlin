package com.mt.notion.util

import com.fasterxml.jackson.databind.DeserializationFeature
import com.fasterxml.jackson.databind.ObjectMapper
import com.fasterxml.jackson.module.kotlin.jacksonObjectMapper
import org.slf4j.LoggerFactory

/**
 * json util for jackson
 *
 * @author it.motui
 */
object JsonUtil {
    private val logger = LoggerFactory.getLogger(JsonUtil.javaClass)
    private val mapper = jacksonObjectMapper()
        .configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false)

    /**
     * ObjectMapper实例
     *
     * @author it.motui
     * @since 0.1
     */
    fun instance(): ObjectMapper {
        return mapper
    }
}
