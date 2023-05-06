import java.io.File;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class StudentXML
{
    public static void main(String[] args)
    {
        try
        {
            File input = new File("C:\\Users\\hongn\\OneDrive\\바탕 화면\\Indiana Academy\\2022-2023 Spring Semester\\7. CS Courses\\Activities\\Activity_38\\src\\student_record.xml");
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = factory.newDocumentBuilder();
            Document doc = builder.parse(input);

            System.out.println("Root element: " + doc.getDocumentElement().getNodeName());

            NodeList studentList = doc.getElementsByTagName("student");
            for (int i = 0; i < studentList.getLength(); i++)
            {
                Node node = studentList.item(i);
                if (node.getNodeType() == Node.ELEMENT_NODE)
                {
                    Element element = (Element) node;
                    System.out.println("ID: " + element.getAttribute("id"));
                    System.out.println("First Name: " + element.getElementsByTagName("firstname").item(0).getTextContent());
                    System.out.println("Last Name: " + element.getElementsByTagName("lastname").item(0).getTextContent());
                    System.out.println("Major: " + element.getElementsByTagName("major").item(0).getTextContent());
                    System.out.println("GPA: " + element.getElementsByTagName("gpa").item(0).getTextContent());
                    System.out.println();
                }
            }
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
}