package homeWork21;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
@Retention(RetentionPolicy.RUNTIME)
public @interface MyAnnotation {
	String params() default "My Annotation";
}
