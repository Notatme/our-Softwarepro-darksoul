package com.darksoul.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Personal_occupational_qualification {
//   个人从业或执业（职业）资格表
    private String PersonalUserid;//个人用户ID
    private String PersonalreviewID;//个人评审总表ID
    private String QualificationName;//资格名称
    private Date Gettime;//取得时间
    private String Ratifyoffice;//批准机关
    private String Majorname;//专业名称
    private String Credentialnumber;//证书编号
    private String Assistcertify;//辅助证明材料

}
