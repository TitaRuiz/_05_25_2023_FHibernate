package com.hedima.fundamentos.ejercicio1;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "temas")
public class Tema {
    @Id
    private int idTema;
    @Column(length = 30)
    private String tema;

    @OneToMany(mappedBy = "t", cascade = CascadeType.ALL,
    fetch = FetchType.EAGER)
    List<Libro> libros;
}
