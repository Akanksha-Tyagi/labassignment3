package akanksha.labassignment3;

public abstract class Employee
{
	String emp_name;
	int emp_id;

	
	public Employee()
	{
		this.emp_name = "Akanksha";
		this.emp_id = 238;
	}
	
	public String getEmp_name() {
		return emp_name;
	}

	public void setEmp_name(String emp_name) {
		this.emp_name = emp_name;
	}

	public int getEmp_id() {
		return emp_id;
	}

	public void setEmp_id(int emp_id) {
		this.emp_id = emp_id;
	}

	public Employee(String emp_name, int emp_id) {
		this.emp_name = emp_name;
		this.emp_id = emp_id;
	}
	
	abstract public double calculateWeeklySalary();
}


class Salariedemployee extends Employee
{
	private int week;
	private double weekly_salary;
	
	
	public Salariedemployee() {
		this.week = 21;
		this.weekly_salary = 6000.0;
	}
	public Salariedemployee(String emp_name,int emp_id,int week, double weekly_salary) {
		super(emp_name,emp_id);
		this.week = week;
		this.weekly_salary = weekly_salary;
	}
	public int getWeek() {
		return week;
	}
	public void setWeek_days(int week) {
		this.week = week;
	}
	public double getWeekly_salary() {
		return weekly_salary;
	}
	public void setWeekly_salary(double weekly_salary) {
		this.weekly_salary = weekly_salary;
	}
	public double calculateWeeklySalary()
	{
		return (getWeekly_salary());
	}
	
}
class Hourlyemployee  extends Employee
{
	private double no_of_hours;
	private double hourly_rate;
	
	
	public Hourlyemployee() {
		this.no_of_hours = 10.0;
		this.hourly_rate = 100.0;
	}
	public Hourlyemployee(String emp_name,int emp_id,double no_of_hours, double hourly_rate) {
		
		super(emp_name,emp_id);
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
	public void setHourly_rate(double hourly_rate) {
		this.hourly_rate = hourly_rate;
	}
	public double calculateWeeklySalary()
	{
		return (getHourly_rate()*getNo_of_hours());
	}
	
}


class Commissionemployee  extends Employee
{
	private double total_week_sale;
	private double commission_rate;
	
	
	
	public Commissionemployee() {
		this.total_week_sale = 6565.0;
		this.commission_rate = 5.0;
	}

	public Commissionemployee(String emp_name,int emp_id,double total_week_sale, double commission_rate) {
		super(emp_name,emp_id);
		this.total_week_sale = total_week_sale;
		this.commission_rate = commission_rate;
	}

	public double getTotal_week_sale() {
		return total_week_sale;
	}

	public void setTotal_week_sale(double total_week_sale) {
		this.total_week_sale = total_week_sale;
	}

	public double getCommission_rate() {
		return commission_rate;
	}

	public void setCommission_rate(double commission_rate) {
		this.commission_rate = commission_rate;
	}

	public double calculateWeeklySalary()
	{
		
		return ((getTotal_week_sale()*getCommission_rate())/100);
	}
}
