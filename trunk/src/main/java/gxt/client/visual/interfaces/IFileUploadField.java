package gxt.client.visual.interfaces;

import com.google.gwt.dom.client.InputElement;

public interface IFileUploadField extends ITextField< String >{
	
	InputElement getFileInput();
	
}
