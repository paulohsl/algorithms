package br.com.paulo.collections.list;

import java.util.List;

/**
 * Created by paulohsl on 8/21/16.
 */
public class ListNode {


    private int data;
    private ListNode next;

    public static void main(String[] args) {

        ListNode head = new ListNode();

        System.out.println(insertAtHead(head,1));

    }

    public static ListNode insertAtHead(ListNode head, int data) {

        ListNode resp = new ListNode();
        resp.data = data;

        resp.next = head;

        return resp;
    }

}
