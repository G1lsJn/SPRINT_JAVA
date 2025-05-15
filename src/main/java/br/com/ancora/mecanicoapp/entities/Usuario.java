package br.com.ancora.mecanicoapp.entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "USUARIO")

@Getter
@Setter
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_USUARIO",  unique = true, nullable = false)
    private int id;

    @NotBlank(message = "O nome do usuário é obrigatório!")
    @Size(max = 50, message = "O nome deve ter no máximo 50 caracteres")
    @Column(name = "USUARIO",  nullable = false, length = 50)
    private String nome;

    @Size(max = 100, message = "O email deve ter no máximo 100 caracteres")
    @Column(name = "EMAIL", length = 100)
    private String email;

    @Size(max = 15, message = "A senha deve ter no máximo 15 caracteres")
    @Column(name = "SENHA", length = 15)
    private String senha;

    @Size(max = 15, message = "Telefone inválido!")
    @Column(name = "TELEFONE", length = 15)
    private String telefone;

}
