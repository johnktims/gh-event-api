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

import com.fasterxml.jackson.databind.PropertyNamingStrategy.LowerCaseWithUnderscoresStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import com.github.shredder121.gh_event_api.model.json.PropertyBasedJsonCreator;

/**
 * A GitHub User object.
 *
 * @author Shredder121
 */
@lombok.Value
@JsonNaming(LowerCaseWithUnderscoresStrategy.class)
@lombok.AllArgsConstructor(
        access = lombok.AccessLevel.PACKAGE,
        onConstructor = @__(@PropertyBasedJsonCreator)
)
public class User {

    /**
     * The id of this user.
     */
    Integer id;

    /**
     * The username of this user.
     */
    String login;

    /**
     * The (API) URL to view this user.
     */
    String url;

    /**
     * The (GitHub Web UI) URL to view this user.
     */
    String htmlUrl;
}
