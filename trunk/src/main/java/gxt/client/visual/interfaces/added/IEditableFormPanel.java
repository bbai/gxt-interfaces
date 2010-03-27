package gxt.client.visual.interfaces.added;

import gxt.client.visual.interfaces.IFormPanel;

public interface IEditableFormPanel extends IFormPanel{
	public boolean isDefaultEditable();
	
	public void clearAllInvalid();
	
}
