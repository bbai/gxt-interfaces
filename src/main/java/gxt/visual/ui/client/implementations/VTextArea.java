package gxt.visual.ui.client.implementations;

import gxt.visual.ui.client.interfaces.ITextArea;

import com.extjs.gxt.ui.client.widget.form.TextArea;

/**
 * @author eugenp
 */
public class VTextArea extends TextArea implements ITextArea{
	
	public VTextArea(){
		super();
	}
	
	//
	public TextArea getComponent(){
		return this;
	}
	
}
