package app.foreseenpoc.service;

import app.foreseenpoc.domain.CSNet;
import app.foreseenpoc.domain.Userpoc;
import app.foreseenpoc.repository.UserpocRepository;
import app.foreseenpoc.repository.UserpocSNetRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class UserpocService {
    @Autowired
    private UserpocRepository userpocRepository;
    @Autowired
    private UserpocSNetRepository userpocSNetRepository;
    public List<Userpoc> getAll() { return userpocRepository.findAll(); }
    public Userpoc getUserpocById(int id) { return userpocRepository.findById(id).get(); }
    public List<CSNet> getCSNetsbyUser(int idU) { return userpocSNetRepository.findByUserId(idU); }
}
