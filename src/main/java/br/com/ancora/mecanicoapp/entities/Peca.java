package br.com.ancora.mecanicoapp.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table (name = "PECA")

@Getter
@Setter
public class Peca {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String nome;
    private String fabricante;
    private double preco;
}
