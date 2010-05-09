package gxt.visual.ui.client.interfaces.added;

import gxt.visual.ui.client.interfaces.IFormPanel;

/**
 * @author eugenp
 */
public interface IEditableFormPanel extends IFormPanel{
	
	boolean isDefaultEditable();
	
	void clearAllInvalid();
	
}
