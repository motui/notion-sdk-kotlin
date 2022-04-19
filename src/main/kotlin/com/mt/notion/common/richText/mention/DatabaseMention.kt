package com.mt.notion.common.richText.mention

/**
 * Database mentions
 *
 * @author it.motui
 * @see <a href="https://developers.notion.com/reference/rich-text">Rich text object</a>
 */
data class DatabaseMention(
    override val type: MentionType,
    val database: Database
) : WithMention {

    data class Database(
        val id: String
    )
}
