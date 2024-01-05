package pio.io.warzywniaks.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pio.io.warzywniaks.model.entity.AvailableProduct;

@Repository
public interface AvailableProductRepository extends JpaRepository<AvailableProduct,Long> {
}
