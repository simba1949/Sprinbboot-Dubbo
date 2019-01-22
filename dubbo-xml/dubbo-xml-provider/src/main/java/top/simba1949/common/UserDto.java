package top.simba1949.common;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * @author SIMBA1949
 * @date 2019/1/22 22:28
 */
@Data
public class UserDto implements Serializable {
    private static final long serialVersionUID = 2223107801863147437L;
    private Long id;
    private String username;
    private Date birthday;
    private Boolean flag;
}
