
public class LegalSecretary extends Secretary {

	public LegalSecretary(int years){
		super(years);
	}
	
	public double getSalary(){
		return super.getSalary()+5000.0;
	}
	
	public void filing(){
		System.out.println("I can file legal documents!");
	}
}
