package com.raywenderlich.fp;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 2, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u001f\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u0002H\u0002\u00a2\u0006\u0002\u0010\u0004\u001a<\u0010\u0005\u001a\b\u0012\u0004\u0012\u0002H\u00060\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0006*\b\u0012\u0004\u0012\u0002H\u00020\u00012\u0018\u0010\u0007\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00060\b0\u0001\u001a?\u0010\t\u001a\b\u0012\u0004\u0012\u0002H\u00060\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0006*\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00060\b0\u00012\f\u0010\n\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001H\u0086\u0004\u001a6\u0010\u000b\u001a\b\u0012\u0004\u0012\u0002H\u00060\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0006*\b\u0012\u0004\u0012\u0002H\u00020\u00012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00060\b\u00a8\u0006\f"}, d2 = {"just", "Lcom/raywenderlich/fp/RwMaybe;", "A", "value", "(Ljava/lang/Object;)Lcom/raywenderlich/fp/RwMaybe;", "ap", "B", "fn", "Lkotlin/Function1;", "appl", "a", "map", "data-types"})
public final class RwMaybeKt {
    
    @org.jetbrains.annotations.NotNull()
    public static final <A extends java.lang.Object, B extends java.lang.Object>com.raywenderlich.fp.RwMaybe<B> map(@org.jetbrains.annotations.NotNull()
    com.raywenderlich.fp.RwMaybe<? extends A> $this$map, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super A, ? extends B> fn) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final <A extends java.lang.Object>com.raywenderlich.fp.RwMaybe<A> just(A value) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final <A extends java.lang.Object, B extends java.lang.Object>com.raywenderlich.fp.RwMaybe<B> ap(@org.jetbrains.annotations.NotNull()
    com.raywenderlich.fp.RwMaybe<? extends A> $this$ap, @org.jetbrains.annotations.NotNull()
    com.raywenderlich.fp.RwMaybe<? extends kotlin.jvm.functions.Function1<? super A, ? extends B>> fn) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final <A extends java.lang.Object, B extends java.lang.Object>com.raywenderlich.fp.RwMaybe<B> appl(@org.jetbrains.annotations.NotNull()
    com.raywenderlich.fp.RwMaybe<? extends kotlin.jvm.functions.Function1<? super A, ? extends B>> $this$appl, @org.jetbrains.annotations.NotNull()
    com.raywenderlich.fp.RwMaybe<? extends A> a) {
        return null;
    }
}