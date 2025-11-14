package Lab_Program.Lab_4;
class CountryNotValidationException extends Exception{
	public CountryNotValidationException(String message) {
		super(message);
	}
}
class EmployeeNameInvalidException extends Exception{
	public EmployeeNameInvalidException(String message) {
		super(message);
	}
}
class TaxNotEligibleException extends Exception{
	public TaxNotEligibleException(String message) {
		super(message);
	}
}
class TaxCalculator1{
	public double claculatorTax(String empName, boolean isIndian, double empSal) 
			throws CountryNotValidationException, EmployeeNameInvalidException, TaxNotEligibleException{
		if(!isIndian) {
			throw new CountryNotValidationException("The Employee should be an Indian citizen for calculating tax");
		}
		if(empName==null || empName.trim().isEmpty()) {
			throw new EmployeeNameInvalidException("The Employee Name cannot be an empty");
		}
		double taxAmount;
		if(empSal>100000) {
			taxAmount =empSal * 8 / 100;
		}
		else if(empSal>50000 && empSal <=100000) {
			taxAmount = empSal * 6 / 100;
		}
		else if(empSal >30000 && empSal <=50000) {
			taxAmount = empSal * 5 / 100;
		}
		else if(empSal >10000 && empSal <=30000) {
			taxAmount = empSal * 4 / 100;
		}
		else {
			throw new TaxNotEligibleException("The Employee does not need to pay tax");
		}
		return taxAmount;
	}
}
public class CalculatorSimulator1 {
	public static void main(String[] args) {
		TaxCalculator1 calculator = new TaxCalculator1();
		//Test case value (change these to test different cases)
		/* 
		//Case 1: The employee name cannot be an empty
		String empName  ="";
		double empSal = 34000;
		boolean isIndian = true;

		//case 2: The Employee should be an Indian citizen for calculating tax
		String empName  ="Ron";
		double empSal = 34000;
		boolean isIndian = true;  // True-> he/she is Indian, False-> he/she is not Indian

		//case 3: The Employee does not need to pay tax
		String empName  ="Ron";
		double empSal = 9000;
		boolean isIndian = true;
		*/
		
		String empName  ="Ron";
		double empSal = 34000;
		boolean isIndian = true;
		
		try {
			double tax = calculator.claculatorTax(empName, isIndian, empSal);
			System.out.println("Tax Amount is: "+ tax);
		}
		catch(CountryNotValidationException e){
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
		catch(EmployeeNameInvalidException e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
		catch(TaxNotEligibleException e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		}	
	}
}









