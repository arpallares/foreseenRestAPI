package app.foreseenpoc.transformer;

import app.foreseenpoc.domain.Userpoc;
import app.foreseenpoc.to.UserpocTO;

import java.util.ArrayList;
import java.util.List;

public class UserpocTransformer {
    public static UserpocTO getTO(Userpoc origin){
         return new UserpocTO(origin.getIduserpoc(), origin.getUsername(), EntityTransformer.getTO(origin.getPerson()));
    }
    public static List<UserpocTO> getTOs(List<Userpoc> origin){
        List<UserpocTO> nList = new ArrayList<>();
        for(Userpoc nitem : origin){
            nList.add(getTO(nitem));
        }
        return nList;
    }
}