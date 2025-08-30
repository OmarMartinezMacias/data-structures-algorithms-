package com.company.Algorhitms.LinkedList;

import com.company.Models.ListNode;

public class LinkedLists {

    public static ListNode<Integer> removeKFromList(ListNode<Integer> l, int k) {

        ListNode<Integer> n = l;

        if (n.value == k) {
            System.out.println(n.value);
            l = l.next;
            n = l;
        }

        System.out.println("first conditon");
        while (n.next != null) {
            if (n.next.value == k) {
                n.next = n.next.next;
            }
            n = n.next;
        }

        System.out.println("Last conditon");
        if (n.value == k) {
            System.out.println(n.value);
            l = l.next;
        }


        return l;
    }
}