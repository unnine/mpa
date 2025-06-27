package mpa.util;

import lombok.RequiredArgsConstructor;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import java.util.Optional;
import java.util.function.Consumer;

@RequiredArgsConstructor
public class XMLReader {

    private final Document xml;


    public void root(Consumer<XMLNode> rootHandler) {
        rootHandler.accept(new XMLNode(xml.getDocumentElement()));
    }


    @RequiredArgsConstructor
    public static class XMLNode {

        private final Node node;


        public void childAll(String childName, Consumer<XMLNode> childHandler) {
            NodeList children = node.getChildNodes();
            Node child;

            for (int i = 0; i < children.getLength(); i++) {
                child = children.item(i);

                if (child.getNodeName().equals(childName)) {
                    childHandler.accept(new XMLNode(child));
                }
            }
        }

        public Optional<String> childText(String childName) {
            NodeList children = node.getChildNodes();
            Node child;

            for (int i = 0; i < children.getLength(); i++) {
                child = children.item(i);

                if (child.getNodeName().equals(childName)) {
                    return Optional.ofNullable(child.getTextContent());
                }
            }
            return Optional.empty();
        }

    }
}
