package gxt.visual.ui.client.implementations;

import gxt.visual.ui.client.interfaces.IProgressBar;

import com.extjs.gxt.ui.client.widget.ProgressBar;

/**
 * @author eugenp
 */
public class VProgressBar extends ProgressBar implements IProgressBar{
	
	@Override
	public ProgressBar getComponent(){
		return this;
	}
	
}
