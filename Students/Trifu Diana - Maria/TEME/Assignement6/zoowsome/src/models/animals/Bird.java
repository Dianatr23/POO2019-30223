package models.animals;
import javax.xml.stream.XMLEventWriter; 
import javax.xml.stream.XMLStreamException;
import static repositories.AnimalRepository.createNode;

public class Bird extends Animal{
	public Boolean migrates;
	public Integer avgFlightAltitude;
	
	public Bird(double a, double b) {
		super(a, b);
	}
	
	public void encodeToXml(XMLEventWriter eventWriter) throws XMLStreamException {  
		super.encodeToXml(eventWriter);   
		createNode(eventWriter, "migrates", String.valueOf(migrates));   
		createNode(eventWriter, "avgFlightAltitude", String.valueOf(avgFlightAltitude));  
	} 
	
}
