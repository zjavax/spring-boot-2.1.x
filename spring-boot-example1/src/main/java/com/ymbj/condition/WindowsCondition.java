package com.ymbj.condition;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;
import org.springframework.util.MultiValueMap;


/**
 * 实现spring 的Condition接口，并且重写matches()方法，如果操作系统是windows就返回true
 *
 */
public class WindowsCondition implements Condition {

	@Override
	public boolean matches(ConditionContext context, AnnotatedTypeMetadata metadata) {

		// attrs 拿到ConditionalOnWindows所有的属性值
		// 他只有一个属性value()
		// @ConditionalOnWindows("hello")  并且被自动配置为hello
		// 故attrs只有一个属性value，且值为hello
		MultiValueMap<String, Object> attrs = metadata.getAllAnnotationAttributes(ConditionalOnWindows.class.getName());
		System.out.println("==============================" + ConditionalOnWindows.class.getName());
		if (attrs != null) {
			for (Object value : attrs.get("value")) {
				System.out.println("==============================" + value.toString());
			}
		}
		return context.getEnvironment().getProperty("os.name").contains("Windows");
	}


}