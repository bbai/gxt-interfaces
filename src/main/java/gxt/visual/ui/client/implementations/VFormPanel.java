package gxt.visual.ui.client.implementations;

import gxt.visual.ui.client.interfaces.IFormPanel;

import com.extjs.gxt.ui.client.widget.form.FormPanel;

/**
 * @author eugenp
 */
public class VFormPanel extends FormPanel implements IFormPanel{
	
	public VFormPanel(){
		super();
	}
	
	//
	public FormPanel getComponent(){
		return this;
	}
	
}
