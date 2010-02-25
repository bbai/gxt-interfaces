package gxt.client.visual.implementations;

import gxt.client.visual.interfaces.ITextArea;

import com.extjs.gxt.ui.client.widget.form.TextArea;

/**
 * @author eugenp
 */
public final class VTextArea extends TextArea implements ITextArea{
	
	public VTextArea(){
		super();
	}
	
	//
	public TextArea getComponent(){
		return this;
	}
	
}
