package gxt.client.visual.implementations;

import gxt.client.visual.interfaces.IHtmlContainer;
import com.extjs.gxt.ui.client.widget.HtmlContainer;

/**
 * @author eugenp
 */
public class VHtmlContainer extends HtmlContainer implements IHtmlContainer{
	
	public VHtmlContainer(){
		super();
	}

	//
	public HtmlContainer getComponent(){
		return this;
	}

}
