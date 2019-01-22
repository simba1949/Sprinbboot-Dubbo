package top.simba1949.service;

import top.simba1949.common.UserDto;

/**
 * @author SIMBA1949
 * @date 2019/1/22 22:27
 */
public interface UserService {
    /**
     * 通过对象更新用户
     * @param userDto
     * @return
     */
    UserDto updateUser(UserDto userDto);

    /**
     * 通过序列化更新用户
     * @param user
     * @return
     */
    UserDto modifyUser(String user);
}
