package gxt.visual.interfaces.added;

import gxt.visual.interfaces.IFormPanel;

/**
 * @author eugenp
 */
public interface IEditableFormPanel extends IFormPanel{
	
	boolean isDefaultEditable();
	
	void clearAllInvalid();
	
}
