package com.project.pspace.room.entity;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data 
@AllArgsConstructor 
@NoArgsConstructor 
public class Room {
    private long id;
    private String password;
    private String name;
    private String userId;
    private boolean status;
    private Date createAt;
    
}
