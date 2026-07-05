package datastructures;

public class diameter {

    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    static class BinaryTree {
        static int index = -1;

        public static Node buildTree(int nodes[]) {
            index++;

            if (nodes[index] == -1) {
                return null;
            }

            Node newNode = new Node(nodes[index]);

            newNode.left = buildTree(nodes);
            newNode.right = buildTree(nodes);

            return newNode;
        }
    }
        public static int height(Node root){
        if(root == null){
            return 0;
        }
        int leftheight = height(root.left);
        int rightheight = height(root.right);
        int myheight = Math.max(leftheight , rightheight) + 1 ;
        return myheight;

    }
     
    //O(n^2)
    public static int Diameter(Node root){
        if(root == null){
            return 0;
        }
        int diam1 = Diameter(root.left);
        int diam2 = Diameter(root.right);
        int diam3 = height(root.left) + height(root.right) + 1;

        return Math.max(diam3 , Math.max(diam1 , diam2));

    }
     // 2nd method of diameter by O(n)
     static class TreeInfo{
        int heigt;
        int diam;

        TreeInfo(int heigt, int diam){
            this.heigt = heigt;
            this.diam = diam;
        }
     }
     public static TreeInfo diameter2(Node root){
        if(root == null){
          return new TreeInfo(0,0);
        }

        TreeInfo left = diameter2(root.left);
        TreeInfo right = diameter2(root.right);

        int Myheight = Math.max(left.heigt , right.heigt) + 1;
        int diam1 = left.diam;
        int diam2 = right.diam;
        int diam3 = left.heigt + right.heigt + 1;

        int MyDiam = Math.max(Math.max(diam1 , diam2) , diam3);

        TreeInfo myInfo = new TreeInfo(Myheight , MyDiam);
        return myInfo;
     }

    public static void main(String[] args) {

        int nodes[] = {
            1, 2, 4, -1, -1, 5, -1, -1,
            3, -1, 6, -1, -1
        };

        Node root = BinaryTree.buildTree(nodes);
      //  System.out.println(Diameter(root));
              System.out.println(diameter2(root).diam);



    }
} 
    

