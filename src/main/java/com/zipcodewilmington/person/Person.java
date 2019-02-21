package com.zipcodewilmington.person;

/**
 * Created by leon on 2/12/18.
 */
public class Person {
    private String name;
    private int age;
    private String gender;
    private String bloodDonor;
    private double weight;




    public Person() {
        this.name = "";
        this.age = Integer.MAX_VALUE;
        this.gender = "";
        this.bloodDonor = "";
        this.weight = 0.0;
    }

    public Person(int age) {
        this.age = age; }

    public Person(String name) {
        this.name = name; }

    public Person(String name, int age) {
        this.name = name;
        this.age = age; }

    public Person(String name, int age, String gender, String bloodDonor, double weight) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.bloodDonor = bloodDonor;
        this.weight = weight; }

    public void setName(String name) {
        this.name = name; }

    public void setAge(int age) {
        this.age = age; }

    public void setGender(String gender) {
        this.gender = gender; }

    public void setBloodDonor(String bloodDonor) {
        this.bloodDonor = bloodDonor; }

    public void setWeight(double weight) {
        this.weight = weight; }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    public String getGender() { return gender; }

    public String getBloodDonor() { return bloodDonor; }

    public double getWeight() { return weight; }

}
