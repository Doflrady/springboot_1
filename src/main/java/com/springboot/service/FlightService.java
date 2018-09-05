package com.springboot.service;

import com.springboot.entity.FlightTickets;
import com.springboot.entity.Flights;

import java.util.List;

public interface FlightService {
    public List<Flights> findByConditions(String date,
                                          String startport,
                                          String endport,
                                          String startport1,
                                          String endport1
    );

    public List<FlightTickets> findById(Integer id);
    public String findport(String area);
}
