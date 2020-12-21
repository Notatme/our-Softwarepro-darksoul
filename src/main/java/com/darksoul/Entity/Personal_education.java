package com.darksoul.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Personal_education {
//    个人学历情况表
    private String PersonalUserid;//个人用户ID
    private String PersonalreviewID;//个人评审总表ID
    private Date  graduationtime;//毕业时间
    private String graduationschool;//毕业学校
    private String educationproject;//学历项目
    private String major;//专业
    private String education;//学历
    private String degree;//学位
    private Float  lengthofschooling;//学制
    private String educationid;//毕业证编号
    private String educationdegreecredential;//学历学位证书材料
}
