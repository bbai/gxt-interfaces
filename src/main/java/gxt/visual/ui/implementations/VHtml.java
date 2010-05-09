package gxt.visual.ui.implementations;

import gxt.visual.interfaces.IHtml;

import com.extjs.gxt.ui.client.widget.Html;

/**
 * @author eugenp
 */
public class VHtml extends Html implements IHtml{
	
	public VHtml(){
		super();
	}
	public VHtml( final String html ){
		super( html );
	}

	//
	public Html getComponent(){
		return this;
	}

}