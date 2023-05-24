package com.vertigo.devops.healthcheck;

import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;

@Path("/hello")
@RegisterRestClient
public interface PersistenciaHCIntegration {
    
    @GET
    String getPersistenciaHealth();
}
