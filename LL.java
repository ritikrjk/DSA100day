
class Node{
    
    int data;
    Node next;
    
    
  Node(int data){
     this.data= data;
     this.next= null;
  }
}

class LL{
    
    Node head;
    
    LL(){
        head = null;
    }
    
    void insertNode(int data){
        Node newNode= new Node(data);
        
        if (head==null){
            head= newNode;
            return;
        }
        
        Node last= head;
        while(last.next!= null){
            last= last.next;
        }
        last.next= newNode;
    }
    
    void displayNode(){
        Node currentNode = head;
        
        if (currentNode==null){
            System.out.println("Current list is Empty");
        } 
        
        while(currentNode!= null){
            System.out.print(currentNode.data+"->");
            currentNode= currentNode.next;
        }
        System.out.println("null");
    }
    
    public static void main (String[] args) {
        LL list= new LL();
        
        list.insertNode(10);
        list.insertNode(20);
        list.displayNode();
    }
}