package models.employees;
import java.math.BigDecimal;
import services.factories.Constants;
import models.animals.Animal;

public class Caretaker extends Employee implements Caretaker_I{
	private double workingHours;
	
	public Caretaker(String name, BigDecimal salary, boolean dead) {
		super(name, salary, dead);
	}

	public double getWorkingHours() {
		return workingHours;
	}

	public void setWorkingHours(double workingHours) {
		this.workingHours = workingHours;
	}
	
	public void generateID(long[] idList, int n){
		boolean c = false;
		long numb = 0;
		while (c == false) 
		{
	        numb = (long)(Math.random() * 100000000 * 1000000);
	        if (String.valueOf(numb).length() == 13)
	        {
	        	for(int i = 0; i<n; i++) {
	        		if(numb == idList[i])
	        			c = true;
	            }
	        }
		}
		this.setId(numb);
		idList[n] = numb;
		n++;
	}
	
	public String takeCareOf(Animal animal) {
		if(animal.kill())
			return Constants.Employees.Caretakers.TCO_KILLED;
		if(this.workingHours < animal.getMaintainanceCost())
			return Constants.Employees.Caretakers.TCO_NO_TIME;
		else 
		{
			this.workingHours = this.workingHours - animal.getMaintainanceCost();
			animal.setTakenCareOf(true);			
		}
		return Constants.Employees.Caretakers.TCO_SUCCES;
	}

}
