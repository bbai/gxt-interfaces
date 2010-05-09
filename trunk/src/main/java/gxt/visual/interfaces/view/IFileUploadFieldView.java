package gxt.visual.interfaces.view;

import com.extjs.gxt.ui.client.event.ComponentEvent;
import com.extjs.gxt.ui.client.widget.form.FileUploadField.FileUploadFieldMessages;
import com.google.gwt.dom.client.InputElement;
import com.google.gwt.user.client.Event;
import com.google.gwt.user.client.ui.AbstractImagePrototype;

/**
 * @author eugenp
 */
public interface IFileUploadFieldView extends ITextFieldView< String >{
	
	/**
	 * A comma-separated list of content types that a server processing this form will handle correctly.
	 */
	String getAccept();
	
	/**
	 * Returns the button icon class.
	 */
	AbstractImagePrototype getButtonIconStyle();
	
	/**
	 * Returns the button offset.
	 */
	int getButtonOffset();
	
	/**
	 * Returns the file input element. You should not store a reference to this. When resetting this field the file input will change.
	 */
	InputElement getFileInput();
	
	FileUploadFieldMessages getMessages();
	
	String getName();
	
	void onBrowserEvent( Event event );
	
	void onComponentEvent( ComponentEvent ce );
	
	void reset();
	
	/**
	 * A comma-separated list of content types that a server processing this form will handle correctly.
	 */
	void setAccept( String accept );
	
	/**
	 * Sets the button icon class.
	 * @param buttonIconStyle the button icon style
	 */
	void setButtonIcon( AbstractImagePrototype buttonIconStyle );
	
	/**
	 * Sets the number of pixels between the input element and the browser button (defaults to 3).
	 */
	void setButtonOffset( int buttonOffset );
	
	void setName( String name );
	
	void setReadOnly( boolean readOnly );

}
