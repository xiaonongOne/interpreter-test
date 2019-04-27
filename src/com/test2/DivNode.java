package com.test2;

public class DivNode extends SymbolNode{

	public DivNode(Node left, Node right) {
		super(left, right);
	}

	@Override
	public int interpret() {
		return left.interpret() / right.interpret();
	}
}
