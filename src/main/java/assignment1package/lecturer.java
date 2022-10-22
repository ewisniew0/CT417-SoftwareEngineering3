package assignment1package;

import java.time.LocalDate;
import java.util.Arrays;

public class lecturer {
    private String Name;
    private int Age;
    private LocalDate DOB;
    private long ID;
    private String username;
    private module[] modules_teaching;

    public String getUsername() {
        username = Name + Age;

        return username;
    }

    // Constructor

    public lecturer(String name, int age, LocalDate DOB, long ID, module[] modules_teaching) {
        Name = name;
        Age = age;
        this.DOB = DOB;
        this.ID = ID;
        this.modules_teaching = modules_teaching;
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

    public module[] getModules_teaching() {
        return modules_teaching;
    }

    public void setModules_teaching(module[] modules_teaching) {
        this.modules_teaching = modules_teaching;
    }

    @Override
    public String toString() {
        return "lecturer{" +
                "Name='" + Name + '\'' +
                ", Age=" + Age +
                ", DOB=" + DOB +
                ", ID=" + ID +
                ", username='" + username + '\'' +
                ", modules_teaching=" + Arrays.toString(modules_teaching) +
                '}';
    }
}
