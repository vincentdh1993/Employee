
public class Secretary extends Employee {

	public Secretary(int years){
		super(years);
	}
	
//	public int getBonus(){
//		return 0;
//	}
	
	public void takeNotes(String s){
		System.out.println("Note taking: "+s);
	}
}
