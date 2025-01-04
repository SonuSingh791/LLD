package adapterDesignPattern;

import java.util.List;

// Intranet class is consumer which need phone numbers and employeeDetails class is provider which provide employee details, format of these two class are different.
// so we just need to write a adapter which converts emp data into phone number.
// Why IPhoneListSource interface ?
// we need phoneNumbers from any type of data it could be employeeDetails, studentDetails etc. so why not just write an interface in which there is function getPhoneNumbers.
// so that we just write an adapter which implements IPhoneListSource and override the GetPhoneNumber() function and return the phoneNumber.

// if any class need name, emailId as well so we just write a function getName(), getEmailId() in interface and accordingly adapter will override these fun.
public interface IPhoneListSource {
	public List<String> GetPhoneNumbers();
}
