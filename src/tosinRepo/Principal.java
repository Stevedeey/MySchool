package tosinRepo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Principal extends Staff
{
    //getting the list of students from the students object

    //getting the list of students from the students object
    ArrayList <Applicants> applicantsList  = new ArrayList<>();


    //this method helps to get objects from any list of object passed as argument
    public int handlingNumberFormatException(String prompt, Scanner sc1)
    {

        int intInput=0;
        while (true) {
            System.out.println(prompt);
            String  stringInput = sc1.next();

            try {
                intInput = Integer.parseInt(stringInput);
                break;
            } catch (NumberFormatException ne) {
                System.out.println("This is not a number");
            }
        }
        return  intInput;
    }
    static boolean isFound(int id)
    {
        boolean flag = false;
        for (Student staff:studentList)
        {
            if(staff.getId() ==id)
            {
                flag =  true;
            }
        }
        return flag;
    }

    public Principal(int id, String firstName, String lastName, String phoneNumber, String gender, String address, int role, String designation, int salary) {
        super(id, firstName, lastName, phoneNumber, gender, address, role, designation, salary);
    }

    public Principal() {


    }


    public void createStudent(Student student)
    {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter New Id for student\n: ");
        int id = scanner.nextInt();
        System.out.println("Enter Student FirstName\n: ");
        String firstName = scanner.next();
        System.out.println("Enter Student LastName\n: ");
        String lastName = scanner.next();
        System.out.println("Enter Student Age\n: ");
        int age = scanner.nextInt();
        System.out.println("Enter Student Class Name(MUST BE TYPED IN THIS FORMAT(JS1-JS3, SS1-SS3))\n: ");
        String studentClass = scanner.next();
        student = new Student(id,firstName,lastName,age,studentClass);

        studentList.add(student);
    }

    public boolean  expelStudent(int id)
    {
       boolean flag =false;
        for (Student eachStudent:studentList)
        {
            if(eachStudent.getId() == id)
            {
                studentList.remove(eachStudent);
                flag = true;

            }
            System.out.println(eachStudent.getFullname()+" with the ID: "+ id +" Expelled from the school");
        }
        return flag;
    }
    public boolean viewAllStudents()
   {

        int count = 1; boolean flag = false;
        if(!studentList.isEmpty()) {
            for (Student stud : studentList) {
                System.out.println("Number" + count + " " + stud);

                count++;
            }
            flag = true;
        }
        else
        {
            System.out.println("No student found!!!");
            flag = false;
        }
        return  flag;
    }

    public final boolean admitApplicant(Applicants applicants, int score)
    {
       Scanner scanner = new Scanner(System.in);
        boolean flag = false;

        if (score < 15)
        {
            System.out.println("This candidate cannot be admitted, LOW SCORE!!!");
            flag = false;
        }
        else
        {
            String pou = "Enter ID for NEW student\n ";
            int id = Main.handlingNumberFormatException(pou, scanner);
            System.out.println("Enter Student FirstName\n: ");
            String firstName = scanner.next();
            System.out.println("Enter Student LastName\n: ");
            String lastName = scanner.next();
            String prompt = "Enter Student's Entrance Examination score\n: ";

            int entranceExamScore = Main.handlingNumberFormatException(prompt,scanner);
            System.out.println("Enter the last school class by student\n: ");
            String lastSchoolAttended = scanner.next();
            System.out.println("Enter the last passed class by student\n: ");
            String lastClassPassed = scanner.next();
           String pp = "Enter Student ADMISSION NUMBER\n: ";
            int admissionNumber = Main.handlingNumberFormatException(pp,scanner);
            System.out.println("Assign New Class to Student\n: ");
            String newStudentClass = scanner.next();

            applicants = new Applicants(id,firstName,lastName,score,lastSchoolAttended,entranceExamScore,admissionNumber,newStudentClass,lastClassPassed);


            applicantsList.add(applicants);
            flag = true;
        }
        return flag;

    }
    public void viewAllApplicants()
    { int count = 1;
    if (!applicantsList.isEmpty())
    {
        for (Applicants applicant:applicantsList)
        {
            System.out.println("Number"+count+ " " + applicant);
            count++;
        }
    }
    else
    {
        System.out.println("No Applicant found yet!!!");
    }

    }

    public boolean createClass(Classes classObj)
    {

        boolean checkSuccess = false;
        int response=1;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Class Name e.g (JS1 -JS3) (SS1 -SS3) \n: ");
        String className = scanner.nextLine();
        System.out.println("Class Teacher's name\n: ");
        String  classTeacher = scanner.nextLine();
        String ppe = "How many Students are in the class? \n: ";
        int noOfStudent = Main.handlingNumberFormatException(ppe,scanner);
     String ppo= "Enter Class Code\n: ";
        int classCode =Main.handlingNumberFormatException(ppo,scanner);
        classObj = new Classes(className,classTeacher,noOfStudent,classCode);
        classList.add(classObj); //add new class to list

        do
        {
            System.out.println("Enter 1 to Confirm that all entry is valid");
            response = scanner.nextInt();

        }while(response!=1);



        if(response == 1)
        {
            checkSuccess = true;
        }
        else {
            checkSuccess = false;
        }

        return  checkSuccess;
    }
    public void viewAllClasses()
    { int count = 1;
        if(!classList.isEmpty()) {
            for (Classes cl : classList) {
                System.out.println("Number" + count + " " + cl);
                count++;
            }
        }
        else
        {
            System.out.println("No Class(es) found!!");
        }
    }

    public void createCourse(Courses course)
    {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Course Name\n: ");
        String courseName = scanner.nextLine();
        System.out.println("Enter course title\n: ");
        String  courseTitle  = scanner.nextLine();
        String promt = "Enter Course Code? \n: ";
        int courseCode = Main.handlingNumberFormatException(promt,scanner);

       course  = new Courses(courseName,courseTitle,courseCode);
        courseList.add(course); //add new class to list
    }
    public void viewAllCourses()
    { int count = 1;
    if(!courseList.isEmpty()) {
        for (Courses course : courseList) {
            System.out.println("Number" + count + " " + course);
            count++;
        }
    }
    else {
        System.out.println("No Courses found!!!");
    }
    }

    @Override
    public void markAttendance(Staff staff, List<Staff> staffList, int role)
    {
        for (Staff eachStaff:staffList)
        {
            if( eachStaff.getRole() == role)
            {
                System.out.println(eachStaff.getFirstName()  + " at "+ eachStaff.getDesignation() + " marked attendance");
                break;
            }

        }

    }
    @Override
    public void getPaySlip()
    {
        System.out.println("****************************************************");
        System.out.println("MONTHLY SALARY PAYSLIP FOR THE ROLE OF THE PRINCIPAL");
        System.out.println("****************************************************");
        System.out.println("Name -> "+ this.getFirstName());
        System.out.println("Address -> "+ this.getGender());
        System.out.println("Gender -> "+ this.getGender());
        System.out.println("Phone Number -> "+ this.getPhoneNumber());
        System.out.println("Monthly Salary -> "+ this.getSalary());

    }


}
