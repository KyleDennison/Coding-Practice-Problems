public class MergeTwoSortedLists {

   // Merge two sorted linked lists and return it as a new list. The new list should be made by splicing together
    // the nodes of the first two lists.

    public static class ListNode{
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }

    public MergeTwoSortedLists(){}



    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        boolean stop = true;
        ListNode answer = new ListNode(0);
        ListNode answer2;
        answer2 = answer;
        ListNode one = l1;
        ListNode two = l2;
        while(stop){
            if(one != null && two != null){
                if(one.val <= two.val){
                    answer.val = one.val;
                    one = one.next;
                }
                else{
                    answer.val = two.val;
                    two = two.next;
                }
                answer.next = new ListNode(0);
                answer = answer.next;
                if(one == null){
                    while(two != null){
                        answer.val = two.val;
                        two = two.next;
                        if(two != null){
                            answer.next = new ListNode(0);
                            answer = answer.next;
                        }
                    }
                    stop = false;
                }
                if(two == null){
                    while(one != null){
                        answer.val = one.val;
                        one = one.next;
                        if(one != null){
                            answer.next = new ListNode(0);
                            answer = answer.next;
                        }
                    }
                    stop = false;
                }
            }



            else{
                if(one == null && two == null){
                    stop = false;
                    return null ;
                }
                else{
                    if(one == null){
                        while(two != null){
                            answer.val = two.val;
                            two = two.next;
                            if(two != null){
                                answer.next = new ListNode(0);
                                answer = answer.next;
                            }
                        }
                        stop = false;
                    }
                    if(two == null){
                        while(one != null){
                            answer.val = one.val;
                            one = one.next;
                            if(one != null){
                                answer.next = new ListNode(0);
                                answer = answer.next;
                            }

                        }
                        stop = false;
                    }
                }

            }
        }
        return answer2;
    }


}
