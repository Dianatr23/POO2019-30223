package models.animals;
import javax.xml.stream.XMLEventWriter;

import static repositories.AnimalRepository.createNode;

import javax.xml.stream.XMLStreamException;

public abstract class Mammal extends Animal {
	public float normalBodyTemperature;
	public float percBodyHair;
	
	public Mammal(double a, double b) {
		super(a, b);
	}
	
	public void encodeToXml(XMLEventWriter eventWriter) throws XMLStreamException {  
		super.encodeToXml(eventWriter);   
		createNode(eventWriter, "normalBodyTemperature", String.valueOf(normalBodyTemperature));   
		createNode(eventWriter, "percBodyHair", String.valueOf(percBodyHair));  
	} 
}
