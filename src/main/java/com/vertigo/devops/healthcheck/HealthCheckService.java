package com.vertigo.devops.healthcheck;

import org.eclipse.microprofile.rest.client.inject.RestClient;

import jakarta.enterprise.context.Dependent;
import jakarta.inject.Inject;

@Dependent
public class HealthCheckService {

    @Inject
	@RestClient
	private PersistenciaHCIntegration pIntegration;

    @Inject
	@RestClient
	private NegocioHCIntegration nIntegration;

    public String getPersistenceHealth(){
        return pIntegration.getPersistenciaHealth();
    }

    public String getNegocioHealth(){
        return nIntegration.getNegocioHealth();
    }    
}
