package com.darksoul.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class personal_reviewall {
//    个人评审汇总表
    private String PersonralUserid;//个人用户ID
    private String PersonalreviewID;//个人评审总表ID
    private Date Reviewdate;//申报年度
    private String Review;//评委会所属职改办
    private String Reviewstatusname;//拟申报资格名称
    private String Reviewname;//评审会名称
    private String Reviewlevel;//评审等级
    private Date Createdate;//创建时间
    private String Reviewhandintime;//材料报送时间段
}
