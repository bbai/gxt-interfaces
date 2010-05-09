package gxt.visual.ui.client.implementations;

import gxt.visual.ui.client.interfaces.IComposite;

import com.extjs.gxt.ui.client.widget.Composite;

/**
 * @author eugenp
 */
public class VComposite extends Composite implements IComposite{
	
	public VComposite(){
		super();
	}
	
	//
	@Override
	public Composite getComponent(){
		return this;
	}
	
}
