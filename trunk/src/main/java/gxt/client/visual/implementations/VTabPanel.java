package gxt.client.visual.implementations;

import gxt.client.visual.interfaces.ITabPanel;

import com.extjs.gxt.ui.client.widget.TabPanel;

/**
 * @author eugenp
 */
public final class VTabPanel extends TabPanel implements ITabPanel{
	
	public VTabPanel(){
		super();
	}
	
	//
	public TabPanel getComponent(){
		return this;
	}
}
