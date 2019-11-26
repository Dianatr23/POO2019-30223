package models.animals;
import javax.xml.stream.XMLStreamException;

import static repositories.AnimalRepository.createNode;

import javax.xml.stream.XMLEventWriter;

import services.factories.Constants;

public class Shark extends Aquatic {
	public Shark(double a, double b){
		super(a, b);
    	this.nrOfLegs = 0;
    	this.name = "rechin";
    	this.waterType = water.Saltywater;
    	this.avgSwimDepth= 40;
    }
	
	public void encodeToXml(XMLEventWriter eventWriter) throws XMLStreamException {   
		super.encodeToXml(eventWriter);   
		createNode(eventWriter, Constants.XML_TAGS.DISCRIMINANT, Constants.Animals.Aquatic.Shark);  
	} 
}
