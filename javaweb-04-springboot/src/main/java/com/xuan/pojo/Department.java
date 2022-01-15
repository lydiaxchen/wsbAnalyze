package com.xuan.pojo;


import lombok.AllArgsConstructor;
        import lombok.Data;
        import lombok.NoArgsConstructor;

@Data    // getter, setter, toString
@AllArgsConstructor
@NoArgsConstructor
//部门表
public class Department {
    private Integer id;
    private String departmentName;

}