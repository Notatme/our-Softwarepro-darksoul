package com.darksoul.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Personal_performance_achievement {
//    个人业绩成果表
    private String PersonalUserid;//个人用户ID
    private String PersonalreviewID;//个人评审总表ID
    private String performancename;//业绩名称（如项目，专利，标准，课题等）
    private Date starttime;//开始时间
    private Date stoptime;//截止时间
    private String projectlevel;//项目级别
    private String projectcontent;//项目内容(最多70字)
    private String personaleffect;//本人起何作用(独立、主持、主要参加、参加或协助)
    private String achievementeffect;//完成情况及效果、效益、获何种奖励、专利(最多250字)
    private String projectscan;//项目材料扫描件
    private String personalprojectscan;//个人项目任职证明扫描件
    private String projectawardsscan;//项目获奖扫描件

}
