package com.zohocrm2.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.zohocrm2.entity.Billing;

public interface BillingRepository extends JpaRepository<Billing, Long> {

}
