package com.mt.notion.util

import com.fasterxml.jackson.databind.ObjectMapper
import com.fasterxml.jackson.module.kotlin.jacksonObjectMapper
import org.slf4j.LoggerFactory

/**
 * json util for jackson
 *
 * @author it.motui
 * @since 0.1
 */
object JsonUtil {
    private val logger = LoggerFactory.getLogger(JsonUtil.javaClass)
    private val mapper = jacksonObjectMapper()

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