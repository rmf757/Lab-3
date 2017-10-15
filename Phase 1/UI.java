import java.util.*;


public class UI {
    
    public static void main(String[] args) {
        ListElement le = new ListElement();

        le.setData(5);
        
        LinkedList test = new LinkedList();

        test.addElement(le);
        le.setData(4);
        test.addElement(le);
        le.setData(3);
        test.addElement(le);
        le.setData(2);
        test.addElement(le);

    }
}