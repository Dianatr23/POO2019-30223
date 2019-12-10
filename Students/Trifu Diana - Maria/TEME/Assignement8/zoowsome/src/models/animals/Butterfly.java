package models.animals;
import javax.xml.stream.XMLStreamException;
import static repositories.AnimalRepository.createNode;
import javax.xml.stream.XMLEventWriter; 

import services.factories.Constants;

public class Butterfly extends Insect {
	public Butterfly(double a, double b){
		super(a, b);
		this.nrOfLegs = 8;
    	this.canFly = true;
    	this.name = "fluture";
    	this.isDangerous = false;
    }
	
	public void encodeToXml(XMLEventWriter eventWriter) throws XMLStreamException {   
		super.encodeToXml(eventWriter);   
		createNode(eventWriter, Constants.XML_TAGS.DISCRIMINANT, Constants.Animals.Insect.Butterfly);  
	} 
	 
}
