package com.example.demo.model;

import jdk.jfr.DataAmount;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Car {

    @Id
    @GeneratedValue
    private int score;
    private String carName;


    @Override
    public String toString() {
        return "Car{" +
                "carName='" + carName + '\'' +
                ", score=" + score +
                '}';
    }
}
