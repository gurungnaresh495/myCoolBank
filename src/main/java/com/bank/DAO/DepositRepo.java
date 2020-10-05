package com.bank.DAO;

import com.bank.Entity.Deposit;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepositRepo extends JpaRepository<Deposit, Integer> {
}
