package com.alibaba.otter.canal.store.model;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * TODO(描述这个类的作用) <br/>
 *
 * @author qinhd
 * @version 1.0
 * @date 2019/2/15 16:45
 * @since JDK 1.8+
 */
public class Tes {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        Object str = new String("sdsddd");
        System.out.println(str.getClass());

        Method method = str.getClass().getMethod("concat",String.class);
        System.out.println(method.getName());
        method.invoke(str,"asddfdfff");
        System.out.println(str);

        System.out.println(((String)str).concat("ddd"));
    }
}
