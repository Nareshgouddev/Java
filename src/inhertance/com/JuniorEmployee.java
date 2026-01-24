package inhertance.com;

public class JuniorEmployee extends BaseEmployee {
    private static final double NET_SALARY = 25000;
    private static final int TAX_PERCENTAGE = 3;
    
    public JuniorEmployee(String name, int id, String branch) {
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
    
    public double getNetSalary() {
        return NET_SALARY;
    }
}