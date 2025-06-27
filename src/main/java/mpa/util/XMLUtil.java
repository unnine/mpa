package mpa.util;

import org.w3c.dom.Document;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;
import java.io.InputStream;

public class XMLUtil {

    public static Document getFile(String fileName) {
        try (InputStream xmlStream = XMLUtil.class.getClassLoader().getResourceAsStream(fileName)) {

            if (xmlStream == null) {
                return null;
            }

            DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder documentBuilder = documentBuilderFactory.newDocumentBuilder();
            Document xml = documentBuilder.parse(xmlStream);

            xml.getDocumentElement().normalize();

            return xml;

        } catch (SAXException | IOException | ParserConfigurationException e) {
            throw new RuntimeException(e);
        }
    }

}
