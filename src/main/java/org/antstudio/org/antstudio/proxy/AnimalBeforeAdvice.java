package org.antstudio.org.antstudio.proxy;

import org.springframework.aop.MethodBeforeAdvice;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;

/**
 * @author Gavin
 * @date 14-7-27 下午9:40
 */
@Component
public class AnimalBeforeAdvice implements MethodBeforeAdvice {


    @Override
    public void before(Method method, Object[] objects, Object o) throws Throwable {
        System.out.println("Before execute "+ method.getName());
    }
}
