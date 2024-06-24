package org.example.departmentapp;

import java.time.LocalDate;
import java.time.Period;

public class Female extends Personnel {
    private String firstName;
    private String lastName;
    private LocalDate birthDate;

    public Female(String firstName, String lastName, LocalDate birthDate) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDate = birthDate;
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

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    @Override
    public int calculateRetirementAge() {
        return 60;
    }

    @Override
    public int yearsUntilRetirement() {
        int retirementAge = calculateRetirementAge();
        int currentAge = Period.between(getBirthDate(), LocalDate.now()).getYears();
        return retirementAge - currentAge;
    }
}
