package assignment1package;

import java.time.LocalDate;

public class student {
    private String Name;
    private int Age;
    private LocalDate DOB;
    private long ID;
    private String username;
    private course_program courses;
    private module[] modules;

    // Constructor

    public student(String name, int age, LocalDate DOB, long ID, course_program courses, module[] modules) {
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

    public course_program getCourses() {
        return courses;
    }

    public void setCourses(course_program courses) {
        this.courses = courses;
    }

    public module[] getModules() {
        return modules;
    }

    public void setModules(module[] modules) {
        this.modules = modules;
    }
}
