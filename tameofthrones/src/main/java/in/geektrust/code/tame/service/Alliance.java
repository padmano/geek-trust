package in.geektrust.code.tame.service;

import in.geektrust.code.tame.domain.Nation;
import in.geektrust.code.tame.exception.ApplicationException;

public interface Alliance {

  /**
   * Identify the alliance for each nation
   *
   * @param nation
   * @param msgFilePath
   * @return
   * @throws ApplicationException
   */
  Nation identifyAlliances(Nation nation, String msgFilePath) throws ApplicationException;

}
