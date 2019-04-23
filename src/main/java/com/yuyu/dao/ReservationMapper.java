package com.yuyu.dao;

import com.yuyu.pojo.Reservation;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ReservationMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Reservation record);

    int insertSelective(Reservation record);

    Reservation selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Reservation record);

    int updateByPrimaryKey(Reservation record);

    int getnumberBystoreid(int storeid);

    int countBystoreid(int storeid);

    List<Reservation> reservationBystoreid(int storeid);

    int getIdBystoreid(@Param("storeid") int storeid,@Param("rnumber") int number);
}