package models.employees;
import java.math.BigDecimal;

public abstract class Employee {
	private String name;
	private long id;
	private BigDecimal salary;
	private boolean isDead;
	
	public abstract void generateID(long[] idList, int n);
	
	public Employee(String name2, BigDecimal salary2, boolean dead) {
		this.name = name2;
		this.salary = salary2;
		this.isDead = dead;
	}

	public BigDecimal getSalary() {
		return salary;
	}
	public void setSalary(BigDecimal salary) {
		this.salary = salary;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public boolean isDead() {
		return isDead;
	}

	public void setDead(boolean isDead) {
		this.isDead = isDead;
	}
}
