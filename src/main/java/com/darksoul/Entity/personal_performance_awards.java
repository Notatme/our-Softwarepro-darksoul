package com.darksoul.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class personal_performance_awards {
//    个人业绩奖项表
    private String PersonralUserid;//个人用户ID
    private String PersonalreviewID;//个人评审总表ID
    private String Projectname;//项目名称
    private String Awardslevel;//奖励等级
    private String Awardtime;//授予时间
    private String Awardorganization;//授予机构
    private String Content;//内容提要
    private String Assistcertify;//辅助证明材料

}
