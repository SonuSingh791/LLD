package adapterDesignPattern;

import java.util.List;

// Data Consumer
// already created class.
// if class is already created we can't modify it, it open for extension but closed for modification. (O principle from SOLID)
public class Intranet {
	IPhoneListSource source;
	
	// IPhoneListSource source = adapter (p & c case), adapter is ref of EmployeeToAdapter class in which GetPhoneNumbers overridden.
	// If we need phoneNumber of student from student details, we just write adapter for studentDetails which will implements IPhoneListSource and override GetPhoneNumbers.
	// and pass the reference of studentDetails class in Intranet().
	public Intranet(IPhoneListSource source) {
		this.source = source;
	}
	
	public void printPhoneNumbers() {
		List<String> phones = this.source.GetPhoneNumbers();
		System.out.println(phones);
	}
}
