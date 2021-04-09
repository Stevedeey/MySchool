package tosinRepo;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public abstract class Staff {

        private int id;
        private  String firstName;
        private  String lastName;
        private String phoneNumber;
        private  String gender;
        private String address;
        private  int role;
        private String designation;
        private int salary;
        //list of class, student and courses available for all staff members (Principal, Teacher) and students
       public static List<Classes> classList = new ArrayList<>();
       public static List<Courses> courseList = new ArrayList<>();

       public static List <Student> studentList  = new ArrayList<>();
    public static List <Teacher> teacherList  = new ArrayList<>();
    public static List <NonTeaching> nonTeachingList  = new ArrayList<>();


        public int getId() {
                return id;
        }



        public String getFirstName() {
                return firstName;
        }


        public String getLastName() {
                return lastName;
        }



        public String getGender() {
                return gender;
        }


        public String getAddress() {
                return address;
        }



        public int getRole() {
                return role;
        }

    public int getSalary() {
        return salary;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getDesignation() {
                return designation;
        }


        public String fullName()
        {
                return lastName+ " " +firstName;
        }
        public  abstract void markAttendance(Staff staff, List<Staff> staffList, int role );
        public  abstract void getPaySlip();

    public Staff() {
    }

    public Staff(int id, String firstName, String lastName, String phoneNumber, String gender, String address, int role, String designation, int salary) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
        this.gender = gender;
        this.address = address;
        this.role = role;
        this.designation = designation;
        this.salary = salary;
    }


    @Override
    public String toString() {
        return "Staff{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", gender='" + gender + '\'' +
                ", address='" + address + '\'' +
                ", role=" + role +
                ", designation='" + designation + '\'' +
                ", salary=" + salary +

                '}';
    }

//    public abstract boolean admitApplicant(Applicants applicants, int age);
}
