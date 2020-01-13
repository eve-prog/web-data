package ro.sda.webdata.persistence.car;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ro.sda.webdata.persistence.car.CarEntity;

@Repository
public interface CarRepository extends JpaRepository<CarEntity, Long> {
}
