package org.springframework.boot.autoconfigu;

import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Configuration
@EnableConfigurationProperties(TigerProperties.class)
public class tigerAutoCon {

	@Bean
	public BeanA getA(tigerAutoCon t) {

		return new BeanA();
	}
}

@Component
class BeanA{

}
