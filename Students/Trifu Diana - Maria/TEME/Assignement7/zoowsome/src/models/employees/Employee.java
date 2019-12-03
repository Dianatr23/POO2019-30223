package models.employees;
import static repositories.AnimalRepository.createNode;

import java.math.BigDecimal;

import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;

import org.w3c.dom.Element;

import models.interfaces.*;

public abstract class Employee implements XML_Parsable{
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
	
	 public void encodeToXml(XMLEventWriter eventWriter) throws XMLStreamException {   
		 createNode(eventWriter, "name", String.valueOf(this.name));   
		 createNode(eventWriter, "id", String.valueOf(this.id));   
		 createNode(eventWriter, "salary", String.valueOf(this.salary));   
		 createNode(eventWriter, "isDead", String.valueOf(this.isDead));     
	} 
	
	 public void decodeFromXml(Element element) { 
		 //setSalary(BigDecimal.valueOf(element.getElementsByTagName("salary").item(0).getTextContent())); 
		 setName(element.getElementsByTagName("name").item(0).getTextContent());   
		 setDead(Boolean.valueOf(element.getElementsByTagName("isDead").item(0).getTextContent())); 
		 setId(Long.valueOf(element.getElementsByTagName("isDead").item(0).getTextContent())); 

	} 
}
