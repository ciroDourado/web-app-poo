package componentapi.model.component.curso;

import componentapi.model.entity.Curso;

public class IndexRow {
  private Curso curso;

  public IndexRow() {}

  public IndexRow(Curso curso) {
    this.curso = curso;
  }
  
  @Override
  public String toString() {
    return 
    "<tr " + "class=\"curso\"" + ">"
    + "<td>" + this.curso.getTitulo()       + "</td>"
    + "<td>" + this.curso.getCargaHoraria() + "</td>"
    + "<td>" + this.curso.getDataInicio()   + "</td>"
    + "</tr>";
  }
}