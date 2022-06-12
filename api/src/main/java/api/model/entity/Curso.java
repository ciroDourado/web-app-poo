package api.model.entity;

import api.model.util.CargaHoraria;

import java.util.Objects;
import java.util.ArrayList;
import java.util.List;

import java.time.LocalDate;

import javax.persistence.*;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(
	name = "cursos",
	indexes = {
		@Index(
			columnList = "titulo, data_inicio",
			unique = true,
			name = "unique_titulo_dataInicio"
		)
	}
)
public class Curso {

  @Id
	@GeneratedValue
	private Long id;

	@Column(nullable = false)
	private String titulo;

	@Column(name = "carga_horaria", nullable = false)
  // @Enumerated(EnumType.STRING)
  // private CargaHoraria cargaHoraria;
  private String cargaHoraria;

  @Column(name = "data_inicio")
  private LocalDate dataInicio;

	@JsonIgnoreProperties({"curso"})
  @OneToMany(mappedBy = "curso", cascade = CascadeType.ALL)
  private List<Videoaula> videoaulas;

  public Curso() {}

  public Curso(String cargaHoraria, LocalDate dataInicio, String titulo) {
		this.titulo = titulo;
		this.cargaHoraria = cargaHoraria;
		this.dataInicio = dataInicio;
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

  // public CargaHoraria getCargaHoraria() {
  //   return cargaHoraria;
  // }
	//
  // public void setCargaHoraria(CargaHoraria cargaHoraria) {
  //   this.cargaHoraria = cargaHoraria;
  // }

  public String getCargaHoraria() {
    return cargaHoraria;
  }

  public void setCargaHoraria(String cargaHoraria) {
    this.cargaHoraria = cargaHoraria;
  }

  public LocalDate getDataInicio() {
    return dataInicio;
  }

  public void setDataInicio(LocalDate dataInicio) {
    this.dataInicio = dataInicio;
  }

  public List<Videoaula> getVideoaulas() {
    return videoaulas;
  }

  public void setVideoaulas(List<Videoaula> videoaulas) {
    this.videoaulas = videoaulas;
  }

  public void addVideoaula(Videoaula videoaula) {
    if (this.videoaulas == null) {
      this.videoaulas = new ArrayList<>();
    }
    videoaula.setCurso(this);
    this.videoaulas.add(videoaula);
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;

    Curso curso = (Curso) o;
    return id != null ? id.equals(curso.id) : curso.id == null;
  }

  @Override
  public int hashCode() {
    return id != null ? id.hashCode() : 0;
  }

  @Override
  public String toString() {
    return "Curso{" + "id=" + id + '}';
  }
}
