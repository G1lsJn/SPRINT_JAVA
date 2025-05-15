package br.com.ancora.mecanicoapp.entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table (name = "PECA")

@Getter
@Setter
public class Peca {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_PECA", nullable = false)
    private int id;

    @NotBlank(message = "O nome do produto é obrigatório!")
    @Size(max = 100, message = "O nome deve ter no máximo 100 caracteres.")
    @Column(name = "NOME", length = 100)
    private String nome;

    @NotBlank(message = "O nome do fabricante é obrigatório!")
    @Size(max = 100, message = "O nome deve ter no máximo 100 caracteres.")
    @Column(name = "FABRICANTE", nullable = false, length = 100)
    private String fabricante;

    @NotNull(message = "O preço deve ser informado.")
    @Column(name = "PRECO", nullable = false)
    private double preco;
}
