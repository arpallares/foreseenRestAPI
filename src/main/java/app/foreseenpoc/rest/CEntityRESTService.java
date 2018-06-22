package app.foreseenpoc.rest;

import app.foreseenpoc.service.CEntityService;
import app.foreseenpoc.to.CEntityTO;
import app.foreseenpoc.transformer.CEntityTransformer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import java.util.List;

@Service
@Path("/catalogs")
public class CEntityRESTService {
    @Autowired
    private CEntityService cEntityService;

    @GET
    @Path("/centities")
    @Produces("application/json")
    public List<CEntityTO> getAll(){
        return CEntityTransformer.getTOs(cEntityService.getAll());
    }

    @GET
    @Path("/centities/{id}")
    @Produces("application/json")
    public CEntityTO getCEntityById(@PathParam("id") int id){
        return CEntityTransformer.getTO(cEntityService.getEntityById(id));
    }
}
