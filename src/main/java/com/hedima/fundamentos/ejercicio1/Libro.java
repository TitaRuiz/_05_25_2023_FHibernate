package com.hedima.fundamentos.ejercicio1;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "libros")
public class Libro {
        @Id
        @Column(length = 20)
        private String isbn;
        @Column(length = 60, nullable = false)
        private String titulo;
        @Column(length = 60, nullable = false)
        private String autor;
        private int numeroEjemplares;

        @ManyToOne
        @JoinColumn(name = "id_tema",
        nullable = false,
        foreignKey = @ForeignKey(name = "fk_libros_temas"))
        private Tema t;

    }

