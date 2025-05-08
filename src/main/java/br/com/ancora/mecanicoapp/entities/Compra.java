package br.com.ancora.mecanicoapp.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Entity
@Table(name = "COMPRA")

@Getter
@Setter
public class Compra {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @ManyToOne
    @JoinColumn(name = "idUsuario") // chave estrangeira no banco
    private Usuario usuario;

    private double valorTotal;
    private LocalDateTime dataCompra;
    private String status;
    private String formaPagamento;

}
