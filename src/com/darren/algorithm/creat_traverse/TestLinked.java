package src.com.darren.algorithm.creat_traverse;

public class TestLinked {
    public static void main(String[] args) {  
        MyNode root = new MyNode("头节点");
        Node node1 = new Node("子节点1");
        Node node2 = new Node("子节点2");

        root.setNext(node1);
        node1.setNext(node2);
        getDataByLoop(root);
        
    }  

    public static void getDataByLoop(Node node){
        while(node != null) {
            System.out.print(node.data);
            node = node.getNext();
        }
    }

    class MyNode{
        static String data = null;
        static MyNode next = null;
    
        public MyNode (String data){
            this.data = data;
        }
    
        public void setNext(MyNode next){
            this.next = next;
    
        }
    
        public MyNode getNext(){
            return next;
        }
    
        public String getData(){
            return data;
        }
    }
}  