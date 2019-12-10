package models.animals;
import javax.xml.stream.XMLStreamException;

import static repositories.AnimalRepository.createNode;

import javax.xml.stream.XMLEventWriter;

import services.factories.Constants;

public class Tiger extends Mammal {
	 public Tiger(double a, double b){
		 	super(a, b);
	    	this.nrOfLegs = 4;
	    	this.name = "tigru";
	    	this.normalBodyTemperature = 38.5F;
	    	this.percBodyHair= 93.2F;
	    }
	 
	 public void encodeToXml(XMLEventWriter eventWriter) throws XMLStreamException {   
			super.encodeToXml(eventWriter);   
			createNode(eventWriter, Constants.XML_TAGS.DISCRIMINANT, Constants.Animals.Mammal.Tiger);  
		} 
}
