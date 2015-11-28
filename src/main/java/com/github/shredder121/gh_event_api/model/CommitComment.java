/*
 * Copyright 2015 Shredder121.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.github.shredder121.gh_event_api.model;

import java.time.ZonedDateTime;

/**
 * A comment on a part of the commit diff.
 *
 * @author Shredder121
 */
@lombok.Value
public class CommitComment {

    /**
     * The id of the comment, for GitHub bookkeeping.
     */
    Integer id;

    /**
     * The line index in the diff.
     */
    Integer position;

    /**
     * The relative path of the file that is being commented on.
     */
    String path;

    /**
     * The commit hash that is being commented on.
     */
    String commitId;

    /**
     * The body of the comment.
     */
    String body;

    /**
     * The (API) URL to view this commit comment.
     */
    String url;

    /**
     * The (GitHub Web UI) URL to view this commit comment.
     */
    String htmlUrl;

    /**
     * The time the comment was created.
     */
    ZonedDateTime createdAt;

    /**
     * The time the comment was last modified.
     */
    ZonedDateTime updatedAt;
}
