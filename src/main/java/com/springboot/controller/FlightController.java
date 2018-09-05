package com.springboot.controller;

import com.springboot.entity.FlightTickets;
import com.springboot.entity.Flights;
import com.springboot.service.FlightService;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
public class FlightController {


    @Resource
    private FlightService flightService;
    @RequestMapping("main")
    public String find(Model model, String flightDate, String startport,
                       String endport, HttpServletRequest request){
        String startport1=flightService.findport(startport);
        String endport1=flightService.findport(endport);
        List<Flights> list=flightService.findByConditions(flightDate, startport, endport, startport1, endport1);
        model.addAttribute("list", list);
        int size=list.size();
        System.out.println(size);
        request.getSession().setAttribute("size", size);
        return "main";
    }


    @RequestMapping("list")
    public String tiaozhuan(){
        return "main";
    }


    @RequestMapping(name="ticket", produces={"application/json;charset=UTF-8"})
    @ResponseBody
    public List<FlightTickets> find(Integer id){
        System.out.println("controller id"+"id");
        List<FlightTickets> tickets=flightService.findById(id);
        return tickets;
    }

}
