package com.wen.demo3.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * @author edgar
 * @version v1.0
 * @description: TODO
 * @date 2023/6/23 21:35
 */

@Data
//@TableName("user")
public class User {
    private Long id;
    private String name;
    private Integer age;
    private String email;
}
