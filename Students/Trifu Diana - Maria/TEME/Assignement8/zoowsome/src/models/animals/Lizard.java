package models.animals;
import static repositories.AnimalRepository.createNode;
import javax.xml.stream.XMLEventWriter;
import services.factories.Constants;
import javax.xml.stream.XMLStreamException;

public class Lizard extends Reptile{
	public Lizard(double a, double b){
		super(a, b);
    	this.nrOfLegs = 4;
    	this.name = "soparla";
    	this.laysEggs = true;
    	
    }
	
	public void encodeToXml(XMLEventWriter eventWriter) throws XMLStreamException {   
		super.encodeToXml(eventWriter);   
		createNode(eventWriter, Constants.XML_TAGS.DISCRIMINANT, Constants.Animals.Reptile.Lizard);  
	} 
}
