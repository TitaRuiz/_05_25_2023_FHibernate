package com.hedima.fundamentos.repositorio;

import com.hedima.fundamentos.modelo.unoamuchos.Departamento;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IDepartamentoRepo extends JpaRepository<Departamento,Integer> {
}
