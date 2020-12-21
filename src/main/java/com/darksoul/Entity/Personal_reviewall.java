package com.darksoul.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Personal_reviewall {
//    个人评审汇总表
    private String PersonalUserid;//个人用户ID
    private String PersonalreviewID;//个人评审总表ID
    private Date reviewdate;//申报年度
    private String review;//评委会所属职改办
    private String reviewstatusname;//拟申报资格名称
    private String reviewname;//评审会名称
    private String reviewlevel;//评审等级
    private Date createdate;//创建时间
    private String reviewhandintime;//材料报送时间段
}
