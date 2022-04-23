package com.mt.notion.api.user

import com.mt.notion.api.NotionApi
import com.mt.notion.api.NotionApiConfig
import com.mt.notion.http.NotionHttpClient

/**
 * user api
 *
 * @author it.motui
 * @see <a href="https://developers.notion.com/reference/user">user</a>
 */
class UserNotionApi(
    override val config: NotionApiConfig,
    override val notionHttpClient: NotionHttpClient
) : NotionApi {

    /**
     * Retrieve your token's bot user
     *
     * @see <a href="https://developers.notion.com/reference/get-self">Retrieve your token's bot user</a>
     */
    fun me(): Bot {
        return notionHttpClient.get(
            url = "${this.config.baseUrl}/users/me",
            headers = this.notionHttpClient.buildHeader(
                this.notionHttpClient.bearerAuthorization(this.config.token),
                this.config.notionVersion
            ),
            responseClass = Bot::class.java
        )
    }

    /**
     * Retrieve a user
     *
     * @see <a href="https://developers.notion.com/reference/get-user">Retrieve a user</a>
     */
    fun retrieve(userId: String): WithUser {
        return notionHttpClient.get(
            url = "${this.config.baseUrl}/users/${userId}",
            headers = this.notionHttpClient.buildHeader(
                this.notionHttpClient.bearerAuthorization(this.config.token),
                this.config.notionVersion
            ),
            responseClass = WithUser::class.java
        )
    }

    /**
     * List all users
     *
     * @see <a href="https://developers.notion.com/reference/get-users">List all users</a>
     */
    fun list(request: UsersRequest): Users {
        return notionHttpClient.get(
            url = "${this.config.baseUrl}/users",
            query = request.toMap(),
            headers = this.notionHttpClient.buildHeader(
                this.notionHttpClient.bearerAuthorization(this.config.token),
                this.config.notionVersion
            ),
            responseClass = Users::class.java
        )
    }
}
