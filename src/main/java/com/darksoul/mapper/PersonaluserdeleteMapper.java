package com.darksoul.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface PersonaluserdeleteMapper {
    //删除个人基本信息表一项
    public void DeletePersonal_reviewall(@Param("PersonalUserid") String PersonalUserid, @Param("PersonalreviewID") String PersonalreviewID);
    //删除个人学历情况表
     public void DeletePersonal_education(@Param("PersonalUserid") String PersonalUserid, @Param("PersonalreviewID") String PersonalreviewID);

    //   删除个人主要经历表
    public void DeletePersonal_major_experience(@Param("PersonalUserid") String PersonalUserid, @Param("PersonalreviewID") String PersonalreviewID);
    //    删除个人人才引进相关材料表
    void DeletePersonal_introduceman(@Param("PersonalUserid") String PersonalUserid, @Param("PersonalreviewID") String PersonalreviewID);
    //删除个人论文著作表
    void DeletePersonal_paper_patents(@Param("PersonalUserid") String PersonalUserid, @Param("PersonalreviewID") String PersonalreviewID);
    // 删除个人业绩成果表
    void DeletePersonal_performance_achievement(@Param("PersonalUserid") String PersonalUserid, @Param("PersonalreviewID") String PersonalreviewID);
    // 删除个人业绩奖项表
    void DeletePersonal_performance_awards(@Param("PersonalUserid") String PersonalUserid, @Param("PersonalreviewID") String PersonalreviewID);
    // 删除个人业绩专利表
    void DeletePersonal_performance_patents(@Param("PersonalUserid") String PersonalUserid, @Param("PersonalreviewID") String PersonalreviewID);
    // 删除个人从业或执业（职业）资格表
    void DeletePersonal_occupational_qualification(@Param("PersonalUserid") String PersonalUserid, @Param("PersonalreviewID") String PersonalreviewID);
    //  个人国（境）外工作或研究材料表
    void DeletePersonal_research_materials(@Param("PersonalUserid") String PersonalUserid, @Param("PersonalreviewID") String PersonalreviewID);

    void DeletePersonal_worksummary(@Param("PersonalUserid") String PersonalUserid, @Param("PersonalreviewID") String PersonalreviewID);

    void DeletePersonal_others(@Param("PersonalUserid") String PersonalUserid, @Param("PersonalreviewID") String PersonalreviewID);
}
