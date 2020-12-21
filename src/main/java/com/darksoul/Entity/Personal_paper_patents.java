package com.darksoul.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Personal_paper_patents {
//   个人论文著作表
    private String PersonalUserid;//个人用户ID
    private String PersonalreviewID;//个人评审总表ID
    private Date publishtime;//发表时间
    private String paperclasses;//论文类别
    private String role;//角色
    private String ifmagnumopus;//是否代表作
    private String insertperiodical;//登载刊物名称、刊号
    private String authorityindexes;//国外权威索引收录
    private String yearperiodical;//年卷（期）
    private String reward;//获奖情况经济收益
    private String papername;//论文著作名称
    private String ifrecommend;//是否在推荐表上显示此论文、著作
    private String paperlevel;//论文级别
    private String papercover;//论文封面和论文版权页
    private String papercatalog;//论文目录
    private String papercontent;//论文内容



}
