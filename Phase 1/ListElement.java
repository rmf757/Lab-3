	public class ListElement {
	
		private ListElement next;
		private int data;
		private static ListElement first;
		private static ListElement last;
		int size = 0;

		public ListElement() {
			data = 0;
			next = null;
		}
		
		public ListElement(ListElement n) {
			data = n.data;	
		}
		
		public void setData(int d) {
			data = d;
		}

		public int getData() {
			return data;
		}
		
		public void addElement(ListElement n) {
            ListElement temp = new ListElement(n);
			n.next = null;
            if (first != null) {
                last.next = temp;
                last = temp;
            } 
			else {
                first = temp;
                last = first;
            }
			size++;
        }
		
		public ListElement deleteElement(int i){
			for	(int i; i < size; i++) }{}

		
		}
		
		public static void printLinkedListHead() {
            System.out.println("Linked List Elements");
            ListElement temp = first;
            while (temp != null) {
                System.out.println(temp.data);
                temp = temp.next;
            }
        }
}
