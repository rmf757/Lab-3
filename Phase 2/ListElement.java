	public class ListElement {
	
		private ListElement next;
		private int data;
		private static ListElement first;
		private static ListElement last;
		private ListElement prev;
		int size = 0;

		public ListElement() {
			data = 0;
			next = null;
			prev = null;
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
			temp.next = null;
			temp.prev = null;
            if (first != null) {
                last.next = temp;
				temp.prev = last;
                last = temp;
            } 
			else {
                first = temp;
                last = first;
            }
			size++;
        }
		
		public ListElement deleteElement(int a){
			if (a > size || a <= 0) {
				System.out.println("INVALID");
				return null;
			}
			else if (a == size && size == 1) {
				ListElement temp = first;
				first = null;
				size--;
				return temp;
			}
			else if (a == size) {
				ListElement former = first;
				for	(int i = 1; i < a-1; i++) {
					former = former.next;
				}
				
				ListElement current = last;
				last = former;
				last.next = null;
				size--;

				return current;
			}
			else if (a == 1) {
				ListElement curr = first;
				ListElement post = first.next;

				first = post;
				size--;

				return curr;
			}
			else if (a+1 <= size) {
				ListElement former = first;

				for	(int i = 1; i < a-1; i++) {
					former = former.next;
				}
				
				ListElement current = former.next;
				ListElement post = current.next;
				former.next = post;
				size--;

				return current;
			}
			else {
				System.out.println("UNEXPECTED ERROR");
				return null;
			}
		}
		
		public ListElement getElement(int n) {
			if (n > size || n <= 0) {
				System.out.println("INVALID");
				return null;
			}
			else if (n == 1)
				return first;
			else if (n == size)
				return last;
			else if (n < size && n > 0) {
				ListElement temp = first;
				for (int i = 1; i < n; i++) {
					temp = temp.next;
				}
				return temp;
			}
			else {
				System.out.println("UNEXPECTED ERROR");
				return null;
			}
		}
		
		public static void printLinkedListHead() {

            System.out.println("Linked List Elements from Head");
            ListElement temp = first;
            while (temp != null) {
                System.out.println(temp.data);
                temp = temp.next;
            }
        }
		
		public static void printLinkedListTail() {

            System.out.println("Linked List Elements from Tail");
            ListElement temp = last;

            while (temp != null) {
                System.out.println(temp.data);
                temp = temp.prev;
            }
        }
		
		
}
