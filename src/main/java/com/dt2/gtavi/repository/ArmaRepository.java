package com.dt2.gtavi.repository;

import com.dt2.gtavi.entity.Arma;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ArmaRepository extends JpaRepository<Arma, Integer> {
}