package app.foreseenpoc.transformer;

import app.foreseenpoc.domain.Relation;
import app.foreseenpoc.to.RelationTO;

import java.util.ArrayList;
import java.util.List;

public class RelationTransformer {
    public static RelationTO getTO(Relation origin){
         return new RelationTO(origin.getEntity1().getIdentity(), origin.getEntity2().getIdentity(), CEntityTransformer.getTO(origin.getEntity1().getCEntity()), CEntityTransformer.getTO(origin.getEntity2().getCEntity()), origin.getAffinity(), origin.getFrequency());
    }
    public static List<RelationTO> getTOs(List<Relation> origin){
        List<RelationTO> nList = new ArrayList<>();
        for(Relation nitem : origin){
            nList.add(getTO(nitem));
        }
        return nList;
    }
}