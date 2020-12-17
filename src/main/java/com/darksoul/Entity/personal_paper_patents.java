package com.darksoul.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class personal_paper_patents {
//   个人论文著作表
    private String PersonralUserid;//个人用户ID
    private String PersonalreviewID;//个人评审总表ID
    private Date Publishtime;//发表时间
    private String Paperclasses;//论文类别
    private String Role;//角色
    private String IFmagnumopus;//是否代表作
    private String Insertperiodical;//登载刊物名称、刊号
    private String Authorityindexes;//国外权威索引收录
    private String Yearperiodical;//年卷（期）
    private String Reward;//获奖情况经济收益
    private String Papername;//论文著作名称
    private String IFrecommend;//是否在推荐表上显示此论文、著作
    private String Paperlevel;//论文级别
    private String Papercover;//论文封面和论文版权页
    private String Papercatalog;//论文目录
    private String Papercontent;//论文内容



}
