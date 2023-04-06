class TreeNode
{
	TreeNode left, right;
	int info;

	public TreeNode()
	{
		info = 0;
		left = right = null;
	}

	public TreeNode(int val)
	{
		info = val;
		left = right = null;
	}

	public void setLeft(TreeNode n)
	{
		left = n;
	}

	public void setRight(TreeNode n)
	{
		right = n;
	}

	public void setInfo(int n)
	{
		info = n;
	}

	public TreeNode getLeft()
	{
		return left;
	}

	public TreeNode getRight()
	{
		return right;
	}

	public int getInfo()
	{
		return info;
	}
}
