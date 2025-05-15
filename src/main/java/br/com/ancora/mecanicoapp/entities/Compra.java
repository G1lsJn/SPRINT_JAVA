package br.com.ancora.mecanicoapp.entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.DecimalMin;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "COMPRA")

@Getter
@Setter
public class Compra {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_COMPRA")
    private int id;

    @NotNull(message = "Usuário não encontrado!")
    @ManyToOne
    @JoinColumn(name = "ID_USUARIO", nullable = false) // chave estrangeira no banco
    private Usuario usuario;

    @OneToOne
    @JoinColumn(name = "ID_CARRINHO", nullable = false)
    private Carrinho carrinho;

    @DecimalMin(value = "0.1", message = "O preço deve ser maior que zero!")
    @Column(name = "PRECOTOTAL")
    private double valorTotal;

    @Column(name = "DATA_COMPRA")
    private String dataCompra;

    @NotNull(message = "O status deve ser informado!")
    @Column(name = "STATUS")
    private String status;

    @NotNull(message = "A forma de pagamento deve ser informada!")
    @Column(name = "FORMA_PAGAMENTO")
    private String formaPagamento;

}
