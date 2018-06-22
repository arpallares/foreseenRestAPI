package app.foreseenpoc.service;

import app.foreseenpoc.domain.CSNet;
import app.foreseenpoc.repository.CSNetRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class CSNetService {
    @Autowired
    private CSNetRepository csNetRepository;
    public List<CSNet> getAll(){ return csNetRepository.findAll(); }
    public CSNet getCSNetById(int id){ return csNetRepository.findById(id).get(); }

}
