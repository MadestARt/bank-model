package com.bank.persistence.entity;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class UserEntity {

    private String fullName;
    private Citizenship citizenship;
    private String address;
    private String email;
    private String phoneNumber;
    private List<Wallet> walletList;

    public void addWallet(Wallet wallet) {
        walletList.add(wallet);
    }





    
}
