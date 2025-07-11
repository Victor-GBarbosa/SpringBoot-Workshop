package curse.java.springbootworkshop.resources.execptions;

import java.io.Serializable;
import java.time.Instant;

public class StandardError implements Serializable {

  private Instant timestamp;
  private Integer status;
  private String error;
  private String message;
  private String path;

  public StandardError(String error, String message, String path, Integer status, Instant timestamp) {
    this.error = error;
    this.message = message;
    this.path = path;
    this.status = status;
    this.timestamp = timestamp;
  }

  public StandardError() {

  }

  public String getError() {
    return error;
  }

  public void setError(String error) {
    this.error = error;
  }

  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public String getPath() {
    return path;
  }

  public void setPath(String path) {
    this.path = path;
  }

  public Integer getStatus() {
    return status;
  }

  public void setStatus(Integer status) {
    this.status = status;
  }

  public Instant getTimestamp() {
    return timestamp;
  }

  public void setTimestamp(Instant timestamp) {
    this.timestamp = timestamp;
  }
}
