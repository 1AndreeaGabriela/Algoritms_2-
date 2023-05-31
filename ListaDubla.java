public class ListaDubla
{
    Node head;
    int size=0;

    class Node
    {
        int data;
        Node next, prev;

        Node (int x)
        {
            data = x;
            next = null;
            prev = null;
        }
    }

    void show()
    {

        Node curr = head;
        if (head == null)
        {
            System.out.println ("Lista e goala");
            return;
        }
        while (curr != null)
        {

            System.out.print (curr.data + " ");
            curr = curr.next;
        }
        System.out.println ();
    }



    public void insert(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        newNode.prev = null;

        if (head != null)
            head.prev = newNode;

        head = newNode;
        size++;
    }

    public void deleteStart()
    {
        if (head == null)
        {
            System.out.println ("Lista e goala");
            return;
        }
        else
        {

            if (head != null)
            {
                head = head.next;
            }

            else
            {
                head = null;
            }
        }
    }



    public void deleteLast ()
    {
        if (head == null)
        {
            return;
        }
        else
        {
            if (head != null)
            {
                Node temp = head;

                while (temp.next != null)
                    temp = temp.next;
                temp = temp.prev;
                temp.next = null;

            }
            else
            {
                head = null;
            }
        }
    }

    public void deleteN_Node(int n)
    {
        if (head == null)
        {
            return;
        }
        else
        {
            Node current = head;
            int pos = n;
            for (int i = 1; i < pos; i++)
            {
                current = current.next;
            }
            if (current == head)
            {
                head = current.next;
            }
            else if (current == null)
            {
                current = current.prev;
            }
            else
            {
                current.prev.next = current.next;
                current.next.prev = current.prev;
            }

            current = null;
        }
    }



    public void insertMiddle(int data) {
        Node newNode = new Node(data);


        if (head == null) {

            insert(data);
            return;
        }


        int mid = (size % 2 == 0) ? (size / 2) : (size + 1) / 2;


        if (mid == size) {
            newNode.next = null;
            newNode.prev = head;
            head.next = newNode;
            size++;
            return;
        }

        Node temp = head;

        while (--mid > 0) {
            temp = temp.next;
        }


        (temp.next).prev = newNode;

        newNode.prev = temp;

        newNode.next = temp.next;

        temp.next = newNode;
        size++;
    }


}

