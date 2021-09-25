package question1;

public class TaxCalculator {
  public static double taxableAmount(double monthlySalary)
  { 
	  
	 
	  double annualSalary=12*monthlySalary;
	  double annualtaxableamount=0;
	  if(annualSalary>=1 && annualSalary<=250000)
		  annualtaxableamount=0;
	  else if(annualSalary>250000 && annualSalary<=500000)
		  annualtaxableamount=(annualSalary-250000)*10/100;
	  else if(annualSalary>500000 && annualSalary<=1000000)
		  annualtaxableamount=(250000*10/100)+(annualSalary-500000)*20/100;
	  else
		  annualtaxableamount=(250000*10/100)+(500000*20/100)+(annualSalary-1000000)*30/100;
	  return annualtaxableamount;
	  
	  
  }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    
		System.out.println(TaxCalculator.taxableAmount(25000.0));
		
	}

}
