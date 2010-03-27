package gxt.client.visual.interfaces.view;

import com.extjs.gxt.ui.client.event.ComponentEvent;
import com.extjs.gxt.ui.client.event.SelectionListener;
import com.google.gwt.user.client.ui.AbstractImagePrototype;

public interface IShortcutView {

  /**
   * Adds a selection listener.
   * 
   * @param listener the listener to add
   */
  void addSelectionListener(SelectionListener<? extends ComponentEvent> listener);

  AbstractImagePrototype getIcon();

  /**
   * Returns the shortcuts text.
   * 
   * @return the text
   */
  String getText();

  void onComponentEvent(ComponentEvent ce);

  /**
   * Removes a previously added listener.
   * 
   * @param listener the listener to be removed
   */
  void removeSelectionListener(SelectionListener<? extends ComponentEvent> listener);

  void setIcon(AbstractImagePrototype icon);

  void setIconStyle(String icon);

  /**
   * Sets the shortcuts text.
   * 
   * @param text the text
   */
  void setText(String text);

}