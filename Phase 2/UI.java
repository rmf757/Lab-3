public class UI {

	public static void main(String[] args) {

        ListElement LL = new ListElement();
		ListElement le = new ListElement();
		
		le.setData(1);
		LL.addElement(le);
		le.setData(2);
		LL.addElement(le);
		le.setData(3);
		LL.addElement(le);
		le.setData(4);
		LL.addElement(le);
		
		ListElement t1 = LL.getElement(1);
		System.out.println(t1.getData());
		t1 = LL.getElement(2);
		System.out.println(t1.getData());
		t1 = LL.getElement(3);
		System.out.println(t1.getData());
		t1 = LL.getElement(5);

/* 		ListElement test = LL.deleteElement(1);
		test = LL.deleteElement(2);
		test = LL.deleteElement(2);
		test = LL.deleteElement(1); */

        LL.printLinkedListHead();

	}
}