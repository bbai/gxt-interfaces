package gxt.visual.ui.implementations;

import gxt.visual.interfaces.IContentPanel;

import com.extjs.gxt.ui.client.widget.ContentPanel;

/**
 * @author eugenp
 */
public class VContentPanel extends ContentPanel implements IContentPanel{
	
	public VContentPanel(){
		super();
	}
	
	// mine
	public ContentPanel getComponent(){
		return this;
	}

}
