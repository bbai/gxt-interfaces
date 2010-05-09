package gxt.visual.ui.client.implementations;

import gxt.visual.ui.client.interfaces.IVerticalPanel;

import com.extjs.gxt.ui.client.widget.VerticalPanel;

/**
 * @author eugenp
 */
public class VVerticalPanel extends VerticalPanel implements IVerticalPanel{
	
	public VVerticalPanel(){
		super();
	}
	
	//
	public VerticalPanel getComponent(){
		return this;
	}
	
}
