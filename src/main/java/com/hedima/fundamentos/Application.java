package com.hedima.fundamentos;

import com.hedima.fundamentos.modelo.unoamuchos.Departamento;
import com.hedima.fundamentos.modelo.unoamuchos.Empleado;
import com.hedima.fundamentos.servicio.IDepartamentoServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class Application implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
    @Autowired
    private IDepartamentoServicio servicio;
    @Override
    public void run(String... args) throws Exception {
        Empleado e1 = new Empleado("Juan Lopez",
                LocalDate.of(2020,04,03),
                LocalDate.of(1988,04,3));
        Empleado e2 = new Empleado("Ana Flores",
                LocalDate.of(2020,04,03),
                LocalDate.of(1988,04,3));

        Departamento d1 = new Departamento("Ventas");
        List<Empleado> empleados = new ArrayList<>();
        empleados.add(e1);
        empleados.add(e2);
        d1.setEmpleados(empleados);
        empleados.forEach(e -> e.setD(d1));
        servicio.crear(d1);

    }
}
