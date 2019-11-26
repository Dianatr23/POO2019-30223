package models.animals;
import javax.xml.stream.XMLStreamException;

import static repositories.AnimalRepository.createNode;

import javax.xml.stream.XMLEventWriter;

import services.factories.Constants;

public class Monkey extends Mammal {
	public Monkey(double a, double b){
		super(a, b);
    	this.nrOfLegs = 4;
    	this.name = "maimuta";
    	this.normalBodyTemperature = 36.7F;
    	this.percBodyHair= 95.2F;
    }
	
	public void encodeToXml(XMLEventWriter eventWriter) throws XMLStreamException {   
		super.encodeToXml(eventWriter);   
		createNode(eventWriter, Constants.XML_TAGS.DISCRIMINANT, Constants.Animals.Mammal.Monkey);  
	} 
}
