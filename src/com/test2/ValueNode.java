package com.test2;

//终结解释器。 就是为了返回最终的值。这个node都能够代表数学表达式中数字部分的展现。
public class ValueNode implements Node{

	private int value;

	public ValueNode( int value) {
		this.value = value;
	}

	@Override
	public int interpret() {
		return this.value;
	}

}

