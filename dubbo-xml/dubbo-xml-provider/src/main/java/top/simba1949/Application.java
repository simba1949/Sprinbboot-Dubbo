package top.simba1949;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

/**
 * @ImportResource({"classpath:application-dubbo.xml"}) 必须在此处导入 dubbo 配置
 * @author SIMBA1949
 * @date 2019/1/22 22:59
 */
@ImportResource({"classpath:application-dubbo.xml"})
@SpringBootApplication
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
