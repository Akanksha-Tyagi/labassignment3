package akanksha.labassignment3;

public abstract class EmployeeDetails implements Payable
{
	double salary;
	
	public abstract void  setSalary(double salary);
	public abstract double getSalary();
	
	
}


class SalariedEmp extends EmployeeDetails
{
	private int week;
	private double weekly_salary;
	
	
	public SalariedEmp() {
		this.week = 21;
		this.weekly_salary = 6000.0;
	}
	public SalariedEmp(int week, double weekly_salary) {
		this.week = week;
		this.weekly_salary = weekly_salary;
	}
	public double getWeekly_salary() {
		return weekly_salary;
	}
	public void setWeekly_salary(double weekly_salary) {
		this.weekly_salary = weekly_salary;
	}
	public void setWeek(int week) {
		this.week = week;
	}
	public int getWeek() {
		return week;
	}
	public void setWeek_days(int week) {
		this.week = week;
	}
	public double getSalary() {
		return getWeekly_salary();
	}
	public void setSalary(double weekly_salary) {
		this.weekly_salary = weekly_salary;
	}
	public double getPayment()
	{
		return (getSalary());
	}
	public String toString() 
    { 
        return "Week: "+ week + " Weekly_salary:  " + weekly_salary+" Payment: " ; 
    } 
}
class HourlyEmp extends EmployeeDetails
{
	private double no_of_hours;
	private double hourly_rate;
	
	
	public HourlyEmp() {
		this.no_of_hours = 10.0;
		this.hourly_rate = 100.0;
	}
	public HourlyEmp(double no_of_hours, double hourly_rate) {
		this.no_of_hours = no_of_hours;
		this.hourly_rate = hourly_rate;
	}
	public double getNo_of_hours() {
		return no_of_hours;
	}
	public void setNo_of_hours(double no_of_hours) {
		this.no_of_hours = no_of_hours;
	}
	public double getHourly_rate() {
		return hourly_rate;
	}
	public double getSalary() {
		return (getHourly_rate()*getNo_of_hours());
	}
	
	public void setSalary(double hourly_rate) {
		this.hourly_rate = hourly_rate;
	}
	public double getPayment()
	{
		return (getSalary());
	}
	public String toString() 
    { 
        return "No Of Hours: "+no_of_hours + " Hourly Rate: " + hourly_rate+" Payment"; 
    } 
}


class CommissionEmp  extends EmployeeDetails
{
	private double total_week_sale;
	private double commission_rate;
	
	
	
	public CommissionEmp() {
		this.total_week_sale = 6565.0;
		this.commission_rate = 5.0;
	}

	public CommissionEmp(double total_week_sale, double commission_rate) {
		this.total_week_sale = total_week_sale;
		this.commission_rate = commission_rate;
	}

	public double getTotal_week_sale() {
		return total_week_sale;
	}

	public double getCommission_rate() {
		return commission_rate;
	}

	public void setTotal_week_sale(double total_week_sale) {
		this.total_week_sale = total_week_sale;
	}

	public double getSalary() {
		return ((getTotal_week_sale()*getCommission_rate())/100);
	}
	public void setSalary(double commission_rate) {
		this.commission_rate = commission_rate;
	}
	public double getPayment()
	{
		return (getSalary());
	}
	public String toString() 
    { 
        return "Commission Rate" + commission_rate + " Total Week Sale: " + total_week_sale+" Payment"; 
    } 
}
