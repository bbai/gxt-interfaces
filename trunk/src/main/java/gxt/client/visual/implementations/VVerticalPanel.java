package gxt.client.visual.implementations;

import gxt.client.visual.interfaces.IVerticalPanel;

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
