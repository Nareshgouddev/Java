package inhertance.com;

public class MidEmployee extends BaseEmployee {
    private static final double NET_SALARY = 40000; // Fixed typo: was 400000
    private static final int TAX_PERCENTAGE = 3;
    
    public MidEmployee(String name, int id, String branch) {
        super(name, id, branch);
    }
    
    @Override
    public double calculateSalary() {
        double taxAmount = calculateTax(NET_SALARY, TAX_PERCENTAGE);
        return NET_SALARY - taxAmount;
    }
    
    private double calculateTax(double netSalary, int taxPercentage) {
    	double tax=(3/netSalary)*100;
 		return tax;
 	}

	public double calculateSalaryWithBonus(double bonus) {
        double baseSalary = calculateSalary();
        return baseSalary + bonus;
    }
    
    public double getNetSalary() {
        return NET_SALARY;
    }
}