package com.day14;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

@Target(value = {ElementType.METHOD})
public @interface MyAnnotation {
    String value() default "hello";
}
