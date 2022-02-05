package br.com.diniz.desafio.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
public class Paciente implements Serializable{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(name = "nome")
    private String nome;
    @Column(name = "idade")
    private Integer idade;
    @Column(name = "cpf")
    private String cpf;
    @Column(name = "rg")
    private String rg;
    @Column(name = "data_nasc")
    private String data_nasc;
    @Column(name = "sexo")
    private String sexo;
    @Column(name = "signo")
    private String signo;
    @Column(name = "mae")
    private String mae;
    @Column(name = "pai")
    private String pai;
    @Column(name = "email")
    private String email;
    @Column(name = "senha")
    private String senha;
    @Column(name = "cep")
    private String cep;
    @Column(name = "endereco")
    private String endereco;
    @Column(name = "numero")
    private String numero;
    @Column(name = "bairro")
    private String bairro;
    @Column(name = "cidade")
    private String cidade;
    @Column(name = "estado")
    private String estado;
    @Column(name = "telefone_fixo")
    private String telefone_fixo;
    @Column(name = "celular")
    private String celular;
    @Column(name = "altura")
    private String altura;
    @Column(name = "peso")
    private Integer peso;
    @Column(name = "tipo_sanguino")
    private String tipo_sanguino;
    @Column(name = "cor")
    private String cor;
    
}
