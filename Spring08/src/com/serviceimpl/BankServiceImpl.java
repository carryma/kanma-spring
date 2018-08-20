package com.serviceimpl;

import com.dao.BankDao;
import com.daoimpl.BankDaoImpl;
import com.sevice.BankService;
import org.springframework.transaction.annotation.Transactional;

public class BankServiceImpl implements BankService {
    private BankDao bankDao;

    public void setBankDao(BankDao bankDao) {
        this.bankDao = bankDao;
    }

    @Transactional
    @Override
    public void transferAccounts(int count, int userIdA, int userIdB) {
        bankDao.outMoney(count,userIdA);
        bankDao.inMoney(count,userIdB);
    }
}
