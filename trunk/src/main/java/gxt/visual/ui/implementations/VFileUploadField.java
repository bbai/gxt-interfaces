package gxt.visual.ui.implementations;

import gxt.visual.interfaces.IFileUploadField;

import com.extjs.gxt.ui.client.widget.form.FileUploadField;

/**
 * @author eugenp
 */
public class VFileUploadField extends FileUploadField implements IFileUploadField{
	
	public VFileUploadField(){
		super();
	}
	
	public FileUploadField getComponent(){
		return this;
	}
	
}
