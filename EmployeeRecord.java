package akanksha.labassignment3;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.*;
public class EmployeeRecord {
	public static void main(String[] args) {
		ArrayList<Employee> employee=new ArrayList<>(); 
		InputStreamReader ir = new InputStreamReader(System. in );
	    BufferedReader sc = new BufferedReader(ir);
		employee.add(new Salariedemployee("Raju",221,4,3000.0));
		employee.add(new Hourlyemployee("Ashi",222,6,300.0));
		employee.add(new Commissionemployee("Ayushi",223,43343.0,5.0));
		employee.add(new Salariedemployee("Rajeev",224,7,4000.0));
		employee.add(new Commissionemployee("Deepshikha",225,93256.0,7.5));
	    boolean exitStatus=false;
		int user_input;
		Employee emp;
		 do {
			
			    System.out.println();
		        System.out.println("Welcome to the Employee record choose the option from the list...");
		        System.out.println("Enter 1-To add an employee record.");
		        System.out.println("2-To get the weekly salary of any employee.");
		        System.out.println("3-To set the rate of any type of employee.");
		        System.out.println("4-To increase salary of any type of employee.");
		        System.out.println("5- Display the salary of the employee.");
		        System.out.println("Enter 0, to exit the system.");
		        System.out.print("Enter your choice: ");
		        try {
		        user_input = Integer.parseInt(sc.readLine());
		        switch (user_input) {
		       
			            case 1: 
			            		String emp_name;
			            		int emp_id;
			            		int emp_type;
			            		System.out.println("Enter name of the employee: ");
		            			emp_name=sc.readLine();
		            			System.out.println("Enter the id of the employee: ");
		            			emp_id=Integer.parseInt(sc.readLine());
		            			
			            		System.out.print("Enter the type of employee from the given option... :  ");
			            		System.out.println("Enter 1-Salaried Employee.");
			     		        System.out.println("2-Hourly Employee.");
			     		        System.out.println("3-Commission Employee.");
			     		        
			            		emp_type=Integer.parseInt(sc.readLine());
			            		if(emp_type==1)
			            		{
			            			int week;
			            			double weekly_salary;
			            			System.out.println("Enter no of weeks employee worked till now if it is new then give 0 as input : ");
			            			week=Integer.parseInt(sc.readLine());
			            			System.out.println("Enter the weekly salary of employee decided by organisation :");
			            			weekly_salary=Double.parseDouble(sc.readLine());
			            			emp=new Salariedemployee(emp_name,emp_id,week,weekly_salary);
			            			employee.add(emp);
			            		}
			            		else if(emp_type==2)
			            		{
			            			double no_of_hours;
			            			double hourly_rate;
			            			System.out.println("Enter no of hours employee worked till now if it is new then give 0 as input : ");
			            			no_of_hours=Double.parseDouble(sc.readLine());
			            			System.out.println("Enter the hourly rate of employee decided by organisation : ");
			            			hourly_rate=Double.parseDouble(sc.readLine());
			            			emp=new Hourlyemployee(emp_name,emp_id,no_of_hours,hourly_rate);
			            			employee.add(emp);
			            		}
			            		else
			            		{
			            			double total_week_sale;
			            			double commission_rate;
			            			System.out.println("Enter Total week sale : ");
			            			total_week_sale=Double.parseDouble(sc.readLine());
			            			System.out.println("Enter the Commission rate of employee decided by organisation : ");
			            			commission_rate=Double.parseDouble(sc.readLine());
			            			emp=new Commissionemployee(emp_name,emp_id,total_week_sale,commission_rate);
			            			employee.add(emp);
			            		}
				        		break;	            
		            case 2:
				            	String name ;
			            		System.out.println("Enter name of the employee whose salary you want to display : ");
		            			name=sc.readLine();
		            			for(int index=0;index<employee.size();index++)
		            			{
		            				if(((employee.get(index)).emp_name).equals(name))
		            				{
		            					(employee.get(index)).calculateWeeklySalary();
		            				}
		            			}
							    break;
		
		            		 
			            case 3:    
			            	    int emptype;
			            		System.out.print("Enter the type of employee from the given option... :  ");
			            		System.out.println("Enter 1-Salaried Employee.");
			     		        System.out.println("2-Hourly Employee.");
			     		        System.out.println("3-Commission Employee.");
			     		        
			            		emp_type=Integer.parseInt(sc.readLine());
			            		if(emp_type==1)
			            		{
			            			Salariedemployee sal_emp=new Salariedemployee(); 
			            			double weekly_salary;
			            			System.out.println("Initially the weekly rate of salaried employee is "+sal_emp.getWeekly_salary());
			            			
			            			System.out.println("Enter the weekly salary of you want to update : ");
			            			weekly_salary=Double.parseDouble(sc.readLine());
			            			sal_emp.setWeekly_salary(weekly_salary);
			            			System.out.println("After updation the weekly rate of salaried employee is "+sal_emp.getWeekly_salary());
			            		}
			            		else if(emp_type==2)
			            		{	Hourlyemployee hour_emp=new Hourlyemployee(); 
			            			
			            			double hourly_rate;
			            			System.out.println("Initially the hourly rate of Hourly employee is "+hour_emp.getHourly_rate());
			            			
			            			System.out.println("Enter the Hourly rate of you want to update : ");
			            			hourly_rate=Double.parseDouble(sc.readLine());
			            			hour_emp.setHourly_rate(hourly_rate);
			            			System.out.println("After updation the hourly rate of Hourly employee is "+hour_emp.getHourly_rate());
			            			
		
			            		}
			            		else
			            		{
			        
			            			double commission_rate;
			            			Commissionemployee com_emp=new Commissionemployee(); 
			            			System.out.println("Initially the  rate of Commission employee is "+com_emp.getCommission_rate());
			            			
			            			System.out.println("Enter the Hourly rate of you want to update : ");
			            			commission_rate=Double.parseDouble(sc.readLine());
			            			com_emp.setCommission_rate(commission_rate);
			            			System.out.println("After updation the commission rate of Commission employee is "+com_emp.getCommission_rate());
			            			
			            		}
			                		break;
		                
		            case 4:   
		            	int Emptype;
	            		System.out.print("Enter the type of employee from the given option... :  ");
	            		System.out.println("Enter 1-Salaried Employee.");
	     		        System.out.println("2-Hourly Employee.");
	     		        System.out.println("3-Commission Employee.");
	     		        
	            		Emptype=Integer.parseInt(sc.readLine());
	            		if(Emptype==1)
	            		{
	            			Salariedemployee sal_emp=new Salariedemployee(); 
	            			double Weekly_salary;
	            			System.out.println("Initially the salary of salaried employee is "+sal_emp. calculateWeeklySalary());
	            			
	            			System.out.println("Enter the weekly salary of you want to update ");
	            			Weekly_salary=Double.parseDouble(sc.readLine());
	            			sal_emp.setWeekly_salary(Weekly_salary);
	            			System.out.println("After updation the weekly rate of salaried employee is "+sal_emp. calculateWeeklySalary());
	            		}
	            		else if(Emptype==2)
	            		{	Hourlyemployee hour_emp=new Hourlyemployee(); 
	            			
	            			double hourly_rate;
	            			System.out.println("Initially the salary of Hourly employee is "+hour_emp. calculateWeeklySalary());
	            			
	            			System.out.println("Enter the Hourly rate of you want to update ");
	            			hourly_rate=Double.parseDouble(sc.readLine());
	            			hour_emp.setHourly_rate(hourly_rate);
	            			System.out.println("After updation the salary of Hourly employee is "+hour_emp. calculateWeeklySalary());
	            			

	            		}
	            		else
	            		{
	        
	            			double commission_rate;
	            			Commissionemployee com_emp=new Commissionemployee(); 
	            			System.out.println("Initially the  salary of Commission employee is "+com_emp. calculateWeeklySalary());
	            			
	            			System.out.println("Enter the Hourly rate of you want to update .");
	            			commission_rate=Double.parseDouble(sc.readLine());
	            			com_emp.setCommission_rate(commission_rate);
	            			System.out.println("After updation the salary of commission employee is "+com_emp. calculateWeeklySalary());
	            			
	            		}
	                	         break;
		            case 5:
					      
			        			for(int index=0;index<employee.size();index++)
			        			{
			        				
			        					System.out.println("Salary of the "+(employee.get(index)).getEmp_name() +"is : "+(employee.get(index)).calculateWeeklySalary());
			        				
			        			}
							    break;
		            				
		          case 0: System.out.println("Thanks for coming.");
		                    exitStatus = true;
		                    break;
		           default: System.out.println("\nInvalid Choice");
		        }
		          
		        }
		        catch(IOException e)
		        {
		        	System.out.println(e);
		        }
		}
		while (!exitStatus);
		 
		}

}
