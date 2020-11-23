package in.geektrust.code.tame.domain;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class TextMessage {

  private String to;
  private String cipherMsg;
  private String plainMsg;

}
