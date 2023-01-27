package com.driver;

public class Boat implements WaterVehicle{
    public String name;
    public int capacity;
    Boat(String name, int capacity){
        this.name = name;
        this.capacity = capacity;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }
    @Override
    public String getVehicleName() {
        return this.name;
    }
    @Override
    public int getVehicleCapacity() {
        return this.capacity;
    }

}
