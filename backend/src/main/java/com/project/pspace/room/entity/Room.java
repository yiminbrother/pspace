package com.project.pspace.room.entity;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data 
@AllArgsConstructor 
@NoArgsConstructor 
public class Room {

    // 방번호
    private int roomId;
    // 방이름
    private String roomName;
    // 방타입(CODE, DOC, DRIVE)
    private String roomType;
    // 생설일자
    private Date createAt;
    
}
