package top.simba1949;

import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @EnableDubbo 开启 dubbo 注解的扫描和自动化配置
 * @author SIMBA1949
 * @date 2019/1/22 22:35
 */
@EnableDubbo
@SpringBootApplication
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
