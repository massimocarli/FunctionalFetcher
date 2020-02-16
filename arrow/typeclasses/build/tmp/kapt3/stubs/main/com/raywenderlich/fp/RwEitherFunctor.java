package com.raywenderlich.fp;

import java.lang.System;

/**
 * In the case of the Either you need a BiFunctor
 */
@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u0000 \r2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\rJ\u00a8\u0001\u0010\u0003\u001a0\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u0002H\u00050\u0004\u0012\u0004\u0012\u0002H\u00060\u0004j\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u0002H\u0005\u0012\u0004\u0012\u0002H\u0006`\u0007\"\u0004\b\u0000\u0010\b\"\u0004\b\u0001\u0010\t\"\u0004\b\u0002\u0010\u0005\"\u0004\b\u0003\u0010\u0006*0\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u0002H\b0\u0004\u0012\u0004\u0012\u0002H\t0\u0004j\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u0002H\b\u0012\u0004\u0012\u0002H\t`\u00072\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u0002H\b\u0012\u0004\u0012\u0002H\u00050\u000b2\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u0002H\t\u0012\u0004\u0012\u0002H\u00060\u000bH\u0016\u00a8\u0006\u000e"}, d2 = {"Lcom/raywenderlich/fp/RwEitherFunctor;", "Larrow/typeclasses/Bifunctor;", "Lcom/raywenderlich/fp/ForRwEither;", "bimap", "Larrow/Kind;", "C", "D", "Larrow/Kind2;", "A", "B", "fl", "Lkotlin/Function1;", "fr", "Companion", "typeclasses"})
@arrow.extension()
public abstract interface RwEitherFunctor extends arrow.typeclasses.Bifunctor<com.raywenderlich.fp.ForRwEither> {
    public static final com.raywenderlich.fp.RwEitherFunctor.Companion Companion = null;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public abstract <A extends java.lang.Object, B extends java.lang.Object, C extends java.lang.Object, D extends java.lang.Object>arrow.Kind<arrow.Kind<com.raywenderlich.fp.ForRwEither, C>, D> bimap(@org.jetbrains.annotations.NotNull()
    arrow.Kind<? extends arrow.Kind<com.raywenderlich.fp.ForRwEither, ? extends A>, ? extends B> $this$bimap, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super A, ? extends C> fl, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super B, ? extends D> fr);
    
    /**
     * In the case of the Either you need a BiFunctor
     */
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 3)
    public final class DefaultImpls {
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public static <A extends java.lang.Object, B extends java.lang.Object, C extends java.lang.Object, D extends java.lang.Object>arrow.Kind<arrow.Kind<com.raywenderlich.fp.ForRwEither, C>, D> bimap(com.raywenderlich.fp.RwEitherFunctor $this, @org.jetbrains.annotations.NotNull()
        arrow.Kind<? extends arrow.Kind<com.raywenderlich.fp.ForRwEither, ? extends A>, ? extends B> $this$bimap, @org.jetbrains.annotations.NotNull()
        kotlin.jvm.functions.Function1<? super A, ? extends C> fl, @org.jetbrains.annotations.NotNull()
        kotlin.jvm.functions.Function1<? super B, ? extends D> fr) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public static <X extends java.lang.Object>arrow.typeclasses.Functor<arrow.typeclasses.Conested<com.raywenderlich.fp.ForRwEither, X>> leftFunctor(com.raywenderlich.fp.RwEitherFunctor $this) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public static <A extends java.lang.Object, B extends java.lang.Object, C extends java.lang.Object, D extends java.lang.Object>kotlin.jvm.functions.Function1<arrow.Kind<? extends arrow.Kind<com.raywenderlich.fp.ForRwEither, ? extends A>, ? extends B>, arrow.Kind<arrow.Kind<com.raywenderlich.fp.ForRwEither, C>, D>> lift(com.raywenderlich.fp.RwEitherFunctor $this, @org.jetbrains.annotations.NotNull()
        kotlin.jvm.functions.Function1<? super A, ? extends C> fl, @org.jetbrains.annotations.NotNull()
        kotlin.jvm.functions.Function1<? super B, ? extends D> fr) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public static <X extends java.lang.Object>arrow.typeclasses.Functor<arrow.Kind<com.raywenderlich.fp.ForRwEither, X>> rightFunctor(com.raywenderlich.fp.RwEitherFunctor $this) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public static <AA extends java.lang.Object, B extends java.lang.Object, A extends AA>arrow.Kind<arrow.Kind<com.raywenderlich.fp.ForRwEither, AA>, B> leftWiden(com.raywenderlich.fp.RwEitherFunctor $this, @org.jetbrains.annotations.NotNull()
        arrow.Kind<? extends arrow.Kind<com.raywenderlich.fp.ForRwEither, ? extends A>, ? extends B> $this$leftWiden) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public static <A extends java.lang.Object, B extends java.lang.Object, C extends java.lang.Object>arrow.Kind<arrow.Kind<com.raywenderlich.fp.ForRwEither, C>, B> mapLeft(com.raywenderlich.fp.RwEitherFunctor $this, @org.jetbrains.annotations.NotNull()
        arrow.Kind<? extends arrow.Kind<com.raywenderlich.fp.ForRwEither, ? extends A>, ? extends B> $this$mapLeft, @org.jetbrains.annotations.NotNull()
        kotlin.jvm.functions.Function1<? super A, ? extends C> f) {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/raywenderlich/fp/RwEitherFunctor$Companion;", "", "()V", "typeclasses"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}