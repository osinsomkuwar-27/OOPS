class Employee {

    String empName, empId, address, mailId;
    long mobileNo;

    Employee(String empName, String empId, String address, String mailId, long mobileNo) {
        this.empName = empName;
        this.empId = empId;
        this.address = address;
        this.mailId = mailId;
        this.mobileNo = mobileNo;
    }

    void displayDetails() {
        System.out.println("Employee ID: " + empId);
        System.out.println("Employee Name: " + empName);
        System.out.println("Address: " + address);
        System.out.println("Mail ID: " + mailId);
        System.out.println("Mobile No: " + mobileNo);
    }
}

class Programmer extends Employee {

    double basicPay;

    Programmer(String empName, String empId, String address, String mailId,
               long mobileNo, double basicPay) {

        super(empName, empId, address, mailId, mobileNo);
        this.basicPay = basicPay;
    }

    void generatePaySlip() {

        double da = 0.97 * basicPay;
        double hra = 0.10 * basicPay;
        double pf = 0.12 * basicPay;
        double staffClubFund = 0.001 * basicPay;

        double grossSalary = basicPay + da + hra;
        double netSalary = grossSalary - pf - staffClubFund;

        displayDetails();
        System.out.println("Basic Pay: " + basicPay);
        System.out.println("Gross Salary: " + grossSalary);
        System.out.println("Net Salary: " + netSalary);
        System.out.println("----------------------------");
    }
}

class AssistantProfessor extends Programmer {

    AssistantProfessor(String empName, String empId, String address, String mailId,
                       long mobileNo, double basicPay) {

        super(empName, empId, address, mailId, mobileNo, basicPay);
    }
}

class AssociateProfessor extends Programmer {

    AssociateProfessor(String empName, String empId, String address, String mailId,
                       long mobileNo, double basicPay) {

        super(empName, empId, address, mailId, mobileNo, basicPay);
    }
}

class Professor extends Programmer {

    Professor(String empName, String empId, String address, String mailId,
              long mobileNo, double basicPay) {

        super(empName, empId, address, mailId, mobileNo, basicPay);
    }
}

public class exp4 {

    public static void main(String[] args) {

        Programmer prog = new Programmer(
                "John Doe", "P101", "123 Street",
                "john.doe@mail.com", 9876543210L, 50000
        );
        prog.generatePaySlip();

        AssistantProfessor ap = new AssistantProfessor(
                "Jane Smith", "AP102", "456 Lane",
                "jane.smith@mail.com", 9876543221L, 60000
        );
        ap.generatePaySlip();

        AssociateProfessor aap = new AssociateProfessor(
                "Emily White", "AAP103", "789 Blvd",
                "emily.white@mail.com", 9876543232L, 70000
        );
        aap.generatePaySlip();

        Professor prof = new Professor(
                "Michael Brown", "PR104", "101 Hwy",
                "michael.brown@mail.com", 9876543243L, 80000
        );
        prof.generatePaySlip();
    }
}