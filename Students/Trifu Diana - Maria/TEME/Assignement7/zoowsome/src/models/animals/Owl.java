package models.animals;
import javax.xml.stream.XMLStreamException;
import static repositories.AnimalRepository.createNode;

import javax.xml.stream.XMLEventWriter;

import services.factories.Constants;

public class Owl extends Bird {
	public Owl(double a, double b){
		super(a, b);
    	this.nrOfLegs = 2;
    	this.name = "bufnita";
    	this.migrates = true;
    	this.avgFlightAltitude= 10;
    }
	
	public void encodeToXml(XMLEventWriter eventWriter) throws XMLStreamException {   
		super.encodeToXml(eventWriter);   
		createNode(eventWriter, Constants.XML_TAGS.DISCRIMINANT, Constants.Animals.Bird.Owl);  
	} 
}
