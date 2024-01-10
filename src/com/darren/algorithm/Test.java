package src.com.darren.algorithm;

public class Test {
    public static void main(String[] args){
        //1.生成链表节点
        TreeNode node = null;
        for (int i = 0; i < 10; i++) {
             node = new TreeNode(i);
        }
        //2.关联节点，使形成链表
        for (int i = 0; i < 10; i++) {
            if(i * 2 + 1 < 10) {
                node[i].left = node[i * 2 + 1];
            }

            if(i * 2 + 2 < 10) {
                node[i].right = node[i * 2 + 2]
            }
    
        }

        //递归遍历
        preOrderRe(node[0]);


    }

    public static void preOrderRe(TreeNode biTree){
        System.out.println(biTree.value);

        TreeNode leftNode = biTree.left;
        if(leftNode != null){
            preOrderRe(leftNode);
        }

        TreeNode rightNode = biTree.right;
        if(rightNode != null){
            preOrderRe(rightNode);
        }

    }
    
    class TreeNode{
        int value;
        TreeNode left;
        TreeNode right;

        TreeNode(int value){
            this.value = value;
        }
    }
}