package com.meowgavbot1000.service;

import com.meowgavbot1000.entities.Currency;
import com.meowgavbot1000.service.impl.NbrbCurrencyConversionService;

public interface CurrencyConversionService {
    static CurrencyConversionService getInstance() {
        return new NbrbCurrencyConversionService();
    }

    double getConversionRatio(Currency original, Currency target);
}
