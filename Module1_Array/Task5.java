class Node{
    int data;
    Node next;
    //constructor
    Node(int S){
        data=S;
        next=null;
    }
    //getdata
    public void getdata(){
        System.out.println(data);}
}
class Main {
    public static void main(String[] args) {
        System.out.println("SIRI");
        Node S=new Node(4);
        Node p=new Node(9);
        
        System.out.println(S);
        S.getdata();
        p.getdata();
    
        
    }
}
