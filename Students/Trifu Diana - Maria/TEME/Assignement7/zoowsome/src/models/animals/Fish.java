package models.animals;

import static repositories.AnimalRepository.createNode;
import javax.xml.stream.XMLStreamException;

import javax.xml.stream.XMLEventWriter;

import services.factories.Constants;

public class Fish extends Aquatic {
	public Fish(double a, double b){
		super(a, b);
    	this.nrOfLegs = 0;
    	this.name = "peste";
    	this.waterType = water.Freshwater;
    	this.avgSwimDepth= 11;
    }
	
	public void encodeToXml(XMLEventWriter eventWriter) throws XMLStreamException {   
		super.encodeToXml(eventWriter);   
		createNode(eventWriter, Constants.XML_TAGS.DISCRIMINANT, Constants.Animals.Aquatic.Fish);  
	} 
}
