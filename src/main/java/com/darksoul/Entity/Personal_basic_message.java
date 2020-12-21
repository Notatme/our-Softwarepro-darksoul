package com.darksoul.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Personal_basic_message {
//    个人基本信息表
    private String PersonalUserid;//个人用户ID
    private String PersonalreviewID;//个人评审总表ID
    private String unit;//单位
    private String unitlevel;//单位级别
    private String personalidentitynature;//个人身份性质
    private int reviewyear;//评审年度
    private String name;//姓名
    private String nameformer;//姓名(曾用名)
    private String sex;//性别
    private String nation;//民族
    private String idnumber;//证件号码
    private Date birthday;//出生年月
    private Date fillingtime;//填表时间
    private Date startworktime;//参加工作时间
    private int workingyears;//专业技术工作年限
    private String reviewmeeting;//参加评审会
    private String wantprofessionseries;//拟评职称系列
    private String wantmajor;//拟评专业
    private String wantmajorstatus;//拟评专业技术资格
    private String executivefunction;//行政职务
    private Date executivefunctiontime;//行政职务任命时间
    private String executivefunctionexplatin;//行政职务说明
    private String phone;//联系电话
    private String email;//电子邮箱
    private String fileorganizationname;//档案所在地机构名称
    private String politicsstatus;//政治面貌
    private String nativeplace;//籍贯
    private String address;//联系地址
    private String idcardfront;//身份证正面照片
    private String idcardcontrary;//身份证反面照片
    private String manphoto;//近期免冠二寸照片

}
