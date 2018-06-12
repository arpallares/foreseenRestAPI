package com.springjpa;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Transactional
@Repository
public class AccountsDao{
    @PersistenceContext
    private EntityManager em;

    public Account updateAccount(Account account){
        return em.merge(account);
    }

    public Account createAccount(Account account) {
        em.persist(account);
        return account;
    }

    public Account updateBalance(int id,double newBalance){
        Account account = em.find(Account.class, id);
        if(account != null){
            account.setBalance(newBalance);
        }
        return em.merge(account);
    }

    public void deleteAccount(int id){
        Account account = em.find(Account.class, id);
        if(account != null)
            em.remove(account);
    }
    public List<Account> getAllAccounts(){
        return em.createQuery("select acc from Account acc").getResultList();
    }
    public Account getAccount(int id){
        return em.find(Account.class,id);
    }
    public Account updateFields(int id, Account updates){
        updates.setAccountNumber(id);
        return em.merge(updates);
    }
}
