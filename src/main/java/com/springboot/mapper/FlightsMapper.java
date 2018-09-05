package com.springboot.mapper;

import com.springboot.entity.FlightTickets;
import com.springboot.entity.Flights;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
public interface FlightsMapper {
    //根据前台输入的flightDate startport endport查询航班信息
    public List<Flights> findByConditions(@Param("date")String date,
                                          @Param("startport") String startport,
                                          @Param("endport") String endport,
                                          @Param("startport1") String startport1,
                                          @Param("endport1") String endport1
    );



    //根据航班id去查机票
    public List<FlightTickets> findById(@Param("id") Integer id);

    //根据城市查机场
    public String findport(String area);
}
