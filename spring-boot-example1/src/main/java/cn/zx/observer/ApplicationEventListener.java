//package cn.zx.observer;
//
//import org.springframework.context.ApplicationContext;
//import org.springframework.context.event.ContextRefreshedEvent;
//import org.springframework.context.event.EventListener;
//import org.springframework.stereotype.Component;
//
//@Component
//public class ApplicationEventListener {
//	@EventListener
//	public void listenContextRefreshedEvent(ContextRefreshedEvent event) {
//		ApplicationContext context = (ApplicationContext) event.getSource();
//		System.out.println("context ======================== " + context);
//	}
//}
//
