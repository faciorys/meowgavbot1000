package com.meowgavbot1000.entities;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum Currency {
    USD(431), EUR(451), BYN(0),AUD(440);

    private final int id;
}
