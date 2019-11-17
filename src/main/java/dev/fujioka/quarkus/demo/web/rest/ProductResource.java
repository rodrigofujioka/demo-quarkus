package dev.fujioka.quarkus.demo.web.rest;

import dev.fujioka.quarkus.demo.domain.Product;
import dev.fujioka.quarkus.demo.service.ProductService;
import org.springframework.beans.factory.annotation.Qualifier;

import javax.inject.Inject;
import javax.ws.rs.*;
import java.util.List;
import java.util.Optional;

@Path("/api")
public class ProductResource {

    private final ProductService productService;

    public ProductResource(ProductService productService) {
        this.productService = productService;
    }

    @POST
    @Path("/product")
    @Produces("application/json")
    public Optional<Product> salvar(Product product){
        return productService.save(product);
    }

    @GET
    @Path("/product/{id}")
    @Produces("application/json")
    public Optional<Product> findProduct(@PathParam("id") Long id){
        return productService.findById(id);
    }

}
