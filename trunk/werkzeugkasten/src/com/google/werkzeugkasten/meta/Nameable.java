package com.google.werkzeugkasten.meta;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

public interface Nameable {

	String getName();

	@Retention(RetentionPolicy.SOURCE)
	@Target(ElementType.TYPE)
	public @interface Name {
		String value();
	}
}