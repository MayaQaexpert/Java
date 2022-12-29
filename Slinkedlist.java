public class Slinkedlist {
    class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
        }
    }
    public Node head = null;
    public Node tail = null;
    public void addNode(int data){
        Node newnode = new Node(data);
        if (head == null){
            head = newnode;

        }else {
            tail.next = newnode;
        }
        tail = newnode;
        System.out.println("New node added");
    }
    public void display(){
        if (head == null){
            System.out.println("Empty");
            return;
        }
        Node temp = head;
        while (temp != null){
            System.out.println(temp.data);
            temp = temp.next;
        }
    }
    public void delete(int data){
        Node temp  = head,prev = null;
        if (temp != null && temp.data == data ){
            head = temp.next;
            return;
        }
        while ( temp != null && temp.data != data ){
            prev = temp;
            temp = temp.next;
        }
        if ( temp == null){
            return;
        }
        if ( temp == tail){
            tail = prev;
            tail.next = null;
            return;

        }
        prev.next = temp.next;
    }

    public static void main(String[] args) {
        Slinkedlist list = new Slinkedlist();
        list.display();
        list.addNode(10);
        list.addNode(30);
        list.addNode(50);
        list.delete(30);
        list.display();
    }
}
