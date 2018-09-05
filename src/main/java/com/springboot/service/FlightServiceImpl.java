package com.springboot.service;

import com.springboot.entity.FlightTickets;
import com.springboot.entity.Flights;
import com.springboot.mapper.FlightsMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service("flightService")
public class FlightServiceImpl implements FlightService {
    @Resource
    private FlightsMapper flightsMapper;

    public List<FlightTickets> findById(Integer id) {
        System.out.println("实现类里"+id);
        return flightsMapper.findById(id);
    }
    public String findport(String area) {
        return flightsMapper.findport(area);
    }
    public List<Flights> findByConditions(String date, String startport,
                                          String endport, String startport1, String endport1) {
        return flightsMapper.findByConditions(date, startport, endport, startport1, endport1);
    }

}
