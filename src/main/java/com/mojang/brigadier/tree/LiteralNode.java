package com.mojang.brigadier.tree;

public interface LiteralNode<S, N extends CommandNode<S> & LiteralNode<S, N>> {

	public String getLiteral();
	
	public default String getName() {
		return getLiteral();
	}
	
	public default N getThis() {
		return (N) this;
	}
	
}
