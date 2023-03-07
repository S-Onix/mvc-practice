package org.example.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.TYPE) // 클레스나 인터페이스 Enum을 대상으로 한다.
@Retention(RetentionPolicy.RUNTIME) // 런타임기간동안 유지된다.
public @interface Controller {
}
