package com.mt.notion.common.request.file

import com.mt.notion.common.response.file.FileType

/**
 * Emoji
 *
 * @author it.motui
 * @see <a href="https://developers.notion.com/reference/emoji-object">emoji-object</a>
 */
data class EmojiRequest(
    override var type: FileType = FileType.Emoji,
    /**
     * todo 补充emoji枚举
     */
    var emoji: String
) : IconRequest
