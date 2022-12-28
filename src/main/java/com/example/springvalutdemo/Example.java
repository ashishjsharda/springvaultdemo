package com.example.springvalutdemo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.vault.annotation.VaultPropertySource;

@VaultPropertySource("secret/myapp")
class Config {

}
public class Example {
    @Value("${password}")
    private String password;

    @Value("${aws.access.key}")
    private String awsAccessKey;

    @Value("${aws.secret.key}")
    private String awsSecretKey;

    public String getPassword() {
        return password;
    }

}
