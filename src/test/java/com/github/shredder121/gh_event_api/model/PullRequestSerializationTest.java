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

import static org.hamcrest.Matchers.*;

public class PullRequestSerializationTest extends AbstractSerializationTest<PullRequest> {

    public static final String SAMPLE_PULL_REQUEST
            = "{\n"
            + "  \"url\": \"https://api.github.com/repos/baxterthehacker/public-repo/pulls/1\",\n"
            + "  \"id\": 34778301,\n"
            + "  \"html_url\": \"https://github.com/baxterthehacker/public-repo/pull/1\",\n"
            + "  \"diff_url\": \"https://github.com/baxterthehacker/public-repo/pull/1.diff\",\n"
            + "  \"patch_url\": \"https://github.com/baxterthehacker/public-repo/pull/1.patch\",\n"
            + "  \"issue_url\": \"https://api.github.com/repos/baxterthehacker/public-repo/issues/1\",\n"
            + "  \"number\": 1,\n"
            + "  \"state\": \"open\",\n"
            + "  \"locked\": false,\n"
            + "  \"title\": \"Update the README with new information\",\n"
            + "  \"user\": {\n"
            + "    \"login\": \"baxterthehacker\",\n"
            + "    \"id\": 6752317,\n"
            + "    \"avatar_url\": \"https://avatars.githubusercontent.com/u/6752317?v=3\",\n"
            + "    \"gravatar_id\": \"\",\n"
            + "    \"url\": \"https://api.github.com/users/baxterthehacker\",\n"
            + "    \"html_url\": \"https://github.com/baxterthehacker\",\n"
            + "    \"followers_url\": \"https://api.github.com/users/baxterthehacker/followers\",\n"
            + "    \"following_url\": \"https://api.github.com/users/baxterthehacker/following{/other_user}\",\n"
            + "    \"gists_url\": \"https://api.github.com/users/baxterthehacker/gists{/gist_id}\",\n"
            + "    \"starred_url\": \"https://api.github.com/users/baxterthehacker/starred{/owner}{/repo}\",\n"
            + "    \"subscriptions_url\": \"https://api.github.com/users/baxterthehacker/subscriptions\",\n"
            + "    \"organizations_url\": \"https://api.github.com/users/baxterthehacker/orgs\",\n"
            + "    \"repos_url\": \"https://api.github.com/users/baxterthehacker/repos\",\n"
            + "    \"events_url\": \"https://api.github.com/users/baxterthehacker/events{/privacy}\",\n"
            + "    \"received_events_url\": \"https://api.github.com/users/baxterthehacker/received_events\",\n"
            + "    \"type\": \"User\",\n"
            + "    \"site_admin\": false\n"
            + "  },\n"
            + "  \"body\": \"This is a pretty simple change that we need to pull into master.\",\n"
            + "  \"created_at\": \"2015-05-05T23:40:27Z\",\n"
            + "  \"updated_at\": \"2015-05-05T23:40:27Z\",\n"
            + "  \"closed_at\": null,\n"
            + "  \"merged_at\": null,\n"
            + "  \"merge_commit_sha\": null,\n"
            + "  \"assignee\": null,\n"
            + "  \"milestone\": null,\n"
            + "  \"commits_url\": \"https://api.github.com/repos/baxterthehacker/public-repo/pulls/1/commits\",\n"
            + "  \"review_comments_url\": \"https://api.github.com/repos/baxterthehacker/public-repo/pulls/1/comments\",\n"
            + "  \"review_comment_url\": \"https://api.github.com/repos/baxterthehacker/public-repo/pulls/comments{/number}\",\n"
            + "  \"comments_url\": \"https://api.github.com/repos/baxterthehacker/public-repo/issues/1/comments\",\n"
            + "  \"statuses_url\": \"https://api.github.com/repos/baxterthehacker/public-repo/statuses/0d1a26e67d8f5eaf1f6ba5c57fc3c7d91ac0fd1c\",\n"
            + "  \"head\": {\n"
            + "    \"label\": \"baxterthehacker:changes\",\n"
            + "    \"ref\": \"changes\",\n"
            + "    \"sha\": \"0d1a26e67d8f5eaf1f6ba5c57fc3c7d91ac0fd1c\",\n"
            + "    \"user\": {\n"
            + "      \"login\": \"baxterthehacker\",\n"
            + "      \"id\": 6752317,\n"
            + "      \"avatar_url\": \"https://avatars.githubusercontent.com/u/6752317?v=3\",\n"
            + "      \"gravatar_id\": \"\",\n"
            + "      \"url\": \"https://api.github.com/users/baxterthehacker\",\n"
            + "      \"html_url\": \"https://github.com/baxterthehacker\",\n"
            + "      \"followers_url\": \"https://api.github.com/users/baxterthehacker/followers\",\n"
            + "      \"following_url\": \"https://api.github.com/users/baxterthehacker/following{/other_user}\",\n"
            + "      \"gists_url\": \"https://api.github.com/users/baxterthehacker/gists{/gist_id}\",\n"
            + "      \"starred_url\": \"https://api.github.com/users/baxterthehacker/starred{/owner}{/repo}\",\n"
            + "      \"subscriptions_url\": \"https://api.github.com/users/baxterthehacker/subscriptions\",\n"
            + "      \"organizations_url\": \"https://api.github.com/users/baxterthehacker/orgs\",\n"
            + "      \"repos_url\": \"https://api.github.com/users/baxterthehacker/repos\",\n"
            + "      \"events_url\": \"https://api.github.com/users/baxterthehacker/events{/privacy}\",\n"
            + "      \"received_events_url\": \"https://api.github.com/users/baxterthehacker/received_events\",\n"
            + "      \"type\": \"User\",\n"
            + "      \"site_admin\": false\n"
            + "    },\n"
            + "    \"repo\": {\n"
            + "      \"id\": 35129377,\n"
            + "      \"name\": \"public-repo\",\n"
            + "      \"full_name\": \"baxterthehacker/public-repo\",\n"
            + "      \"owner\": {\n"
            + "        \"login\": \"baxterthehacker\",\n"
            + "        \"id\": 6752317,\n"
            + "        \"avatar_url\": \"https://avatars.githubusercontent.com/u/6752317?v=3\",\n"
            + "        \"gravatar_id\": \"\",\n"
            + "        \"url\": \"https://api.github.com/users/baxterthehacker\",\n"
            + "        \"html_url\": \"https://github.com/baxterthehacker\",\n"
            + "        \"followers_url\": \"https://api.github.com/users/baxterthehacker/followers\",\n"
            + "        \"following_url\": \"https://api.github.com/users/baxterthehacker/following{/other_user}\",\n"
            + "        \"gists_url\": \"https://api.github.com/users/baxterthehacker/gists{/gist_id}\",\n"
            + "        \"starred_url\": \"https://api.github.com/users/baxterthehacker/starred{/owner}{/repo}\",\n"
            + "        \"subscriptions_url\": \"https://api.github.com/users/baxterthehacker/subscriptions\",\n"
            + "        \"organizations_url\": \"https://api.github.com/users/baxterthehacker/orgs\",\n"
            + "        \"repos_url\": \"https://api.github.com/users/baxterthehacker/repos\",\n"
            + "        \"events_url\": \"https://api.github.com/users/baxterthehacker/events{/privacy}\",\n"
            + "        \"received_events_url\": \"https://api.github.com/users/baxterthehacker/received_events\",\n"
            + "        \"type\": \"User\",\n"
            + "        \"site_admin\": false\n"
            + "      },\n"
            + "      \"private\": false,\n"
            + "      \"html_url\": \"https://github.com/baxterthehacker/public-repo\",\n"
            + "      \"description\": \"\",\n"
            + "      \"fork\": false,\n"
            + "      \"url\": \"https://api.github.com/repos/baxterthehacker/public-repo\",\n"
            + "      \"forks_url\": \"https://api.github.com/repos/baxterthehacker/public-repo/forks\",\n"
            + "      \"keys_url\": \"https://api.github.com/repos/baxterthehacker/public-repo/keys{/key_id}\",\n"
            + "      \"collaborators_url\": \"https://api.github.com/repos/baxterthehacker/public-repo/collaborators{/collaborator}\",\n"
            + "      \"teams_url\": \"https://api.github.com/repos/baxterthehacker/public-repo/teams\",\n"
            + "      \"hooks_url\": \"https://api.github.com/repos/baxterthehacker/public-repo/hooks\",\n"
            + "      \"issue_events_url\": \"https://api.github.com/repos/baxterthehacker/public-repo/issues/events{/number}\",\n"
            + "      \"events_url\": \"https://api.github.com/repos/baxterthehacker/public-repo/events\",\n"
            + "      \"assignees_url\": \"https://api.github.com/repos/baxterthehacker/public-repo/assignees{/user}\",\n"
            + "      \"branches_url\": \"https://api.github.com/repos/baxterthehacker/public-repo/branches{/branch}\",\n"
            + "      \"tags_url\": \"https://api.github.com/repos/baxterthehacker/public-repo/tags\",\n"
            + "      \"blobs_url\": \"https://api.github.com/repos/baxterthehacker/public-repo/git/blobs{/sha}\",\n"
            + "      \"git_tags_url\": \"https://api.github.com/repos/baxterthehacker/public-repo/git/tags{/sha}\",\n"
            + "      \"git_refs_url\": \"https://api.github.com/repos/baxterthehacker/public-repo/git/refs{/sha}\",\n"
            + "      \"trees_url\": \"https://api.github.com/repos/baxterthehacker/public-repo/git/trees{/sha}\",\n"
            + "      \"statuses_url\": \"https://api.github.com/repos/baxterthehacker/public-repo/statuses/{sha}\",\n"
            + "      \"languages_url\": \"https://api.github.com/repos/baxterthehacker/public-repo/languages\",\n"
            + "      \"stargazers_url\": \"https://api.github.com/repos/baxterthehacker/public-repo/stargazers\",\n"
            + "      \"contributors_url\": \"https://api.github.com/repos/baxterthehacker/public-repo/contributors\",\n"
            + "      \"subscribers_url\": \"https://api.github.com/repos/baxterthehacker/public-repo/subscribers\",\n"
            + "      \"subscription_url\": \"https://api.github.com/repos/baxterthehacker/public-repo/subscription\",\n"
            + "      \"commits_url\": \"https://api.github.com/repos/baxterthehacker/public-repo/commits{/sha}\",\n"
            + "      \"git_commits_url\": \"https://api.github.com/repos/baxterthehacker/public-repo/git/commits{/sha}\",\n"
            + "      \"comments_url\": \"https://api.github.com/repos/baxterthehacker/public-repo/comments{/number}\",\n"
            + "      \"issue_comment_url\": \"https://api.github.com/repos/baxterthehacker/public-repo/issues/comments{/number}\",\n"
            + "      \"contents_url\": \"https://api.github.com/repos/baxterthehacker/public-repo/contents/{+path}\",\n"
            + "      \"compare_url\": \"https://api.github.com/repos/baxterthehacker/public-repo/compare/{base}...{head}\",\n"
            + "      \"merges_url\": \"https://api.github.com/repos/baxterthehacker/public-repo/merges\",\n"
            + "      \"archive_url\": \"https://api.github.com/repos/baxterthehacker/public-repo/{archive_format}{/ref}\",\n"
            + "      \"downloads_url\": \"https://api.github.com/repos/baxterthehacker/public-repo/downloads\",\n"
            + "      \"issues_url\": \"https://api.github.com/repos/baxterthehacker/public-repo/issues{/number}\",\n"
            + "      \"pulls_url\": \"https://api.github.com/repos/baxterthehacker/public-repo/pulls{/number}\",\n"
            + "      \"milestones_url\": \"https://api.github.com/repos/baxterthehacker/public-repo/milestones{/number}\",\n"
            + "      \"notifications_url\": \"https://api.github.com/repos/baxterthehacker/public-repo/notifications{?since,all,participating}\",\n"
            + "      \"labels_url\": \"https://api.github.com/repos/baxterthehacker/public-repo/labels{/name}\",\n"
            + "      \"releases_url\": \"https://api.github.com/repos/baxterthehacker/public-repo/releases{/id}\",\n"
            + "      \"created_at\": \"2015-05-05T23:40:12Z\",\n"
            + "      \"updated_at\": \"2015-05-05T23:40:12Z\",\n"
            + "      \"pushed_at\": \"2015-05-05T23:40:26Z\",\n"
            + "      \"git_url\": \"git://github.com/baxterthehacker/public-repo.git\",\n"
            + "      \"ssh_url\": \"git@github.com:baxterthehacker/public-repo.git\",\n"
            + "      \"clone_url\": \"https://github.com/baxterthehacker/public-repo.git\",\n"
            + "      \"svn_url\": \"https://github.com/baxterthehacker/public-repo\",\n"
            + "      \"homepage\": null,\n"
            + "      \"size\": 0,\n"
            + "      \"stargazers_count\": 0,\n"
            + "      \"watchers_count\": 0,\n"
            + "      \"language\": null,\n"
            + "      \"has_issues\": true,\n"
            + "      \"has_downloads\": true,\n"
            + "      \"has_wiki\": true,\n"
            + "      \"has_pages\": true,\n"
            + "      \"forks_count\": 0,\n"
            + "      \"mirror_url\": null,\n"
            + "      \"open_issues_count\": 1,\n"
            + "      \"forks\": 0,\n"
            + "      \"open_issues\": 1,\n"
            + "      \"watchers\": 0,\n"
            + "      \"default_branch\": \"master\"\n"
            + "    }\n"
            + "  },\n"
            + "  \"base\": {\n"
            + "    \"label\": \"baxterthehacker:master\",\n"
            + "    \"ref\": \"master\",\n"
            + "    \"sha\": \"9049f1265b7d61be4a8904a9a27120d2064dab3b\",\n"
            + "    \"user\": {\n"
            + "      \"login\": \"baxterthehacker\",\n"
            + "      \"id\": 6752317,\n"
            + "      \"avatar_url\": \"https://avatars.githubusercontent.com/u/6752317?v=3\",\n"
            + "      \"gravatar_id\": \"\",\n"
            + "      \"url\": \"https://api.github.com/users/baxterthehacker\",\n"
            + "      \"html_url\": \"https://github.com/baxterthehacker\",\n"
            + "      \"followers_url\": \"https://api.github.com/users/baxterthehacker/followers\",\n"
            + "      \"following_url\": \"https://api.github.com/users/baxterthehacker/following{/other_user}\",\n"
            + "      \"gists_url\": \"https://api.github.com/users/baxterthehacker/gists{/gist_id}\",\n"
            + "      \"starred_url\": \"https://api.github.com/users/baxterthehacker/starred{/owner}{/repo}\",\n"
            + "      \"subscriptions_url\": \"https://api.github.com/users/baxterthehacker/subscriptions\",\n"
            + "      \"organizations_url\": \"https://api.github.com/users/baxterthehacker/orgs\",\n"
            + "      \"repos_url\": \"https://api.github.com/users/baxterthehacker/repos\",\n"
            + "      \"events_url\": \"https://api.github.com/users/baxterthehacker/events{/privacy}\",\n"
            + "      \"received_events_url\": \"https://api.github.com/users/baxterthehacker/received_events\",\n"
            + "      \"type\": \"User\",\n"
            + "      \"site_admin\": false\n"
            + "    },\n"
            + "    \"repo\": {\n"
            + "      \"id\": 35129377,\n"
            + "      \"name\": \"public-repo\",\n"
            + "      \"full_name\": \"baxterthehacker/public-repo\",\n"
            + "      \"owner\": {\n"
            + "        \"login\": \"baxterthehacker\",\n"
            + "        \"id\": 6752317,\n"
            + "        \"avatar_url\": \"https://avatars.githubusercontent.com/u/6752317?v=3\",\n"
            + "        \"gravatar_id\": \"\",\n"
            + "        \"url\": \"https://api.github.com/users/baxterthehacker\",\n"
            + "        \"html_url\": \"https://github.com/baxterthehacker\",\n"
            + "        \"followers_url\": \"https://api.github.com/users/baxterthehacker/followers\",\n"
            + "        \"following_url\": \"https://api.github.com/users/baxterthehacker/following{/other_user}\",\n"
            + "        \"gists_url\": \"https://api.github.com/users/baxterthehacker/gists{/gist_id}\",\n"
            + "        \"starred_url\": \"https://api.github.com/users/baxterthehacker/starred{/owner}{/repo}\",\n"
            + "        \"subscriptions_url\": \"https://api.github.com/users/baxterthehacker/subscriptions\",\n"
            + "        \"organizations_url\": \"https://api.github.com/users/baxterthehacker/orgs\",\n"
            + "        \"repos_url\": \"https://api.github.com/users/baxterthehacker/repos\",\n"
            + "        \"events_url\": \"https://api.github.com/users/baxterthehacker/events{/privacy}\",\n"
            + "        \"received_events_url\": \"https://api.github.com/users/baxterthehacker/received_events\",\n"
            + "        \"type\": \"User\",\n"
            + "        \"site_admin\": false\n"
            + "      },\n"
            + "      \"private\": false,\n"
            + "      \"html_url\": \"https://github.com/baxterthehacker/public-repo\",\n"
            + "      \"description\": \"\",\n"
            + "      \"fork\": false,\n"
            + "      \"url\": \"https://api.github.com/repos/baxterthehacker/public-repo\",\n"
            + "      \"forks_url\": \"https://api.github.com/repos/baxterthehacker/public-repo/forks\",\n"
            + "      \"keys_url\": \"https://api.github.com/repos/baxterthehacker/public-repo/keys{/key_id}\",\n"
            + "      \"collaborators_url\": \"https://api.github.com/repos/baxterthehacker/public-repo/collaborators{/collaborator}\",\n"
            + "      \"teams_url\": \"https://api.github.com/repos/baxterthehacker/public-repo/teams\",\n"
            + "      \"hooks_url\": \"https://api.github.com/repos/baxterthehacker/public-repo/hooks\",\n"
            + "      \"issue_events_url\": \"https://api.github.com/repos/baxterthehacker/public-repo/issues/events{/number}\",\n"
            + "      \"events_url\": \"https://api.github.com/repos/baxterthehacker/public-repo/events\",\n"
            + "      \"assignees_url\": \"https://api.github.com/repos/baxterthehacker/public-repo/assignees{/user}\",\n"
            + "      \"branches_url\": \"https://api.github.com/repos/baxterthehacker/public-repo/branches{/branch}\",\n"
            + "      \"tags_url\": \"https://api.github.com/repos/baxterthehacker/public-repo/tags\",\n"
            + "      \"blobs_url\": \"https://api.github.com/repos/baxterthehacker/public-repo/git/blobs{/sha}\",\n"
            + "      \"git_tags_url\": \"https://api.github.com/repos/baxterthehacker/public-repo/git/tags{/sha}\",\n"
            + "      \"git_refs_url\": \"https://api.github.com/repos/baxterthehacker/public-repo/git/refs{/sha}\",\n"
            + "      \"trees_url\": \"https://api.github.com/repos/baxterthehacker/public-repo/git/trees{/sha}\",\n"
            + "      \"statuses_url\": \"https://api.github.com/repos/baxterthehacker/public-repo/statuses/{sha}\",\n"
            + "      \"languages_url\": \"https://api.github.com/repos/baxterthehacker/public-repo/languages\",\n"
            + "      \"stargazers_url\": \"https://api.github.com/repos/baxterthehacker/public-repo/stargazers\",\n"
            + "      \"contributors_url\": \"https://api.github.com/repos/baxterthehacker/public-repo/contributors\",\n"
            + "      \"subscribers_url\": \"https://api.github.com/repos/baxterthehacker/public-repo/subscribers\",\n"
            + "      \"subscription_url\": \"https://api.github.com/repos/baxterthehacker/public-repo/subscription\",\n"
            + "      \"commits_url\": \"https://api.github.com/repos/baxterthehacker/public-repo/commits{/sha}\",\n"
            + "      \"git_commits_url\": \"https://api.github.com/repos/baxterthehacker/public-repo/git/commits{/sha}\",\n"
            + "      \"comments_url\": \"https://api.github.com/repos/baxterthehacker/public-repo/comments{/number}\",\n"
            + "      \"issue_comment_url\": \"https://api.github.com/repos/baxterthehacker/public-repo/issues/comments{/number}\",\n"
            + "      \"contents_url\": \"https://api.github.com/repos/baxterthehacker/public-repo/contents/{+path}\",\n"
            + "      \"compare_url\": \"https://api.github.com/repos/baxterthehacker/public-repo/compare/{base}...{head}\",\n"
            + "      \"merges_url\": \"https://api.github.com/repos/baxterthehacker/public-repo/merges\",\n"
            + "      \"archive_url\": \"https://api.github.com/repos/baxterthehacker/public-repo/{archive_format}{/ref}\",\n"
            + "      \"downloads_url\": \"https://api.github.com/repos/baxterthehacker/public-repo/downloads\",\n"
            + "      \"issues_url\": \"https://api.github.com/repos/baxterthehacker/public-repo/issues{/number}\",\n"
            + "      \"pulls_url\": \"https://api.github.com/repos/baxterthehacker/public-repo/pulls{/number}\",\n"
            + "      \"milestones_url\": \"https://api.github.com/repos/baxterthehacker/public-repo/milestones{/number}\",\n"
            + "      \"notifications_url\": \"https://api.github.com/repos/baxterthehacker/public-repo/notifications{?since,all,participating}\",\n"
            + "      \"labels_url\": \"https://api.github.com/repos/baxterthehacker/public-repo/labels{/name}\",\n"
            + "      \"releases_url\": \"https://api.github.com/repos/baxterthehacker/public-repo/releases{/id}\",\n"
            + "      \"created_at\": \"2015-05-05T23:40:12Z\",\n"
            + "      \"updated_at\": \"2015-05-05T23:40:12Z\",\n"
            + "      \"pushed_at\": \"2015-05-05T23:40:26Z\",\n"
            + "      \"git_url\": \"git://github.com/baxterthehacker/public-repo.git\",\n"
            + "      \"ssh_url\": \"git@github.com:baxterthehacker/public-repo.git\",\n"
            + "      \"clone_url\": \"https://github.com/baxterthehacker/public-repo.git\",\n"
            + "      \"svn_url\": \"https://github.com/baxterthehacker/public-repo\",\n"
            + "      \"homepage\": null,\n"
            + "      \"size\": 0,\n"
            + "      \"stargazers_count\": 0,\n"
            + "      \"watchers_count\": 0,\n"
            + "      \"language\": null,\n"
            + "      \"has_issues\": true,\n"
            + "      \"has_downloads\": true,\n"
            + "      \"has_wiki\": true,\n"
            + "      \"has_pages\": true,\n"
            + "      \"forks_count\": 0,\n"
            + "      \"mirror_url\": null,\n"
            + "      \"open_issues_count\": 1,\n"
            + "      \"forks\": 0,\n"
            + "      \"open_issues\": 1,\n"
            + "      \"watchers\": 0,\n"
            + "      \"default_branch\": \"master\"\n"
            + "    }\n"
            + "  },\n"
            + "  \"_links\": {\n"
            + "    \"self\": {\n"
            + "      \"href\": \"https://api.github.com/repos/baxterthehacker/public-repo/pulls/1\"\n"
            + "    },\n"
            + "    \"html\": {\n"
            + "      \"href\": \"https://github.com/baxterthehacker/public-repo/pull/1\"\n"
            + "    },\n"
            + "    \"issue\": {\n"
            + "      \"href\": \"https://api.github.com/repos/baxterthehacker/public-repo/issues/1\"\n"
            + "    },\n"
            + "    \"comments\": {\n"
            + "      \"href\": \"https://api.github.com/repos/baxterthehacker/public-repo/issues/1/comments\"\n"
            + "    },\n"
            + "    \"review_comments\": {\n"
            + "      \"href\": \"https://api.github.com/repos/baxterthehacker/public-repo/pulls/1/comments\"\n"
            + "    },\n"
            + "    \"review_comment\": {\n"
            + "      \"href\": \"https://api.github.com/repos/baxterthehacker/public-repo/pulls/comments{/number}\"\n"
            + "    },\n"
            + "    \"commits\": {\n"
            + "      \"href\": \"https://api.github.com/repos/baxterthehacker/public-repo/pulls/1/commits\"\n"
            + "    },\n"
            + "    \"statuses\": {\n"
            + "      \"href\": \"https://api.github.com/repos/baxterthehacker/public-repo/statuses/0d1a26e67d8f5eaf1f6ba5c57fc3c7d91ac0fd1c\"\n"
            + "    }\n"
            + "  },\n"
            + "  \"merged\": false,\n"
            + "  \"mergeable\": null,\n"
            + "  \"mergeable_state\": \"unknown\",\n"
            + "  \"merged_by\": null,\n"
            + "  \"comments\": 0,\n"
            + "  \"review_comments\": 0,\n"
            + "  \"commits\": 1,\n"
            + "  \"additions\": 1,\n"
            + "  \"deletions\": 1,\n"
            + "  \"changed_files\": 1\n"
            + "}";

    public PullRequestSerializationTest() {
        super(PullRequest.class);
    }

    @Override
    protected String getSample() {
        return SAMPLE_PULL_REQUEST;
    }

    @Override
    protected void checkDeserialized(PullRequest pullRequest) {
        errorCollector.checkThat(pullRequest.getNumber(), is(1));

        errorCollector.checkThat(pullRequest.getLinks(), allOf(
                hasKey("self"),
                hasKey("html"),
                hasKey("comments"),
                hasKey("commits")));
    }
}
