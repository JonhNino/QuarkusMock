package org.prueba;

import io.quarkus.qute.Template;
import org.eclipse.microprofile.rest.client.inject.RestClient;
import jakarta.inject.Inject;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import java.util.List;

@Path("/products")
public class ProductService {

    @Inject
    @RestClient
    MockClient mockClient;

    @Inject
    Template productTemplate;

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public String getProducts() {
      //  ProductsResponse response = mockClient.getProducts();
        return productTemplate.data("products", mockClient.getProducts().getProducts()).render();
    }
}

