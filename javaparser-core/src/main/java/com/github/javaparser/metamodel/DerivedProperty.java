package com.github.javaparser.metamodel;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * Indicate a derived property of a Node,
 * meaning it does supply useful information,
 * but it does so by taking information from other properties.
 * (Used during generation of the meta model.)
 */
@Retention(value = RetentionPolicy.RUNTIME)
public @interface DerivedProperty {
}
