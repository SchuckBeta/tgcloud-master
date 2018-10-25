package com.tiger.tgcloud.uac.model.vo;

import lombok.Data;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import java.util.Date;

/**
 * @description:
 * @author: tiger
 * @date: 2018/10/24 17:41
 * @version: V1.0
 * @modified by:
 */
@Data
public class UserVO {
    private Long id;

    @NotNull(message = "用户名不能为空")
    private String username;

    @NotNull(message = "昵称不能为空")
    private String nickname;

    private String password;

    private Integer gender;

    private Integer status;

    private String cellphone;

    private Long deptid;

    private String identitycard;

    private String fax;

    @Email(message = "邮箱格式错误")
    private String email;

    private String qq;

    private String address;

    private Date createdate;

    private String createusername;

    private Date modifydate;

    private String modifyusername;
}
