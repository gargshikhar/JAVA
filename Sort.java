import java.util.*;
public class Insert {
	public static void main(String[] args){
		Node tail = new Node(0,null);
		Node A = new Node(356,tail);
		Node B = new Node(67,A);
		Node C = new Node(4,B);
		Node D = new Node(456,C);
		System.out.println(SortList(D).data);
		System.out.println(SortList(D).next.data);
		System.out.println(SortList(D).next.next.data);
		System.out.println(SortList(D).next.next.next.data);
		System.out.println(SortList(D).next.next.next.next.data);
		
	}
	public static Node SortList(Node root){
		int swap;
		Node head = root;
		Node ptr = root;
		Node preptr = root;
		if(head == null){
			return head;
		}
		ptr = ptr.next;
		 while(preptr.next != null){
				while(ptr != null){
					if(ptr.data > preptr.data){
						ptr = ptr.next;
					}
					else if (ptr.data <= preptr.data){
						swap = ptr.data;
						ptr.data = preptr.data;
						preptr.data = swap;
						if(ptr.next != null){
							ptr = ptr.next;
						}
					}
				}
				preptr = preptr.next;
				ptr=preptr.next;
			}
	return head;	
	}
