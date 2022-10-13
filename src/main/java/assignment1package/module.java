package assignment1package;

import java.time.LocalDate;

public class module {

    private String module_name;
    private long id;
    private student[] enrolled_students;
    private LocalDate start_date;
    private LocalDate end_date;
    private String[] associated_courses;
    private lecturer lecturer_responsible;

    // Constructor

    public module(String module_name, long id, student[] enrolled_students, LocalDate start_date, LocalDate end_date, String[] associated_courses, lecturer lecturer_responsible) {
        this.module_name = module_name;
        this.id = id;
        this.enrolled_students = enrolled_students;
        this.start_date = start_date;
        this.end_date = end_date;
        this.associated_courses = associated_courses;
        this.lecturer_responsible = lecturer_responsible;
    }


    // Getter Setter methods

    public String getModule_name() {
        return module_name;
    }

    public void setModule_name(String module_name) {
        this.module_name = module_name;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public student[] getEnrolled_students() {
        return enrolled_students;
    }

    public void setEnrolled_students(student[] enrolled_students) {
        this.enrolled_students = enrolled_students;
    }

    public LocalDate getStart_date() {
        return start_date;
    }

    public void setStart_date(LocalDate start_date) {
        this.start_date = start_date;
    }

    public LocalDate getEnd_date() {
        return end_date;
    }

    public void setEnd_date(LocalDate end_date) {
        this.end_date = end_date;
    }

    public String[] getAssociated_courses() {
        return associated_courses;
    }

    public void setAssociated_courses(String[] associated_courses) {
        this.associated_courses = associated_courses;
    }

    public lecturer getLecturer_responsible() {
        return lecturer_responsible;
    }

    public void setLecturer_responsible(lecturer lecturer_responsible) {
        this.lecturer_responsible = lecturer_responsible;
    }
}
