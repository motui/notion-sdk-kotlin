package com.mt.notion.common

import com.mt.notion.common.file.FileType

/**
 * Emoji
 *
 * @author it.motui
 * @since 0.1
 * @see <a href="https://developers.notion.com/reference/emoji-object">emoji-object</a>
 */
data class Emoji(
    /**
     * Type of page icon. Possible values are: "emoji".
     */
    override var type: FileType,
    /**
     * Emoji character.
     */
    var emoji: String
) : Icon