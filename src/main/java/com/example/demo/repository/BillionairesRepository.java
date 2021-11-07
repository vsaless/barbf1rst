package com.example.demo.repository;

import com.example.demo.entity.BillionairesEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BillionairesRepository extends JpaRepository<BillionairesEntity,Integer> {

}
