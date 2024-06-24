package org.example.departmentapp;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Female femaleEmployee = new Female("Ayşe", "Yılmaz", LocalDate.of(1980, 5, 15));
        Male maleEmployee = new Male("Ahmet", "Demir", LocalDate.of(1997, 10, 25));
        System.out.println("Female Years Until Retirement: " + femaleEmployee.yearsUntilRetirement());
        System.out.println("Male Years Until Retirement: " + maleEmployee.yearsUntilRetirement());
        Department teamLeader = new Department("Mehmet");
        Department department = new Department("Test Team", teamLeader);
        Department newteamLeader = new Department("Ali");
        department.setTeamLeader(newteamLeader);
        System.out.println("Team:" + department.getTeamName());
        department.printTeamLeader();

        Department newPerson = new Department("Hazal");
        Department newPerson2 = new Department("Mehmet");
        Department newPerson3 = new Department("Umut");
        Department newPerson4 = new Department("Ceren");
        department.addPerson(newPerson);
        department.addPerson(newPerson2);
        department.addPerson(newPerson3);
        department.printPersonnel();
        department.updatePerson(newPerson2, newPerson4);
        department.printPersonnel();
        department.removePerson(newPerson);
        department.printPersonnel();

        department.addTask("Test Case Writing");
        department.addTask("Functional Tests");
        department.addTask("Test Results Check");
        System.out.println("Task List:" + department.getTasks());
        department.markTaskAsCompleted("Test Case Writing");
        System.out.println("Last Task List:" + department.getTasks());


    }
}
