
public class Lawyer extends Employee {

	public Lawyer(int years){
		super(years);
	}
	
	public int getVacationDays(){
		return super.getVacationDays()+1;
	}
	
	public String getForm(){
		return "pink";
	}
	
	public void sue(){
		System.out.println("See you in court!! haha");
	}
}
