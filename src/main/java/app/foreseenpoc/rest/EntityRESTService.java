package app.foreseenpoc.rest;

import app.foreseenpoc.domain.Entity;
import app.foreseenpoc.service.CEntityService;
import app.foreseenpoc.service.EntityService;
import app.foreseenpoc.to.CEntityTO;
import app.foreseenpoc.to.EntityTO;
import app.foreseenpoc.transformer.CEntityTransformer;
import app.foreseenpoc.transformer.EntityTransformer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.ws.rs.*;
import java.util.List;

@Service
@Path("/business")
public class EntityRESTService {
    @Autowired
    private EntityService entityService;

    @GET
    @Path("/entities")
    @Produces("application/json")
    public List<EntityTO> getAll(){
        return EntityTransformer.getTOs(entityService.getAll());
    }

    @GET
    @Path("/entities/{id}")
    @Produces("application/json")
    public EntityTO getCEntityById(@PathParam("id") int id){
        return EntityTransformer.getTO(entityService.getEntityById(id));
    }

    @POST
    @Path("/entity")
    @Produces("application/json")
    public EntityTO createEntity(Entity entity){
        return EntityTransformer.getTO(entityService.createEntity(entity));
    }
}
