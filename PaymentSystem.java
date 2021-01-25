package akanksha.labassignment3;

public class PaymentSystem {
public static void main(String[] args) {
	Payable payable;
	System.out.println("Invoking getPayment() of Invoice Class : ");
	payable=new Invoice("12345","equipments",20,799.0); 
	System.out.println("Result is : "+payable.toString()+" "+ payable.getPayment());
	
	System.out.println("Invoking getPayment() of Salaried Employee Class : ");
	payable=new SalariedEmp(7,7000.0); 
	System.out.println("Result is : "+payable.toString()+" "+ payable.getPayment());
	
	System.out.println("Invoking getPayment() of Hourly Employee Class : ");
	payable=new HourlyEmp(12,500.0); 
	System.out.println("Result is : "+payable.toString()+" "+ payable.getPayment());
	
	System.out.println("Invoking getPayment() of Commission Employee Class : ");
	payable=new CommissionEmp(1000.0,20); 
	System.out.println("Result is : "+payable.toString()+" "+ payable.getPayment());
}
}
