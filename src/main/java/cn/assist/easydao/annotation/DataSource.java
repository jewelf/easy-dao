package cn.assist.easydao.annotation;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

/**
 * 通过注解的方式切换数据源
 * @author caixb
 *
 */
@Target(METHOD)
@Retention(RUNTIME)
@Documented
public @interface DataSource {
    String value() default "";
}