package com.example.demo.entity;

/**
 * @Classname Department
 * @Description TODO
 * @Date 2019/8/22 9:26
 * @Created by T.C.M
 */
public class Department {
    private int id;
    private String name;

    public Department() {
        super();
    }

    @Override
    public String toString() {
        return "Department{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
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
}
