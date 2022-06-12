package api.http.exception;

public class CursoNotFoundException extends RuntimeException {
  public CursoNotFoundException(Long id) {
    super("Could not find curso " + id);
  }
}
