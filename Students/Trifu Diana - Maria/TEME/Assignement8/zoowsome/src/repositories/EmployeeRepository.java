package repositories;
import java.math.BigDecimal;
import java.util.ArrayList;import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLOutputFactory;
import javax.xml.stream.XMLStreamException;
import javax.swing.text.Document;
import java.io.*;
import services.factories.*;
import models.interfaces.*;
import javax.xml.stream.events.Characters; 
import javax.xml.stream.events.EndElement; 
import javax.xml.stream.events.StartElement;
import javax.xml.stream.events.StartDocument;
import javax.xml.stream.events.XMLEvent; 
import javax.xml.stream.XMLEventFactory; 
import org.w3c.dom.*;
import javax.xml.parsers.*;
//import javax.lang.model.element.Element;

import org.xml.sax.SAXException;

import models.animals.Animal;
import models.animals.Butterfly;
import models.animals.Cockroach;
import models.animals.Cow;
import models.animals.Dolphin;
import models.animals.Fish;
import models.animals.Flamingo;
import models.animals.Lizard;
import models.animals.Monkey;
import models.animals.Owl;
import models.animals.Shark;
import models.animals.Snake;
import models.animals.Spider;
import models.animals.Tiger;
import models.animals.Turtle;
import models.animals.peacock;
import models.employees.*;

public class EmployeeRepository extends EntityRepository<Employee>{
	private static final String XML_FILENAME = "Employees.xml"; 
	 
	 public EmployeeRepository() { 
		 super(XML_FILENAME, Constants.XML_TAGS.EMPLOYEE); 
	 } 
	 
	 public static void createNode(XMLEventWriter eventWriter, String name, String value) throws XMLStreamException {   
		 XMLEventFactory eventFactory = XMLEventFactory.newInstance();   
		 XMLEvent end = eventFactory.createDTD("\n");   
		 XMLEvent tab = eventFactory.createDTD("\t");   
		 // Create Start node   
		 StartElement sElement = eventFactory.createStartElement("", "", name);  
		 eventWriter.add(tab);  
		 eventWriter.add(sElement);  
		 // Create Content   
		 Characters characters = eventFactory.createCharacters(value); 
	  eventWriter.add(characters);  
	  // Create End node  
	  EndElement eElement = eventFactory.createEndElement("", "", name);   
	  eventWriter.add(eElement); 
	  eventWriter.add(end);
}
	 
	 @Override 
	 protected Employee getEntityFromXmlElement(Element element) { 
		 String discriminant =  element.getElementsByTagName(Constants.XML_TAGS.DISCRIMINANT).item(0).getTextContent();  
		 BigDecimal salary1 = new BigDecimal("2156");
		 switch (discriminant) {  
		 case Constants.Employees.Caretakers.Caretaker:    
			 Employee caretaker = new Caretaker("unknown", salary1 ,false);    
			 caretaker.decodeFromXml(element); 
			 return caretaker; 
		
		default:   
			break;  
		}  
		return null; 
} 
	 
	 
}
