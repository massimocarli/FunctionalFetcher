package com.raywenderlich.fp;

import java.lang.System;

/**
 * The Result data type
 */
@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u0000 \u0005*\u0006\b\u0000\u0010\u0001 \u0001*\u0006\b\u0001\u0010\u0002 \u00012\u00020\u0003:\u0001\u0005B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0004\u0082\u0001\u0002\u0006\u0007\u00a8\u0006\b"}, d2 = {"Lcom/raywenderlich/fp/Result;", "E", "A", "", "()V", "Companion", "Lcom/raywenderlich/fp/Success;", "Lcom/raywenderlich/fp/Error;", "data-types"})
public abstract class Result<E extends java.lang.Object, A extends java.lang.Object> {
    public static final com.raywenderlich.fp.Result.Companion Companion = null;
    
    private Result() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u001f\u0010\u0003\u001a\b\u0012\u0004\u0012\u0002H\u00050\u0004\"\u0004\b\u0002\u0010\u00052\u0006\u0010\u0006\u001a\u0002H\u0005\u00a2\u0006\u0002\u0010\u0007\u00a8\u0006\b"}, d2 = {"Lcom/raywenderlich/fp/Result$Companion;", "", "()V", "just", "Lcom/raywenderlich/fp/Success;", "A", "value", "(Ljava/lang/Object;)Lcom/raywenderlich/fp/Success;", "data-types"})
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull()
        public final <A extends java.lang.Object>com.raywenderlich.fp.Success<A> just(A value) {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}