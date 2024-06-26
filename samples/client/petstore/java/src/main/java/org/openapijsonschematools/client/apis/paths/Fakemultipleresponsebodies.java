package org.openapijsonschematools.client.apis.paths;

import org.openapijsonschematools.client.apiclient.ApiClient;
import org.openapijsonschematools.client.configurations.ApiConfiguration;
import org.openapijsonschematools.client.configurations.SchemaConfiguration;
import org.openapijsonschematools.client.paths.fakemultipleresponsebodies.FakemultipleresponsebodiesGet;

public class Fakemultipleresponsebodies extends ApiClient implements
    FakemultipleresponsebodiesGet.GetOperation
{
    public Fakemultipleresponsebodies(ApiConfiguration apiConfiguration, SchemaConfiguration schemaConfiguration) {
        super(apiConfiguration, schemaConfiguration);
    }
}