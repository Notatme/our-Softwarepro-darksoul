package com.darksoul.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class personal_basic_message {
//    个人基本信息表
    private String PersonralUserid;//个人用户ID
    private String PersonalreviewID;//个人评审总表ID
    private String unitlevel;//单位级别
    private String Personalidentitynature;//个人身份性质
    private int Reviewyear;//评审年度
    private String Name;//姓名
    private String Nameformer;//姓名(曾用名)
    private String Sex;//性别
    private String Nation;//民族
    private String IDNumber;//证件号码
    private Date Birthday;//出生年月
    private Date Fillingtime;//填表时间
    private Date Startworktime;//参加工作时间
    private int Workingyears;//专业技术工作年限
    private String Reviewmeeting;//参加评审会
    private String Wantprofessionseries;//拟评职称系列
    private String Wantmajor;//拟评专业
    private String Wantmajorstatus;//拟评专业技术资格
    private String Executivefunction;//行政职务
    private Date Executivefunctiontime;//行政职务任命时间
    private String Executivefunctionexplatin;//行政职务说明
    private String Phone;//联系电话
    private String Email;//电子邮箱
    private String Fileorganizationname;//档案所在地机构名称
    private String Politicsstatus;//政治面貌
    private String Nativeplace;//籍贯
    private String address;//联系地址
    private String IDcardfront;//身份证正面照片
    private String IDcardcontrary;//身份证反面照片
    private String Manphoto;//近期免冠二寸照片

}
