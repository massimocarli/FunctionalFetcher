package com.raywenderlich.fp;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \u0007*\u0006\b\u0000\u0010\u0001 \u0001*\u0006\b\u0001\u0010\u0002 \u00012*\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u0002H\u00010\u0003\u0012\u0004\u0012\u0002H\u00020\u0003j\u000e\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u0002H\u0002`\u0005:\u0001\u0007B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0006\u0082\u0001\u0002\b\t\u00a8\u0006\n"}, d2 = {"Lcom/raywenderlich/fp/RwEither;", "A", "B", "Larrow/Kind;", "Lcom/raywenderlich/fp/ForRwEither;", "Lcom/raywenderlich/fp/RwEitherOf;", "()V", "Companion", "Lcom/raywenderlich/fp/RwLeft;", "Lcom/raywenderlich/fp/RwRight;", "data-types"})
@arrow.higherkind()
public abstract class RwEither<A extends java.lang.Object, B extends java.lang.Object> implements arrow.Kind<arrow.Kind<? extends com.raywenderlich.fp.ForRwEither, ? extends A>, B> {
    public static final com.raywenderlich.fp.RwEither.Companion Companion = null;
    
    private RwEither() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/raywenderlich/fp/RwEither$Companion;", "", "()V", "data-types"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}