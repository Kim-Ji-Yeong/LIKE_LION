package com.example.likelion.week4.Day5.babylion;

public class Hospital {
    private String id;
    private  String address;
    private  String district;
    private  String category;
    private Integer emergencyRoom;
    private String name;
    private String subdivision;

    public Hospital(String id, String address, String district, String category, Integer emergencyRoom, String name, String subdivision) {
        this.id = id;
        this.address = address;
        this.category = category;
        this.emergencyRoom = emergencyRoom;
        this.name = name;
        this.subdivision = subdivision;
        this.setDistrict();
    }

    private void setDistrict(){
        String[] splitted = this.address.split(" ");
        this.district=splitted[0] + " " + splitted[1];
    }
}
