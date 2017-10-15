	public class ListElement {
	
		private ListElement next;
		private int data;
		private static ListElement first;
		private static ListElement last;

		public ListElement() {
			data = 0;
			next = null;
		}
		
		public ListElement(int i, ListElement n) {
		
			data = i;
			next = n;
			
		}
		
		public void setData(int d) {
			data = d;
		}

		public int getData() {
			return data;
		}
		
		public static void addElement(int n) {
            ListElement a = new ListElement(n, null);
            //a = n;
			//a.next = null;
            if (first != null) {
                last.next = a;
                last = a;
            } else {
                first = a;
                last = a;
            }
        }
		
		public static void printLinkedListHead() {
            System.out.println("Linked List Elements\n");
            ListElement temp = first;
            while (temp != null) {
                System.out.println(temp.data);
                temp = temp.next;
            }
        }
}
