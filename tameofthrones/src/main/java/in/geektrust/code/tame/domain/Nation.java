package in.geektrust.code.tame.domain;

import java.util.List;
import lombok.Data;

@Data
public class Nation {

  private String name;
  private List<String> alliances;
  private List<TextMessage> textMessage;

}
