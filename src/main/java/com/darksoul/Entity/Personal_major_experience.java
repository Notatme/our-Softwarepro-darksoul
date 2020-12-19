package com.darksoul.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Personal_major_experience {
//    个人主要经历表
    private String PersonalUserid;//个人用户ID
    private String PersonalreviewID;//个人评审总表ID
    private Date Starttime;//开始时间
    private String WhereSchoolWork;//何地,何学校,何单位学习或从事何种专业技术工作
    private Date EndTime;//截止时间
    private String Post;//任何职
    private String Workunit;//工作单位
    private String Certifyman;//证明人
    private String HelpCertify;//辅助证明材料


}
