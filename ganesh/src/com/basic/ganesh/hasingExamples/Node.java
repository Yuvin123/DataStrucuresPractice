package com.basic.ganesh.hasingExamples;

public class Node
{
    public int data;
    public Node left, right;
 
    public Node(int item)
    {
        data = item;
        left = right = null;
    }
    
    public void setLeft(Node left) 
    {
        this.left = left;
    }
  
    public void setRight(Node right) 
    {
        this.right = right;
    }
    
    
    public boolean isLeaf()
    {
       return (left==null && right==null);
    }
}
