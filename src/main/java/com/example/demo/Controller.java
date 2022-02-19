package com.example.demo;

import com.example.demo.model.Car;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class Controller {

    @Autowired
     private CarRepo repo;

    @RequestMapping("/show")
    public String show(){
        return "Welcome";
    }

    @GetMapping("/cars")
    public List<Car> getCars(){
        return repo.findAll();
    }

    @GetMapping("/cars/score")
    public Optional<Car> getCar(@PathVariable("score") int score){
        return repo.findById(score);
    }

    @PostMapping("/car")
    public Car addCar(@RequestBody Car car){
        repo.save(car);
        return car;
    }

    @PutMapping("/car")
    public Car saveOrUpdateCar(@RequestBody Car car){
        repo.save(car);
        return car;
    }

    @DeleteMapping("/cars/{score}")
    public String deleteCar(@PathVariable int score){
        Car car = repo.getById(score);
        repo.delete(car);
        return "deleted";
    }







}
