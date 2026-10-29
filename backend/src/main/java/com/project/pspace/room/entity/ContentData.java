package com.project.pspace.room.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data 
@NoArgsConstructor 
@AllArgsConstructor 
public class ContentData {
    // 내용 번호
    private int contentId;

    // 본문 
    private String body;
}
