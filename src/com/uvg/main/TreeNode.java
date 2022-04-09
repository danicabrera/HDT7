/**
 * 
 */
package com.uvg.main;

/**
 * @author MAAG
 *
 */
public class TreeNode<K, V> {

	private V esp;
	private K ext;
	private Association<K, V> associate = new Association<K, V>(ext, esp);
	private TreeNode<K, V> left;
	private TreeNode<K, V> right;
	private TreeNode<K, V> parent;
	
	public TreeNode(K id, V value) {
		associate.setEsp(value);
		associate.setExt(id);
		setLeft(null);
		setRight(null);
		setParent(null);
	}
	
	/**
	 * @return the value
	 */
	public V getValue() {
		return associate.getEsp();
	}
	/**
	 * @param value the value to set
	 */
	public void setValue(V value) {
		associate.setEsp(value);
	}
	/**
	 * @return the id
	 */
	public K getId() {
		return associate.getExt();
	}
	/**
	 * @param id the id to set
	 */
	public void setId(K id) {
		associate.setExt(id);
	}
	/**
	 * @return the left
	 */
	public TreeNode<K, V> getLeft() {
		return left;
	}
	/**
	 * @param left the left to set
	 */
	public void setLeft(TreeNode<K, V> left) {
		this.left = left;
	}
	/**
	 * @return the right
	 */
	public TreeNode<K, V> getRight() {
		return right;
	}
	/**
	 * @param right the right to set
	 */
	public void setRight(TreeNode<K, V> right) {
		this.right = right;
	}
	/**
	 * @return the parent
	 */
	public TreeNode<K, V> getParent() {
		return parent;
	}
	/**
	 * @param parent the parent to set
	 */
	public void setParent(TreeNode<K, V> parent) {
		this.parent = parent;
	}
	
	
}
