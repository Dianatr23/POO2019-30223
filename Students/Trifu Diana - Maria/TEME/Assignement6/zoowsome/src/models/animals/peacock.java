package models.animals;

import static repositories.AnimalRepository.createNode;

import javax.xml.stream.XMLEventWriter;

import services.factories.Constants;

import javax.xml.stream.XMLStreamException;

public class peacock extends Bird {
	public peacock(double a, double b){
		super(a, b);
    	this.nrOfLegs = 2;
    	this.name = "paun";
    	this.migrates = false;
    	this.avgFlightAltitude= 0;
    }
	
	public void encodeToXml(XMLEventWriter eventWriter) throws XMLStreamException {   
		super.encodeToXml(eventWriter);   
		createNode(eventWriter, Constants.XML_TAGS.DISCRIMINANT, Constants.Animals.Bird.peacock);  
	} 
}
