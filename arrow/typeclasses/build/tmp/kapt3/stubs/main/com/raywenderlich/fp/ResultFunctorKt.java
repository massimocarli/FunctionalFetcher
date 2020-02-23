package com.raywenderlich.fp;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 2, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\u001ab\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u0001\"\u0004\b\u0000\u0010\u0004\"\u0004\b\u0001\u0010\u0002\"\u0004\b\u0002\u0010\u0005\"\u0004\b\u0003\u0010\u0003*\u000e\u0012\u0004\u0012\u0002H\u0004\u0012\u0004\u0012\u0002H\u00050\u00012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u0002H\u0004\u0012\u0004\u0012\u0002H\u00020\u00072\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u0002H\u0005\u0012\u0004\u0012\u0002H\u00030\u0007\u001aH\u0010\t\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00050\u0001\"\u0004\b\u0000\u0010\u0004\"\u0004\b\u0001\u0010\u0002\"\u0004\b\u0002\u0010\u0005*\u000e\u0012\u0004\u0012\u0002H\u0004\u0012\u0004\u0012\u0002H\u00050\u00012\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u0002H\u0004\u0012\u0004\u0012\u0002H\u00020\u0007\u001aH\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u0002H\f\u0012\u0004\u0012\u0002H\u00030\u0001\"\u0004\b\u0000\u0010\f\"\u0004\b\u0001\u0010\u0005\"\u0004\b\u0002\u0010\u0003*\u000e\u0012\u0004\u0012\u0002H\f\u0012\u0004\u0012\u0002H\u00050\u00012\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u0002H\u0005\u0012\u0004\u0012\u0002H\u00030\u0007\u00a8\u0006\r"}, d2 = {"map", "Lcom/raywenderlich/fp/Result;", "E2", "R", "E1", "T", "fe", "Lkotlin/Function1;", "fs", "mapLeft", "fn", "mapRight", "E", "typeclasses"})
public final class ResultFunctorKt {
    
    /**
     * Functor implementation on the Error
     */
    @org.jetbrains.annotations.NotNull()
    public static final <E1 extends java.lang.Object, E2 extends java.lang.Object, T extends java.lang.Object>com.raywenderlich.fp.Result<E2, T> mapLeft(@org.jetbrains.annotations.NotNull()
    com.raywenderlich.fp.Result<? extends E1, ? extends T> $this$mapLeft, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super E1, ? extends E2> fn) {
        return null;
    }
    
    /**
     * Functor implementation on the Success
     */
    @org.jetbrains.annotations.NotNull()
    public static final <E extends java.lang.Object, T extends java.lang.Object, R extends java.lang.Object>com.raywenderlich.fp.Result<E, R> mapRight(@org.jetbrains.annotations.NotNull()
    com.raywenderlich.fp.Result<? extends E, ? extends T> $this$mapRight, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super T, ? extends R> fn) {
        return null;
    }
    
    /**
     * Overload for the BiFunctor
     */
    @org.jetbrains.annotations.NotNull()
    public static final <E1 extends java.lang.Object, E2 extends java.lang.Object, T extends java.lang.Object, R extends java.lang.Object>com.raywenderlich.fp.Result<E2, R> map(@org.jetbrains.annotations.NotNull()
    com.raywenderlich.fp.Result<? extends E1, ? extends T> $this$map, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super E1, ? extends E2> fe, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super T, ? extends R> fs) {
        return null;
    }
}