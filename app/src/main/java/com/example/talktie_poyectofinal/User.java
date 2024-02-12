package com.example.talktie_poyectofinal;

public class User {
    private String name;
    private String id;
    private String email;
    private String password;
    private String country;
    private String city;
    private int postalCode;
    private String address;
    private int phone;
    private int image;
    private String website;

    // Constructor
    public User(String name, String id, String email, String password, String country, String city, int postalCode, String address, int phone, int image, String website) {
        this.name = name;
        this.id = id;
        this.email = email;
        this.password = password;
        this.country = country;
        this.city = city;
        this.postalCode = postalCode;
        this.address = address;
        this.phone = phone;
        this.image = image;
        this.website = website;
    }

    // Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(int postalCode) {
        this.postalCode = postalCode;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }
}


