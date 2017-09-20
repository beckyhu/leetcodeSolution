package medium;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

import dataStructure.Interval;
import dataStructure.ListNode;

public class MListSolution {
	/**
	 * 19. Remove Nth Node From End of List   
	 * @param head
	 * @param n
	 * @return
	 */
	public ListNode removeNthFromEnd(ListNode head, int n) {
		ListNode dummy = new ListNode(0);
        dummy.next = head;
        
        ListNode preDelete = dummy;
        for (int i = 0; i < n; i++) {
            if (head == null) {
                return null;
            }
            head = head.next;
        }
        while (head != null) {
            head = head.next;
            preDelete = preDelete.next;
        }
        preDelete.next = preDelete.next.next;
        return dummy.next;
    }
	/**
	 * 56. Merge Intervals
	 * @param intervals
	 * @return
	 */
	public List<Interval> merge(List<Interval> intervals) {
        if(intervals == null || intervals.size() <= 1){
            return intervals;
        }
        List<Interval> result = new LinkedList<Interval>();
        Collections.sort(intervals, new Comparator<Interval>(){
            public int compare(Interval i1, Interval i2) {
                return i1.start - i2.start;
            }
        });
        Interval last = intervals.get(0);
        for(int i=1; i<intervals.size(); i++){
            Interval cur = intervals.get(i);
            if(cur.start <= last.end){
                last.end = Math.max(cur.end, last.end);
            }else{
                result.add(last);
                last = cur;
            }
        }
        result.add(last);
        return result;
    }
}
