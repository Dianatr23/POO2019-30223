package models.animals;
import javax.xml.stream.XMLStreamException;

import static repositories.AnimalRepository.createNode;

import javax.xml.stream.XMLEventWriter;

import services.factories.Constants;

public class Cow extends Mammal {
	public Cow(double a, double b){
		super(a, b);
    	this.nrOfLegs = 4;
    	this.name = "vaca";
    	this.normalBodyTemperature = 40.1F;
    	this.percBodyHair= 96.2F;
	}
	
	public void encodeToXml(XMLEventWriter eventWriter) throws XMLStreamException {   
		super.encodeToXml(eventWriter);   
		createNode(eventWriter, Constants.XML_TAGS.DISCRIMINANT, Constants.Animals.Mammal.Cow);  
	} 
	 
}
