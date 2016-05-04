
public class EmployeeMain {

	public static void main(String[] args) {
		Lawyer Jae = new Lawyer(5);
		LegalSecretary Sean = new LegalSecretary(5);
		Marketer Jin = new Marketer(3);
		Secretary Hyon = new Secretary(3);
		Employee Vincent = new Employee(1);
		
		System.out.println("Jae's salary is "+Jae.getSalary());
		System.out.println("Sean's salary is "+Sean.getSalary());
		System.out.println("Jin's salary is "+Jin.getSalary());
		System.out.println("Hyon's salary is "+Hyon.getSalary());
		System.out.println("Vincent's salary is "+Vincent.getSalary());
		System.out.println();
		
		System.out.println("Jae's vacation days are "+Jae.getVacationDays());
		System.out.println("Sean's vacation days are "+Sean.getVacationDays());
		System.out.println("Jin's vacation days are "+Jin.getVacationDays());
		System.out.println("Hyon's vacation days are "+Hyon.getVacationDays());
		System.out.println("Vincent's vacation days are "+Vincent.getVacationDays());
		System.out.println();
		
		System.out.println("Jae's form is "+Jae.getForm());
		System.out.println("Sean's form is "+Sean.getForm());
		System.out.println("Jin's form is "+Jin.getForm());
		System.out.println("Hyon's form is "+Hyon.getForm());
		System.out.println("Vincent's form is "+Vincent.getForm());
		System.out.println();
		
		Hyon.takeNotes("Hala Madrid");
		Jae.sue();
		Jin.marketing();
	}

}
