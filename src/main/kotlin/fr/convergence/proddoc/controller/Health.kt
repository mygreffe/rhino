package fr.convergence.proddoc.controller

import org.apache.kafka.streams.StreamsBuilder
import org.apache.kafka.streams.kstream.Printed
import javax.enterprise.context.ApplicationScoped
import javax.ws.rs.GET
import javax.ws.rs.Path

@Path("/health")
@ApplicationScoped
class Health {

    @GET
    fun health(): String {
        return "OK"
    }

}


