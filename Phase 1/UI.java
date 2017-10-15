public class UI {

	public static void main(String[] args) {

        ListElement LL = new ListElement();
		ListElement le = new ListElement();
		
		le.setData(5);
		LL.addElement(le);
		le.setData(4);
		LL.addElement(le);
		le.setData(3);
		LL.addElement(le);
		le.setData(2);
		LL.addElement(le);

        LL.printLinkedListHead();

	}
}