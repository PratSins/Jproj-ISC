class BinTree
{
    private TreeNode root;

    public BinTree()
    {
        root = null;
    }

    void add(int val)
    {
        root = insertRec(root, val);
    }

    private TreeNode insertRec(TreeNode node, int val)
    {
        if (node == null)
            node=new TreeNode(val);
        else if (val <= node.info)
                node.left = insertRec(node.left, val);
            else
                node.right = insertRec(node.right, val);
        return node;
    }

    void dele(int val)
    {
        root = deleteRec(root, val);
    }

    private int findMinValue(TreeNode root)
    {
        return root.left == null ? root.info : findMinValue(root.left);
    }

    TreeNode deleteRec(TreeNode current, int value)
    {
        if (current == null)
            return null;

        if (value == current.info)
        {
            // No Children
            if (current.left == null && current.right == null)
            {
                return null;
            }

            //One Child
            if (current.right == null) {
                return current.left;
            }
            if (current.left == null) {
                return current.right;
            }

            //Two Children
            int MinVal = findMinValue(current.right);
            current.info = MinVal;
            current.right = deleteRec(current.right, MinVal);
            return current;
        }

        if (value < current.info)
        {
            current.left = deleteRec(current.left, value);
            return current;
        }

        current.right = deleteRec(current.right, value);
        return current;
    }

    void modify(int valtochange, int newvalue)
    {
        root = modifyRecur(root, valtochange, newvalue);
    }

    TreeNode modifyRecur(TreeNode node, int oldval, int newval)
    {
        if ((node == null) || (node.info == oldval))
        {
            node.info = newval;
            return node;
        }

        if (node.info > oldval)
            return modifyRecur(node.left, oldval, newval);

        return modifyRecur(node.right, oldval, newval);
    }

    void inorder()
    {
        inorder(root);
    }

    void preorder()
    {
        preorder(root);
    }

    void postorder()
    {
        postorder(root);
    }

    void inorder(TreeNode node)
    {
        if (node != null)
        {
            inorder(node.left);
            System.out.print(node.info + ", ");
            inorder(node.right);
        }
    }

    void preorder(TreeNode node)
    {
        if (node != null)
        {
            System.out.print(node.info + ", ");
            preorder(node.left);
            preorder(node.right);
        }
    }

    void postorder(TreeNode node)
    {
        if (node != null)
        {
            postorder(node.left);
            postorder(node.right);
            System.out.print(node.info + ", ");
        }
    }
}
