package tosinRepo;

import java.util.List;

public class Teacher extends Staff{

    public Teacher(int id, String firstName, String lastName, String phoneNumber, String gender, String address, int role, String designation, int salary) {
        super(id, firstName, lastName, phoneNumber, gender, address, role, designation, salary);
    }

    public void teachCourse()
    {

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
        System.out.println("MONTHLY SALARY PAYSLIP FOR THE ROLE OF THE TEACHER");
        System.out.println("****************************************************");
        System.out.println("Name -> "+ this.getFirstName());
        System.out.println("Address -> "+ this.getGender());
        System.out.println("Gender -> "+ this.getGender());
        System.out.println("Phone Number -> "+ this.getPhoneNumber());
        System.out.println("Monthly Salary -> "+ this.getSalary());

    }
//    public boolean admitApplicant(Applicants app, int age)
//    {
//        re
//    }


}
