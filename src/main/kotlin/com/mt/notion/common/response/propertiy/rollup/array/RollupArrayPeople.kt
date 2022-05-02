package com.mt.notion.common.response.propertiy.rollup.array

import com.mt.notion.api.user.User

/**
 *
 * @author it.motui
 */
data class RollupArrayPeople(
    override val type: RollupArrayType,
    val people: List<User>
) : WithRollupArray