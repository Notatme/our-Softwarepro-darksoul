package com.darksoul.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class personaluser {

    private String PersonalUserid;
    private String PersonalUsername;
    private String UnitUsername;
    private String Email;
    private String Phonenumber;
    private String Headphoto;
    private Date Createdate;

}
