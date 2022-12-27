package com.example.springvalutdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.vault.core.VaultOperations;
import org.springframework.vault.support.VaultResponse;
import org.springframework.vault.support.VaultResponseSupport;

import java.util.HashMap;
import java.util.Map;

@Component
public class Template {

    @Autowired
    private VaultOperations vaultOperations;

    public void writeSecrets(String userId, String password) {

        Map<String, String> data = new HashMap<String, String>();
        data.put("password", password);

        vaultOperations.write(userId, data);
    }

    public Person readSecrets(String userId) {

        VaultResponse response = vaultOperations.read(userId);
        return (Person) response.getRequiredData().get("password");
    }


}
