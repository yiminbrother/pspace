package com.project.pspace.room.entity;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data 
@NoArgsConstructor 
@AllArgsConstructor 
public class Content {

    // 내용 번호
    private int contentId;
    // 방 번호 
    private int roomId;
    // 부모 폴더
    private int parentId;
    private String contentName;
    private String contentType;
    private String mimeType;
    private String storagePath;
    private Date createdAt;


}
