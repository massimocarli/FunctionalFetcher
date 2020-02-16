package com.raywenderlich.fp.rweither.bifunctor;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 2, d1 = {"\u00004\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a \u0010\u0006\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u0002H\n0\b0\u0007\"\u0004\b\u0000\u0010\nH\u0007\u001a\u0084\u0001\u0010\u000b\u001a>\u0012\u001c\u0012\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u0002H\u000e0\r\u0012\u0004\u0012\u0002H\u000f0\r\u0012\u001c\u0012\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u0002H\u00100\r\u0012\u0004\u0012\u0002H\u00110\r0\f\"\u0004\b\u0000\u0010\u000e\"\u0004\b\u0001\u0010\u000f\"\u0004\b\u0002\u0010\u0010\"\u0004\b\u0003\u0010\u00112\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u0002H\u000e\u0012\u0004\u0012\u0002H\u00100\f2\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u0002H\u000f\u0012\u0004\u0012\u0002H\u00110\fH\u0007\u001a \u0010\u0014\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u0002H\n0\r0\u0007\"\u0004\b\u0000\u0010\nH\u0007\u001a\r\u0010\u0015\u001a\u00020\u0001*\u00020\u0016H\u0086\b\u001ap\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u0002H\u0010\u0012\u0004\u0012\u0002H\u00110\u0018\"\u0004\b\u0000\u0010\u000e\"\u0004\b\u0001\u0010\u000f\"\u0004\b\u0002\u0010\u0010\"\u0004\b\u0003\u0010\u0011*\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u0002H\u000e0\r\u0012\u0004\u0012\u0002H\u000f0\r2\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u0002H\u000e\u0012\u0004\u0012\u0002H\u00100\f2\u0012\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u0002H\u000f\u0012\u0004\u0012\u0002H\u00110\fH\u0007\u001aF\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u0002H\u001b\u0012\u0004\u0012\u0002H\u000f0\u0018\"\u0004\b\u0000\u0010\u001b\"\u0004\b\u0001\u0010\u000f\"\b\b\u0002\u0010\u000e*\u0002H\u001b*\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u0002H\u000e0\r\u0012\u0004\u0012\u0002H\u000f0\rH\u0007\u001aV\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u0002H\u0010\u0012\u0004\u0012\u0002H\u000f0\u0018\"\u0004\b\u0000\u0010\u000e\"\u0004\b\u0001\u0010\u000f\"\u0004\b\u0002\u0010\u0010*\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u0002H\u000e0\r\u0012\u0004\u0012\u0002H\u000f0\r2\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u0002H\u000e\u0012\u0004\u0012\u0002H\u00100\fH\u0007\"\u001c\u0010\u0000\u001a\u00020\u00018\u0000X\u0081\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\b\u0002\u0010\u0003\u001a\u0004\b\u0004\u0010\u0005\u00a8\u0006\u001d"}, d2 = {"bifunctor_singleton", "Lcom/raywenderlich/fp/RwEitherFunctor;", "bifunctor_singleton$annotations", "()V", "getBifunctor_singleton", "()Lcom/raywenderlich/fp/RwEitherFunctor;", "leftFunctor", "Larrow/typeclasses/Functor;", "Larrow/typeclasses/Conested;", "Lcom/raywenderlich/fp/ForRwEither;", "X", "lift", "Lkotlin/Function1;", "Larrow/Kind;", "A", "B", "C", "D", "arg0", "arg1", "rightFunctor", "bifunctor", "Lcom/raywenderlich/fp/RwEither$Companion;", "bimap", "Lcom/raywenderlich/fp/RwEither;", "arg2", "leftWiden", "AA", "mapLeft", "typeclasses"})
public final class RwEitherFunctorKt {
    
    /**
     * cached extension
     */
    @org.jetbrains.annotations.NotNull()
    private static final com.raywenderlich.fp.RwEitherFunctor bifunctor_singleton = null;
    
    /**
     * cached extension
     */
    @kotlin.PublishedApi()
    public static void bifunctor_singleton$annotations() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final com.raywenderlich.fp.RwEitherFunctor getBifunctor_singleton() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @kotlin.Suppress(names = {"UNCHECKED_CAST", "USELESS_CAST", "EXTENSION_SHADOWED_BY_MEMBER", "UNUSED_PARAMETER"})
    public static final <A extends java.lang.Object, B extends java.lang.Object, C extends java.lang.Object, D extends java.lang.Object>com.raywenderlich.fp.RwEither<C, D> bimap(@org.jetbrains.annotations.NotNull()
    arrow.Kind<? extends arrow.Kind<com.raywenderlich.fp.ForRwEither, ? extends A>, ? extends B> $this$bimap, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super A, ? extends C> arg1, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super B, ? extends D> arg2) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @kotlin.Suppress(names = {"UNCHECKED_CAST", "USELESS_CAST", "EXTENSION_SHADOWED_BY_MEMBER", "UNUSED_PARAMETER"})
    public static final <A extends java.lang.Object, B extends java.lang.Object, C extends java.lang.Object, D extends java.lang.Object>kotlin.jvm.functions.Function1<arrow.Kind<? extends arrow.Kind<com.raywenderlich.fp.ForRwEither, ? extends A>, ? extends B>, arrow.Kind<arrow.Kind<com.raywenderlich.fp.ForRwEither, C>, D>> lift(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super A, ? extends C> arg0, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super B, ? extends D> arg1) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @kotlin.Suppress(names = {"UNCHECKED_CAST", "USELESS_CAST", "EXTENSION_SHADOWED_BY_MEMBER", "UNUSED_PARAMETER"})
    public static final <A extends java.lang.Object, B extends java.lang.Object, C extends java.lang.Object>com.raywenderlich.fp.RwEither<C, B> mapLeft(@org.jetbrains.annotations.NotNull()
    arrow.Kind<? extends arrow.Kind<com.raywenderlich.fp.ForRwEither, ? extends A>, ? extends B> $this$mapLeft, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super A, ? extends C> arg1) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @kotlin.Suppress(names = {"UNCHECKED_CAST", "USELESS_CAST", "EXTENSION_SHADOWED_BY_MEMBER", "UNUSED_PARAMETER"})
    public static final <X extends java.lang.Object>arrow.typeclasses.Functor<arrow.Kind<com.raywenderlich.fp.ForRwEither, X>> rightFunctor() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @kotlin.Suppress(names = {"UNCHECKED_CAST", "USELESS_CAST", "EXTENSION_SHADOWED_BY_MEMBER", "UNUSED_PARAMETER"})
    public static final <X extends java.lang.Object>arrow.typeclasses.Functor<arrow.typeclasses.Conested<com.raywenderlich.fp.ForRwEither, X>> leftFunctor() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @kotlin.Suppress(names = {"UNCHECKED_CAST", "USELESS_CAST", "EXTENSION_SHADOWED_BY_MEMBER", "UNUSED_PARAMETER"})
    public static final <AA extends java.lang.Object, B extends java.lang.Object, A extends AA>com.raywenderlich.fp.RwEither<AA, B> leftWiden(@org.jetbrains.annotations.NotNull()
    arrow.Kind<? extends arrow.Kind<com.raywenderlich.fp.ForRwEither, ? extends A>, ? extends B> $this$leftWiden) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @kotlin.Suppress(names = {"UNCHECKED_CAST", "NOTHING_TO_INLINE"})
    public static final com.raywenderlich.fp.RwEitherFunctor bifunctor(@org.jetbrains.annotations.NotNull()
    com.raywenderlich.fp.RwEither.Companion $this$bifunctor) {
        return null;
    }
}