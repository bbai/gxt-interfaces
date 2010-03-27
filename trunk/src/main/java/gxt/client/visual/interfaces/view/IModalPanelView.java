package gxt.client.visual.interfaces.view;

import com.extjs.gxt.ui.client.util.BaseEventPreview;
import com.extjs.gxt.ui.client.widget.Component;

/**
 * @author eugenp
 */
public interface IModalPanelView extends IBoxComponentView{
	
	/**
	 * Returns the panel's event preview.
	 * @return the event preview
	 */
	BaseEventPreview getEventPreview();
	
	/**
	 * Hides the panel.
	 */
	void hide();
	
	/**
	 * Returns true if blinking is enabled.
	 * @return the blink state
	 */
	boolean isBlink();
	
	/**
	 * True to blink the widget being displayed when the use clicks outside of the widgets bounds (defaults to false).
	 * @param blink true to blink
	 */
	void setBlink( boolean blink );
	
	/**
	 * Displays the panel.
	 */
	void show( Component component );
	
	/**
	 * Syncs to the viewport.
	 */
	void syncModal();
	
}
