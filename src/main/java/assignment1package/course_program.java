package assignment1package;

import org.joda.time.DateTime;

import java.util.Arrays;

public class course_program {
    private String course_name;
    private module[] module_list;
    private student[] enrolled_students;
    private DateTime academic_start_date;
    private DateTime academic_end_date;

    // Constructor

    public course_program(String course_name, DateTime academic_start_date, DateTime academic_end_date) {
        this.course_name = course_name;
        this.academic_start_date = academic_start_date;
        this.academic_end_date = academic_end_date;
    }

    // Getter Setter methods

    public String getCourse_name() {
        return course_name;
    }

    public void setCourse_name(String course_name) {
        this.course_name = course_name;
    }

    public module[] getModule_list() {
        return module_list;
    }

    public void setModule_list(module[] module_list) {
        this.module_list = module_list;
    }

    public student[] getEnrolled_students() {
        return enrolled_students;
    }

    public void setEnrolled_students(student[] enrolled_students) {
        this.enrolled_students = enrolled_students;
    }

    public DateTime getAcademic_start_date() {
        return academic_start_date;
    }

    public void setAcademic_start_date(DateTime academic_start_date) {
        this.academic_start_date = academic_start_date;
    }

    public DateTime getAcademic_end_date() {
        return academic_end_date;
    }

    public void setAcademic_end_date(DateTime academic_end_date) {
        this.academic_end_date = academic_end_date;
    }

    @Override
    public String toString() {
        return "course_program{" +
                "course_name='" + course_name + '\'' +
                ", module_list=" + Arrays.toString(module_list) +
                ", enrolled_students=" + Arrays.toString(enrolled_students) +
                ", academic_start_date=" + academic_start_date +
                ", academic_end_date=" + academic_end_date +
                '}';
    }
}
