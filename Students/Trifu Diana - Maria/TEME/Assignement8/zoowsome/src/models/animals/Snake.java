package models.animals;
import javax.xml.stream.XMLStreamException;

import static repositories.AnimalRepository.createNode;

import javax.xml.stream.XMLEventWriter;

import services.factories.Constants;

public class Snake extends Reptile {
	public Snake(double a, double b){
		super(a, b);
    	this.nrOfLegs = 0;
    	this.name = "sarpe";
    	this.laysEggs = true;
    }
	
	public void encodeToXml(XMLEventWriter eventWriter) throws XMLStreamException {   
		super.encodeToXml(eventWriter);   
		createNode(eventWriter, Constants.XML_TAGS.DISCRIMINANT, Constants.Animals.Reptile.Snake);  
	} 
}
