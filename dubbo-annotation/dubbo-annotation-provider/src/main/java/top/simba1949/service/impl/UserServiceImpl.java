package top.simba1949.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.alibaba.fastjson.JSON;
import lombok.extern.slf4j.Slf4j;
import top.simba1949.common.UserDto;
import top.simba1949.service.UserService;

/**
 * @Service 使用 dubbo 注解暴露接口
 * @author SIMBA1949
 * @date 2019/1/22 22:37
 */
@Slf4j
@Service
public class UserServiceImpl implements UserService {
    @Override
    public UserDto updateUser(UserDto userDto) {
        log.info("生产者接收的数据是：" + userDto);
        userDto.setUsername("生产者提供：" + userDto.getUsername());
        log.info("生产者改造之后的数据是：" + userDto);
        return userDto;
    }

    @Override
    public UserDto modifyUser(String user) {
        log.info("生产者接收的数据是：" + user);
        UserDto userDto = JSON.parseObject(user, UserDto.class);
        userDto.setUsername("生产者序列化后改造的数据是：" + userDto.getUsername());
        log.info("生产者改造之后的数据是：" + userDto);
        return userDto;
    }
}
