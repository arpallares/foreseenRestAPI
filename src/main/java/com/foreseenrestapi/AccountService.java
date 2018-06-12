package com.foreseenrestapi;

import com.springjpa.Account;
import com.springjpa.AccountsDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class AccountService {

    @Autowired
    private AccountsDao accountsDao;
    @Autowired
    private AccountRepository accountRepository;

    public List<Account> getAllAccounts(){
        return accountRepository.findAll();
    }
    public Account createAccount(Account account){
        return accountsDao.createAccount(account);
    }
    public void deleteAccount(int id){
        accountsDao.deleteAccount(id);
    }
    public Account getAccount(int id){
        return accountsDao.getAccount(id);
    }
    public Account updateAccount(Account account){
        return accountsDao.updateAccount(account);
    }
    public Account updateBalance(int id, double balance){
        return accountsDao.updateBalance(id, balance);
    }
    public Account updateFields(int id, Account updates){
        return accountsDao.updateFields(id, updates);
    }

}
