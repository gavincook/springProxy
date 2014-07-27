package org.antstudio;

import org.springframework.stereotype.Component;

/**
 * @author Gavin
 * @date 14-7-27 下午2:09
 */
@Component
public class Person implements Animal{


    public void eat(){
        System.out.println(" Eating...");
    }

    public void sleep(){
        System.out.println(" Sleeping...");
    }

}
