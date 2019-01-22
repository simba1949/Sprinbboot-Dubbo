package top.simba1949.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.alibaba.fastjson.JSON;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import top.simba1949.common.UserDto;
import top.simba1949.service.UserService;

/**
 * @author SIMBA1949
 * @date 2019/1/22 22:45
 */
@Slf4j
@RestController
@RequestMapping("user")
public class UserController {
    /**
     * 从远程获取的bean，并注入进来
     */
    @Autowired
    private UserService userService;

    @PostMapping("user")
    public UserDto user(@RequestBody UserDto userDto){
        log.info("消费者在消费之前接收的数据为：" + userDto.toString());
        UserDto user = userService.updateUser(userDto);
        log.info("消费者在消费之后接收的数据为：" + user);
        return user;
    }

    @PostMapping("str")
    public UserDto str(@RequestBody UserDto userDto){
        log.info("消费者在消费之前接收的数据为："+ userDto);
        String userStr = JSON.toJSONString(userDto);
        UserDto user = userService.modifyUser(userStr);
        log.info("消费者在消费之后接收的数据为：" + user);
        return user;
    }
}
