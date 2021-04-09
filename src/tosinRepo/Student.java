package tosinRepo;
import java.util.Scanner;
import java.util.*;
  //the class is responsible for keeping track of students
public  class Student {
      //declaration of student attributes (hidden)
     private int id;
      private String firstName;
      private String lastName;
      private int age;
      private String studentClass;

//       ArrayList<Student> studentList = Staff.studentList;

    List<Courses> courses = Staff.courseList;
      List<Classes> classes = Staff.classList;
      List<Student> studentList = Staff.studentList;

      public int getId() {
          return id;
      }

      public String getFirstName() {
          return firstName;
      }

      public String getLastName() {
          return lastName;
      }

      public int getAge() {
          return age;
      }




      public String getStudentClass() {
          return studentClass;
      }

      //default constructor to initialize the student object when created
      public Student() {
          this.firstName = "";
          this.lastName = "";
          this.id =0;
          this.age = 0;


      }

      /**
       *
       * @param lname
       * @param fname
       */
    //Constructor Initialize a student in a different way
      public Student(String lname, String fname) {
          this.firstName = fname;
          this.lastName = lname;
      }



      public Student(int id, String firstName, String lastName, int age, String studentClass) {
          this.id = id;
          this.firstName = firstName;
          this.lastName = lastName;
          this.age = age;
          this.studentClass = studentClass;
      }
      //suitable constructor for the applicant object to use
      public Student(int id, String firstName, String lastName, int age) {
          this.id = id;
          this.firstName = firstName;
          this.lastName = lastName;
          this.age = age;

      }


      public String getFullname()
    {

        return this.lastName+ " " +this.firstName;
    }



//Declared as final so that derived classes wont have access
      public final String takeCourse(int id, int  courseCode) {
         String status="";
          String coursename="";
          for (Courses co:courses) {
              if(co.getCourseCode()==id)
              {
                  coursename =co.getCourseName();
                  continue;

              }

          }
          for (Student stud:studentList){
              if(stud.getId()==id)
              {
                  System.out.println(stud.getFullname()+ "is currently in " + stud.studentClass + "and is currently taking "+ coursename);
                  status = "success";
                  continue;
              }

          }
       return  status;
      }

      @Override
      public String toString() {
          return "Student{" +
                  "id=" + id +
                  ", Full name='" + getFullname() + '\'' +
                  ", Class='" + studentClass+ '\'' +
                  '}';
      }
  }

