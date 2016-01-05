/*
 * Copyright 2016 Shredder121.
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

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * A commit object that is used in the status event.
 *
 * @author Shredder121
 */
@lombok.Value
public class StatusCommit {

    /**
     * The SHA hash of the commit.
     */
    String sha;

    /**
     * The (API) URL to fetch the commit.
     */
    String url;

    /**
     * The (GitHub Web UI) URL to view the commit.
     */
    String htmlUrl;

    /**
     * The underlying commit details.
     */
    GitCommit commit;

    @JsonCreator
    StatusCommit(
            @JsonProperty("sha") String sha,
            @JsonProperty("url") String url,
            @JsonProperty("html_url") String htmlUrl,
            @JsonProperty("commit") GitCommit commit) {

        this.sha = sha;
        this.url = url;
        this.htmlUrl = htmlUrl;
        this.commit = commit;
    }
}
