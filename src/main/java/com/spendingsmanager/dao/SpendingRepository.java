package com.spendingsmanager.dao;

import com.spendingsmanager.base.repositories.StandardDomainRepository;
import com.spendingsmanager.entities.Spending;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SpendingRepository extends StandardDomainRepository<Spending> {
}
