public class ListCycle {
    public boolean hasCycle(ListNode head) {
        if(head == null){
            return false;
        }
        
        ListNode visted = head;
        ListNode current = head.getNext();


        while(current != visted){
            if(current == null || current.getNext() == null){
                return false;
            }
            current = current.getNext().getNext();
            visted = visted.getNext();
        }
        return true;

    }
}
