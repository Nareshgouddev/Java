package inhertance.com;

public class Main {
    public static void main(String[] args) {
    	Employee senior = new SeniorEmployee("Naresh goud", 101, "SWE");
        Employee mid = new MidEmployee("Smith", 102, "Marketing");
        Employee junior = new JuniorEmployee("Mithra", 103, "Manager");
        
        System.out.println("=== Employee Details ===");
        System.out.println(senior.getDetails());
        System.out.println("Monthly Salary: $" + senior.calculateSalary());
        
        System.out.println("\n" + mid.getDetails());
        System.out.println("Monthly Salary: $" + mid.calculateSalary());
        
        System.out.println("\n" + junior.getDetails());
        System.out.println("Monthly Salary: $" + junior.calculateSalary());
    }
}

