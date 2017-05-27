package com.crunchify.restjersey;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

/**
 * Created by Alex on 5/27/2017.
 */
@Path("/status")
public class StatusService {

    @GET
    @Produces("application/json")
    public String getStatus(){
        return "Daca citesti mesajul asta inseamna ca totul a mers! \nMai inseamna si ca pot sa te ajut sa faci cam orice serviciu pentru" +
                " prezentarea ta.";
    }
}
