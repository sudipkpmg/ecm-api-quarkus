package gov.tn.dhs.quarkus.ecm;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/ecm-api/v1/status")
public class StatusResource {

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String status() {
        return "ecm-api-quarkus service is running !!!";
    }

}