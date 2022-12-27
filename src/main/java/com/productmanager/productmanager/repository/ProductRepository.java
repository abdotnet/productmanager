package com.productmanager.productmanager.repository;

import com.productmanager.productmanager.entity.Product;
import org.hibernate.annotations.NamedQuery;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ProductRepository extends JpaRepository<Product,Long> {

    @Query("SELECT p from Product p WHERE p.name LIKE CONCAT('%',:search,'%') OR " +
            "p.description LIKE CONCAT('%',:search,'%') ")
    List<Product> SearchProduct(String search);

    @Query(value = "SELECT * from products p WHERE p.name LIKE CONCAT('%',:search,'%') OR " +
            "p.description LIKE CONCAT('%',:search,'%') ",nativeQuery = true)
    List<Product> SearchProductSQL(String search);
  /*  @NamedQuery( query =  "SELECT * from products p WHERE p.name LIKE CONCAT('%',:search,'%') OR " +
            "p.description LIKE CONCAT('%',:search,'%') ")
    List<Product> SearchProductSQLNative(String search);*/
}
