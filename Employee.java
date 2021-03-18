
import java.util.Calendar;
import java.util.Scanner;

abstract class Employee {

    double salary;
    private int ssn;
    private String fname, lname, address, dob;

    void basicDetails() {
        System.out.println("Enter SSN(Social Security Number):");
        Scanner in = new Scanner(System.in);
        ssn = in.nextInt();
        this.ssn = ssn;
        System.out.println("Enter First Name:");
        String q = in.nextLine();
        fname = in.nextLine();
        this.fname = fname;
        System.out.println("Enter Last Name:");
        lname = in.nextLine();
        this.lname = lname;
        System.out.println("Enter Address:");
        address = in.nextLine();
        this.address = address;
        System.out.println("Enter DOB(Date of Birth):");
        dob = in.nextLine();
        this.dob = dob;
    }

    public abstract double calculateSalary();

    void Display() {
        System.out.print(ssn + "\t" + fname + "\t" + lname + "\t" + address + "\t" + dob);
    }

    public int getssn() {
        return ssn;
    }

    public String first_name() {
        return fname;
    }

    public String last_name() {
        return lname;
    }

    public String getAddress() {
        return address;
    }

    public String getDob() {
        return dob;
    }
}

class Volunteer extends Employee {

    double hours, rph;

    void details() {
        this.basicDetails();
        System.out.println("Enter Number of Hours worked:");
        Scanner in = new Scanner(System.in);
        hours = in.nextDouble();
        this.hours = hours;
        System.out.println("Enter rate per hour:");
        rph = in.nextDouble();
        this.rph = rph;

    }

    public double calculateSalary() {
        salary = hours * rph;
        return salary;
    }

    void printDetails() {
        this.Display();
        System.out.print("\t" + hours + "\t" + rph + "\n");
    }

    public double hoursWorked() {
        return hours;
    }

    public double getRateperhr() {
        return rph;
    }

}

class fulltimeEmployee extends Employee {

    private double bsalary;
    int diffinYears, y, m, d;

    void details() {
        this.basicDetails();
        Scanner in = new Scanner(System.in);
        System.out.println("Enter Starting year(yyyy):");
        y = in.nextInt();
        System.out.println("Enter Starting month(mm):");
        m = in.nextInt();
        System.out.println("Enter Starting date(dd):");
        d = in.nextInt();
        Calendar calendar1 = Calendar.getInstance();
        calendar1.set(y, m, d);
        long miliSecondForDate1 = calendar1.getTimeInMillis();
        long currenttimeMillis = System.currentTimeMillis();
        long diffInMilis = currenttimeMillis - miliSecondForDate1;
        diffinYears = (int) (diffInMilis / (365 * 24 * 60 * 60 * 1000));
        System.out.println("Enter Basic Salary:");
        bsalary = in.nextDouble();
        this.bsalary = bsalary;
    }

    public double calculateSalary() {
        salary = bsalary + (1.05 * diffinYears);
        return salary;
    }

    void printDetails() {
        this.Display();
        System.out.print("\t" + d + "/" + m + "/" + y + "\t" + salary + "\n");
    }

    public double basicSalary() {
        return bsalary;
    }
}
