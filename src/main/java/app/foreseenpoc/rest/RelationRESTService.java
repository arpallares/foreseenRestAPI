package app.foreseenpoc.rest;

import app.foreseenpoc.service.RelationService;
import app.foreseenpoc.to.*;
import app.foreseenpoc.transformer.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import javax.ws.rs.*;
import javax.ws.rs.core.GenericEntity;
import javax.ws.rs.core.Response;
import java.util.List;

@Service
@Path("/business")
public class RelationRESTService {

    @Autowired
    private RelationService rs;

    @GET
    @Produces("application/json")
    @Path("/relations/{id}")
    public Response getEntities(@PathParam("id") int id, @QueryParam("entitytype") String entityType){
        GenericEntity entity = null;
        List<EntityTO> entities = EntityTransformer.getTOs(rs.getEntityEntities(id, entityType));
        entity = new GenericEntity<List<EntityTO>>(entities){};
        return Response.ok(entity).build();
    }

}
