/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class LinkListMiddle {
 public ListNode middleNode(ListNode head) {
  // if(head == null){
  //     return head;
  // }
  ListNode temp = head;
  int size = 0;
  while (temp != null) {
   size++;
   temp = temp.next;
  }

  int mid = 0;
  if (size % 2 == 0) {
   mid = size / 2 + 1;
  } else {
   mid = size / 2 + 1;
  }
  int index = 1;

  while (index < mid) {
   head = head.next;
   index++;
  }

  return head;

 }
}
