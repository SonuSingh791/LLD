package adapterDesignPattern;

public class Test {

	public static void main(String[] args) {
		EmployeeDetails ds = new EmployeeDetails();
		EmployeeToPLAdapter adapter = new EmployeeToPLAdapter(ds);
		Intranet intra = new Intranet(adapter);
		
		intra.printPhoneNumbers();
		System.out.println("Hellow employee");
	}

}
