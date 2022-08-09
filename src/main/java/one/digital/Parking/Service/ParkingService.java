package one.digital.Parking.Service;

import one.digital.Parking.Model.Parking;
import org.springframework.stereotype.Service;

import java.util.*;
import java.util.stream.Collectors;


@Service
public class ParkingService {
    private static Map<String, Parking> parkingMap = new HashMap();

    static {
        var id = getUUID();
        Parking parking = new Parking(id, "Subaru Forester", "Prata", "HGO-0713", "SP" );
        parkingMap.put(id , parking);

    }

    public List<Parking>findAll(){

        return parkingMap.values().stream().collect(Collectors.toList());

    }

    private static String getUUID() {
        return UUID.randomUUID().toString().replace("-", "");

    }


}
