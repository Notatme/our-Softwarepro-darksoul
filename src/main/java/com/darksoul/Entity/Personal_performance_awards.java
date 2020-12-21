package com.darksoul.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Personal_performance_awards {
//    个人业绩奖项表
    private String PersonalUserid;//个人用户ID
    private String PersonalreviewID;//个人评审总表ID
    private String projectname;//项目名称
    private String awardslevel;//奖励等级
    private String awardtime;//授予时间
    private String awardorganization;//授予机构
    private String content;//内容提要
    private String assistcertify;//辅助证明材料

}
