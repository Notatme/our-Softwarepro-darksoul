package com.darksoul.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class personal_introduceman {
// 个人人才引进相关材料表
    private String PersonalUserid;//个人用户ID
    private String PersonalreviewID;//个人评审总表ID
    private String Materialsname;//材料名称
    private String Materialsadjunct;//材料附件

}
