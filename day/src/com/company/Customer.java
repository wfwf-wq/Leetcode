package com.company;

public class Customer {
    private String name;
    private Integer id;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", id=" + id +
                '}';
    }

    public Customer(String name, Integer id) {
        super();
        this.name = name;
        this.id = id;
    }
    public Customer(){
        super();
    }
}
