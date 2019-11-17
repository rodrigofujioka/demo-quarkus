package dev.fujioka.quarkus.demo.web.rest;

import dev.fujioka.quarkus.demo.domain.Product;
import dev.fujioka.quarkus.demo.service.ProductService;

import javax.ws.rs.*;
import javax.ws.rs.core.Response;
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
    @Consumes("application/json")
    public Response salvar(Product product){

        return Response.ok(productService.save(product)).build();
    }

    @GET
    @Path("/product/{id}")
    @Produces("application/json")
    public Response findProduct(@PathParam("id") Long id){
        return Response.ok(productService.findById(id)).build();
    }


    @GET
    @Path("/product")
    @Produces("application/json")
    public List<Product> getProductList() {

        return productService.findAll();
    }


    @POST
    @Path("/product")
    @Produces("application/json")
    @Consumes("application/json")
    public Response save(Product product) {

        product = productService.save(product).get() ;

        return Response.ok().entity(product).build();
    }

    @PUT
    @Path("/product")
    @Produces("application/json")
    @Consumes("application/json")
    public Response update(Product product) {

        product = productService.save(product).get();

        return Response.ok().entity(product).build();
    }

    @DELETE
    @Path("/product")
    @Produces("application/json")
    @Consumes("application/json")
    public Response delete( Product product) {

        productService.delete(product);
        return Response.ok("Product excluded " + product.getId()).build();
    }

}
