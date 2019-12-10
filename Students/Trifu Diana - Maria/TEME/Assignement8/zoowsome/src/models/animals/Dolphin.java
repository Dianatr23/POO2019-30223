package models.animals;
import javax.xml.stream.XMLStreamException;

import static repositories.AnimalRepository.createNode;

import javax.xml.stream.XMLEventWriter;

import services.factories.Constants;

public class Dolphin extends Aquatic {
	public Dolphin(double a, double b){
		super(a, b);
    	this.nrOfLegs = 0;
    	this.name = "delfin";
    	this.avgSwimDepth = 14;
    	this.waterType= water.Saltywater;
    }
	
	public void encodeToXml(XMLEventWriter eventWriter) throws XMLStreamException {   
		super.encodeToXml(eventWriter);   
		createNode(eventWriter, Constants.XML_TAGS.DISCRIMINANT, Constants.Animals.Aquatic.Dolphin);  
	} 
}
