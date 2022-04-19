package com.mt.notion.api.oauth

import com.fasterxml.jackson.annotation.JsonProperty

/**
 * exchanging the grant for an access token http response
 * @author it.motui
 */
data class ExchangeAuthCodeResponse(
    /**
     * An access token used to authorize requests to the Notion API
     */
    @JsonProperty("access_token")
    val accessToken: String,
    /**
     * The ID of the workspace where this authorization took place.
     */
    @JsonProperty("workspace_id")
    val workspaceId: String,
    /**
     * A human-readable name which can be used to display this authorization in UI.
     */
    @JsonProperty("workspace_name")
    val workspaceName: String?,
    /**
     * A URL to an image which can be used to display this authorization in UI.
     */
    @JsonProperty("workspace_icon")
    val workspaceIcon: String?,
    /**
     * An identifier for this authorization.
     */
    @JsonProperty("bot_id")
    val botId: String,
    /**
     * An object containing information about who can view and share this integration. { "workspace": true }
     * will be returned for installations of workspace-level tokens. For user level tokens, a user object will be returned.
     */
    val owner: String,
)
