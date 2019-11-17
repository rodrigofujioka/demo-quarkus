package dev.fujioka.quarkus.demo.repository;

import dev.fujioka.quarkus.demo.domain.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import javax.enterprise.context.ApplicationScoped;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
}
