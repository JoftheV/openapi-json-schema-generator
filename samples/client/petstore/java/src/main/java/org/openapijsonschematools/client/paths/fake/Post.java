package org.openapijsonschematools.client.paths.fake;

import org.checkerframework.checker.nullness.qual.Nullable;
import org.openapijsonschematools.client.paths.fake.post.RequestBody;
import org.openapijsonschematools.client.RootServerInfo;
import org.openapijsonschematools.client.paths.fake.post.FakePostSecurityInfo;
import org.openapijsonschematools.client.paths.fake.post.Responses;

public class Post {
    public static class PostCallData {
        public @Nullable RequestBody.SealedRequestBody ;
        public @Nullable RootServerInfo.ServerIndex rootServerInfo;
        public @Nullable FakePostSecurityInfo.SecurityIndex fakePostSecurityInfo;
    }
}
