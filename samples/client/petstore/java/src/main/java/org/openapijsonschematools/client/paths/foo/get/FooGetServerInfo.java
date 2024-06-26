package org.openapijsonschematools.client.paths.foo.get;

import org.openapijsonschematools.client.paths.foo.get.servers.FooGetServer0;
import org.openapijsonschematools.client.paths.foo.get.servers.FooGetServer1;
import org.openapijsonschematools.client.servers.Server;
import org.openapijsonschematools.client.servers.ServerProvider;
import org.checkerframework.checker.nullness.qual.Nullable;

import java.util.Objects;

public class FooGetServerInfo {
    public static class FooGetServerInfo1 implements ServerProvider<ServerIndex> {
        private final FooGetServer0 server0;
        private final FooGetServer1 server1;

        FooGetServerInfo1(
            @Nullable FooGetServer0 server0,
            @Nullable FooGetServer1 server1
        ) {
            this.server0 = Objects.requireNonNullElseGet(server0, FooGetServer0::new);
            this.server1 = Objects.requireNonNullElseGet(server1, FooGetServer1::new);
        }

        @Override
        public Server getServer(ServerIndex serverIndex) {
            switch (serverIndex) {
                case SERVER_0:
                    return server0;
                default:
                    return server1;
            }
        }
    }

    public static class FooGetServerInfoBuilder {
        private @Nullable FooGetServer0 server0;
        private @Nullable FooGetServer1 server1;

        public FooGetServerInfoBuilder() {}

        public FooGetServerInfoBuilder fooGetServer0(FooGetServer0 server0) {
            this.server0 = server0;
            return this;
        }

        public FooGetServerInfoBuilder fooGetServer1(FooGetServer1 server1) {
            this.server1 = server1;
            return this;
        }

        public FooGetServerInfo1 build() {
            return new FooGetServerInfo1(
                server0,
                server1
            );
        }
    }

    public enum ServerIndex {
        SERVER_0,
        SERVER_1
    }
}