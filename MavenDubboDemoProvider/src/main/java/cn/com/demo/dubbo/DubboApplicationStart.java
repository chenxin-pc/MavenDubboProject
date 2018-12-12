package cn.com.demo.dubbo;

import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.builder.SpringApplicationBuilder;

@SpringBootApplication(exclude= {DataSourceAutoConfiguration.class})
public class DubboApplicationStart {
       public static void main(String[] args) {
    	   new SpringApplicationBuilder(DubboApplicationStart.class).web(WebApplicationType.NONE).run(args);
	}
}
