package api.model.entity;

import javax.persistence.*;

@Entity
@Table(name = "videoaulas")
public class Videoaula {

  @Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  @Column(nullable = false, length = 60)
  private String titulo;

  @Column(nullable = false)
  private String descricao;

  @Column(nullable = false)
  private Integer numero;

  @ManyToOne
  @JoinColumn(name = "id_curso_fk")
  private Curso curso;

  public Videoaula() {}

  public Videoaula(String titulo, String descricao, Integer numero, Curso curso) {
    this.titulo = titulo;
    this.descricao = descricao;
    this.numero = numero;
    this.curso = curso;
  }

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getTitulo() {
    return titulo;
  }

  public void setTitulo(String titulo) {
    this.titulo = titulo;
  }

  public String getDescricao() {
    return descricao;
  }

  public void setDescricao(String descricao) {
    this.descricao = descricao;
  }

  public Curso getCurso() {
    return curso;
  }

  public void setCurso(Curso curso) {
    this.curso = curso;
  }

  public Integer getNumero() {
    return numero;
  }

  public void setNumero(Integer numero) {
    this.numero = numero;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;

    Videoaula videoaula = (Videoaula) o;

    return id != null ? id.equals(videoaula.id) : videoaula.id == null;
  }

  @Override
  public int hashCode() {
    return id != null ? id.hashCode() : 0;
  }

  @Override
  public String toString() {
    return "Videoaula{" + "id=" + id + '}';
  }
}
