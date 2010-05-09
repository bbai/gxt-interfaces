package gxt.visual.ui.client.implementations;

import gxt.visual.ui.client.interfaces.ITabPanel;

import com.extjs.gxt.ui.client.widget.TabPanel;

/**
 * @author eugenp
 */
public class VTabPanel extends TabPanel implements ITabPanel{
	
	public VTabPanel(){
		super();
	}
	
	//
	public TabPanel getComponent(){
		return this;
	}
}
