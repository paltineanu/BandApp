package com.incrys.controller;

import com.incrys.service.BandService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

/**
 * Created by User on 7/27/2017.
 */

@Controller
@RequestMapping(value = "/band")
public class BandController {

    @Autowired
    BandService bandService;



    @RequestMapping(method = RequestMethod.POST)
    @ResponseBody
    public BandDTO addBand(@Validated @RequestBody BandDTO bandDTO)
    {
       return bandService.addBand(bandDTO);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    @ResponseBody
    public void deleteBand(@PathVariable int id)
    {
        bandService.deleteBand(id);
    };

    @RequestMapping(value = "/{id}", method = RequestMethod.PUT)
    @ResponseBody
    public BandDTO updateBand(@PathVariable int id, @RequestBody BandDTO bandDTO) {
        return bandService.updateBand(id, bandDTO);
    }
}