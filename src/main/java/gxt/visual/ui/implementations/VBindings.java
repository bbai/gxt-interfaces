package gxt.visual.ui.implementations;

import gxt.visual.interfaces.IBindings;

import com.extjs.gxt.ui.client.binding.Bindings;

/**
 * @author eugenp
 */
public class VBindings extends Bindings implements IBindings{
	
	public VBindings(){
		super();
	}

	//
	public Bindings getComponent(){
		return this;
	}
	
}
