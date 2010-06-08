package gxt.visual.ui.client.implementations;

import gxt.visual.ui.client.interfaces.IViewport;

import com.extjs.gxt.ui.client.widget.Viewport;

/**
 * @author ADaroussin
 */
public class VViewport extends Viewport implements IViewport{

	public VViewport(){
		super();
	}

	//
	public Viewport getComponent(){
		return this;
	}

}
