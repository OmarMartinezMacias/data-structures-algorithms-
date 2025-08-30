package com.company.Algorhitms.LinkedList;


import com.company.Models.ListNode;

import java.util.HashMap;

public class RemoveDuplicates {


    public static ListNode<String> RemDuplicates(ListNode<String> l, HashMap<String, Integer> map){

        if(l == null){
            return l;
        }else{
            if(map.containsKey(l.value)){
               map.put(l.value, map.get(l.value) + 1 );
            }else{
                map.put(l.value, 1);
            }

            l.next = RemDuplicates(l.next, map);

            if (map.containsKey(l.value) && map.get(l.value) > 1) {
                map.put(l.value, map.get(l.value) - 1);
                return l.next;
            }else{
                return l;
            }
        }

    }

    public static ListNode<String> RemDuplicateBS(ListNode<String> l){
        ListNode<String> current = l;
        while(current != null){
            ListNode<String> runner = current;
            while(runner.next != null){
                if(runner.next.value == current.value){
                    runner.next = runner.next.next;
                }else{
                    runner = runner.next;
                }
            }
            current = current.next;
        }
        return l;
    }
}
