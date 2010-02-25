package gxt.client.visual.implementations;

import gxt.client.visual.interfaces.IFormBinding;

import com.extjs.gxt.ui.client.binding.FormBinding;
import com.extjs.gxt.ui.client.widget.form.FormPanel;

/**
 * @author eugenp
 */
public class VFormBinding extends FormBinding implements IFormBinding{
	
	public VFormBinding( final FormPanel panelToSet ){
		super( panelToSet );
	}
	public VFormBinding( final FormPanel panelToSet, final boolean autoBind ){
		super( panelToSet, autoBind );
	}

	//
	public FormBinding getComponent(){
		return this;
	}
	
}
