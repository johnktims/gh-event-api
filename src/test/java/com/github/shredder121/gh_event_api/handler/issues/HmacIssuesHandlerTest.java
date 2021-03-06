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
package com.github.shredder121.gh_event_api.handler.issues;

import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.boot.test.WebIntegrationTest;

import com.github.shredder121.gh_event_api.GHEventApiServer;

@SpringApplicationConfiguration(classes = {HmacIssuesHandlerTest.class, GHEventApiServer.class})
@WebIntegrationTest({"secret=secret", "spring.main.show-banner=false"})
public class HmacIssuesHandlerTest extends IssuesHandlerTest {
}
