package org.example.departmentapp;

import java.util.ArrayList;
import java.util.List;

public class Department {
    private String name;
    private String teamName;
    private Department teamLeader;
    private List<Department> personnel;
    private List<String> tasks;


    public Department(String name) {
        this.name = name;
    }


    public Department(String teamName, Department teamLeader) {
        this.teamName = teamName;
        this.teamLeader = teamLeader;
        this.personnel = new ArrayList<>();
        this.tasks = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public Department getTeamLeader() {
        return teamLeader;
    }


    public void setTeamLeader(Department teamLeader) {
        this.teamLeader = teamLeader;
    }

    public void printTeamLeader() {
        System.out.println("Team Leader:");
        System.out.println(this.teamLeader);

    }

    public void addPerson(Department person) {
        personnel.add(person);
    }

    public void removePerson(Department person) {
        personnel.remove(person);
    }

    public void updatePerson(Department currentPerson, Department newPerson) {
        int index = personnel.indexOf(currentPerson);
        if (index != -1) {
            personnel.set(index, newPerson);
        }
    }

    public List<Department> getPersonnel() {
        return personnel;
    }

    public void printPersonnel() {
        System.out.println("Personnel List:");
        for (Department person : personnel) {
            System.out.println(person.getName());
        }
    }

    public void addTask(String task) {
        tasks.add(task);
    }

    public void markTaskAsCompleted(String completedTask) {
        int index = tasks.indexOf(completedTask);
        if (index != -1) {
            tasks.set(index, completedTask + " (Completed)");
        }
    }

    public List<String> getTasks() {
        return tasks;
    }

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }
}
