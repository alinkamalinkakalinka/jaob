package com.yoshtec.owl.annotations.oprop;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * Functional Syntax: 
 * <pre>
 * objectPropertyRange := 'ObjectPropertyRange' '(' { annotation } objectPropertyExpression description ')'
 * </pre>
 * 
 * @author yoshtec
 *
 */

@Documented
@Retention(RetentionPolicy.RUNTIME)
public @interface OwlObjectPropertyRange {
	String domain();
}
