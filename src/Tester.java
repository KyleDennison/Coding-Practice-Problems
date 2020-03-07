import java.util.ArrayList;
import java.util.Arrays;

public class Tester {



 public static void main(String[] args){

     MergeTwoSortedLists m = new MergeTwoSortedLists();
     MergeTwoSortedLists.ListNode n1 = new MergeTwoSortedLists.ListNode(2);
     n1.next = new MergeTwoSortedLists.ListNode(4);
     MergeTwoSortedLists.ListNode n2 = new MergeTwoSortedLists.ListNode(3);
     n2.next = new MergeTwoSortedLists.ListNode(5);
     MergeTwoSortedLists.ListNode answer = m.mergeTwoLists(n1, n2);
     MergeTwoSortedLists.ListNode next = answer;
     while(next != null){
         System.out.println(next.val);
         next = next.next; 
     }


 }


}
