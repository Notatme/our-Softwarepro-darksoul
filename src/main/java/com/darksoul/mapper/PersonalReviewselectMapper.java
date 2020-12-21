package com.darksoul.mapper;


import com.darksoul.Entity.*;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface PersonalReviewselectMapper {

//    select用户个人信息表信息
        Personal_basic_message GetPersonal_basic_messageMapper(@Param("PersonalUserid") String PersonalUserid,@Param("PersonalreviewID") String PersonalreviewID);
//select个人学历情况表
        Personal_education GetPersonal_education(@Param("PersonalUserid") String PersonalUserid, @Param("PersonalreviewID") String PersonalreviewID);

  //   select用户个人主要经历表
        Personal_major_experience GetPersonal_major_experience(@Param("PersonalUserid") String PersonalUserid,@Param("PersonalreviewID") String PersonalreviewID);

//  个人人才引进相关材料表查询
        Personal_introduceman GetPersonal_introduceman(@Param("PersonalUserid") String PersonalUserid,@Param("PersonalreviewID") String PersonalreviewID);
// 个人论文著作表（personal_paper_patents
        Personal_paper_patents GetPersonal_paper_patents(@Param("PersonalUserid") String PersonalUserid,@Param("PersonalreviewID") String PersonalreviewID);
// 个人业绩成果表personal_performance_achievement
        Personal_performance_achievement GetPersonal_performance_achievement(@Param("PersonalUserid") String PersonalUserid,@Param("PersonalreviewID") String PersonalreviewID);
//	个人业绩奖项表personal_performance_awards
        Personal_performance_awards GetPersonal_performance_awards(@Param("PersonalUserid") String PersonalUserid,@Param("PersonalreviewID") String PersonalreviewID);
//	个人业绩专利表（personal_performance_patents）
        Personal_performance_patents GetPersonal_performance_patents(@Param("PersonalUserid") String PersonalUserid,@Param("PersonalreviewID") String PersonalreviewID);

//	个人从业或执业（职业）资格表（personal_occupational_qualification）
        Personal_occupational_qualification GetPersonal_occupational_qualification(@Param("PersonalUserid") String PersonalUserid,@Param("PersonalreviewID") String PersonalreviewID);
//   个人国（境）外工作或研究材料表（personal_research_materials）
        Personal_research_materials GetPersonal_research_materials(@Param("PersonalUserid") String PersonalUserid,@Param("PersonalreviewID") String PersonalreviewID);
 //个人工作总结表personal_worksummary
        Personal_worksummary GetPersonal_worksummary(@Param("PersonalUserid") String PersonalUserid,@Param("PersonalreviewID") String PersonalreviewID);
     //    4.3.15	个人其他材料表（personal_others）
        Personal_others GetPersonal_others(@Param("PersonalUserid") String PersonalUserid,@Param("PersonalreviewID") String PersonalreviewID);


//        Personal_introduceman INSERTpersonal_introduceman(@Param("PersonalUserid") String PersonalUserid,@Param("PersonalreviewID") String PersonalreviewID,@Param("Materialsname") String Materialsname,@Param("Materialsadjunct") String Materialsadjunct);

}
