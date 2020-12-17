package com.darksoul.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class personal_research_materials {
//   个人国（境）外工作或研究材料表
    private String PersonralUserid;//个人用户ID
    private String PersonalreviewID;//个人评审总表ID
    private Date Starttime;//开始时间
    private Date Stoptime;//截止时间
    private String Workunit;//工作单位
    private String Job;//职务岗位
    private String Jobcontent;//工作内容
    private String Assistcertify;//辅助证明材料
}
