package gxt.client.visual.interfaces.added;

import gxt.client.visual.interfaces.IFormPanel;

/**
 * @author eugenp
 */
public interface IEditableFormPanel extends IFormPanel{
	
	boolean isDefaultEditable();
	
	void clearAllInvalid();
	
}
