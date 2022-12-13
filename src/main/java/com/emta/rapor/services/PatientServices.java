package com.emta.rapor.services;

import com.emta.rapor.model.Patient;
import com.emta.rapor.repository.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PatientServices {

    @Autowired
    private PatientRepository repo;

    public List<Patient> listAll(){
        return repo.findAll();
    }
    public void save(Patient patient){
        repo.save(patient);
    }
    public Patient get(Long id){
        return repo.findById(id).get();
    }
    public void delete(Long id){
        repo.deleteById(id);
    }

}
