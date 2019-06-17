package org.ccy;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main (String[] args){
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);
        UseFunctionService bean = context.getBean(UseFunctionService.class);
        System.out.println(bean.sayHello("ccy"));
        context.close();
    }

}
