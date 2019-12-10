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

public class AnimalRepository extends EntityRepository<Animal>{
	private static final String XML_FILENAME = "Animals.xml"; 
	 
	 public AnimalRepository() { 
		 super(XML_FILENAME, Constants.XML_TAGS.ANIMAL);
	 } 
	 
	 @Override 
	 protected Animal getEntityFromXmlElement(Element element) { 
		 String discriminant =  element.getElementsByTagName(Constants.XML_TAGS.DISCRIMINANT).item(0).getTextContent();  
		 switch (discriminant) {  
		 case Constants.Animals.Insect.Butterfly:    
			 Animal butterfly = new Butterfly(2, 0);    
			 butterfly.decodeFromXml(element); 
			 return butterfly; 
		 case Constants.Animals.Insect.Cockroach:    
			 Animal cockroach = new Cockroach(1, 0);    
			 cockroach.decodeFromXml(element); 
			 return cockroach;  
		 case Constants.Animals.Insect.Spider:    
			 Animal spider = new Spider(1.45, 0.8);    
			 spider.decodeFromXml(element); 
			 return spider;
		 case Constants.Animals.Mammal.Tiger:    
			 Animal tiger = new Tiger(4, 0.95);    
			 tiger.decodeFromXml(element); 
			 return tiger;
		 case Constants.Animals.Mammal.Monkey:    
			 Animal monkey = new Monkey(5, 0.3);    
			 monkey.decodeFromXml(element); 
			 return monkey;
		 case Constants.Animals.Mammal.Cow:    
			 Animal cow = new Cow(7, 0.2);    
			 cow.decodeFromXml(element); 
			 return cow;
		 case Constants.Animals.Reptile.Snake:    
			 Animal snake = new Snake(3, 0.9);    
			 snake.decodeFromXml(element); 
			 return snake;
		 case Constants.Animals.Reptile.Lizard:    
			 Animal lizard = new Lizard(4.3, 0.4);    
			 lizard.decodeFromXml(element); 
			 return lizard;
		 case Constants.Animals.Reptile.Turtle:    
			 Animal turtle = new Turtle(3, 0.1);    
			 turtle.decodeFromXml(element); 
			 return turtle;
		 case Constants.Animals.Aquatic.Fish:    
			 Animal fish = new Fish(3.5, 0);    
			 fish.decodeFromXml(element); 
			 return fish;
		 case Constants.Animals.Aquatic.Shark:    
			 Animal shark = new Shark(4, 0.99);    
			 shark.decodeFromXml(element); 
			 return shark;
		 case Constants.Animals.Aquatic.Dolphin:    
			 Animal dolphin = new Dolphin(5, 0.1);    
			 dolphin.decodeFromXml(element); 
			 return dolphin;
		 case Constants.Animals.Bird.Owl:    
			 Animal owl = new Owl(3.7, 0.1);    
			 owl.decodeFromXml(element); 
			 return owl;
		 case Constants.Animals.Bird.Flamingo:    
			 Animal flamingo = new Flamingo(3, 0.15);    
			 flamingo.decodeFromXml(element); 
			 return flamingo;
		 case Constants.Animals.Bird.peacock:    
			 Animal peacock = new peacock(7, 0.2);    
			 peacock.decodeFromXml(element); 
			 return peacock;	 
		default:   
			break;  
		}  
		return null; 
} 
	 
		 
}
