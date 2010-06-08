package gxt.visual.ui.client.implementations;

import gxt.visual.ui.client.interfaces.IHtmlEditor;

import com.extjs.gxt.ui.client.widget.form.HtmlEditor;

/**
 * @author ADaroussin
 */
public class VHtmlEditor extends HtmlEditor implements IHtmlEditor{
	public VHtmlEditor(){
		super();
	}

	//
	public HtmlEditor getComponent(){
		return this;
	}
}
