import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.RandomAccessFile;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.Attr;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class Index {
	public static void main(String args[]){
		try {
			DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
			DocumentBuilder db = dbf.newDocumentBuilder();
			
			Document d = db.newDocument();
			Element e = d.createElement("PersonalDetails");
			
			d.appendChild(e);
			
			Attr a = d.createAttribute("Name");
			a.setValue("Vishwa Prasad");
			
			e.setAttributeNode(a);
			
			Element e1 = d.createElement("FirstName");
			e1.appendChild(d.createTextNode("Vishwa"));
			e.appendChild(e1);
			
			Element e2 = d.createElement("LastName");
			e2.appendChild(d.createTextNode("Prasad"));
			e.appendChild(e2);
			
			TransformerFactory tf = TransformerFactory.newInstance();
			Transformer t = tf.newTransformer();
			DOMSource source = new DOMSource(d);
			
//			t.transform(source, new StreamResult(System.out)); for console
			t.transform(source, new StreamResult(new File("XML.txt"))); // for file save
			
			d = db.parse("XML.xml");
			NodeList nodeList1 = d.getChildNodes(); 
			NodeList nodeList = nodeList1.item(0).getChildNodes();
			for(int i=0;i<nodeList.getLength();i++){
				Node node = nodeList.item(i);
				if(node.getNodeType() == Node.ELEMENT_NODE){
					Element e0 = (Element) node;
					System.out.println("The Tag is "+e0.getTagName()+" and the value is "+e0.getTextContent());
				}
			}
		} catch (ParserConfigurationException e) {
			e.printStackTrace();
		} catch (TransformerConfigurationException e3) {
			e3.printStackTrace();
		} catch (TransformerException e3) {
			e3.printStackTrace();
		} catch (SAXException e3) {
			e3.printStackTrace();
		} catch (IOException e3) {
			e3.printStackTrace();
		}
	}
}
