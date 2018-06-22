package app.foreseenpoc.rest;

import app.foreseenpoc.service.CSNetService;
import app.foreseenpoc.to.CSNetTO;
import app.foreseenpoc.transformer.CSNetTransformer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import java.util.List;

@Service
@Path("/catalogs")
public class CSNetRESTService {
    @Autowired
    private CSNetService csNetService;

    @GET
    @Path("/csnets")
    @Produces("application/json")
    public List<CSNetTO> getAll(){ return CSNetTransformer.getTOs(csNetService.getAll()); }

    @GET
    @Path("/csnets/{id}")
    @Produces("application/json")
    public CSNetTO getCSNetById(@PathParam("id") int id){ return CSNetTransformer.getTO(csNetService.getCSNetById(id));}
}
