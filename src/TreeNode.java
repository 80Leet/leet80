import java.util.*;

public class TreeNode {
    private int val;
    private TreeNode left, right;

    public TreeNode(int val){
        this.val = val;
        this.left = null;
        this.right = null;
    }

    public static void recPreorder(TreeNode root){
        if (root == null)
            return;
        System.out.print(root.val + ". ");
        recPreorder(root.left);
        recPreorder(root.right);
    }

    public static void iterPreorder(TreeNode root){
        if (root == null)
            return;
        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);

        while (!stack.isEmpty()){
            TreeNode cur = stack.peek();
            System.out.print(stack.pop().val + ". ");
            if (cur.right != null)
                stack.push(cur.right);
            if (cur.left != null)
                stack.push(cur.left);
        }
    }

    public static void recInorder(TreeNode root){
        if (root == null)
            return;
        recInorder(root.left);
        System.out.print(root.val + ". ");
        recInorder(root.right);
    }

    public static void iterInorder(TreeNode root){
        Stack<TreeNode> stack = new Stack<>();
        TreeNode cur = root;

        while(!stack.isEmpty() || cur != null){
            if (cur != null){
                stack.push(cur);
                cur = cur.left;
            }
            else{
                TreeNode node = stack.pop();
                System.out.print(node.val + ". ");
                cur = node.right;
            }
        }
    }

    public static void recPostorder(TreeNode root){
        if (root == null)
            return;
        recPostorder(root.left);
        recPostorder(root.right);
        System.out.print(root.val + ". ");
    }

    public static void iterPostorder(TreeNode root){
        Stack<TreeNode> stack = new Stack<>();
        TreeNode cur = root;
        TreeNode lastVisited = null;

        while (!stack.isEmpty() || cur != null) {
            if (cur != null) {
                stack.push(cur);
                cur = cur.left;
            }
            else {
                TreeNode peekNode = stack.peek();
                if (peekNode.right != null && lastVisited != peekNode.right){
                    cur = peekNode.right;
                }
                else {
                    System.out.print(peekNode.val + ". ");
                    lastVisited = stack.pop();
                }
            }
        }
    }

    public static void bfsTree(TreeNode root) {
        if (root == null)
            return;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            TreeNode cur = queue.poll();
            System.out.print(cur.val + ". ");
            if (cur.left != null)
                queue.add(cur.left);
            if (cur.right != null)
                queue.add(cur.right);
        }
        return;
    }


    public static void main(String[] args) {
        TreeNode a = new TreeNode(1);
        TreeNode b = new TreeNode(2);
        TreeNode c = new TreeNode(3);
        TreeNode d = new TreeNode(4);
        TreeNode e = new TreeNode(5);
        TreeNode f = new TreeNode(6);
        TreeNode g = new TreeNode(7);
        TreeNode h = new TreeNode(8);
        TreeNode i = new TreeNode(9);
        a.left = b;
        a.right = c;
        b.left = d;
        b.right = e;
        c.left = f;
        c.right = g;
        d.left = h;
        d.right = i;

        recPreorder(a);

    }

}
