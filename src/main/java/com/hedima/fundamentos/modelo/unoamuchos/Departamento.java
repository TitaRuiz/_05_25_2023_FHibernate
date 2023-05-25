package com.hedima.fundamentos.modelo.unoamuchos;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "departamentos")
public class Departamento {
    @Id
    @Column(name = "id_departamento")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idDepartamento;
    @Column(length =30, nullable = false)
    private String nombreDepartamento;

    @OneToMany(mappedBy = "d",
    cascade = CascadeType.ALL,
    fetch = FetchType.EAGER)
    private List<Empleado> empleados;

    public Departamento(String nombreDepartamento) {
        this.nombreDepartamento = nombreDepartamento;
    }
}
