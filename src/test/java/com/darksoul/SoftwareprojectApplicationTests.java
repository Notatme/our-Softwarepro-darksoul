package com.darksoul;

import com.darksoul.Entity.BookCase;
import com.darksoul.Entity.Personal_introduceman;
import com.darksoul.Entity.Personal_others;
import com.darksoul.mapper.PersonalusermessageAddMapper;
import com.darksoul.service.personalUsermessageAddService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SoftwareprojectApplicationTests {

    @Autowired
    PersonalusermessageAddMapper personalusermessageAddMapper;

    @Test
    void contextLoads() {



       personalusermessageAddMapper.personal_messageadd(new Personal_introduceman("333","444","dhsj","sdsd"));
        //System.out.println(a);

       // personalusermessageAddMapper.bookaddtest(new BookCase(7,"22"));
      //int a=  personalusermessageAddMapper.personaladdohtners(new Personal_others("79","76","76","76"));
        //System.out.println(a);
    }

}
