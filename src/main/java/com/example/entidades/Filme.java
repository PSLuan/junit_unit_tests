package com.example.entidades;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
public class Filme {

    private String nome;
    private Integer estoque;
    private Double precoLocacao;

}