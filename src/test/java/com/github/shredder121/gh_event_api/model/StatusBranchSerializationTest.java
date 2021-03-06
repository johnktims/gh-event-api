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

import static org.hamcrest.Matchers.is;

public class StatusBranchSerializationTest extends AbstractSerializationTest<StatusBranch> {

    private static final String SAMPLE_STATUS_BRANCH
            = "{\n"
            + "  \"name\": \"master\",\n"
            + "  \"commit\": {\n"
            + "    \"sha\": \"9049f1265b7d61be4a8904a9a27120d2064dab3b\",\n"
            + "    \"url\": \"https://api.github.com/repos/baxterthehacker/public-repo/commits/9049f1265b7d61be4a8904a9a27120d2064dab3b\"\n"
            + "  }\n"
            + "}";

    public StatusBranchSerializationTest() {
        super(StatusBranch.class);
    }

    @Override
    protected String getSample() {
        return SAMPLE_STATUS_BRANCH;
    }

    @Override
    protected void checkDeserialized(StatusBranch branch) {
        errorCollector.checkThat(branch.getName(), is("master"));
    }
}
