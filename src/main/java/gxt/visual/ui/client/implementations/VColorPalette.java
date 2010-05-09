package gxt.visual.ui.client.implementations;

import gxt.visual.ui.client.interfaces.IColorPalette;

import com.extjs.gxt.ui.client.widget.ColorPalette;

/**
 * @author eugenp
 */
public class VColorPalette extends ColorPalette implements IColorPalette{
	
	public VColorPalette(){
		super();
	}
	
	//
	@Override
	public ColorPalette getComponent(){
		return this;
	}
	
}
