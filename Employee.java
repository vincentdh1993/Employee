
/*
」 Employees work 40 hours / week
」 Employees make $40,000 per year, except legal secretaries
	who make $5,000 extra per year ($45,000 total), and marketers
	who make $10,000 extra per year ($50,000 total)
」 Employees have 2 weeks of paid vacation leave per year,
	except lawyers who get an extra week (a total of 3)
」 Employees should use a yellow form to apply for leave, except
	for lawyers who use a pink form
	 
we want to give employees more vacation days
the longer they've been with the company
」 For each year worked, we'll award 2 additional vacation days
*/
public class Employee {
	private int years;
	
	public Employee(int years){
		this.years = years;
	}
	
	public int getBonus(){
		return this.years*2;
	}
	
	public double getSalary(){
		return 40000.0;
	}
	public int getHours(){
		return 40;
	}
	public int getVacationDays(){
		return 10+getBonus();
	}
	public String getForm(){
		return "yellow";
	}
}
