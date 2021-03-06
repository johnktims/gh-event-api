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
package com.github.shredder121.gh_event_api.handler.push;

import static com.google.common.collect.Iterables.getOnlyElement;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;

import java.util.Collection;

import com.github.shredder121.gh_event_api.handler.AbstractTestHandlerBean;
import com.github.shredder121.gh_event_api.model.PushCommit;

class TestHandler extends AbstractTestHandlerBean implements PushHandler {

    @Override
    public void handle(PushPayload payload) {
        errorCollector.checkThat(payload.getRef(), is("refs/heads/changes"));

        errorCollector.checkThat(payload.getBefore(), is("9049f1265b7d61be4a8904a9a27120d2064dab3b"));

        errorCollector.checkThat(payload.getAfter(), is("0d1a26e67d8f5eaf1f6ba5c57fc3c7d91ac0fd1c"));

        errorCollector.checkThat(payload.getCreated(), is(false));

        errorCollector.checkThat(payload.getDeleted(), is(false));

        errorCollector.checkThat(payload.getForced(), is(false));

        Collection<PushCommit> commits = payload.getCommits();
        PushCommit commit = getOnlyElement(commits);
        errorCollector.checkThat(commit.getMessage(), is("Update README.md"));

        errorCollector.checkThat(payload.getHeadCommit(), is(equalTo(commit)));

        countDownLatch.countDown();
    }
}
