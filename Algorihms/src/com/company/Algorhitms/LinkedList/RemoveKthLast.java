package com.company.Algorhitms.LinkedList;

import com.company.Models.ListNode;

public class RemoveKthLast {

    public static ListNode<Integer> RemoveKthToLast(ListNode<Integer> l, int k){
        ListNode<Integer> p1 = l;
        ListNode<Integer> p2 = l;

        for(int i = 0; i < k; i++){
            if(p2 == null) return null;
            p2 = p2.next;
        }

        while(p2 != null){
            p1 = p1.next;
            p2 = p2.next;
        }
        return p1;
    }
}
