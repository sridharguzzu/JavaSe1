package com.ntuc.demos.objects.Inheretence;

/**
 *
 * @author Sridhar Guzzu
 */
//Used with array clone method demo
public class Department {

    Integer id;
    String name;

    public Department(Integer id, String name) {
        super();  // object
        this.id = id;
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Department [id=" + id + ", name=" + name + "]";
    }
}
