package gxt.client.visual.interfaces.view;

import com.google.gwt.user.client.Element;

/**
 * Note: not in use (FramePanel has a private constructor, thus it cannot be extended)
 * @author eugenp
 */
public interface IFramePanelView extends IComponentView{
	
	/**
	 * Removes the panel.
	 * @param element the parent element
	 */
	void onHide( Element element ) /*-{
	                               var frame = this.@com.google.gwt.user.client.ui.UIObject::element;
	                               frame.parentNode.removeChild(frame);
	                               }-*/;

	/**
	 * Displays the panel behind the given element.
	 * @param element the element
	 */
	void onShow( Element element );
	
	/**
	 * Displays the panel behind the given element.
	 * @param element the element
	 * @param zIndex the z index
	 */
	void onShow( Element element, int zIndex );
	
	/**
	 * Sets the z-index of the panel.
	 * @param index the z index
	 */
	void setZIndex( int index );
	
	void sync( Element element );
	
}
