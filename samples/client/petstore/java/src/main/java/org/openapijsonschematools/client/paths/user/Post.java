package org.openapijsonschematools.client.paths.user;

import org.checkerframework.checker.nullness.qual.Nullable;
import org.openapijsonschematools.client.RootServerInfo;
import org.openapijsonschematools.client.paths.user.post.RequestBody;
import org.openapijsonschematools.client.paths.user.post.Responses;

public class Post {
    public static class PostCallData {
        public @Nullable RootServerInfo.ServerIndex rootServerInfo;
        public @Nullable RequestBody.SealedRequestBody ;
    }
}
