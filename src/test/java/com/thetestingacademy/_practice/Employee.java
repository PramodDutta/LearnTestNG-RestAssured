
package com.thetestingacademy._practice;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "firstname",
        "lastname",
        "age",
        "gender",
        "salary",
        "married"
})
public class Employee {

    @JsonProperty("firstname")
    private String firstname;
    @JsonProperty("lastname")
    private String lastname;
    @JsonProperty("age")
    private String age;
    @JsonProperty("gender")
    private String gender;
    @JsonProperty("salary")
    private Integer salary;
    @JsonProperty("married")
    private Boolean married;

    @JsonProperty("firstname")
    public String getFirstname() {
        return firstname;
    }

    @JsonProperty("firstname")
    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    @JsonProperty("lastname")
    public String getLastname() {
        return lastname;
    }

    @JsonProperty("lastname")
    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    @JsonProperty("age")
    public String getAge() {
        return age;
    }

    @JsonProperty("age")
    public void setAge(String age) {
        this.age = age;
    }

    @JsonProperty("gender")
    public String getGender() {
        return gender;
    }

    @JsonProperty("gender")
    public void setGender(String gender) {
        this.gender = gender;
    }

    @JsonProperty("salary")
    public Integer getSalary() {
        return salary;
    }

    @JsonProperty("salary")
    public void setSalary(Integer salary) {
        this.salary = salary;
    }

    @JsonProperty("married")
    public Boolean getMarried() {
        return married;
    }

    @JsonProperty("married")
    public void setMarried(Boolean married) {
        this.married = married;
    }

}