package com.company;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class WuBa {
    class Node{
        int val;
        Node left;
        Node right;
        public Node(int val){
            this.val = val;
        }
    }

    private Node createBinaryTreeByArray(Integer[] array,int index)
    {
        Node tn = null;
        if (index<array.length) {
            Integer value = array[index];
            if (value == null) {
                return null;
            }
            tn = new Node(value);
            tn.left = createBinaryTreeByArray(array, 2*index+1);
            tn.right = createBinaryTreeByArray(array, 2*index+2);
            return tn;
        }
        return tn;
    }

    public int levelOrder(Node root){
        //请您完成此方法
        if(root==null)
            return 0;
        LinkedList <Node>queue=new LinkedList();
        queue.add(root);
        int level=1;//记录本层节点
        int count=0;
        int next=0; //记录下层节点数
        int average=0;
        int sum=0;
        while(queue.size()>0){
            Node node=queue.poll();
            count++;
            sum+=node.val;
            if(count==level){
                count=0;
                sum/=level;
                if(sum>average){
                    average=sum;
                }
                sum=0;
                level=next;
            }
            if(node.left!=null){
                queue.add(root.left);
                next++;
            }
            if(node.right!=null){
                queue.add(root.right);
                next++;
            }
        }
        return average;
    }


    public  Node createTree(int[] array){
        List<Node> nodeList=new LinkedList<Node>();

        for(int nodeIndex=0;nodeIndex<array.length;nodeIndex++){
            nodeList.add(new Node(array[nodeIndex]));
        }
        for(int parentIndex=0;parentIndex<=array.length/2-1;parentIndex++){
            nodeList.get(parentIndex).left =nodeList.get(parentIndex*2+1);
            //防止是非完全二叉树
            if((parentIndex*2+2)<array.length) {
                nodeList.get(parentIndex).right = nodeList.get(parentIndex * 2 + 2);
            }
        }
        return nodeList.get(0);
    }


    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        //int [] array = new int [n];
        Integer [] array = new Integer[n];
        for(int i = 0;i < n;i++){
            String value =scanner.next();
            if(value.equals( "null" )){
                array[i]=null;
            }else{
                array[i] = Integer.valueOf( value );
            }

        }
        WuBa solution = new WuBa ();
        Node root =solution.createBinaryTreeByArray(array,0);
        int level = solution.levelOrder( root );
        System.out.println(level);

    }
}