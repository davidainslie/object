package com.kissthinker.object;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Mark up a class to be a singleton i.e instantiated only once.
 * <br/>
 * Note that in order for this contract to actually be fulfilled, any (all) instantiation of said class must be done through {@link Factory#instance()}.<br/>
 * By instantiating classes (any including ones marked up as {@link Singleton}) this way, {@link Factory} acts as a manager similar to a "container" managing object lifecycles.<br/>
 * If a class marked up {@link Singleton} is instantiated with "new", then this annotation is ignored and so the object will not be managed as a singleton.
 * @author David Ainslie
 *
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
public @interface Singleton
{
}