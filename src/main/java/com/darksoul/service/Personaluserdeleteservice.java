package com.darksoul.service;


public interface Personaluserdeleteservice {
    //删除个人基本信息表。
    public void DeletePersonal_basic_message(String personalUserid, String personalreviewID);

    //删除个人学历情况表
    public void DeletePersonal_education(String personalUserid, String personalreviewID);

    //   删除个人主要经历表
    public void DeletePersonal_major_experience(String personalUserid, String personalreviewID);
    //    删除个人人才引进相关材料表
    public void DeletePersonal_introduceman(String personalUserid, String personalreviewID);
    //删除个人论文著作表
    void DeletePersonal_paper_patents(String personalUserid, String personalreviewID);
    // 删除个人业绩成果表
    void DeletePersonal_performance_achievement(String personalUserid, String personalreviewID);
    // 删除个人业绩奖项表
    void DeletePersonal_performance_awards(String personalUserid, String personalreviewID);
    // 删除个人业绩专利表
    void DeletePersonal_performance_patents(String personalUserid, String personalreviewID);
    // 删除个人从业或执业（职业）资格表
    void DeletePersonal_occupational_qualification(String personalUserid, String personalreviewID);
    //  个人国（境）外工作或研究材料表
    void DeletePersonal_research_materials(String personalUserid, String personalreviewID);

    void DeletePersonal_worksummary(String personalUserid, String personalreviewID);

    void DeletePersonal_others(String personalUserid, String personalreviewID);
}
