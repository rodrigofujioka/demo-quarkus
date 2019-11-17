package dev.fujioka.quarkus.demo.service;

import dev.fujioka.quarkus.demo.domain.Product;
import dev.fujioka.quarkus.demo.repository.ProductRepository;

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.inject.Default;
import javax.inject.Inject;
import java.util.List;
import java.util.Optional;

@ApplicationScoped
public class ProductService implements CrudService<Product> {

    @Inject
     ProductRepository productRepository;

    public List<Product> findAll() {
        return null;
    }


    public Optional<Product> save(Product entity) {
        return Optional.ofNullable(productRepository.save(entity));
    }


    public Optional<Product> findById(long id) {
        return Optional.empty();
    }


    public void delete(Product entity) {

    }


    public void deleteById(long id) {

    }


    public long count() {
        return 0;
    }
}
