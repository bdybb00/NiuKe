package com.company;


import java.util.Scanner;

public class AnQIXinTest2 {
    static class Node{
        int val;
        Node left;
        Node right;
        Node(int x){val=x;}
    }
    public static Node commenNode(Node root,Node p,Node q){

        if (root==null||p==root||q==root)
            return root;
        Node left=commenNode(root.left,p,q);
        Node right=commenNode(root.right,p,q);
        if(left!=null&&right!=null){
            return root;
        }
        return left==null?right:left;
    }
    private static Node createTree(int []array,int index)
    {
        Node tn = null;
        if (index<array.length) {
            Integer value = array[index];
            if (value == -1) {
                return null;
            }
            tn = new Node(value);
            tn.left = createTree(array, 2*index+1);
            tn.right = createTree(array, 2*index+2);
        }
        return tn;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int level=sc.nextInt();
        int count=(int)(Math.pow(2,level))-1;
        int arr[]=new int[count];
        for(int i=0;i<count;i++){
            arr[i]=sc.nextInt();
        }

        int a1=sc.nextInt();
        int a2=sc.nextInt();
        Node p=new Node(a1);
        Node q=new Node(a2);

        Node node=createTree(arr,0);
        Node result=commenNode(node, p, q);
        System.out.print(result.val);
    }

}
