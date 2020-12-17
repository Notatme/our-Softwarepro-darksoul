package com.darksoul.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class personal_education {
//    个人学历情况表
    private String PersonralUserid;//个人用户ID
    private String PersonalreviewID;//个人评审总表ID
    private Date  Graduationtime;//毕业时间
    private String Graduationschool;//毕业学校
    private String EducationProject;//学历项目
    private String Major;//专业
    private String Education;//学历
    private String Degree;//学位
    private Float  Lengthofschooling;//学制
    private String EducationID;//毕业证编号
    private String Educationdegreecredential;//学历学位证书材料
}
