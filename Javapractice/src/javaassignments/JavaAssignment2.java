package javaassignments;

public class JavaAssignment2 {

    // Private fields
    private String employeeName;
    private int employeeAge;
    private double employeeSalary;

    // Getter and Setter for employeeName
    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String name) {
        this.employeeName = name;
    }

    // Getter and Setter for employeeAge
    public int getEmployeeAge() {
        return employeeAge;
    }

    public void setEmployeeAge(int age) {
        this.employeeAge = age;
    }

    // Getter and Setter for employeeSalary
    public double getEmployeeSalary() {
        return employeeSalary;
    }

    public void setEmployeeSalary(double salary) {
        this.employeeSalary = salary;
    }

    // Main method to test the class
    public static void main(String[] args) {
        JavaAssignment2 emp = new JavaAssignment2();

        // Set values using setters
        emp.setEmployeeName("Sridhar");
        emp.setEmployeeAge(25);
        emp.setEmployeeSalary(45000.50);

        // Print values using getters
        System.out.println("Employee Name: " + emp.getEmployeeName());
        System.out.println("Employee Age: " + emp.getEmployeeAge());
        System.out.println("Employee Salary: ₹" + emp.getEmployeeSalary());
    }
}

