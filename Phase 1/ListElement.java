public class List {
    
	public static class ListElement {
	
		private ListElement next;
		private int data;
		private static ListElement first;
		private static ListElement last;

		public ListElement() {
			data = 0;
			next = null;
		}

		public void setData(int d) {
			data = d;
		}

		public int getData() {
			return data;
		}
		
		public static void insert(ListElement n) {
            ListElement a = new ListElement();
            a = n;
			a.nextlink = null;
            if (first != null) {
                last.nextlink = a;
                last = a;
            } else {
                first = a;
                last = a;
            }
            System.out.println(d);
        }
		
	
	}
	

    private int size;
	
	

    public void addElement(ListElement le) {
        size++;

        if(begin == null){
            begin = le;
            end = begin;
        }
        else {
			System.out.print(begin.data);
            end.setNext(le);
            end = le;		
        }
		System.out.print(end.getData());
    }

    public void printLinkedListHead() {
        ListElement temp = new ListElement();
        //temp = begin; 
		System.out.print("\n");
        System.out.print(begin.data);
		//begin = begin.getNext();
		System.out.print(end.data);
		/*
        while (temp.getNext() != null) {
           System.out.print(temp.getNext());
           temp = temp.getNext();
        }       */
    }
	
	public static void main(String[] args) {
		//LinkedList test = new LinkedList();
		
        ListElement le = new ListElement();
        le.setData(5);
		le.setNext(null);
		le.addElement(le);
		//System.out.print(le.getData());
        le.setData(4);
		le.setNext(null);
		le.addElement(le);
		//System.out.print(le.getData());
        le.setData(3);
		le.setNext(null);
		le.addElement(le);
		//System.out.print(le.getData());
        le.setData(2);
        le.setNext(null);
		le.addElement(le);
		//System.out.print(le.getData());
        le.printLinkedListHead();

    }
	
}
