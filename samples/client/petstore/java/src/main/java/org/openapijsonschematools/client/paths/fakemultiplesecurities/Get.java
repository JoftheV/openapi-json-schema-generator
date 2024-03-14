package org.openapijsonschematools.client.paths.fakemultiplesecurities;

import org.checkerframework.checker.nullness.qual.Nullable;
import org.openapijsonschematools.client.RootServerInfo;
import org.openapijsonschematools.client.paths.fakemultiplesecurities.get.FakemultiplesecuritiesGetSecurityInfo;
import org.openapijsonschematools.client.paths.fakemultiplesecurities.get.Responses;

public class Get {
    public static class GetCallData {
        public @Nullable RootServerInfo.ServerIndex rootServerInfo;
        public @Nullable FakemultiplesecuritiesGetSecurityInfo.SecurityIndex fakemultiplesecuritiesGetSecurityInfo;
    }
}
