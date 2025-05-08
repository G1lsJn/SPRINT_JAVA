package br.com.ancora.mecanicoapp.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Entity
@Table(name = "CARRINHO")

@Getter
@Setter
public class Carrinho {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @ManyToOne
    @JoinColumn(name = "idUsuario") // chave estrangeira no banco
    private Usuario usuario;

    @ManyToOne
    @JoinColumn(name = "idPeca") // chave estrangeira no banco
    private Peca peca;

    private int quantidade;
    private LocalDateTime dataCriacao;
    private double total;
}
