public class ListaCirculara
{   int size;
    public class Node{
        int data;
        Node next;
        public Node(int data) {
            this.data = data;
        }
    }


    public Node head = null;
    public Node tail = null;


    public void insert(int data){
        //Se creaza un nod nou
        Node newNode = new Node(data);
        //Verificam daca lista e goala
        if(head == null) {

            head = newNode;
            tail = newNode;
            newNode.next = head;
        }
        else {

            tail.next = newNode;

            tail = newNode;

            tail.next = head;
        }

        size++;
    }


    public void show() {
        Node current = head;
        if (head == null) {
            System.out.println("Lista e goala");
        } else {
            System.out.println("Lista circulara: ");
            do {

                System.out.print(" " + current.data);
                current = current.next;
            } while (current != head);
            System.out.println();
        }
    }

    public void deleteStart() {
        //Verificam daca lista e goala
        if(head == null) {
            return;
        }
        else {
            //Verificam daca are numai un element

            if(head != tail ) {
                head = head.next;
                tail.next = head;
            }
            //Daca are un singur element e eliminat -->head=tail=NULL

            else {
                head = tail = null;
            }
        }
    }


    public void deleteLast() {
        //Verificam daca lista e goala
        if(head == null) {
            return;
        }
        else {
            //Verificam daca are un singur element
            if(head != tail ) {
                Node current = head;

                while(current.next != tail) {
                    current = current.next;
                }

                tail = current;

                tail.next = head;
            }
            //Daca are un singur element e eliminat -->head=tail=NULL
            else {
                head = tail = null;
            }
        }
    }


    public void insertMiddle(int data){
        Node newNode = new Node(data);
        //Verificam daca lista e goala
        if(head == null){

            head = newNode;
            tail = newNode;
            newNode.next = head;
        }
        else{
            Node temp,current;
            //Stocam mijlocul listei
            int count = (size % 2 == 0) ? (size/2) : ((size+1)/2);

            temp = head;
            current= null;
            for(int i = 0; i < count; i++){

                current = temp;

                temp = temp.next;
            }


            current.next = newNode;

            newNode.next = temp;
        }
        size++;
    }

    public int calcLen(){
        int len = 0;
        Node temp=head;

        while(temp!=tail){
            temp = temp.next;
            len++;
        }
        return len;
    }



    public void deleteN_Node(int n)
    {
        int len = calcLen();


        if(n < 1 || n > len)
        {
            System.out.println("Nu se poate sterge\n");

        }
        else
        {
            if(n == 1)
            {

                System.out.println("Nod sters: " + head.data);
                head = head.next;
                return;
            }

            Node temp = head;
            Node previous = null;

            while(--n > 0) {
                previous = temp;
                temp = temp.next;
            }

            previous.next = temp.next;
            System.out.println("Nod sters: " + temp.data);
        }
    }
}