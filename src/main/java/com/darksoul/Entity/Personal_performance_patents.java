package com.darksoul.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Personal_performance_patents {
    //个人业绩专利表
    private String PersonalUserid;//个人用户ID
    private String PersonalreviewID;//个人评审总表ID
    private String patentsname;//专利名称
    private String patentstype;//专利类型
    private Date gettime;//取得时间
    private String patentsintroduce;//专利介绍
    private String assistcertify;//辅助证明材料
}
