
public class Marketer extends Employee {
	public Marketer(int years){
		super(years);
	}
	
	public double getSalary(){
		return super.getSalary()+10000.0;
	}
	
	public void marketing(){
		System.out.println("I can market allday");
	}
}
