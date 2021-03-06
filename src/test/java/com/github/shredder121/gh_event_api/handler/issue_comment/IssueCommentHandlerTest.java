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
package com.github.shredder121.gh_event_api.handler.issue_comment;

import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.context.annotation.Bean;

import com.github.shredder121.gh_event_api.GHEventApiServer;
import com.github.shredder121.gh_event_api.handler.AbstractHandlerTest;

@SpringApplicationConfiguration(classes = {IssueCommentHandlerTest.class, GHEventApiServer.class})
public class IssueCommentHandlerTest extends AbstractHandlerTest {

    public IssueCommentHandlerTest() {
        super("issue_comment", "63c8ea0b2d07c8952a0ef86111991070516ce5d1");
    }

    @Bean
    private TestHandler handlerBean() {
        return new TestHandler();
    }
}
