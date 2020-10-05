package com.bank.Service;
import com.bank.Entity.*;

import java.util.List;

public interface BankService {
    public void addUser(User user);

    public void addDeposit(Deposit deposit);

    public void addAccount(Account account);

    public void addReceipt(Receipt receipt);

    public List<User> findAll();
}
