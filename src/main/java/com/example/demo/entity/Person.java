package com.example.demo.entity;

import java.sql.Date;

/**
 * @Classname Person
 * @Description TODO
 * @Date 2019/8/22 9:19
 * @Created by T.C.M
 */
public class Person {
    private int id;
    private String name;
    private int gender;
    private int age;
    private int rank;
    private int did;
    private Date birthday;
    private Department de;

    public Department getDe() {
        return de;
    }

    public void setDe(Department de) {
        this.de = de;
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

    public int getGender() {
        return gender;
    }

    public void setGender(int gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getRank() {
        return rank;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }

    public int getDid() {
        return did;
    }

    public void setDid(int did) {
        this.did = did;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public Person() {
        super();
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", rank=" + rank +
                ", did=" + did +
                ", birthday=" + birthday +
                ", de=" + de +
                '}';
    }
}
