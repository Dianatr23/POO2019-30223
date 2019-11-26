package repositories;
import models.animals.*;
import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLOutputFactory;
import javax.xml.stream.XMLStreamException;
import javax.swing.text.Document;
import java.io.*;
import java.util.*;
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
import org.xml.sax.SAXException;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class AnimalRepository {
	private static final String XML_FILENAME = "Animals.xml"; 
	 
	 public AnimalRepository() { 
	 
	 } 
	 
	 public void save(ArrayList<Animal> animals) throws FileNotFoundException, XMLStreamException{
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
		 
		 
		 for (XML_Parsable animal : animals) {   
			 StartElement sElement = eventFactory.createStartElement("", "", Constants.XML_TAGS.ANIMAL);   
			 eventWriter.add(sElement);   
			 eventWriter.add(end); 
		 
		   animal.encodeToXml(eventWriter); 
		 
		   EndElement eElement = eventFactory.createEndElement("", "", Constants.XML_TAGS.ANIMAL);   
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
	  
	  public ArrayList<Animal> load() throws ParserConfigurationException, SAXException, IOException { 
		  
		  ArrayList<Animal> animals = new ArrayList<Animal>(); 
		 
		  File fXmlFile = new File(XML_FILENAME);   
		  DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();  
		  DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();   
		  Document doc = (Document) dBuilder.parse(fXmlFile);   
		  ((org.w3c.dom.Document) doc).getDocumentElement().normalize(); 
		 
		  NodeList nodeList = ((org.w3c.dom.Document) doc).getElementsByTagName(Constants.XML_TAGS.ANIMAL); 
		 
		  for (int i = 0; i < nodeList.getLength(); i++) {   
			  Node node = nodeList.item(i);   
			  if (node.getNodeType() == Node.ELEMENT_NODE) {    
				  Element element = (Element) node;    
				  String discriminant = element.getElementsByTagName(Constants.XML_TAGS.DISCRIMINANT).item(0).getTextContent();     
				  switch (discriminant) {     
				  case Constants.Animals.Insect.Butterfly:      
					  Animal butterfly = new Butterfly(2, 0);     
					  butterfly.decodeFromXml(element);     
					  animals.add(butterfly); 
				  case Constants.Animals.Insect.Spider:      
					  Animal spider = new Spider(1.45, 0.8);     
					  spider.decodeFromXml(element);     
					  animals.add(spider); 
				  case Constants.Animals.Insect.Cockroach:      
					  Animal cockroach = new Cockroach(1, 0);     
					  cockroach.decodeFromXml(element);     
					  animals.add(cockroach); 
				  case Constants.Animals.Bird.Flamingo:      
					  Animal flamingo = new Flamingo(3, 0.15);     
					  flamingo.decodeFromXml(element);     
					  animals.add(flamingo);
				  case Constants.Animals.Bird.Owl:      
					  Animal owl = new Owl(3.7, 0.1);     
					  owl.decodeFromXml(element);     
					  animals.add(owl); 
				  case Constants.Animals.Bird.peacock:      
					  Animal peacock = new peacock(7, 0.2);     
					  peacock.decodeFromXml(element);     
					  animals.add(peacock); 
				  case Constants.Animals.Mammal.Tiger:      
					  Animal tiger = new Tiger(4, 0.95);     
					  tiger.decodeFromXml(element);     
					  animals.add(tiger); 
				  case Constants.Animals.Mammal.Monkey:      
					  Animal monkey = new Monkey(5, 0.3);     
					  monkey.decodeFromXml(element);     
					  animals.add(monkey);
				  case Constants.Animals.Mammal.Cow:      
					  Animal cow= new Cow(7, 0.2);     
					  cow.decodeFromXml(element);     
					  animals.add(cow); 
				  case Constants.Animals.Aquatic.Shark:      
					  Animal shark= new Shark(4, 0.99);     
					  shark.decodeFromXml(element);     
					  animals.add(shark); 
				  case Constants.Animals.Aquatic.Fish:      
					  Animal fish= new Fish(3.5, 0);     
					  fish.decodeFromXml(element);     
					  animals.add(fish); 
				  case Constants.Animals.Aquatic.Dolphin:      
					  Animal dolphin= new Dolphin(5, 0.1);     
					  dolphin.decodeFromXml(element);     
					  animals.add(dolphin);
				  case Constants.Animals.Reptile.Snake:      
					  Animal snake= new Snake(3, 0.9);     
					  snake.decodeFromXml(element);     
					  animals.add(snake); 
				  case Constants.Animals.Reptile.Turtle:      
					  Animal turtle= new Turtle(3, 0.1);     
					  turtle.decodeFromXml(element);     
					  animals.add(turtle); 
				  case Constants.Animals.Reptile.Lizard:      
					  Animal lizard= new Lizard(4.3, 0.4);     
					  lizard.decodeFromXml(element);     
					  animals.add(lizard); 
					    
					  default:      
						  break;     
						  }    
				  }   
			  }  
		  return animals; 
		} 
		 
}
