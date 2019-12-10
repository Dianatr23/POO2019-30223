package models.animals;
import static repositories.AnimalRepository.createNode;
import javax.xml.stream.XMLEventWriter; 
import javax.xml.stream.XMLStreamException;
import org.w3c.dom.Element;


public abstract class Insect extends Animal{
	public Boolean canFly;
	public Boolean isDangerous;
	public Insect(double a, double b) {
		super(a, b);
	}
	public void encodeToXml(XMLEventWriter eventWriter) throws XMLStreamException {  
		super.encodeToXml(eventWriter);   
		createNode(eventWriter, "canFly", String.valueOf(canFly));   
		createNode(eventWriter, "isDangerous", String.valueOf(isDangerous));  
	} 
	
	public void decodeFromXml(Element element) {  
		setTakenCareOf(Boolean.valueOf(element.getElementsByTagName("canFly").item(0).getTextContent()));  
		setTakenCareOf(Boolean.valueOf(element.getElementsByTagName("isDangerous").item(0).getTextContent())); 
		} 
	 
	 
	 
}
