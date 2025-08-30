package com.company.Algorhitms.LinkedList;

import com.company.Models.ListNode;

public class ReverseLiinkList {

    public static ListNode<Integer> ReverseList(ListNode<Integer> l, int k){
        return ReverseListPartition(l,k);
    }

    public static ListNode<Integer> ReverseListPartition(ListNode<Integer> l, int k){
        if(l == null){
            return null;
        }else {
            ListNode<Integer> head = null;
            ListNode<Integer> tail = null;
            int c = 0;
            while (l != null) {
                if (c == k) {
                    break;
                }
                ListNode<Integer> n = new ListNode<>(l.value);
                n.next = head;
                head = n;
                if (tail == null) {
                    tail = n;
                }

                c++;
                l = l.next;


            }

            tail.next = ReverseListPartition(l, k);
            return head;
        }
    }
}
