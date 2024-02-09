class Solution
{
    //Function to check whether all nodes of a tree have the value 
    //equal to the sum of their child nodes.
    public static int isSumProperty(Node root)
    {
        // add your code here
        // Base case: If the tree is empty or it's a leaf node,
        // then it satisfies the property.
        if (root == null || (root.left == null && root.right == null))
            return 1;
        
        int left_data = 0, right_data = 0;
        
        // If left child is not null, then get its data
        if (root.left != null)
            left_data = root.left.data;
        
        // If right child is not null, then get its data
        if (root.right != null)
            right_data = root.right.data;
        
        // Check current node's value with the sum of left and right children
        // And recursively check for left and right subtrees
        if ((root.data == left_data + right_data) 
            && (isSumProperty(root.left) != 0) 
            && (isSumProperty(root.right) != 0))
            return 1;
        else
            return 0;
    }
}
