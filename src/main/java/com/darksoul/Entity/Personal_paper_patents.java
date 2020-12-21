package com.darksoul.Entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import java.sql.Date;


public class Personal_paper_patents {
//   个人论文著作表
    private String PersonalUserid;//个人用户ID
    private String PersonalreviewID;//个人评审总表ID
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @JsonFormat(pattern = "yyyy-MM-dd")
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

    public Personal_paper_patents() {
    }

    public Personal_paper_patents(String personalUserid, String personalreviewID, Date publishtime, String paperclasses, String role, String ifmagnumopus, String insertperiodical, String authorityindexes, String yearperiodical, String reward, String papername, String ifrecommend, String paperlevel, String papercover, String papercatalog, String papercontent) {
        PersonalUserid = personalUserid;
        PersonalreviewID = personalreviewID;
        this.publishtime = publishtime;
        this.paperclasses = paperclasses;
        this.role = role;
        this.ifmagnumopus = ifmagnumopus;
        this.insertperiodical = insertperiodical;
        this.authorityindexes = authorityindexes;
        this.yearperiodical = yearperiodical;
        this.reward = reward;
        this.papername = papername;
        this.ifrecommend = ifrecommend;
        this.paperlevel = paperlevel;
        this.papercover = papercover;
        this.papercatalog = papercatalog;
        this.papercontent = papercontent;
    }

    public String getPersonalUserid() {
        return PersonalUserid;
    }
    @JsonProperty(value = "PersonalUserid")
    public void setPersonalUserid(String personalUserid) {
        PersonalUserid = personalUserid;
    }

    public String getPersonalreviewID() {
        return PersonalreviewID;
    }
    @JsonProperty(value = "PersonalreviewID")
    public void setPersonalreviewID(String personalreviewID) {
        PersonalreviewID = personalreviewID;
    }

    public Date getPublishtime() {
        return publishtime;
    }

    public void setPublishtime(Date publishtime) {
        this.publishtime = publishtime;
    }

    public String getPaperclasses() {
        return paperclasses;
    }

    public void setPaperclasses(String paperclasses) {
        this.paperclasses = paperclasses;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getIfmagnumopus() {
        return ifmagnumopus;
    }

    public void setIfmagnumopus(String ifmagnumopus) {
        this.ifmagnumopus = ifmagnumopus;
    }

    public String getInsertperiodical() {
        return insertperiodical;
    }

    public void setInsertperiodical(String insertperiodical) {
        this.insertperiodical = insertperiodical;
    }

    public String getAuthorityindexes() {
        return authorityindexes;
    }

    public void setAuthorityindexes(String authorityindexes) {
        this.authorityindexes = authorityindexes;
    }

    public String getYearperiodical() {
        return yearperiodical;
    }

    public void setYearperiodical(String yearperiodical) {
        this.yearperiodical = yearperiodical;
    }

    public String getReward() {
        return reward;
    }

    public void setReward(String reward) {
        this.reward = reward;
    }

    public String getPapername() {
        return papername;
    }

    public void setPapername(String papername) {
        this.papername = papername;
    }

    public String getIfrecommend() {
        return ifrecommend;
    }

    public void setIfrecommend(String ifrecommend) {
        this.ifrecommend = ifrecommend;
    }

    public String getPaperlevel() {
        return paperlevel;
    }

    public void setPaperlevel(String paperlevel) {
        this.paperlevel = paperlevel;
    }

    public String getPapercover() {
        return papercover;
    }

    public void setPapercover(String papercover) {
        this.papercover = papercover;
    }

    public String getPapercatalog() {
        return papercatalog;
    }

    public void setPapercatalog(String papercatalog) {
        this.papercatalog = papercatalog;
    }

    public String getPapercontent() {
        return papercontent;
    }

    public void setPapercontent(String papercontent) {
        this.papercontent = papercontent;
    }

    @Override
    public String toString() {
        return "Personal_paper_patents{" +
                "PersonalUserid='" + PersonalUserid + '\'' +
                ", PersonalreviewID='" + PersonalreviewID + '\'' +
                ", publishtime=" + publishtime +
                ", paperclasses='" + paperclasses + '\'' +
                ", role='" + role + '\'' +
                ", ifmagnumopus='" + ifmagnumopus + '\'' +
                ", insertperiodical='" + insertperiodical + '\'' +
                ", authorityindexes='" + authorityindexes + '\'' +
                ", yearperiodical='" + yearperiodical + '\'' +
                ", reward='" + reward + '\'' +
                ", papername='" + papername + '\'' +
                ", ifrecommend='" + ifrecommend + '\'' +
                ", paperlevel='" + paperlevel + '\'' +
                ", papercover='" + papercover + '\'' +
                ", papercatalog='" + papercatalog + '\'' +
                ", papercontent='" + papercontent + '\'' +
                '}';
    }
}
