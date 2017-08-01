package com.incrys.repository;

import com.incrys.repository.Member;
import org.springframework.data.repository.CrudRepository;

import javax.transaction.Transactional;

/**
 * Created by User on 7/27/2017.
 */

@Transactional
public interface MemberRepository extends CrudRepository<Member, Integer> {

}
