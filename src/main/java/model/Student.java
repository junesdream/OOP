package model;

import java.util.Objects;

public class Student {

    private String name;
    String department;
    int enrollmentNumber;

    //Konstruktor
    public Student(String alice, String s) {

    }

    public Student (String name, String department, int enrollmentNumber){
        this.name = name;
        this.department = department;
        this.enrollmentNumber = enrollmentNumber;
        System.out.println("Konstruktor");
    }


    //getter Methode
    public String getName() {
        return name;
    }

    public String getDepartment() {
        return department;
    }

    public int getEnrollmentNumber() {
        return enrollmentNumber;
    }

    //setter Methode
    public void setName(String newName ) {
        name = newName;
    }
    public void setDepartment(String newDepartment) {
        department = newDepartment;
    }
    public void setEnrollmentNumber(int newEnrollmentNumber) {
        enrollmentNumber = newEnrollmentNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Student student = (Student) o;

        if (enrollmentNumber != student.enrollmentNumber) return false;
        if (!Objects.equals(name, student.name)) return false;
        return Objects.equals(department, student.department);
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (department != null ? department.hashCode() : 0);
        result = 31 * result + enrollmentNumber;
        return result;
    }

    @Override
    public String toString() {
        return "model.Student{" +
                "name='" + name + '\'' +
                ", department='" + department + '\'' +
                ", enrollmentNumber=" + enrollmentNumber +
                '}';
    }
}
