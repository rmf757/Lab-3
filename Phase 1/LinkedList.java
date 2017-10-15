public class LinkedList {

    private ListElement begin;
    private ListElement end;
    private int size;

    public LinkedList() {
        this.begin = null;
        this.end = null;
        this.size = 0;
    }

    public void addElement(ListElement le) {
        size++;

        if(begin == null){
            begin = le;
            end = begin;
        }
        else {
            end.setNext(le);
            end = end.getNext();
        }
    }

    public void printLinkedListHead() {
        
    }

}