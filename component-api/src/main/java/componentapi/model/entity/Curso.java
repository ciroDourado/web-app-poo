package componentapi.model.entity;

import java.time.LocalDate;

public class Curso {
	private Long      id;
	private String    titulo;
  private String    cargaHoraria;
  private LocalDate dataInicio;

  public Curso() {}

  public Curso(Long id, String titulo, String cargaHoraria, LocalDate dataInicio) {
    this.id           = id;
		this.titulo       = titulo;
		this.cargaHoraria = cargaHoraria;
		this.dataInicio   = dataInicio;
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
}
