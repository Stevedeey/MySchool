package tosinRepo;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {

   public static List<Staff> staffList = new ArrayList<>();
    public static  List<Student> studentList = Staff.studentList;

    static int handlingNumberFormatException(String prompt, Scanner sc1)
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
        for (Staff staff:staffList
             ) {
                if(staff.getId() ==id)
                {
                    flag =  true;
                }
        }
        return flag;
    }







    public static void main(String[] args) {
        //Staff preloaded (Assumption)
        Scanner scanner = new Scanner(System.in);
        Scanner scanner1 = new Scanner(System.in);
        Scanner scanner4 = new Scanner(System.in);
        Scanner scanner2 = new Scanner(System.in);
        Scanner scanner5 = new Scanner(System.in);
        Scanner sc = new Scanner(System.in);

        List<Courses> courses = Staff.courseList;
        List<Classes> classes = Staff.classList;

        List<Teacher> teacherList = Staff.teacherList;
        List<NonTeaching> nonTeachingList = Staff.nonTeachingList;


        char response = ' ';
        String principalTask = "";
        String teacherTask = "";
        String nonTeachingTask = "";
        String studentTask = "";
        System.out.println();

        // List<Student> studentList  = Staff.studentList; //gettinb the list of students.
        Principal officialPrincipal = new Principal(1, "Salako", "Jade", "07030490675", "Male", "Lagos", 1, "Admin", 100000);
        Teacher officialTeacher = new Teacher(2, "Ngozi", "Opuro", "09067464234", "Female", "Abuja", 2, "Academics", 50000);
        NonTeaching nonTeaching = new NonTeaching(3, "Kate", "Jasper", "657757467", "Female", "Kebbi", 3, "Front Desk", 30000);

        //Pre-loaded list
        staffList.add(officialPrincipal);
        staffList.add(officialTeacher);
        staffList.add(nonTeaching);

        //pre-created student objects
        Student student1 = new Student(1, "Adebayo", "Oluwaseun", 27, "JS2");
        Student student2 = new Student(2, "Olaleye", "Oluwatosin", 32, "JS3");
        Student student3 = new Student(3, "Adegoke", "Elizabeth", 32, "SS1");

        //pre-loaded student list
        studentList.add(student1);
        studentList.add(student2);
        studentList.add(student3);

        //pre-created student objects
        Courses course1 = new Courses("English", "ENG", 1);
        Courses course2 = new Courses("English", "ENG", 1);
        Courses course3 = new Courses("English", "ENG", 1);

        //pre-loaded courses list


        courses.add(course1);
        courses.add(course2);
        courses.add(course3);


//pre-created student objects
        Classes cl1 = new Classes("JS1", "Popoola Sunday", 34, 1);
        Classes cl2 = new Classes("JS2", "Akeem Dav", 34, 2);
        Classes cl3 = new Classes("JS3", "John Terry", 54, 3);

        //pre-loaded courses list


        classes.add(cl1);
        classes.add(cl1);
        classes.add(cl1);


        //pre-created teacher objects
        Teacher teacher11 = new Teacher(1, "Popoola", "Sunday", "0707046554", "MALE", "Lagos", 2, "Academics", 99085);
        Teacher teacher2 = new Teacher(2, "Isaac", "Osas", "0707046554", "MALE", "Benin", 2, "Academics", 99000);
        Teacher teacher3 = new Teacher(3, "Popoola", "Sunday", "0707046554", "MALE", "Lagos", 3, "Academics", 99085);
        //pre-loaded teacher list

        teacherList.add(teacher11);
        teacherList.add(teacher2);
        teacherList.add(teacher3);

        //pre-created teacher objects
        NonTeaching nteacher11 = new NonTeaching(1, "Popoola", "Sunday", "0707046554", "MALE", "Lagos", 1, "Academics", 99085);
        NonTeaching nteacher2 = new NonTeaching(2, "Isaac", "Osas", "0707046554", "MALE", "Benin", 2, "Academics", 99000);
        NonTeaching nteacher3 = new NonTeaching(3, "Popoola", "Sunday", "0707046554", "MALE", "Lagos", 3, "Academics", 99085);
        //pre-loaded teacher list

        nonTeachingList.add(nteacher11);
        nonTeachingList.add(nteacher2);
        nonTeachingList.add(nteacher3);

        //Displaying Staff
        System.out.println("##############################################################################################################################");
        System.out.println("LIST OF AVAILABLE STAFF MEMBERS");
        for (Staff staff : staffList) {
            System.out.println(staff.toString());
        }
        System.out.println("##############################################################################################################################");


        System.out.println("##############################################################################################################################");
        System.out.println("LIST OF AVAILABLE  students");
        for (Student stud : studentList) {
            System.out.println(stud.toString());
        }
        System.out.println("##############################################################################################################################");
        //courses
        System.out.println("##############################################################################################################################");
        System.out.println("LIST OF AVAILABLE courses ");
        for (Courses c : courses) {
            System.out.println(c.toString());
        }
        System.out.println("##############################################################################################################################");

        //classes
        System.out.println("##############################################################################################################################");

        System.out.println("LIST OF AVAILABLE  classes");
        for (Classes cl : classes) {
            System.out.println(cl.toString());
        }
        System.out.println("##############################################################################################################################");


        //Creating another staff

        System.out.println("**************************************************************************************");
        System.out.println("NOTICE!! NOTICE!! NOTICE!!!");
        System.out.println("THIS INTERFACE IS SIMPLY DESIGNED TO TEST THE RELATIONSHIP IN BETWEEN DIFFERENT ENTITIES OF THIS MODEL");
        System.out.println("THE PRINCIPAL IS ASSUMED TO BE PALYING THE SUPER ADMIN ROLE");
        System.out.println("TO TEST THIS APP AS A PRINCIPAL CREATE YOURSELF AND ASSIGNED AN ID TO YOURSELF OR AT LEAST TAKE NOTE OF ONE OF THE EXISTING PRINCIPAL FROM THE PRELOADED LIST");
        System.out.println("TO TEST THIS APP AS A STUDENT, A TEACHER OR A NON TEACHING STAFF TAKE NOTE OF THEIR IDS FROM THE STUDENT LIST AND NONTEACHING LIST RESPECTIVELY");
        System.out.println(".....................THANK YOU..........................................................................................................");
        System.out.println("**************************************************************************************");

        System.out.println("CREATE AN ACCOUNT IF YOU ARE NEW!!!....");
        System.out.println("Enter an ID (Must be a number!!!)");


        int staffId = 0;

        while (!scanner.hasNextInt()) {
            System.out.println("YOU MUST ENTER A NUMBER !!! ");
            scanner.nextLine();
        }
        staffId = scanner.nextInt();

        //staffId = handlingNumberFormatException(input,scanner);

        if (isFound(staffId) == true) {
            System.out.println("Sfaff Exist");
        }

        else {



        System.out.println("ENTER FIRST NAME");
        String firstName = scanner.next();
        System.out.println("ENTER LAST NAME");
        String lastName = scanner.next();
        System.out.println("ENTER PHONE NUMBER");
        String phoneNumber = scanner.next();
        System.out.println("GENDER");
        String gender = scanner.next();
        System.out.println("ADDRESS");
        String address = scanner.next();
        System.out.println("DESIGNATION");
        String designation = scanner.next();
        String salaryPrompt = "SALARY";
        int salary = handlingNumberFormatException(salaryPrompt,scanner);
        int role = 0;


        //checking to know the type of staff fo create 1: PRINCIPAL, 2: TEACHER 3: NON TEACHEING STAFF



        do {


            //Catching Exception for non integer entry
            String prompt = "Assign Staff role: (1: PRINCIPAL, 2: TEACHER 3: NON TEACHING STAFF....";
            role = handlingNumberFormatException(prompt,scanner);

            if (role == 1) {
                Principal principal1 = new Principal(staffId, firstName, lastName, phoneNumber, gender, address, role, designation, salary);
                staffList.add(principal1);
                break;

            } else if (role == 2) {
                Teacher teacher1 = new Teacher(staffId, firstName, lastName, phoneNumber, gender, address, role, designation, salary);
                staffList.add(teacher1);
                break;
                //break;
            } else {
                NonTeaching nonTeaching1 = new NonTeaching(staffId, firstName, lastName, phoneNumber, gender, address, role, designation, salary);
                staffList.add(nonTeaching1);
                break;

            }
        } while (role < 3);

        }
        System.out.println("##############################################################################################################################");
        System.out.println("AVAILABLE STAFF LIST UPDATED....");
        //System.out.println();
        for (Staff staff : staffList) {
            System.out.println(staff.toString());
        }
        // System.out.println();
        System.out.println("##############################################################################################################################");


        Student student = new Student();
        Classes cl = new Classes();
        Courses course = new Courses();

        Applicants applicants = new Applicants();

        //STAFF MODULE


        do {
            System.out.println("##############################################################################################################################");

            System.out.println("Welcome to our Department Dashboard");
            System.out.println("GO TO YOUR PERSONAL DASHBOARD AS A:");
            System.out.println("************************");
            System.out.println("1: PRINCIPAL");
            System.out.println("2: TEACHER");
            System.out.println("3: NON TEACHING STAFF");
            System.out.println("4: STUDENT");
            System.out.println("************************");
            System.out.println("##############################################################################################################################");


            String staffRole = scanner1.nextLine();
            switch (staffRole) {
                case "1":


                    while (principalTask != "Q") {
                        System.out.println("Welcome the Principal Dashboard");
                        //  THIS ENSURES A USER ENTERS A NUMBER
                        String prompt = "ENTER PRINCIPAL ID: ";
                        int pId =  handlingNumberFormatException(prompt,scanner);
                        for (Staff s : staffList) {
                            if (isFound(pId)) //Checking to see if the principal exist
                            {
                                //getting the principal information to provide the right argument for the principal constructor
                                int id = s.getId();
                                String fName = s.getFirstName();
                                String lName = s.getLastName();
                                String phoneN = s.getPhoneNumber();
                                String gen = s.getGender();
                                String add = s.getAddress();
                                int rol = s.getRole();
                                String desig = s.getDesignation();
                                int sal = s.getSalary();
                                Principal principal = new Principal(id, fName, lName, phoneN, gen, add, rol, desig, sal);

                                System.out.println("WHAT DO YOU WANT TO DO?... ");
                                System.out.println("************************");
                                System.out.println("A: CREATE STUDENTS");
                                System.out.println("B: CREATE CLASSES");
                                System.out.println("C: CREATE COURSES");
                                System.out.println("D: VIEW ALL STUDENTS");
                                System.out.println("E: VIEW ALL CLASSES");
                                System.out.println("F: VIEW ALL COURSES");
                                System.out.println("G: EXPELL A STUDENT");
                                System.out.println("H: ADMIT A STUDENT");
                                System.out.println("I: VIEW ALL APPLICANTS");
                                System.out.println("J: MARK ATTENDANCE");
                                System.out.println("K: GET PAYSLIP");
                                System.out.println("Q: QUIT");
                                System.out.println("************************");
                                principalTask = scanner1.nextLine();

                                switch (principalTask) {
                                    case "A":


                                        System.out.println("How many students?: ");
                                        int noOfTimes = scanner.nextInt();
                                        int counter = 1;
                                        for (int i = 0; i < noOfTimes; i++) {
                                            System.out.println("Creating Student " + counter + " ...");
                                            counter++;
                                            principal.createStudent(student);
                                        }

                                        break;


                                    case "B":

                                        System.out.println(principal.createClass(cl));
                                        break;
                                    case "C":
                                        principal.createCourse(course);
                                        break;
                                    case "D":
                                        principal.viewAllStudents();
                                        break;
                                    case "E":
                                        principal.viewAllClasses();
                                        break;
                                    case "F":
                                        principal.viewAllCourses();
                                        break;
                                    case "G":
                                        System.out.println("Enter the id of the student to expel..");
                                        int idP = scanner1.nextInt();
                                        principal.expelStudent(idP);
                                        break;
                                    case "H":
                                        String pp = "Enter Applicant's age\n: ";
                                        int age = handlingNumberFormatException(pp, scanner);
                                        System.out.println(principal.admitApplicant(applicants,age));
                                       // principal.admitApplicant(applicants,age);
                                        break;
                                    case "I":
                                        principal.viewAllApplicants();
                                        break;
                                    case "J":
                                        principal.markAttendance(nonTeaching, staffList, 11);
                                        break;
                                    case "K":
                                        principal.getPaySlip();
                                        break;
                                    case "Q":
                                        System.exit(0);
                                        break;
                                    default:
                                        System.out.println("Invalid option! Your choice must be in upper case/Capital letter");
                                        break;
                                }
                            }//if block
                            else {
                                System.out.println("Principal not found");
                                System.exit(0);
                            }
                        } // for block

                    } //while block of case 1
                    break;

                case "2":
                    while (teacherTask != "Q") {

                        System.out.println("Welcome the Teachers' Dashboard");
                        String prompt= "Enter your ID";

                        int pId = handlingNumberFormatException(prompt,scanner);
                        for (Staff s : staffList) {
                            if (s.getId() == pId) //Checking to see if the teacher exist
                            {
                                //getting the principal information
                                int id = s.getId();
                                String fName = s.getFirstName();
                                String lName = s.getLastName();
                                String phoneN = s.getPhoneNumber();
                                String gen = s.getGender();
                                String add = s.getAddress();
                                int rol = s.getRole();
                                String desig = s.getDesignation();
                                int sal = s.getSalary();
                                Teacher teacher = new Teacher(id, fName, lName, phoneN, gen, add, rol, desig, sal);


//                    System.out.println("Welcome to the Your Personal Dashboard");
                                System.out.println("WHAT DO YOU WANT TO DO?... ");
                                System.out.println("************************");
                                System.out.println("A: MARK ATTENDANCE");
                                System.out.println("B: GET PAYSLIP");
                                System.out.println("C: TEACH A COURSE");
                                System.out.println("Q: QUIT");
                                String teacherChoice = scanner2.next();
//                    Teacher teacher = new Teacher();
                                switch (teacherChoice) {
                                    case "A":
                                        teacher.markAttendance(teacher, staffList, rol);
                                        break;
                                    case "B":
                                        teacher.getPaySlip();
                                        break;
                                    case "C":
                                        teacher.teachCourse();
                                        break;
                                    case "Q":
                                        System.exit(0);
                                        break;
                                    default:
                                        System.out.println("Invalid Option!! Use Uppercase!");
                                }
                            }
                        }
                    }
                    break;
                case "3":
                    while (nonTeachingTask != "Q") {
                        System.out.println("Welcome to the Your Personal Dashboard");
                        System.out.println("Welcome the Principal Dashboard");
                        String prompt ="Enter your ID";

                        int pId = handlingNumberFormatException(prompt,scanner);
                        for (Staff s : staffList) {
                            if (s.getId() == pId) //Checking to see if the staff exist
                            {
                                //getting the principal information
                                int id = s.getId();
                                String fName = s.getFirstName();
                                String lName = s.getLastName();
                                String phoneN = s.getPhoneNumber();
                                String gen = s.getGender();
                                String add = s.getAddress();
                                int rol = s.getRole();
                                String desig = s.getDesignation();
                                int sal = s.getSalary();
                                NonTeaching nonTeac = new NonTeaching(id, fName, lName, phoneN, gen, add, rol, desig, sal);

                                System.out.println("WHAT DO YOU WANT TO DO?... ");
                                System.out.println("************************");
                                System.out.println("A: MARK ATTENDANCE");
                                System.out.println("B: GET PAYSLIP");

                                System.out.println("Q: QUIT");
                                String nonTechingChoice = scanner5.nextLine();
                                switch (nonTechingChoice) {
                                    case "A":
                                        nonTeac.markAttendance(nonTeac, staffList, rol);
                                        break;
                                    case "B":
                                        nonTeac.getPaySlip();
                                        break;

                                    case "Q":
                                        System.exit(0);
                                        break;
                                    default:
                                        System.out.println("Invalid Option!! Use Uppercase!");

                                }
                            }
                        }
                    }
                    break;
                case "4":
                    while (studentTask != "Q") {
                        System.out.println("Welcome to the Your Students' Dashboard");


                        String prompt= "Enter your ID";
                        int pId = handlingNumberFormatException(prompt,scanner);
                        for (Student s : studentList) {
                            if (s.getId() == pId) //Checking to see if the staff exist
                            {
                                //getting the principal information
                                int id = s.getId();
                                String fName = s.getFirstName();
                                String lName = s.getLastName();
                                int age = s.getAge();
                                String studClass = s.getStudentClass();

                                Student stud = new Student(id, fName, lName, age, studClass);

                                System.out.println("WHAT DO YOU WANT TO DO?... ");
                                System.out.println("************************");
                                System.out.println("A: Take a course");
                                System.out.println("B: Get Result");
                                System.out.println("Q: Quit");


                                String studResponse = sc.nextLine();
                                switch (studResponse) {
                                    case "A":
                                        System.out.println("Enter your COURSE CODE");
                                        int courseCode = sc.nextInt();
                                        stud.takeCourse(id, courseCode);
                                        break;
                                    case "B":
                                        break;
                                    case "Q":
                                        System.exit(0);
                                        break;
                                    default:
                                        System.out.println("Invalid Input");
                                        break;


                                }
                            }
                        }
                    }
                    break;
                default:
                    System.out.println("Invalid Choice Try 1,2,3,4");
                    break;
            }


            System.out.println("Would you like to start all over? Y|y = Yes, N|n = No");
            response = scanner.next().charAt(0);
        } while (response != 'n' || response != 'n');


    }

}
