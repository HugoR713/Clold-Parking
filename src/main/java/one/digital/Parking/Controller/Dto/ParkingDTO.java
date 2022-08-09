package one.digital.Parking.Controller.Dto;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;


@Getter
@Setter
public class ParkingDTO {

    private String id;
    private String license;
    private String state;
    private String model;
    private String color;
    private LocalDateTime entryFate;
    private LocalDateTime exitDate;
    private Double bill;

}
