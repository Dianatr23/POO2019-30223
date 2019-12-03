package services.factories;

import java.math.BigDecimal;
import models.employees.Caretaker;
import models.employees.Employee;

public class CaretakerFactory {
	public Employee getEmployee(String type) {
		if(Constants.Employees. Caretakers.Caretaker.equals(type))
		{
			BigDecimal z = new BigDecimal("0");
			return new Caretaker("unknown", z, false);
		}
		else
			return null;
		
	}
}
