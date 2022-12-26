package com.example.springvalutdemo;

import org.springframework.context.annotation.Configuration;
import org.springframework.vault.authentication.ClientAuthentication;
import org.springframework.vault.authentication.TokenAuthentication;
import org.springframework.vault.client.VaultEndpoint;
import org.springframework.vault.config.AbstractVaultConfiguration;

@Configuration
public class VaultConfiguration extends AbstractVaultConfiguration {

        @Override
        public VaultEndpoint vaultEndpoint() {
            return new VaultEndpoint();
        }

        @Override
        public ClientAuthentication clientAuthentication() {
            return new TokenAuthentication("s.6Q4X4X4X4X4X4X4X4X4X4X4X");
        }


}
