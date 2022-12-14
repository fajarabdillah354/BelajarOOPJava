package src.latihanPackage.AnnotationReflection;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

//di bawah ini test menggunakan Annotation
@Target({ElementType.METHOD,ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
public @interface ContohAnnotation {
    //FIELD
    String name();
    int Symbol()default 0;

}
