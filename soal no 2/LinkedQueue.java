import java.util.*;

class linkedQueue {
    protected NodeLink front, rear;
    public int size;


    public linkedQueue()
    {
        front = null;
        rear = null;
        size = 0;
    }


    public boolean isEmpty()
    {
        return front == null;
    }

    //  untuk mendapatkan size
    public int getSize()
    {
        return size;
    }

    //  untuk memasaukkan element
    public void insert(String data)
    {
        NodeLink nptr = new NodeLink(data, null);
        if (rear == null)
        {
            front = nptr;
            rear = nptr;
        }
        else
        {
            rear.setLink(nptr);
            rear = rear.getLink();
        }
        size++;
    }

    //  Funtuk meremove element
    public String remove()
    {
        if (isEmpty())
            throw new NoSuchElementException("Underflow Exception");
        NodeLink ptr = front;
        front = ptr.getLink();
        if (front == null)
            rear = null;
        size--;
        return ptr.getData();
    }

    // untuk mencek element dari depan
    public String peek()
    {
        if (isEmpty())
            throw new NoSuchElementException("Underflow Exception");
        return front.getData();
    }

    //  untuk menampilkan status
    public void display()
    {
        System.out.print("\nMenampilkan Nama Pekerjaan = ");
        if (size == 0)
        {
            System.out.print("Empty\n");
            return;
        }
        NodeLink ptr = front;
        while (ptr != rear.getLink())
        {
            System.out.print(ptr.getData() + " || ");
            ptr = ptr.getLink();
        }
        System.out.println();
    }
}