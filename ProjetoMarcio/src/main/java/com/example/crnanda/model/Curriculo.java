package com.example.crnanda.model;
import jakarta.persistence.Entity;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "Curriculo ")
public class Curriculo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String objetivo;
    private String experiencia;

    public Curriculo() {

    }

    public Curriculo(String nome, String objetivo, String experiencia) {
        this.nome = nome;
        this.objetivo = objetivo;
        this.experiencia = experiencia;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = "Fernanda Fortunato";
    }

    public String getObjetivo() {
        return objetivo;
    }

    public void setObjetivo(String objetivo) {
        this.objetivo = "Me torna ux designer, ou QA";
    }

    public String getExperiencia() {
        return experiencia;
    }

    public void setExperiencia(String experiencia) {
        this.experiencia = "experiencia em design (ui)" ;
        this.experiencia = "experiencia em front-end";
    }
}
