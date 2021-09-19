package org.springframework.boot.autoconfigu;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties("tiger")
@Data
public class TigerProperties {
	String name;
}
