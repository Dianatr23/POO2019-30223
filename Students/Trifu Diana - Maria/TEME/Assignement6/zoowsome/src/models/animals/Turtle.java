package models.animals;
import javax.xml.stream.XMLStreamException;

import static repositories.AnimalRepository.createNode;

import javax.xml.stream.XMLEventWriter;

import services.factories.Constants;

public class Turtle extends Reptile {
	public Turtle(double a, double b){
		super(a, b);
    	this.nrOfLegs = 4;
    	this.name = "broascaTestoasa";
    	this.laysEggs = true;
    }
	
	public void encodeToXml(XMLEventWriter eventWriter) throws XMLStreamException {   
		super.encodeToXml(eventWriter);   
		createNode(eventWriter, Constants.XML_TAGS.DISCRIMINANT, Constants.Animals.Reptile.Turtle);  
	} 
}
