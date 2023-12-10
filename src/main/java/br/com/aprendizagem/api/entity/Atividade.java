package br.com.aprendizagem.api.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;

@Data
@Entity
@Table(name = "atividade")
@AllArgsConstructor
@NoArgsConstructor
public class Atividade {

    @Id
    @Column(name = "atividade_id")
    private Long id;

    @Column(name = "atividade_titulo")
    private String titulo;

    @Column(name = "atividade_descricao")
    private String descricao;

    @Column(name = "atividade_data_inicio")
    private LocalDateTime dataInicio;

    @Column(name = "atividade_data_fim")
    private LocalDateTime dataFim;

    @Column(name = "atividade_duracao_minutos")
    private Integer duracaoMinutos;

    @Column(name = "atividade_ordem")
    private Integer ordem;

    @Column(name = "atividade_status")
    private Integer status;

    @JsonIgnore
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name ="situacao_aprendizagem_id")
    private SituacaoAprendizagem situacaoAprendizagem;

    @ManyToOne
    @JoinColumn(name ="atividade_tipo_id")
    private AtividadeTipo atividadeTipo;

    @ManyToOne
    @JoinColumn(name ="grau_dificuldade_id")
    private GrauDificuldade grauDificuldade;

}
