package com.company.Algorhitms.LinkedList;

import com.company.Models.ListNode;



public class SumLists {

    public static void main(String[] args) {
        ListNode<Integer> node1 = new ListNode<Integer>(2);
        ListNode<Integer> node2 = new ListNode<Integer>(4);
        ListNode<Integer> node3 = new ListNode<Integer>(3);

        ListNode<Integer> node4 = new ListNode<Integer>(5);
        ListNode<Integer> node5 = new ListNode<Integer>(6);
        ListNode<Integer> node6 = new ListNode<Integer>(4);


        node1.next = node2;
        node2.next = node3;

        node4.next = node5;
        node5.next = node6;

        ListNode<Integer> n = SumList(node1, node4,0);
        while(n != null){
            System.out.println(n.value);
            n = n.next;
        }
    }

    public static ListNode<Integer> SumList(ListNode<Integer> l1, ListNode<Integer> l2, int carry){
         if(l1 == null && l2 == null){
             return null;
         }

         if(l1 != null){
             carry += l1.value;
         }

         if(l2 != null){
             carry += l2.value;
         }

         ListNode<Integer> sum = new ListNode<Integer>(carry % 10);

         sum.next =  SumList(l1 == null ? null : l1.next, l2 == null ? null : l2.next, carry > 10 ? 1 : 0);

         return sum;
    }
}
