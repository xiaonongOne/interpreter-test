package com.test2;
//非终结解释器，他需要关联我们的node，
public abstract class SymbolNode implements Node{

	//分为左node和右node。比如 2*3.2在左边，3在右边。2和3同
	//时输入乘法的node。
	Node left;
	Node right;

	public SymbolNode(Node left,Node right) {
		this.left = left;
		this.right = right;
	}
}