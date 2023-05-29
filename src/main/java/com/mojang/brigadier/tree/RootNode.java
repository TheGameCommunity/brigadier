package com.mojang.brigadier.tree;

public interface RootNode<S, N extends CommandNode<S> & RootNode<S, N>> {}