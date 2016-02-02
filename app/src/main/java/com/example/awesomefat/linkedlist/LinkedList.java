package com.example.awesomefat.linkedlist;

import android.widget.LinearLayout;

/**
 * Created by awesomefat on 1/28/16.
 */
public class LinkedList
{
    private Node head;
    private LinearLayout layout;
    int total = 0;
    int i = 0;

    public LinkedList(LinearLayout layout)
    {
        this.head = null;
        this.layout = layout;
    }

    public void display()
    {
        if(this.head == null)
        {
           System.out.println("****Empty List");
        }
        else
        {
            printValue(this.head);
        }
    }

    public void addFront(String value)
    {
        Node n = new Node(value);
        if(this.head == null)
        {
            this.head = n;

        }
        else
        {
            String swap = this.head.getPayload();
            Node change = this.head.getNextNode();
            this.head.setPayload(value);
            this.head.setNextNode(n);
            n.setPayload(swap);
            n.setNextNode(change);


        }
        this.total++;


    }

    public Node removeFront()
    {
        //this removes and returns the Node that is currently sitting at the
        //front of the list.  The new front of the list, should be the old
        //second node or null in the event it was a 1-list
        if(this.head.getNextNode()!= null) {
            String newPay = this.head.getNextNode().getPayload();
            Node newNext = this.head.getNextNode().getNextNode();
            this.head.setNextNode(newNext);
            this.head.setPayload(newPay);
            this.total--;
            return this.head;
        }
        else
        {

            return null;
        }

    }

    public void printValue(Node next)
    {
        System.out.println("****" + next.getPayload());

        if(next.getNextNode()!=null)
        {



            printValue(next.getNextNode());

        }


    }
}
