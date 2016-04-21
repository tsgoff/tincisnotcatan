package edu.brown.cs.board;

import edu.brown.cs.catan.Player;
import edu.brown.cs.catan.Resource;

public interface Building {

  void collectResource(Resource resource);

  Player getPlayer();

}
