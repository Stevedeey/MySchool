package tosinRepo;

import java.util.ArrayList;
import java.util.Scanner;

public class Classes {
    private  String className;
    private String classTeacher;
    private int noOfStudent;
    private int classCode;
    public ArrayList<Classes> classList = new ArrayList<>();
    public String getClassName() {
        return className;
    }

    public String getClassTeacher() {
        return classTeacher;
    }

    public int getNoOfStudent() {
        return noOfStudent;
    }

    public int getClassCode() {
        return classCode;
    }

    /**
     * This is needed so that a teacher can update student info in case of student promotion
     * @param className
     */
    public void setClassName(String className) {
        this.className = className;
    }

    /**
     * This is needed so that a teacher can update student info in case of student promotion
     * @param classCode
     */
    public void setClassCode(int classCode) {
        this.classCode = classCode;
    }

    public Classes() {
        this.className = "Unknown";
        this.classCode = 0;
        this.classTeacher = "Unknown";
        this.noOfStudent = 0;
    }

    public Classes(String className, String classTeacher, int noOfStudent, int classCode) {
        this.className = className;
        this.classTeacher = classTeacher;
        this.noOfStudent = noOfStudent;
        this.classCode = classCode;
    }




}
