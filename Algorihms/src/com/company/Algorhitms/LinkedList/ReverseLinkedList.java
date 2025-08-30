package com.company.Algorhitms.LinkedList;

import com.company.Models.ListNode;
import com.oracle.jrockit.jfr.UseConstantPool;


public class ReverseLinkedList {

    public static void main(String[] args){
        ListNode<Integer> node1 = new ListNode<Integer>(1);
        ListNode<Integer> node2 = new ListNode<Integer>(2);
        ListNode<Integer> node3 = new ListNode<Integer>(3);
        ListNode<Integer> node5 = new ListNode<Integer>(4);
        ListNode<Integer> node6 = new ListNode<Integer>(5);

        node1.next = node2;
        node2.next = node3;
        node3.next = node5;
        node5.next = node6;

        ListNode<Integer> n = reverseLinkedList(node1);
        while(n != null){
            System.out.println(n.value);
            n = n.next;
        }

        ListNode<Integer> i = reverseLinkedListSpaceFriendly(node1);
        while(i != null){
            System.out.println(i.value);
            i = i.next;
        }
    }

    private static ListNode<Integer> reverseLinkedList(ListNode<Integer> node1){
        ListNode<Integer> head = node1;
        ListNode<Integer> currentNode = null;
        ListNode<Integer> tail = null;

        while(node1 != null){
            ListNode<Integer> linked = new ListNode<>(node1.value);
            if(currentNode != null){
                linked.next = currentNode;
            }

            currentNode = linked;
            node1 = node1.next;
        }

        return currentNode;
    }

    private static ListNode<Integer> reverseLinkedListSpaceFriendly(ListNode<Integer> node1){
        ListNode<Integer> first = node1;
        ListNode<Integer> second = node1.next;

        while(second != null){
            ListNode<Integer> temp = second.next;
            second.next = first;
            first = second;
            second = temp;
        }

        node1.next = null;
        return first;
    }
}
