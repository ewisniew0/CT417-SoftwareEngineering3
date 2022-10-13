package assignment1package;

import java.time.LocalDate;

public class student {
    private String Name;
    private int Age;
    private LocalDate DOB;
    private long ID;
    private String username;
    private String courses;
    private String[] modules;

    // Constructor

    public student(String name, int age, LocalDate DOB, long ID, String courses, String[] modules) {
        Name = name;
        Age = age;
        this.DOB = DOB;
        this.ID = ID;
        this.courses = courses;
        this.modules = modules;
    }

    public String getUsername() {
        username = Name + Age;

        return username;
    }


    // Getter Setter methods


    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int age) {
        Age = age;
    }

    public LocalDate getDOB() {
        return DOB;
    }

    public void setDOB(LocalDate DOB) {
        this.DOB = DOB;
    }

    public long getID() {
        return ID;
    }

    public void setID(long ID) {
        this.ID = ID;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getCourses() {
        return courses;
    }

    public void setCourses(String courses) {
        this.courses = courses;
    }

    public String[] getModules() {
        return modules;
    }

    public void setModules(String[] modules) {
        this.modules = modules;
    }
}
