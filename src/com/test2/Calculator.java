package com.test2;

import java.util.Stack;

/**
 *  结合了Context类，并且为客户端提供了统一调用接口
 *  这个类是我们的解释器核心
 */
public class Calculator {
	private Node node;
	private String statement;
	/**
	 *  build方法，解释了我们的计算公式，将解释的结果存入stack，也就是我们的环境类，最终从stack中取出，转化成我们的node类，然后执行我们的interupte方进行计算。
	 */
	public void build(String statement){
		//结合了我们的非终结解释器
		Node left =null;
		Node right =null;
		Stack stack = new Stack(); //提供环境，存储一些关系
		//我们最重要将我们的node存储到 stack中。存储之前，我们已经确定了表达式的顺序，解释完成的结果。
		String[] statementArr = statement.split(" ");
		for (int i = 0; i < statementArr.length; i++) {
			if (statementArr[i].equalsIgnoreCase("*")) {
				left = (Node)stack.pop();//pop这个方法，显示栈顶元素并且移除栈顶元素
				int val = Integer.parseInt(statementArr[++i]);
				right = new ValueNode(val);
				stack.push(new MulNode(left, right));//mutinode代表乘号，left与right代表2 和 3
			}
			else if (statementArr[i].equalsIgnoreCase("/")) {
				left = (Node)stack.pop();
				int val = Integer.parseInt(statementArr[++i]);
				right = new ValueNode(val);
				stack.push(new DivNode(left, right));//mutinode代表/，left与right代表2 和 3
			}
			else if (statementArr[i].equalsIgnoreCase("%")) {
				left = (Node)stack.pop();
				int val = Integer.parseInt(statementArr[++i]);
				right = new ValueNode(val);
				stack.push(new ModNode(left, right));//mutinode代表%，left与right代表2 和 3
			}
			else{
				stack.push(new ValueNode(Integer.parseInt(statementArr[i]))); //传入的数字
			}
		}
		this.node = (Node) stack.pop(); //这个node包含了所有的数字以及所有的符号
	}
	public int compute(){
		return node.interpret();
	}
}
