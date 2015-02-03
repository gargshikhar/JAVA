import java.util.*;

public class Reverse {
  public static void main(String[] args){
  	Node tail = new Node(6,null);                       // Creates the input linked list
  	Node A = new Node(5,tail);
  	Node B = new Node(4,A);
  	Node C = new Node(3,B);
  	Node D = new Node(2,C);
  	Node E = new Node(1,D);
  	Node F = ReverseLinked(E);
  	//System.out.println(F.data);                              These statements are just to check whether the linked 
  	//System.out.println(F.next.data);                         list reverses or not
  	//System.out.println(F.next.next.data);
  	//System.out.println(F.next.next.next.data);
  	//System.out.println(F.next.next.next.next.data);
  	//System.out.println(F.next.next.next.next.next.data);
  }

  public static Node ReverseLinked(Node root){

  	if(root == null){
  		return root;
  	}
  	Node ptr = root.next ;
  	Node head = root;
  	Node preptr = root;
  	Node temp = null;
  
  	while(ptr != null){
    	temp = ptr;
    	preptr.next = ptr.next;
    	ptr = ptr.next;
    	temp.next = head;
    	head = temp;	
    		}
    return head;
	}
}
