package br.com.ancora.mecanicoapp.entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "CARRINHO")

@Getter
@Setter
public class Carrinho {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @NotNull(message = "Usuário não encontrado!")
    @Column(name = "ID_USUARIO")
    private int idUsuario;

    @NotNull(message = "Peça não encontrada!")
    @Column(name = "ID_PECA")
    private int idPeca;

    @NotNull(message = "A quantidade deve ser informada!")
    @Min(value = 1, message = "A quantidade deve ser ao menos 1 unidade")
    @Column(name = "QUANTIDADE", nullable = false)
    private int quantidade;

   // @PastOrPresent(message = "A data de criação deve ser válida!")
    @Column(name = "DATA_CRIACAO")
    private String dataCriacao;

    @NotNull(message = "O total deve ser informado!")
    @Column(name = "TOTAL", nullable = false)
    private double total;
}
