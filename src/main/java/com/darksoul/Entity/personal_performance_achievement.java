package com.darksoul.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class personal_performance_achievement {
//    个人业绩成果表
    private String PersonalUserid;//个人用户ID
    private String PersonalreviewID;//个人评审总表ID
    private String Performancename;//业绩名称（如项目，专利，标准，课题等）
    private Date Starttime;//开始时间
    private Date Stoptime;//截止时间
    private String Projectlevel;//项目级别
    private String Projectcontent;//项目内容(最多70字)
    private String Personaleffect;//本人起何作用(独立、主持、主要参加、参加或协助)
    private String Achievementeffect;//完成情况及效果、效益、获何种奖励、专利(最多250字)
    private String Projectscan;//项目材料扫描件
    private String PersonalProjectscan;//个人项目任职证明扫描件
    private String Projectawardsscan;//项目获奖扫描件

}
