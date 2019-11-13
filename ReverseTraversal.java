import java.util.*;
class Node 
{
	int data;
	Node left;
	Node right;
	public Node(int data) 
	{
		this.data = data;
	}
}
public class ReverseTraversal
{
	public void reverseBFS(Node root) 
	{
		Queue<Node> que = new LinkedList<Node>();
		Stack<Node> st = new Stack<Node>();
		que.add(root);
		while (!que.isEmpty()) 
		{
			Node n = que.remove();
			if (n.left != null) 
			{
				que.add(n.left);
			}
			if (n.right != null) 
			{
				que.add(n.right);
			}
			st.add(n);
		}
		while (st.isEmpty() == false) 
		{
			System.out.print(st.pop().data + " ");
		}
	}
	public static void main(String[] args) 
	{
		Node root = new Node(1);
		root.left = new Node(2);
		root.right = new Node(3);
		root.left.left = new Node(4);
		root.left.right = new Node(5);
		root.right.left = new Node(6);
		root.right.right = new Node(7);
		ReverseTraversal j = new ReverseTraversal();
		j.reverseBFS(root);
	}
}