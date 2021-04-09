package tosinRepo;

public class Courses {
    private String courseName;
    private String courseTitle;
    private int courseCode;

    public String getCourseName() {
        return courseName;
    }

    public String getCourseTitle() {
        return courseTitle;
    }

    public int getCourseCode() {
        return courseCode;
    }

    public Courses()
    {
        this.courseName = "";
        this.courseTitle = "";
        this.courseCode = 0;
    }

    public Courses(String courseName, String courseTitle, int courseCode) {
        this.courseName = courseName;
        this.courseTitle = courseTitle;
        this.courseCode = courseCode;
    }

    @Override
    public String toString() {
        return "Available Courses{" +
                "courseName='" + courseName + '\'' +
                ", courseTitle='" + courseTitle + '\'' +
                ", courseCode=" + courseCode +
                '}';
    }
}
