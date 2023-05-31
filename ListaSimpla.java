import java.lang.*;
public class ListaSimpla
    
{   Node head;

    public Node insert(int data)
    {Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;

        return head;
    }

    class Node{
    int data;
    Node next;

    Node(int x)
    {
        data = x;
        next = null;
    }

}
    public void show()
    {
        Node node = head;


        while(node!=null)
        {
            System.out.print(node.data + " ");
            node = node.next;
        }
        System.out.println();
    }
   public void insertMiddle(int x)
    {
        // Daca lista e goala
        if (head == null)
            head = new Node(x);
        else {

            Node newNode = new Node(x);

            Node ptr = head;
            int len = 0;

            // calculam lungime listei

            while (ptr != null) {
                len++;
                ptr = ptr.next;
            }


            int count = ((len % 2) == 0) ? (len / 2) :
                    (len + 1) / 2;
            ptr = head;


            while (count-- > 1)
                ptr = ptr.next;


            newNode.next = ptr.next;
            ptr.next = newNode;
        }
    }





    public void deleteStart()
    {
        if (head == null){
            System.out.println("Lista e goala,nu se poate sterge.");
            return;
        }

        System.out.println("Nod sters: " + head.data);

        head = head.next;
    }
    public void deleteLast()
    {
        if (head == null){
            System.out.println("Lista e goala,nu se poate sterge.");
            return;
        }
        // daca are un singur nod
        if(head.next == null)
        {
            System.out.println("Nod sters: " + head.data);
            head = head.next;
        }
        Node previous = null;
        Node temp = head;
        while (temp.next != null)
        {

            previous = temp;
            temp = temp.next;
        }

        System.out.println("Nod sters: " + temp.data);
        previous.next = null;



    }

    public int calcSize(Node node){
        int size = 0;
        // traverse to the last node each time incrementing the size
        while(node!=null){
            node = node.next;
            size++;
        }
        return size;
    }

    public void deleteN_Node(int n) {
        int len = calcSize(head);

        if (n < 1 || n > len) {
            System.out.println("Nu poate fi sters\n");

        } else {
            if (n == 1) {

                System.out.println("Nod sters: " + head.data);
                head = head.next;
                return;
            }

            Node temp = head;
            Node previous = null;


            while (--n > 0) {
                previous = temp;
                temp = temp.next;
            }

            previous.next = temp.next;
            System.out.println("Nod sters: " + temp.data);
        }
    }


}
