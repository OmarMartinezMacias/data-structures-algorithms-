package com.company.Algorhitms.LinkedList;

import com.company.Models.ListNode;

public class Partition {

    public static ListNode<Integer> Partition(ListNode<Integer> l, int x){
         ListNode<Integer> leftHead = null;
         ListNode<Integer> left = null;
         ListNode<Integer> rightHead = null;
         ListNode<Integer> right = null;


         while(l != null){
             ListNode<Integer> next = l.next;
             l.next = null;
             if(l.value < x){
                 if(leftHead == null){
                     leftHead = l;
                     left = leftHead;
                 }else{
                     left.next = l;
                 }
                 left = l;
             }else{
                 if(rightHead == null){
                     rightHead = l;
                     right = rightHead;
                 }else{
                     right.next = l;
                 }
                 right = l;
             }
             l = next;
         }

         left.next = rightHead;
         return leftHead;
    }
}
