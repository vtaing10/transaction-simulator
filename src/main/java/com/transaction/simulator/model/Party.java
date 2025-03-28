package com.transaction.simulator.model;

public class Party {

    private String id;
    private String name;

    // TODO 1: Create a constructor that takes id and name as parameters
    // Example: public Party(String id, String name) { ... }
    public Party(String id, String name){
        this.id=id;
        this.name=name;
    }
    // TODO 2: Add getter methods for both fields
    // Example: public String getId() { return id; }
    public String getID(){
        return id;
    }

    public String getName(){
        return name;
    }
    // TODO 3: Add setter methods for both fields
    // Example: public void setId(String id) { this.id = id; }
    public void setID(String id){
        this.id=id;
    }

    public void setName(String name){
        this.name=name;
    }
    // TODO 4: Override the toString() method
    @Override
    public String toString() {
        return "Party{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                '}';
    }

    // Should return something like: Party{id='U001', name='Victor'}
    
}
