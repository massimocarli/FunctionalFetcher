package com.raywenderlich.fp

import arrow.Kind
import arrow.Kind2
import arrow.extension
import arrow.typeclasses.Bifunctor


/**
 * This is the type of the function a Data Type F must provide in order to be
 * considered a Functor. This is usually a function called map
 */
typealias Functor<A, B, F> = ((A) -> B) -> ((Kind<F, A>) -> Kind<F, B>)

/**
 * In the case of the Either you need a BiFunctor
 */
//typealias BiFunctor<A, B, C, D, F> = ((A) -> C, (B) -> D) -> Kind2<F, C, D>

@extension
interface RwEitherFunctor : Bifunctor<ForRwEither> {

  override fun <A, B, C, D> Kind2<ForRwEither, A, B>.bimap(fl: (A) -> C, fr: (B) -> D): Kind2<ForRwEither, C, D> {
    val fixed = this.fix()
    return when (fixed) {
      is RwLeft<A> -> RwLeft(fl(fixed.a))
      is RwRight<B> -> RwRight(fr(fixed.b))
    }
  }

  companion object
}