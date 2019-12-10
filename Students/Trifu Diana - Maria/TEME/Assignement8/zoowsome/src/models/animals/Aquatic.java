package models.animals;
import javax.xml.stream.XMLEventWriter; 
import javax.xml.stream.XMLStreamException;

import static repositories.AnimalRepository.createNode;

import javax.xml.stream.XMLStreamException;

enum water{
	Saltywater, Freshwater;
}
public abstract class Aquatic extends Animal {
	public Integer avgSwimDepth;
	public Enum waterType;
	
	public Aquatic(double a, double b) {
		super(a, b);
	}
	
	public void encodeToXml(XMLEventWriter eventWriter) throws XMLStreamException {  
		super.encodeToXml(eventWriter);   
		createNode(eventWriter, "avgSwimDepth", String.valueOf(avgSwimDepth));   
		createNode(eventWriter, "waterType", String.valueOf(waterType));  
	} 
}
