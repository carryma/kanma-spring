package com.springframework.entity;

import java.util.*;

public class People {
    private int id;
    private String name;
    private int age;
    private Dog dog;
    private List<String> hobbies = new ArrayList<>();
    private Set<Integer> numbers = new HashSet<>();
    private Map<String, String> employee = new HashMap<>();

    public People() {
    }

    public People(int id, String name, int age, Dog dog) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.dog = dog;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Dog getDog() {
        return dog;
    }

    public void setDog(Dog dog) {
        this.dog = dog;
    }

    public List<String> getHobbies() {
        return hobbies;
    }

    public void setHobbies(List<String> hobbies) {
        this.hobbies = hobbies;
    }

    public Set<Integer> getNumbers() {
        return numbers;
    }

    public void setNumbers(Set<Integer> numbers) {
        this.numbers = numbers;
    }

    public Map<String, String> getEmployee() {
        return employee;
    }

    public void setEmployee(Map<String, String> employee) {
        this.employee = employee;
    }

    @Override
    public String toString() {
        return "People{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", dog=" + dog.getName() +
                ", hobbies=" + hobbies +
                ", numbers=" + numbers +
                ", employee=" + employee +
                '}';
    }
}
