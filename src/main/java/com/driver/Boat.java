package com.driver;

public class Boat implements WaterVehicle{
    public String name;
    public int capacity;
    Boat(String name, int capacity){
        this.name = name;
        this.capacity = capacity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public String getVehicleName() {
        return getName();
    }

    public int getVehicleCapacity() {
        return getCapacity();
    }

}
