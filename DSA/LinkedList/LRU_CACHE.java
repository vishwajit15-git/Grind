import java.util.*;
class LRUCache {

    public class ListNode{
        int key;
        int val;
        ListNode prev;
        ListNode next;

        ListNode(int key,int val){
            this.key=key;
            this.val=val;
        }
    }

    private final int capacity;
    private final ListNode head;
    private final ListNode tail;
    private final Map<Integer,ListNode>map;

    public LRUCache(int capacity) {
        this.capacity=capacity;
        this.map=new HashMap<>();
        this.head= new ListNode(-1,-1);
        this.tail=new ListNode(-1,-1);
        head.next=tail;
        tail.prev=head;
    }
    
    public int get(int key) {
        if(!map.containsKey(key)){
            return -1;
        }
            ListNode temp=map.get(key);
            delete(temp);
            insertAfterHead(temp);
        return temp.val;
    }
    
    public void put(int key, int value) {
        if(map.containsKey(key)){
            ListNode temp=map.get(key);
            temp.val=value;
            delete(temp);
            insertAfterHead(temp);
        }else{
            if(capacity == map.size()){
                ListNode lru=tail.prev;
                delete(lru);
                map.remove(lru.key);
            }
                ListNode newNode=new ListNode(key,value);
                insertAfterHead(newNode);
                map.put(key,newNode);
        }
    }

    public void delete(ListNode temp){
        temp.prev.next=temp.next;
        temp.next.prev=temp.prev;
    }

    public void insertAfterHead(ListNode temp){
        temp.next=head.next;
        temp.next.prev=temp;
        head.next=temp;
        temp.prev=head;
    }
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */