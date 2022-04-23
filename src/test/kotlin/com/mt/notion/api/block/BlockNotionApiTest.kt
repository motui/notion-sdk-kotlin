package com.mt.notion.api.block

import com.mt.notion.api.BaseNotionApi
import com.mt.notion.api.block.objects.ParagraphBlockObject
import com.mt.notion.api.block.update.ToDoUpdateBlockRequest
import com.mt.notion.common.request.richText.AnnotationsRequest
import com.mt.notion.common.request.richText.TextRequest
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

/**
 *
 * @author it.motui
 */
internal class BlockNotionApiTest : BaseNotionApi() {
    private val blockNotionApi = BlockNotionApi(super.notionApiConfig(), super.notionHttpClient())

    @Test
    @Disabled
    fun retrieve() {
        val blockObject = blockNotionApi.retrieve(super.BLOCK_ID)
        Assertions.assertNotNull(blockObject)
        Assertions.assertTrue(blockObject is ParagraphBlockObject)
    }

    @Test
    @Disabled
    fun children() {
        val blocks = blockNotionApi.children(super.PAGE_ID, BlocksRequest(null, null))
        Assertions.assertNotNull(blocks)
        Assertions.assertNotNull(blocks.results)
        Assertions.assertEquals(23, blocks.results.size)
    }

    @Test
    @Disabled
    fun childrenPage() {
        // set pageSize
        var blocks = blockNotionApi.children(super.PAGE_ID, BlocksRequest(null, 2))
        Assertions.assertNotNull(blocks)
        Assertions.assertNotNull(blocks.results)
        blocks.hasMore?.let { Assertions.assertTrue(it) }
        Assertions.assertEquals(2, blocks.results.size)
        Assertions.assertEquals("dfe22609-e220-46c4-85a1-3e4ab7c0663b", blocks.results[0].id)
        // set startCursor
        blocks = blockNotionApi.children(super.PAGE_ID, BlocksRequest("e27427c0-340e-4aab-935d-5c2b14c158a4", 2))
        Assertions.assertNotNull(blocks)
        Assertions.assertNotNull(blocks.results)
        blocks.hasMore?.let { Assertions.assertTrue(it) }
        Assertions.assertEquals(2, blocks.results.size)
        Assertions.assertEquals("e27427c0-340e-4aab-935d-5c2b14c158a4", blocks.results[0].id)
    }

    @Test
    @Disabled
    fun update() {
        val edit = TextRequest(
            annotations = AnnotationsRequest(),
            text = TextRequest.TextInfo("B-api-edit", null)
        )
        // to-do
        val blocks = blockNotionApi.update(
            "e5249298-0366-432c-9482-c5e330794980",
            ToDoUpdateBlockRequest(
                toDo = ToDoUpdateBlockRequest.ToDo(
                    richText = listOf(edit),
                    checked = true
                )
            )
        )
        Assertions.assertNotNull(blocks)
    }
}