package com.vertigo.devops;

import com.vertigo.devops.healthcheck.HealthCheckService;

import jakarta.inject.Inject;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;


@Path("/hello")
public class GreetingResource {

    @Inject
    private HealthCheckService hService;

    @GET
    @Path("/api")
    @Produces(MediaType.TEXT_PLAIN)
    public String hello() {
       return "Olá eu sou a API da Internet!";
    }

    @GET
    @Path("/como-esta-minha-saude")
    public String comoEstaMinhaSaude(){        
        return hService.getPersistenceHealth();
    }

    @GET
    @Path("/posso-atender-ao-negocio")
    public String possoAtenderAoNegocio(){        
        return hService.getNegocioHealth();
    }
}
