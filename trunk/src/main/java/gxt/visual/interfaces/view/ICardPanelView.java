package gxt.visual.interfaces.view;

import com.extjs.gxt.ui.client.widget.Component;

/**
 * @author eugenp
 */
public interface ICardPanelView extends ILayoutContainerView{
	
	/**
	 * Returns the active component.
	 * @return the top widget
	 */
	Component getActiveItem();
	
	/**
	 * Returns true if deferred render.
	 * @return the deferred render state
	 */
	boolean isDeferredRender();
	
	/**
	 * Sets the active (visible) item in the layout.
	 * @param component the active widget
	 */
	void setActiveItem( Component component );
	
	/**
	 * Sets the deferred render state
	 * @param deferredRender the deferredRender state
	 */
	void setDeferredRender( boolean deferredRender );
	
}
