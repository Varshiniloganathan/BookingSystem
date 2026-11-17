package org.example.model;

enum Gender {
    MALE,
    FEMALE,
    NOT_TO_SPECIFY
}
public class User {
    private String name;
    private int id;
    private String phoneNumber;
    private String email;
    private Gender gender;
    private float rating;

    public User(String name, int id, String phoneNumber, String email, Gender gender, float rating){
        this.name = name;
        this.id = id;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.gender = gender;
        this.rating = rating;
    }

    public String getName(){
        return this.name;
    }

}
