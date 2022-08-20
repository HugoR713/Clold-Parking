package one.digital.Parking.Repository;

import one.digital.Parking.Model.Parking;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;



@Repository
public interface ParkingRepository extends JpaRepository<Parking, String> {
}