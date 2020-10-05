package com.bank.Service;

import com.bank.DAO.AccountRepo;
import com.bank.DAO.DepositRepo;
import com.bank.DAO.ReceiptRepo;
import com.bank.DAO.UserRepo;
import com.bank.Entity.Account;
import com.bank.Entity.Deposit;
import com.bank.Entity.Receipt;
import com.bank.Entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BankServiceImpl implements BankService{

    @Autowired
    private UserRepo userRepo;

    @Autowired
    private AccountRepo accountRepo;

    @Autowired
    private DepositRepo depositRepo;

    @Autowired
    private ReceiptRepo receiptRepo;

    @Override
    public void addUser(User user) {
        userRepo.save(user);
    }

    @Override
    public void addDeposit(Deposit deposit) {
        depositRepo.save(deposit);
    }

    @Override
    public void addAccount(Account account) {
        accountRepo.save(account);
    }

    @Override
    public void addReceipt(Receipt receipt) {
        receiptRepo.save(receipt);
    }

    @Override
    public List<User> findAll() {
        return userRepo.findAll();
    }
}
