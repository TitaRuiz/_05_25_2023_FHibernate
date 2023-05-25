package com.hedima.fundamentos.servicio;

import com.hedima.fundamentos.modelo.unoamuchos.Departamento;
import com.hedima.fundamentos.repositorio.IDepartamentoRepo;
import com.hedima.fundamentos.servicio.IDepartamentoServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DepartamentoServicioImpl implements IDepartamentoServicio {
    @Autowired
    private IDepartamentoRepo repo;
    @Override
    public Departamento crear(Departamento d) {
        return repo.save(d);
    }
}
