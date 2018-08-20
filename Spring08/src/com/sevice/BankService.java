package com.sevice;

public interface BankService {
    /**
     * A向B转账count元
     * @param count 转多少钱
     * @param userIdA A账户
     * @param userIdB B账户
     */
    public default void transferAccounts(int count, int userIdA, int userIdB) {

    }
}
