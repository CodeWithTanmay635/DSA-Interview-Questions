package LinkedList;


public class LL {
    private Node head;
    private Node tail;
    private int size;
    public LL(){
        this.size = 0;
    }

    public void insertFirst(int val){
        Node node = new Node(val);
        node.next = head;
        head = node;
        if(tail == null){
            tail = head;
        }

        size += 1;
    }
    public void insert(int val, int index){
        if(index == 0){
            insertFirst(val);
            return;
        }

        if(index == size){
            insertLast(val);
            return;
        }

        Node temp = head;

        for (int i = 0; i < index ; i++) {
            temp = temp.next;
        }

        temp.next = new Node(val,temp.next);
        size++;
    }
    public void display(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.value + " -> ");
            temp = temp.next;
        }
        System.out.println("End");
    }
    public void insertLast(int val){
        if(tail == null){
            insertFirst(val);
        }
        Node node = new Node(val);
        tail.next = node;
        tail = node;
        size++;
    }
    public int deleteFirst(){
        int val = head.value; //the 1st value is head from the LL
        head = head.next; // this deletes first value and assigns head as next if 3 was the first element and 6 was 2nd then after deletion 2nd element becomes head and first element
        if(head == null){
            tail = null;
        }
        size--;//decreases the size of LL
        return val;
    }
    public int deleteLast(){
        if (size <= 1){
            return deleteFirst();
        }
        Node secondLast = get(size-2);
        int val = tail.value;
        tail = secondLast;
        tail.next = null;
        size--;
        return val;
    }
    public int delete(int index){
        if(index == 0){
            return deleteFirst();
        }
        if(index == size-1){
            return deleteLast();
        }
        Node pre = get(index-1);
        int val = pre.next.value;
        pre.next = pre.next.next;
        return val;
    }
    public Node find(int value) {
        Node node = head;
        while(node != null){
            if(node.value == value){
                return node;
            }
            node = node.next;
        }
        return null;
    }
    public Node get(int index){
        Node node = head;
        for (int i = 0; i < index; i++) {
            node = node.next;
        }
        return node;
    }

}
 class Node{
    public int value;
    public Node next;

    public Node(int value) {
        this.value = value;
    }

    public Node(int value, Node next) {
        this.value = value;
        this.next = next;
    }
}