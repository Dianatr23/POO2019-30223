package models.animals;
import javax.xml.stream.XMLEventWriter; 
import javax.xml.stream.XMLStreamException;
import static repositories.AnimalRepository.createNode;


public abstract class Reptile extends Animal{
	public boolean laysEggs;
	
	public Reptile(double a, double b) {
		super(a, b);
	}
	
	public void encodeToXml(XMLEventWriter eventWriter) throws XMLStreamException {  
		super.encodeToXml(eventWriter);   
		createNode(eventWriter, "laysEggs", String.valueOf(laysEggs));   
	} 
}
