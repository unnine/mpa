package mpa.util;

import org.w3c.dom.Document;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;
import java.io.InputStream;

public class FileUtil {

    public static Document getXMLFile(String fileName) {
        return getXMLFile(ClassLoader.getSystemClassLoader(), fileName);
    }

    private static Document getXMLFile(ClassLoader classLoader, String fileName) {
        try (InputStream inputStream = classLoader.getResourceAsStream(fileName)) {

            if (inputStream == null) {
                Log.warn("not found file resource.");
                return null;
            }

            DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder documentBuilder = documentBuilderFactory.newDocumentBuilder();
            Document xml = documentBuilder.parse(inputStream);

            xml.getDocumentElement().normalize();

            return xml;

        } catch (SAXException | IOException | ParserConfigurationException e) {
            throw new RuntimeException(e);
        }
    }
}
