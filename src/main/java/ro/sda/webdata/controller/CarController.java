package ro.sda.webdata.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.MediaTypeEditor;
import org.springframework.web.bind.annotation.*;
import ro.sda.webdata.persistence.car.CarEntity;
import ro.sda.webdata.service.car.CarService;

import java.util.List;

@RestController
@RequestMapping("car")
public class CarController {
    private final CarService carService;

    @Autowired
    public CarController(CarService carService) {
        this.carService = carService;
    }

    @PostMapping("save")
    @ResponseBody
    public String save(@RequestBody CarSaveBody carSaveBody){
     carService.save(carSaveBody);
     return "OK";
    }

    @GetMapping(value = "all", produces = MediaType.APPLICATION_XML_VALUE)
    public List<CarEntity> all() {
      List<CarEntity> cars = carService.findAll();
      return cars;
    }
}
