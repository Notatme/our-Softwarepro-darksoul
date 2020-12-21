package com.darksoul.service;

import com.darksoul.Entity.*;

public interface PersonalReviewselectservice {
//   个人基本信息表
   Personal_basic_message GetPersonal_basic_message(String PersonalUserid,String PersonalreviewID);
// 个人学历情况表
   Personal_education GetPersonal_education(String PersonalUserid,String PersonalreviewID);
//用户个人主要经历表
   Personal_major_experience GetPersonal_major_experience(String PersonalUserid,String PersonalreviewID);
   //  个人人才引进相关材料表查询
   Personal_introduceman GetPersonal_introduceman(String PersonalUserid,String PersonalreviewID);
// 个人论文著作表（personal_paper_patents
   Personal_paper_patents GetPersonal_paper_patents(String PersonalUserid,String PersonalreviewID);
   // 个人业绩成果表personal_performance_achievement
   Personal_performance_achievement GetPersonal_performance_achievement(String PersonalUserid,String PersonalreviewID);
   //	个人业绩奖项表personal_performance_awards
   Personal_performance_awards GetPersonal_performance_awards(String PersonalUserid,String PersonalreviewID);
//	个人业绩专利表（personal_performance_patents）
   Personal_performance_patents GetPersonal_performance_patents(String PersonalUserid,String PersonalreviewID);

   //	个人从业或执业（职业）资格表（personal_occupational_qualification）
   Personal_occupational_qualification GetPersonal_occupational_qualification(String personalUserid, String personalreviewID);
//   个人国（境）外工作或研究材料表（personal_research_materials）
   Personal_research_materials GetPersonal_research_materials(String personalUserid, String personalreviewID);
//个人工作总结表personal_worksummary
   Personal_worksummary GetPersonal_worksummary(String personalUserid, String personalreviewID);
   //    4.3.15	个人其他材料表（personal_others）
   Personal_others GetPersonal_others(String personalUserid, String personalreviewID);


}
