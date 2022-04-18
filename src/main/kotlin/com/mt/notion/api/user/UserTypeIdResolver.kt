package com.mt.notion.api.user

import com.fasterxml.jackson.annotation.JsonTypeInfo
import com.fasterxml.jackson.databind.DatabindContext
import com.fasterxml.jackson.databind.JavaType
import com.fasterxml.jackson.databind.jsontype.TypeIdResolver

/**
 *
 * @author it.motui
 */
class UserTypeIdResolver : TypeIdResolver {
    private var baseType: JavaType? = null

    override fun init(javaType: JavaType?) {
        baseType = javaType
    }

    override fun idFromValue(value: Any?): String {
        return idFromValueAndType(value, value?.javaClass)
    }

    override fun idFromValueAndType(value: Any?, suggestedType: Class<*>?): String {
        TODO("Not yet implemented")
    }

    override fun idFromBaseType(): String {
        TODO("Not yet implemented")
    }

    override fun typeFromId(context: DatabindContext?, id: String?): JavaType {
        TODO("Not yet implemented")
    }

    override fun getDescForKnownTypeIds(): String {
        TODO("Not yet implemented")
    }

    override fun getMechanism(): JsonTypeInfo.Id {
        TODO("Not yet implemented")
    }
}