package LinkedList;



public class implementation
{
    private Node head;
    private Node tail;
    private int size;
    public implementation()
    {
        this.size=0;
    }
    //head and tail pointers are the referenced variables that are pointing to the node
   

    private class Node
    {
        private Node next;
        private int value;

        public Node(int value){
            this.value = value;
        }
        public Node(int value ,Node next){
            this.value=value;
            this.next=next;
        }
    }




    public void insertFirst(int val){
        Node node =new Node(val);
        node.next=head;
        head = node;

        if(tail == null){
           tail = head;
        }

        size+=1;
    }

    public void display(){
        Node temp = head;
        while(temp!=null)
        {
            System.out.print(temp.value + "->");
            temp = temp.next;
            //this pointer next is just a pointer.....a reference variable that is going to point to the object that i provided
        }
        System.out.println("END");
    }

    public static void main(String []args){
        implementation list = new implementation();
        list.insertFirst(8);
        list.insertFirst(9);
        list.insertFirst(4);
        list.insertFirst(2);
        list.display();
      }
}