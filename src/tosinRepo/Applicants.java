package tosinRepo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * This class inherits and uses some attributes of the students class
 */
public class Applicants extends Student{
   List listOfstudents = Staff.studentList;
   Scanner scanner = new Scanner(System.in);
   private String lastSchoolAttended;
   private int entranceExamScore;
   private int admissionNumber;
   private String newStudentClass;
   private String lastClassPassed;
   public static ArrayList<Applicants> applicantsList = new ArrayList<>();
   public int getAdmissionNumber() {
      return admissionNumber;
   }

   public String getLastSchoolAttended() {
      return lastSchoolAttended;
   }

   public int getEntranceExamScore() {
      return entranceExamScore;
   }

   public void setEntranceExamScore(int entranceExamScore) {
      this.entranceExamScore = entranceExamScore;
   }

   public Applicants()
   {
      super();
      this.admissionNumber = 0;
   }

   public Applicants(int id, String firstName, String lastName, int age, String lastSchoolAttended, int entranceExamScore, int admissionNumber, String  newStudentClass, String lastClassPassed) {
      super(id, firstName, lastName, age);
      this.lastSchoolAttended = lastSchoolAttended;
      this.entranceExamScore = entranceExamScore;
      this.admissionNumber = admissionNumber;
      this.newStudentClass = newStudentClass;
      this.lastClassPassed = lastClassPassed;
   }

   @Override
   public String toString() {
      return "Applicant{" +
              "Name=' " + super.getFullname()+ '\'' +
              " lastSchoolAttended= " + lastSchoolAttended +
              " last Class Passes= " + lastClassPassed+
              "  lastClassPassed= " + entranceExamScore +
              "  entranceExamScore= " + entranceExamScore +
              "  admissionNumber= " + admissionNumber +
              " New Student Class=" + newStudentClass +
              '}';
   }
}
