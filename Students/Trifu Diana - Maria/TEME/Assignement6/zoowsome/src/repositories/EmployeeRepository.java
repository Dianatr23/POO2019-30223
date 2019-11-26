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

import models.employees.*;

public class EmployeeRepository {
	private static final String XML_FILENAME = "Employees.xml"; 
	 
	 public EmployeeRepository() { 
	 } 
	 
	 public void save(ArrayList<Employee> employees) throws FileNotFoundException, XMLStreamException{
		 XMLOutputFactory outputFactory = XMLOutputFactory.newInstance();   
		 // Create XMLEventWriter   
		 XMLEventWriter eventWriter = outputFactory.createXMLEventWriter(new FileOutputStream(XML_FILENAME));  
		 // Create a EventFactory   
		 XMLEventFactory eventFactory = XMLEventFactory.newInstance();  
		 XMLEvent end = eventFactory.createDTD("\n");  
		 // Create and write Start Tag  
		 StartDocument startDocument = eventFactory.createStartDocument();   
		 eventWriter.add(startDocument);   
		 // Create content open tag  
		 StartElement configStartElement = eventFactory.createStartElement("", "", "content");   
		 eventWriter.add(configStartElement);  
		 eventWriter.add(end); 
		 
		 
		 for (XML_Parsable employee : employees) {   
			 StartElement sElement = eventFactory.createStartElement("", "", Constants.XML_TAGS.EMPLOYEE);   
			 eventWriter.add(sElement);   
			 eventWriter.add(end); 
		 
		   employee.encodeToXml(eventWriter); 
		 
		   EndElement eElement = eventFactory.createEndElement("", "", Constants.XML_TAGS.EMPLOYEE);   
		   eventWriter.add(eElement);   
		   eventWriter.add(end);   
		 } 
		 
		  eventWriter.add(eventFactory.createEndElement("", "", "content"));   
		  eventWriter.add(eventFactory.createEndDocument());   
		  eventWriter.close();  
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
	 
	 public ArrayList<Employee> load() throws ParserConfigurationException, SAXException, IOException { 
		  
		  ArrayList<Employee> employees = new ArrayList<Employee>(); 
		 
		  File fXmlFile = new File(XML_FILENAME);   
		  DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();  
		  DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();   
		  Document doc = (Document) dBuilder.parse(fXmlFile);   
		  ((org.w3c.dom.Document) doc).getDocumentElement().normalize(); 
		 
		  NodeList nodeList = ((org.w3c.dom.Document) doc).getElementsByTagName(Constants.XML_TAGS.EMPLOYEE); 
		  BigDecimal z = new BigDecimal("0");
		  for (int i = 0; i < nodeList.getLength(); i++) {   
			  Node node = nodeList.item(i);   
			  if (node.getNodeType() == Node.ELEMENT_NODE) {    
				  Element element = (Element) node;    
				  String discriminant = element.getElementsByTagName(Constants.XML_TAGS.DISCRIMINANT).item(0).getTextContent();     
				  switch (discriminant) {     
				  case Constants.Employees.Caretakers.Caretaker:      
					  Employee caretaker = new Caretaker("unknown", z, false);     
					  caretaker.decodeFromXml(element);     
					  employees.add(caretaker);   
					  default:      
						  break;     
						  }    
				  }   
			  }  
		  return employees; 
		} 
	 
}
