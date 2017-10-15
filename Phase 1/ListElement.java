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
		
		public ListElement deleteElement(int a){
			if (a > size || a <= 0) {
				System.out.println("INVALID");
				return null;
			}
			
			else if (a+1 < size) {
				ListElement prev = first;
				for	(int i = 1; i < a; i++) {
					prev = prev.next;
				}
				
				ListElement current = prev.next;
				ListElement post = current.next;
				prev.next = post;
				size--;
				return current;
			}
			
			else if (a == size) {
				ListElement prev = first;
				for	(int i = 1; i < a-1; i++) {
					prev = prev.next;
				}
				
				ListElement current = last;
				last = prev;
				last.next = null;
				size--;
				return current;
			}
			else if (a == 1) {
				ListElement prev = first;
				ListElement post = first.next;

				first = post;
				size--;
				return first;
			}
			else {
				System.out.println("UNEXPECTED ERROR");
				return null;
			}
		}
		
		public ListElement getElement(int n) {
			if (n == 1)
				return first;
			else if (n == size)
				return last;
			else if (n < size && n > 0) {
				ListElement temp = first;
				for (int i = 1; i <= n; i++) {
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
            System.out.println("Linked List Elements");
            ListElement temp = first;
            while (temp != null) {
                System.out.println(temp.data);
                temp = temp.next;
            }
        }
}
