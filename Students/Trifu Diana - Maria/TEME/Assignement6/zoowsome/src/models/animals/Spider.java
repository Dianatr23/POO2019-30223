package models.animals;
import javax.xml.stream.XMLStreamException;
import services.factories.*;
import static repositories.AnimalRepository.createNode; 
import javax.xml.stream.XMLEventWriter; 



public class Spider extends Insect{
	public Spider(double a, double b){
		super(a, b);
    	this.nrOfLegs = 8;
    	this.name = "paianjen";
    	this.canFly = false;
    	this.isDangerous = true;
    }
	
	public void encodeToXml(XMLEventWriter eventWriter) throws XMLStreamException {   
		super.encodeToXml(eventWriter);   
		createNode(eventWriter, Constants.XML_TAGS.DISCRIMINANT, Constants.Animals.Insect.Spider);  
	} 
	 
	 
}
