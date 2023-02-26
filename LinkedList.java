import javax.xml.transform.SourceLocator;

class LL {
    Node head;
    private int size;

    LL() {
        size = 0;
    }

    public class Node {
        String data;

        Node next;

        Node(String data) {

            this.data = data;

            this.next = null;

            size++;

        }

    }
    // Insert a node in beginning

    public void addFirst(String data) {
        Node newNode = new Node(data);

        newNode.next = head;
        head = newNode;

    }
    // Insert a node at last

    public void addLast(String data) {

        Node newNode = new Node(data);

        if (head == null) {

            head = newNode;

            return;

        }

        Node lastNode = head;

        while (lastNode.next != null) {

            lastNode = lastNode.next;

        }

        lastNode.next = newNode;

    }
    // Print a list

    public void printList() {

        Node currNode = head;

        while (currNode != null) {

            System.out.print(currNode.data + " -> ");

            currNode = currNode.next;

        }

        System.out.println("null");

    }
    // Delete from first

    public void removeFirst() {

        if (head == null) {

            System.out.println("Empty List, nothing to delete");

            return;

        }

        head = head.next;

        size--;

    }
    // Delete from last

    public void removeLast() {

        if (head == null) {

            System.out.println("Empty List, nothing to delete");

            return;

        }

        size--;

        if (head.next == null) {

            head = null;

            return;

        }

        Node currNode = head;

        Node lastNode = head.next;

        while (lastNode.next != null) {

            currNode = currNode.next;

            lastNode = lastNode.next;

        }

        currNode.next = null;

    }
    // To get the size of the list

    public int getSize() {

        return size;

    }
    // to add a new node in between of two nodes

    public void addInBetween(int index, String data) {

        if (index > size || index < 0) {

            System.out.println("Invalid Entry");

            return;
        }
        size++;

        Node newNode = new Node(data);

        if (head == null || index == 0) {
            newNode.next = head;

            head = newNode;
        }

        Node currNode = head;

        for (int i = 0; i <= size; i++)

        {

            if (i == index) {

                Node nextNode = currNode.next;

                currNode.next = newNode;

                newNode.next = nextNode;

                break;
            }

            currNode = currNode.next;
        }

    }

    // to remove a node from between 2 nodes

    public void remBetweenNodes(int index) {
        if (index > size || index < 0) {

            System.out.println("Invalid Entry");

            return;
        }

        if (head == null || index == 0) {

            System.out.println("Empty List, nothing to delete");

            return;

        }

        size--;

        if (head.next == null) {
            head = null;

            return;
        }

        Node currNode = head;

        for (int i = 0; i <= size; i++) {
            if (i == index) {
                Node prevNode = head.next;

                Node nextNode = prevNode.next;

                currNode.next = nextNode;

                break;

            }

        }

    }

    public static void main(String args[]) {

        LL list = new LL();

        list.addLast("name");

        list.addLast("is");

        list.addLast("Shreya");

        list.printList();

        list.addFirst("My");

        list.printList();

        System.out.println(list.getSize());

        list.removeFirst();

        list.printList();

        list.printList();

        System.out.println(list.getSize());

        list.addInBetween(1, "Miss");

        list.printList();

        System.out.println(list.getSize());

        list.remBetweenNodes(1);

        list.printList();
        System.out.println(list.getSize());

        list.addFirst("My");
        list.printList();

        list.addFirst("My");
        list.printList();

    }

}
