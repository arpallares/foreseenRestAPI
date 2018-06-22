package app.foreseenpoc.service;

import app.foreseenpoc.domain.CEntity;
import app.foreseenpoc.repository.CEntityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class CEntityService {
    @Autowired
    private CEntityRepository cEntityRepository;
    public List<CEntity> getAll(){ return cEntityRepository.findAll(); }
    public CEntity getEntityById(int id){ return cEntityRepository.findById(id).get(); }
    public String getTable(int id){ return cEntityRepository.findById(id).get().getTable(); }
}
