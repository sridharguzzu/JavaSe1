package com.ntuc.demos.objects.Inheretence;

/**
 *
 * @author Sridhar Guzzu
 */

//Used with arrayclone method demo
public class Employee {

    private Integer id;
    private String firstName;
    private String lastName;
    private Department department;

    public Employee(int id, String fName, String lName, Department department) {
       // super();
        this.id = id;
        this.firstName = fName;
        this.lastName = lName;
        this.department = department;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    @Override
    public String toString() {
        return "Employee [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + "]";
    }
}
