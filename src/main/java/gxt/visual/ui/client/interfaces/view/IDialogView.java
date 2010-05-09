package gxt.visual.ui.client.interfaces.view;

import com.extjs.gxt.ui.client.widget.button.Button;

/**
 * @author eugenp
 */
public interface IDialogView extends IWindowView{
	
	/**
	 * Returns the button's.
	 * @return the buttons the buttons
	 */
	String getButtons();
	
	Button getButtonById( String string );
	
	/**
	 * Returns true if the dialog will be hidden on any button click.
	 * @return the hide on button click state
	 */
	boolean isHideOnButtonClick();
	
	/**
	 * Sets the buttons to display (defaults to OK). Must be one of:
	 * 
	 * <pre>
	 * Dialog.OK
	 * Dialog.CANCEL
	 * Dialog.OKCANCEL
	 * Dialog.YESNO
	 * Dialog.YESNOCANCEL
	 * </pre>
	 */
	void setButtons( String buttons );
	
	/**
	 * True to hide the dialog on any button click.
	 * @param hideOnButtonClick true to hide
	 */
	void setHideOnButtonClick( boolean hideOnButtonClick );

}
