package gxt.visual.ui.client.implementations;

import gxt.visual.ui.client.interfaces.IModalPanel;

import com.extjs.gxt.ui.client.widget.ModalPanel;

/**
 * @author eugenp
 */
public class VModalPanel extends ModalPanel implements IModalPanel{
	
	public VModalPanel(){
		super();
	}
	
	//
	public ModalPanel getComponent(){
		return this;
	}
	
}
