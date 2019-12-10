package models.animals;
import java.util.Random;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLEventWriter;
import static repositories.AnimalRepository.createNode; 

import org.w3c.dom.Element;

import models.interfaces.*;


public abstract class Animal implements Killer, XML_Parsable{
	public Integer nrOfLegs;
	public String name;
	final double maintainanceCost;
	final double dangerPerc;
	private boolean takenCareOf = false;
	
	public Animal(double val, double vall) {
		maintainanceCost = val;
		dangerPerc = vall;
	}
	
	public double getMaintainanceCost() {
		return this.maintainanceCost;
	}
	public int getNrOfLegs(Animal a) {
		return this.nrOfLegs;
	}
	public void setNrOfLegs( int nr) {
		this.nrOfLegs = nr;
	}
	public String getName(Animal a) {
		return this.name;
	}
	public void setName( String nume) {
		this.name = nume;
	}
	public boolean kill(){
		Random rand = new Random();
		double i = rand.nextDouble();
		if(this.dangerPerc > i)
			return true;
		else 
			return false;	
	}

	public boolean isTakenCareOf() {
		return takenCareOf;
	}

	public void setTakenCareOf(boolean takenCareOf) {
		this.takenCareOf = takenCareOf;
	}
	
	 
	 public void encodeToXml(XMLEventWriter eventWriter) throws XMLStreamException {   
		 createNode(eventWriter, "nrOfLegs", String.valueOf(this.nrOfLegs));   
		 createNode(eventWriter, "name", String.valueOf(this.name));   
		 createNode(eventWriter, "maintenanceCost", String.valueOf(this.maintainanceCost));   
		 createNode(eventWriter, "dangerPerc", String.valueOf(this.dangerPerc));   
		 createNode(eventWriter, "takenCareOf", String.valueOf(this.takenCareOf));  
	} 
	 
	 public void decodeFromXml(Element element) { 
		 setNrOfLegs(Integer.valueOf(element.getElementsByTagName("nrOfLegs").item(0).getTextContent())); 
		 setName(element.getElementsByTagName("name").item(0).getTextContent());  
		 //setMaintenanceCost(Double.valueOf(element.getElementsByTagName("maintenanceCost").item(0).getTextContent())); 
		 //setdangerPerc(Double.valueOf(element.getElementsByTagName("dangerPerc").item(0).getTextContent()));  
		 setTakenCareOf(Boolean.valueOf(element.getElementsByTagName("takenCareOf").item(0).getTextContent())); 
	} 
	 

}

	