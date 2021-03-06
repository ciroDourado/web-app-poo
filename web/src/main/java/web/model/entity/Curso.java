package web.model.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Curso {

  private Long            id;
	private String          titulo;
	private String          cargaHoraria;
	private String          dataInicio;
  private List<Videoaula> videoaulas;

  public Curso() {}

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

  public String getDataInicio() {
    return dataInicio;
  }

  public void setDataInicio(String dataInicio) {
    this.dataInicio = dataInicio;
  }

  public List<Videoaula> getVideoaulas() {
    return videoaulas;
  }

  public void setVideoaulas(List<Videoaula> videoaulas) {
    this.videoaulas = videoaulas;
  }

	@Override
	public String toString()
	{
		return 
    "{" +
      "\"id\":" + this.getId() + "," +
      "\"titulo\":" + "\"" + this.getTitulo() + "\"" + "," +
      "\"dataInicio\":" + "\"" + this.getDataInicio() + "\"" + "," +
      "\"cargaHoraria\":" + "\"" + this.getCargaHoraria() + "\"" +
    "}";
	}
}
