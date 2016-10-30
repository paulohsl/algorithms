package br.com.paulo.trees;

import java.util.ArrayDeque;
import java.util.Queue;

/**
 * Created by paulohsl on 7/9/16.
 */
public class BreadthFirstSearch {

    public static void main(String[] args) {

        int[] arrNum = {4,2,1,3,6,5,7};

        TreeNode root = null;


        for (int i = 0; i < arrNum.length; i++) {
            root = insert(root, arrNum[i]);
        }

        //levelOrder(root);

        inOrderTraversal(root);

    }


    static TreeNode insert(TreeNode root, int data) {
        if (root == null) {
            return new TreeNode(data);
        } else {
            TreeNode cur;
            if (data < root.data) {
                cur = insert(root.left, data);
                root.left = cur;
            } else {
                cur = insert(root.right, data);
                root.right = cur;
            }
            return root;
        }

    }


    static void levelOrder(TreeNode root) {
        Queue<TreeNode> queue = new ArrayDeque<>();

        if (root != null) {
            queue.add(root);
        }

        while (!queue.isEmpty()) {

            TreeNode node = queue.remove();
            System.out.println(node.data);

            if (node.left != null) {
                queue.add(node.left);
            }

            if (node.right != null) {
                queue.add(node.right);
            }

        }
    }

    static void visit(TreeNode node){
        if(node != null){
            System.out.println(node.data);
        }
    }

    static void inOrderTraversal(TreeNode node){
        if(node != null){
            inOrderTraversal(node.left);
            visit(node);
            inOrderTraversal(node.right);
        }
    }

    static void preOrderTraversal(TreeNode node){
        if(node != null){

        }

    }

    static void postOrderTraversal(TreeNode node){
        if(node != null){

        }

    }


}