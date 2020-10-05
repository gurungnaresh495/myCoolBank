package com.bank.DAO;

import com.bank.Entity.Receipt;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReceiptRepo extends JpaRepository< Receipt, Integer> {
}
