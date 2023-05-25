package com.hedima.fundamentos.muchosamuchos;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "productos")
public class Producto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idProducto;
    @Column(length=30, nullable = false)
    private String nombre;
    @Column(length=60, nullable = false)
    private String descripcion;
    private double precio;
    private int cantidadExistencia;

    @ManyToMany
    @JoinTable(name = "proveedores_productos" ,
    joinColumns = @JoinColumn(name = "id_producto", referencedColumnName = "idProducto"),
    inverseJoinColumns = @JoinColumn(name = "id_proveedor", referencedColumnName = "idProveedor"))
    private List<Proveedor> proveedores;


}
