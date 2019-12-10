package models.animals;
import javax.xml.stream.XMLStreamException;

import static repositories.AnimalRepository.createNode;

import javax.xml.stream.XMLEventWriter;

import services.factories.Constants;

public class Flamingo extends Bird {
	public Flamingo(double a, double b){
		super(a, b);
    	this.nrOfLegs = 2;
    	this.name = "flamingo";
    	this.migrates = false;
    	this.avgFlightAltitude= 2;
    }
	
	public void encodeToXml(XMLEventWriter eventWriter) throws XMLStreamException {   
		super.encodeToXml(eventWriter);   
		createNode(eventWriter, Constants.XML_TAGS.DISCRIMINANT, Constants.Animals.Bird.Flamingo);  
	} 
}
