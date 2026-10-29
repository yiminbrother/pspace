package com.project.pspace.room.service;

import org.springframework.stereotype.Service;

import com.project.pspace.room.dao.RoomDao;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Service 
@Slf4j 
@RequiredArgsConstructor 
public class RoomService {
    private final RoomDao roomDao;
    
}
