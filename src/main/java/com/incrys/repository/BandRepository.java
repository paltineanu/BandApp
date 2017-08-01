package com.incrys.repository;

import com.incrys.repository.Band;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import javax.transaction.Transactional;

/**
 * Created by User on 7/27/2017.
 */

@Transactional
public interface BandRepository extends CrudRepository<Band, Integer>, JpaRepository<Band, Integer> {

    Band findBandById(int id);

}
