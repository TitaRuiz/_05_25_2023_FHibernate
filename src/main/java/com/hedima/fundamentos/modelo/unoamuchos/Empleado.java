package com.hedima.fundamentos.modelo.unoamuchos;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table(name = "empleados")
public class Empleados {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idEmpleado;
    @Column(length = 60)
    private String nombreEmpleado;
    private LocalDate fContratacion;
    private LocalDate fNacimiento;

    @ManyToOne
    @JoinColumn(name = "id_departamento",
            nullable = false,
            foreignKey = @ForeignKey(name="fk_empleados_departamentos"))
    private Departamento d;

}
