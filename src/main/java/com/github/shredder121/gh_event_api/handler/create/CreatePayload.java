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
package com.github.shredder121.gh_event_api.handler.create;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.databind.PropertyNamingStrategy.LowerCaseWithUnderscoresStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import com.github.shredder121.gh_event_api.model.Repository;
import com.github.shredder121.gh_event_api.model.User;
import com.github.shredder121.gh_event_api.model.json.PropertyBasedJsonCreator;

/**
 * The payload passed when a {@code create} event is received.
 *
 * @author Shredder121
 */
@lombok.Value
@JsonNaming(LowerCaseWithUnderscoresStrategy.class)
@lombok.AllArgsConstructor(
        access = lombok.AccessLevel.PACKAGE,
        onConstructor = @__(@PropertyBasedJsonCreator)
)
public class CreatePayload {

    /**
     * The type of the object being created.
     * Can be one of 'repository', 'branch' or 'tag'.
     */
    @NotNull String refType;

    /**
     * The git ref (or null if only a repository was created).
     */
    @NotNull String ref;

    /**
     * The name of the repository's default branch.
     */
    @NotNull String masterBranch;

    /**
     * The repository's current description.
     */
    String description;

    /**
     * The type of account that created the object.
     */
    @NotNull String pusherType;

    /**
     * The repository where the object was created.
     */
    @NotNull Repository repository;

    /**
     * The user that created the object.
     */
    @NotNull User sender;
}
