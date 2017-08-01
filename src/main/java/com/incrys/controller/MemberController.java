package com.incrys.controller;

import com.incrys.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * Created by User on 7/27/2017.
 */

@Controller
@RequestMapping(value = "/band")
public class MemberController {

    @Autowired
    MemberService memberService;

    @RequestMapping(value = "/{id}/member", method = RequestMethod.POST)
    @ResponseBody
    public MemberDTO addBand(@PathVariable int id, @RequestBody MemberDTO memberDTO)
    {
        return memberService.addMember(id, memberDTO);
    }
}