
import org.junit.Assert;
import org.junit.Test;
import tosinRepo.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static org.junit.Assert.*;

public class PrincipalTest {


    Courses course = new Courses();
    Classes classes = new Classes();
    Applicants applicant = new Applicants();

    List<Student> studentList = new ArrayList<>();

    Principal officialPrincipal = new Principal(1, "Salako", "Jade", "07030490675", "Male", "Lagos", 1, "Admin", 100000);
    Teacher officialTeacher = new Teacher(2, "Ngozi", "Opuro", "09067464234", "Female", "Abuja", 2, "Academics", 50000);
    NonTeaching nonTeaching = new NonTeaching(3, "Kate", "Jasper", "657757467", "Female", "Kebbi", 3, "Front Desk", 30000);

    //Pre-loaded list

    //pre-created student objects
    Student student1 = new Student(1, "Adebayo", "Oluwaseun", 27, "JS2");
    Student student2 = new Student(2, "Olaleye", "Oluwatosin", 32, "JS3");
    Student student3 = new Student(3, "Adegoke", "Elizabeth", 32, "SS1");


    @Test
    public void testAdmitApplicant() {

        applicant.setEntranceExamScore(16);
        int score = 12;
        boolean testAge = officialPrincipal.admitApplicant(applicant, score);
        Assert.assertFalse(testAge);

    }

    @Test
    public void testViewAllStaff() {
        List<Staff> staffList = Main.staffList;
        Assert.assertNotNull(staffList);
    }

    @Test
    public void testExpellStudent() {
        Principal principal = new Principal();

        boolean wasStudentExpelled = principal.expelStudent(1);
        System.out.println(studentList.toString());
        Assert.assertFalse(wasStudentExpelled);


    }

    @Test
    public void testTakeCourse() {
        int studId = student1.getId();
        int courseId = course.getCourseCode();
        String success = student1.takeCourse(studId, courseId);
        Assert.assertNotEquals(success,"success");
    }
//    Scanner scanner = new Scanner(System.in);
//    String testSting = "g";
//    //@Test
////    public void testinghHandlingExceptionMethod()
////    {
////
////         Assert.fail(officialPrincipal.handlingNumberFormatException(testSting,scanner));
//
//
//    }
}
