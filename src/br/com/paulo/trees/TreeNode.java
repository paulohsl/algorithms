package br.com.paulo.trees;

/**
 * Created by paulohsl on 7/9/16.
 */
public class TreeNode {
    TreeNode left,right;
    int data;

    TreeNode(int data){
        this.data = data;
        left=right=null;
        boolean visited = true;
    }

}
