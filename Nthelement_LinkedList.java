
public class GetNth {
  public static void main(String args[]){
  	Node tail = new Node(1,null);
  	Node A = new Node(2,tail);
  	Node B = new Node(3,A);
  	Node C = new Node(4,B);
  	Node D = new Node(5,C);
  	Node E = new Node(6,D);
  	getNth(E,4);
  }
  public static void getNth(Node root,int value){
  	int count=0;
  	Node head = root;
  	while(head!=null){
  		 count++;
  		 head=head.next;
  	}
  	
  	if (value > count){
  		System.out.println("You are trying to access an element outside the list");
  	}else{
  		  for(int i=0;i<value;i++){
  			root=root.next;
  		}
  	System.out.println("The element at " + value + "th position is " +root.data);
  		}
  	}
}
