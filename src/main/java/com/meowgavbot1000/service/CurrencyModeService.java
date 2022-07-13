package com.meowgavbot1000.service;

import com.meowgavbot1000.entities.Currency;
import com.meowgavbot1000.service.impl.HashMapCurrencyModeService;

public interface CurrencyModeService {

    static CurrencyModeService getInstance() {
        return new HashMapCurrencyModeService();
    }

    Currency getOriginalCurrency(long chatId);

    Currency getTargetCurrency(long chatId);

    void setOriginalCurrency(long chatId, Currency currency);

    void setTargetCurrency(long chatId, Currency currency);
}