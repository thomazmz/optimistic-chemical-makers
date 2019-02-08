package com.OptimisticChemicalMakers.MapFood.models;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Entity
public class DeliveryBoy {

    // Properties

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    private Long latitude;

    private Long longitude;

    // Constructors

    public DeliveryBoy(Long latitude, Long longitude) {
        this.latitude = latitude;
        this.longitude = longitude;
    }

    // Getters

    public Long getId() {
        return this.id;
    }

    public Long getLatitude() {
        return this.latitude;
    }

    public Long getLongitude() {
        return this.longitude;
    }

    // Setters

    public void setLatitude(Long latitude) {
        this.latitude = latitude;
    }

    public void setLongitude(Long longitude) {
        this.longitude = longitude;
    }

}

