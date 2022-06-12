package api.http.exception;

public class VideoaulaNotFoundException extends RuntimeException {
  public VideoaulaNotFoundException(Long id) {
    super("Could not find videoaula " + id);
  }
}
