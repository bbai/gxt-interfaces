package gxt.client.visual.implementations;

import gxt.client.visual.interfaces.IProgressBar;

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
