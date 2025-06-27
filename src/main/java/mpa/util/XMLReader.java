package mpa.util;

import lombok.RequiredArgsConstructor;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Consumer;
import java.util.function.Function;

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
            handleChildByTagName(childName, child -> {
                childHandler.accept(new XMLNode(child));
                return false;
            });
        }

        public void child(String childName, Consumer<XMLNode> childHandler) {
            handleChildByTagName(childName, child -> {
                childHandler.accept(new XMLNode(child));
                return true;
            });
        }

        public String childText(String childName) {
            AtomicReference<String> text = new AtomicReference<>(null);

            handleChildByTagName(childName, child -> {
                text.set(child.getTextContent());
                return true;
            });
            return text.get();
        }

        private void handleChildByTagName(String tagName, Function<Node, Boolean> nodeHandler) {
            NodeList children = node.getChildNodes();
            Node child;
            boolean isStop = false;

            for (int i = 0; i < children.getLength(); i++) {
                child = children.item(i);

                if (child.getNodeName().equals(tagName)) {
                    isStop = nodeHandler.apply(child);
                }

                if (isStop) {
                    break;
                }
            }
        }
    }
}
