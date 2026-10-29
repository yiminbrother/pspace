package com.project.pspace.room.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.project.pspace.room.dto.Pager;
import com.project.pspace.room.entity.Room;

@Mapper 
public interface RoomDao {
    // 방 만들기
    int createRoom(Room room);  
    // 방 수정하기(ex: 제목)
    int updateRoom(Room room);
    // 방 삭제하기
    int deleteRoom(@Param("roomId") int roomId);
    // 방 정보 가져오기
    Room selectRoomById(@Param("roomId") int roomId);
    // 만들어진 방갯수가져오기
    int countRooms(@Param("where") Map<String, Object> where);
    // 방 페이지로 가져오기 
    List<Room> selectRoomList(@Param("pager") Pager pager, Map<String, Object> where);


} 
