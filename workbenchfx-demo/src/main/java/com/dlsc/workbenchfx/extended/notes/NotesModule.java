package com.dlsc.workbenchfx.extended.notes;

import com.dlsc.workbenchfx.module.WorkbenchModule;
import de.jensd.fx.glyphs.fontawesome.FontAwesomeIcon;
import javafx.scene.Node;

public class NotesModule extends WorkbenchModule {

  public NotesModule() {
    super("Notes", FontAwesomeIcon.PENCIL_SQUARE);
  }

  @Override
  public Node activate() {
    return new NotesView();
  }

}
