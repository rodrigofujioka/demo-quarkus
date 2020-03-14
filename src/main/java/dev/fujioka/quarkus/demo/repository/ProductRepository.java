package dev.fujioka.quarkus.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import dev.fujioka.quarkus.demo.domain.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
}
