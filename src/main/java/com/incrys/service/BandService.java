package com.incrys.service;

import com.incrys.controller.BandDTO;
import com.incrys.repository.Band;
import com.incrys.repository.BandRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by User on 7/27/2017.
 */

@Service
public class BandService {

    @Autowired
    BandRepository bandRepository;

    public BandDTO addBand(BandDTO bandDTO) {
        Band band = new Band();
        band.setBand_name(bandDTO.getBand_name());
        band.setFormation_date(bandDTO.getFormation_date());
        Band savedBand = bandRepository.save(band);
        return new BandDTO(savedBand.getId(), savedBand.getBand_name(), savedBand.getFormation_date());
    }

    public BandDTO updateBand(int id, BandDTO bandDTO) {
            Band band = bandRepository.findOne(id);
            band.setBand_name(bandDTO.getBand_name());
            band.setFormation_date(bandDTO.getFormation_date());
            bandRepository.save(band);
            return new BandDTO(band.getId(), band.getBand_name(), band.getFormation_date());
    }

    public void deleteBand(int id) {
            Band band = bandRepository.findOne(id);
            bandRepository.delete(band);
    }
}