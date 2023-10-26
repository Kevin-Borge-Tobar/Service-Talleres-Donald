package com.borge.service_taller_donald.services;

import com.borge.service_taller_donald.entities.DocumentoFiscal;
import com.borge.service_taller_donald.entities.Mano_Obra;
import com.borge.service_taller_donald.repositories.Mano_ObraRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@AllArgsConstructor
public class ServiceMano_Obra implements IServiceMano_Obra{
    private Mano_ObraRepository mano_obraRepository;

    @Transactional(readOnly = true)
    @Override
    public List<Mano_Obra> findAll() {
        return mano_obraRepository.findAll();
    }

    @Override
    @Transactional(readOnly = true)
    public Mano_Obra findById(Integer id) {
        return mano_obraRepository.findById(id).orElse(null);
    }

    @Override
    @Transactional
    public Mano_Obra create(Mano_Obra mano_obra) {
        return mano_obraRepository.save(mano_obra);
    }

    @Override
    @Transactional
    public Mano_Obra updated(Mano_Obra mano_obra, Integer id) {
        return mano_obraRepository.save(mano_obra);
    }

    @Override
    @Transactional
    public void deleteById(Integer id) {
        mano_obraRepository.deleteById(id);
    }
}
