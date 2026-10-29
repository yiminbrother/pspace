package com.project.pspace.room.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data 
@AllArgsConstructor 
@NoArgsConstructor 
public class RoomReqeust {
    private int roomId;
    private String roomName;
}
