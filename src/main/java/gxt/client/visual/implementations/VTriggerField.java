package gxt.client.visual.implementations;

import gxt.client.visual.interfaces.ITriggerField;

import com.extjs.gxt.ui.client.widget.form.TriggerField;

/**
 * @author eugenp
 */
public final class VTriggerField< D > extends TriggerField< D > implements ITriggerField< D >{
	
	public VTriggerField(){
		super();
	}
	
	//
	public TriggerField< D > getComponent(){
		return this;
	}
	
}
