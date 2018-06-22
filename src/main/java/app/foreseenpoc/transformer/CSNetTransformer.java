package app.foreseenpoc.transformer;

import app.foreseenpoc.domain.CSNet;
import app.foreseenpoc.to.CSNetTO;

import java.util.ArrayList;
import java.util.List;

public class CSNetTransformer {
    public static CSNetTO getTO(CSNet origin){
         return new CSNetTO(origin.getIdcsnet(), origin.getName());
    }
    public static List<CSNetTO> getTOs(List<CSNet> origin){
        List<CSNetTO> nList = new ArrayList<>();
        for(CSNet nitem : origin){
            nList.add(getTO(nitem));
        }
        return nList;
    }
}
