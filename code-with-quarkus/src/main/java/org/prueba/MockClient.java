package org.prueba;

import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import java.util.List;

@Path("/")
@RegisterRestClient(configKey = "mock-api")
public interface MockClient {

    @GET
    ProductsResponse getProducts();
}

