package tosinRepo;

import java.util.List;

public class SchoolDepartment {
    private List<Student> students;
    private List<Courses> courses;
    private List<Classes> classes;
    private Principal principal;
    private Teacher teacher;
    private NonTeaching nTeachin;

    public List<Student> getStudents() {
        return students;
    }

    public List<Courses> getCourses() {
        return courses;
    }

    public List<Classes> getClasses() {
        return classes;
    }

    public Principal getPrincipal() {
        return principal;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public NonTeaching getnTeachin() {
        return nTeachin;
    }
    public  SchoolDepartment()
    {

    }
    public SchoolDepartment(List<Student> students, List<Courses> courses, List<Classes> classes) {
        this.students = students;
        this.courses = courses;
        this.classes = classes;
    }
    /**
     * Add students to the department
     */
    public List<Student> addStudent(Student student)
    {
        students.add(student);
        return students;

    }
}

